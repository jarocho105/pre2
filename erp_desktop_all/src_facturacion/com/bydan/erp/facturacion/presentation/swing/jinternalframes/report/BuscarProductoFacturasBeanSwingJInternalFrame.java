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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.facturacion.util.BuscarProductoFacturasConstantesFunciones;
import com.bydan.erp.facturacion.util.report.BuscarProductoFacturasParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.BuscarProductoFacturasParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.BuscarProductoFacturasBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.facturacion.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.facturacion.util.*;

import com.bydan.erp.facturacion.util.report.*;
import com.bydan.erp.facturacion.business.logic.report.*;

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class BuscarProductoFacturasBeanSwingJInternalFrame extends BuscarProductoFacturasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(BuscarProductoFacturasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<BuscarProductoFacturas> buscarproductofacturasValidator = new ClassValidator<BuscarProductoFacturas>(BuscarProductoFacturas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public BuscarProductoFacturas buscarproductofacturas;	
	public BuscarProductoFacturas buscarproductofacturasAux;
	public BuscarProductoFacturas buscarproductofacturasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public BuscarProductoFacturas buscarproductofacturasTotales;
	public Long idBuscarProductoFacturasActual;
	public Long iIdNuevoBuscarProductoFacturas=0L;
	public int rowIndexActual=0;
	
	
	
	
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

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
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
	
	public Boolean isPermisoTodoBuscarProductoFacturas;
	public Boolean isPermisoNuevoBuscarProductoFacturas;
	public Boolean isPermisoActualizarBuscarProductoFacturas;
	public Boolean isPermisoActualizarOriginalBuscarProductoFacturas;
	public Boolean isPermisoEliminarBuscarProductoFacturas;
	public Boolean isPermisoGuardarCambiosBuscarProductoFacturas;
	public Boolean isPermisoConsultaBuscarProductoFacturas;
	public Boolean isPermisoBusquedaBuscarProductoFacturas;
	public Boolean isPermisoReporteBuscarProductoFacturas;
	public Boolean isPermisoPaginacionMedioBuscarProductoFacturas;
	public Boolean isPermisoPaginacionAltoBuscarProductoFacturas;
	public Boolean isPermisoPaginacionTodoBuscarProductoFacturas;
	public Boolean isPermisoCopiarBuscarProductoFacturas;
	public Boolean isPermisoVerFormBuscarProductoFacturas;
	public Boolean isPermisoDuplicarBuscarProductoFacturas;
	public Boolean isPermisoOrdenBuscarProductoFacturas;
	
	
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
	
	public BuscarProductoFacturasParameterReturnGeneral buscarproductofacturasReturnGeneral;
	public BuscarProductoFacturasParameterReturnGeneral buscarproductofacturasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoBuscarProductoFacturas=false;
	public Boolean esParaAccionDesdeFormularioBuscarProductoFacturas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected BuscarProductoFacturasSessionBeanAdditional buscarproductofacturasSessionBeanAdditional=null;
	
	public BuscarProductoFacturasSessionBeanAdditional getBuscarProductoFacturasSessionBeanAdditional() {
		return this.buscarproductofacturasSessionBeanAdditional;
	}
	
	public void setBuscarProductoFacturasSessionBeanAdditional(BuscarProductoFacturasSessionBeanAdditional buscarproductofacturasSessionBeanAdditional) {
		try {
			this.buscarproductofacturasSessionBeanAdditional=buscarproductofacturasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected BuscarProductoFacturasBeanSwingJInternalFrameAdditional buscarproductofacturasBeanSwingJInternalFrameAdditional=null;
	//public class BuscarProductoFacturasBeanSwingJInternalFrame
	
	public BuscarProductoFacturasBeanSwingJInternalFrameAdditional getBuscarProductoFacturasBeanSwingJInternalFrameAdditional() {
		return this.buscarproductofacturasBeanSwingJInternalFrameAdditional;
	}
	
	public void setBuscarProductoFacturasBeanSwingJInternalFrameAdditional(BuscarProductoFacturasBeanSwingJInternalFrameAdditional buscarproductofacturasBeanSwingJInternalFrameAdditional) {
		try {
			this.buscarproductofacturasBeanSwingJInternalFrameAdditional=buscarproductofacturasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public BuscarProductoFacturasLogic buscarproductofacturasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public BuscarProductoFacturas buscarproductofacturasBean;
	public BuscarProductoFacturasConstantesFunciones buscarproductofacturasConstantesFunciones;
	//public BuscarProductoFacturasParameterReturnGeneral buscarproductofacturasReturnGeneral;
	
	//FK
	
	public ProductoLogic productoLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<BuscarProductoFacturas> buscarproductofacturass;	
	//public List<BuscarProductoFacturas> buscarproductofacturassEliminados;
	//public List<BuscarProductoFacturas> buscarproductofacturassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoBuscarProductoFacturas=false;
	public Boolean isVisibilidadCeldaDuplicarBuscarProductoFacturas=true;
	public Boolean isVisibilidadCeldaCopiarBuscarProductoFacturas=true;
	public Boolean isVisibilidadCeldaVerFormBuscarProductoFacturas=true;
	public Boolean isVisibilidadCeldaOrdenBuscarProductoFacturas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=false;
	public Boolean isVisibilidadCeldaModificarBuscarProductoFacturas=false;
	public Boolean isVisibilidadCeldaActualizarBuscarProductoFacturas=false;
	public Boolean isVisibilidadCeldaEliminarBuscarProductoFacturas=false;
	public Boolean isVisibilidadCeldaCancelarBuscarProductoFacturas=false;
	public Boolean isVisibilidadCeldaGuardarBuscarProductoFacturas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas=false;	
	
	
	public Boolean isVisibilidadBusquedaBuscarProductoFacturas=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoBuscarProductoFacturas() {
		return this.iIdNuevoBuscarProductoFacturas;
	}

	public void setiIdNuevoBuscarProductoFacturas(Long iIdNuevoBuscarProductoFacturas) {
		this.iIdNuevoBuscarProductoFacturas = iIdNuevoBuscarProductoFacturas;
	}
	
	public Long getidBuscarProductoFacturasActual() {
		return this.idBuscarProductoFacturasActual;
	}

	public void setidBuscarProductoFacturasActual(Long idBuscarProductoFacturasActual) {
		this.idBuscarProductoFacturasActual = idBuscarProductoFacturasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public BuscarProductoFacturas getbuscarproductofacturas() {
		return this.buscarproductofacturas;
	}

	public void setbuscarproductofacturas(BuscarProductoFacturas buscarproductofacturas) {
		this.buscarproductofacturas = buscarproductofacturas;
	}
	
	public BuscarProductoFacturas getbuscarproductofacturasAux() {
		return this.buscarproductofacturasAux;
	}

	public void setbuscarproductofacturasAux(BuscarProductoFacturas buscarproductofacturasAux) {
		this.buscarproductofacturasAux = buscarproductofacturasAux;
	}				
	
	public BuscarProductoFacturas getbuscarproductofacturasAnterior() {
		return this.buscarproductofacturasAnterior;
	}

	public void setbuscarproductofacturasAnterior(BuscarProductoFacturas buscarproductofacturasAnterior) {
		this.buscarproductofacturasAnterior = buscarproductofacturasAnterior;
	}	
	
	public BuscarProductoFacturas getbuscarproductofacturasTotales() {
		return this.buscarproductofacturasTotales;
	}

	public void setbuscarproductofacturasTotales(BuscarProductoFacturas buscarproductofacturasTotales) {
		this.buscarproductofacturasTotales = buscarproductofacturasTotales;
	}	
	
	public BuscarProductoFacturas getbuscarproductofacturasBean() {
		return this.buscarproductofacturasBean;
	}

	public void setbuscarproductofacturasBean(BuscarProductoFacturas buscarproductofacturasBean) {
		this.buscarproductofacturasBean = buscarproductofacturasBean;
	}	
	
	public BuscarProductoFacturasParameterReturnGeneral getbuscarproductofacturasReturnGeneral() {
		return this.buscarproductofacturasReturnGeneral;
	}

	public void setbuscarproductofacturasReturnGeneral(BuscarProductoFacturasParameterReturnGeneral buscarproductofacturasReturnGeneral) {
		this.buscarproductofacturasReturnGeneral = buscarproductofacturasReturnGeneral;
	}	
	
	
	public Long id_productoBusquedaBuscarProductoFacturas=-1L;

	public Long getid_productoBusquedaBuscarProductoFacturas() {
		return this.id_productoBusquedaBuscarProductoFacturas;
	}

	public void setid_productoBusquedaBuscarProductoFacturas(Long id_productoBusquedaBuscarProductoFacturas) {
		this.id_productoBusquedaBuscarProductoFacturas = id_productoBusquedaBuscarProductoFacturas;
	}

;
	public Long id_clienteBusquedaBuscarProductoFacturas=-1L;

	public Long getid_clienteBusquedaBuscarProductoFacturas() {
		return this.id_clienteBusquedaBuscarProductoFacturas;
	}

	public void setid_clienteBusquedaBuscarProductoFacturas(Long id_clienteBusquedaBuscarProductoFacturas) {
		this.id_clienteBusquedaBuscarProductoFacturas = id_clienteBusquedaBuscarProductoFacturas;
	}

;
	public String numero_pre_impresoBusquedaBuscarProductoFacturas="";

	public String getnumero_pre_impresoBusquedaBuscarProductoFacturas() {
		return this.numero_pre_impresoBusquedaBuscarProductoFacturas;
	}

	public void setnumero_pre_impresoBusquedaBuscarProductoFacturas(String numero_pre_impresoBusquedaBuscarProductoFacturas) {
		this.numero_pre_impresoBusquedaBuscarProductoFacturas = numero_pre_impresoBusquedaBuscarProductoFacturas;
	}

;
	public Date fecha_emision_desdeBusquedaBuscarProductoFacturas=new Date();

	public Date getfecha_emision_desdeBusquedaBuscarProductoFacturas() {
		return this.fecha_emision_desdeBusquedaBuscarProductoFacturas;
	}

	public void setfecha_emision_desdeBusquedaBuscarProductoFacturas(Date fecha_emision_desdeBusquedaBuscarProductoFacturas) {
		this.fecha_emision_desdeBusquedaBuscarProductoFacturas = fecha_emision_desdeBusquedaBuscarProductoFacturas;
	}

;
	public Date fecha_emision_hastaBusquedaBuscarProductoFacturas=new Date();

	public Date getfecha_emision_hastaBusquedaBuscarProductoFacturas() {
		return this.fecha_emision_hastaBusquedaBuscarProductoFacturas;
	}

	public void setfecha_emision_hastaBusquedaBuscarProductoFacturas(Date fecha_emision_hastaBusquedaBuscarProductoFacturas) {
		this.fecha_emision_hastaBusquedaBuscarProductoFacturas = fecha_emision_hastaBusquedaBuscarProductoFacturas;
	}

	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
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
	
	
	public BuscarProductoFacturasLogic getBuscarProductoFacturasLogic()	{		
		return buscarproductofacturasLogic;
	}

	public void setBuscarProductoFacturasLogic(BuscarProductoFacturasLogic buscarproductofacturasLogic) {
		this.buscarproductofacturasLogic = buscarproductofacturasLogic;
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
	
	public Boolean getIsEsNuevoBuscarProductoFacturas() {
		return isEsNuevoBuscarProductoFacturas;
	}

	public void setIsEsNuevoBuscarProductoFacturas(Boolean isEsNuevoBuscarProductoFacturas) {
		this.isEsNuevoBuscarProductoFacturas = isEsNuevoBuscarProductoFacturas;
	}

	public Boolean getEsParaAccionDesdeFormularioBuscarProductoFacturas() {
		return esParaAccionDesdeFormularioBuscarProductoFacturas;
	}
	
	public void setEsParaAccionDesdeFormularioBuscarProductoFacturas(Boolean esParaAccionDesdeFormularioBuscarProductoFacturas) {
		this.esParaAccionDesdeFormularioBuscarProductoFacturas = esParaAccionDesdeFormularioBuscarProductoFacturas;
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

			if(this.buscarproductofacturasSessionBean==null) {
				this.buscarproductofacturasSessionBean=new BuscarProductoFacturasSessionBean();
			}

			if(!this.buscarproductofacturasSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(buscarproductofacturasSessionBean.getlidProductoActual());
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

			if(this.buscarproductofacturasSessionBean==null) {
				this.buscarproductofacturasSessionBean=new BuscarProductoFacturasSessionBean();
			}

			if(!this.buscarproductofacturasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(buscarproductofacturasSessionBean.getlidEmpresaActual());
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

			if(this.buscarproductofacturasSessionBean==null) {
				this.buscarproductofacturasSessionBean=new BuscarProductoFacturasSessionBean();
			}

			if(!this.buscarproductofacturasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(buscarproductofacturasSessionBean.getlidSucursalActual());
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

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.buscarproductofacturasSessionBean==null) {
				this.buscarproductofacturasSessionBean=new BuscarProductoFacturasSessionBean();
			}

			if(!this.buscarproductofacturasSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(buscarproductofacturasSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

					if(this.buscarproductofacturas!=null) {
						this.buscarproductofacturas.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
						this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_productoBuscarProductoFacturas.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoBuscarProductoFacturas.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_productoBuscarProductoFacturas.getItemCount()>0) {
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_productoBuscarProductoFacturas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaBuscarProductoFacturas") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas!=null) {
						jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas!=null) {
							//jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.getItemCount()>0) {
								jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoBuscarProductoFacturasGenerico)throws Exception
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
				jComboBoxid_productoBuscarProductoFacturasGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoBuscarProductoFacturasGenerico!=null && jComboBoxid_productoBuscarProductoFacturasGenerico.getItemCount()>0) {
					jComboBoxid_productoBuscarProductoFacturasGenerico.setSelectedIndex(0);
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

					if(this.buscarproductofacturas!=null) {
						this.buscarproductofacturas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
						this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_empresaBuscarProductoFacturas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaBuscarProductoFacturas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_empresaBuscarProductoFacturas.getItemCount()>0) {
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_empresaBuscarProductoFacturas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaBuscarProductoFacturasGenerico)throws Exception
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
				jComboBoxid_empresaBuscarProductoFacturasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaBuscarProductoFacturasGenerico!=null && jComboBoxid_empresaBuscarProductoFacturasGenerico.getItemCount()>0) {
					jComboBoxid_empresaBuscarProductoFacturasGenerico.setSelectedIndex(0);
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

					if(this.buscarproductofacturas!=null) {
						this.buscarproductofacturas.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
						this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_sucursalBuscarProductoFacturas.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalBuscarProductoFacturas.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_sucursalBuscarProductoFacturas.getItemCount()>0) {
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_sucursalBuscarProductoFacturas.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalBuscarProductoFacturasGenerico)throws Exception
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
				jComboBoxid_sucursalBuscarProductoFacturasGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalBuscarProductoFacturasGenerico!=null && jComboBoxid_sucursalBuscarProductoFacturasGenerico.getItemCount()>0) {
					jComboBoxid_sucursalBuscarProductoFacturasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.buscarproductofacturas!=null) {
						this.buscarproductofacturas.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
						this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_clienteBuscarProductoFacturas.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteBuscarProductoFacturas.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_clienteBuscarProductoFacturas.getItemCount()>0) {
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_clienteBuscarProductoFacturas.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaBuscarProductoFacturas") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas!=null) {
						jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas!=null) {
							//jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.getItemCount()>0) {
								jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteBuscarProductoFacturasGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteBuscarProductoFacturasGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteBuscarProductoFacturasGenerico!=null && jComboBoxid_clienteBuscarProductoFacturasGenerico.getItemCount()>0) {
					jComboBoxid_clienteBuscarProductoFacturasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(BuscarProductoFacturas buscarproductofacturas,JComboBox jComboBoxid_productoBuscarProductoFacturasGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoBuscarProductoFacturasGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_productoBuscarProductoFacturas.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoBuscarProductoFacturasGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				buscarproductofacturas.setid_producto(productoAux.getId());
				buscarproductofacturas.setproducto_descripcion(BuscarProductoFacturasConstantesFunciones.getProductoDescripcion(productoAux));
				buscarproductofacturas.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(BuscarProductoFacturas buscarproductofacturas,JComboBox jComboBoxid_empresaBuscarProductoFacturasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaBuscarProductoFacturasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_empresaBuscarProductoFacturas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaBuscarProductoFacturasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				buscarproductofacturas.setid_empresa(empresaAux.getId());
				buscarproductofacturas.setempresa_descripcion(BuscarProductoFacturasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				buscarproductofacturas.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(BuscarProductoFacturas buscarproductofacturas,JComboBox jComboBoxid_sucursalBuscarProductoFacturasGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalBuscarProductoFacturasGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_sucursalBuscarProductoFacturas.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalBuscarProductoFacturasGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				buscarproductofacturas.setid_sucursal(sucursalAux.getId());
				buscarproductofacturas.setsucursal_descripcion(BuscarProductoFacturasConstantesFunciones.getSucursalDescripcion(sucursalAux));
				buscarproductofacturas.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(BuscarProductoFacturas buscarproductofacturas,JComboBox jComboBoxid_clienteBuscarProductoFacturasGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteBuscarProductoFacturasGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_clienteBuscarProductoFacturas.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteBuscarProductoFacturasGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				buscarproductofacturas.setid_cliente(clienteAux.getId());
				buscarproductofacturas.setcliente_descripcion(BuscarProductoFacturasConstantesFunciones.getClienteDescripcion(clienteAux));
				buscarproductofacturas.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProducto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { 
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_productoBuscarProductoFacturas.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_productoBuscarProductoFacturas.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { 
					}

					if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaBuscarProductoFacturas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.addItem(producto);
							}
						}

						if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { 
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_empresaBuscarProductoFacturas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_empresaBuscarProductoFacturas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { 
					}

					if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { 
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_sucursalBuscarProductoFacturas.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_sucursalBuscarProductoFacturas.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { 
					}

					if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { 
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_clienteBuscarProductoFacturas.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_clienteBuscarProductoFacturas.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { 
					}

					if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaBuscarProductoFacturas") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.addItem(cliente);
							}
						}

						if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameProductoForeignKey(Producto producto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_productoBuscarProductoFacturas.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_productoBuscarProductoFacturas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_empresaBuscarProductoFacturas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_empresaBuscarProductoFacturas.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_sucursalBuscarProductoFacturas.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_sucursalBuscarProductoFacturas.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_clienteBuscarProductoFacturas.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_clienteBuscarProductoFacturas.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesBuscarProductoFacturas() throws Exception {
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
		
	public BuscarProductoFacturasParameterReturnGeneral getBuscarProductoFacturasParameterGeneral() {
		return this.buscarproductofacturasParameterGeneral;
	}
	
	public void setBuscarProductoFacturasParameterGeneral(BuscarProductoFacturasParameterReturnGeneral buscarproductofacturasParameterGeneral) {
		this.buscarproductofacturasParameterGeneral = buscarproductofacturasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoBuscarProductoFacturas() {
		return isPermisoTodoBuscarProductoFacturas;
	}

	public void setIsPermisoTodoBuscarProductoFacturas(Boolean isPermisoTodoBuscarProductoFacturas) {
		this.isPermisoTodoBuscarProductoFacturas = isPermisoTodoBuscarProductoFacturas;
	}

	public Boolean getIsPermisoNuevoBuscarProductoFacturas() {
		return isPermisoNuevoBuscarProductoFacturas;
	}

	public void setIsPermisoNuevoBuscarProductoFacturas(Boolean isPermisoNuevoBuscarProductoFacturas) {
		this.isPermisoNuevoBuscarProductoFacturas = isPermisoNuevoBuscarProductoFacturas;
	}

	public Boolean getIsPermisoActualizarBuscarProductoFacturas() {
		return isPermisoActualizarBuscarProductoFacturas;
	}

	public void setIsPermisoActualizarBuscarProductoFacturas(Boolean isPermisoActualizarBuscarProductoFacturas) {
		this.isPermisoActualizarBuscarProductoFacturas = isPermisoActualizarBuscarProductoFacturas;
	}

	public Boolean getIsPermisoEliminarBuscarProductoFacturas() {
		return isPermisoEliminarBuscarProductoFacturas;
	}

	public void setIsPermisoEliminarBuscarProductoFacturas(Boolean isPermisoEliminarBuscarProductoFacturas) {
		this.isPermisoEliminarBuscarProductoFacturas = isPermisoEliminarBuscarProductoFacturas;
	}

	public Boolean getIsPermisoGuardarCambiosBuscarProductoFacturas() {
		return isPermisoGuardarCambiosBuscarProductoFacturas;
	}

	public void setIsPermisoGuardarCambiosBuscarProductoFacturas(Boolean isPermisoGuardarCambiosBuscarProductoFacturas) {
		this.isPermisoGuardarCambiosBuscarProductoFacturas = isPermisoGuardarCambiosBuscarProductoFacturas;
	}
	
	public Boolean getIsPermisoConsultaBuscarProductoFacturas() {
		return isPermisoConsultaBuscarProductoFacturas;
	}

	public void setIsPermisoConsultaBuscarProductoFacturas(Boolean isPermisoConsultaBuscarProductoFacturas) {
		this.isPermisoConsultaBuscarProductoFacturas = isPermisoConsultaBuscarProductoFacturas;
	}

	public Boolean getIsPermisoBusquedaBuscarProductoFacturas() {
		return isPermisoBusquedaBuscarProductoFacturas;
	}

	public void setIsPermisoBusquedaBuscarProductoFacturas(Boolean isPermisoBusquedaBuscarProductoFacturas) {
		this.isPermisoBusquedaBuscarProductoFacturas = isPermisoBusquedaBuscarProductoFacturas;
	}

	public Boolean getIsPermisoReporteBuscarProductoFacturas() {
		return isPermisoReporteBuscarProductoFacturas;
	}

	public void setIsPermisoReporteBuscarProductoFacturas(Boolean isPermisoReporteBuscarProductoFacturas) {
		this.isPermisoReporteBuscarProductoFacturas = isPermisoReporteBuscarProductoFacturas;
	}
	
	public Boolean getIsPermisoPaginacionMedioBuscarProductoFacturas() {
		return isPermisoPaginacionMedioBuscarProductoFacturas;
	}

	public void setIsPermisoPaginacionMedioBuscarProductoFacturas(Boolean isPermisoPaginacionMedioBuscarProductoFacturas) {
		this.isPermisoPaginacionMedioBuscarProductoFacturas = isPermisoPaginacionMedioBuscarProductoFacturas;
	}
	
	public Boolean getIsPermisoPaginacionTodoBuscarProductoFacturas() {
		return isPermisoPaginacionTodoBuscarProductoFacturas;
	}

	public void setIsPermisoPaginacionTodoBuscarProductoFacturas(Boolean isPermisoPaginacionTodoBuscarProductoFacturas) {
		this.isPermisoPaginacionTodoBuscarProductoFacturas = isPermisoPaginacionTodoBuscarProductoFacturas;
	}
	
	public Boolean getIsPermisoPaginacionAltoBuscarProductoFacturas() {
		return isPermisoPaginacionAltoBuscarProductoFacturas;
	}

	public void setIsPermisoPaginacionAltoBuscarProductoFacturas(Boolean isPermisoPaginacionAltoBuscarProductoFacturas) {
		this.isPermisoPaginacionAltoBuscarProductoFacturas = isPermisoPaginacionAltoBuscarProductoFacturas;
	}
	
	public Boolean getIsPermisoCopiarBuscarProductoFacturas() {
		return isPermisoCopiarBuscarProductoFacturas;
	}

	public void setIsPermisoCopiarBuscarProductoFacturas(Boolean isPermisoCopiarBuscarProductoFacturas) {
		this.isPermisoCopiarBuscarProductoFacturas = isPermisoCopiarBuscarProductoFacturas;
	}
	
	public Boolean getIsPermisoVerFormBuscarProductoFacturas() {
		return isPermisoVerFormBuscarProductoFacturas;
	}

	public void setIsPermisoVerFormBuscarProductoFacturas(Boolean isPermisoVerFormBuscarProductoFacturas) {
		this.isPermisoVerFormBuscarProductoFacturas = isPermisoVerFormBuscarProductoFacturas;
	}
	
	public Boolean getIsPermisoDuplicarBuscarProductoFacturas() {
		return isPermisoDuplicarBuscarProductoFacturas;
	}

	public void setIsPermisoDuplicarBuscarProductoFacturas(Boolean isPermisoDuplicarBuscarProductoFacturas) {
		this.isPermisoDuplicarBuscarProductoFacturas = isPermisoDuplicarBuscarProductoFacturas;
	}
	
	public Boolean getIsPermisoOrdenBuscarProductoFacturas() {
		return isPermisoOrdenBuscarProductoFacturas;
	}

	public void setIsPermisoOrdenBuscarProductoFacturas(Boolean isPermisoOrdenBuscarProductoFacturas) {
		this.isPermisoOrdenBuscarProductoFacturas = isPermisoOrdenBuscarProductoFacturas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoBuscarProductoFacturas() {
		return isVisibilidadCeldaNuevoBuscarProductoFacturas;
	}

	public void setIsVisibilidadCeldaNuevoBuscarProductoFacturas(Boolean isVisibilidadCeldaNuevoBuscarProductoFacturas) {
		this.isVisibilidadCeldaNuevoBuscarProductoFacturas = isVisibilidadCeldaNuevoBuscarProductoFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarBuscarProductoFacturas() {
		return isVisibilidadCeldaDuplicarBuscarProductoFacturas;
	}

	public void setIsVisibilidadCeldaDuplicarBuscarProductoFacturas(Boolean isVisibilidadCeldaDuplicarBuscarProductoFacturas) {
		this.isVisibilidadCeldaDuplicarBuscarProductoFacturas = isVisibilidadCeldaDuplicarBuscarProductoFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarBuscarProductoFacturas() {
		return isVisibilidadCeldaCopiarBuscarProductoFacturas;
	}

	public void setIsVisibilidadCeldaCopiarBuscarProductoFacturas(Boolean isVisibilidadCeldaCopiarBuscarProductoFacturas) {
		this.isVisibilidadCeldaCopiarBuscarProductoFacturas = isVisibilidadCeldaCopiarBuscarProductoFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormBuscarProductoFacturas() {
		return isVisibilidadCeldaVerFormBuscarProductoFacturas;
	}

	public void setIsVisibilidadCeldaVerFormBuscarProductoFacturas(Boolean isVisibilidadCeldaVerFormBuscarProductoFacturas) {
		this.isVisibilidadCeldaVerFormBuscarProductoFacturas = isVisibilidadCeldaVerFormBuscarProductoFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenBuscarProductoFacturas() {
		return isVisibilidadCeldaOrdenBuscarProductoFacturas;
	}

	public void setIsVisibilidadCeldaOrdenBuscarProductoFacturas(Boolean isVisibilidadCeldaOrdenBuscarProductoFacturas) {
		this.isVisibilidadCeldaOrdenBuscarProductoFacturas = isVisibilidadCeldaOrdenBuscarProductoFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas() {
		return isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas(Boolean isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas) {
		this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas = isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarBuscarProductoFacturas() {
		return isVisibilidadCeldaModificarBuscarProductoFacturas;
	}

	public void setIsVisibilidadCeldaModificarBuscarProductoFacturas(Boolean isVisibilidadCeldaModificarBuscarProductoFacturas) {
		this.isVisibilidadCeldaModificarBuscarProductoFacturas = isVisibilidadCeldaModificarBuscarProductoFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarBuscarProductoFacturas() {
		return isVisibilidadCeldaActualizarBuscarProductoFacturas;
	}

	public void setIsVisibilidadCeldaActualizarBuscarProductoFacturas(Boolean isVisibilidadCeldaActualizarBuscarProductoFacturas) {
		this.isVisibilidadCeldaActualizarBuscarProductoFacturas = isVisibilidadCeldaActualizarBuscarProductoFacturas;
	}

	public Boolean getIsVisibilidadCeldaEliminarBuscarProductoFacturas() {
		return isVisibilidadCeldaEliminarBuscarProductoFacturas;
	}

	public void setIsVisibilidadCeldaEliminarBuscarProductoFacturas(Boolean isVisibilidadCeldaEliminarBuscarProductoFacturas) {
		this.isVisibilidadCeldaEliminarBuscarProductoFacturas = isVisibilidadCeldaEliminarBuscarProductoFacturas;
	}

	public Boolean getIsVisibilidadCeldaCancelarBuscarProductoFacturas() {
		return isVisibilidadCeldaCancelarBuscarProductoFacturas;
	}

	public void setIsVisibilidadCeldaCancelarBuscarProductoFacturas(Boolean isVisibilidadCeldaCancelarBuscarProductoFacturas) {
		this.isVisibilidadCeldaCancelarBuscarProductoFacturas = isVisibilidadCeldaCancelarBuscarProductoFacturas;
	}

	public Boolean getIsVisibilidadCeldaGuardarBuscarProductoFacturas() {
		return isVisibilidadCeldaGuardarBuscarProductoFacturas;
	}

	public void setIsVisibilidadCeldaGuardarBuscarProductoFacturas(Boolean isVisibilidadCeldaGuardarBuscarProductoFacturas) {
		this.isVisibilidadCeldaGuardarBuscarProductoFacturas = isVisibilidadCeldaGuardarBuscarProductoFacturas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosBuscarProductoFacturas() {
		return isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosBuscarProductoFacturas(Boolean isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas) {
		this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas = isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas;
	}
		
	public BuscarProductoFacturasSessionBean getbuscarproductofacturasSessionBean() {
		return this.buscarproductofacturasSessionBean;
	}
	
	public void setbuscarproductofacturasSessionBean(BuscarProductoFacturasSessionBean buscarproductofacturasSessionBean) {
		this.buscarproductofacturasSessionBean=buscarproductofacturasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaBuscarProductoFacturas() {
		return this.isVisibilidadBusquedaBuscarProductoFacturas;
	}

	public void setisVisibilidadBusquedaBuscarProductoFacturas(Boolean isVisibilidadBusquedaBuscarProductoFacturas) {
		this.isVisibilidadBusquedaBuscarProductoFacturas=isVisibilidadBusquedaBuscarProductoFacturas;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas)throws Exception {
		try {
			
				this.setActualParaGuardarProductoForeignKey(buscarproductofacturas,null);
				this.setActualParaGuardarEmpresaForeignKey(buscarproductofacturas,null);
				this.setActualParaGuardarSucursalForeignKey(buscarproductofacturas,null);
				this.setActualParaGuardarClienteForeignKey(buscarproductofacturas,null);
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
	
	public void bugActualizarReferenciaActual(BuscarProductoFacturas buscarproductofacturas,BuscarProductoFacturas buscarproductofacturasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalBuscarProductoFacturas(buscarproductofacturas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		buscarproductofacturasAux.setId(buscarproductofacturas.getId());
		buscarproductofacturasAux.setVersionRow(buscarproductofacturas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(BuscarProductoFacturas buscarproductofacturasLocal) throws Exception {
		
		if(this.buscarproductofacturasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(BuscarProductoFacturas buscarproductofacturasLocal) throws Exception {	
		if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				buscarproductofacturasLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				buscarproductofacturasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				buscarproductofacturasLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				buscarproductofacturasLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarBuscarProductoFacturasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = buscarproductofacturasValidator.getInvalidValues(this.buscarproductofacturas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(BuscarProductoFacturas buscarproductofacturas,List<BuscarProductoFacturas> buscarproductofacturass) throws Exception {
	}		
	
	public void actualizarSelectedLista(BuscarProductoFacturas buscarproductofacturas,List<BuscarProductoFacturas> buscarproductofacturass) throws Exception {
		try	{			
			BuscarProductoFacturasConstantesFunciones.actualizarSelectedLista(buscarproductofacturas,buscarproductofacturass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<BuscarProductoFacturas> buscarproductofacturassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				buscarproductofacturassLocal=this.buscarproductofacturasLogic.getBuscarProductoFacturass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				buscarproductofacturassLocal=this.buscarproductofacturass;
			}
			//ARCHITECTURE
		
			for(BuscarProductoFacturas buscarproductofacturasLocal:buscarproductofacturassLocal) {
				if(this.permiteMantenimiento(buscarproductofacturasLocal) && buscarproductofacturasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+BuscarProductoFacturasConstantesFunciones.getBuscarProductoFacturasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(BuscarProductoFacturasConstantesFunciones.NOMBREVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnombre_vendedorBuscarProductoFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BuscarProductoFacturasConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnombre_completo_clienteBuscarProductoFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BuscarProductoFacturasConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelfecha_emisionBuscarProductoFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BuscarProductoFacturasConstantesFunciones.NUMEROPREIMPRESODATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnumero_pre_impreso_datoBuscarProductoFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BuscarProductoFacturasConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabeltotalBuscarProductoFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BuscarProductoFacturasConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnombre_unidadBuscarProductoFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BuscarProductoFacturasConstantesFunciones.NOMBREBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnombre_bodegaBuscarProductoFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BuscarProductoFacturasConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnombre_productoBuscarProductoFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BuscarProductoFacturasConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelcantidadBuscarProductoFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BuscarProductoFacturasConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelprecioBuscarProductoFacturas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BuscarProductoFacturasConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabeldescuentoBuscarProductoFacturas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnombre_vendedorBuscarProductoFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnombre_completo_clienteBuscarProductoFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelfecha_emisionBuscarProductoFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnumero_pre_impreso_datoBuscarProductoFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabeltotalBuscarProductoFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnombre_unidadBuscarProductoFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnombre_bodegaBuscarProductoFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnombre_productoBuscarProductoFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelcantidadBuscarProductoFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelprecioBuscarProductoFacturas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabeldescuentoBuscarProductoFacturas,"");
		
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
		this.iIdNuevoBuscarProductoFacturas--;	
		
		
		this.buscarproductofacturasAux=new BuscarProductoFacturas();
		
		this.buscarproductofacturasAux.setId(this.iIdNuevoBuscarProductoFacturas);
		this.buscarproductofacturasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.buscarproductofacturasLogic.getBuscarProductoFacturass().add(this.buscarproductofacturasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.buscarproductofacturass.add(this.buscarproductofacturasAux);
		}
		//ARCHITECTURE
		
		this.buscarproductofacturas=this.buscarproductofacturasAux;
		
		if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioBuscarProductoFacturas(this.buscarproductofacturas);
			this.setVariablesObjetoActualToFormularioForeignKeyBuscarProductoFacturas(this.buscarproductofacturas);
		}
				
		//this.setDefaultControlesBuscarProductoFacturas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyBuscarProductoFacturas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyBuscarProductoFacturas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyBuscarProductoFacturas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBuscarProductoFacturas(this.buscarproductofacturasBean,this.buscarproductofacturas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanBuscarProductoFacturas(this.buscarproductofacturasReturnGeneral,this.buscarproductofacturasBean,false);
		
		if(this.buscarproductofacturasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyBuscarProductoFacturas(this.buscarproductofacturasReturnGeneral.getBuscarProductoFacturas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioBuscarProductoFacturas(this.buscarproductofacturasReturnGeneral.getBuscarProductoFacturas());
		}
		
		if(this.buscarproductofacturasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioBuscarProductoFacturas(this.buscarproductofacturasReturnGeneral.getBuscarProductoFacturas(),classes);//this.buscarproductofacturasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyBuscarProductoFacturas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyBuscarProductoFacturas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.RecargarFormBuscarProductoFacturas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingBuscarProductoFacturas(false);
						
			if(buscarproductofacturasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBuscarProductoFacturas();
			}
			
			this.actualizarVisualTableDatosBuscarProductoFacturas();
			
			this.jTableDatosBuscarProductoFacturas.setRowSelectionInterval(this.getIndiceNuevoBuscarProductoFacturas(), this.getIndiceNuevoBuscarProductoFacturas());
			
			this.seleccionarFilaTablaBuscarProductoFacturasActual();
						
			this.actualizarEstadoCeldasBotonesBuscarProductoFacturas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesBuscarProductoFacturas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnumero_pre_impresoBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarnumero_pre_impresoBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emision_desdeBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarfecha_emision_desdeBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emision_hastaBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarfecha_emision_hastaBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_vendedorBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarnombre_vendedorBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_completo_clienteBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarnombre_completo_clienteBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emisionBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarfecha_emisionBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarnumero_pre_impreso_datoBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldtotalBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activartotalBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnombre_unidadBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarnombre_unidadBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_bodegaBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarnombre_bodegaBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_productoBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarnombre_productoBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldcantidadBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarcantidadBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldprecioBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarprecioBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFielddescuentoBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activardescuentoBuscarProductoFacturas);	
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_productoBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarid_productoBuscarProductoFacturas);//
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_empresaBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarid_empresaBuscarProductoFacturas);//
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_sucursalBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarid_sucursalBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_clienteBuscarProductoFacturas.setEnabled(isHabilitar && this.buscarproductofacturasConstantesFunciones.activarid_clienteBuscarProductoFacturas);
	};
	
	public void setDefaultControlesBuscarProductoFacturas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoBuscarProductoFacturas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.buscarproductofacturasSessionBean.setConGuardarRelaciones(true);			
			this.buscarproductofacturasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTabbedPaneRelacionesBuscarProductoFacturas.setVisible(true);
			
					
		} else {
			//this.buscarproductofacturasSessionBean.setConGuardarRelaciones(false);			
			this.buscarproductofacturasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTabbedPaneRelacionesBuscarProductoFacturas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoBuscarProductoFacturas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BuscarProductoFacturas buscarproductofacturasAux:this.buscarproductofacturasLogic.getBuscarProductoFacturass()) {
				if(buscarproductofacturasAux.getId().equals(this.iIdNuevoBuscarProductoFacturas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BuscarProductoFacturas buscarproductofacturasAux:this.buscarproductofacturass) {
				if(buscarproductofacturasAux.getId().equals(this.iIdNuevoBuscarProductoFacturas)) {
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
	
	public int getIndiceActualBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BuscarProductoFacturas buscarproductofacturasAux:this.buscarproductofacturasLogic.getBuscarProductoFacturass()) {
				if(buscarproductofacturasAux.getId().equals(buscarproductofacturas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BuscarProductoFacturas buscarproductofacturasAux:this.buscarproductofacturass) {
				if(buscarproductofacturasAux.getId().equals(buscarproductofacturas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BuscarProductoFacturas buscarproductofacturasAux:this.buscarproductofacturasLogic.getBuscarProductoFacturass()) {
				if(buscarproductofacturasAux.getBuscarProductoFacturasOriginal().getId().equals(buscarproductofacturasOriginal.getId())) {
					existe=true;
					buscarproductofacturasOriginal.setId(buscarproductofacturasAux.getId());
					buscarproductofacturasOriginal.setVersionRow(buscarproductofacturasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BuscarProductoFacturas buscarproductofacturasAux:this.buscarproductofacturass) {
				if(buscarproductofacturasAux.getBuscarProductoFacturasOriginal().getId().equals(buscarproductofacturasOriginal.getId())) {
					existe=true;
					buscarproductofacturasOriginal.setId(buscarproductofacturasAux.getId());
					buscarproductofacturasOriginal.setVersionRow(buscarproductofacturasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosBuscarProductoFacturas(Boolean esParaCancelar) throws Exception {
		buscarproductofacturassAux=new ArrayList<BuscarProductoFacturas>();
		buscarproductofacturasAux=new BuscarProductoFacturas();
		
		if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(BuscarProductoFacturas buscarproductofacturasAux:this.buscarproductofacturasLogic.getBuscarProductoFacturass()) {
					if(buscarproductofacturasAux.getId()<0) {
						buscarproductofacturassAux.add(buscarproductofacturasAux);
					}		
				}
				this.iIdNuevoBuscarProductoFacturas=0L;
				this.buscarproductofacturasLogic.getBuscarProductoFacturass().removeAll(buscarproductofacturassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BuscarProductoFacturas buscarproductofacturasAux:this.buscarproductofacturass) {
					if(buscarproductofacturasAux.getId()<0) {
						buscarproductofacturassAux.add(buscarproductofacturasAux);
					}		
				}
				this.iIdNuevoBuscarProductoFacturas=0L;
				this.buscarproductofacturass.removeAll(buscarproductofacturassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoBuscarProductoFacturas 
					&& this.buscarproductofacturasLogic.getBuscarProductoFacturass().size()>0
					) {
					buscarproductofacturasAux=this.buscarproductofacturasLogic.getBuscarProductoFacturass().get(this.buscarproductofacturasLogic.getBuscarProductoFacturass().size() - 1);
				
					if(buscarproductofacturasAux.getId()<0) {
						this.buscarproductofacturasLogic.getBuscarProductoFacturass().remove(buscarproductofacturasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoBuscarProductoFacturas && this.buscarproductofacturass.size()>0) {
					buscarproductofacturasAux=this.buscarproductofacturass.get(this.buscarproductofacturass.size() - 1);
				
					if(buscarproductofacturasAux.getId()<0) {
						this.buscarproductofacturass.remove(buscarproductofacturasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoBuscarProductoFacturas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(buscarproductofacturas.getId()<0) {
				this.buscarproductofacturasLogic.getBuscarProductoFacturass().remove(this.buscarproductofacturas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(buscarproductofacturas.getId()<0) {
				this.buscarproductofacturass.remove(this.buscarproductofacturas);
			}
		}			
	}
	
	public void setEstadosInicialesBuscarProductoFacturas(List<BuscarProductoFacturas> buscarproductofacturassAux) throws Exception {
		BuscarProductoFacturasConstantesFunciones.setEstadosInicialesBuscarProductoFacturas(buscarproductofacturassAux);
	}
	
	public void setEstadosInicialesBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturasAux) throws Exception {
		BuscarProductoFacturasConstantesFunciones.setEstadosInicialesBuscarProductoFacturas(buscarproductofacturasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarBuscarProductoFacturasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesBuscarProductoFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarBuscarProductoFacturasActual()) {
				if(!this.isEsNuevoBuscarProductoFacturas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesBuscarProductoFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoBuscarProductoFacturas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarBuscarProductoFacturasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Buscar Producto Facturas ?", "MANTENIMIENTO DE Buscar Producto Facturas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesBuscarProductoFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(BuscarProductoFacturas buscarproductofacturas) throws Exception {
		BuscarProductoFacturasConstantesFunciones.seleccionarAsignar(this.buscarproductofacturas,buscarproductofacturas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarBuscarProductoFacturas=this.isPermisoActualizarOriginalBuscarProductoFacturas;
			
			
			this.seleccionarAsignar(buscarproductofacturas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesBuscarProductoFacturas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.buscarproductofacturasSessionBean.setsFuncionBusquedaRapida(this.buscarproductofacturasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoBuscarProductoFacturas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosBuscarProductoFacturas(esParaCancelar);				
				this.cancelarNuevoBuscarProductoFacturas(esParaCancelar);								
			}
			
			this.buscarproductofacturas=new BuscarProductoFacturas();
			
			this.inicializarBuscarProductoFacturas();
			
			this.actualizarEstadoCeldasBotonesBuscarProductoFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarBuscarProductoFacturas() throws Exception {
		try {
			BuscarProductoFacturasConstantesFunciones.inicializarBuscarProductoFacturas(this.buscarproductofacturas);
			
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
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.buscarproductofacturasLogic.getBuscarProductoFacturass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteBuscarProductoFacturass(String sAccionBusqueda,List<BuscarProductoFacturas> buscarproductofacturassParaReportes) throws Exception {
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
					sPathReporteFinal="BuscarProductoFacturas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="BuscarProductoFacturasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("BuscarProductoFacturasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="BuscarProductoFacturas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Buscar Producto Facturases");		
		parameters.put("busquedapor", BuscarProductoFacturasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceBuscarProductoFacturas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			BuscarProductoFacturasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			BuscarProductoFacturasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceBuscarProductoFacturas=new JRBeanArrayDataSource(BuscarProductoFacturasJInternalFrame.TraerBuscarProductoFacturasBeans(buscarproductofacturassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceBuscarProductoFacturas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+BuscarProductoFacturasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+BuscarProductoFacturasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(BuscarProductoFacturasBean.TraerBuscarProductoFacturasBeans(buscarproductofacturassParaReportes).toArray()));
							
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
				this.generarExcelReporteBuscarProductoFacturass(sAccionBusqueda,sTipoArchivoReporte,buscarproductofacturassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalBuscarProductoFacturass(sAccionBusqueda,sTipoArchivoReporte,buscarproductofacturassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoBuscarProductoFacturasActionPerformed(null);
					//this.generarExcelReporteBuscarProductoFacturass(sAccionBusqueda,sTipoArchivoReporte,buscarproductofacturassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalBuscarProductoFacturass(sAccionBusqueda,sTipoArchivoReporte,buscarproductofacturassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesBuscarProductoFacturass(sAccionBusqueda,sTipoArchivoReporte,buscarproductofacturassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesBuscarProductoFacturass(sAccionBusqueda,sTipoArchivoReporte,buscarproductofacturassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteBuscarProductoFacturass(String sAccionBusqueda,String sTipoArchivoReporte,List<BuscarProductoFacturas> buscarproductofacturassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"buscarproductofacturas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BuscarProductoFacturass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBuscarProductoFacturas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(BuscarProductoFacturas buscarproductofacturas : buscarproductofacturassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			BuscarProductoFacturasConstantesFunciones.generarExcelReporteDataBuscarProductoFacturas("NORMAL",row,workbook,buscarproductofacturas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Buscar Producto Facturas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderBuscarProductoFacturas(String sTipo,Row row,Workbook workbook) {
		
		BuscarProductoFacturasConstantesFunciones.generarExcelReporteHeaderBuscarProductoFacturas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalBuscarProductoFacturass(String sAccionBusqueda,String sTipoArchivoReporte,List<BuscarProductoFacturas> buscarproductofacturassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"buscarproductofacturas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BuscarProductoFacturass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(BuscarProductoFacturas buscarproductofacturas : buscarproductofacturassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(BuscarProductoFacturasConstantesFunciones.getBuscarProductoFacturasDescripcion(buscarproductofacturas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getnumero_pre_impreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getnombre_vendedor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getnumero_pre_impreso_dato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getnombre_bodega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(buscarproductofacturas.getdescuento());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Buscar Producto Facturas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesBuscarProductoFacturass(String sAccionBusqueda,String sTipoArchivoReporte,List<BuscarProductoFacturas> buscarproductofacturassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<BuscarProductoFacturas> buscarproductofacturassRespaldo=null;
		
		classes=BuscarProductoFacturasConstantesFunciones.getClassesRelationshipsOfBuscarProductoFacturas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.buscarproductofacturasLogic.setDatosCliente(this.datosCliente);
		this.buscarproductofacturasLogic.setDatosDeep(this.datosDeep);
		this.buscarproductofacturasLogic.setIsConDeep(true);
		
		buscarproductofacturassRespaldo=this.buscarproductofacturasLogic.getBuscarProductoFacturass();
		
		this.buscarproductofacturasLogic.setBuscarProductoFacturass(buscarproductofacturassParaReportes);	
		this.buscarproductofacturasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		buscarproductofacturassParaReportes=this.buscarproductofacturasLogic.getBuscarProductoFacturass();
		this.buscarproductofacturasLogic.setBuscarProductoFacturass(buscarproductofacturassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"buscarproductofacturas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BuscarProductoFacturass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBuscarProductoFacturas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(BuscarProductoFacturas buscarproductofacturas : buscarproductofacturassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderBuscarProductoFacturas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			BuscarProductoFacturasConstantesFunciones.generarExcelReporteDataBuscarProductoFacturas("NORMAL",row,workbook,buscarproductofacturas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(BuscarProductoFacturasConstantesFunciones.getBuscarProductoFacturasDescripcion(buscarproductofacturas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Buscar Producto Facturas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessBuscarProductoFacturas() throws Exception {		
		this.startProcessBuscarProductoFacturas(true);
	}
	
	public void startProcessBuscarProductoFacturas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasBuscarProductoFacturas ,this.jPanelParametrosReportesBuscarProductoFacturas, this.jScrollPanelDatosBuscarProductoFacturas,this.jPanelPaginacionBuscarProductoFacturas, this.jScrollPanelDatosEdicionBuscarProductoFacturas, this.jPanelAccionesBuscarProductoFacturas,this.jPanelAccionesFormularioBuscarProductoFacturas,this.jmenuBarBuscarProductoFacturas,this.jmenuBarDetalleBuscarProductoFacturas,this.jTtoolBarBuscarProductoFacturas,this.jTtoolBarDetalleBuscarProductoFacturas);		
		
		final JTabbedPane jTabbedPaneBusquedasBuscarProductoFacturas=this.jTabbedPaneBusquedasBuscarProductoFacturas; 
		
		final JPanel jPanelParametrosReportesBuscarProductoFacturas=this.jPanelParametrosReportesBuscarProductoFacturas;
		//final JScrollPane jScrollPanelDatosBuscarProductoFacturas=this.jScrollPanelDatosBuscarProductoFacturas;
		final JTable jTableDatosBuscarProductoFacturas=this.jTableDatosBuscarProductoFacturas;		
		final JPanel jPanelPaginacionBuscarProductoFacturas=this.jPanelPaginacionBuscarProductoFacturas;
		//final JScrollPane jScrollPanelDatosEdicionBuscarProductoFacturas=this.jScrollPanelDatosEdicionBuscarProductoFacturas;
		final JPanel jPanelAccionesBuscarProductoFacturas=this.jPanelAccionesBuscarProductoFacturas;
		
		JPanel jPanelCamposAuxiliarBuscarProductoFacturas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarBuscarProductoFacturas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
			jPanelCamposAuxiliarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelCamposBuscarProductoFacturas;
			jPanelAccionesFormularioAuxiliarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelAccionesFormularioBuscarProductoFacturas;
		}
		
		final JPanel jPanelCamposBuscarProductoFacturas=jPanelCamposAuxiliarBuscarProductoFacturas;
		final JPanel jPanelAccionesFormularioBuscarProductoFacturas=jPanelAccionesFormularioAuxiliarBuscarProductoFacturas;
		
		
		final JMenuBar jmenuBarBuscarProductoFacturas=this.jmenuBarBuscarProductoFacturas;
		final JToolBar jTtoolBarBuscarProductoFacturas=this.jTtoolBarBuscarProductoFacturas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarBuscarProductoFacturas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBuscarProductoFacturas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
			jmenuBarDetalleAuxiliarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jmenuBarDetalleBuscarProductoFacturas;
			jTtoolBarDetalleAuxiliarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jTtoolBarDetalleBuscarProductoFacturas;
		}
		
		final JMenuBar jmenuBarDetalleBuscarProductoFacturas=jmenuBarDetalleAuxiliarBuscarProductoFacturas;
		final JToolBar jTtoolBarDetalleBuscarProductoFacturas=jTtoolBarDetalleAuxiliarBuscarProductoFacturas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBuscarProductoFacturas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBuscarProductoFacturas;
			processRunnable.jTableDatos=jTableDatosBuscarProductoFacturas;
			processRunnable.jPanelCampos=jPanelCamposBuscarProductoFacturas;
			processRunnable.jPanelPaginacion=jPanelPaginacionBuscarProductoFacturas;
			processRunnable.jPanelAcciones=jPanelAccionesBuscarProductoFacturas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBuscarProductoFacturas;
			
			
			processRunnable.jmenuBar=jmenuBarBuscarProductoFacturas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBuscarProductoFacturas;
			processRunnable.jTtoolBar=jTtoolBarBuscarProductoFacturas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBuscarProductoFacturas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBuscarProductoFacturas ,jPanelParametrosReportesBuscarProductoFacturas,jTableDatosBuscarProductoFacturas, /*jScrollPanelDatosBuscarProductoFacturas,*/jPanelCamposBuscarProductoFacturas,jPanelPaginacionBuscarProductoFacturas, /*jScrollPanelDatosEdicionBuscarProductoFacturas,*/ jPanelAccionesBuscarProductoFacturas,jPanelAccionesFormularioBuscarProductoFacturas,jmenuBarBuscarProductoFacturas,jmenuBarDetalleBuscarProductoFacturas,jTtoolBarBuscarProductoFacturas,jTtoolBarDetalleBuscarProductoFacturas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBuscarProductoFacturas ,jPanelParametrosReportesBuscarProductoFacturas, jScrollPanelDatosBuscarProductoFacturas,jPanelPaginacionBuscarProductoFacturas, jScrollPanelDatosEdicionBuscarProductoFacturas, jPanelAccionesBuscarProductoFacturas,jPanelAccionesFormularioBuscarProductoFacturas,jmenuBarBuscarProductoFacturas,jmenuBarDetalleBuscarProductoFacturas,jTtoolBarBuscarProductoFacturas,jTtoolBarDetalleBuscarProductoFacturas);
						
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
	
	public void finishProcessBuscarProductoFacturas() {// throws Exception 
		this.finishProcessBuscarProductoFacturas(true);
	}
	
	public void finishProcessBuscarProductoFacturas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasBuscarProductoFacturas ,this.jPanelParametrosReportesBuscarProductoFacturas, this.jScrollPanelDatosBuscarProductoFacturas,this.jPanelPaginacionBuscarProductoFacturas, this.jScrollPanelDatosEdicionBuscarProductoFacturas, this.jPanelAccionesBuscarProductoFacturas,this.jPanelAccionesFormularioBuscarProductoFacturas,this.jmenuBarBuscarProductoFacturas,this.jmenuBarDetalleBuscarProductoFacturas,this.jTtoolBarBuscarProductoFacturas,this.jTtoolBarDetalleBuscarProductoFacturas);		
		
		final JTabbedPane jTabbedPaneBusquedasBuscarProductoFacturas=this.jTabbedPaneBusquedasBuscarProductoFacturas; 
		
		final JPanel jPanelParametrosReportesBuscarProductoFacturas=this.jPanelParametrosReportesBuscarProductoFacturas;
		//final JScrollPane jScrollPanelDatosBuscarProductoFacturas=this.jScrollPanelDatosBuscarProductoFacturas;
		final JTable jTableDatosBuscarProductoFacturas=this.jTableDatosBuscarProductoFacturas;		
		final JPanel jPanelPaginacionBuscarProductoFacturas=this.jPanelPaginacionBuscarProductoFacturas;
		//final JScrollPane jScrollPanelDatosEdicionBuscarProductoFacturas=this.jScrollPanelDatosEdicionBuscarProductoFacturas;
		final JPanel jPanelAccionesBuscarProductoFacturas=this.jPanelAccionesBuscarProductoFacturas;
		
		JPanel jPanelCamposAuxiliarBuscarProductoFacturas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarBuscarProductoFacturas=new JPanel();
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
			jPanelCamposAuxiliarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelCamposBuscarProductoFacturas;
			jPanelAccionesFormularioAuxiliarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelAccionesFormularioBuscarProductoFacturas;
		}
		
		final JPanel jPanelCamposBuscarProductoFacturas=jPanelCamposAuxiliarBuscarProductoFacturas;
		final JPanel jPanelAccionesFormularioBuscarProductoFacturas=jPanelAccionesFormularioAuxiliarBuscarProductoFacturas;
		
		
		final JMenuBar jmenuBarBuscarProductoFacturas=this.jmenuBarBuscarProductoFacturas;		
		final JToolBar jTtoolBarBuscarProductoFacturas=this.jTtoolBarBuscarProductoFacturas;
				
		JMenuBar jmenuBarDetalleAuxiliarBuscarProductoFacturas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBuscarProductoFacturas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
			jmenuBarDetalleAuxiliarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jmenuBarDetalleBuscarProductoFacturas;
			jTtoolBarDetalleAuxiliarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jTtoolBarDetalleBuscarProductoFacturas;		
		}
		
		final JMenuBar jmenuBarDetalleBuscarProductoFacturas=jmenuBarDetalleAuxiliarBuscarProductoFacturas;
		final JToolBar jTtoolBarDetalleBuscarProductoFacturas=jTtoolBarDetalleAuxiliarBuscarProductoFacturas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBuscarProductoFacturas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBuscarProductoFacturas;
			processRunnable.jTableDatos=jTableDatosBuscarProductoFacturas;
			processRunnable.jPanelCampos=jPanelCamposBuscarProductoFacturas;
			processRunnable.jPanelPaginacion=jPanelPaginacionBuscarProductoFacturas;
			processRunnable.jPanelAcciones=jPanelAccionesBuscarProductoFacturas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBuscarProductoFacturas;
			
			
			processRunnable.jmenuBar=jmenuBarBuscarProductoFacturas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBuscarProductoFacturas;
			processRunnable.jTtoolBar=jTtoolBarBuscarProductoFacturas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBuscarProductoFacturas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasBuscarProductoFacturas ,jPanelParametrosReportesBuscarProductoFacturas, jTableDatosBuscarProductoFacturas,/*jScrollPanelDatosBuscarProductoFacturas,*/jPanelCamposBuscarProductoFacturas,jPanelPaginacionBuscarProductoFacturas, /*jScrollPanelDatosEdicionBuscarProductoFacturas,*/ jPanelAccionesBuscarProductoFacturas,jPanelAccionesFormularioBuscarProductoFacturas,jmenuBarBuscarProductoFacturas,jmenuBarDetalleBuscarProductoFacturas,jTtoolBarBuscarProductoFacturas,jTtoolBarDetalleBuscarProductoFacturas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesBuscarProductoFacturas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarBuscarProductoFacturas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuBuscarProductoFacturas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarBuscarProductoFacturas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarBuscarProductoFacturas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleBuscarProductoFacturas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuBuscarProductoFacturas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarBuscarProductoFacturas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleBuscarProductoFacturas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.buscarproductofacturasConstantesFunciones.getsFinalQueryBuscarProductoFacturas();
		String  finalQueryPaginacionTodos=this.buscarproductofacturasConstantesFunciones.getsFinalQueryBuscarProductoFacturas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=BuscarProductoFacturasConstantesFunciones.getArrayColumnasGlobalesNoBuscarProductoFacturas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=BuscarProductoFacturasConstantesFunciones.getArrayColumnasGlobalesBuscarProductoFacturas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,BuscarProductoFacturasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.buscarproductofacturassEliminados= new ArrayList<BuscarProductoFacturas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessBuscarProductoFacturas();
		
				///*BuscarProductoFacturasSessionBean*/this.buscarproductofacturasSessionBean=new BuscarProductoFacturasSessionBean();
			
			if(this.buscarproductofacturasSessionBean==null) {
				this.buscarproductofacturasSessionBean=new BuscarProductoFacturasSessionBean();
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
					this.iNumeroPaginacion=BuscarProductoFacturasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=BuscarProductoFacturasConstantesFunciones.getClassesForeignKeysOfBuscarProductoFacturas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/buscarproductofacturas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			buscarproductofacturassAux= new ArrayList<BuscarProductoFacturas>();
			
				
			buscarproductofacturasLogic.setDatosCliente(this.datosCliente);
			buscarproductofacturasLogic.setDatosDeep(this.datosDeep);
			buscarproductofacturasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaBuscarProductoFacturas")) {
				this.sDetalleReporte=BuscarProductoFacturasConstantesFunciones.getDetalleIndiceBusquedaBuscarProductoFacturas(id_productoBusquedaBuscarProductoFacturas,id_clienteBusquedaBuscarProductoFacturas,numero_pre_impresoBusquedaBuscarProductoFacturas,fecha_emision_desdeBusquedaBuscarProductoFacturas,fecha_emision_hastaBusquedaBuscarProductoFacturas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					buscarproductofacturasLogic.getBuscarProductoFacturassBusquedaBuscarProductoFacturas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_productoBusquedaBuscarProductoFacturas,id_clienteBusquedaBuscarProductoFacturas,numero_pre_impresoBusquedaBuscarProductoFacturas,fecha_emision_desdeBusquedaBuscarProductoFacturas,fecha_emision_hastaBusquedaBuscarProductoFacturas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BuscarProductoFacturasConstantesFunciones.getDetalleIndiceBusquedaBuscarProductoFacturas(id_productoBusquedaBuscarProductoFacturas,id_clienteBusquedaBuscarProductoFacturas,numero_pre_impresoBusquedaBuscarProductoFacturas,fecha_emision_desdeBusquedaBuscarProductoFacturas,fecha_emision_hastaBusquedaBuscarProductoFacturas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BuscarProductoFacturasConstantesFunciones.getDetalleIndiceBusquedaBuscarProductoFacturas(id_productoBusquedaBuscarProductoFacturas,id_clienteBusquedaBuscarProductoFacturas,numero_pre_impresoBusquedaBuscarProductoFacturas,fecha_emision_desdeBusquedaBuscarProductoFacturas,fecha_emision_hastaBusquedaBuscarProductoFacturas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=buscarproductofacturasLogic.getBuscarProductoFacturass()==null||buscarproductofacturasLogic.getBuscarProductoFacturass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=buscarproductofacturass==null|| buscarproductofacturass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						buscarproductofacturassAux=new ArrayList<BuscarProductoFacturas>();
						buscarproductofacturassAux.addAll(buscarproductofacturasLogic.getBuscarProductoFacturass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							buscarproductofacturassAux=new ArrayList<BuscarProductoFacturas>();
							buscarproductofacturassAux.addAll(buscarproductofacturass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							buscarproductofacturasLogic.getBuscarProductoFacturassBusquedaBuscarProductoFacturas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_productoBusquedaBuscarProductoFacturas,id_clienteBusquedaBuscarProductoFacturas,numero_pre_impresoBusquedaBuscarProductoFacturas,fecha_emision_desdeBusquedaBuscarProductoFacturas,fecha_emision_hastaBusquedaBuscarProductoFacturas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BuscarProductoFacturasConstantesFunciones.getDetalleIndiceBusquedaBuscarProductoFacturas(id_productoBusquedaBuscarProductoFacturas,id_clienteBusquedaBuscarProductoFacturas,numero_pre_impresoBusquedaBuscarProductoFacturas,fecha_emision_desdeBusquedaBuscarProductoFacturas,fecha_emision_hastaBusquedaBuscarProductoFacturas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BuscarProductoFacturasConstantesFunciones.getDetalleIndiceBusquedaBuscarProductoFacturas(id_productoBusquedaBuscarProductoFacturas,id_clienteBusquedaBuscarProductoFacturas,numero_pre_impresoBusquedaBuscarProductoFacturas,fecha_emision_desdeBusquedaBuscarProductoFacturas,fecha_emision_hastaBusquedaBuscarProductoFacturas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBuscarProductoFacturass("BusquedaBuscarProductoFacturas",buscarproductofacturasLogic.getBuscarProductoFacturass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBuscarProductoFacturass("BusquedaBuscarProductoFacturas",buscarproductofacturass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						buscarproductofacturasLogic.setBuscarProductoFacturass(new ArrayList<BuscarProductoFacturas>());
						buscarproductofacturasLogic.getBuscarProductoFacturass().addAll(buscarproductofacturassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							buscarproductofacturass=new ArrayList<BuscarProductoFacturas>();
							buscarproductofacturass.addAll(buscarproductofacturassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesBuscarProductoFacturas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessBuscarProductoFacturas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=buscarproductofacturasLogic.getBuscarProductoFacturass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=buscarproductofacturass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=buscarproductofacturasLogic.getBuscarProductoFacturass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=buscarproductofacturass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(BuscarProductoFacturas buscarproductofacturas) {
		Boolean permite=true;
		
		if(this.buscarproductofacturas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=BuscarProductoFacturasConstantesFunciones.getOrderByListaBuscarProductoFacturas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=BuscarProductoFacturasConstantesFunciones.getOrderByListaBuscarProductoFacturas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturasLogic.getBuscarProductoFacturass()) {
				if(buscarproductofacturas.getsType().equals(Constantes2.S_TOTALES)) {
					buscarproductofacturasTotales=buscarproductofacturas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BuscarProductoFacturas buscarproductofacturas:this.buscarproductofacturass) {
				if(buscarproductofacturas.getsType().equals(Constantes2.S_TOTALES)) {
					buscarproductofacturasTotales=buscarproductofacturas;
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
			this.buscarproductofacturasAux=new BuscarProductoFacturas();
			this.buscarproductofacturasAux.setsType(Constantes2.S_TOTALES);
			this.buscarproductofacturasAux.setIsNew(false);
			this.buscarproductofacturasAux.setIsChanged(false);
			this.buscarproductofacturasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//BuscarProductoFacturasConstantesFunciones.TotalizarValoresFilaBuscarProductoFacturas(this.buscarproductofacturasLogic.getBuscarProductoFacturass(),this.buscarproductofacturasAux);
				
				//this.buscarproductofacturasLogic.getBuscarProductoFacturass().add(this.buscarproductofacturasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				BuscarProductoFacturasConstantesFunciones.TotalizarValoresFilaBuscarProductoFacturas(this.buscarproductofacturass,this.buscarproductofacturasAux);
				
				this.buscarproductofacturass.add(this.buscarproductofacturasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		buscarproductofacturasTotales=new BuscarProductoFacturas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.buscarproductofacturasLogic.getBuscarProductoFacturass().remove(buscarproductofacturasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.buscarproductofacturass.remove(buscarproductofacturasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		buscarproductofacturasTotales=new BuscarProductoFacturas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturasLogic.getBuscarProductoFacturass()) {
				if(buscarproductofacturas.getsType().equals(Constantes2.S_TOTALES)) {
					buscarproductofacturasTotales=buscarproductofacturas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BuscarProductoFacturasConstantesFunciones.TotalizarValoresFilaBuscarProductoFacturas(this.buscarproductofacturasLogic.getBuscarProductoFacturass(),buscarproductofacturasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BuscarProductoFacturas buscarproductofacturas:this.buscarproductofacturass) {
				if(buscarproductofacturas.getsType().equals(Constantes2.S_TOTALES)) {
					buscarproductofacturasTotales=buscarproductofacturas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BuscarProductoFacturasConstantesFunciones.TotalizarValoresFilaBuscarProductoFacturas(this.buscarproductofacturass,buscarproductofacturasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getBuscarProductoFacturassBusquedaBuscarProductoFacturas()throws Exception {
		try {
			sAccionBusqueda="BusquedaBuscarProductoFacturas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBuscarProductoFacturassFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBuscarProductoFacturassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBuscarProductoFacturassFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBuscarProductoFacturassFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getBuscarProductoFacturassBusquedaBuscarProductoFacturas(String sFinalQuery,Long id_producto,Long id_cliente,String numero_pre_impreso,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//buscarproductofacturasLogic.getBuscarProductoFacturassBusquedaBuscarProductoFacturas(sFinalQuery,this.pagination,id_producto,id_cliente,numero_pre_impreso,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBuscarProductoFacturassFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//buscarproductofacturasLogic.getBuscarProductoFacturassFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBuscarProductoFacturassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//buscarproductofacturasLogic.getBuscarProductoFacturassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBuscarProductoFacturassFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//buscarproductofacturasLogic.getBuscarProductoFacturassFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBuscarProductoFacturassFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//buscarproductofacturasLogic.getBuscarProductoFacturassFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosBuscarProductoFacturas() {
		this.isPermisoTodoBuscarProductoFacturas=false;
		this.isPermisoNuevoBuscarProductoFacturas=false;
		this.isPermisoActualizarBuscarProductoFacturas=false;
		this.isPermisoActualizarOriginalBuscarProductoFacturas=false;
		this.isPermisoEliminarBuscarProductoFacturas=false;
		this.isPermisoGuardarCambiosBuscarProductoFacturas=false;
		this.isPermisoConsultaBuscarProductoFacturas=true;
		this.isPermisoBusquedaBuscarProductoFacturas=true;
		this.isPermisoReporteBuscarProductoFacturas=true;
		this.isPermisoOrdenBuscarProductoFacturas=false;		
		this.isPermisoPaginacionMedioBuscarProductoFacturas=false;		
		this.isPermisoPaginacionAltoBuscarProductoFacturas=false;		
		this.isPermisoPaginacionTodoBuscarProductoFacturas=false;		
		this.isPermisoCopiarBuscarProductoFacturas=false;		
		this.isPermisoVerFormBuscarProductoFacturas=false;		
		this.isPermisoDuplicarBuscarProductoFacturas=false;
		this.isPermisoOrdenBuscarProductoFacturas=false;
	}
	
	public void setPermisosUsuarioBuscarProductoFacturas(Boolean isPermiso) {
		this.isPermisoTodoBuscarProductoFacturas=isPermiso;
		this.isPermisoNuevoBuscarProductoFacturas=isPermiso;
		this.isPermisoActualizarBuscarProductoFacturas=isPermiso;
		this.isPermisoActualizarOriginalBuscarProductoFacturas=isPermiso;
		this.isPermisoEliminarBuscarProductoFacturas=isPermiso;
		this.isPermisoGuardarCambiosBuscarProductoFacturas=isPermiso;
		this.isPermisoConsultaBuscarProductoFacturas=isPermiso;
		this.isPermisoBusquedaBuscarProductoFacturas=isPermiso;
		this.isPermisoReporteBuscarProductoFacturas=isPermiso;
		this.isPermisoOrdenBuscarProductoFacturas=isPermiso;		
		this.isPermisoPaginacionMedioBuscarProductoFacturas=isPermiso;		
		this.isPermisoPaginacionAltoBuscarProductoFacturas=isPermiso;		
		this.isPermisoPaginacionTodoBuscarProductoFacturas=isPermiso;		
		this.isPermisoCopiarBuscarProductoFacturas=isPermiso;		
		this.isPermisoVerFormBuscarProductoFacturas=isPermiso;		
		this.isPermisoDuplicarBuscarProductoFacturas=isPermiso;
		this.isPermisoOrdenBuscarProductoFacturas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioBuscarProductoFacturas(Boolean isPermiso) {
		//this.isPermisoTodoBuscarProductoFacturas=isPermiso;
		this.isPermisoNuevoBuscarProductoFacturas=isPermiso;
		this.isPermisoActualizarBuscarProductoFacturas=isPermiso;
		this.isPermisoActualizarOriginalBuscarProductoFacturas=isPermiso;
		this.isPermisoEliminarBuscarProductoFacturas=isPermiso;
		this.isPermisoGuardarCambiosBuscarProductoFacturas=isPermiso;
		//this.isPermisoConsultaBuscarProductoFacturas=isPermiso;
		//this.isPermisoBusquedaBuscarProductoFacturas=isPermiso;
		//this.isPermisoReporteBuscarProductoFacturas=isPermiso;
		//this.isPermisoOrdenBuscarProductoFacturas=isPermiso;		
		//this.isPermisoPaginacionMedioBuscarProductoFacturas=isPermiso;		
		//this.isPermisoPaginacionAltoBuscarProductoFacturas=isPermiso;		
		//this.isPermisoPaginacionTodoBuscarProductoFacturas=isPermiso;		
		//this.isPermisoCopiarBuscarProductoFacturas=isPermiso;		
		//this.isPermisoDuplicarBuscarProductoFacturas=isPermiso;
		//this.isPermisoOrdenBuscarProductoFacturas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioBuscarProductoFacturasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(BuscarProductoFacturasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebBuscarProductoFacturas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioBuscarProductoFacturasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioBuscarProductoFacturasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionBuscarProductoFacturasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioBuscarProductoFacturasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioBuscarProductoFacturas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(BuscarProductoFacturasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, BuscarProductoFacturasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoBuscarProductoFacturas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarBuscarProductoFacturas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalBuscarProductoFacturas=this.isPermisoActualizarBuscarProductoFacturas;
			this.isPermisoEliminarBuscarProductoFacturas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosBuscarProductoFacturas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaBuscarProductoFacturas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaBuscarProductoFacturas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoBuscarProductoFacturas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteBuscarProductoFacturas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBuscarProductoFacturas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioBuscarProductoFacturas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoBuscarProductoFacturas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoBuscarProductoFacturas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarBuscarProductoFacturas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormBuscarProductoFacturas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarBuscarProductoFacturas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBuscarProductoFacturas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosBuscarProductoFacturas.setToolTipText(this.jTableDatosBuscarProductoFacturas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioBuscarProductoFacturas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioBuscarProductoFacturas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(BuscarProductoFacturasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(BuscarProductoFacturasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioBuscarProductoFacturas() throws Exception {
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
	public void inicializarCombosForeignKeyBuscarProductoFacturasListas()throws Exception {
		try	{						
			
				this.productosForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyBuscarProductoFacturasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(BuscarProductoFacturasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyBuscarProductoFacturas()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {
			if(this.buscarproductofacturasSessionBean==null) {
				this.buscarproductofacturasSessionBean=new BuscarProductoFacturasSessionBean();
			}

			if(!this.buscarproductofacturasSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

			if(!this.buscarproductofacturasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.buscarproductofacturasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.buscarproductofacturasSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyBuscarProductoFacturas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyBuscarProductoFacturas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyBuscarProductoFacturas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyBuscarProductoFacturas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyBuscarProductoFacturas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyBuscarProductoFacturas()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyBuscarProductoFacturas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyBuscarProductoFacturas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroBuscarProductoFacturas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyBuscarProductoFacturas()throws Exception {
		try {
			

			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyBuscarProductoFacturas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyBuscarProductoFacturas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_productoBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_productoBuscarProductoFacturas.getItemCount()>0) {
				this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_productoBuscarProductoFacturas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_empresaBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_empresaBuscarProductoFacturas.getItemCount()>0) {
				this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_empresaBuscarProductoFacturas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_sucursalBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_sucursalBuscarProductoFacturas.getItemCount()>0) {
				this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_sucursalBuscarProductoFacturas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_clienteBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_clienteBuscarProductoFacturas.getItemCount()>0) {
				this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_clienteBuscarProductoFacturas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public BuscarProductoFacturasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public BuscarProductoFacturasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public BuscarProductoFacturasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.buscarproductofacturasSessionBean=new BuscarProductoFacturasSessionBean(); 
		this.buscarproductofacturasConstantesFunciones=new BuscarProductoFacturasConstantesFunciones(); 
		this.buscarproductofacturasBean=new BuscarProductoFacturas();//(this.buscarproductofacturasConstantesFunciones); 		
		this.buscarproductofacturasReturnGeneral=new BuscarProductoFacturasParameterReturnGeneral(); 
		
		this.buscarproductofacturasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.buscarproductofacturasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public BuscarProductoFacturasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public BuscarProductoFacturasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public BuscarProductoFacturasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessBuscarProductoFacturas(true);
			
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
			
			this.buscarproductofacturasConstantesFunciones=new BuscarProductoFacturasConstantesFunciones(); 
			this.buscarproductofacturasBean=new BuscarProductoFacturas();//this.buscarproductofacturasConstantesFunciones); 			
			this.buscarproductofacturasReturnGeneral=new BuscarProductoFacturasParameterReturnGeneral(); 
		
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Buscar Producto Facturas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.buscarproductofacturas=new BuscarProductoFacturas();
			this.buscarproductofacturass = new ArrayList<BuscarProductoFacturas>();
			this.buscarproductofacturassAux = new ArrayList<BuscarProductoFacturas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic=new BuscarProductoFacturasLogic();
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}
			
			//this.buscarproductofacturasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.buscarproductofacturasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormBuscarProductoFacturas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBuscarProductoFacturas);	
					}
					
					if(this.jInternalFrameImportacionBuscarProductoFacturas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBuscarProductoFacturas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByBuscarProductoFacturas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByBuscarProductoFacturas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormBuscarProductoFacturas);
				this.jInternalFrameDetalleFormBuscarProductoFacturas.setVisible(false);
				this.jInternalFrameDetalleFormBuscarProductoFacturas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBuscarProductoFacturas);
					this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setVisible(false);
					this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionBuscarProductoFacturas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionBuscarProductoFacturas);
					this.jInternalFrameImportacionBuscarProductoFacturas.setVisible(false);
					this.jInternalFrameImportacionBuscarProductoFacturas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByBuscarProductoFacturas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByBuscarProductoFacturas);
					this.jInternalFrameOrderByBuscarProductoFacturas.setVisible(false);
					this.jInternalFrameOrderByBuscarProductoFacturas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idBuscarProductoFacturasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=BuscarProductoFacturasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.buscarproductofacturasReturnGeneral=new BuscarProductoFacturasParameterReturnGeneral();
			
			this.buscarproductofacturasParameterGeneral=new BuscarProductoFacturasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.buscarproductofacturasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(BuscarProductoFacturasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BuscarProductoFacturasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.buscarproductofacturasSessionBean.getEsGuardarRelacionado(),this.buscarproductofacturasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BuscarProductoFacturasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.buscarproductofacturasSessionBean.getEsGuardarRelacionado(),this.buscarproductofacturasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoBuscarProductoFacturas=false;
			this.isVisibilidadCeldaDuplicarBuscarProductoFacturas=true;
			this.isVisibilidadCeldaCopiarBuscarProductoFacturas=true;
			this.isVisibilidadCeldaVerFormBuscarProductoFacturas=true;
			this.isVisibilidadCeldaOrdenBuscarProductoFacturas=true;
			this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=false;
			this.isVisibilidadCeldaModificarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaActualizarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaEliminarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaCancelarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaGuardarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas=false;
			
			
			this.isVisibilidadBusquedaBuscarProductoFacturas=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesBuscarProductoFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosBuscarProductoFacturas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioBuscarProductoFacturas(false);
			
			this.setPermisosUsuarioBuscarProductoFacturas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() 
				|| (this.buscarproductofacturasSessionBean.getEsGuardarRelacionado() && this.buscarproductofacturasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioBuscarProductoFacturasClasesRelacionadas();
			}
			
			if(this.buscarproductofacturasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioBuscarProductoFacturasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosBuscarProductoFacturas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualBuscarProductoFacturas();
			}
			
			if(!this.isPermisoBusquedaBuscarProductoFacturas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasBuscarProductoFacturas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(BuscarProductoFacturasConstantesFunciones.getTiposSeleccionarBuscarProductoFacturas());
				
				this.tiposColumnasSelect=BuscarProductoFacturasConstantesFunciones.getTiposSeleccionarBuscarProductoFacturas(true);
				
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
			//if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioBuscarProductoFacturas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioBuscarProductoFacturas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioBuscarProductoFacturas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesBuscarProductoFacturas() ;
			
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
			
			this.productoLogic=new ProductoLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.clienteLogic=new ClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				buscarproductofacturasImplementable= (BuscarProductoFacturasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BuscarProductoFacturasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				buscarproductofacturasImplementableHome= (BuscarProductoFacturasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BuscarProductoFacturasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.buscarproductofacturass= new ArrayList<BuscarProductoFacturas>();
			this.buscarproductofacturassEliminados= new ArrayList<BuscarProductoFacturas>();
						
			this.isEsNuevoBuscarProductoFacturas=false;
			this.esParaAccionDesdeFormularioBuscarProductoFacturas=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyBuscarProductoFacturas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroBuscarProductoFacturas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=BuscarProductoFacturasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesBuscarProductoFacturas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingBuscarProductoFacturas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioBuscarProductoFacturas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioBuscarProductoFacturas();
			}
			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasBuscarProductoFacturas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasBuscarProductoFacturas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasBuscarProductoFacturas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessBuscarProductoFacturas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga BuscarProductoFacturas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectBuscarProductoFacturas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesBuscarProductoFacturas")) {
				iIndex=this.jInternalFrameDetalleFormBuscarProductoFacturas.jTabbedPaneRelacionesBuscarProductoFacturas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormBuscarProductoFacturas.jTabbedPaneRelacionesBuscarProductoFacturas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessBuscarProductoFacturas();	
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
	
	public void cargarCombosForeignKeyBuscarProductoFacturas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyBuscarProductoFacturas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyBuscarProductoFacturas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyBuscarProductoFacturasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyBuscarProductoFacturas();
		
		this.cargarCombosFrameForeignKeyBuscarProductoFacturas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyBuscarProductoFacturas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyBuscarProductoFacturas();
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

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoBuscarProductoFacturasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.buscarproductofacturasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			
			
			if(jTableDatosBuscarProductoFacturas.getRowCount()>=1) {
				jTableDatosBuscarProductoFacturas.removeRowSelectionInterval(0, jTableDatosBuscarProductoFacturas.getRowCount()-1);						
			}
			
			this.isEsNuevoBuscarProductoFacturas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoBuscarProductoFacturas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesBuscarProductoFacturas(true);			
			//this.buscarproductofacturas=new BuscarProductoFacturas();
			//this.buscarproductofacturas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBuscarProductoFacturas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBuscarProductoFacturas() ;
			
			if(BuscarProductoFacturasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBuscarProductoFacturas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.buscarproductofacturas);	
			this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);				
			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			
			if(this.buscarproductofacturasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar BuscarProductoFacturas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarBuscarProductoFacturasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<BuscarProductoFacturas> buscarproductofacturassSeleccionados=new ArrayList<BuscarProductoFacturas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosBuscarProductoFacturas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosBuscarProductoFacturas.getSelectedRows().length;			
			}
			
			buscarproductofacturassSeleccionados=this.getBuscarProductoFacturassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoBuscarProductoFacturas--;			
				//BuscarProductoFacturas buscarproductofacturasAux= new BuscarProductoFacturas();			
				//buscarproductofacturasAux.setId(this.iIdNuevoBuscarProductoFacturas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//BuscarProductoFacturas buscarproductofacturasOrigen=new BuscarProductoFacturas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(BuscarProductoFacturas buscarproductofacturasOrigen : buscarproductofacturassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							buscarproductofacturasOrigen =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							buscarproductofacturasOrigen =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaBuscarProductoFacturas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.buscarproductofacturas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosBuscarProductoFacturas(buscarproductofacturasOrigen,this.buscarproductofacturas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.buscarproductofacturasLogic.getBuscarProductoFacturass().add(this.buscarproductofacturasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturass.add(this.buscarproductofacturasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaBuscarProductoFacturas(false);
				
				this.jTableDatosBuscarProductoFacturas.setRowSelectionInterval(this.getIndiceNuevoBuscarProductoFacturas(), this.getIndiceNuevoBuscarProductoFacturas());
				
				int iLastRow =  this.jTableDatosBuscarProductoFacturas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBuscarProductoFacturas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBuscarProductoFacturas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBuscarProductoFacturas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<BuscarProductoFacturas> buscarproductofacturassSeleccionados=new ArrayList<BuscarProductoFacturas>();									
		
			BuscarProductoFacturas buscarproductofacturasOrigen=new BuscarProductoFacturas();
			BuscarProductoFacturas buscarproductofacturasDestino=new BuscarProductoFacturas();
				
			buscarproductofacturassSeleccionados=this.getBuscarProductoFacturassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosBuscarProductoFacturas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || buscarproductofacturassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosBuscarProductoFacturas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						buscarproductofacturasOrigen =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						buscarproductofacturasOrigen =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						buscarproductofacturasDestino =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						buscarproductofacturasDestino =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				buscarproductofacturasOrigen =buscarproductofacturassSeleccionados.get(0);
				buscarproductofacturasDestino =buscarproductofacturassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosBuscarProductoFacturas(buscarproductofacturasOrigen,buscarproductofacturasDestino,true,false);
				
				buscarproductofacturasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(buscarproductofacturasDestino,buscarproductofacturasLogic.getBuscarProductoFacturass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(buscarproductofacturasDestino,buscarproductofacturass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaBuscarProductoFacturas(false);
				
				//this.jTableDatosBuscarProductoFacturas.setRowSelectionInterval(this.getIndiceNuevoBuscarProductoFacturas(), this.getIndiceNuevoBuscarProductoFacturas());
				
				int iLastRow =  this.jTableDatosBuscarProductoFacturas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBuscarProductoFacturas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBuscarProductoFacturas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBuscarProductoFacturas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormBuscarProductoFacturas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesBuscarProductoFacturas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasBuscarProductoFacturas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesBuscarProductoFacturas.setVisible(!isVisible);
			this.jPanelPaginacionBuscarProductoFacturas.setVisible(!isVisible);
			this.jPanelAccionesBuscarProductoFacturas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameBuscarProductoFacturas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoBuscarProductoFacturas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionBuscarProductoFacturas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByBuscarProductoFacturas();
			
			this.abrirFrameOrderByBuscarProductoFacturas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByBuscarProductoFacturas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleBuscarProductoFacturas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormBuscarProductoFacturas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormBuscarProductoFacturas.isMaximum()) {
					this.jInternalFrameDetalleFormBuscarProductoFacturas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormBuscarProductoFacturas.setSize(this.jInternalFrameDetalleFormBuscarProductoFacturas.iWidthFormulario,this.jInternalFrameDetalleFormBuscarProductoFacturas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormBuscarProductoFacturas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormBuscarProductoFacturas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormBuscarProductoFacturas.isMaximum()) {
						this.jInternalFrameDetalleFormBuscarProductoFacturas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormBuscarProductoFacturas.jContentPaneDetalleBuscarProductoFacturas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormBuscarProductoFacturas.jTabbedPaneRelacionesBuscarProductoFacturas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormBuscarProductoFacturas.jContentPaneDetalleBuscarProductoFacturas.getWidth(),BuscarProductoFacturasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBuscarProductoFacturas.jTabbedPaneRelacionesBuscarProductoFacturas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormBuscarProductoFacturas.jContentPaneDetalleBuscarProductoFacturas.getWidth(),BuscarProductoFacturasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBuscarProductoFacturas.jTabbedPaneRelacionesBuscarProductoFacturas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormBuscarProductoFacturas.jContentPaneDetalleBuscarProductoFacturas.getWidth(),BuscarProductoFacturasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormBuscarProductoFacturas.setVisible(true);
	        this.jInternalFrameDetalleFormBuscarProductoFacturas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByBuscarProductoFacturas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByBuscarProductoFacturas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByBuscarProductoFacturas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBuscarProductoFacturas,false,this);
				} else {
					this.jInternalFrameOrderByBuscarProductoFacturas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBuscarProductoFacturas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByBuscarProductoFacturas);
				this.jInternalFrameOrderByBuscarProductoFacturas.setVisible(false);
				this.jInternalFrameOrderByBuscarProductoFacturas.setSelected(false);
				
				this.jInternalFrameOrderByBuscarProductoFacturas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBuscarProductoFacturas"));
				
				this.inicializarActualizarBindingTablaOrderByBuscarProductoFacturas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionBuscarProductoFacturas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionBuscarProductoFacturas==null) {
				
				this.jInternalFrameImportacionBuscarProductoFacturas=new ImportacionJInternalFrame(BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBuscarProductoFacturas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionBuscarProductoFacturas);
				this.jInternalFrameImportacionBuscarProductoFacturas.setVisible(false);
				this.jInternalFrameImportacionBuscarProductoFacturas.setSelected(false);


				this.jInternalFrameImportacionBuscarProductoFacturas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBuscarProductoFacturas"));
				this.jInternalFrameImportacionBuscarProductoFacturas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBuscarProductoFacturas"));
				this.jInternalFrameImportacionBuscarProductoFacturas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBuscarProductoFacturas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoBuscarProductoFacturas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas==null) {
				this.jInternalFrameReporteDinamicoBuscarProductoFacturas=new ReporteDinamicoJInternalFrame(BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBuscarProductoFacturas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBuscarProductoFacturas);
				this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setVisible(false);
				this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBuscarProductoFacturas"));
				this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBuscarProductoFacturas"));
				this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBuscarProductoFacturas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBuscarProductoFacturas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleBuscarProductoFacturas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormBuscarProductoFacturas);
			
	       	this.jInternalFrameDetalleFormBuscarProductoFacturas.setVisible(false);
	        this.jInternalFrameDetalleFormBuscarProductoFacturas.setSelected(false);
			
			//this.jInternalFrameDetalleFormBuscarProductoFacturas.dispose();
			//this.jInternalFrameDetalleFormBuscarProductoFacturas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoBuscarProductoFacturas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setVisible(true);
	        this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionBuscarProductoFacturas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionBuscarProductoFacturas.setVisible(true);
	        this.jInternalFrameImportacionBuscarProductoFacturas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByBuscarProductoFacturas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByBuscarProductoFacturas.setVisible(true);
	        this.jInternalFrameOrderByBuscarProductoFacturas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByBuscarProductoFacturas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByBuscarProductoFacturas.setVisible(false);
	        this.jInternalFrameOrderByBuscarProductoFacturas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoBuscarProductoFacturas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setVisible(false);
	        this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionBuscarProductoFacturas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionBuscarProductoFacturas.setVisible(false);
	        this.jInternalFrameImportacionBuscarProductoFacturas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarBuscarProductoFacturas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarBuscarProductoFacturas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesBuscarProductoFacturas(true);
			//this.isEsNuevoBuscarProductoFacturas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesBuscarProductoFacturas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBuscarProductoFacturas(false) ;
			
			if(buscarproductofacturasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(BuscarProductoFacturasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBuscarProductoFacturas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBuscarProductoFacturas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaBuscarProductoFacturasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarBuscarProductoFacturas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesBuscarProductoFacturas(true);
			//this.isEsNuevoBuscarProductoFacturas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.buscarproductofacturas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesBuscarProductoFacturas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesBuscarProductoFacturas(false) ;
			
			if(BuscarProductoFacturasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBuscarProductoFacturas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBuscarProductoFacturas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,BuscarProductoFacturasConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBuscarProductoFacturas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,BuscarProductoFacturasConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBuscarProductoFacturas.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesBuscarProductoFacturas(false);
			
			//if(!this.isEsNuevoBuscarProductoFacturas) {								
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				
			}
			
			if(this.permiteMantenimiento(this.buscarproductofacturas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoBuscarProductoFacturas=true;
					this.inicializarActualizarBindingTablaBuscarProductoFacturas(false);
					this.isEsNuevoBuscarProductoFacturas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoBuscarProductoFacturas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoBuscarProductoFacturas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBuscarProductoFacturas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBuscarProductoFacturas(false);
				
				this.habilitarDeshabilitarControlesBuscarProductoFacturas(false);
			
												
				
				if(BuscarProductoFacturasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleBuscarProductoFacturas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoBuscarProductoFacturasActionPerformed(evt,buscarproductofacturasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualBuscarProductoFacturas(this.buscarproductofacturas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosBuscarProductoFacturas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,buscarproductofacturasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.buscarproductofacturas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(BuscarProductoFacturas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BuscarProductoFacturas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				this.buscarproductofacturas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				this.buscarproductofacturas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.buscarproductofacturas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((BuscarProductoFacturasModel) this.jTableDatosBuscarProductoFacturas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoBuscarProductoFacturas=true;
				this.inicializarActualizarBindingTablaBuscarProductoFacturas(false);
				this.isEsNuevoBuscarProductoFacturas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBuscarProductoFacturas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBuscarProductoFacturas(false);
				
				this.habilitarDeshabilitarControlesBuscarProductoFacturas(false);
				
				
				
				if(BuscarProductoFacturasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleBuscarProductoFacturas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosBuscarProductoFacturas.getRowCount()>=1) {
				jTableDatosBuscarProductoFacturas.removeRowSelectionInterval(0, jTableDatosBuscarProductoFacturas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesBuscarProductoFacturas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaBuscarProductoFacturas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBuscarProductoFacturas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBuscarProductoFacturas(false) ;
			
			this.isEsNuevoBuscarProductoFacturas=false;
			
			if(BuscarProductoFacturasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleBuscarProductoFacturas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBuscarProductoFacturas(false);
				
				//SI ES MANUAL
				if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualBuscarProductoFacturas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoBuscarProductoFacturas--;			
			//BuscarProductoFacturas buscarproductofacturasAux= new BuscarProductoFacturas();			
			//buscarproductofacturasAux.setId(this.iIdNuevoBuscarProductoFacturas);
			
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaBuscarProductoFacturas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
			
			this.buscarproductofacturas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.buscarproductofacturasLogic.getBuscarProductoFacturass().add(this.buscarproductofacturasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.buscarproductofacturass.add(this.buscarproductofacturasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaBuscarProductoFacturas(false);
			
			this.jTableDatosBuscarProductoFacturas.setRowSelectionInterval(this.getIndiceNuevoBuscarProductoFacturas(), this.getIndiceNuevoBuscarProductoFacturas());
			
			int iLastRow =  this.jTableDatosBuscarProductoFacturas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosBuscarProductoFacturas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosBuscarProductoFacturas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaBuscarProductoFacturas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingBuscarProductoFacturas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBuscarProductoFacturas(false);
			
			//SI ES MANUAL
			if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBuscarProductoFacturas();
			}
			
			//this.abrirFrameTreeBuscarProductoFacturas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionBuscarProductoFacturas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionBuscarProductoFacturas.setFileImportacion(this.jInternalFrameImportacionBuscarProductoFacturas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionBuscarProductoFacturas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionBuscarProductoFacturas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionBuscarProductoFacturas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionBuscarProductoFacturas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<BuscarProductoFacturas> buscarproductofacturassSeleccionados=new ArrayList<BuscarProductoFacturas>();		

		buscarproductofacturassSeleccionados=this.getBuscarProductoFacturassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("BuscarProductoFacturasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"BuscarProductoFacturasBaseDesign.jrxml";
			
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
			
			this.generarReporteBuscarProductoFacturass("Todos",buscarproductofacturassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Buscar Producto Facturas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreVendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreVendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreVendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreVendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpresoDato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpresoDato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpresoDato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpresoDato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoria="nombre_vendedor";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO:
					sNombreCampoCategoria="numero_pre_impreso_dato";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoria="nombre_bodega";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoriaValor="nombre_vendedor";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO:
					sNombreCampoCategoriaValor="numero_pre_impreso_dato";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA:
					sNombreCampoCategoriaValor="nombre_bodega";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_vendedor");
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso Dato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso_dato");
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_bodega");
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
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
	
	public void jButtonGenerarExcelReporteDinamicoBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<BuscarProductoFacturas> buscarproductofacturassSeleccionados=new ArrayList<BuscarProductoFacturas>();		
		
		buscarproductofacturassSeleccionados=this.getBuscarProductoFacturassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"buscarproductofacturas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("BuscarProductoFacturass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case BuscarProductoFacturasConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESO);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getnumero_pre_impreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getnombre_vendedor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getnumero_pre_impreso_dato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getnombre_bodega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(BuscarProductoFacturas buscarproductofacturas:buscarproductofacturassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(buscarproductofacturas.getdescuento());
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
			//	this.getFilaCabeceraExportarExcelBuscarProductoFacturas(row);				
			//	iRow++;
			//}				
			
			//for(BuscarProductoFacturas buscarproductofacturasAux:buscarproductofacturassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelBuscarProductoFacturas(buscarproductofacturasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Buscar Producto Facturas",JOptionPane.INFORMATION_MESSAGE);
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
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBuscarProductoFacturas(false);
			
			//SI ES MANUAL
			if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBuscarProductoFacturas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBuscarProductoFacturas(false);
			
			//SI ES MANUAL
			if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBuscarProductoFacturas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBuscarProductoFacturas(false);
			
			//SI ES MANUAL
			if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBuscarProductoFacturas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaBuscarProductoFacturas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosBuscarProductoFacturas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosBuscarProductoFacturas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosBuscarProductoFacturas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosBuscarProductoFacturas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosBuscarProductoFacturas.setMinimumSize(dimensionMinimum);
		this.jTableDatosBuscarProductoFacturas.setMaximumSize(dimensionMaximum);
		this.jTableDatosBuscarProductoFacturas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingBuscarProductoFacturas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingBuscarProductoFacturas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingBuscarProductoFacturas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaBuscarProductoFacturas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesBuscarProductoFacturas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasBuscarProductoFacturas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBuscarProductoFacturas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesBuscarProductoFacturas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualBuscarProductoFacturas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaBuscarProductoFacturas();
		
		this.inicializarActualizarBindingBotonesManualBuscarProductoFacturas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualBuscarProductoFacturas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBuscarProductoFacturas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualBuscarProductoFacturas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualBuscarProductoFacturas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosBuscarProductoFacturas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosBuscarProductoFacturas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteBuscarProductoFacturas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormBuscarProductoFacturas.jCheckBoxPostAccionNuevoBuscarProductoFacturas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormBuscarProductoFacturas.jCheckBoxPostAccionSinCerrarBuscarProductoFacturas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormBuscarProductoFacturas.jCheckBoxPostAccionSinMensajeBuscarProductoFacturas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosBuscarProductoFacturas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosBuscarProductoFacturas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteBuscarProductoFacturas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
				this.jInternalFrameDetalleFormBuscarProductoFacturas.jCheckBoxPostAccionNuevoBuscarProductoFacturas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormBuscarProductoFacturas.jCheckBoxPostAccionSinCerrarBuscarProductoFacturas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormBuscarProductoFacturas.jCheckBoxPostAccionSinMensajeBuscarProductoFacturas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionBuscarProductoFacturas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionBuscarProductoFacturas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesBuscarProductoFacturas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesBuscarProductoFacturas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesBuscarProductoFacturas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarBuscarProductoFacturas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesBuscarProductoFacturas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesBuscarProductoFacturas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralBuscarProductoFacturas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesBuscarProductoFacturas(Boolean esInicializar) throws Exception {
		try	{	
			if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualBuscarProductoFacturas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesBuscarProductoFacturas() throws Exception {
		try	{
			if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualBuscarProductoFacturas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBuscarProductoFacturas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualBuscarProductoFacturas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesBuscarProductoFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesBuscarProductoFacturas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesBuscarProductoFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesBuscarProductoFacturas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesBuscarProductoFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesBuscarProductoFacturas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionBuscarProductoFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionBuscarProductoFacturas.addItem(reporte);
			}
			
			
			if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionBuscarProductoFacturas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionBuscarProductoFacturas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesBuscarProductoFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesBuscarProductoFacturas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesBuscarProductoFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesBuscarProductoFacturas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarBuscarProductoFacturas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarBuscarProductoFacturas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarBuscarProductoFacturas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBuscarProductoFacturas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBuscarProductoFacturas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas!=null) {
				this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas!=null) {
				this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas!=null) {
				
				if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=BuscarProductoFacturasConstantesFunciones.getTiposSeleccionarBuscarProductoFacturas(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=BuscarProductoFacturasConstantesFunciones.getTiposSeleccionarBuscarProductoFacturas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=BuscarProductoFacturasConstantesFunciones.getTiposSeleccionarBuscarProductoFacturas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualBuscarProductoFacturas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.getSelectedItem()!=null){this.id_productoBusquedaBuscarProductoFacturas=((Producto)this.jComboBoxid_productoBusquedaBuscarProductoFacturasBuscarProductoFacturas.getSelectedItem()).getId();}
		if(this.jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.getSelectedItem()!=null){this.id_clienteBusquedaBuscarProductoFacturas=((Cliente)this.jComboBoxid_clienteBusquedaBuscarProductoFacturasBuscarProductoFacturas.getSelectedItem()).getId();}
		this.numero_pre_impresoBusquedaBuscarProductoFacturas=this.jTextFieldnumero_pre_impresoBusquedaBuscarProductoFacturasBuscarProductoFacturas.getText();
		this.fecha_emision_desdeBusquedaBuscarProductoFacturas=new Date(this.jDateChooserfecha_emision_desdeBusquedaBuscarProductoFacturasBuscarProductoFacturas.getDate().getTime());
		this.fecha_emision_hastaBusquedaBuscarProductoFacturas=new Date(this.jDateChooserfecha_emision_hastaBusquedaBuscarProductoFacturasBuscarProductoFacturas.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasBuscarProductoFacturas(Boolean esInicializar) throws Exception {				
		if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualBuscarProductoFacturas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaBuscarProductoFacturas() throws Exception {
		this.inicializarActualizarBindingTablaBuscarProductoFacturas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByBuscarProductoFacturas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByBuscarProductoFacturas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByBuscarProductoFacturas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBuscarProductoFacturas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByBuscarProductoFacturas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBuscarProductoFacturas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosBuscarProductoFacturasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByBuscarProductoFacturas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBuscarProductoFacturas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByBuscarProductoFacturas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaBuscarProductoFacturas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=buscarproductofacturasLogic.getBuscarProductoFacturass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=buscarproductofacturass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosBuscarProductoFacturas.setModel(new BuscarProductoFacturasModel(this.buscarproductofacturasLogic.getBuscarProductoFacturass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosBuscarProductoFacturas.setModel(new BuscarProductoFacturasModel(this.buscarproductofacturass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByBuscarProductoFacturas!=null && this.jInternalFrameOrderByBuscarProductoFacturas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByBuscarProductoFacturas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO,buscarproductofacturasConstantesFunciones.resaltarSeleccionarBuscarProductoFacturas,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+BuscarProductoFacturasConstantesFunciones.SCLASSWEBTITULO,buscarproductofacturasConstantesFunciones.resaltarSeleccionarBuscarProductoFacturas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,BuscarProductoFacturasConstantesFunciones.LABEL_ID));

		if(this.buscarproductofacturasConstantesFunciones.mostraridBuscarProductoFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BuscarProductoFacturasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.buscarproductofacturasConstantesFunciones.resaltaridBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activaridBuscarProductoFacturas,iSizeTabla,this,true,"idBuscarProductoFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.buscarproductofacturasConstantesFunciones.resaltaridBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activaridBuscarProductoFacturas,this,true,"idBuscarProductoFacturas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR));

		if(this.buscarproductofacturasConstantesFunciones.mostrarnombre_vendedorBuscarProductoFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.buscarproductofacturasConstantesFunciones.resaltarnombre_vendedorBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarnombre_vendedorBuscarProductoFacturas,iSizeTabla,this,true,"nombre_vendedorBuscarProductoFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.buscarproductofacturasConstantesFunciones.resaltarnombre_vendedorBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarnombre_vendedorBuscarProductoFacturas,this,true,"nombre_vendedorBuscarProductoFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.buscarproductofacturasConstantesFunciones.mostrarnombre_completo_clienteBuscarProductoFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.buscarproductofacturasConstantesFunciones.resaltarnombre_completo_clienteBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarnombre_completo_clienteBuscarProductoFacturas,iSizeTabla,this,true,"nombre_completo_clienteBuscarProductoFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.buscarproductofacturasConstantesFunciones.resaltarnombre_completo_clienteBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarnombre_completo_clienteBuscarProductoFacturas,this,true,"nombre_completo_clienteBuscarProductoFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION));

		if(this.buscarproductofacturasConstantesFunciones.mostrarfecha_emisionBuscarProductoFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.buscarproductofacturasConstantesFunciones.resaltarfecha_emisionBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarfecha_emisionBuscarProductoFacturas,iSizeTabla,this,true,"fecha_emisionBuscarProductoFacturas","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.buscarproductofacturasConstantesFunciones.resaltarfecha_emisionBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarfecha_emisionBuscarProductoFacturas,this,true,"fecha_emisionBuscarProductoFacturas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO));

		if(this.buscarproductofacturasConstantesFunciones.mostrarnumero_pre_impreso_datoBuscarProductoFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.buscarproductofacturasConstantesFunciones.resaltarnumero_pre_impreso_datoBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarnumero_pre_impreso_datoBuscarProductoFacturas,iSizeTabla,this,true,"numero_pre_impreso_datoBuscarProductoFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.buscarproductofacturasConstantesFunciones.resaltarnumero_pre_impreso_datoBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarnumero_pre_impreso_datoBuscarProductoFacturas,this,true,"numero_pre_impreso_datoBuscarProductoFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL));

		if(this.buscarproductofacturasConstantesFunciones.mostrartotalBuscarProductoFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.buscarproductofacturasConstantesFunciones.resaltartotalBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activartotalBuscarProductoFacturas,iSizeTabla,this,true,"totalBuscarProductoFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.buscarproductofacturasConstantesFunciones.resaltartotalBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activartotalBuscarProductoFacturas,this,true,"totalBuscarProductoFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.buscarproductofacturasConstantesFunciones.mostrarnombre_unidadBuscarProductoFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.buscarproductofacturasConstantesFunciones.resaltarnombre_unidadBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarnombre_unidadBuscarProductoFacturas,iSizeTabla,this,true,"nombre_unidadBuscarProductoFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.buscarproductofacturasConstantesFunciones.resaltarnombre_unidadBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarnombre_unidadBuscarProductoFacturas,this,true,"nombre_unidadBuscarProductoFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA));

		if(this.buscarproductofacturasConstantesFunciones.mostrarnombre_bodegaBuscarProductoFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.buscarproductofacturasConstantesFunciones.resaltarnombre_bodegaBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarnombre_bodegaBuscarProductoFacturas,iSizeTabla,this,true,"nombre_bodegaBuscarProductoFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.buscarproductofacturasConstantesFunciones.resaltarnombre_bodegaBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarnombre_bodegaBuscarProductoFacturas,this,true,"nombre_bodegaBuscarProductoFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.buscarproductofacturasConstantesFunciones.mostrarnombre_productoBuscarProductoFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.buscarproductofacturasConstantesFunciones.resaltarnombre_productoBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarnombre_productoBuscarProductoFacturas,iSizeTabla,this,true,"nombre_productoBuscarProductoFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.buscarproductofacturasConstantesFunciones.resaltarnombre_productoBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarnombre_productoBuscarProductoFacturas,this,true,"nombre_productoBuscarProductoFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD));

		if(this.buscarproductofacturasConstantesFunciones.mostrarcantidadBuscarProductoFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.buscarproductofacturasConstantesFunciones.resaltarcantidadBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarcantidadBuscarProductoFacturas,iSizeTabla,this,true,"cantidadBuscarProductoFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.buscarproductofacturasConstantesFunciones.resaltarcantidadBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarcantidadBuscarProductoFacturas,this,true,"cantidadBuscarProductoFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO));

		if(this.buscarproductofacturasConstantesFunciones.mostrarprecioBuscarProductoFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.buscarproductofacturasConstantesFunciones.resaltarprecioBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarprecioBuscarProductoFacturas,iSizeTabla,this,true,"precioBuscarProductoFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.buscarproductofacturasConstantesFunciones.resaltarprecioBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activarprecioBuscarProductoFacturas,this,true,"precioBuscarProductoFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO));

		if(this.buscarproductofacturasConstantesFunciones.mostrardescuentoBuscarProductoFacturas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.buscarproductofacturasConstantesFunciones.resaltardescuentoBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activardescuentoBuscarProductoFacturas,iSizeTabla,this,true,"descuentoBuscarProductoFacturas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.buscarproductofacturasConstantesFunciones.resaltardescuentoBuscarProductoFacturas,this.buscarproductofacturasConstantesFunciones.activardescuentoBuscarProductoFacturas,this,true,"descuentoBuscarProductoFacturas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BuscarProductoFacturasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.buscarproductofacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.buscarproductofacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBuscarProductoFacturas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.buscarproductofacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.buscarproductofacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBuscarProductoFacturas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarBuscarProductoFacturas && this.isPermisoGuardarCambiosBuscarProductoFacturas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.buscarproductofacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.buscarproductofacturasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosBuscarProductoFacturas.addColumn(tableColumn);
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
			
			this.jTableDatosBuscarProductoFacturas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBuscarProductoFacturas && this.isPermisoGuardarCambiosBuscarProductoFacturas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBuscarProductoFacturas && this.isPermisoGuardarCambiosBuscarProductoFacturas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosBuscarProductoFacturas.moveColumn(this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosBuscarProductoFacturas.moveColumn(this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosBuscarProductoFacturas.moveColumn(this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosBuscarProductoFacturas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosBuscarProductoFacturas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosBuscarProductoFacturas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosBuscarProductoFacturas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosBuscarProductoFacturas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosBuscarProductoFacturas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=buscarproductofacturasLogic.getBuscarProductoFacturass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=buscarproductofacturass.size()-1;
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
		//this.jTableDatosBuscarProductoFacturas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosBuscarProductoFacturas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosBuscarProductoFacturas();
			
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
				
				//this.isEsNuevoBuscarProductoFacturas=false;
					
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			
				if(this.buscarproductofacturasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormBuscarProductoFacturas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBuscarProductoFacturas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBuscarProductoFacturas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.buscarproductofacturas.getsType().equals("DUPLICADO")
				   || this.buscarproductofacturas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoBuscarProductoFacturas=true;
				
				} else {
					this.isEsNuevoBuscarProductoFacturas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
					if(this.buscarproductofacturas.getId()>=0 && !this.buscarproductofacturas.getIsNew()) {						
						this.isEsNuevoBuscarProductoFacturas=false;
						
					} else {
						this.isEsNuevoBuscarProductoFacturas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoBuscarProductoFacturas(esRelaciones);						
				
				this.seleccionarBuscarProductoFacturas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.buscarproductofacturas.getId()<0) {
					this.isEsNuevoBuscarProductoFacturas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarBuscarProductoFacturas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarBuscarProductoFacturas(evt,rowIndex);
				}	
				
				if(this.buscarproductofacturasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion BuscarProductoFacturas: " + this.dDif); 
					}
				}								
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarBuscarProductoFacturas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.buscarproductofacturas)) {
					if(this.buscarproductofacturas.getId()>0) {
						this.buscarproductofacturas.setIsDeleted(true);
						
						this.buscarproductofacturassEliminados.add(this.buscarproductofacturas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.buscarproductofacturasLogic.getBuscarProductoFacturass().remove(this.buscarproductofacturas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturass.remove(this.buscarproductofacturas);				
					}
					
					
					((BuscarProductoFacturasModel) this.jTableDatosBuscarProductoFacturas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaBuscarProductoFacturas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarBuscarProductoFacturas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoBuscarProductoFacturas) {
			
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBuscarProductoFacturas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBuscarProductoFacturas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioBuscarProductoFacturas(this.buscarproductofacturas);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesBuscarProductoFacturas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesBuscarProductoFacturas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBuscarProductoFacturas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoBuscarProductoFacturas(buscarproductofacturas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioBuscarProductoFacturas(buscarproductofacturas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyBuscarProductoFacturas(buscarproductofacturas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyBuscarProductoFacturas(buscarproductofacturas);
	}
	
	public void setVariablesObjetoActualToFormularioBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelidBuscarProductoFacturas.setText(buscarproductofacturas.getId().toString());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_vendedorBuscarProductoFacturas.setText(buscarproductofacturas.getnombre_vendedor());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_completo_clienteBuscarProductoFacturas.setText(buscarproductofacturas.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emisionBuscarProductoFacturas.setDate(buscarproductofacturas.getfecha_emision());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas.setText(buscarproductofacturas.getnumero_pre_impreso_dato());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldtotalBuscarProductoFacturas.setText(buscarproductofacturas.gettotal().toString());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnombre_unidadBuscarProductoFacturas.setText(buscarproductofacturas.getnombre_unidad());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_bodegaBuscarProductoFacturas.setText(buscarproductofacturas.getnombre_bodega());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_productoBuscarProductoFacturas.setText(buscarproductofacturas.getnombre_producto());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldcantidadBuscarProductoFacturas.setText(buscarproductofacturas.getcantidad().toString());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldprecioBuscarProductoFacturas.setText(buscarproductofacturas.getprecio().toString());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFielddescuentoBuscarProductoFacturas.setText(buscarproductofacturas.getdescuento().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,BuscarProductoFacturas buscarproductofacturasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,buscarproductofacturasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,BuscarProductoFacturas buscarproductofacturasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				buscarproductofacturasLocal=this.buscarproductofacturas;
			} else {
				buscarproductofacturasLocal=this.buscarproductofacturasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(buscarproductofacturasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoBuscarProductoFacturas(buscarproductofacturasLocal,true);
					
					if(buscarproductofacturasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(buscarproductofacturasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(buscarproductofacturasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(buscarproductofacturas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(buscarproductofacturas);
	}
	
	public void setVariablesFormularioToObjetoActualBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(buscarproductofacturas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelidBuscarProductoFacturas.getText()==null || this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelidBuscarProductoFacturas.getText()=="" || this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelidBuscarProductoFacturas.getText()=="Id") {
				this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelidBuscarProductoFacturas.setText("0");
			}

			if(conColumnasBase) {buscarproductofacturas.setId(Long.parseLong(this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelidBuscarProductoFacturas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BuscarProductoFacturasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelIdBuscarProductoFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			buscarproductofacturas.setnombre_vendedor(this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_vendedorBuscarProductoFacturas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnombre_vendedorBuscarProductoFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			buscarproductofacturas.setnombre_completo_cliente(this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_completo_clienteBuscarProductoFacturas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnombre_completo_clienteBuscarProductoFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			buscarproductofacturas.setfecha_emision(this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emisionBuscarProductoFacturas.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelfecha_emisionBuscarProductoFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			buscarproductofacturas.setnumero_pre_impreso_dato(this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnumero_pre_impreso_datoBuscarProductoFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			buscarproductofacturas.settotal(Double.parseDouble(this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldtotalBuscarProductoFacturas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabeltotalBuscarProductoFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			buscarproductofacturas.setnombre_unidad(this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnombre_unidadBuscarProductoFacturas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnombre_unidadBuscarProductoFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			buscarproductofacturas.setnombre_bodega(this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_bodegaBuscarProductoFacturas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnombre_bodegaBuscarProductoFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			buscarproductofacturas.setnombre_producto(this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_productoBuscarProductoFacturas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelnombre_productoBuscarProductoFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			buscarproductofacturas.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldcantidadBuscarProductoFacturas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelcantidadBuscarProductoFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			buscarproductofacturas.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldprecioBuscarProductoFacturas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelprecioBuscarProductoFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			buscarproductofacturas.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFielddescuentoBuscarProductoFacturas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabeldescuentoBuscarProductoFacturas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturasBean,BuscarProductoFacturas buscarproductofacturas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturasOrigen,BuscarProductoFacturas buscarproductofacturas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && buscarproductofacturasOrigen.getId()!=null && !buscarproductofacturasOrigen.getId().equals(0L))) {buscarproductofacturas.setId(buscarproductofacturasOrigen.getId());}}
			if(conDefault || (!conDefault && buscarproductofacturasOrigen.getnumero_pre_impreso()!=null && !buscarproductofacturasOrigen.getnumero_pre_impreso().equals(""))) {buscarproductofacturas.setnumero_pre_impreso(buscarproductofacturasOrigen.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && buscarproductofacturasOrigen.getfecha_emision_desde()!=null && !buscarproductofacturasOrigen.getfecha_emision_desde().equals(new Date()))) {buscarproductofacturas.setfecha_emision_desde(buscarproductofacturasOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && buscarproductofacturasOrigen.getfecha_emision_hasta()!=null && !buscarproductofacturasOrigen.getfecha_emision_hasta().equals(new Date()))) {buscarproductofacturas.setfecha_emision_hasta(buscarproductofacturasOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && buscarproductofacturasOrigen.getnombre_vendedor()!=null && !buscarproductofacturasOrigen.getnombre_vendedor().equals(""))) {buscarproductofacturas.setnombre_vendedor(buscarproductofacturasOrigen.getnombre_vendedor());}
			if(conDefault || (!conDefault && buscarproductofacturasOrigen.getnombre_completo_cliente()!=null && !buscarproductofacturasOrigen.getnombre_completo_cliente().equals(""))) {buscarproductofacturas.setnombre_completo_cliente(buscarproductofacturasOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && buscarproductofacturasOrigen.getfecha_emision()!=null && !buscarproductofacturasOrigen.getfecha_emision().equals(new Date()))) {buscarproductofacturas.setfecha_emision(buscarproductofacturasOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && buscarproductofacturasOrigen.getnumero_pre_impreso_dato()!=null && !buscarproductofacturasOrigen.getnumero_pre_impreso_dato().equals(""))) {buscarproductofacturas.setnumero_pre_impreso_dato(buscarproductofacturasOrigen.getnumero_pre_impreso_dato());}
			if(conDefault || (!conDefault && buscarproductofacturasOrigen.gettotal()!=null && !buscarproductofacturasOrigen.gettotal().equals(0.0))) {buscarproductofacturas.settotal(buscarproductofacturasOrigen.gettotal());}
			if(conDefault || (!conDefault && buscarproductofacturasOrigen.getnombre_unidad()!=null && !buscarproductofacturasOrigen.getnombre_unidad().equals(""))) {buscarproductofacturas.setnombre_unidad(buscarproductofacturasOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && buscarproductofacturasOrigen.getnombre_bodega()!=null && !buscarproductofacturasOrigen.getnombre_bodega().equals(""))) {buscarproductofacturas.setnombre_bodega(buscarproductofacturasOrigen.getnombre_bodega());}
			if(conDefault || (!conDefault && buscarproductofacturasOrigen.getnombre_producto()!=null && !buscarproductofacturasOrigen.getnombre_producto().equals(""))) {buscarproductofacturas.setnombre_producto(buscarproductofacturasOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && buscarproductofacturasOrigen.getcantidad()!=null && !buscarproductofacturasOrigen.getcantidad().equals(0))) {buscarproductofacturas.setcantidad(buscarproductofacturasOrigen.getcantidad());}
			if(conDefault || (!conDefault && buscarproductofacturasOrigen.getprecio()!=null && !buscarproductofacturasOrigen.getprecio().equals(0.0))) {buscarproductofacturas.setprecio(buscarproductofacturasOrigen.getprecio());}
			if(conDefault || (!conDefault && buscarproductofacturasOrigen.getdescuento()!=null && !buscarproductofacturasOrigen.getdescuento().equals(0.0))) {buscarproductofacturas.setdescuento(buscarproductofacturasOrigen.getdescuento());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelidBuscarProductoFacturas.setText(buscarproductofacturas.getId().toString());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_vendedorBuscarProductoFacturas.setText(buscarproductofacturas.getnombre_vendedor());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_completo_clienteBuscarProductoFacturas.setText(buscarproductofacturas.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emisionBuscarProductoFacturas.setDate(buscarproductofacturas.getfecha_emision());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas.setText(buscarproductofacturas.getnumero_pre_impreso_dato());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldtotalBuscarProductoFacturas.setText(buscarproductofacturas.gettotal().toString());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnombre_unidadBuscarProductoFacturas.setText(buscarproductofacturas.getnombre_unidad());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_bodegaBuscarProductoFacturas.setText(buscarproductofacturas.getnombre_bodega());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_productoBuscarProductoFacturas.setText(buscarproductofacturas.getnombre_producto());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldcantidadBuscarProductoFacturas.setText(buscarproductofacturas.getcantidad().toString());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldprecioBuscarProductoFacturas.setText(buscarproductofacturas.getprecio().toString());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFielddescuentoBuscarProductoFacturas.setText(buscarproductofacturas.getdescuento().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBuscarProductoFacturas(BuscarProductoFacturasBean buscarproductofacturasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelidBuscarProductoFacturas.setText(buscarproductofacturasBean.getId().toString());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_vendedorBuscarProductoFacturas.setText(buscarproductofacturasBean.getnombre_vendedor());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_completo_clienteBuscarProductoFacturas.setText(buscarproductofacturasBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emisionBuscarProductoFacturas.setDate(buscarproductofacturasBean.getfecha_emision());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas.setText(buscarproductofacturasBean.getnumero_pre_impreso_dato());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldtotalBuscarProductoFacturas.setText(buscarproductofacturasBean.gettotal().toString());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnombre_unidadBuscarProductoFacturas.setText(buscarproductofacturasBean.getnombre_unidad());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_bodegaBuscarProductoFacturas.setText(buscarproductofacturasBean.getnombre_bodega());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_productoBuscarProductoFacturas.setText(buscarproductofacturasBean.getnombre_producto());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldcantidadBuscarProductoFacturas.setText(buscarproductofacturasBean.getcantidad().toString());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldprecioBuscarProductoFacturas.setText(buscarproductofacturasBean.getprecio().toString());
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFielddescuentoBuscarProductoFacturas.setText(buscarproductofacturasBean.getdescuento().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanBuscarProductoFacturas(BuscarProductoFacturasParameterReturnGeneral buscarproductofacturasReturnGeneral,BuscarProductoFacturasBean buscarproductofacturasBean,Boolean conDefault) throws Exception { 
		try {
			BuscarProductoFacturas buscarproductofacturasLocal=new BuscarProductoFacturas();
			
			buscarproductofacturasLocal=buscarproductofacturasReturnGeneral.getBuscarProductoFacturas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && buscarproductofacturasLocal.getId()!=null && !buscarproductofacturasLocal.getId().equals(0L))) {buscarproductofacturasBean.setId(buscarproductofacturasLocal.getId());}}
			if(conDefault || (!conDefault && buscarproductofacturasLocal.getnombre_vendedor()!=null && !buscarproductofacturasLocal.getnombre_vendedor().equals(""))) {buscarproductofacturasBean.setnombre_vendedor(buscarproductofacturasLocal.getnombre_vendedor());}
			if(conDefault || (!conDefault && buscarproductofacturasLocal.getnombre_completo_cliente()!=null && !buscarproductofacturasLocal.getnombre_completo_cliente().equals(""))) {buscarproductofacturasBean.setnombre_completo_cliente(buscarproductofacturasLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && buscarproductofacturasLocal.getfecha_emision()!=null && !buscarproductofacturasLocal.getfecha_emision().equals(new Date()))) {buscarproductofacturasBean.setfecha_emision(buscarproductofacturasLocal.getfecha_emision());}
			if(conDefault || (!conDefault && buscarproductofacturasLocal.getnumero_pre_impreso_dato()!=null && !buscarproductofacturasLocal.getnumero_pre_impreso_dato().equals(""))) {buscarproductofacturasBean.setnumero_pre_impreso_dato(buscarproductofacturasLocal.getnumero_pre_impreso_dato());}
			if(conDefault || (!conDefault && buscarproductofacturasLocal.gettotal()!=null && !buscarproductofacturasLocal.gettotal().equals(0.0))) {buscarproductofacturasBean.settotal(buscarproductofacturasLocal.gettotal());}
			if(conDefault || (!conDefault && buscarproductofacturasLocal.getnombre_unidad()!=null && !buscarproductofacturasLocal.getnombre_unidad().equals(""))) {buscarproductofacturasBean.setnombre_unidad(buscarproductofacturasLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && buscarproductofacturasLocal.getnombre_bodega()!=null && !buscarproductofacturasLocal.getnombre_bodega().equals(""))) {buscarproductofacturasBean.setnombre_bodega(buscarproductofacturasLocal.getnombre_bodega());}
			if(conDefault || (!conDefault && buscarproductofacturasLocal.getnombre_producto()!=null && !buscarproductofacturasLocal.getnombre_producto().equals(""))) {buscarproductofacturasBean.setnombre_producto(buscarproductofacturasLocal.getnombre_producto());}
			if(conDefault || (!conDefault && buscarproductofacturasLocal.getcantidad()!=null && !buscarproductofacturasLocal.getcantidad().equals(0))) {buscarproductofacturasBean.setcantidad(buscarproductofacturasLocal.getcantidad());}
			if(conDefault || (!conDefault && buscarproductofacturasLocal.getprecio()!=null && !buscarproductofacturasLocal.getprecio().equals(0.0))) {buscarproductofacturasBean.setprecio(buscarproductofacturasLocal.getprecio());}
			if(conDefault || (!conDefault && buscarproductofacturasLocal.getdescuento()!=null && !buscarproductofacturasLocal.getdescuento().equals(0.0))) {buscarproductofacturasBean.setdescuento(buscarproductofacturasLocal.getdescuento());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxBuscarProductoFacturasGenerico(Long idBuscarProductoFacturasSeleccionado,JComboBox jComboBoxBuscarProductoFacturas,List<BuscarProductoFacturas> buscarproductofacturassLocal)throws Exception {
		try {
			BuscarProductoFacturas  buscarproductofacturasTemp=null;

			for(BuscarProductoFacturas buscarproductofacturasAux:buscarproductofacturassLocal) {
				if(buscarproductofacturasAux.getId()!=null && buscarproductofacturasAux.getId().equals(idBuscarProductoFacturasSeleccionado)) {
					buscarproductofacturasTemp=buscarproductofacturasAux;
					break;
				}
			}

			jComboBoxBuscarProductoFacturas.setSelectedItem(buscarproductofacturasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxBuscarProductoFacturasGenerico(JComboBox jComboBoxBuscarProductoFacturas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBuscarProductoFacturas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxBuscarProductoFacturas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBuscarProductoFacturas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxBuscarProductoFacturas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxBuscarProductoFacturas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxBuscarProductoFacturas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			buscarproductofacturas=(BuscarProductoFacturas) buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			buscarproductofacturas =(BuscarProductoFacturas) buscarproductofacturass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!buscarproductofacturas.getIsNew() && !buscarproductofacturas.getIsChanged() && !buscarproductofacturas.getIsDeleted()) {
				sDescripcion=buscarproductofacturas.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=buscarproductofacturas.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!buscarproductofacturas.getIsNew() && !buscarproductofacturas.getIsChanged() && !buscarproductofacturas.getIsDeleted()) {
				sDescripcion=buscarproductofacturas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=buscarproductofacturas.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!buscarproductofacturas.getIsNew() && !buscarproductofacturas.getIsChanged() && !buscarproductofacturas.getIsDeleted()) {
				sDescripcion=buscarproductofacturas.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=buscarproductofacturas.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!buscarproductofacturas.getIsNew() && !buscarproductofacturas.getIsChanged() && !buscarproductofacturas.getIsDeleted()) {
				sDescripcion=buscarproductofacturas.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=buscarproductofacturas.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		BuscarProductoFacturas buscarproductofacturasRow=new BuscarProductoFacturas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			buscarproductofacturasRow=(BuscarProductoFacturas) buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			buscarproductofacturasRow=(BuscarProductoFacturas) buscarproductofacturass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualBuscarProductoFacturas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaNuevoBuscarProductoFacturas && this.isPermisoNuevoBuscarProductoFacturas));			
			this.jButtonDuplicarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaDuplicarBuscarProductoFacturas && this.isPermisoDuplicarBuscarProductoFacturas));			
			this.jButtonCopiarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaCopiarBuscarProductoFacturas && this.isPermisoCopiarBuscarProductoFacturas));
			this.jButtonVerFormBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaVerFormBuscarProductoFacturas && this.isPermisoVerFormBuscarProductoFacturas));
			
			this.jButtonAbrirOrderByBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaOrdenBuscarProductoFacturas && this.isPermisoOrdenBuscarProductoFacturas));			
			
			this.jButtonNuevoRelacionesBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas && this.isPermisoNuevoBuscarProductoFacturas));			
			this.jButtonNuevoGuardarCambiosBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaNuevoBuscarProductoFacturas && this.isPermisoNuevoBuscarProductoFacturas && this.isPermisoGuardarCambiosBuscarProductoFacturas));
			
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonModificarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaModificarBuscarProductoFacturas && this.isPermisoActualizarBuscarProductoFacturas));	
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonActualizarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaActualizarBuscarProductoFacturas && this.isPermisoActualizarBuscarProductoFacturas));	
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonEliminarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaEliminarBuscarProductoFacturas && this.isPermisoEliminarBuscarProductoFacturas));
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonCancelarBuscarProductoFacturas.setVisible(this.isVisibilidadCeldaCancelarBuscarProductoFacturas);							
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonGuardarCambiosBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaGuardarBuscarProductoFacturas && this.isPermisoGuardarCambiosBuscarProductoFacturas));			
			
			}
						
			this.jButtonGuardarCambiosTablaBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas && this.isPermisoGuardarCambiosBuscarProductoFacturas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaNuevoBuscarProductoFacturas && this.isPermisoNuevoBuscarProductoFacturas));						
			this.jButtonDuplicarToolBarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaDuplicarBuscarProductoFacturas && this.isPermisoDuplicarBuscarProductoFacturas));						
			this.jButtonCopiarToolBarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaCopiarBuscarProductoFacturas && this.isPermisoCopiarBuscarProductoFacturas));			
			this.jButtonVerFormToolBarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaVerFormBuscarProductoFacturas && this.isPermisoVerFormBuscarProductoFacturas));			
			this.jButtonAbrirOrderByToolBarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaOrdenBuscarProductoFacturas && this.isPermisoOrdenBuscarProductoFacturas));
			this.jButtonNuevoRelacionesToolBarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas && this.isPermisoNuevoBuscarProductoFacturas));			
			this.jButtonNuevoGuardarCambiosToolBarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaNuevoBuscarProductoFacturas && this.isPermisoNuevoBuscarProductoFacturas && this.isPermisoGuardarCambiosBuscarProductoFacturas));			
			
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonModificarToolBarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaModificarBuscarProductoFacturas && this.isPermisoActualizarBuscarProductoFacturas));	
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonActualizarToolBarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaActualizarBuscarProductoFacturas  && this.isPermisoActualizarBuscarProductoFacturas));	
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonEliminarToolBarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaEliminarBuscarProductoFacturas && this.isPermisoEliminarBuscarProductoFacturas));
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonCancelarToolBarBuscarProductoFacturas.setVisible(this.isVisibilidadCeldaCancelarBuscarProductoFacturas);				
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonGuardarCambiosToolBarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaGuardarBuscarProductoFacturas && this.isPermisoGuardarCambiosBuscarProductoFacturas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas && this.isPermisoGuardarCambiosBuscarProductoFacturas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaNuevoBuscarProductoFacturas && this.isPermisoNuevoBuscarProductoFacturas));			
			this.jMenuItemDuplicarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaDuplicarBuscarProductoFacturas && this.isPermisoDuplicarBuscarProductoFacturas));			
			this.jMenuItemCopiarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaCopiarBuscarProductoFacturas && this.isPermisoCopiarBuscarProductoFacturas));			
			this.jMenuItemVerFormBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaVerFormBuscarProductoFacturas && this.isPermisoVerFormBuscarProductoFacturas));			
			this.jMenuItemAbrirOrderByBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaOrdenBuscarProductoFacturas && this.isPermisoOrdenBuscarProductoFacturas));			
			//this.jMenuItemMostrarOcultarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaOrdenBuscarProductoFacturas && this.isPermisoOrdenBuscarProductoFacturas));
			this.jMenuItemDetalleAbrirOrderByBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaOrdenBuscarProductoFacturas && this.isPermisoOrdenBuscarProductoFacturas));			
			//this.jMenuItemDetalleMostrarOcultarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaOrdenBuscarProductoFacturas && this.isPermisoOrdenBuscarProductoFacturas));			
			this.jMenuItemNuevoRelacionesBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas && this.isPermisoNuevoBuscarProductoFacturas));			
			this.jMenuItemNuevoGuardarCambiosBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaNuevoBuscarProductoFacturas && this.isPermisoNuevoBuscarProductoFacturas && this.isPermisoGuardarCambiosBuscarProductoFacturas));									
			
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemModificarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaModificarBuscarProductoFacturas && this.isPermisoActualizarBuscarProductoFacturas));	
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemActualizarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaActualizarBuscarProductoFacturas && this.isPermisoActualizarBuscarProductoFacturas));	
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemEliminarBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaEliminarBuscarProductoFacturas && this.isPermisoEliminarBuscarProductoFacturas));
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemCancelarBuscarProductoFacturas.setVisible(this.isVisibilidadCeldaCancelarBuscarProductoFacturas);				
			}
			
			this.jMenuItemGuardarCambiosBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaGuardarBuscarProductoFacturas && this.isPermisoGuardarCambiosBuscarProductoFacturas));						
			this.jMenuItemGuardarCambiosTablaBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas && this.isPermisoGuardarCambiosBuscarProductoFacturas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoBuscarProductoFacturas=this.jButtonNuevoBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaDuplicarBuscarProductoFacturas=this.jButtonDuplicarBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaCopiarBuscarProductoFacturas=this.jButtonCopiarBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaVerFormBuscarProductoFacturas=this.jButtonVerFormBuscarProductoFacturas.isVisible();
			
			this.isVisibilidadCeldaOrdenBuscarProductoFacturas=this.jButtonAbrirOrderByBuscarProductoFacturas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=this.jButtonNuevoRelacionesBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaModificarBuscarProductoFacturas=this.jButtonModificarBuscarProductoFacturas.isVisible();
			
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
			this.isVisibilidadCeldaActualizarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonActualizarBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaEliminarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonEliminarBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaCancelarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonCancelarBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaGuardarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonGuardarCambiosBuscarProductoFacturas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas=this.jButtonGuardarCambiosTablaBuscarProductoFacturas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoBuscarProductoFacturas=this.jButtonNuevoToolBarBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=this.jButtonNuevoRelacionesToolBarBuscarProductoFacturas.isVisible();
			
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
			this.isVisibilidadCeldaModificarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonModificarToolBarBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaActualizarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonActualizarToolBarBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaEliminarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonEliminarToolBarBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaCancelarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonCancelarToolBarBuscarProductoFacturas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBuscarProductoFacturas=this.jButtonGuardarCambiosToolBarBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas=this.jButtonGuardarCambiosTablaToolBarBuscarProductoFacturas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoBuscarProductoFacturas=this.jMenuItemNuevoBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=this.jMenuItemNuevoRelacionesBuscarProductoFacturas.isVisible();
			
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
			this.isVisibilidadCeldaModificarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemModificarBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaActualizarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemActualizarBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaEliminarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemEliminarBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaCancelarBuscarProductoFacturas=this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemCancelarBuscarProductoFacturas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBuscarProductoFacturas=this.jMenuItemGuardarCambiosBuscarProductoFacturas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas=this.jMenuItemGuardarCambiosTablaBuscarProductoFacturas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesBuscarProductoFacturas(Boolean esInicializar) {
		if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.buscarproductofacturasSessionBean.getConGuardarRelaciones()) {
				//if(this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesBuscarProductoFacturas();
			}
			
			this.inicializarActualizarBindingBotonesManualBuscarProductoFacturas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualBuscarProductoFacturas() {
		this.jButtonNuevoBuscarProductoFacturas.setVisible(this.isPermisoNuevoBuscarProductoFacturas);			
		this.jButtonDuplicarBuscarProductoFacturas.setVisible(this.isPermisoDuplicarBuscarProductoFacturas);			
		this.jButtonCopiarBuscarProductoFacturas.setVisible(this.isPermisoCopiarBuscarProductoFacturas);			
		this.jButtonVerFormBuscarProductoFacturas.setVisible(this.isPermisoVerFormBuscarProductoFacturas);			
		
		this.jButtonAbrirOrderByBuscarProductoFacturas.setVisible(this.isPermisoOrdenBuscarProductoFacturas);					
		
		this.jButtonNuevoRelacionesBuscarProductoFacturas.setVisible(this.isPermisoNuevoBuscarProductoFacturas);			
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonModificarBuscarProductoFacturas.setVisible(this.isPermisoActualizarBuscarProductoFacturas);	
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonActualizarBuscarProductoFacturas.setVisible(this.isPermisoActualizarBuscarProductoFacturas);	
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonEliminarBuscarProductoFacturas.setVisible(this.isPermisoEliminarBuscarProductoFacturas);
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonCancelarBuscarProductoFacturas.setVisible(this.isVisibilidadCeldaCancelarBuscarProductoFacturas);						
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonGuardarCambiosBuscarProductoFacturas.setVisible(this.isPermisoGuardarCambiosBuscarProductoFacturas);							
		}
		
		this.jButtonGuardarCambiosTablaBuscarProductoFacturas.setVisible(this.isPermisoActualizarBuscarProductoFacturas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleBuscarProductoFacturas() {
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonModificarBuscarProductoFacturas.setVisible(this.isPermisoActualizarBuscarProductoFacturas);	
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonActualizarBuscarProductoFacturas.setVisible(this.isPermisoActualizarBuscarProductoFacturas);	
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonEliminarBuscarProductoFacturas.setVisible(this.isPermisoEliminarBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonCancelarBuscarProductoFacturas.setVisible(this.isVisibilidadCeldaCancelarBuscarProductoFacturas);							
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonGuardarCambiosBuscarProductoFacturas.setVisible((this.isVisibilidadCeldaGuardarBuscarProductoFacturas && this.isPermisoGuardarCambiosBuscarProductoFacturas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosBuscarProductoFacturas() {
		if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualBuscarProductoFacturas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesBuscarProductoFacturas() {
	}
	
	public void jTableDatosBuscarProductoFacturasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarBuscarProductoFacturas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.buscarproductofacturas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoBuscarProductoFacturasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebBuscarProductoFacturas(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBuscarProductoFacturas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBuscarProductoFacturas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.buscarproductofacturasLogic.getConnexion());

				if(this.buscarproductofacturas.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.buscarproductofacturas.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBuscarProductoFacturas=(TitledBorder)this.jScrollPanelDatosBuscarProductoFacturas.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderBuscarProductoFacturas.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.buscarproductofacturas.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaBuscarProductoFacturasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebBuscarProductoFacturas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBuscarProductoFacturas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBuscarProductoFacturas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.buscarproductofacturasLogic.getConnexion());

				if(this.buscarproductofacturas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.buscarproductofacturas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBuscarProductoFacturas=(TitledBorder)this.jScrollPanelDatosBuscarProductoFacturas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderBuscarProductoFacturas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.buscarproductofacturas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalBuscarProductoFacturasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebBuscarProductoFacturas(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBuscarProductoFacturas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBuscarProductoFacturas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.buscarproductofacturasLogic.getConnexion());

				if(this.buscarproductofacturas.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.buscarproductofacturas.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBuscarProductoFacturas=(TitledBorder)this.jScrollPanelDatosBuscarProductoFacturas.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderBuscarProductoFacturas.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.buscarproductofacturas.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteBuscarProductoFacturasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebBuscarProductoFacturas(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBuscarProductoFacturas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBuscarProductoFacturas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.buscarproductofacturasLogic.getConnexion());

				if(this.buscarproductofacturas.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.buscarproductofacturas.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBuscarProductoFacturas=(TitledBorder)this.jScrollPanelDatosBuscarProductoFacturas.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderBuscarProductoFacturas.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.buscarproductofacturas.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impresoBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getnumero_pre_impreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso like '%"+this.buscarproductofacturas.getnumero_pre_impreso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.buscarproductofacturas.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.buscarproductofacturas.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_vendedorBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getnombre_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_vendedor like '%"+this.buscarproductofacturas.getnombre_vendedor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.buscarproductofacturas.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.buscarproductofacturas.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getnumero_pre_impreso_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso_dato like '%"+this.buscarproductofacturas.getnumero_pre_impreso_dato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.buscarproductofacturas.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.buscarproductofacturas.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bodegaBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getnombre_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_bodega like '%"+this.buscarproductofacturas.getnombre_bodega()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.buscarproductofacturas.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.buscarproductofacturas.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.buscarproductofacturas.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoBuscarProductoFacturasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.getbuscarproductofacturas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.buscarproductofacturas==null) {
						this.buscarproductofacturas = new BuscarProductoFacturas();
					}

					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);
				}

				if(this.buscarproductofacturas.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.buscarproductofacturas.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBuscarProductoFacturas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaBuscarProductoFacturasBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBuscarProductoFacturas(false,false);

			this.getBuscarProductoFacturassBusquedaBuscarProductoFacturas();

			this.inicializarActualizarBindingBuscarProductoFacturas(false);

			//if(BuscarProductoFacturasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBuscarProductoFacturas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBuscarProductoFacturas(false,false);

			this.getBuscarProductoFacturassFK_IdCliente();

			this.inicializarActualizarBindingBuscarProductoFacturas(false);

			//if(BuscarProductoFacturasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBuscarProductoFacturas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBuscarProductoFacturas(false,false);

			this.getBuscarProductoFacturassFK_IdEmpresa();

			this.inicializarActualizarBindingBuscarProductoFacturas(false);

			//if(BuscarProductoFacturasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBuscarProductoFacturas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBuscarProductoFacturas(false,false);

			this.getBuscarProductoFacturassFK_IdProducto();

			this.inicializarActualizarBindingBuscarProductoFacturas(false);

			//if(BuscarProductoFacturasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBuscarProductoFacturas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalBuscarProductoFacturasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBuscarProductoFacturas(false,false);

			this.getBuscarProductoFacturassFK_IdSucursal();

			this.inicializarActualizarBindingBuscarProductoFacturas(false);

			//if(BuscarProductoFacturasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBuscarProductoFacturas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.buscarproductofacturasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameBuscarProductoFacturas() {
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.setVisible(false);	    			
			this.jInternalFrameDetalleFormBuscarProductoFacturas.dispose();
			this.jInternalFrameDetalleFormBuscarProductoFacturas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas!=null) {
			this.jInternalFrameReporteDinamicoBuscarProductoFacturas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoBuscarProductoFacturas.dispose();
			this.jInternalFrameReporteDinamicoBuscarProductoFacturas=null;
		}
		
		if(this.jInternalFrameImportacionBuscarProductoFacturas!=null) {
			this.jInternalFrameImportacionBuscarProductoFacturas.setVisible(false);	    			
			this.jInternalFrameImportacionBuscarProductoFacturas.dispose();
			this.jInternalFrameImportacionBuscarProductoFacturas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessBuscarProductoFacturas();
			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			
			
			if(sTipo.equals("NuevoBuscarProductoFacturas")) {
				jButtonNuevoBuscarProductoFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarBuscarProductoFacturas")) {
				jButtonDuplicarBuscarProductoFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarBuscarProductoFacturas")) {
				jButtonCopiarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("VerFormBuscarProductoFacturas")) {
				jButtonVerFormBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarBuscarProductoFacturas")) {
				jButtonNuevoBuscarProductoFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarBuscarProductoFacturas")) {
				jButtonDuplicarBuscarProductoFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoBuscarProductoFacturas")) {
				jButtonNuevoBuscarProductoFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarBuscarProductoFacturas")) {
				jButtonDuplicarBuscarProductoFacturasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesBuscarProductoFacturas")) {
				jButtonNuevoBuscarProductoFacturasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarBuscarProductoFacturas")) {
				jButtonNuevoBuscarProductoFacturasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesBuscarProductoFacturas")) {
				jButtonNuevoBuscarProductoFacturasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarBuscarProductoFacturas")) {
				jButtonModificarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarBuscarProductoFacturas")) {
				jButtonModificarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarBuscarProductoFacturas")) {
				jButtonModificarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarBuscarProductoFacturas")) {
				jButtonActualizarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarBuscarProductoFacturas")) {
				jButtonActualizarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarBuscarProductoFacturas")) {
				jButtonActualizarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("EliminarBuscarProductoFacturas")) {
				jButtonEliminarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarBuscarProductoFacturas")) {
				jButtonEliminarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarBuscarProductoFacturas")) {
				jButtonEliminarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("CancelarBuscarProductoFacturas")) {
				jButtonCancelarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarBuscarProductoFacturas")) {
				jButtonCancelarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarBuscarProductoFacturas")) {
				jButtonCancelarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("CerrarBuscarProductoFacturas")) {
				jButtonCerrarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarBuscarProductoFacturas")) {
				jButtonCerrarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarBuscarProductoFacturas")) {
				jButtonCerrarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarBuscarProductoFacturas")) {
				jButtonMostrarOcultarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarBuscarProductoFacturas")) {
				jButtonCancelarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosBuscarProductoFacturas")) {
				jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarBuscarProductoFacturas")) {
				jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarBuscarProductoFacturas")) {
				jButtonCopiarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarBuscarProductoFacturas")) {
				jButtonVerFormBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosBuscarProductoFacturas")) {
				jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarBuscarProductoFacturas")) {
				jButtonCopiarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormBuscarProductoFacturas")) {
				jButtonVerFormBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaBuscarProductoFacturas")) {
				jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarBuscarProductoFacturas")) {
				jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaBuscarProductoFacturas")) {
				jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionBuscarProductoFacturas")) {
				jButtonRecargarInformacionBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarBuscarProductoFacturas")) {
				jButtonRecargarInformacionBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionBuscarProductoFacturas")) {
				jButtonRecargarInformacionBuscarProductoFacturasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresBuscarProductoFacturas")) {
				jButtonAnterioresBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarBuscarProductoFacturas")) {
				jButtonAnterioresBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreBuscarProductoFacturas")) {
				jButtonAnterioresBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesBuscarProductoFacturas")) {
				jButtonSiguientesBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarBuscarProductoFacturas")) {
				jButtonSiguientesBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesBuscarProductoFacturas")) {
				jButtonSiguientesBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByBuscarProductoFacturas") || sTipo.equals("MenuItemDetalleAbrirOrderByBuscarProductoFacturas")) {
				jButtonAbrirOrderByBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarBuscarProductoFacturas") || sTipo.equals("MenuItemDetalleMostrarOcultarBuscarProductoFacturas")) {
				jButtonMostrarOcultarBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosBuscarProductoFacturas")) {
				jButtonNuevoGuardarCambiosBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarBuscarProductoFacturas")) {
				jButtonNuevoGuardarCambiosBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosBuscarProductoFacturas")) {
				jButtonNuevoGuardarCambiosBuscarProductoFacturasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoBuscarProductoFacturas")) {
				jButtonCerrarReporteDinamicoBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoBuscarProductoFacturas")) {
				jButtonGenerarReporteDinamicoBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoBuscarProductoFacturas")) {
				
				jButtonGenerarExcelReporteDinamicoBuscarProductoFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionBuscarProductoFacturas")) {
				jButtonCerrarImportacionBuscarProductoFacturasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionBuscarProductoFacturas")) {
				
				jButtonGenerarImportacionBuscarProductoFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionBuscarProductoFacturas")) {
				
				jButtonAbrirImportacionBuscarProductoFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesBuscarProductoFacturas")) {
				jComboBoxTiposAccionesBuscarProductoFacturasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesBuscarProductoFacturas")) {
				jComboBoxTiposRelacionesBuscarProductoFacturasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioBuscarProductoFacturas")) {
				jComboBoxTiposAccionesBuscarProductoFacturasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarBuscarProductoFacturas")) {
				
				jComboBoxTiposSeleccionarBuscarProductoFacturasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralBuscarProductoFacturas")) {
				jTextFieldValorCampoGeneralBuscarProductoFacturasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByBuscarProductoFacturas")) {
				jButtonAbrirOrderByBuscarProductoFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarBuscarProductoFacturas")) {
				jButtonAbrirOrderByBuscarProductoFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByBuscarProductoFacturas")) {
				jButtonCerrarOrderByBuscarProductoFacturasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBuscarProductoFacturasBusqueda")) {
				this.jButtonidBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoBuscarProductoFacturasUpdate")) {
				this.jButtonid_productoBuscarProductoFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoBuscarProductoFacturasBusqueda")) {
				this.jButtonid_productoBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBuscarProductoFacturasUpdate")) {
				this.jButtonid_empresaBuscarProductoFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBuscarProductoFacturasBusqueda")) {
				this.jButtonid_empresaBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalBuscarProductoFacturasUpdate")) {
				this.jButtonid_sucursalBuscarProductoFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalBuscarProductoFacturasBusqueda")) {
				this.jButtonid_sucursalBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteBuscarProductoFacturasUpdate")) {
				this.jButtonid_clienteBuscarProductoFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteBuscarProductoFacturasBusqueda")) {
				this.jButtonid_clienteBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoBuscarProductoFacturasBusqueda")) {
				this.jButtonnumero_pre_impresoBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeBuscarProductoFacturasBusqueda")) {
				this.jButtonfecha_emision_desdeBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaBuscarProductoFacturasBusqueda")) {
				this.jButtonfecha_emision_hastaBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorBuscarProductoFacturasBusqueda")) {
				this.jButtonnombre_vendedorBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteBuscarProductoFacturasBusqueda")) {
				this.jButtonnombre_completo_clienteBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionBuscarProductoFacturasBusqueda")) {
				this.jButtonfecha_emisionBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_datoBuscarProductoFacturasBusqueda")) {
				this.jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalBuscarProductoFacturasBusqueda")) {
				this.jButtontotalBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadBuscarProductoFacturasBusqueda")) {
				this.jButtonnombre_unidadBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaBuscarProductoFacturasBusqueda")) {
				this.jButtonnombre_bodegaBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoBuscarProductoFacturasBusqueda")) {
				this.jButtonnombre_productoBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadBuscarProductoFacturasBusqueda")) {
				this.jButtoncantidadBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioBuscarProductoFacturasBusqueda")) {
				this.jButtonprecioBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoBuscarProductoFacturasBusqueda")) {
				this.jButtondescuentoBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaBuscarProductoFacturasBuscarProductoFacturas")) {
				this.jButtonBusquedaBuscarProductoFacturasBuscarProductoFacturasActionPerformed(evt);
			}
			
			;
			
			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessBuscarProductoFacturas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBuscarProductoFacturasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.buscarproductofacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
				


				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BuscarProductoFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BuscarProductoFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			BuscarProductoFacturas buscarproductofacturasLocal=null;
			
			if(!this.getEsControlTabla()) {
				buscarproductofacturasLocal=this.buscarproductofacturas;
			} else {
				buscarproductofacturasLocal=this.buscarproductofacturasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.buscarproductofacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
							
				
				


				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BuscarProductoFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BuscarProductoFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBuscarProductoFacturasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasAnterior =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.buscarproductofacturasAnterior =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
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
			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			
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
			
			


			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBuscarProductoFacturasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.buscarproductofacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
								
						
				


				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BuscarProductoFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BuscarProductoFacturas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.buscarproductofacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
								
				
				


				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BuscarProductoFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BuscarProductoFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBuscarProductoFacturasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasAnterior =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.buscarproductofacturasAnterior =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.buscarproductofacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBuscarProductoFacturasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasAnterior =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.buscarproductofacturasAnterior =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBuscarProductoFacturasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.buscarproductofacturas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.buscarproductofacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
							
				
				


				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BuscarProductoFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BuscarProductoFacturas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBuscarProductoFacturasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturasAnterior =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.buscarproductofacturasAnterior =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
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
			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			
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
			
			


			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBuscarProductoFacturasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.buscarproductofacturas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.buscarproductofacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
								
				
				


				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BuscarProductoFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BuscarProductoFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBuscarProductoFacturasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasAnterior =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.buscarproductofacturasAnterior =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBuscarProductoFacturasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.buscarproductofacturas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBuscarProductoFacturasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.buscarproductofacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosBuscarProductoFacturas")) {
					jCheckBoxSeleccionarTodosBuscarProductoFacturasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosBuscarProductoFacturas")) {
					jCheckBoxSeleccionadosBuscarProductoFacturasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarBuscarProductoFacturas")) {
					
				}
				
				


				
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BuscarProductoFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BuscarProductoFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.buscarproductofacturas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
												
				
				


				
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BuscarProductoFacturas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BuscarProductoFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBuscarProductoFacturasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.buscarproductofacturasAnterior =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.buscarproductofacturasAnterior =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBuscarProductoFacturasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.buscarproductofacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
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
			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
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
			
			


			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBuscarProductoFacturasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.buscarproductofacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BuscarProductoFacturas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BuscarProductoFacturas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.buscarproductofacturas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.buscarproductofacturas);
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
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
				
				


				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BuscarProductoFacturas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BuscarProductoFacturas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBuscarProductoFacturasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.buscarproductofacturasAnterior =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.buscarproductofacturasAnterior =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarBuscarProductoFacturas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosBuscarProductoFacturasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosBuscarProductoFacturas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.buscarproductofacturas =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.buscarproductofacturas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarBuscarProductoFacturas")) {
				
				}
				
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarBuscarProductoFacturas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosBuscarProductoFacturas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarBuscarProductoFacturas")) {
			
			}
			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessBuscarProductoFacturas();
			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			
			if(sTipo.equals("NuevoBuscarProductoFacturas")) {
				jButtonNuevoBuscarProductoFacturasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarBuscarProductoFacturas")) {
				jButtonDuplicarBuscarProductoFacturasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarBuscarProductoFacturas")) {
				jButtonCopiarBuscarProductoFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormBuscarProductoFacturas")) {
				jButtonVerFormBuscarProductoFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesBuscarProductoFacturas")) {
				jButtonNuevoBuscarProductoFacturasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarBuscarProductoFacturas")) {
				jButtonModificarBuscarProductoFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarBuscarProductoFacturas")) {
				jButtonActualizarBuscarProductoFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarBuscarProductoFacturas")) {
				jButtonEliminarBuscarProductoFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaBuscarProductoFacturas")) {
				jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarBuscarProductoFacturas")) {
				jButtonCancelarBuscarProductoFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarBuscarProductoFacturas")) {
				jButtonCerrarBuscarProductoFacturasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosBuscarProductoFacturas")) {
				jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosBuscarProductoFacturas")) {
				jButtonNuevoGuardarCambiosBuscarProductoFacturasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByBuscarProductoFacturas")) {
				jButtonAbrirOrderByBuscarProductoFacturasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionBuscarProductoFacturas")) {
				jButtonRecargarInformacionBuscarProductoFacturasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresBuscarProductoFacturas")) {
				jButtonAnterioresBuscarProductoFacturasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesBuscarProductoFacturas")) {
				jButtonSiguientesBuscarProductoFacturasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBuscarProductoFacturasBusqueda")) {
				this.jButtonidBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoBuscarProductoFacturasUpdate")) {
				this.jButtonid_productoBuscarProductoFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoBuscarProductoFacturasBusqueda")) {
				this.jButtonid_productoBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBuscarProductoFacturasUpdate")) {
				this.jButtonid_empresaBuscarProductoFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBuscarProductoFacturasBusqueda")) {
				this.jButtonid_empresaBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalBuscarProductoFacturasUpdate")) {
				this.jButtonid_sucursalBuscarProductoFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalBuscarProductoFacturasBusqueda")) {
				this.jButtonid_sucursalBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteBuscarProductoFacturasUpdate")) {
				this.jButtonid_clienteBuscarProductoFacturasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteBuscarProductoFacturasBusqueda")) {
				this.jButtonid_clienteBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoBuscarProductoFacturasBusqueda")) {
				this.jButtonnumero_pre_impresoBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeBuscarProductoFacturasBusqueda")) {
				this.jButtonfecha_emision_desdeBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaBuscarProductoFacturasBusqueda")) {
				this.jButtonfecha_emision_hastaBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorBuscarProductoFacturasBusqueda")) {
				this.jButtonnombre_vendedorBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteBuscarProductoFacturasBusqueda")) {
				this.jButtonnombre_completo_clienteBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionBuscarProductoFacturasBusqueda")) {
				this.jButtonfecha_emisionBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impreso_datoBuscarProductoFacturasBusqueda")) {
				this.jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalBuscarProductoFacturasBusqueda")) {
				this.jButtontotalBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadBuscarProductoFacturasBusqueda")) {
				this.jButtonnombre_unidadBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bodegaBuscarProductoFacturasBusqueda")) {
				this.jButtonnombre_bodegaBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoBuscarProductoFacturasBusqueda")) {
				this.jButtonnombre_productoBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadBuscarProductoFacturasBusqueda")) {
				this.jButtoncantidadBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioBuscarProductoFacturasBusqueda")) {
				this.jButtonprecioBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoBuscarProductoFacturasBusqueda")) {
				this.jButtondescuentoBuscarProductoFacturasBusquedaActionPerformed(evt);
			}
			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessBuscarProductoFacturas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameBuscarProductoFacturas")) {
				closingInternalFrameBuscarProductoFacturas();
				
			} else if(sTipo.equals("jButtonCancelarBuscarProductoFacturas")) {
				JInternalFrameBase jInternalFrameDetalleFormBuscarProductoFacturas = (JInternalFrameBase)evt.getSource();
	            	
	            BuscarProductoFacturasBeanSwingJInternalFrame jInternalFrameParent=(BuscarProductoFacturasBeanSwingJInternalFrame)jInternalFrameDetalleFormBuscarProductoFacturas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarBuscarProductoFacturasActionPerformed(null);
			}
			
			BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.buscarproductofacturas,new Object(),this.buscarproductofacturasParameterGeneral,this.buscarproductofacturasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormBuscarProductoFacturas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormBuscarProductoFacturas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormBuscarProductoFacturas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.buscarproductofacturas)) {
			if(!esControlTabla) {
				if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);			
				}
				
				if(this.buscarproductofacturasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanBuscarProductoFacturas(this.buscarproductofacturasReturnGeneral,this.buscarproductofacturasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.buscarproductofacturasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanBuscarProductoFacturas(classes,this.buscarproductofacturasReturnGeneral,this.buscarproductofacturasBean,false);
					}
						
					if(this.buscarproductofacturasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyBuscarProductoFacturas(this.buscarproductofacturasReturnGeneral.getBuscarProductoFacturas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioBuscarProductoFacturas(this.buscarproductofacturasReturnGeneral.getBuscarProductoFacturas());	
					}
						
					if(this.buscarproductofacturasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioBuscarProductoFacturas(this.buscarproductofacturasReturnGeneral.getBuscarProductoFacturas(),classes);//this.buscarproductofacturasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioBuscarProductoFacturas(this.buscarproductofacturas,classes);//this.buscarproductofacturasBean);									
				}
			
				if(BuscarProductoFacturasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualBuscarProductoFacturas(this.buscarproductofacturas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBuscarProductoFacturas(this.buscarproductofacturas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.buscarproductofacturasAnterior!=null) {
						this.buscarproductofacturas=this.buscarproductofacturasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.buscarproductofacturasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.buscarproductofacturasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.buscarproductofacturasReturnGeneral.getBuscarProductoFacturas(),buscarproductofacturasLogic.getBuscarProductoFacturass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.buscarproductofacturasReturnGeneral.getBuscarProductoFacturas(),this.buscarproductofacturass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosBuscarProductoFacturas.repaint();
				
				//((AbstractTableModel) this.jTableDatosBuscarProductoFacturas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosBuscarProductoFacturas();
			}
		}
	}
	
	public void actualizarVisualTableDatosBuscarProductoFacturas() throws Exception {
		
		BuscarProductoFacturasModel buscarproductofacturasModel=(BuscarProductoFacturasModel)this.jTableDatosBuscarProductoFacturas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			buscarproductofacturasModel.buscarproductofacturass=this.buscarproductofacturasLogic.getBuscarProductoFacturass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			buscarproductofacturasModel.buscarproductofacturass=this.buscarproductofacturass;
		}
		
		
		((BuscarProductoFacturasModel) this.jTableDatosBuscarProductoFacturas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaBuscarProductoFacturas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getbuscarproductofacturasAnterior(),this.buscarproductofacturasLogic.getBuscarProductoFacturass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getbuscarproductofacturasAnterior(),this.buscarproductofacturass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosBuscarProductoFacturas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
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
										
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.buscarproductofacturas,new Object(),generalEntityParameterGeneral,this.buscarproductofacturasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.buscarproductofacturasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=BuscarProductoFacturasConstantesFunciones.getClassesRelationshipsOfBuscarProductoFacturas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=BuscarProductoFacturasConstantesFunciones.getClassesRelationshipsFromStringsOfBuscarProductoFacturas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormBuscarProductoFacturas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				BuscarProductoFacturasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.buscarproductofacturas,new Object(),generalEntityParameterGeneral,this.buscarproductofacturasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioBuscarProductoFacturas(BuscarProductoFacturasBean buscarproductofacturasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanBuscarProductoFacturas(ArrayList<Classe> classes,BuscarProductoFacturasReturnGeneral buscarproductofacturasReturnGeneral,BuscarProductoFacturasBean buscarproductofacturasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.buscarproductofacturas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas = new BuscarProductoFacturasDetalleFormJInternalFrame(jDesktopPane,this.buscarproductofacturasSessionBean.getConGuardarRelaciones(),this.buscarproductofacturasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.setVisible(false);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.setSelected(false);						
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.buscarproductofacturasLogic=this.buscarproductofacturasLogic;
		
		this.cargarCombosFrameForeignKeyBuscarProductoFacturas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleBuscarProductoFacturas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBuscarProductoFacturas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyBuscarProductoFacturas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyBuscarProductoFacturas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBuscarProductoFacturas"));
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonModificarBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"ModificarBuscarProductoFacturas"));

		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonModificarToolBarBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"ModificarToolBarBuscarProductoFacturas"));
					
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemModificarBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"MenuItemModificarBuscarProductoFacturas"));		
		
		
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonActualizarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"ActualizarBuscarProductoFacturas"));
		
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonActualizarToolBarBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBuscarProductoFacturas"));
						
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemActualizarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBuscarProductoFacturas"));		
		
		
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonEliminarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"EliminarBuscarProductoFacturas"));
		
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonEliminarToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"EliminarToolBarBuscarProductoFacturas"));
								
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemEliminarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBuscarProductoFacturas"));		
		
		
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonCancelarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"CancelarBuscarProductoFacturas"));
		
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonCancelarToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"CancelarToolBarBuscarProductoFacturas"));
					
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemCancelarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBuscarProductoFacturas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemDetalleCerrarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBuscarProductoFacturas"));		
		
		
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonGuardarCambiosToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBuscarProductoFacturas"));
		
		
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonGuardarCambiosToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBuscarProductoFacturas"));
		
		
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBuscarProductoFacturas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonidBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"idBuscarProductoFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_productoBuscarProductoFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_productoBuscarProductoFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_productoBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoBuscarProductoFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_empresaBuscarProductoFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBuscarProductoFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_empresaBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBuscarProductoFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_sucursalBuscarProductoFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalBuscarProductoFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_sucursalBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalBuscarProductoFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_clienteBuscarProductoFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_clienteBuscarProductoFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_clienteBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnumero_pre_impresoBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonfecha_emision_desdeBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonfecha_emision_hastaBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnombre_vendedorBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnombre_completo_clienteBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonfecha_emisionBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_datoBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtontotalBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"totalBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnombre_unidadBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnombre_bodegaBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnombre_productoBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtoncantidadBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"cantidadBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonprecioBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"precioBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtondescuentoBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"descuentoBuscarProductoFacturasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTabbedPaneRelacionesBuscarProductoFacturas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBuscarProductoFacturas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameBuscarProductoFacturas"));
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBuscarProductoFacturas"));
		}
		
		this.jTableDatosBuscarProductoFacturas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarBuscarProductoFacturas"));
		
		this.jTableDatosBuscarProductoFacturas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarBuscarProductoFacturas"));
		
		this.jButtonNuevoBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"NuevoBuscarProductoFacturas"));
		
		this.jButtonDuplicarBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"DuplicarBuscarProductoFacturas"));
		
		this.jButtonCopiarBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"CopiarBuscarProductoFacturas"));
		
		this.jButtonVerFormBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"VerFormBuscarProductoFacturas"));
		
		
		this.jButtonNuevoToolBarBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"NuevoToolBarBuscarProductoFacturas"));
			
		this.jButtonDuplicarToolBarBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarBuscarProductoFacturas"));
			
		this.jMenuItemNuevoBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoBuscarProductoFacturas"));
			
		this.jMenuItemDuplicarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarBuscarProductoFacturas"));		
		
		
		this.jButtonNuevoRelacionesBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesBuscarProductoFacturas"));
		
		
		this.jButtonNuevoRelacionesToolBarBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarBuscarProductoFacturas"));
			
		this.jMenuItemNuevoRelacionesBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesBuscarProductoFacturas"));		
		
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonModificarBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"ModificarBuscarProductoFacturas"));
		}
		
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonModificarToolBarBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"ModificarToolBarBuscarProductoFacturas"));
			
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemModificarBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"MenuItemModificarBuscarProductoFacturas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonActualizarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"ActualizarBuscarProductoFacturas"));
		}
		
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonActualizarToolBarBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBuscarProductoFacturas"));
				
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemActualizarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBuscarProductoFacturas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonEliminarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"EliminarBuscarProductoFacturas"));
		}
		
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonEliminarToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"EliminarToolBarBuscarProductoFacturas"));
						
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemEliminarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBuscarProductoFacturas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonCancelarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"CancelarBuscarProductoFacturas"));
		}
		
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonCancelarToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"CancelarToolBarBuscarProductoFacturas"));
			
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemCancelarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBuscarProductoFacturas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarBuscarProductoFacturas"));		
		
		
		this.jButtonCerrarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"CerrarBuscarProductoFacturas"));
		
		
		this.jButtonCerrarToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"CerrarToolBarBuscarProductoFacturas"));
			
		this.jMenuItemCerrarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarBuscarProductoFacturas"));
			
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jMenuItemDetalleCerrarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBuscarProductoFacturas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonGuardarCambiosBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosBuscarProductoFacturas"));
		}
		
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonGuardarCambiosToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBuscarProductoFacturas"));
		}
		
		this.jButtonCopiarToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"CopiarToolBarBuscarProductoFacturas"));
			
		this.jButtonVerFormToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"VerFormToolBarBuscarProductoFacturas"));
		
		this.jMenuItemGuardarCambiosBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosBuscarProductoFacturas"));
			
		this.jMenuItemCopiarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarBuscarProductoFacturas"));		
		
		this.jMenuItemVerFormBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormBuscarProductoFacturas"));		
		
		
		this.jButtonGuardarCambiosTablaBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBuscarProductoFacturas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarBuscarProductoFacturas"));
			
		this.jMenuItemGuardarCambiosTablaBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBuscarProductoFacturas"));		
		
		
		
		this.jButtonRecargarInformacionBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"RecargarInformacionBuscarProductoFacturas"));
					
		this.jButtonRecargarInformacionToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarBuscarProductoFacturas"));
		
		this.jMenuItemRecargarInformacionBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionBuscarProductoFacturas"));		
		
		
		
		this.jButtonAnterioresBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"AnterioresBuscarProductoFacturas"));
		
		
		this.jButtonAnterioresToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarBuscarProductoFacturas"));
		
		this.jMenuItemAnterioresBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresBuscarProductoFacturas"));		
		
		
		this.jButtonSiguientesBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"SiguientesBuscarProductoFacturas"));
		
		
		this.jButtonSiguientesToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarBuscarProductoFacturas"));
			
		this.jMenuItemSiguientesBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesBuscarProductoFacturas"));
			
		this.jMenuItemAbrirOrderByBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByBuscarProductoFacturas"));
			
		this.jMenuItemMostrarOcultarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarBuscarProductoFacturas"));
			
		this.jMenuItemDetalleAbrirOrderByBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByBuscarProductoFacturas"));
			
		this.jMenuItemDetalleMostarOcultarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarBuscarProductoFacturas"));		
		
		
		this.jButtonNuevoGuardarCambiosBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosBuscarProductoFacturas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarBuscarProductoFacturas"));
			
		this.jMenuItemNuevoGuardarCambiosBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosBuscarProductoFacturas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosBuscarProductoFacturas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosBuscarProductoFacturas"));

		this.jCheckBoxSeleccionadosBuscarProductoFacturas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosBuscarProductoFacturas"));
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBuscarProductoFacturas"));
		}
		
		
		this.jComboBoxTiposRelacionesBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"TiposRelacionesBuscarProductoFacturas"));
			
		this.jComboBoxTiposAccionesBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"TiposAccionesBuscarProductoFacturas"));
					
		this.jComboBoxTiposSeleccionarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarBuscarProductoFacturas"));
			
		this.jTextFieldValorCampoGeneralBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralBuscarProductoFacturas"));		
		
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonidBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"idBuscarProductoFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_productoBuscarProductoFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_productoBuscarProductoFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_productoBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoBuscarProductoFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_empresaBuscarProductoFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBuscarProductoFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_empresaBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBuscarProductoFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_sucursalBuscarProductoFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalBuscarProductoFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_sucursalBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalBuscarProductoFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_clienteBuscarProductoFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_clienteBuscarProductoFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_clienteBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnumero_pre_impresoBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonfecha_emision_desdeBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonfecha_emision_hastaBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnombre_vendedorBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnombre_completo_clienteBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonfecha_emisionBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_datoBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtontotalBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"totalBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnombre_unidadBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnombre_bodegaBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnombre_productoBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtoncantidadBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"cantidadBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonprecioBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"precioBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtondescuentoBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"descuentoBuscarProductoFacturasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaBuscarProductoFacturasBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"BusquedaBuscarProductoFacturasBuscarProductoFacturas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoBuscarProductoFacturas!=null) {
				this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBuscarProductoFacturas"));
				this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBuscarProductoFacturas"));
				this.jInternalFrameReporteDinamicoBuscarProductoFacturas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBuscarProductoFacturas"));
			}
			
			//this.jButtonCerrarReporteDinamicoBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBuscarProductoFacturas"));				
			//this.jButtonGenerarReporteDinamicoBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBuscarProductoFacturas"));
			//this.jButtonGenerarExcelReporteDinamicoBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBuscarProductoFacturas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionBuscarProductoFacturas!=null) {
				this.jInternalFrameImportacionBuscarProductoFacturas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBuscarProductoFacturas"));
				this.jInternalFrameImportacionBuscarProductoFacturas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBuscarProductoFacturas"));
				this.jInternalFrameImportacionBuscarProductoFacturas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBuscarProductoFacturas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"AbrirOrderByBuscarProductoFacturas"));
			
			this.jButtonAbrirOrderByToolBarBuscarProductoFacturas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarBuscarProductoFacturas"));			
			
			if(this.jInternalFrameOrderByBuscarProductoFacturas!=null) {
				this.jInternalFrameOrderByBuscarProductoFacturas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBuscarProductoFacturas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBuscarProductoFacturas.jTabbedPaneRelacionesBuscarProductoFacturas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBuscarProductoFacturas"));
		
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
            		closingInternalFrameBuscarProductoFacturas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormBuscarProductoFacturas = (JInternalFrameBase)event.getSource();
	            	
	            BuscarProductoFacturasBeanSwingJInternalFrame jInternalFrameParent=(BuscarProductoFacturasBeanSwingJInternalFrame)jInternalFrameDetalleFormBuscarProductoFacturas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarBuscarProductoFacturasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosBuscarProductoFacturas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosBuscarProductoFacturasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosBuscarProductoFacturas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosBuscarProductoFacturas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBuscarProductoFacturasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBuscarProductoFacturasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBuscarProductoFacturasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoBuscarProductoFacturas";
		inputMap = this.jButtonNuevoBuscarProductoFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoBuscarProductoFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBuscarProductoFacturasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBuscarProductoFacturasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBuscarProductoFacturasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBuscarProductoFacturasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesBuscarProductoFacturas";
		inputMap = this.jButtonNuevoRelacionesBuscarProductoFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesBuscarProductoFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBuscarProductoFacturasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarBuscarProductoFacturas";
		inputMap = this.jButtonModificarBuscarProductoFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarBuscarProductoFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarBuscarProductoFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarBuscarProductoFacturas";
		inputMap = this.jButtonActualizarBuscarProductoFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarBuscarProductoFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarBuscarProductoFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarBuscarProductoFacturas";
		inputMap = this.jButtonEliminarBuscarProductoFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarBuscarProductoFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarBuscarProductoFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarBuscarProductoFacturas";
		inputMap = this.jButtonCancelarBuscarProductoFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarBuscarProductoFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarBuscarProductoFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarBuscarProductoFacturas";
		inputMap = this.jButtonCerrarBuscarProductoFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarBuscarProductoFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarBuscarProductoFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonGuardarCambiosBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosBuscarProductoFacturas";
		inputMap = this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonGuardarCambiosBuscarProductoFacturas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonGuardarCambiosBuscarProductoFacturas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosBuscarProductoFacturasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosBuscarProductoFacturas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosBuscarProductoFacturasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesBuscarProductoFacturas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesBuscarProductoFacturasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarBuscarProductoFacturas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarBuscarProductoFacturasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralBuscarProductoFacturas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralBuscarProductoFacturasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonidBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"idBuscarProductoFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_productoBuscarProductoFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_productoBuscarProductoFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_productoBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoBuscarProductoFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_empresaBuscarProductoFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBuscarProductoFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_empresaBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBuscarProductoFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_sucursalBuscarProductoFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalBuscarProductoFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_sucursalBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalBuscarProductoFacturasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_clienteBuscarProductoFacturasUpdate.addActionListener(new ButtonActionListener(this,"id_clienteBuscarProductoFacturasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonid_clienteBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnumero_pre_impresoBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonfecha_emision_desdeBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonfecha_emision_hastaBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnombre_vendedorBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnombre_completo_clienteBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonfecha_emisionBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnumero_pre_impreso_datoBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impreso_datoBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtontotalBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"totalBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnombre_unidadBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnombre_bodegaBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bodegaBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonnombre_productoBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtoncantidadBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"cantidadBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtonprecioBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"precioBuscarProductoFacturasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jButtondescuentoBuscarProductoFacturasBusqueda.addActionListener(new ButtonActionListener(this,"descuentoBuscarProductoFacturasBusqueda"));
		
		
		this.jButtonBusquedaBuscarProductoFacturasBuscarProductoFacturas.addActionListener(new ButtonActionListener(this,"BusquedaBuscarProductoFacturasBuscarProductoFacturas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionBuscarProductoFacturas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionBuscarProductoFacturasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarBuscarProductoFacturasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarBuscarProductoFacturas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosBuscarProductoFacturas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(BuscarProductoFacturas buscarproductofacturasAux:this.buscarproductofacturasLogic.getBuscarProductoFacturass()) {
					buscarproductofacturasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BuscarProductoFacturas buscarproductofacturasAux:buscarproductofacturass) {
					buscarproductofacturasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosBuscarProductoFacturasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBuscarProductoFacturas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(BuscarProductoFacturas buscarproductofacturasAux:this.buscarproductofacturasLogic.getBuscarProductoFacturass()) {
						buscarproductofacturasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BuscarProductoFacturas buscarproductofacturasAux:buscarproductofacturass) {
						buscarproductofacturasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(BuscarProductoFacturas buscarproductofacturasAux:this.buscarproductofacturasLogic.getBuscarProductoFacturass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BuscarProductoFacturas buscarproductofacturasAux:buscarproductofacturass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaBuscarProductoFacturas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBuscarProductoFacturas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBuscarProductoFacturas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosBuscarProductoFacturasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBuscarProductoFacturas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosBuscarProductoFacturas.getSelectedRows();
			
			BuscarProductoFacturas buscarproductofacturasLocal=new BuscarProductoFacturas();
			
			//this.seleccionarTodosBuscarProductoFacturas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					buscarproductofacturasLocal =(BuscarProductoFacturas) this.buscarproductofacturasLogic.getBuscarProductoFacturass().toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					buscarproductofacturasLocal =(BuscarProductoFacturas) this.buscarproductofacturass.toArray()[this.jTableDatosBuscarProductoFacturas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				buscarproductofacturasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(BuscarProductoFacturas buscarproductofacturasAux:this.buscarproductofacturasLogic.getBuscarProductoFacturass()) {
						buscarproductofacturasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BuscarProductoFacturas buscarproductofacturasAux:buscarproductofacturass) {
						buscarproductofacturasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaBuscarProductoFacturas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBuscarProductoFacturas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBuscarProductoFacturas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBuscarProductoFacturas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualBuscarProductoFacturasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarBuscarProductoFacturasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralBuscarProductoFacturasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingBuscarProductoFacturas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralBuscarProductoFacturas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(BuscarProductoFacturas buscarproductofacturasAux:this.buscarproductofacturasLogic.getBuscarProductoFacturass()) {
				
						if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							buscarproductofacturasAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							buscarproductofacturasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							buscarproductofacturasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							buscarproductofacturasAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							buscarproductofacturasAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							buscarproductofacturasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO)) {
							existe=true;
							buscarproductofacturasAux.setnumero_pre_impreso_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							buscarproductofacturasAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							buscarproductofacturasAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							buscarproductofacturasAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							buscarproductofacturasAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							buscarproductofacturasAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							buscarproductofacturasAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							buscarproductofacturasAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BuscarProductoFacturas buscarproductofacturasAux:buscarproductofacturass) {
					
						if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							buscarproductofacturasAux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							buscarproductofacturasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							buscarproductofacturasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							buscarproductofacturasAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							buscarproductofacturasAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							buscarproductofacturasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO)) {
							existe=true;
							buscarproductofacturasAux.setnumero_pre_impreso_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							buscarproductofacturasAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							buscarproductofacturasAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA)) {
							existe=true;
							buscarproductofacturasAux.setnombre_bodega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							buscarproductofacturasAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							buscarproductofacturasAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							buscarproductofacturasAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							buscarproductofacturasAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaBuscarProductoFacturas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesBuscarProductoFacturasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingBuscarProductoFacturas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioBuscarProductoFacturas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesBuscarProductoFacturas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteBuscarProductoFacturas) {				
					conSplash=true;//false;										
					
					//this.startProcessBuscarProductoFacturas(conSplash);
				
					this.generarReporteBuscarProductoFacturassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBuscarProductoFacturas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoBuscarProductoFacturassSeleccionados();
				//this.jComboBoxTiposAccionesBuscarProductoFacturas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBuscarProductoFacturassSeleccionados(false);
				//this.jComboBoxTiposAccionesBuscarProductoFacturas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBuscarProductoFacturassSeleccionados(true);
				//this.jComboBoxTiposAccionesBuscarProductoFacturas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBuscarProductoFacturas();
				
				this.exportarBuscarProductoFacturassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBuscarProductoFacturas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionBuscarProductoFacturass();
				//this.importarBuscarProductoFacturass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBuscarProductoFacturas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBuscarProductoFacturas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelBuscarProductoFacturassSeleccionados();
				//this.jComboBoxTiposAccionesBuscarProductoFacturas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Buscar Producto Facturas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessBuscarProductoFacturas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoBuscarProductoFacturas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyBuscarProductoFacturas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Buscar Producto Facturas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBuscarProductoFacturas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.setSelectedIndex(0);					
				}	
			} 			
			else if(BuscarProductoFacturasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteBuscarProductoFacturas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessBuscarProductoFacturas(conSplash);
					
						//this.actualizarParametrosGeneralBuscarProductoFacturas();
						
						this.generarReporteProcesoAccionBuscarProductoFacturassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesBuscarProductoFacturas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(BuscarProductoFacturasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Buscar Producto FacturasES SELECCIONADOS?", "MANTENIMIENTO DE Buscar Producto Facturas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessBuscarProductoFacturas();
				
						this.actualizarParametrosGeneralBuscarProductoFacturas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.buscarproductofacturasReturnGeneral=buscarproductofacturasLogic.procesarAccionBuscarProductoFacturassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.buscarproductofacturasLogic.getBuscarProductoFacturass(),this.buscarproductofacturasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarBuscarProductoFacturasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBuscarProductoFacturas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralBuscarProductoFacturas();
					
					BuscarProductoFacturasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarBuscarProductoFacturasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBuscarProductoFacturas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxTiposAccionesFormularioBuscarProductoFacturas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessBuscarProductoFacturas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesBuscarProductoFacturasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessBuscarProductoFacturas();
			
			if(this.jInternalFrameDetalleFormBuscarProductoFacturas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<BuscarProductoFacturas> buscarproductofacturassSeleccionados=new ArrayList<BuscarProductoFacturas>();		
			BuscarProductoFacturas buscarproductofacturas=new BuscarProductoFacturas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingBuscarProductoFacturas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesBuscarProductoFacturas.getSelectedItem();
			
			
			
			
			buscarproductofacturassSeleccionados=this.getBuscarProductoFacturassSeleccionados(true);
			//this.sTipoAccion;
			
			if(buscarproductofacturassSeleccionados.size()==1) {
				for(BuscarProductoFacturas buscarproductofacturasAux:buscarproductofacturassSeleccionados) {
					buscarproductofacturas=buscarproductofacturasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessBuscarProductoFacturas();
			
      		//this.finishProcessBuscarProductoFacturas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarBuscarProductoFacturasReturnGeneral() throws Exception {
		if(this.buscarproductofacturasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.buscarproductofacturasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.buscarproductofacturasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.buscarproductofacturasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.buscarproductofacturasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.buscarproductofacturasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingBuscarProductoFacturas(false);
		}
		
		if(this.buscarproductofacturasReturnGeneral.getConRetornoLista() || this.buscarproductofacturasReturnGeneral.getConRetornoObjeto()) {
			if(this.buscarproductofacturasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.buscarproductofacturasLogic.setBuscarProductoFacturass(this.buscarproductofacturasReturnGeneral.getBuscarProductoFacturass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingBuscarProductoFacturas(false);
		}
	}
	
	public void actualizarParametrosGeneralBuscarProductoFacturas() throws Exception {
		
		
	}
	
	public ArrayList<BuscarProductoFacturas> getBuscarProductoFacturassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<BuscarProductoFacturas> buscarproductofacturassSeleccionados=new ArrayList<BuscarProductoFacturas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioBuscarProductoFacturas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(BuscarProductoFacturas buscarproductofacturasAux:buscarproductofacturasLogic.getBuscarProductoFacturass()) {
					if(buscarproductofacturasAux.getIsSelected()) {
						buscarproductofacturassSeleccionados.add(buscarproductofacturasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BuscarProductoFacturas buscarproductofacturasAux:this.buscarproductofacturass) {
					if(buscarproductofacturasAux.getIsSelected()) {
						buscarproductofacturassSeleccionados.add(buscarproductofacturasAux);				
					}
				}
			}
			
			if(buscarproductofacturassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						buscarproductofacturassSeleccionados.addAll(this.buscarproductofacturasLogic.getBuscarProductoFacturass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						buscarproductofacturassSeleccionados.addAll(this.buscarproductofacturass);				
					}
				}
			}
		} else {
			buscarproductofacturassSeleccionados.add(this.buscarproductofacturas);
		}
		
		return buscarproductofacturassSeleccionados;
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
	
	public void generarReporteBuscarProductoFacturassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalBuscarProductoFacturassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoBuscarProductoFacturassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBuscarProductoFacturassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBuscarProductoFacturassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Buscar Producto Facturas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesBuscarProductoFacturassSeleccionados() throws Exception {
		ArrayList<BuscarProductoFacturas> buscarproductofacturassSeleccionados=new ArrayList<BuscarProductoFacturas>();		
		
		buscarproductofacturassSeleccionados=this.getBuscarProductoFacturassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteBuscarProductoFacturass("Todos",buscarproductofacturassSeleccionados);
		
	}	
	
	public void generarReporteNormalBuscarProductoFacturassSeleccionados() throws Exception {
		ArrayList<BuscarProductoFacturas> buscarproductofacturassSeleccionados=new ArrayList<BuscarProductoFacturas>();		
		
		buscarproductofacturassSeleccionados=this.getBuscarProductoFacturassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteBuscarProductoFacturass("Todos",buscarproductofacturassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionBuscarProductoFacturassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<BuscarProductoFacturas> buscarproductofacturassSeleccionados=new ArrayList<BuscarProductoFacturas>();
		
		buscarproductofacturassSeleccionados=this.getBuscarProductoFacturassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteBuscarProductoFacturass("Todos",buscarproductofacturassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoBuscarProductoFacturassSeleccionados() throws Exception {
		ArrayList<BuscarProductoFacturas> buscarproductofacturassSeleccionados=new ArrayList<BuscarProductoFacturas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoBuscarProductoFacturas();
		
		
		buscarproductofacturassSeleccionados=this.getBuscarProductoFacturassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoBuscarProductoFacturas();
		
		
		//this.generarReporteBuscarProductoFacturass("Todos",buscarproductofacturassSeleccionados ,buscarproductofacturasImplementable,buscarproductofacturasImplementableHome);
	}
	
	public void mostrarImportacionBuscarProductoFacturass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionBuscarProductoFacturas();
		
		this.abrirFrameImportacionBuscarProductoFacturas();		
		
			
		//this.generarReporteBuscarProductoFacturass("Todos",buscarproductofacturassSeleccionados ,buscarproductofacturasImplementable,buscarproductofacturasImplementableHome);
	}
	
	public void importarBuscarProductoFacturass() throws Exception {		
	
	}
	
	public void exportarBuscarProductoFacturassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelBuscarProductoFacturassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoBuscarProductoFacturassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlBuscarProductoFacturassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Buscar Producto Facturas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoBuscarProductoFacturassSeleccionados() throws Exception {
		ArrayList<BuscarProductoFacturas> buscarproductofacturassSeleccionados=new ArrayList<BuscarProductoFacturas>();		
		
		buscarproductofacturassSeleccionados=this.getBuscarProductoFacturassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"buscarproductofacturas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarBuscarProductoFacturas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(BuscarProductoFacturas buscarproductofacturasAux:buscarproductofacturassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarBuscarProductoFacturas(buscarproductofacturasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//buscarproductofacturasAux.setsDetalleGeneralEntityReporte(buscarproductofacturasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Buscar Producto Facturas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarBuscarProductoFacturas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=buscarproductofacturas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getnumero_pre_impreso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getnombre_vendedor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getnumero_pre_impreso_dato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getnombre_bodega();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=buscarproductofacturas.getdescuento().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelBuscarProductoFacturassSeleccionados() throws Exception {
		ArrayList<BuscarProductoFacturas> buscarproductofacturassSeleccionados=new ArrayList<BuscarProductoFacturas>();		
		
		buscarproductofacturassSeleccionados=this.getBuscarProductoFacturassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"buscarproductofacturas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("BuscarProductoFacturass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelBuscarProductoFacturas(row);				
				iRow++;
			}				
			
			for(BuscarProductoFacturas buscarproductofacturasAux:buscarproductofacturassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelBuscarProductoFacturas(buscarproductofacturasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Buscar Producto Facturas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlBuscarProductoFacturassSeleccionados() throws Exception {
		ArrayList<BuscarProductoFacturas> buscarproductofacturassSeleccionados=new ArrayList<BuscarProductoFacturas>();		
		
		buscarproductofacturassSeleccionados=this.getBuscarProductoFacturassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"buscarproductofacturas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("buscarproductofacturass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("buscarproductofacturas");
			//elementRoot.appendChild(element);
		
			for(BuscarProductoFacturas buscarproductofacturasAux:buscarproductofacturassSeleccionados) {
				element = document.createElement("buscarproductofacturas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlBuscarProductoFacturas(buscarproductofacturasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Buscar Producto Facturas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelBuscarProductoFacturas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(BuscarProductoFacturasConstantesFunciones.LABEL_DESCUENTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getnumero_pre_impreso());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getnombre_vendedor());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getnumero_pre_impreso_dato());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getnombre_bodega());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(buscarproductofacturas.getdescuento());				
	}
	
	public void setFilaDatosExportarXmlBuscarProductoFacturas(BuscarProductoFacturas buscarproductofacturas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(BuscarProductoFacturasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(buscarproductofacturas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(BuscarProductoFacturasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(buscarproductofacturas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementproducto_descripcion = document.createElement(BuscarProductoFacturasConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(buscarproductofacturas.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementempresa_descripcion = document.createElement(BuscarProductoFacturasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(buscarproductofacturas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(BuscarProductoFacturasConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(buscarproductofacturas.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(BuscarProductoFacturasConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(buscarproductofacturas.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementnumero_pre_impreso = document.createElement(BuscarProductoFacturasConstantesFunciones.NUMEROPREIMPRESO);
		elementnumero_pre_impreso.appendChild(document.createTextNode(buscarproductofacturas.getnumero_pre_impreso().trim()));
		element.appendChild(elementnumero_pre_impreso);

		Element elementfecha_emision_desde = document.createElement(BuscarProductoFacturasConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(buscarproductofacturas.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(BuscarProductoFacturasConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(buscarproductofacturas.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_vendedor = document.createElement(BuscarProductoFacturasConstantesFunciones.NOMBREVENDEDOR);
		elementnombre_vendedor.appendChild(document.createTextNode(buscarproductofacturas.getnombre_vendedor().trim()));
		element.appendChild(elementnombre_vendedor);

		Element elementnombre_completo_cliente = document.createElement(BuscarProductoFacturasConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(buscarproductofacturas.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementfecha_emision = document.createElement(BuscarProductoFacturasConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(buscarproductofacturas.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementnumero_pre_impreso_dato = document.createElement(BuscarProductoFacturasConstantesFunciones.NUMEROPREIMPRESODATO);
		elementnumero_pre_impreso_dato.appendChild(document.createTextNode(buscarproductofacturas.getnumero_pre_impreso_dato().trim()));
		element.appendChild(elementnumero_pre_impreso_dato);

		Element elementtotal = document.createElement(BuscarProductoFacturasConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(buscarproductofacturas.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementnombre_unidad = document.createElement(BuscarProductoFacturasConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(buscarproductofacturas.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementnombre_bodega = document.createElement(BuscarProductoFacturasConstantesFunciones.NOMBREBODEGA);
		elementnombre_bodega.appendChild(document.createTextNode(buscarproductofacturas.getnombre_bodega().trim()));
		element.appendChild(elementnombre_bodega);

		Element elementnombre_producto = document.createElement(BuscarProductoFacturasConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(buscarproductofacturas.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementcantidad = document.createElement(BuscarProductoFacturasConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(buscarproductofacturas.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementprecio = document.createElement(BuscarProductoFacturasConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(buscarproductofacturas.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementdescuento = document.createElement(BuscarProductoFacturasConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(buscarproductofacturas.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);
	}
	
	public void generarReporteGroupGenericoBuscarProductoFacturassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<BuscarProductoFacturas> buscarproductofacturassSeleccionados=new ArrayList<BuscarProductoFacturas>();
		
		buscarproductofacturassSeleccionados=this.getBuscarProductoFacturassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoBuscarProductoFacturas(buscarproductofacturassSeleccionados);
		
		this.generarReporteBuscarProductoFacturass("Todos",buscarproductofacturassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoBuscarProductoFacturas(ArrayList<BuscarProductoFacturas> buscarproductofacturassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(BuscarProductoFacturas buscarproductofacturasAux:buscarproductofacturassSeleccionados) {
				buscarproductofacturasAux.setsDetalleGeneralEntityReporte(buscarproductofacturasAux.toString());
			
				if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					buscarproductofacturasAux.setsDescripcionGeneralEntityReporte1(buscarproductofacturasAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					buscarproductofacturasAux.setsDescripcionGeneralEntityReporte1(buscarproductofacturasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					buscarproductofacturasAux.setsDescripcionGeneralEntityReporte1(buscarproductofacturasAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					buscarproductofacturasAux.setsDescripcionGeneralEntityReporte1(buscarproductofacturasAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
					existe=true;
					buscarproductofacturasAux.setsDescripcionGeneralEntityReporte1(buscarproductofacturasAux.getnumero_pre_impreso());
				}
				 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					buscarproductofacturasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(buscarproductofacturasAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					buscarproductofacturasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(buscarproductofacturasAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
					existe=true;
					buscarproductofacturasAux.setsDescripcionGeneralEntityReporte1(buscarproductofacturasAux.getnombre_vendedor());
				}
				 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					buscarproductofacturasAux.setsDescripcionGeneralEntityReporte1(buscarproductofacturasAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					buscarproductofacturasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(buscarproductofacturasAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NUMEROPREIMPRESODATO)) {
					existe=true;
					buscarproductofacturasAux.setsDescripcionGeneralEntityReporte1(buscarproductofacturasAux.getnumero_pre_impreso_dato());
				}
				 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					buscarproductofacturasAux.setsDescripcionGeneralEntityReporte1(buscarproductofacturasAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREBODEGA)) {
					existe=true;
					buscarproductofacturasAux.setsDescripcionGeneralEntityReporte1(buscarproductofacturasAux.getnombre_bodega());
				}
				 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					buscarproductofacturasAux.setsDescripcionGeneralEntityReporte1(buscarproductofacturasAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(BuscarProductoFacturasConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					buscarproductofacturasAux.setsDescripcionGeneralEntityReporte1(buscarproductofacturasAux.getcantidad().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BuscarProductoFacturasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesBuscarProductoFacturas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoBuscarProductoFacturas=true;
				this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=true;
				this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas=true;
			}
			
			this.isVisibilidadCeldaModificarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaActualizarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaEliminarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaCancelarBuscarProductoFacturas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBuscarProductoFacturas=true;
				} else {
					this.isVisibilidadCeldaGuardarBuscarProductoFacturas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoBuscarProductoFacturas=false;
			this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas=false;
			this.isVisibilidadCeldaModificarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaActualizarBuscarProductoFacturas=true;
			this.isVisibilidadCeldaEliminarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaCancelarBuscarProductoFacturas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBuscarProductoFacturas=true;
				} else {
					this.isVisibilidadCeldaGuardarBuscarProductoFacturas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoBuscarProductoFacturas=false;
			this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas=false;
			this.isVisibilidadCeldaModificarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaActualizarBuscarProductoFacturas=true;
			this.isVisibilidadCeldaEliminarBuscarProductoFacturas=true;
			this.isVisibilidadCeldaCancelarBuscarProductoFacturas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBuscarProductoFacturas=true;
				} else {
					this.isVisibilidadCeldaGuardarBuscarProductoFacturas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoBuscarProductoFacturas=false;
			this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas=false;
			this.isVisibilidadCeldaModificarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaActualizarBuscarProductoFacturas=true;
			this.isVisibilidadCeldaEliminarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaCancelarBuscarProductoFacturas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBuscarProductoFacturas=false;
				} else {
					this.isVisibilidadCeldaGuardarBuscarProductoFacturas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoBuscarProductoFacturas=true;
			this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=true;
			this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas=true;
			this.isVisibilidadCeldaModificarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaActualizarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaEliminarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaCancelarBuscarProductoFacturas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBuscarProductoFacturas=true;
				} else {
					this.isVisibilidadCeldaGuardarBuscarProductoFacturas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoBuscarProductoFacturas=false;
			this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas=false;
			this.isVisibilidadCeldaActualizarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaEliminarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaCancelarBuscarProductoFacturas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBuscarProductoFacturas=false;
				} else {
					this.isVisibilidadCeldaGuardarBuscarProductoFacturas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoBuscarProductoFacturas=false;
			this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas=false;
			this.isVisibilidadCeldaModificarBuscarProductoFacturas=true;
			this.isVisibilidadCeldaActualizarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaEliminarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaCancelarBuscarProductoFacturas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBuscarProductoFacturas=false;
				} else {
					this.isVisibilidadCeldaGuardarBuscarProductoFacturas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(BuscarProductoFacturasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoBuscarProductoFacturas=true;
			this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=true;
			this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas=true;
		} else {
			this.actualizarEstadoPanelsBuscarProductoFacturas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarBuscarProductoFacturas=false;
			//this.isVisibilidadCeldaVerFormBuscarProductoFacturas=false;
			this.isVisibilidadCeldaDuplicarBuscarProductoFacturas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!buscarproductofacturasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=false;
		} else {
			this.isVisibilidadCeldaNuevoBuscarProductoFacturas=false;
			this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
			if(!buscarproductofacturasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=false;												
			}
			
			this.jButtonCerrarBuscarProductoFacturas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=false;
		}
		
		if(!this.permiteMantenimiento(this.buscarproductofacturas)) {
			this.isVisibilidadCeldaActualizarBuscarProductoFacturas=false;
			this.isVisibilidadCeldaEliminarBuscarProductoFacturas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoBuscarProductoFacturas=false;
		this.isVisibilidadCeldaNuevoRelacionesBuscarProductoFacturas=false;
		this.isVisibilidadCeldaGuardarCambiosBuscarProductoFacturas=false;
		//this.isVisibilidadCeldaModificarBuscarProductoFacturas=true;
		this.isVisibilidadCeldaActualizarBuscarProductoFacturas=false;
		this.isVisibilidadCeldaEliminarBuscarProductoFacturas=false;
		//this.isVisibilidadCeldaCancelarBuscarProductoFacturas=true;			
		this.isVisibilidadCeldaGuardarBuscarProductoFacturas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesBuscarProductoFacturas() {
	}
	
	public void actualizarEstadoPanelsBuscarProductoFacturas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionBuscarProductoFacturas!=null) {
				this.jScrollPanelDatosEdicionBuscarProductoFacturas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBuscarProductoFacturas!=null) {
				this.jTabbedPaneBusquedasBuscarProductoFacturas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBuscarProductoFacturas!=null) {
				this.jScrollPanelDatosBuscarProductoFacturas.setVisible(true);
			}
			
			if(this.jPanelPaginacionBuscarProductoFacturas!=null) {
				this.jPanelPaginacionBuscarProductoFacturas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBuscarProductoFacturas!=null) {
				this.jPanelParametrosReportesBuscarProductoFacturas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionBuscarProductoFacturas!=null) {
				this.jScrollPanelDatosEdicionBuscarProductoFacturas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBuscarProductoFacturas!=null) {
				this.jTabbedPaneBusquedasBuscarProductoFacturas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosBuscarProductoFacturas!=null) {
				this.jScrollPanelDatosBuscarProductoFacturas.setVisible(false);
			}
			
			if(this.jPanelPaginacionBuscarProductoFacturas!=null) {
				this.jPanelPaginacionBuscarProductoFacturas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBuscarProductoFacturas!=null) {
				this.jPanelParametrosReportesBuscarProductoFacturas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionBuscarProductoFacturas!=null) {
				this.jScrollPanelDatosEdicionBuscarProductoFacturas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBuscarProductoFacturas!=null) {
				this.jTabbedPaneBusquedasBuscarProductoFacturas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBuscarProductoFacturas!=null) {
				this.jScrollPanelDatosBuscarProductoFacturas.setVisible(false);
			}
			
			if(this.jPanelPaginacionBuscarProductoFacturas!=null) {
				this.jPanelPaginacionBuscarProductoFacturas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBuscarProductoFacturas!=null) {
				this.jPanelParametrosReportesBuscarProductoFacturas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionBuscarProductoFacturas!=null) {
				this.jScrollPanelDatosEdicionBuscarProductoFacturas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBuscarProductoFacturas!=null) {
				this.jTabbedPaneBusquedasBuscarProductoFacturas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBuscarProductoFacturas!=null) {
				this.jScrollPanelDatosBuscarProductoFacturas.setVisible(false);
			}
			
			if(this.jPanelPaginacionBuscarProductoFacturas!=null) {
				this.jPanelPaginacionBuscarProductoFacturas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBuscarProductoFacturas!=null) {
				this.jPanelParametrosReportesBuscarProductoFacturas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionBuscarProductoFacturas!=null) {
				this.jScrollPanelDatosEdicionBuscarProductoFacturas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBuscarProductoFacturas!=null) {
				this.jTabbedPaneBusquedasBuscarProductoFacturas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBuscarProductoFacturas!=null) {
				this.jScrollPanelDatosBuscarProductoFacturas.setVisible(true);
			}
			
			if(this.jPanelPaginacionBuscarProductoFacturas!=null) {
				this.jPanelPaginacionBuscarProductoFacturas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBuscarProductoFacturas!=null) {
				this.jPanelParametrosReportesBuscarProductoFacturas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionBuscarProductoFacturas!=null) {
				this.jScrollPanelDatosEdicionBuscarProductoFacturas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBuscarProductoFacturas!=null) {
				this.jTabbedPaneBusquedasBuscarProductoFacturas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBuscarProductoFacturas!=null) {
				this.jScrollPanelDatosBuscarProductoFacturas.setVisible(true);
			}
			
			if(this.jPanelPaginacionBuscarProductoFacturas!=null) {
				this.jPanelPaginacionBuscarProductoFacturas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBuscarProductoFacturas!=null) {
				this.jPanelParametrosReportesBuscarProductoFacturas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionBuscarProductoFacturas!=null) {
				this.jScrollPanelDatosEdicionBuscarProductoFacturas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBuscarProductoFacturas!=null) {
				this.jTabbedPaneBusquedasBuscarProductoFacturas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBuscarProductoFacturas!=null) {
				this.jScrollPanelDatosBuscarProductoFacturas.setVisible(true);
			}
			
			if(this.jPanelPaginacionBuscarProductoFacturas!=null) {
				this.jPanelPaginacionBuscarProductoFacturas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBuscarProductoFacturas!=null) {
				this.jPanelParametrosReportesBuscarProductoFacturas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasBuscarProductoFacturas!=null) {
					this.jTabbedPaneBusquedasBuscarProductoFacturas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesBuscarProductoFacturas!=null) {
				this.jPanelParametrosReportesBuscarProductoFacturas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.buscarproductofacturasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBuscarProductoFacturas!=null) {
				this.jTabbedPaneBusquedasBuscarProductoFacturas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesBuscarProductoFacturas!=null) {
				this.jPanelParametrosReportesBuscarProductoFacturas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaBuscarProductoFacturas=isParaProducto;
			if(!this.isVisibilidadBusquedaBuscarProductoFacturas) {this.jTabbedPaneBusquedasBuscarProductoFacturas.remove(jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaBuscarProductoFacturas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaBuscarProductoFacturas) {this.jTabbedPaneBusquedasBuscarProductoFacturas.remove(jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaBuscarProductoFacturas=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaBuscarProductoFacturas) {this.jTabbedPaneBusquedasBuscarProductoFacturas.remove(jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaBuscarProductoFacturas=isParaCliente;
			if(!this.isVisibilidadBusquedaBuscarProductoFacturas) {this.jTabbedPaneBusquedasBuscarProductoFacturas.remove(jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas);}
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
			
			this.inicializarActualizarBindingTablaBuscarProductoFacturas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioBuscarProductoFacturas() {
		this.updateBorderResaltarBusquedasFormularioBuscarProductoFacturas();
		this.updateVisibilidadBusquedasFormularioBuscarProductoFacturas();
		this.updateHabilitarBusquedasFormularioBuscarProductoFacturas();
	}
	
	public void updateBorderResaltarBusquedasFormularioBuscarProductoFacturas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasBuscarProductoFacturas.getComponents().length>0) {
	

		if(this.buscarproductofacturasConstantesFunciones.resaltarBusquedaBuscarProductoFacturasBuscarProductoFacturas!=null) {
			index= this.jTabbedPaneBusquedasBuscarProductoFacturas.indexOfComponent(this.jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBuscarProductoFacturas.getComponent(index);
				jPanel.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarBusquedaBuscarProductoFacturasBuscarProductoFacturas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioBuscarProductoFacturas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasBuscarProductoFacturas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBuscarProductoFacturas.indexOfComponent(this.jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBuscarProductoFacturas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarBusquedaBuscarProductoFacturasBuscarProductoFacturas);
			if(!this.buscarproductofacturasConstantesFunciones.mostrarBusquedaBuscarProductoFacturasBuscarProductoFacturas && index>-1) {
				this.jTabbedPaneBusquedasBuscarProductoFacturas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioBuscarProductoFacturas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasBuscarProductoFacturas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBuscarProductoFacturas.indexOfComponent(this.jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBuscarProductoFacturas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.buscarproductofacturasConstantesFunciones.activarBusquedaBuscarProductoFacturasBuscarProductoFacturas);
				this.jTabbedPaneBusquedasBuscarProductoFacturas.setEnabledAt(index,this.buscarproductofacturasConstantesFunciones.activarBusquedaBuscarProductoFacturasBuscarProductoFacturas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaBuscarProductoFacturas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaBuscarProductoFacturas")) {
			index= this.jTabbedPaneBusquedasBuscarProductoFacturas.indexOfComponent(this.jPanelBusquedaBuscarProductoFacturasBuscarProductoFacturas);

			this.jTabbedPaneBusquedasBuscarProductoFacturas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBuscarProductoFacturas.getComponent(index);

			this.buscarproductofacturasConstantesFunciones.setResaltarBusquedaBuscarProductoFacturasBuscarProductoFacturas(resaltar);

			jPanel.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarBusquedaBuscarProductoFacturasBuscarProductoFacturas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarBuscarProductoFacturas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioBuscarProductoFacturas() throws Exception {

		if(this.jInternalFrameDetalleFormBuscarProductoFacturas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioBuscarProductoFacturas();
		this.updateVisibilidadResaltarControlesFormularioBuscarProductoFacturas();
		this.updateHabilitarResaltarControlesFormularioBuscarProductoFacturas();
		
	}
	
	public void updateBorderResaltarControlesFormularioBuscarProductoFacturas() throws Exception {
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.buscarproductofacturasConstantesFunciones.resaltaridBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelidBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltaridBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarid_productoBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_productoBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarid_productoBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarid_empresaBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_empresaBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarid_empresaBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarid_sucursalBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_sucursalBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarid_sucursalBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarid_clienteBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_clienteBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarid_clienteBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarnumero_pre_impresoBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnumero_pre_impresoBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarnumero_pre_impresoBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarfecha_emision_desdeBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emision_desdeBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarfecha_emision_desdeBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarfecha_emision_hastaBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emision_hastaBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarfecha_emision_hastaBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarnombre_vendedorBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_vendedorBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarnombre_vendedorBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarnombre_completo_clienteBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_completo_clienteBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarnombre_completo_clienteBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarfecha_emisionBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emisionBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarfecha_emisionBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarnumero_pre_impreso_datoBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarnumero_pre_impreso_datoBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltartotalBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldtotalBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltartotalBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarnombre_unidadBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnombre_unidadBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarnombre_unidadBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarnombre_bodegaBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_bodegaBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarnombre_bodegaBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarnombre_productoBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_productoBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarnombre_productoBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarcantidadBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldcantidadBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarcantidadBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltarprecioBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldprecioBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltarprecioBuscarProductoFacturas);}
		if(this.buscarproductofacturasConstantesFunciones.resaltardescuentoBuscarProductoFacturas!=null && this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFielddescuentoBuscarProductoFacturas.setBorder(this.buscarproductofacturasConstantesFunciones.resaltardescuentoBuscarProductoFacturas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioBuscarProductoFacturas() throws Exception {		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
	
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelidBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostraridBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelidBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostraridBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_productoBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarid_productoBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelid_productoBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarid_productoBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_empresaBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarid_empresaBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelid_empresaBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarid_empresaBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_sucursalBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarid_sucursalBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelid_sucursalBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarid_sucursalBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_clienteBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarid_clienteBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelid_clienteBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarid_clienteBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnumero_pre_impresoBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarnumero_pre_impresoBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelnumero_pre_impresoBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarnumero_pre_impresoBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emision_desdeBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarfecha_emision_desdeBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelfecha_emision_desdeBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarfecha_emision_desdeBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emision_hastaBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarfecha_emision_hastaBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelfecha_emision_hastaBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarfecha_emision_hastaBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_vendedorBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarnombre_vendedorBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelnombre_vendedorBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarnombre_vendedorBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_completo_clienteBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarnombre_completo_clienteBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelnombre_completo_clienteBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarnombre_completo_clienteBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emisionBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarfecha_emisionBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelfecha_emisionBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarfecha_emisionBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarnumero_pre_impreso_datoBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelnumero_pre_impreso_datoBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarnumero_pre_impreso_datoBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldtotalBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrartotalBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPaneltotalBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrartotalBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnombre_unidadBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarnombre_unidadBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelnombre_unidadBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarnombre_unidadBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_bodegaBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarnombre_bodegaBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelnombre_bodegaBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarnombre_bodegaBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_productoBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarnombre_productoBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelnombre_productoBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarnombre_productoBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldcantidadBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarcantidadBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelcantidadBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarcantidadBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldprecioBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarprecioBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPanelprecioBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrarprecioBuscarProductoFacturas);
		//this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFielddescuentoBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrardescuentoBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jPaneldescuentoBuscarProductoFacturas.setVisible(this.buscarproductofacturasConstantesFunciones.mostrardescuentoBuscarProductoFacturas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioBuscarProductoFacturas() throws Exception {
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBuscarProductoFacturas!=null) {
	
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jLabelidBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activaridBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_productoBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarid_productoBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_empresaBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarid_empresaBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_sucursalBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarid_sucursalBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jComboBoxid_clienteBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarid_clienteBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnumero_pre_impresoBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarnumero_pre_impresoBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emision_desdeBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarfecha_emision_desdeBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emision_hastaBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarfecha_emision_hastaBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_vendedorBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarnombre_vendedorBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_completo_clienteBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarnombre_completo_clienteBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jDateChooserfecha_emisionBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarfecha_emisionBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnumero_pre_impreso_datoBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarnumero_pre_impreso_datoBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldtotalBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activartotalBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldnombre_unidadBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarnombre_unidadBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_bodegaBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarnombre_bodegaBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextAreanombre_productoBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarnombre_productoBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldcantidadBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarcantidadBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFieldprecioBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activarprecioBuscarProductoFacturas);
		this.jInternalFrameDetalleFormBuscarProductoFacturas.jTextFielddescuentoBuscarProductoFacturas.setEnabled(this.buscarproductofacturasConstantesFunciones.activardescuentoBuscarProductoFacturas);
		}
	}
	
		
}