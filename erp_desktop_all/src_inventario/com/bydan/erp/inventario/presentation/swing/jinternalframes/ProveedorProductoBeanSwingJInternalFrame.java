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

import com.bydan.erp.inventario.util.ProveedorProductoConstantesFunciones;
import com.bydan.erp.inventario.util.ProveedorProductoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ProveedorProductoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ProveedorProductoBean;
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
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProveedorProductoBeanSwingJInternalFrame extends ProveedorProductoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProveedorProductoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProveedorProducto> proveedorproductoValidator = new ClassValidator<ProveedorProducto>(ProveedorProducto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProveedorProducto proveedorproducto;	
	public ProveedorProducto proveedorproductoAux;
	public ProveedorProducto proveedorproductoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProveedorProducto proveedorproductoTotales;
	public Long idProveedorProductoActual;
	public Long iIdNuevoProveedorProducto=0L;
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

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idProductoActual=0L;

	public Long getidProductoActual() {
		return idProductoActual;
	}

	public void setidProductoActual(Long idProductoActual) {
		this.idProductoActual= idProductoActual;
	}
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
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
	
	public Boolean isPermisoTodoProveedorProducto;
	public Boolean isPermisoNuevoProveedorProducto;
	public Boolean isPermisoActualizarProveedorProducto;
	public Boolean isPermisoActualizarOriginalProveedorProducto;
	public Boolean isPermisoEliminarProveedorProducto;
	public Boolean isPermisoGuardarCambiosProveedorProducto;
	public Boolean isPermisoConsultaProveedorProducto;
	public Boolean isPermisoBusquedaProveedorProducto;
	public Boolean isPermisoReporteProveedorProducto;
	public Boolean isPermisoPaginacionMedioProveedorProducto;
	public Boolean isPermisoPaginacionAltoProveedorProducto;
	public Boolean isPermisoPaginacionTodoProveedorProducto;
	public Boolean isPermisoCopiarProveedorProducto;
	public Boolean isPermisoVerFormProveedorProducto;
	public Boolean isPermisoDuplicarProveedorProducto;
	public Boolean isPermisoOrdenProveedorProducto;
	
	
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
	
	public ProveedorProductoParameterReturnGeneral proveedorproductoReturnGeneral;
	public ProveedorProductoParameterReturnGeneral proveedorproductoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProveedorProducto=false;
	public Boolean esParaAccionDesdeFormularioProveedorProducto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProveedorProductoSessionBeanAdditional proveedorproductoSessionBeanAdditional=null;
	
	public ProveedorProductoSessionBeanAdditional getProveedorProductoSessionBeanAdditional() {
		return this.proveedorproductoSessionBeanAdditional;
	}
	
	public void setProveedorProductoSessionBeanAdditional(ProveedorProductoSessionBeanAdditional proveedorproductoSessionBeanAdditional) {
		try {
			this.proveedorproductoSessionBeanAdditional=proveedorproductoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProveedorProductoBeanSwingJInternalFrameAdditional proveedorproductoBeanSwingJInternalFrameAdditional=null;
	//public class ProveedorProductoBeanSwingJInternalFrame
	
	public ProveedorProductoBeanSwingJInternalFrameAdditional getProveedorProductoBeanSwingJInternalFrameAdditional() {
		return this.proveedorproductoBeanSwingJInternalFrameAdditional;
	}
	
	public void setProveedorProductoBeanSwingJInternalFrameAdditional(ProveedorProductoBeanSwingJInternalFrameAdditional proveedorproductoBeanSwingJInternalFrameAdditional) {
		try {
			this.proveedorproductoBeanSwingJInternalFrameAdditional=proveedorproductoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProveedorProductoLogic proveedorproductoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProveedorProducto proveedorproductoBean;
	public ProveedorProductoConstantesFunciones proveedorproductoConstantesFunciones;
	//public ProveedorProductoParameterReturnGeneral proveedorproductoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<ProveedorProducto> proveedorproductos;	
	//public List<ProveedorProducto> proveedorproductosEliminados;
	//public List<ProveedorProducto> proveedorproductosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProveedorProducto=false;
	public Boolean isVisibilidadCeldaDuplicarProveedorProducto=true;
	public Boolean isVisibilidadCeldaCopiarProveedorProducto=true;
	public Boolean isVisibilidadCeldaVerFormProveedorProducto=true;
	public Boolean isVisibilidadCeldaOrdenProveedorProducto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProveedorProducto=false;
	public Boolean isVisibilidadCeldaModificarProveedorProducto=false;
	public Boolean isVisibilidadCeldaActualizarProveedorProducto=false;
	public Boolean isVisibilidadCeldaEliminarProveedorProducto=false;
	public Boolean isVisibilidadCeldaCancelarProveedorProducto=false;
	public Boolean isVisibilidadCeldaGuardarProveedorProducto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProveedorProducto=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProveedorProducto() {
		return this.iIdNuevoProveedorProducto;
	}

	public void setiIdNuevoProveedorProducto(Long iIdNuevoProveedorProducto) {
		this.iIdNuevoProveedorProducto = iIdNuevoProveedorProducto;
	}
	
	public Long getidProveedorProductoActual() {
		return this.idProveedorProductoActual;
	}

	public void setidProveedorProductoActual(Long idProveedorProductoActual) {
		this.idProveedorProductoActual = idProveedorProductoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProveedorProducto getproveedorproducto() {
		return this.proveedorproducto;
	}

	public void setproveedorproducto(ProveedorProducto proveedorproducto) {
		this.proveedorproducto = proveedorproducto;
	}
	
	public ProveedorProducto getproveedorproductoAux() {
		return this.proveedorproductoAux;
	}

	public void setproveedorproductoAux(ProveedorProducto proveedorproductoAux) {
		this.proveedorproductoAux = proveedorproductoAux;
	}				
	
	public ProveedorProducto getproveedorproductoAnterior() {
		return this.proveedorproductoAnterior;
	}

	public void setproveedorproductoAnterior(ProveedorProducto proveedorproductoAnterior) {
		this.proveedorproductoAnterior = proveedorproductoAnterior;
	}	
	
	public ProveedorProducto getproveedorproductoTotales() {
		return this.proveedorproductoTotales;
	}

	public void setproveedorproductoTotales(ProveedorProducto proveedorproductoTotales) {
		this.proveedorproductoTotales = proveedorproductoTotales;
	}	
	
	public ProveedorProducto getproveedorproductoBean() {
		return this.proveedorproductoBean;
	}

	public void setproveedorproductoBean(ProveedorProducto proveedorproductoBean) {
		this.proveedorproductoBean = proveedorproductoBean;
	}	
	
	public ProveedorProductoParameterReturnGeneral getproveedorproductoReturnGeneral() {
		return this.proveedorproductoReturnGeneral;
	}

	public void setproveedorproductoReturnGeneral(ProveedorProductoParameterReturnGeneral proveedorproductoReturnGeneral) {
		this.proveedorproductoReturnGeneral = proveedorproductoReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
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
	
	
	public ProveedorProductoLogic getProveedorProductoLogic()	{		
		return proveedorproductoLogic;
	}

	public void setProveedorProductoLogic(ProveedorProductoLogic proveedorproductoLogic) {
		this.proveedorproductoLogic = proveedorproductoLogic;
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
	
	public Boolean getIsEsNuevoProveedorProducto() {
		return isEsNuevoProveedorProducto;
	}

	public void setIsEsNuevoProveedorProducto(Boolean isEsNuevoProveedorProducto) {
		this.isEsNuevoProveedorProducto = isEsNuevoProveedorProducto;
	}

	public Boolean getEsParaAccionDesdeFormularioProveedorProducto() {
		return esParaAccionDesdeFormularioProveedorProducto;
	}
	
	public void setEsParaAccionDesdeFormularioProveedorProducto(Boolean esParaAccionDesdeFormularioProveedorProducto) {
		this.esParaAccionDesdeFormularioProveedorProducto = esParaAccionDesdeFormularioProveedorProducto;
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

			if(this.proveedorproductoSessionBean==null) {
				this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
			}

			if(!this.proveedorproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(proveedorproductoSessionBean.getlidEmpresaActual());
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

			if(this.proveedorproductoSessionBean==null) {
				this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
			}

			if(!this.proveedorproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(proveedorproductoSessionBean.getlidSucursalActual());
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

			if(this.proveedorproductoSessionBean==null) {
				this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
			}

			if(!this.proveedorproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(proveedorproductoSessionBean.getlidBodegaActual());
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

			if(this.proveedorproductoSessionBean==null) {
				this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
			}

			if(!this.proveedorproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(proveedorproductoSessionBean.getlidProductoActual());
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

			if(this.proveedorproductoSessionBean==null) {
				this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
			}

			if(!this.proveedorproductoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(proveedorproductoSessionBean.getlidClienteActual());
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

					if(this.proveedorproducto!=null) {
						this.proveedorproducto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
						this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_empresaProveedorProducto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProveedorProducto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
						if(this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_empresaProveedorProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_empresaProveedorProducto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProveedorProductoGenerico)throws Exception
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
				jComboBoxid_empresaProveedorProductoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProveedorProductoGenerico!=null && jComboBoxid_empresaProveedorProductoGenerico.getItemCount()>0) {
					jComboBoxid_empresaProveedorProductoGenerico.setSelectedIndex(0);
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

					if(this.proveedorproducto!=null) {
						this.proveedorproducto.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
						this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_sucursalProveedorProducto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProveedorProducto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
						if(this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_sucursalProveedorProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_sucursalProveedorProducto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProveedorProductoGenerico)throws Exception
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
				jComboBoxid_sucursalProveedorProductoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProveedorProductoGenerico!=null && jComboBoxid_sucursalProveedorProductoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProveedorProductoGenerico.setSelectedIndex(0);
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

					if(this.proveedorproducto!=null) {
						this.proveedorproducto.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
						this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_bodegaProveedorProducto.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProveedorProducto.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
						if(this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_bodegaProveedorProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_bodegaProveedorProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaProveedorProducto!=null) {
						jComboBoxid_bodegaFK_IdBodegaProveedorProducto.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaProveedorProducto!=null) {
							//jComboBoxid_bodegaFK_IdBodegaProveedorProducto.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaProveedorProducto.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaProveedorProducto.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProveedorProductoGenerico)throws Exception
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
				jComboBoxid_bodegaProveedorProductoGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProveedorProductoGenerico!=null && jComboBoxid_bodegaProveedorProductoGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProveedorProductoGenerico.setSelectedIndex(0);
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

					if(this.proveedorproducto!=null) {
						this.proveedorproducto.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
						this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_productoProveedorProducto.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProveedorProducto.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
						if(this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_productoProveedorProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_productoProveedorProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoProveedorProducto!=null) {
						jComboBoxid_productoFK_IdProductoProveedorProducto.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoProveedorProducto!=null) {
							//jComboBoxid_productoFK_IdProductoProveedorProducto.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoProveedorProducto.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoProveedorProducto.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProveedorProductoGenerico)throws Exception
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
				jComboBoxid_productoProveedorProductoGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProveedorProductoGenerico!=null && jComboBoxid_productoProveedorProductoGenerico.getItemCount()>0) {
					jComboBoxid_productoProveedorProductoGenerico.setSelectedIndex(0);
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

					if(this.proveedorproducto!=null) {
						this.proveedorproducto.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
						this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_clienteProveedorProducto.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteProveedorProducto.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
						if(this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_clienteProveedorProducto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_clienteProveedorProducto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteProveedorProducto!=null) {
						jComboBoxid_clienteFK_IdClienteProveedorProducto.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteProveedorProducto!=null) {
							//jComboBoxid_clienteFK_IdClienteProveedorProducto.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteProveedorProducto.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteProveedorProducto.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteProveedorProductoGenerico)throws Exception
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
				jComboBoxid_clienteProveedorProductoGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteProveedorProductoGenerico!=null && jComboBoxid_clienteProveedorProductoGenerico.getItemCount()>0) {
					jComboBoxid_clienteProveedorProductoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProveedorProducto proveedorproducto,JComboBox jComboBoxid_empresaProveedorProductoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProveedorProductoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_empresaProveedorProducto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProveedorProductoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				proveedorproducto.setid_empresa(empresaAux.getId());
				proveedorproducto.setempresa_descripcion(ProveedorProductoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				proveedorproducto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProveedorProducto proveedorproducto,JComboBox jComboBoxid_sucursalProveedorProductoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProveedorProductoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_sucursalProveedorProducto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProveedorProductoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				proveedorproducto.setid_sucursal(sucursalAux.getId());
				proveedorproducto.setsucursal_descripcion(ProveedorProductoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				proveedorproducto.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProveedorProducto proveedorproducto,JComboBox jComboBoxid_bodegaProveedorProductoGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProveedorProductoGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_bodegaProveedorProducto.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProveedorProductoGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				proveedorproducto.setid_bodega(bodegaAux.getId());
				proveedorproducto.setbodega_descripcion(ProveedorProductoConstantesFunciones.getBodegaDescripcion(bodegaAux));
				proveedorproducto.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProveedorProducto proveedorproducto,JComboBox jComboBoxid_productoProveedorProductoGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProveedorProductoGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_productoProveedorProducto.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProveedorProductoGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				proveedorproducto.setid_producto(productoAux.getId());
				proveedorproducto.setproducto_descripcion(ProveedorProductoConstantesFunciones.getProductoDescripcion(productoAux));
				proveedorproducto.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ProveedorProducto proveedorproducto,JComboBox jComboBoxid_clienteProveedorProductoGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteProveedorProductoGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_clienteProveedorProducto.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteProveedorProductoGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				proveedorproducto.setid_cliente(clienteAux.getId());
				proveedorproducto.setcliente_descripcion(ProveedorProductoConstantesFunciones.getClienteDescripcion(clienteAux));
				proveedorproducto.setCliente(clienteAux);			}
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

					if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProveedorProducto!=null) { 
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_empresaProveedorProducto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_empresaProveedorProducto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProveedorProducto!=null) { 
					}

					if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProveedorProducto!=null) { 
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_sucursalProveedorProducto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_sucursalProveedorProducto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProveedorProducto!=null) { 
					}

					if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProveedorProducto!=null) { 
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_bodegaProveedorProducto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_bodegaProveedorProducto.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProveedorProducto!=null) { 
					}

					if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProveedorProducto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaProveedorProducto.addItem(bodega);
							}
						}

						if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProveedorProducto!=null) { 
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_productoProveedorProducto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_productoProveedorProducto.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProveedorProducto!=null) { 
					}

					if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoProveedorProducto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoProveedorProducto.addItem(producto);
							}
						}

						if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProveedorProducto!=null) { 
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_clienteProveedorProducto.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_clienteProveedorProducto.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProveedorProducto!=null) { 
					}

					if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteProveedorProducto.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteProveedorProducto.addItem(cliente);
							}
						}

						if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_empresaProveedorProducto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_empresaProveedorProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_sucursalProveedorProducto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_sucursalProveedorProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_bodegaProveedorProducto.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_bodegaProveedorProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaProveedorProducto.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProveedorProducto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_productoProveedorProducto.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_productoProveedorProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoProveedorProducto.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoProveedorProducto.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_clienteProveedorProducto.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_clienteProveedorProducto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteProveedorProducto.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteProveedorProducto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProveedorProducto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProveedorProductoConstantesFunciones.refrescarForeignKeysDescripcionesProveedorProducto(this.proveedorproductoLogic.getProveedorProductos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProveedorProductoConstantesFunciones.refrescarForeignKeysDescripcionesProveedorProducto(this.proveedorproductos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Cliente.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//proveedorproductoLogic.setProveedorProductos(this.proveedorproductos);
			proveedorproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProveedorProductoParameterReturnGeneral getProveedorProductoParameterGeneral() {
		return this.proveedorproductoParameterGeneral;
	}
	
	public void setProveedorProductoParameterGeneral(ProveedorProductoParameterReturnGeneral proveedorproductoParameterGeneral) {
		this.proveedorproductoParameterGeneral = proveedorproductoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProveedorProducto() {
		return isPermisoTodoProveedorProducto;
	}

	public void setIsPermisoTodoProveedorProducto(Boolean isPermisoTodoProveedorProducto) {
		this.isPermisoTodoProveedorProducto = isPermisoTodoProveedorProducto;
	}

	public Boolean getIsPermisoNuevoProveedorProducto() {
		return isPermisoNuevoProveedorProducto;
	}

	public void setIsPermisoNuevoProveedorProducto(Boolean isPermisoNuevoProveedorProducto) {
		this.isPermisoNuevoProveedorProducto = isPermisoNuevoProveedorProducto;
	}

	public Boolean getIsPermisoActualizarProveedorProducto() {
		return isPermisoActualizarProveedorProducto;
	}

	public void setIsPermisoActualizarProveedorProducto(Boolean isPermisoActualizarProveedorProducto) {
		this.isPermisoActualizarProveedorProducto = isPermisoActualizarProveedorProducto;
	}

	public Boolean getIsPermisoEliminarProveedorProducto() {
		return isPermisoEliminarProveedorProducto;
	}

	public void setIsPermisoEliminarProveedorProducto(Boolean isPermisoEliminarProveedorProducto) {
		this.isPermisoEliminarProveedorProducto = isPermisoEliminarProveedorProducto;
	}

	public Boolean getIsPermisoGuardarCambiosProveedorProducto() {
		return isPermisoGuardarCambiosProveedorProducto;
	}

	public void setIsPermisoGuardarCambiosProveedorProducto(Boolean isPermisoGuardarCambiosProveedorProducto) {
		this.isPermisoGuardarCambiosProveedorProducto = isPermisoGuardarCambiosProveedorProducto;
	}
	
	public Boolean getIsPermisoConsultaProveedorProducto() {
		return isPermisoConsultaProveedorProducto;
	}

	public void setIsPermisoConsultaProveedorProducto(Boolean isPermisoConsultaProveedorProducto) {
		this.isPermisoConsultaProveedorProducto = isPermisoConsultaProveedorProducto;
	}

	public Boolean getIsPermisoBusquedaProveedorProducto() {
		return isPermisoBusquedaProveedorProducto;
	}

	public void setIsPermisoBusquedaProveedorProducto(Boolean isPermisoBusquedaProveedorProducto) {
		this.isPermisoBusquedaProveedorProducto = isPermisoBusquedaProveedorProducto;
	}

	public Boolean getIsPermisoReporteProveedorProducto() {
		return isPermisoReporteProveedorProducto;
	}

	public void setIsPermisoReporteProveedorProducto(Boolean isPermisoReporteProveedorProducto) {
		this.isPermisoReporteProveedorProducto = isPermisoReporteProveedorProducto;
	}
	
	public Boolean getIsPermisoPaginacionMedioProveedorProducto() {
		return isPermisoPaginacionMedioProveedorProducto;
	}

	public void setIsPermisoPaginacionMedioProveedorProducto(Boolean isPermisoPaginacionMedioProveedorProducto) {
		this.isPermisoPaginacionMedioProveedorProducto = isPermisoPaginacionMedioProveedorProducto;
	}
	
	public Boolean getIsPermisoPaginacionTodoProveedorProducto() {
		return isPermisoPaginacionTodoProveedorProducto;
	}

	public void setIsPermisoPaginacionTodoProveedorProducto(Boolean isPermisoPaginacionTodoProveedorProducto) {
		this.isPermisoPaginacionTodoProveedorProducto = isPermisoPaginacionTodoProveedorProducto;
	}
	
	public Boolean getIsPermisoPaginacionAltoProveedorProducto() {
		return isPermisoPaginacionAltoProveedorProducto;
	}

	public void setIsPermisoPaginacionAltoProveedorProducto(Boolean isPermisoPaginacionAltoProveedorProducto) {
		this.isPermisoPaginacionAltoProveedorProducto = isPermisoPaginacionAltoProveedorProducto;
	}
	
	public Boolean getIsPermisoCopiarProveedorProducto() {
		return isPermisoCopiarProveedorProducto;
	}

	public void setIsPermisoCopiarProveedorProducto(Boolean isPermisoCopiarProveedorProducto) {
		this.isPermisoCopiarProveedorProducto = isPermisoCopiarProveedorProducto;
	}
	
	public Boolean getIsPermisoVerFormProveedorProducto() {
		return isPermisoVerFormProveedorProducto;
	}

	public void setIsPermisoVerFormProveedorProducto(Boolean isPermisoVerFormProveedorProducto) {
		this.isPermisoVerFormProveedorProducto = isPermisoVerFormProveedorProducto;
	}
	
	public Boolean getIsPermisoDuplicarProveedorProducto() {
		return isPermisoDuplicarProveedorProducto;
	}

	public void setIsPermisoDuplicarProveedorProducto(Boolean isPermisoDuplicarProveedorProducto) {
		this.isPermisoDuplicarProveedorProducto = isPermisoDuplicarProveedorProducto;
	}
	
	public Boolean getIsPermisoOrdenProveedorProducto() {
		return isPermisoOrdenProveedorProducto;
	}

	public void setIsPermisoOrdenProveedorProducto(Boolean isPermisoOrdenProveedorProducto) {
		this.isPermisoOrdenProveedorProducto = isPermisoOrdenProveedorProducto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProveedorProducto() {
		return isVisibilidadCeldaNuevoProveedorProducto;
	}

	public void setIsVisibilidadCeldaNuevoProveedorProducto(Boolean isVisibilidadCeldaNuevoProveedorProducto) {
		this.isVisibilidadCeldaNuevoProveedorProducto = isVisibilidadCeldaNuevoProveedorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProveedorProducto() {
		return isVisibilidadCeldaDuplicarProveedorProducto;
	}

	public void setIsVisibilidadCeldaDuplicarProveedorProducto(Boolean isVisibilidadCeldaDuplicarProveedorProducto) {
		this.isVisibilidadCeldaDuplicarProveedorProducto = isVisibilidadCeldaDuplicarProveedorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProveedorProducto() {
		return isVisibilidadCeldaCopiarProveedorProducto;
	}

	public void setIsVisibilidadCeldaCopiarProveedorProducto(Boolean isVisibilidadCeldaCopiarProveedorProducto) {
		this.isVisibilidadCeldaCopiarProveedorProducto = isVisibilidadCeldaCopiarProveedorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProveedorProducto() {
		return isVisibilidadCeldaVerFormProveedorProducto;
	}

	public void setIsVisibilidadCeldaVerFormProveedorProducto(Boolean isVisibilidadCeldaVerFormProveedorProducto) {
		this.isVisibilidadCeldaVerFormProveedorProducto = isVisibilidadCeldaVerFormProveedorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProveedorProducto() {
		return isVisibilidadCeldaOrdenProveedorProducto;
	}

	public void setIsVisibilidadCeldaOrdenProveedorProducto(Boolean isVisibilidadCeldaOrdenProveedorProducto) {
		this.isVisibilidadCeldaOrdenProveedorProducto = isVisibilidadCeldaOrdenProveedorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProveedorProducto() {
		return isVisibilidadCeldaNuevoRelacionesProveedorProducto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProveedorProducto(Boolean isVisibilidadCeldaNuevoRelacionesProveedorProducto) {
		this.isVisibilidadCeldaNuevoRelacionesProveedorProducto = isVisibilidadCeldaNuevoRelacionesProveedorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProveedorProducto() {
		return isVisibilidadCeldaModificarProveedorProducto;
	}

	public void setIsVisibilidadCeldaModificarProveedorProducto(Boolean isVisibilidadCeldaModificarProveedorProducto) {
		this.isVisibilidadCeldaModificarProveedorProducto = isVisibilidadCeldaModificarProveedorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProveedorProducto() {
		return isVisibilidadCeldaActualizarProveedorProducto;
	}

	public void setIsVisibilidadCeldaActualizarProveedorProducto(Boolean isVisibilidadCeldaActualizarProveedorProducto) {
		this.isVisibilidadCeldaActualizarProveedorProducto = isVisibilidadCeldaActualizarProveedorProducto;
	}

	public Boolean getIsVisibilidadCeldaEliminarProveedorProducto() {
		return isVisibilidadCeldaEliminarProveedorProducto;
	}

	public void setIsVisibilidadCeldaEliminarProveedorProducto(Boolean isVisibilidadCeldaEliminarProveedorProducto) {
		this.isVisibilidadCeldaEliminarProveedorProducto = isVisibilidadCeldaEliminarProveedorProducto;
	}

	public Boolean getIsVisibilidadCeldaCancelarProveedorProducto() {
		return isVisibilidadCeldaCancelarProveedorProducto;
	}

	public void setIsVisibilidadCeldaCancelarProveedorProducto(Boolean isVisibilidadCeldaCancelarProveedorProducto) {
		this.isVisibilidadCeldaCancelarProveedorProducto = isVisibilidadCeldaCancelarProveedorProducto;
	}

	public Boolean getIsVisibilidadCeldaGuardarProveedorProducto() {
		return isVisibilidadCeldaGuardarProveedorProducto;
	}

	public void setIsVisibilidadCeldaGuardarProveedorProducto(Boolean isVisibilidadCeldaGuardarProveedorProducto) {
		this.isVisibilidadCeldaGuardarProveedorProducto = isVisibilidadCeldaGuardarProveedorProducto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProveedorProducto() {
		return isVisibilidadCeldaGuardarCambiosProveedorProducto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProveedorProducto(Boolean isVisibilidadCeldaGuardarCambiosProveedorProducto) {
		this.isVisibilidadCeldaGuardarCambiosProveedorProducto = isVisibilidadCeldaGuardarCambiosProveedorProducto;
	}
		
	public ProveedorProductoSessionBean getproveedorproductoSessionBean() {
		return this.proveedorproductoSessionBean;
	}
	
	public void setproveedorproductoSessionBean(ProveedorProductoSessionBean proveedorproductoSessionBean) {
		this.proveedorproductoSessionBean=proveedorproductoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(ProveedorProducto proveedorproducto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(proveedorproducto,null);
				this.setActualParaGuardarSucursalForeignKey(proveedorproducto,null);
				this.setActualParaGuardarBodegaForeignKey(proveedorproducto,null);
				this.setActualParaGuardarProductoForeignKey(proveedorproducto,null);
				this.setActualParaGuardarClienteForeignKey(proveedorproducto,null);
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
	
	public void bugActualizarReferenciaActual(ProveedorProducto proveedorproducto,ProveedorProducto proveedorproductoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProveedorProducto(proveedorproducto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		proveedorproductoAux.setId(proveedorproducto.getId());
		proveedorproductoAux.setVersionRow(proveedorproducto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProveedorProducto();
		
			int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProveedorProducto(this.proveedorproducto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = proveedorproductoValidator.getInvalidValues(this.proveedorproducto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			proveedorproductoLogic.setDatosCliente(datosCliente);
			proveedorproductoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				proveedorproductoAux=new  ProveedorProducto();
				
				proveedorproductoAux.setIsNew(true);
				proveedorproductoAux.setIsChanged(true);
				
				proveedorproductoAux.setProveedorProductoOriginal(this.proveedorproducto);
				
				proveedorproductoAux.setId(this.proveedorproducto.getId());	
				proveedorproductoAux.setVersionRow(this.proveedorproducto.getVersionRow());	
				proveedorproductoAux.setid_empresa(this.proveedorproducto.getid_empresa());	
				proveedorproductoAux.setid_sucursal(this.proveedorproducto.getid_sucursal());	
				proveedorproductoAux.setid_bodega(this.proveedorproducto.getid_bodega());	
				proveedorproductoAux.setid_producto(this.proveedorproducto.getid_producto());	
				proveedorproductoAux.setid_cliente(this.proveedorproducto.getid_cliente());	
				proveedorproductoAux.setultimo_precio(this.proveedorproducto.getultimo_precio());	
				proveedorproductoAux.setprecio_pactado(this.proveedorproducto.getprecio_pactado());	
				proveedorproductoAux.setdias_entrega(this.proveedorproducto.getdias_entrega());	
				proveedorproductoAux.setdescripcion(this.proveedorproducto.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.proveedorproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.proveedorproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(proveedorproductoAux,proveedorproductoLogic.getProveedorProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(proveedorproductoAux,proveedorproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.proveedorproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.proveedorproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						proveedorproductoLogic.saveProveedorProductos();//WithConnection
						//proveedorproductoLogic.getSetVersionRowProveedorProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.proveedorproducto,proveedorproductoAux);
					
					this.refrescarForeignKeysDescripcionesProveedorProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.proveedorproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								proveedorproductoLogic.saveProveedorProductoRelaciones(proveedorproductoAux);//WithConnection
								//proveedorproductoLogic.getSetVersionRowProveedorProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.proveedorproducto,proveedorproductoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.proveedorproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.proveedorproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(proveedorproductoAux,proveedorproductoLogic.getProveedorProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(proveedorproductoAux,proveedorproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.proveedorproducto,proveedorproductoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				proveedorproductoAux=new  ProveedorProducto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado() 
					|| (this.proveedorproductoSessionBean.getEsGuardarRelacionado() && this.proveedorproducto.getId()>=0)) {
						
					proveedorproductoAux.setIsNew(false);
				}
				
				proveedorproductoAux.setIsDeleted(false);
			
				proveedorproductoAux.setId(this.proveedorproducto.getId());	
				proveedorproductoAux.setVersionRow(this.proveedorproducto.getVersionRow());	
				proveedorproductoAux.setid_empresa(this.proveedorproducto.getid_empresa());	
				proveedorproductoAux.setid_sucursal(this.proveedorproducto.getid_sucursal());	
				proveedorproductoAux.setid_bodega(this.proveedorproducto.getid_bodega());	
				proveedorproductoAux.setid_producto(this.proveedorproducto.getid_producto());	
				proveedorproductoAux.setid_cliente(this.proveedorproducto.getid_cliente());	
				proveedorproductoAux.setultimo_precio(this.proveedorproducto.getultimo_precio());	
				proveedorproductoAux.setprecio_pactado(this.proveedorproducto.getprecio_pactado());	
				proveedorproductoAux.setdias_entrega(this.proveedorproducto.getdias_entrega());	
				proveedorproductoAux.setdescripcion(this.proveedorproducto.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(proveedorproductoAux,proveedorproductoLogic.getProveedorProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(proveedorproductoAux,proveedorproductos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.proveedorproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.proveedorproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						proveedorproductoLogic.saveProveedorProductos();//WithConnection
						//proveedorproductoLogic.getSetVersionRowProveedorProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.proveedorproducto,proveedorproductoAux);
					
					this.refrescarForeignKeysDescripcionesProveedorProducto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.proveedorproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								proveedorproductoLogic.saveProveedorProductoRelaciones(proveedorproductoAux);//WithConnection
								//proveedorproductoLogic.getSetVersionRowProveedorProductos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.proveedorproducto,proveedorproductoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.proveedorproductoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.proveedorproductoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(proveedorproductoAux,proveedorproductoLogic.getProveedorProductos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(proveedorproductoAux,proveedorproductos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.proveedorproducto,proveedorproductoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				proveedorproductoAux=new  ProveedorProducto();
				
				proveedorproductoAux.setIsNew(false);
				proveedorproductoAux.setIsChanged(false);
				
				proveedorproductoAux.setIsDeleted(true);
				
				proveedorproductoAux.setId(this.proveedorproducto.getId());	
				proveedorproductoAux.setVersionRow(this.proveedorproducto.getVersionRow());	
				proveedorproductoAux.setid_empresa(this.proveedorproducto.getid_empresa());	
				proveedorproductoAux.setid_sucursal(this.proveedorproducto.getid_sucursal());	
				proveedorproductoAux.setid_bodega(this.proveedorproducto.getid_bodega());	
				proveedorproductoAux.setid_producto(this.proveedorproducto.getid_producto());	
				proveedorproductoAux.setid_cliente(this.proveedorproducto.getid_cliente());	
				proveedorproductoAux.setultimo_precio(this.proveedorproducto.getultimo_precio());	
				proveedorproductoAux.setprecio_pactado(this.proveedorproducto.getprecio_pactado());	
				proveedorproductoAux.setdias_entrega(this.proveedorproducto.getdias_entrega());	
				proveedorproductoAux.setdescripcion(this.proveedorproducto.getdescripcion());	
				
				if(this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.proveedorproductoAux.getId()>=0) {	
						this.proveedorproductosEliminados.add(proveedorproductoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(proveedorproductoAux,proveedorproductoLogic.getProveedorProductos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(proveedorproductoAux,proveedorproductos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.proveedorproductoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.proveedorproductoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						proveedorproductoLogic.saveProveedorProductos();//WithConnection
						//proveedorproductoLogic.getSetVersionRowProveedorProductos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.proveedorproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								proveedorproductoLogic.saveProveedorProductoRelaciones(proveedorproductoAux);//WithConnection
								//proveedorproductoLogic.getSetVersionRowProveedorProductos();//WithConnection
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
							if(this.proveedorproductoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.proveedorproductoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(proveedorproductoAux,proveedorproductoLogic.getProveedorProductos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(proveedorproductoAux,proveedorproductos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.getProveedorProductos().addAll(this.proveedorproductosEliminados);
					
					proveedorproductoLogic.saveProveedorProductos();//WithConnection
					//proveedorproductoLogic.getSetVersionRowProveedorProductos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProveedorProducto();
				
				this.proveedorproductosEliminados= new ArrayList<ProveedorProducto>();		
			}
			
			if(this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Producto Proveedor GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.proveedorproducto=proveedorproductoAux;
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
      		//this.finishProcessProveedorProducto();
      	}
		
	}	
	
	public void actualizarRelaciones(ProveedorProducto proveedorproductoLocal) throws Exception {
		
		if(this.proveedorproductoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProveedorProducto proveedorproductoLocal) throws Exception {	
		if(this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				proveedorproductoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				proveedorproductoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				proveedorproductoLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				proveedorproductoLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				proveedorproductoLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProveedorProductoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = proveedorproductoValidator.getInvalidValues(this.proveedorproducto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProveedorProducto proveedorproducto,List<ProveedorProducto> proveedorproductos) throws Exception {
		try	{		
			ProveedorProductoConstantesFunciones.actualizarLista(proveedorproducto,proveedorproductos,this.proveedorproductoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProveedorProducto proveedorproducto,List<ProveedorProducto> proveedorproductos) throws Exception {
		try	{			
			ProveedorProductoConstantesFunciones.actualizarSelectedLista(proveedorproducto,proveedorproductos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProveedorProducto> proveedorproductosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				proveedorproductosLocal=this.proveedorproductoLogic.getProveedorProductos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				proveedorproductosLocal=this.proveedorproductos;
			}
			//ARCHITECTURE
		
			for(ProveedorProducto proveedorproductoLocal:proveedorproductosLocal) {
				if(this.permiteMantenimiento(proveedorproductoLocal) && proveedorproductoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProveedorProductoConstantesFunciones.getProveedorProductoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProveedorProductoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProveedorProducto.jLabelid_empresaProveedorProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProveedorProductoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProveedorProducto.jLabelid_sucursalProveedorProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProveedorProductoConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProveedorProducto.jLabelid_bodegaProveedorProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProveedorProductoConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProveedorProducto.jLabelid_productoProveedorProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProveedorProductoConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProveedorProducto.jLabelid_clienteProveedorProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProveedorProductoConstantesFunciones.ULTIMOPRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProveedorProducto.jLabelultimo_precioProveedorProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProveedorProductoConstantesFunciones.PRECIOPACTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProveedorProducto.jLabelprecio_pactadoProveedorProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProveedorProductoConstantesFunciones.DIASENTREGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProveedorProducto.jLabeldias_entregaProveedorProducto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProveedorProductoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProveedorProducto.jLabeldescripcionProveedorProducto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProveedorProducto.jLabelid_empresaProveedorProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProveedorProducto.jLabelid_sucursalProveedorProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProveedorProducto.jLabelid_bodegaProveedorProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProveedorProducto.jLabelid_productoProveedorProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProveedorProducto.jLabelid_clienteProveedorProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProveedorProducto.jLabelultimo_precioProveedorProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProveedorProducto.jLabelprecio_pactadoProveedorProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProveedorProducto.jLabeldias_entregaProveedorProducto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProveedorProducto.jLabeldescripcionProveedorProducto,"");
		
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
		this.iIdNuevoProveedorProducto--;	
		
		
		this.proveedorproductoAux=new ProveedorProducto();
		
		this.proveedorproductoAux.setId(this.iIdNuevoProveedorProducto);
		this.proveedorproductoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.proveedorproductoLogic.getProveedorProductos().add(this.proveedorproductoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.proveedorproductos.add(this.proveedorproductoAux);
		}
		//ARCHITECTURE
		
		this.proveedorproducto=this.proveedorproductoAux;
		
		if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProveedorProducto(this.proveedorproducto);
			this.setVariablesObjetoActualToFormularioForeignKeyProveedorProducto(this.proveedorproducto);
		}
				
		//this.setDefaultControlesProveedorProducto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProveedorProducto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProveedorProducto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProveedorProducto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProveedorProducto(this.proveedorproductoBean,this.proveedorproducto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProveedorProductoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.proveedorproductoSessionBean.getConGuardarRelaciones()) {
			classes=ProveedorProductoConstantesFunciones.getClassesRelationshipsOfProveedorProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.proveedorproductoReturnGeneral=proveedorproductoLogic.procesarEventosProveedorProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.proveedorproductoLogic.getProveedorProductos(),this.proveedorproducto,this.proveedorproductoParameterGeneral,this.isEsNuevoProveedorProducto,classes);//this.proveedorproductoLogic.getProveedorProducto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProveedorProducto(this.proveedorproductoReturnGeneral,this.proveedorproductoBean,false);
		
		if(this.proveedorproductoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProveedorProducto(this.proveedorproductoReturnGeneral.getProveedorProducto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProveedorProducto(this.proveedorproductoReturnGeneral.getProveedorProducto());
		}
		
		if(this.proveedorproductoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProveedorProducto(this.proveedorproductoReturnGeneral.getProveedorProducto(),classes);//this.proveedorproductoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProveedorProducto(this.proveedorproducto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProveedorProducto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProveedorProducto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProveedorProductoBeanSwingJInternalFrameAdditional.RecargarFormProveedorProducto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProveedorProducto(false);
						
			if(proveedorproductoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProveedorProducto();
			}
			
			this.actualizarVisualTableDatosProveedorProducto();
			
			this.jTableDatosProveedorProducto.setRowSelectionInterval(this.getIndiceNuevoProveedorProducto(), this.getIndiceNuevoProveedorProducto());
			
			this.seleccionarFilaTablaProveedorProductoActual();
						
			this.actualizarEstadoCeldasBotonesProveedorProducto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProveedorProducto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProveedorProducto.jTextFieldultimo_precioProveedorProducto.setEnabled(isHabilitar && this.proveedorproductoConstantesFunciones.activarultimo_precioProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jTextFieldprecio_pactadoProveedorProducto.setEnabled(isHabilitar && this.proveedorproductoConstantesFunciones.activarprecio_pactadoProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jTextFielddias_entregaProveedorProducto.setEnabled(isHabilitar && this.proveedorproductoConstantesFunciones.activardias_entregaProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jTextAreadescripcionProveedorProducto.setEnabled(isHabilitar && this.proveedorproductoConstantesFunciones.activardescripcionProveedorProducto);	
		//
		this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_empresaProveedorProducto.setEnabled(isHabilitar && this.proveedorproductoConstantesFunciones.activarid_empresaProveedorProducto);//
		this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_sucursalProveedorProducto.setEnabled(isHabilitar && this.proveedorproductoConstantesFunciones.activarid_sucursalProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_bodegaProveedorProducto.setEnabled(isHabilitar && this.proveedorproductoConstantesFunciones.activarid_bodegaProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_productoProveedorProducto.setEnabled(isHabilitar && this.proveedorproductoConstantesFunciones.activarid_productoProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_clienteProveedorProducto.setEnabled(isHabilitar && this.proveedorproductoConstantesFunciones.activarid_clienteProveedorProducto);
	};
	
	public void setDefaultControlesProveedorProducto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProveedorProducto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.proveedorproductoSessionBean.setConGuardarRelaciones(true);			
			this.proveedorproductoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProveedorProducto.jTabbedPaneRelacionesProveedorProducto.setVisible(true);
			
					
		} else {
			//this.proveedorproductoSessionBean.setConGuardarRelaciones(false);			
			this.proveedorproductoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProveedorProducto.jTabbedPaneRelacionesProveedorProducto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProveedorProducto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProveedorProducto proveedorproductoAux:this.proveedorproductoLogic.getProveedorProductos()) {
				if(proveedorproductoAux.getId().equals(this.iIdNuevoProveedorProducto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProveedorProducto proveedorproductoAux:this.proveedorproductos) {
				if(proveedorproductoAux.getId().equals(this.iIdNuevoProveedorProducto)) {
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
	
	public int getIndiceActualProveedorProducto(ProveedorProducto proveedorproducto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProveedorProducto proveedorproductoAux:this.proveedorproductoLogic.getProveedorProductos()) {
				if(proveedorproductoAux.getId().equals(proveedorproducto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProveedorProducto proveedorproductoAux:this.proveedorproductos) {
				if(proveedorproductoAux.getId().equals(proveedorproducto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProveedorProducto(ProveedorProducto proveedorproductoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProveedorProducto proveedorproductoAux:this.proveedorproductoLogic.getProveedorProductos()) {
				if(proveedorproductoAux.getProveedorProductoOriginal().getId().equals(proveedorproductoOriginal.getId())) {
					existe=true;
					proveedorproductoOriginal.setId(proveedorproductoAux.getId());
					proveedorproductoOriginal.setVersionRow(proveedorproductoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProveedorProducto proveedorproductoAux:this.proveedorproductos) {
				if(proveedorproductoAux.getProveedorProductoOriginal().getId().equals(proveedorproductoOriginal.getId())) {
					existe=true;
					proveedorproductoOriginal.setId(proveedorproductoAux.getId());
					proveedorproductoOriginal.setVersionRow(proveedorproductoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProveedorProducto(Boolean esParaCancelar) throws Exception {
		proveedorproductosAux=new ArrayList<ProveedorProducto>();
		proveedorproductoAux=new ProveedorProducto();
		
		if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProveedorProducto proveedorproductoAux:this.proveedorproductoLogic.getProveedorProductos()) {
					if(proveedorproductoAux.getId()<0) {
						proveedorproductosAux.add(proveedorproductoAux);
					}		
				}
				this.iIdNuevoProveedorProducto=0L;
				this.proveedorproductoLogic.getProveedorProductos().removeAll(proveedorproductosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProveedorProducto proveedorproductoAux:this.proveedorproductos) {
					if(proveedorproductoAux.getId()<0) {
						proveedorproductosAux.add(proveedorproductoAux);
					}		
				}
				this.iIdNuevoProveedorProducto=0L;
				this.proveedorproductos.removeAll(proveedorproductosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProveedorProducto 
					&& this.proveedorproductoLogic.getProveedorProductos().size()>0
					) {
					proveedorproductoAux=this.proveedorproductoLogic.getProveedorProductos().get(this.proveedorproductoLogic.getProveedorProductos().size() - 1);
				
					if(proveedorproductoAux.getId()<0) {
						this.proveedorproductoLogic.getProveedorProductos().remove(proveedorproductoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProveedorProducto && this.proveedorproductos.size()>0) {
					proveedorproductoAux=this.proveedorproductos.get(this.proveedorproductos.size() - 1);
				
					if(proveedorproductoAux.getId()<0) {
						this.proveedorproductos.remove(proveedorproductoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProveedorProducto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(proveedorproducto.getId()<0) {
				this.proveedorproductoLogic.getProveedorProductos().remove(this.proveedorproducto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(proveedorproducto.getId()<0) {
				this.proveedorproductos.remove(this.proveedorproducto);
			}
		}			
	}
	
	public void setEstadosInicialesProveedorProducto(List<ProveedorProducto> proveedorproductosAux) throws Exception {
		ProveedorProductoConstantesFunciones.setEstadosInicialesProveedorProducto(proveedorproductosAux);
	}
	
	public void setEstadosInicialesProveedorProducto(ProveedorProducto proveedorproductoAux) throws Exception {
		ProveedorProductoConstantesFunciones.setEstadosInicialesProveedorProducto(proveedorproductoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProveedorProductoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProveedorProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProveedorProductoActual()) {
				if(!this.isEsNuevoProveedorProducto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProveedorProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProveedorProducto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProveedorProductoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Producto Proveedor ?", "MANTENIMIENTO DE Producto Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProveedorProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProveedorProducto proveedorproducto) throws Exception {
		ProveedorProductoConstantesFunciones.seleccionarAsignar(this.proveedorproducto,proveedorproducto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProveedorProducto=this.isPermisoActualizarOriginalProveedorProducto;
			
			
			this.seleccionarAsignar(proveedorproducto);
			
			

			idProductoActual=proveedorproducto.getid_producto();
			this.seleccionarProductoActual();

			idClienteActual=proveedorproducto.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProveedorProductoConstantesFunciones.quitarEspaciosProveedorProducto(this.proveedorproducto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProveedorProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.proveedorproductoSessionBean.setsFuncionBusquedaRapida(this.proveedorproductoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
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
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
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
			if(this.isEsNuevoProveedorProducto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProveedorProducto(esParaCancelar);				
				this.cancelarNuevoProveedorProducto(esParaCancelar);								
			}
			
			this.proveedorproducto=new ProveedorProducto();
			
			this.inicializarProveedorProducto();
			
			this.actualizarEstadoCeldasBotonesProveedorProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProveedorProducto() throws Exception {
		try {
			ProveedorProductoConstantesFunciones.inicializarProveedorProducto(this.proveedorproducto);
			
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
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.proveedorproductoLogic.getProveedorProductos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProveedorProductos(String sAccionBusqueda,List<ProveedorProducto> proveedorproductosParaReportes) throws Exception {
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
					sPathReporteFinal="ProveedorProducto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProveedorProductoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProveedorProductoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProveedorProducto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Producto Proveedors");		
		parameters.put("busquedapor", ProveedorProductoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProveedorProducto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProveedorProductoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProveedorProductoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProveedorProducto=new JRBeanArrayDataSource(ProveedorProductoJInternalFrame.TraerProveedorProductoBeans(proveedorproductosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProveedorProducto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProveedorProductoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProveedorProductoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProveedorProductoBean.TraerProveedorProductoBeans(proveedorproductosParaReportes).toArray()));
							
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
				this.generarExcelReporteProveedorProductos(sAccionBusqueda,sTipoArchivoReporte,proveedorproductosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProveedorProductos(sAccionBusqueda,sTipoArchivoReporte,proveedorproductosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProveedorProductoActionPerformed(null);
					//this.generarExcelReporteProveedorProductos(sAccionBusqueda,sTipoArchivoReporte,proveedorproductosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProveedorProductos(sAccionBusqueda,sTipoArchivoReporte,proveedorproductosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProveedorProductos(sAccionBusqueda,sTipoArchivoReporte,proveedorproductosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProveedorProductos(sAccionBusqueda,sTipoArchivoReporte,proveedorproductosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProveedorProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProveedorProducto> proveedorproductosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"proveedorproducto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProveedorProductos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProveedorProducto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProveedorProducto proveedorproducto : proveedorproductosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProveedorProductoConstantesFunciones.generarExcelReporteDataProveedorProducto("NORMAL",row,workbook,proveedorproducto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProveedorProducto(String sTipo,Row row,Workbook workbook) {
		
		ProveedorProductoConstantesFunciones.generarExcelReporteHeaderProveedorProducto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProveedorProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProveedorProducto> proveedorproductosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"proveedorproducto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProveedorProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProveedorProducto proveedorproducto : proveedorproductosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProveedorProductoConstantesFunciones.getProveedorProductoDescripcion(proveedorproducto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProveedorProductoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(proveedorproducto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProveedorProductoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(proveedorproducto.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProveedorProductoConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(proveedorproducto.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(proveedorproducto.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(proveedorproducto.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(proveedorproducto.getultimo_precio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(proveedorproducto.getprecio_pactado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(proveedorproducto.getdias_entrega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(proveedorproducto.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProveedorProductos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProveedorProducto> proveedorproductosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProveedorProducto> proveedorproductosRespaldo=null;
		
		classes=ProveedorProductoConstantesFunciones.getClassesRelationshipsOfProveedorProducto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.proveedorproductoLogic.setDatosCliente(this.datosCliente);
		this.proveedorproductoLogic.setDatosDeep(this.datosDeep);
		this.proveedorproductoLogic.setIsConDeep(true);
		
		proveedorproductosRespaldo=this.proveedorproductoLogic.getProveedorProductos();
		
		this.proveedorproductoLogic.setProveedorProductos(proveedorproductosParaReportes);	
		this.proveedorproductoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		proveedorproductosParaReportes=this.proveedorproductoLogic.getProveedorProductos();
		this.proveedorproductoLogic.setProveedorProductos(proveedorproductosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"proveedorproducto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProveedorProductos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProveedorProducto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProveedorProducto proveedorproducto : proveedorproductosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProveedorProducto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProveedorProductoConstantesFunciones.generarExcelReporteDataProveedorProducto("NORMAL",row,workbook,proveedorproducto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProveedorProductoConstantesFunciones.getProveedorProductoDescripcion(proveedorproducto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProveedorProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProveedorProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProveedorProducto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProveedorProducto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProveedorProducto() throws Exception {		
		this.startProcessProveedorProducto(true);
	}
	
	public void startProcessProveedorProducto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProveedorProducto ,this.jPanelParametrosReportesProveedorProducto, this.jScrollPanelDatosProveedorProducto,this.jPanelPaginacionProveedorProducto, this.jScrollPanelDatosEdicionProveedorProducto, this.jPanelAccionesProveedorProducto,this.jPanelAccionesFormularioProveedorProducto,this.jmenuBarProveedorProducto,this.jmenuBarDetalleProveedorProducto,this.jTtoolBarProveedorProducto,this.jTtoolBarDetalleProveedorProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasProveedorProducto=this.jTabbedPaneBusquedasProveedorProducto; 
		
		final JPanel jPanelParametrosReportesProveedorProducto=this.jPanelParametrosReportesProveedorProducto;
		//final JScrollPane jScrollPanelDatosProveedorProducto=this.jScrollPanelDatosProveedorProducto;
		final JTable jTableDatosProveedorProducto=this.jTableDatosProveedorProducto;		
		final JPanel jPanelPaginacionProveedorProducto=this.jPanelPaginacionProveedorProducto;
		//final JScrollPane jScrollPanelDatosEdicionProveedorProducto=this.jScrollPanelDatosEdicionProveedorProducto;
		final JPanel jPanelAccionesProveedorProducto=this.jPanelAccionesProveedorProducto;
		
		JPanel jPanelCamposAuxiliarProveedorProducto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProveedorProducto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
			jPanelCamposAuxiliarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jPanelCamposProveedorProducto;
			jPanelAccionesFormularioAuxiliarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jPanelAccionesFormularioProveedorProducto;
		}
		
		final JPanel jPanelCamposProveedorProducto=jPanelCamposAuxiliarProveedorProducto;
		final JPanel jPanelAccionesFormularioProveedorProducto=jPanelAccionesFormularioAuxiliarProveedorProducto;
		
		
		final JMenuBar jmenuBarProveedorProducto=this.jmenuBarProveedorProducto;
		final JToolBar jTtoolBarProveedorProducto=this.jTtoolBarProveedorProducto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProveedorProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProveedorProducto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
			jmenuBarDetalleAuxiliarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jmenuBarDetalleProveedorProducto;
			jTtoolBarDetalleAuxiliarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jTtoolBarDetalleProveedorProducto;
		}
		
		final JMenuBar jmenuBarDetalleProveedorProducto=jmenuBarDetalleAuxiliarProveedorProducto;
		final JToolBar jTtoolBarDetalleProveedorProducto=jTtoolBarDetalleAuxiliarProveedorProducto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProveedorProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProveedorProducto;
			processRunnable.jTableDatos=jTableDatosProveedorProducto;
			processRunnable.jPanelCampos=jPanelCamposProveedorProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionProveedorProducto;
			processRunnable.jPanelAcciones=jPanelAccionesProveedorProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProveedorProducto;
			
			
			processRunnable.jmenuBar=jmenuBarProveedorProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProveedorProducto;
			processRunnable.jTtoolBar=jTtoolBarProveedorProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProveedorProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProveedorProducto ,jPanelParametrosReportesProveedorProducto,jTableDatosProveedorProducto, /*jScrollPanelDatosProveedorProducto,*/jPanelCamposProveedorProducto,jPanelPaginacionProveedorProducto, /*jScrollPanelDatosEdicionProveedorProducto,*/ jPanelAccionesProveedorProducto,jPanelAccionesFormularioProveedorProducto,jmenuBarProveedorProducto,jmenuBarDetalleProveedorProducto,jTtoolBarProveedorProducto,jTtoolBarDetalleProveedorProducto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProveedorProducto ,jPanelParametrosReportesProveedorProducto, jScrollPanelDatosProveedorProducto,jPanelPaginacionProveedorProducto, jScrollPanelDatosEdicionProveedorProducto, jPanelAccionesProveedorProducto,jPanelAccionesFormularioProveedorProducto,jmenuBarProveedorProducto,jmenuBarDetalleProveedorProducto,jTtoolBarProveedorProducto,jTtoolBarDetalleProveedorProducto);
						
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
	
	public void finishProcessProveedorProducto() {// throws Exception 
		this.finishProcessProveedorProducto(true);
	}
	
	public void finishProcessProveedorProducto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProveedorProducto ,this.jPanelParametrosReportesProveedorProducto, this.jScrollPanelDatosProveedorProducto,this.jPanelPaginacionProveedorProducto, this.jScrollPanelDatosEdicionProveedorProducto, this.jPanelAccionesProveedorProducto,this.jPanelAccionesFormularioProveedorProducto,this.jmenuBarProveedorProducto,this.jmenuBarDetalleProveedorProducto,this.jTtoolBarProveedorProducto,this.jTtoolBarDetalleProveedorProducto);		
		
		final JTabbedPane jTabbedPaneBusquedasProveedorProducto=this.jTabbedPaneBusquedasProveedorProducto; 
		
		final JPanel jPanelParametrosReportesProveedorProducto=this.jPanelParametrosReportesProveedorProducto;
		//final JScrollPane jScrollPanelDatosProveedorProducto=this.jScrollPanelDatosProveedorProducto;
		final JTable jTableDatosProveedorProducto=this.jTableDatosProveedorProducto;		
		final JPanel jPanelPaginacionProveedorProducto=this.jPanelPaginacionProveedorProducto;
		//final JScrollPane jScrollPanelDatosEdicionProveedorProducto=this.jScrollPanelDatosEdicionProveedorProducto;
		final JPanel jPanelAccionesProveedorProducto=this.jPanelAccionesProveedorProducto;
		
		JPanel jPanelCamposAuxiliarProveedorProducto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProveedorProducto=new JPanel();
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
			jPanelCamposAuxiliarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jPanelCamposProveedorProducto;
			jPanelAccionesFormularioAuxiliarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jPanelAccionesFormularioProveedorProducto;
		}
		
		final JPanel jPanelCamposProveedorProducto=jPanelCamposAuxiliarProveedorProducto;
		final JPanel jPanelAccionesFormularioProveedorProducto=jPanelAccionesFormularioAuxiliarProveedorProducto;
		
		
		final JMenuBar jmenuBarProveedorProducto=this.jmenuBarProveedorProducto;		
		final JToolBar jTtoolBarProveedorProducto=this.jTtoolBarProveedorProducto;
				
		JMenuBar jmenuBarDetalleAuxiliarProveedorProducto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProveedorProducto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
			jmenuBarDetalleAuxiliarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jmenuBarDetalleProveedorProducto;
			jTtoolBarDetalleAuxiliarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jTtoolBarDetalleProveedorProducto;		
		}
		
		final JMenuBar jmenuBarDetalleProveedorProducto=jmenuBarDetalleAuxiliarProveedorProducto;
		final JToolBar jTtoolBarDetalleProveedorProducto=jTtoolBarDetalleAuxiliarProveedorProducto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProveedorProducto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProveedorProducto;
			processRunnable.jTableDatos=jTableDatosProveedorProducto;
			processRunnable.jPanelCampos=jPanelCamposProveedorProducto;
			processRunnable.jPanelPaginacion=jPanelPaginacionProveedorProducto;
			processRunnable.jPanelAcciones=jPanelAccionesProveedorProducto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProveedorProducto;
			
			
			processRunnable.jmenuBar=jmenuBarProveedorProducto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProveedorProducto;
			processRunnable.jTtoolBar=jTtoolBarProveedorProducto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProveedorProducto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProveedorProducto ,jPanelParametrosReportesProveedorProducto, jTableDatosProveedorProducto,/*jScrollPanelDatosProveedorProducto,*/jPanelCamposProveedorProducto,jPanelPaginacionProveedorProducto, /*jScrollPanelDatosEdicionProveedorProducto,*/ jPanelAccionesProveedorProducto,jPanelAccionesFormularioProveedorProducto,jmenuBarProveedorProducto,jmenuBarDetalleProveedorProducto,jTtoolBarProveedorProducto,jTtoolBarDetalleProveedorProducto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProveedorProducto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProveedorProducto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProveedorProducto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProveedorProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProveedorProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProveedorProducto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProveedorProducto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProveedorProducto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProveedorProducto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.proveedorproductoConstantesFunciones.getsFinalQueryProveedorProducto();
		String  finalQueryPaginacionTodos=this.proveedorproductoConstantesFunciones.getsFinalQueryProveedorProducto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProveedorProductoConstantesFunciones.getArrayColumnasGlobalesNoProveedorProducto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProveedorProductoConstantesFunciones.getArrayColumnasGlobalesProveedorProducto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProveedorProductoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.proveedorproductosEliminados= new ArrayList<ProveedorProducto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProveedorProducto();
		
				///*ProveedorProductoSessionBean*/this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
			
			if(this.proveedorproductoSessionBean==null) {
				this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
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
					this.iNumeroPaginacion=ProveedorProductoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProveedorProductoConstantesFunciones.getClassesForeignKeysOfProveedorProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/proveedorproducto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			proveedorproductosAux= new ArrayList<ProveedorProducto>();
			
				
			proveedorproductoLogic.setDatosCliente(this.datosCliente);
			proveedorproductoLogic.setDatosDeep(this.datosDeep);
			proveedorproductoLogic.setIsConDeep(true);
			
			
			proveedorproductoLogic.getProveedorProductoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					proveedorproductoLogic.getTodosProveedorProductos(finalQueryGlobal,pagination);
					
					//proveedorproductoLogic.getTodosProveedorProductosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(proveedorproductoLogic.getProveedorProductos()==null|| proveedorproductoLogic.getProveedorProductos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							proveedorproductosAux= new ArrayList<ProveedorProducto>();
							proveedorproductosAux.addAll(proveedorproductoLogic.getProveedorProductos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							proveedorproductosAux= new ArrayList<ProveedorProducto>();
							proveedorproductosAux.addAll(proveedorproductos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							proveedorproductoLogic.getTodosProveedorProductos(finalQueryGlobal+"",this.pagination);												
							
							//proveedorproductoLogic.getTodosProveedorProductosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProveedorProductos("Todos",proveedorproductoLogic.getProveedorProductos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							proveedorproductoLogic.setProveedorProductos(new ArrayList<ProveedorProducto>());					
							proveedorproductoLogic.getProveedorProductos().addAll(proveedorproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							proveedorproductos=new ArrayList<ProveedorProducto>();
							proveedorproductos.addAll(proveedorproductosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProveedorProducto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProveedorProducto=this.idActual;
				
				} else if(this.idProveedorProductoActual!=null && this.idProveedorProductoActual!=0L) {
					idProveedorProducto=idProveedorProductoActual;
				}
				
					
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndicePorId(idProveedorProducto);
				
				this.proveedorproductos=new ArrayList<ProveedorProducto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					proveedorproductoLogic.getEntity(idProveedorProducto);
					
					//proveedorproductoLogic.getEntityWithConnection(idProveedorProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					proveedorproductoLogic.setProveedorProductos(new ArrayList<ProveedorProducto>());
					proveedorproductoLogic.getProveedorProductos().add(proveedorproductoLogic.getProveedorProducto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.proveedorproductos=new ArrayList<ProveedorProducto>();
					this.proveedorproductos.add(proveedorproducto);
				}
				
				if(proveedorproductoLogic.getProveedorProducto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					proveedorproductoLogic.getProveedorProductosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=proveedorproductoLogic.getProveedorProductos()==null||proveedorproductoLogic.getProveedorProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=proveedorproductos==null|| proveedorproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						proveedorproductosAux=new ArrayList<ProveedorProducto>();
						proveedorproductosAux.addAll(proveedorproductoLogic.getProveedorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							proveedorproductosAux=new ArrayList<ProveedorProducto>();
							proveedorproductosAux.addAll(proveedorproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							proveedorproductoLogic.getProveedorProductosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProveedorProductos("FK_IdBodega",proveedorproductoLogic.getProveedorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProveedorProductos("FK_IdBodega",proveedorproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						proveedorproductoLogic.setProveedorProductos(new ArrayList<ProveedorProducto>());
						proveedorproductoLogic.getProveedorProductos().addAll(proveedorproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							proveedorproductos=new ArrayList<ProveedorProducto>();
							proveedorproductos.addAll(proveedorproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					proveedorproductoLogic.getProveedorProductosFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=proveedorproductoLogic.getProveedorProductos()==null||proveedorproductoLogic.getProveedorProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=proveedorproductos==null|| proveedorproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						proveedorproductosAux=new ArrayList<ProveedorProducto>();
						proveedorproductosAux.addAll(proveedorproductoLogic.getProveedorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							proveedorproductosAux=new ArrayList<ProveedorProducto>();
							proveedorproductosAux.addAll(proveedorproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							proveedorproductoLogic.getProveedorProductosFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProveedorProductos("FK_IdCliente",proveedorproductoLogic.getProveedorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProveedorProductos("FK_IdCliente",proveedorproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						proveedorproductoLogic.setProveedorProductos(new ArrayList<ProveedorProducto>());
						proveedorproductoLogic.getProveedorProductos().addAll(proveedorproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							proveedorproductos=new ArrayList<ProveedorProducto>();
							proveedorproductos.addAll(proveedorproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					proveedorproductoLogic.getProveedorProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=proveedorproductoLogic.getProveedorProductos()==null||proveedorproductoLogic.getProveedorProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=proveedorproductos==null|| proveedorproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						proveedorproductosAux=new ArrayList<ProveedorProducto>();
						proveedorproductosAux.addAll(proveedorproductoLogic.getProveedorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							proveedorproductosAux=new ArrayList<ProveedorProducto>();
							proveedorproductosAux.addAll(proveedorproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							proveedorproductoLogic.getProveedorProductosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProveedorProductos("FK_IdEmpresa",proveedorproductoLogic.getProveedorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProveedorProductos("FK_IdEmpresa",proveedorproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						proveedorproductoLogic.setProveedorProductos(new ArrayList<ProveedorProducto>());
						proveedorproductoLogic.getProveedorProductos().addAll(proveedorproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							proveedorproductos=new ArrayList<ProveedorProducto>();
							proveedorproductos.addAll(proveedorproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					proveedorproductoLogic.getProveedorProductosFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=proveedorproductoLogic.getProveedorProductos()==null||proveedorproductoLogic.getProveedorProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=proveedorproductos==null|| proveedorproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						proveedorproductosAux=new ArrayList<ProveedorProducto>();
						proveedorproductosAux.addAll(proveedorproductoLogic.getProveedorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							proveedorproductosAux=new ArrayList<ProveedorProducto>();
							proveedorproductosAux.addAll(proveedorproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							proveedorproductoLogic.getProveedorProductosFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProveedorProductos("FK_IdProducto",proveedorproductoLogic.getProveedorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProveedorProductos("FK_IdProducto",proveedorproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						proveedorproductoLogic.setProveedorProductos(new ArrayList<ProveedorProducto>());
						proveedorproductoLogic.getProveedorProductos().addAll(proveedorproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							proveedorproductos=new ArrayList<ProveedorProducto>();
							proveedorproductos.addAll(proveedorproductosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					proveedorproductoLogic.getProveedorProductosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=proveedorproductoLogic.getProveedorProductos()==null||proveedorproductoLogic.getProveedorProductos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=proveedorproductos==null|| proveedorproductos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						proveedorproductosAux=new ArrayList<ProveedorProducto>();
						proveedorproductosAux.addAll(proveedorproductoLogic.getProveedorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							proveedorproductosAux=new ArrayList<ProveedorProducto>();
							proveedorproductosAux.addAll(proveedorproductos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							proveedorproductoLogic.getProveedorProductosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProveedorProductoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProveedorProductos("FK_IdSucursal",proveedorproductoLogic.getProveedorProductos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProveedorProductos("FK_IdSucursal",proveedorproductos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						proveedorproductoLogic.setProveedorProductos(new ArrayList<ProveedorProducto>());
						proveedorproductoLogic.getProveedorProductos().addAll(proveedorproductosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							proveedorproductos=new ArrayList<ProveedorProducto>();
							proveedorproductos.addAll(proveedorproductosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProveedorProducto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProveedorProducto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=proveedorproductoLogic.getProveedorProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=proveedorproductos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=proveedorproductoLogic.getProveedorProductos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=proveedorproductos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProveedorProducto proveedorproducto) {
		Boolean permite=true;
		
		if(this.proveedorproducto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProveedorProductoConstantesFunciones.getOrderByListaProveedorProducto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProveedorProductoConstantesFunciones.getOrderByListaProveedorProducto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProveedorProducto proveedorproducto:proveedorproductoLogic.getProveedorProductos()) {
				if(proveedorproducto.getsType().equals(Constantes2.S_TOTALES)) {
					proveedorproductoTotales=proveedorproducto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProveedorProducto proveedorproducto:this.proveedorproductos) {
				if(proveedorproducto.getsType().equals(Constantes2.S_TOTALES)) {
					proveedorproductoTotales=proveedorproducto;
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
			this.proveedorproductoAux=new ProveedorProducto();
			this.proveedorproductoAux.setsType(Constantes2.S_TOTALES);
			this.proveedorproductoAux.setIsNew(false);
			this.proveedorproductoAux.setIsChanged(false);
			this.proveedorproductoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProveedorProductoConstantesFunciones.TotalizarValoresFilaProveedorProducto(this.proveedorproductoLogic.getProveedorProductos(),this.proveedorproductoAux);
				
				this.proveedorproductoLogic.getProveedorProductos().add(this.proveedorproductoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProveedorProductoConstantesFunciones.TotalizarValoresFilaProveedorProducto(this.proveedorproductos,this.proveedorproductoAux);
				
				this.proveedorproductos.add(this.proveedorproductoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		proveedorproductoTotales=new ProveedorProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.proveedorproductoLogic.getProveedorProductos().remove(proveedorproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.proveedorproductos.remove(proveedorproductoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		proveedorproductoTotales=new ProveedorProducto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProveedorProducto proveedorproducto:proveedorproductoLogic.getProveedorProductos()) {
				if(proveedorproducto.getsType().equals(Constantes2.S_TOTALES)) {
					proveedorproductoTotales=proveedorproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProveedorProductoConstantesFunciones.TotalizarValoresFilaProveedorProducto(this.proveedorproductoLogic.getProveedorProductos(),proveedorproductoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProveedorProducto proveedorproducto:this.proveedorproductos) {
				if(proveedorproducto.getsType().equals(Constantes2.S_TOTALES)) {
					proveedorproductoTotales=proveedorproducto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProveedorProductoConstantesFunciones.TotalizarValoresFilaProveedorProducto(this.proveedorproductos,proveedorproductoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProveedorProductosFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProveedorProductosFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProveedorProductosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProveedorProductosFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProveedorProductosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProveedorProductosFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					proveedorproductoLogic.getProveedorProductosFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProveedorProductosFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					proveedorproductoLogic.getProveedorProductosFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProveedorProductosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					proveedorproductoLogic.getProveedorProductosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProveedorProductosFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					proveedorproductoLogic.getProveedorProductosFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProveedorProductosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					proveedorproductoLogic.getProveedorProductosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProveedorProducto() {
		this.isPermisoTodoProveedorProducto=false;
		this.isPermisoNuevoProveedorProducto=false;
		this.isPermisoActualizarProveedorProducto=false;
		this.isPermisoActualizarOriginalProveedorProducto=false;
		this.isPermisoEliminarProveedorProducto=false;
		this.isPermisoGuardarCambiosProveedorProducto=false;
		this.isPermisoConsultaProveedorProducto=false;
		this.isPermisoBusquedaProveedorProducto=false;
		this.isPermisoReporteProveedorProducto=false;		
		this.isPermisoOrdenProveedorProducto=false;		
		this.isPermisoPaginacionMedioProveedorProducto=false;		
		this.isPermisoPaginacionAltoProveedorProducto=false;
		this.isPermisoPaginacionTodoProveedorProducto=false;
		this.isPermisoCopiarProveedorProducto=false;		
		this.isPermisoVerFormProveedorProducto=false;		
		this.isPermisoDuplicarProveedorProducto=false;		
		this.isPermisoOrdenProveedorProducto=false;		
	}
	
	public void setPermisosUsuarioProveedorProducto(Boolean isPermiso) {
		this.isPermisoTodoProveedorProducto=isPermiso;
		this.isPermisoNuevoProveedorProducto=isPermiso;
		this.isPermisoActualizarProveedorProducto=isPermiso;
		this.isPermisoActualizarOriginalProveedorProducto=isPermiso;
		this.isPermisoEliminarProveedorProducto=isPermiso;
		this.isPermisoGuardarCambiosProveedorProducto=isPermiso;
		this.isPermisoConsultaProveedorProducto=isPermiso;
		this.isPermisoBusquedaProveedorProducto=isPermiso;
		this.isPermisoReporteProveedorProducto=isPermiso;
		this.isPermisoOrdenProveedorProducto=isPermiso;		
		this.isPermisoPaginacionMedioProveedorProducto=isPermiso;		
		this.isPermisoPaginacionAltoProveedorProducto=isPermiso;		
		this.isPermisoPaginacionTodoProveedorProducto=isPermiso;		
		this.isPermisoCopiarProveedorProducto=isPermiso;		
		this.isPermisoVerFormProveedorProducto=isPermiso;		
		this.isPermisoDuplicarProveedorProducto=isPermiso;
		this.isPermisoOrdenProveedorProducto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProveedorProducto(Boolean isPermiso) {
		//this.isPermisoTodoProveedorProducto=isPermiso;
		this.isPermisoNuevoProveedorProducto=isPermiso;
		this.isPermisoActualizarProveedorProducto=isPermiso;
		this.isPermisoActualizarOriginalProveedorProducto=isPermiso;
		this.isPermisoEliminarProveedorProducto=isPermiso;
		this.isPermisoGuardarCambiosProveedorProducto=isPermiso;
		//this.isPermisoConsultaProveedorProducto=isPermiso;
		//this.isPermisoBusquedaProveedorProducto=isPermiso;
		//this.isPermisoReporteProveedorProducto=isPermiso;
		//this.isPermisoOrdenProveedorProducto=isPermiso;		
		//this.isPermisoPaginacionMedioProveedorProducto=isPermiso;		
		//this.isPermisoPaginacionAltoProveedorProducto=isPermiso;		
		//this.isPermisoPaginacionTodoProveedorProducto=isPermiso;		
		//this.isPermisoCopiarProveedorProducto=isPermiso;		
		//this.isPermisoDuplicarProveedorProducto=isPermiso;
		//this.isPermisoOrdenProveedorProducto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProveedorProductoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProveedorProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProveedorProducto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProveedorProductoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProveedorProductoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProveedorProductoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProveedorProductoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProveedorProducto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProveedorProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProveedorProductoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProveedorProducto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProveedorProducto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProveedorProducto=this.isPermisoActualizarProveedorProducto;
			this.isPermisoEliminarProveedorProducto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProveedorProducto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProveedorProducto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProveedorProducto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProveedorProducto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProveedorProducto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProveedorProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProveedorProducto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProveedorProducto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProveedorProducto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProveedorProducto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProveedorProducto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProveedorProducto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProveedorProducto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProveedorProducto.setToolTipText(this.jTableDatosProveedorProducto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProveedorProducto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProveedorProducto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProveedorProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProveedorProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProveedorProducto() throws Exception {
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
	public void inicializarCombosForeignKeyProveedorProductoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProveedorProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProveedorProductoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProveedorProductoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyProveedorProductoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProveedorProductoParameterReturnGeneral proveedorproductoReturnGeneral=new ProveedorProductoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.proveedorproductoConstantesFunciones.cargarid_empresaProveedorProducto)
					 || (this.esRecargarFks && this.proveedorproductoConstantesFunciones.cargarid_empresaProveedorProducto)) {

					if(!this.proveedorproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+proveedorproductoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.proveedorproductoConstantesFunciones.cargarid_sucursalProveedorProducto)
					 || (this.esRecargarFks && this.proveedorproductoConstantesFunciones.cargarid_sucursalProveedorProducto)) {

					if(!this.proveedorproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+proveedorproductoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.proveedorproductoConstantesFunciones.cargarid_bodegaProveedorProducto)
					 || (this.esRecargarFks && this.proveedorproductoConstantesFunciones.cargarid_bodegaProveedorProducto)) {

					if(!this.proveedorproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+proveedorproductoSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.proveedorproductoConstantesFunciones.cargarid_productoProveedorProducto)
					 || (this.esRecargarFks && this.proveedorproductoConstantesFunciones.cargarid_productoProveedorProducto)) {

					if(!this.proveedorproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+proveedorproductoSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.proveedorproductoConstantesFunciones.cargarid_clienteProveedorProducto)
					 || (this.esRecargarFks && this.proveedorproductoConstantesFunciones.cargarid_clienteProveedorProducto)) {

					if(!this.proveedorproductoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+proveedorproductoSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				proveedorproductoReturnGeneral=proveedorproductoLogic.cargarCombosLoteForeignKeyProveedorProducto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalCliente);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=proveedorproductoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=proveedorproductoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=proveedorproductoReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=proveedorproductoReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=proveedorproductoReturnGeneral.getclientesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProveedorProducto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.proveedorproductoSessionBean==null) {
				this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
			}

			if(!this.proveedorproductoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.proveedorproductoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.proveedorproductoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.proveedorproductoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.proveedorproductoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
	
	public void initActionsCombosTodosForeignKeyProveedorProducto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProveedorProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProveedorProducto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProveedorProducto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProveedorProducto(ProveedorProducto proveedorproducto)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(proveedorproducto.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(proveedorproducto.getid_producto(),false,"Formulario");
			this.setActualClienteForeignKey(proveedorproducto.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProveedorProducto(ProveedorProducto proveedorproducto,String sTipoEvento)throws Exception {	
		try {
			
			

				if(proveedorproducto.getProducto()!=null && !sTipoEvento.equals("id_productoProveedorProducto")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(proveedorproducto.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				if(proveedorproducto.getCliente()!=null && !sTipoEvento.equals("id_clienteProveedorProducto")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(proveedorproducto.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProveedorProducto()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.proveedorproductoConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.proveedorproductoConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualClienteForeignKey(this.proveedorproductoConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProveedorProducto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProveedorProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProveedorProducto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProveedorProducto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProveedorProducto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProveedorProducto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProveedorProducto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_empresaProveedorProducto!=null && this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_empresaProveedorProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_empresaProveedorProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_sucursalProveedorProducto!=null && this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_sucursalProveedorProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_sucursalProveedorProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_bodegaProveedorProducto!=null && this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_bodegaProveedorProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_bodegaProveedorProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_productoProveedorProducto!=null && this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_productoProveedorProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_productoProveedorProducto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_clienteProveedorProducto!=null && this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_clienteProveedorProducto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_clienteProveedorProducto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public ProveedorProductoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProveedorProductoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProveedorProductoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.proveedorproductoSessionBean=new ProveedorProductoSessionBean(); 
		this.proveedorproductoConstantesFunciones=new ProveedorProductoConstantesFunciones(); 
		this.proveedorproductoBean=new ProveedorProducto();//(this.proveedorproductoConstantesFunciones); 		
		this.proveedorproductoReturnGeneral=new ProveedorProductoParameterReturnGeneral(); 
		
		this.proveedorproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.proveedorproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProveedorProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProveedorProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProveedorProductoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProveedorProducto(true);
			
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
			
			this.proveedorproductoConstantesFunciones=new ProveedorProductoConstantesFunciones(); 
			this.proveedorproductoBean=new ProveedorProducto();//this.proveedorproductoConstantesFunciones); 			
			this.proveedorproductoReturnGeneral=new ProveedorProductoParameterReturnGeneral(); 
		
			ProveedorProductoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Proveedor Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.proveedorproducto=new ProveedorProducto();
			this.proveedorproductos = new ArrayList<ProveedorProducto>();
			this.proveedorproductosAux = new ArrayList<ProveedorProducto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic=new ProveedorProductoLogic();
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.proveedorproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.proveedorproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProveedorProducto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProveedorProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProveedorProducto);	
					}
					
					if(this.jInternalFrameImportacionProveedorProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProveedorProducto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProveedorProducto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProveedorProducto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProveedorProducto);
				this.jInternalFrameDetalleFormProveedorProducto.setVisible(false);
				this.jInternalFrameDetalleFormProveedorProducto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProveedorProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProveedorProducto);
					this.jInternalFrameReporteDinamicoProveedorProducto.setVisible(false);
					this.jInternalFrameReporteDinamicoProveedorProducto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProveedorProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProveedorProducto);
					this.jInternalFrameImportacionProveedorProducto.setVisible(false);
					this.jInternalFrameImportacionProveedorProducto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProveedorProducto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProveedorProducto);
					this.jInternalFrameOrderByProveedorProducto.setVisible(false);
					this.jInternalFrameOrderByProveedorProducto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProveedorProductoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProveedorProductoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.proveedorproductoReturnGeneral=new ProveedorProductoParameterReturnGeneral();
			
			this.proveedorproductoParameterGeneral=new ProveedorProductoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.proveedorproductoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProveedorProductoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProveedorProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.proveedorproductoSessionBean.getEsGuardarRelacionado(),this.proveedorproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProveedorProductoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.proveedorproductoSessionBean.getEsGuardarRelacionado(),this.proveedorproductoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProveedorProducto=false;
			this.isVisibilidadCeldaDuplicarProveedorProducto=true;
			this.isVisibilidadCeldaCopiarProveedorProducto=true;
			this.isVisibilidadCeldaVerFormProveedorProducto=true;
			this.isVisibilidadCeldaOrdenProveedorProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesProveedorProducto=false;
			this.isVisibilidadCeldaModificarProveedorProducto=false;
			this.isVisibilidadCeldaActualizarProveedorProducto=false;
			this.isVisibilidadCeldaEliminarProveedorProducto=false;
			this.isVisibilidadCeldaCancelarProveedorProducto=false;
			this.isVisibilidadCeldaGuardarProveedorProducto=false;
			this.isVisibilidadCeldaGuardarCambiosProveedorProducto=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProveedorProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProveedorProducto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProveedorProducto(false);
			
			this.setPermisosUsuarioProveedorProducto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado() 
				|| (this.proveedorproductoSessionBean.getEsGuardarRelacionado() && this.proveedorproductoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProveedorProductoClasesRelacionadas();
			}
			
			if(this.proveedorproductoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProveedorProductoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProveedorProducto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProveedorProducto();
			}
			
			if(!this.isPermisoBusquedaProveedorProducto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProveedorProducto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProveedorProducto,this.isPermisoPaginacionMedioProveedorProducto,this.isPermisoPaginacionTodoProveedorProducto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProveedorProductoConstantesFunciones.getTiposSeleccionarProveedorProducto());
				
				this.tiposColumnasSelect=ProveedorProductoConstantesFunciones.getTiposSeleccionarProveedorProducto(true);
				
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
			//if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProveedorProducto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProveedorProducto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProveedorProducto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProveedorProducto() ;
			
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
				proveedorproductoImplementable= (ProveedorProductoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProveedorProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				proveedorproductoImplementableHome= (ProveedorProductoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProveedorProductoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.proveedorproductos= new ArrayList<ProveedorProducto>();
			this.proveedorproductosEliminados= new ArrayList<ProveedorProducto>();
						
			this.isEsNuevoProveedorProducto=false;
			this.esParaAccionDesdeFormularioProveedorProducto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProveedorProducto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProveedorProducto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProveedorProductoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProveedorProductoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProveedorProducto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProveedorProducto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProveedorProducto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProveedorProducto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProveedorProducto();
			}
			
			ProveedorProductoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProveedorProducto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProveedorProducto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProveedorProducto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProveedorProducto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProveedorProducto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProveedorProducto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProveedorProducto")) {
				iIndex=this.jInternalFrameDetalleFormProveedorProducto.jTabbedPaneRelacionesProveedorProducto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProveedorProducto.jTabbedPaneRelacionesProveedorProducto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProveedorProducto();	
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
	
	public void cargarCombosForeignKeyProveedorProducto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProveedorProducto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProveedorProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProveedorProductoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProveedorProducto();
		
		this.cargarCombosFrameForeignKeyProveedorProducto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProveedorProducto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProveedorProducto();
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
	
	public void jButtonNuevoProveedorProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.proveedorproductoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProveedorProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			
			
			if(jTableDatosProveedorProducto.getRowCount()>=1) {
				jTableDatosProveedorProducto.removeRowSelectionInterval(0, jTableDatosProveedorProducto.getRowCount()-1);						
			}
			
			this.isEsNuevoProveedorProducto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProveedorProducto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProveedorProducto(true);			
			//this.proveedorproducto=new ProveedorProducto();
			//this.proveedorproducto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProveedorProducto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProveedorProducto() ;
			
			if(ProveedorProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProveedorProducto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.proveedorproducto);	
			this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);				
			
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			
			if(this.proveedorproductoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProveedorProducto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProveedorProductoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProveedorProducto> proveedorproductosSeleccionados=new ArrayList<ProveedorProducto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProveedorProducto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProveedorProducto.getSelectedRows().length;			
			}
			
			proveedorproductosSeleccionados=this.getProveedorProductosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProveedorProducto--;			
				//ProveedorProducto proveedorproductoAux= new ProveedorProducto();			
				//proveedorproductoAux.setId(this.iIdNuevoProveedorProducto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProveedorProducto proveedorproductoOrigen=new ProveedorProducto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProveedorProducto proveedorproductoOrigen : proveedorproductosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							proveedorproductoOrigen =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							proveedorproductoOrigen =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProveedorProducto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.proveedorproducto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProveedorProducto(proveedorproductoOrigen,this.proveedorproducto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.proveedorproductoLogic.getProveedorProductos().add(this.proveedorproductoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.proveedorproductos.add(this.proveedorproductoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProveedorProducto(false);
				
				this.jTableDatosProveedorProducto.setRowSelectionInterval(this.getIndiceNuevoProveedorProducto(), this.getIndiceNuevoProveedorProducto());
				
				int iLastRow =  this.jTableDatosProveedorProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProveedorProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProveedorProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProveedorProducto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProveedorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProveedorProducto> proveedorproductosSeleccionados=new ArrayList<ProveedorProducto>();									
		
			ProveedorProducto proveedorproductoOrigen=new ProveedorProducto();
			ProveedorProducto proveedorproductoDestino=new ProveedorProducto();
				
			proveedorproductosSeleccionados=this.getProveedorProductosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProveedorProducto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || proveedorproductosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProveedorProducto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						proveedorproductoOrigen =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						proveedorproductoOrigen =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						proveedorproductoDestino =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						proveedorproductoDestino =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				proveedorproductoOrigen =proveedorproductosSeleccionados.get(0);
				proveedorproductoDestino =proveedorproductosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProveedorProducto(proveedorproductoOrigen,proveedorproductoDestino,true,false);
				
				proveedorproductoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(proveedorproductoDestino,proveedorproductoLogic.getProveedorProductos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(proveedorproductoDestino,proveedorproductos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProveedorProducto(false);
				
				//this.jTableDatosProveedorProducto.setRowSelectionInterval(this.getIndiceNuevoProveedorProducto(), this.getIndiceNuevoProveedorProducto());
				
				int iLastRow =  this.jTableDatosProveedorProducto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProveedorProducto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProveedorProducto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProveedorProducto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProveedorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProveedorProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProveedorProducto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProveedorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProveedorProducto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProveedorProducto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProveedorProducto.setVisible(!isVisible);
			this.jPanelPaginacionProveedorProducto.setVisible(!isVisible);
			this.jPanelAccionesProveedorProducto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProveedorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProveedorProducto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProveedorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProveedorProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProveedorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProveedorProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProveedorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProveedorProducto();
			
			this.abrirFrameOrderByProveedorProducto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProveedorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProveedorProducto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProveedorProducto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProveedorProducto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProveedorProducto.isMaximum()) {
					this.jInternalFrameDetalleFormProveedorProducto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProveedorProducto.setSize(this.jInternalFrameDetalleFormProveedorProducto.iWidthFormulario,this.jInternalFrameDetalleFormProveedorProducto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProveedorProducto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProveedorProducto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProveedorProducto.isMaximum()) {
						this.jInternalFrameDetalleFormProveedorProducto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProveedorProducto.jContentPaneDetalleProveedorProducto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProveedorProducto.jTabbedPaneRelacionesProveedorProducto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProveedorProducto.jContentPaneDetalleProveedorProducto.getWidth(),ProveedorProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProveedorProducto.jTabbedPaneRelacionesProveedorProducto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProveedorProducto.jContentPaneDetalleProveedorProducto.getWidth(),ProveedorProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProveedorProducto.jTabbedPaneRelacionesProveedorProducto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProveedorProducto.jContentPaneDetalleProveedorProducto.getWidth(),ProveedorProductoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProveedorProducto.setVisible(true);
	        this.jInternalFrameDetalleFormProveedorProducto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProveedorProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProveedorProducto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProveedorProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProveedorProducto,false,this);
				} else {
					this.jInternalFrameOrderByProveedorProducto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProveedorProducto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProveedorProducto);
				this.jInternalFrameOrderByProveedorProducto.setVisible(false);
				this.jInternalFrameOrderByProveedorProducto.setSelected(false);
				
				this.jInternalFrameOrderByProveedorProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProveedorProducto"));
				
				this.inicializarActualizarBindingTablaOrderByProveedorProducto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProveedorProducto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProveedorProducto==null) {
				
				this.jInternalFrameImportacionProveedorProducto=new ImportacionJInternalFrame(ProveedorProductoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProveedorProducto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProveedorProducto);
				this.jInternalFrameImportacionProveedorProducto.setVisible(false);
				this.jInternalFrameImportacionProveedorProducto.setSelected(false);


				this.jInternalFrameImportacionProveedorProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProveedorProducto"));
				this.jInternalFrameImportacionProveedorProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProveedorProducto"));
				this.jInternalFrameImportacionProveedorProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProveedorProducto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProveedorProducto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProveedorProducto==null) {
				this.jInternalFrameReporteDinamicoProveedorProducto=new ReporteDinamicoJInternalFrame(ProveedorProductoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProveedorProducto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProveedorProducto);
				this.jInternalFrameReporteDinamicoProveedorProducto.setVisible(false);
				this.jInternalFrameReporteDinamicoProveedorProducto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProveedorProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProveedorProducto"));
				this.jInternalFrameReporteDinamicoProveedorProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProveedorProducto"));
				this.jInternalFrameReporteDinamicoProveedorProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProveedorProducto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProveedorProducto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProveedorProducto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProveedorProducto);
			
	       	this.jInternalFrameDetalleFormProveedorProducto.setVisible(false);
	        this.jInternalFrameDetalleFormProveedorProducto.setSelected(false);
			
			//this.jInternalFrameDetalleFormProveedorProducto.dispose();
			//this.jInternalFrameDetalleFormProveedorProducto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProveedorProducto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProveedorProducto.setVisible(true);
	        this.jInternalFrameReporteDinamicoProveedorProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProveedorProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProveedorProducto.setVisible(true);
	        this.jInternalFrameImportacionProveedorProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProveedorProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProveedorProducto.setVisible(true);
	        this.jInternalFrameOrderByProveedorProducto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProveedorProducto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProveedorProducto.setVisible(false);
	        this.jInternalFrameOrderByProveedorProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProveedorProducto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProveedorProducto.setVisible(false);
	        this.jInternalFrameReporteDinamicoProveedorProducto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProveedorProducto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProveedorProducto.setVisible(false);
	        this.jInternalFrameImportacionProveedorProducto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProveedorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProveedorProducto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProveedorProducto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProveedorProducto(true);
			//this.isEsNuevoProveedorProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProveedorProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProveedorProducto(false) ;
			
			if(proveedorproductoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProveedorProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProveedorProducto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProveedorProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProveedorProductoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProveedorProducto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProveedorProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProveedorProducto(true);
			//this.isEsNuevoProveedorProducto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.proveedorproducto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProveedorProducto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProveedorProducto(false) ;
			
			if(ProveedorProductoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProveedorProducto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProveedorProducto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.proveedorproductoConstantesFunciones.cargarid_productoProveedorProducto) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProveedorProducto(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
			
			if(sType.equals("Cliente")) {
				if(!this.proveedorproductoConstantesFunciones.cargarid_clienteProveedorProducto) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProveedorProducto(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProveedorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,ProveedorProductoConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProveedorProducto.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosProveedorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProveedorProducto.getSelectedRow();

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
		TableColumn tableColumnCliente=this.jTableDatosProveedorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProveedorProducto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarProveedorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProveedorProducto(false);
			
			//if(!this.isEsNuevoProveedorProducto) {								
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProveedorProducto(this.proveedorproducto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
				
			}
			
			if(this.permiteMantenimiento(this.proveedorproducto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProveedorProducto=true;
					this.inicializarActualizarBindingTablaProveedorProducto(false);
					this.isEsNuevoProveedorProducto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProveedorProducto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProveedorProducto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProveedorProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProveedorProducto(false);
				
				this.habilitarDeshabilitarControlesProveedorProducto(false);
			
												
				
				if(ProveedorProductoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProveedorProducto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProveedorProductoActionPerformed(evt,proveedorproductoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProveedorProducto(this.proveedorproducto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProveedorProducto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,proveedorproductoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.proveedorproducto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProveedorProducto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProveedorProducto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProveedorProductoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				this.proveedorproducto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				this.proveedorproducto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.proveedorproducto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProveedorProductoModel) this.jTableDatosProveedorProducto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProveedorProducto=true;
				this.inicializarActualizarBindingTablaProveedorProducto(false);
				this.isEsNuevoProveedorProducto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProveedorProducto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProveedorProducto(false);
				
				this.habilitarDeshabilitarControlesProveedorProducto(false);
				
				
				
				if(ProveedorProductoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProveedorProducto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProveedorProductoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProveedorProducto.getRowCount()>=1) {
				jTableDatosProveedorProducto.removeRowSelectionInterval(0, jTableDatosProveedorProducto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProveedorProducto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProveedorProducto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProveedorProducto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProveedorProducto(false) ;
			
			this.isEsNuevoProveedorProducto=false;
			
			if(ProveedorProductoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProveedorProducto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProveedorProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProveedorProducto(false);
				
				//SI ES MANUAL
				if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProveedorProducto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProveedorProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProveedorProducto--;			
			//ProveedorProducto proveedorproductoAux= new ProveedorProducto();			
			//proveedorproductoAux.setId(this.iIdNuevoProveedorProducto);
			
			if(this.jInternalFrameDetalleFormProveedorProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProveedorProducto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
			
			this.proveedorproducto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.proveedorproductoLogic.getProveedorProductos().add(this.proveedorproductoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.proveedorproductos.add(this.proveedorproductoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProveedorProducto(false);
			
			this.jTableDatosProveedorProducto.setRowSelectionInterval(this.getIndiceNuevoProveedorProducto(), this.getIndiceNuevoProveedorProducto());
			
			int iLastRow =  this.jTableDatosProveedorProducto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProveedorProducto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProveedorProducto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProveedorProducto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProveedorProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProveedorProducto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProveedorProducto(false);
			
			//SI ES MANUAL
			if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProveedorProducto();
			}
			
			//this.abrirFrameTreeProveedorProducto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProveedorProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Producto ProveedorS ?", "MANTENIMIENTO DE Producto Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProveedorProducto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProveedorProducto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.proveedorproductoReturnGeneral=proveedorproductoLogic.procesarImportacionProveedorProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.proveedorproductoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProveedorProductoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProveedorProductoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProveedorProducto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProveedorProducto.setFileImportacion(this.jInternalFrameImportacionProveedorProducto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProveedorProducto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProveedorProducto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProveedorProducto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProveedorProducto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProveedorProductoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProveedorProducto> proveedorproductosSeleccionados=new ArrayList<ProveedorProducto>();		

		proveedorproductosSeleccionados=this.getProveedorProductosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProveedorProductoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProveedorProductoBaseDesign.jrxml";
			
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
			
			this.generarReporteProveedorProductos("Todos",proveedorproductosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProveedorProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProveedorProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProveedorProductoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_timoPrecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_timoPrecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_timoPrecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_timoPrecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecioPactado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecioPactado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecioPactado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecioPactado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_asEntrega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_asEntrega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_asEntrega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_asEntrega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoProveedorProducto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProveedorProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO:
					sNombreCampoCategoria="ultimo_precio";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO:
					sNombreCampoCategoria="precio_pactado";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA:
					sNombreCampoCategoria="dias_entrega";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProveedorProductoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO:
					sNombreCampoCategoriaValor="ultimo_precio";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO:
					sNombreCampoCategoriaValor="precio_pactado";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA:
					sNombreCampoCategoriaValor="dias_entrega";
					break;

				case ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProveedorProducto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProveedorProducto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProveedorProductoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ultimo Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ultimo_precio");
					break;

				case ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio Pactado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio_pactado");
					break;

				case ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dias Entrega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dias_entrega");
					break;

				case ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoProveedorProductoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProveedorProducto> proveedorproductosSeleccionados=new ArrayList<ProveedorProducto>();		
		
		proveedorproductosSeleccionados=this.getProveedorProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"proveedorproducto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProveedorProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProveedorProducto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProveedorProducto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProveedorProductoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProveedorProducto proveedorproducto:proveedorproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(proveedorproducto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProveedorProducto proveedorproducto:proveedorproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(proveedorproducto.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProveedorProducto proveedorproducto:proveedorproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(proveedorproducto.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProveedorProducto proveedorproducto:proveedorproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(proveedorproducto.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ProveedorProducto proveedorproducto:proveedorproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(proveedorproducto.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO);
					iRow++;

					for(ProveedorProducto proveedorproducto:proveedorproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(proveedorproducto.getultimo_precio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO);
					iRow++;

					for(ProveedorProducto proveedorproducto:proveedorproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(proveedorproducto.getprecio_pactado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA);
					iRow++;

					for(ProveedorProducto proveedorproducto:proveedorproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(proveedorproducto.getdias_entrega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ProveedorProducto proveedorproducto:proveedorproductosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(proveedorproducto.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelProveedorProducto(row);				
			//	iRow++;
			//}				
			
			//for(ProveedorProducto proveedorproductoAux:proveedorproductosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProveedorProducto(proveedorproductoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
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
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProveedorProducto(false);
			
			//SI ES MANUAL
			if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProveedorProducto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProveedorProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProveedorProducto(false);
			
			//SI ES MANUAL
			if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProveedorProducto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProveedorProductoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProveedorProducto(false);
			
			//SI ES MANUAL
			if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProveedorProducto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProveedorProducto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProveedorProducto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProveedorProducto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProveedorProducto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProveedorProducto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProveedorProducto.setMinimumSize(dimensionMinimum);
		this.jTableDatosProveedorProducto.setMaximumSize(dimensionMaximum);
		this.jTableDatosProveedorProducto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProveedorProducto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProveedorProducto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProveedorProducto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProveedorProducto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProveedorProducto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProveedorProducto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProveedorProducto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProveedorProducto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProveedorProductoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProveedorProducto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProveedorProducto();
		
		this.inicializarActualizarBindingBotonesManualProveedorProducto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProveedorProducto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProveedorProducto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProveedorProducto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProveedorProducto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProveedorProducto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProveedorProducto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProveedorProducto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProveedorProducto.jCheckBoxPostAccionNuevoProveedorProducto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProveedorProducto.jCheckBoxPostAccionSinCerrarProveedorProducto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProveedorProducto.jCheckBoxPostAccionSinMensajeProveedorProducto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProveedorProducto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProveedorProducto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProveedorProducto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
				this.jInternalFrameDetalleFormProveedorProducto.jCheckBoxPostAccionNuevoProveedorProducto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProveedorProducto.jCheckBoxPostAccionSinCerrarProveedorProducto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProveedorProducto.jCheckBoxPostAccionSinMensajeProveedorProducto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProveedorProducto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProveedorProducto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProveedorProducto.jComboBoxTiposAccionesFormularioProveedorProducto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProveedorProducto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProveedorProducto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProveedorProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProveedorProducto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProveedorProducto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProveedorProducto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProveedorProducto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProveedorProducto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProveedorProducto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProveedorProducto(Boolean esInicializar) throws Exception {
		try	{	
			if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProveedorProducto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProveedorProducto() throws Exception {
		try	{
			if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProveedorProducto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProveedorProducto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProveedorProducto.jComboBoxTiposAccionesFormularioProveedorProducto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProveedorProducto.jComboBoxTiposAccionesFormularioProveedorProducto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProveedorProducto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProveedorProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProveedorProducto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProveedorProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProveedorProducto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProveedorProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProveedorProducto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProveedorProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProveedorProducto.addItem(reporte);
			}
			
			
			if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProveedorProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProveedorProducto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProveedorProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProveedorProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProveedorProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProveedorProducto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProveedorProducto.jComboBoxTiposAccionesFormularioProveedorProducto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProveedorProducto.jComboBoxTiposAccionesFormularioProveedorProducto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProveedorProducto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProveedorProducto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProveedorProducto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProveedorProducto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProveedorProducto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProveedorProducto!=null) {
				this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProveedorProducto!=null) {
				this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProveedorProducto!=null) {
				
				if(this.jInternalFrameReporteDinamicoProveedorProducto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProveedorProducto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProveedorProducto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProveedorProducto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProveedorProducto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProveedorProducto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProveedorProductoConstantesFunciones.getTiposSeleccionarProveedorProducto(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProveedorProductoConstantesFunciones.getTiposSeleccionarProveedorProducto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProveedorProducto.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProveedorProducto.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProveedorProductoConstantesFunciones.getTiposSeleccionarProveedorProducto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProveedorProducto.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProveedorProducto.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProveedorProducto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaProveedorProducto.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaProveedorProducto.getSelectedItem()).getId();}
		if(this.jComboBoxid_clienteFK_IdClienteProveedorProducto.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteProveedorProducto.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoProveedorProducto.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoProveedorProducto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProveedorProducto(Boolean esInicializar) throws Exception {				
		if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProveedorProducto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProveedorProducto() throws Exception {
		this.inicializarActualizarBindingTablaProveedorProducto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProveedorProducto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProveedorProducto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProveedorProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProveedorProducto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProveedorProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProveedorProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProveedorProducto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProveedorProductoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProveedorProductoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProveedorProductoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProveedorProductoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProveedorProducto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProveedorProducto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProveedorProductoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProveedorProducto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProveedorProducto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=proveedorproductoLogic.getProveedorProductos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=proveedorproductos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProveedorProducto.setModel(new ProveedorProductoModel(this.proveedorproductoLogic.getProveedorProductos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProveedorProducto.setModel(new ProveedorProductoModel(this.proveedorproductos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProveedorProducto!=null && this.jInternalFrameOrderByProveedorProducto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProveedorProducto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProveedorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProveedorProductoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO,proveedorproductoConstantesFunciones.resaltarSeleccionarProveedorProducto,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProveedorProductoConstantesFunciones.SCLASSWEBTITULO,proveedorproductoConstantesFunciones.resaltarSeleccionarProveedorProducto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProveedorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,ProveedorProductoConstantesFunciones.LABEL_ID));

		if(this.proveedorproductoConstantesFunciones.mostraridProveedorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProveedorProductoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.proveedorproductoConstantesFunciones.resaltaridProveedorProducto,this.proveedorproductoConstantesFunciones.activaridProveedorProducto,iSizeTabla,this,true,"idProveedorProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.proveedorproductoConstantesFunciones.resaltaridProveedorProducto,this.proveedorproductoConstantesFunciones.activaridProveedorProducto,this,true,"idProveedorProducto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProveedorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,ProveedorProductoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.proveedorproductoConstantesFunciones.mostrarid_empresaProveedorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProveedorProductoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.proveedorproductoConstantesFunciones.resaltarid_empresaProveedorProducto,this,this.proveedorproductoConstantesFunciones.activarid_empresaProveedorProducto,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.proveedorproductoConstantesFunciones.resaltarid_empresaProveedorProducto,this,this.proveedorproductoConstantesFunciones.activarid_empresaProveedorProducto,false,"id_empresaProveedorProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProveedorProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProveedorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,ProveedorProductoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.proveedorproductoConstantesFunciones.mostrarid_sucursalProveedorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProveedorProductoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.proveedorproductoConstantesFunciones.resaltarid_sucursalProveedorProducto,this,this.proveedorproductoConstantesFunciones.activarid_sucursalProveedorProducto,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.proveedorproductoConstantesFunciones.resaltarid_sucursalProveedorProducto,this,this.proveedorproductoConstantesFunciones.activarid_sucursalProveedorProducto,false,"id_sucursalProveedorProducto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProveedorProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProveedorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,ProveedorProductoConstantesFunciones.LABEL_IDBODEGA));

		if(this.proveedorproductoConstantesFunciones.mostrarid_bodegaProveedorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProveedorProductoConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.proveedorproductoConstantesFunciones.resaltarid_bodegaProveedorProducto,this,this.proveedorproductoConstantesFunciones.activarid_bodegaProveedorProducto,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.proveedorproductoConstantesFunciones.resaltarid_bodegaProveedorProducto,this,this.proveedorproductoConstantesFunciones.activarid_bodegaProveedorProducto,true,"id_bodegaProveedorProducto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ProveedorProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProveedorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.proveedorproductoConstantesFunciones.mostrarid_productoProveedorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.proveedorproductoConstantesFunciones.resaltarid_productoProveedorProducto,this,this.proveedorproductoConstantesFunciones.activarid_productoProveedorProducto,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.proveedorproductoConstantesFunciones.resaltarid_productoProveedorProducto,this,this.proveedorproductoConstantesFunciones.activarid_productoProveedorProducto,true,"id_productoProveedorProducto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ProveedorProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProveedorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE));

		if(this.proveedorproductoConstantesFunciones.mostrarid_clienteProveedorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.proveedorproductoConstantesFunciones.resaltarid_clienteProveedorProducto,this,this.proveedorproductoConstantesFunciones.activarid_clienteProveedorProducto,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.proveedorproductoConstantesFunciones.resaltarid_clienteProveedorProducto,this,this.proveedorproductoConstantesFunciones.activarid_clienteProveedorProducto,true,"id_clienteProveedorProducto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ProveedorProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProveedorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO));

		if(this.proveedorproductoConstantesFunciones.mostrarultimo_precioProveedorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.proveedorproductoConstantesFunciones.resaltarultimo_precioProveedorProducto,this.proveedorproductoConstantesFunciones.activarultimo_precioProveedorProducto,iSizeTabla,this,true,"ultimo_precioProveedorProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.proveedorproductoConstantesFunciones.resaltarultimo_precioProveedorProducto,this.proveedorproductoConstantesFunciones.activarultimo_precioProveedorProducto,this,true,"ultimo_precioProveedorProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProveedorProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProveedorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO));

		if(this.proveedorproductoConstantesFunciones.mostrarprecio_pactadoProveedorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.proveedorproductoConstantesFunciones.resaltarprecio_pactadoProveedorProducto,this.proveedorproductoConstantesFunciones.activarprecio_pactadoProveedorProducto,iSizeTabla,this,true,"precio_pactadoProveedorProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.proveedorproductoConstantesFunciones.resaltarprecio_pactadoProveedorProducto,this.proveedorproductoConstantesFunciones.activarprecio_pactadoProveedorProducto,this,true,"precio_pactadoProveedorProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProveedorProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProveedorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA));

		if(this.proveedorproductoConstantesFunciones.mostrardias_entregaProveedorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.proveedorproductoConstantesFunciones.resaltardias_entregaProveedorProducto,this.proveedorproductoConstantesFunciones.activardias_entregaProveedorProducto,iSizeTabla,this,true,"dias_entregaProveedorProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.proveedorproductoConstantesFunciones.resaltardias_entregaProveedorProducto,this.proveedorproductoConstantesFunciones.activardias_entregaProveedorProducto,this,true,"dias_entregaProveedorProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProveedorProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProveedorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.proveedorproductoConstantesFunciones.mostrardescripcionProveedorProducto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.proveedorproductoConstantesFunciones.resaltardescripcionProveedorProducto,this.proveedorproductoConstantesFunciones.activardescripcionProveedorProducto,iSizeTabla,this,true,"descripcionProveedorProducto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.proveedorproductoConstantesFunciones.resaltardescripcionProveedorProducto,this.proveedorproductoConstantesFunciones.activardescripcionProveedorProducto,this,true,"descripcionProveedorProducto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProveedorProductoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.proveedorproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.proveedorproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProveedorProducto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.proveedorproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.proveedorproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProveedorProducto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProveedorProducto && this.isPermisoGuardarCambiosProveedorProducto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.proveedorproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.proveedorproductoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProveedorProducto.addColumn(tableColumn);
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
			
			this.jTableDatosProveedorProducto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProveedorProducto && this.isPermisoGuardarCambiosProveedorProducto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProveedorProducto && this.isPermisoGuardarCambiosProveedorProducto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProveedorProducto.moveColumn(this.jTableDatosProveedorProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProveedorProducto.moveColumn(this.jTableDatosProveedorProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProveedorProducto.moveColumn(this.jTableDatosProveedorProducto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProveedorProducto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProveedorProducto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProveedorProducto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProveedorProducto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProveedorProducto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProveedorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProveedorProducto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProveedorProducto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProveedorProducto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=proveedorproductoLogic.getProveedorProductos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=proveedorproductos.size()-1;
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
		//this.jTableDatosProveedorProducto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProveedorProducto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProveedorProducto();
			
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
				
				//this.isEsNuevoProveedorProducto=false;
					
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			
				if(this.proveedorproductoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProveedorProducto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProveedorProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProveedorProducto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.proveedorproducto.getsType().equals("DUPLICADO")
				   || this.proveedorproducto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProveedorProducto=true;
				
				} else {
					this.isEsNuevoProveedorProducto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
					if(this.proveedorproducto.getId()>=0 && !this.proveedorproducto.getIsNew()) {						
						this.isEsNuevoProveedorProducto=false;
						
					} else {
						this.isEsNuevoProveedorProducto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProveedorProducto(esRelaciones);						
				
				this.seleccionarProveedorProducto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.proveedorproducto.getId()<0) {
					this.isEsNuevoProveedorProducto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProveedorProducto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProveedorProducto(evt,rowIndex);
				}	
				
				if(this.proveedorproductoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProveedorProducto: " + this.dDif); 
					}
				}								
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProveedorProducto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.proveedorproducto)) {
					if(this.proveedorproducto.getId()>0) {
						this.proveedorproducto.setIsDeleted(true);
						
						this.proveedorproductosEliminados.add(this.proveedorproducto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.proveedorproductoLogic.getProveedorProductos().remove(this.proveedorproducto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.proveedorproductos.remove(this.proveedorproducto);				
					}
					
					
					((ProveedorProductoModel) this.jTableDatosProveedorProducto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProveedorProducto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProveedorProducto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProveedorProducto) {
			
			if(this.jInternalFrameDetalleFormProveedorProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProveedorProducto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProveedorProducto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProveedorProducto(this.proveedorproducto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.proveedorproductoConstantesFunciones.cargarid_empresaProveedorProducto || this.proveedorproductoConstantesFunciones.event_dependid_empresaProveedorProducto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.proveedorproducto.getid_empresa());
									//this.inicializarActualizarBindingProveedorProducto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(proveedorproducto.getEmpresa()!=null) {
							this.empresasForeignKey.add(proveedorproducto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.proveedorproducto.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.proveedorproductoConstantesFunciones.cargarid_sucursalProveedorProducto || this.proveedorproductoConstantesFunciones.event_dependid_sucursalProveedorProducto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.proveedorproducto.getid_sucursal());
									//this.inicializarActualizarBindingProveedorProducto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(proveedorproducto.getSucursal()!=null) {
							this.sucursalsForeignKey.add(proveedorproducto.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.proveedorproducto.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.proveedorproductoConstantesFunciones.cargarid_bodegaProveedorProducto || this.proveedorproductoConstantesFunciones.event_dependid_bodegaProveedorProducto) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.proveedorproducto.getid_bodega());
									//this.inicializarActualizarBindingProveedorProducto(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(proveedorproducto.getBodega()!=null) {
							this.bodegasForeignKey.add(proveedorproducto.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.proveedorproducto.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.proveedorproductoConstantesFunciones.cargarid_productoProveedorProducto || this.proveedorproductoConstantesFunciones.event_dependid_productoProveedorProducto) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.proveedorproducto.getid_producto());
									//this.inicializarActualizarBindingProveedorProducto(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(proveedorproducto.getProducto()!=null) {
							this.productosForeignKey.add(proveedorproducto.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.proveedorproducto.getid_producto(),false,"Formulario");

					//Cliente
					if(!this.proveedorproductoConstantesFunciones.cargarid_clienteProveedorProducto || this.proveedorproductoConstantesFunciones.event_dependid_clienteProveedorProducto) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.proveedorproducto.getid_cliente());
									//this.inicializarActualizarBindingProveedorProducto(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(proveedorproducto.getCliente()!=null) {
							this.clientesForeignKey.add(proveedorproducto.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.proveedorproducto.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProveedorProducto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProveedorProducto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProveedorProducto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProveedorProducto(ProveedorProducto proveedorproducto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProveedorProducto(proveedorproducto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProveedorProducto(ProveedorProducto proveedorproducto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProveedorProducto(proveedorproducto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProveedorProducto(proveedorproducto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProveedorProducto(proveedorproducto);
	}
	
	public void setVariablesObjetoActualToFormularioProveedorProducto(ProveedorProducto proveedorproducto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProveedorProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProveedorProducto.jLabelidProveedorProducto.setText(proveedorproducto.getId().toString());
			this.jInternalFrameDetalleFormProveedorProducto.jTextFieldultimo_precioProveedorProducto.setText(proveedorproducto.getultimo_precio().toString());
			this.jInternalFrameDetalleFormProveedorProducto.jTextFieldprecio_pactadoProveedorProducto.setText(proveedorproducto.getprecio_pactado().toString());
			this.jInternalFrameDetalleFormProveedorProducto.jTextFielddias_entregaProveedorProducto.setText(proveedorproducto.getdias_entrega().toString());
			this.jInternalFrameDetalleFormProveedorProducto.jTextAreadescripcionProveedorProducto.setText(proveedorproducto.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProveedorProducto proveedorproductoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,proveedorproductoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProveedorProducto proveedorproductoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				proveedorproductoLocal=this.proveedorproducto;
			} else {
				proveedorproductoLocal=this.proveedorproductoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(proveedorproductoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProveedorProducto(proveedorproductoLocal,true);
					
					if(proveedorproductoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(proveedorproductoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(proveedorproductoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProveedorProducto(ProveedorProducto proveedorproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProveedorProducto(proveedorproducto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(proveedorproducto);
	}
	
	public void setVariablesFormularioToObjetoActualProveedorProducto(ProveedorProducto proveedorproducto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProveedorProducto(proveedorproducto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProveedorProducto(ProveedorProducto proveedorproducto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProveedorProducto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProveedorProducto.jLabelidProveedorProducto.getText()==null || this.jInternalFrameDetalleFormProveedorProducto.jLabelidProveedorProducto.getText()=="" || this.jInternalFrameDetalleFormProveedorProducto.jLabelidProveedorProducto.getText()=="Id") {
				this.jInternalFrameDetalleFormProveedorProducto.jLabelidProveedorProducto.setText("0");
			}

			if(conColumnasBase) {proveedorproducto.setId(Long.parseLong(this.jInternalFrameDetalleFormProveedorProducto.jLabelidProveedorProducto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProveedorProductoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProveedorProducto.jLabelIdProveedorProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			proveedorproducto.setultimo_precio(Double.parseDouble(this.jInternalFrameDetalleFormProveedorProducto.jTextFieldultimo_precioProveedorProducto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProveedorProducto.jLabelultimo_precioProveedorProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			proveedorproducto.setprecio_pactado(Double.parseDouble(this.jInternalFrameDetalleFormProveedorProducto.jTextFieldprecio_pactadoProveedorProducto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProveedorProducto.jLabelprecio_pactadoProveedorProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			proveedorproducto.setdias_entrega(Integer.parseInt(this.jInternalFrameDetalleFormProveedorProducto.jTextFielddias_entregaProveedorProducto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProveedorProducto.jLabeldias_entregaProveedorProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			proveedorproducto.setdescripcion(this.jInternalFrameDetalleFormProveedorProducto.jTextAreadescripcionProveedorProducto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProveedorProducto.jLabeldescripcionProveedorProducto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProveedorProducto(ProveedorProducto proveedorproductoBean,ProveedorProducto proveedorproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && proveedorproductoBean.getid_bodega()!=null && !proveedorproductoBean.getid_bodega().equals(-1L))) {proveedorproducto.setid_bodega(proveedorproductoBean.getid_bodega());}
			if(conDefault || (!conDefault && proveedorproductoBean.getid_producto()!=null && !proveedorproductoBean.getid_producto().equals(-1L))) {proveedorproducto.setid_producto(proveedorproductoBean.getid_producto());}
			if(conDefault || (!conDefault && proveedorproductoBean.getid_cliente()!=null && !proveedorproductoBean.getid_cliente().equals(-1L))) {proveedorproducto.setid_cliente(proveedorproductoBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProveedorProducto(ProveedorProducto proveedorproductoOrigen,ProveedorProducto proveedorproducto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && proveedorproductoOrigen.getId()!=null && !proveedorproductoOrigen.getId().equals(0L))) {proveedorproducto.setId(proveedorproductoOrigen.getId());}}
			if(conDefault || (!conDefault && proveedorproductoOrigen.getid_bodega()!=null && !proveedorproductoOrigen.getid_bodega().equals(-1L))) {proveedorproducto.setid_bodega(proveedorproductoOrigen.getid_bodega());}
			if(conDefault || (!conDefault && proveedorproductoOrigen.getid_producto()!=null && !proveedorproductoOrigen.getid_producto().equals(-1L))) {proveedorproducto.setid_producto(proveedorproductoOrigen.getid_producto());}
			if(conDefault || (!conDefault && proveedorproductoOrigen.getid_cliente()!=null && !proveedorproductoOrigen.getid_cliente().equals(-1L))) {proveedorproducto.setid_cliente(proveedorproductoOrigen.getid_cliente());}
			if(conDefault || (!conDefault && proveedorproductoOrigen.getultimo_precio()!=null && !proveedorproductoOrigen.getultimo_precio().equals(0.0))) {proveedorproducto.setultimo_precio(proveedorproductoOrigen.getultimo_precio());}
			if(conDefault || (!conDefault && proveedorproductoOrigen.getprecio_pactado()!=null && !proveedorproductoOrigen.getprecio_pactado().equals(0.0))) {proveedorproducto.setprecio_pactado(proveedorproductoOrigen.getprecio_pactado());}
			if(conDefault || (!conDefault && proveedorproductoOrigen.getdias_entrega()!=null && !proveedorproductoOrigen.getdias_entrega().equals(0))) {proveedorproducto.setdias_entrega(proveedorproductoOrigen.getdias_entrega());}
			if(conDefault || (!conDefault && proveedorproductoOrigen.getdescripcion()!=null && !proveedorproductoOrigen.getdescripcion().equals(""))) {proveedorproducto.setdescripcion(proveedorproductoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProveedorProducto(ProveedorProducto proveedorproducto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProveedorProducto.jLabelidProveedorProducto.setText(proveedorproducto.getId().toString());
			this.jInternalFrameDetalleFormProveedorProducto.jTextFieldultimo_precioProveedorProducto.setText(proveedorproducto.getultimo_precio().toString());
			this.jInternalFrameDetalleFormProveedorProducto.jTextFieldprecio_pactadoProveedorProducto.setText(proveedorproducto.getprecio_pactado().toString());
			this.jInternalFrameDetalleFormProveedorProducto.jTextFielddias_entregaProveedorProducto.setText(proveedorproducto.getdias_entrega().toString());
			this.jInternalFrameDetalleFormProveedorProducto.jTextAreadescripcionProveedorProducto.setText(proveedorproducto.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProveedorProducto(ProveedorProductoBean proveedorproductoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProveedorProducto.jLabelidProveedorProducto.setText(proveedorproductoBean.getId().toString());
			this.jInternalFrameDetalleFormProveedorProducto.jTextFieldultimo_precioProveedorProducto.setText(proveedorproductoBean.getultimo_precio().toString());
			this.jInternalFrameDetalleFormProveedorProducto.jTextFieldprecio_pactadoProveedorProducto.setText(proveedorproductoBean.getprecio_pactado().toString());
			this.jInternalFrameDetalleFormProveedorProducto.jTextFielddias_entregaProveedorProducto.setText(proveedorproductoBean.getdias_entrega().toString());
			this.jInternalFrameDetalleFormProveedorProducto.jTextAreadescripcionProveedorProducto.setText(proveedorproductoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProveedorProducto(ProveedorProductoParameterReturnGeneral proveedorproductoReturnGeneral,ProveedorProductoBean proveedorproductoBean,Boolean conDefault) throws Exception { 
		try {
			ProveedorProducto proveedorproductoLocal=new ProveedorProducto();
			
			proveedorproductoLocal=proveedorproductoReturnGeneral.getProveedorProducto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && proveedorproductoLocal.getId()!=null && !proveedorproductoLocal.getId().equals(0L))) {proveedorproductoBean.setId(proveedorproductoLocal.getId());}}
			if(conDefault || (!conDefault && proveedorproductoLocal.getid_bodega()!=null && !proveedorproductoLocal.getid_bodega().equals(-1L))) {proveedorproductoBean.setid_bodega(proveedorproductoLocal.getid_bodega());}
			if(conDefault || (!conDefault && proveedorproductoLocal.getid_producto()!=null && !proveedorproductoLocal.getid_producto().equals(-1L))) {proveedorproductoBean.setid_producto(proveedorproductoLocal.getid_producto());}
			if(conDefault || (!conDefault && proveedorproductoLocal.getid_cliente()!=null && !proveedorproductoLocal.getid_cliente().equals(-1L))) {proveedorproductoBean.setid_cliente(proveedorproductoLocal.getid_cliente());}
			if(conDefault || (!conDefault && proveedorproductoLocal.getultimo_precio()!=null && !proveedorproductoLocal.getultimo_precio().equals(0.0))) {proveedorproductoBean.setultimo_precio(proveedorproductoLocal.getultimo_precio());}
			if(conDefault || (!conDefault && proveedorproductoLocal.getprecio_pactado()!=null && !proveedorproductoLocal.getprecio_pactado().equals(0.0))) {proveedorproductoBean.setprecio_pactado(proveedorproductoLocal.getprecio_pactado());}
			if(conDefault || (!conDefault && proveedorproductoLocal.getdias_entrega()!=null && !proveedorproductoLocal.getdias_entrega().equals(0))) {proveedorproductoBean.setdias_entrega(proveedorproductoLocal.getdias_entrega());}
			if(conDefault || (!conDefault && proveedorproductoLocal.getdescripcion()!=null && !proveedorproductoLocal.getdescripcion().equals(""))) {proveedorproductoBean.setdescripcion(proveedorproductoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProveedorProductoGenerico(Long idProveedorProductoSeleccionado,JComboBox jComboBoxProveedorProducto,List<ProveedorProducto> proveedorproductosLocal)throws Exception {
		try {
			ProveedorProducto  proveedorproductoTemp=null;

			for(ProveedorProducto proveedorproductoAux:proveedorproductosLocal) {
				if(proveedorproductoAux.getId()!=null && proveedorproductoAux.getId().equals(idProveedorProductoSeleccionado)) {
					proveedorproductoTemp=proveedorproductoAux;
					break;
				}
			}

			jComboBoxProveedorProducto.setSelectedItem(proveedorproductoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProveedorProductoGenerico(JComboBox jComboBoxProveedorProducto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProveedorProducto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProveedorProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProveedorProducto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProveedorProducto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProveedorProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProveedorProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			proveedorproducto=(ProveedorProducto) proveedorproductoLogic.getProveedorProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			proveedorproducto =(ProveedorProducto) proveedorproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!proveedorproducto.getIsNew() && !proveedorproducto.getIsChanged() && !proveedorproducto.getIsDeleted()) {
				sDescripcion=proveedorproducto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=proveedorproducto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!proveedorproducto.getIsNew() && !proveedorproducto.getIsChanged() && !proveedorproducto.getIsDeleted()) {
				sDescripcion=proveedorproducto.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=proveedorproducto.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!proveedorproducto.getIsNew() && !proveedorproducto.getIsChanged() && !proveedorproducto.getIsDeleted()) {
				sDescripcion=proveedorproducto.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=proveedorproducto.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!proveedorproducto.getIsNew() && !proveedorproducto.getIsChanged() && !proveedorproducto.getIsDeleted()) {
				sDescripcion=proveedorproducto.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=proveedorproducto.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!proveedorproducto.getIsNew() && !proveedorproducto.getIsChanged() && !proveedorproducto.getIsDeleted()) {
				sDescripcion=proveedorproducto.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=proveedorproducto.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProveedorProducto proveedorproductoRow=new ProveedorProducto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			proveedorproductoRow=(ProveedorProducto) proveedorproductoLogic.getProveedorProductos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			proveedorproductoRow=(ProveedorProducto) proveedorproductos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProveedorProducto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProveedorProducto.setVisible((this.isVisibilidadCeldaNuevoProveedorProducto && this.isPermisoNuevoProveedorProducto));			
			this.jButtonDuplicarProveedorProducto.setVisible((this.isVisibilidadCeldaDuplicarProveedorProducto && this.isPermisoDuplicarProveedorProducto));			
			this.jButtonCopiarProveedorProducto.setVisible((this.isVisibilidadCeldaCopiarProveedorProducto && this.isPermisoCopiarProveedorProducto));
			this.jButtonVerFormProveedorProducto.setVisible((this.isVisibilidadCeldaVerFormProveedorProducto && this.isPermisoVerFormProveedorProducto));
			
			this.jButtonAbrirOrderByProveedorProducto.setVisible((this.isVisibilidadCeldaOrdenProveedorProducto && this.isPermisoOrdenProveedorProducto));			
			
			this.jButtonNuevoRelacionesProveedorProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesProveedorProducto && this.isPermisoNuevoProveedorProducto));			
			this.jButtonNuevoGuardarCambiosProveedorProducto.setVisible((this.isVisibilidadCeldaNuevoProveedorProducto && this.isPermisoNuevoProveedorProducto && this.isPermisoGuardarCambiosProveedorProducto));
			
			if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
			this.jInternalFrameDetalleFormProveedorProducto.jButtonModificarProveedorProducto.setVisible((this.isVisibilidadCeldaModificarProveedorProducto && this.isPermisoActualizarProveedorProducto));	
			this.jInternalFrameDetalleFormProveedorProducto.jButtonActualizarProveedorProducto.setVisible((this.isVisibilidadCeldaActualizarProveedorProducto && this.isPermisoActualizarProveedorProducto));	
			this.jInternalFrameDetalleFormProveedorProducto.jButtonEliminarProveedorProducto.setVisible((this.isVisibilidadCeldaEliminarProveedorProducto && this.isPermisoEliminarProveedorProducto));
			this.jInternalFrameDetalleFormProveedorProducto.jButtonCancelarProveedorProducto.setVisible(this.isVisibilidadCeldaCancelarProveedorProducto);							
			this.jInternalFrameDetalleFormProveedorProducto.jButtonGuardarCambiosProveedorProducto.setVisible((this.isVisibilidadCeldaGuardarProveedorProducto && this.isPermisoGuardarCambiosProveedorProducto));			
			
			}
						
			this.jButtonGuardarCambiosTablaProveedorProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosProveedorProducto && this.isPermisoGuardarCambiosProveedorProducto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProveedorProducto.setVisible((this.isVisibilidadCeldaNuevoProveedorProducto && this.isPermisoNuevoProveedorProducto));						
			this.jButtonDuplicarToolBarProveedorProducto.setVisible((this.isVisibilidadCeldaDuplicarProveedorProducto && this.isPermisoDuplicarProveedorProducto));						
			this.jButtonCopiarToolBarProveedorProducto.setVisible((this.isVisibilidadCeldaCopiarProveedorProducto && this.isPermisoCopiarProveedorProducto));			
			this.jButtonVerFormToolBarProveedorProducto.setVisible((this.isVisibilidadCeldaVerFormProveedorProducto && this.isPermisoVerFormProveedorProducto));			
			this.jButtonAbrirOrderByToolBarProveedorProducto.setVisible((this.isVisibilidadCeldaOrdenProveedorProducto && this.isPermisoOrdenProveedorProducto));
			this.jButtonNuevoRelacionesToolBarProveedorProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesProveedorProducto && this.isPermisoNuevoProveedorProducto));			
			this.jButtonNuevoGuardarCambiosToolBarProveedorProducto.setVisible((this.isVisibilidadCeldaNuevoProveedorProducto && this.isPermisoNuevoProveedorProducto && this.isPermisoGuardarCambiosProveedorProducto));			
			
			if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
			this.jInternalFrameDetalleFormProveedorProducto.jButtonModificarToolBarProveedorProducto.setVisible((this.isVisibilidadCeldaModificarProveedorProducto && this.isPermisoActualizarProveedorProducto));	
			this.jInternalFrameDetalleFormProveedorProducto.jButtonActualizarToolBarProveedorProducto.setVisible((this.isVisibilidadCeldaActualizarProveedorProducto  && this.isPermisoActualizarProveedorProducto));	
			this.jInternalFrameDetalleFormProveedorProducto.jButtonEliminarToolBarProveedorProducto.setVisible((this.isVisibilidadCeldaEliminarProveedorProducto && this.isPermisoEliminarProveedorProducto));
			this.jInternalFrameDetalleFormProveedorProducto.jButtonCancelarToolBarProveedorProducto.setVisible(this.isVisibilidadCeldaCancelarProveedorProducto);				
			this.jInternalFrameDetalleFormProveedorProducto.jButtonGuardarCambiosToolBarProveedorProducto.setVisible((this.isVisibilidadCeldaGuardarProveedorProducto && this.isPermisoGuardarCambiosProveedorProducto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProveedorProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosProveedorProducto && this.isPermisoGuardarCambiosProveedorProducto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProveedorProducto.setVisible((this.isVisibilidadCeldaNuevoProveedorProducto && this.isPermisoNuevoProveedorProducto));			
			this.jMenuItemDuplicarProveedorProducto.setVisible((this.isVisibilidadCeldaDuplicarProveedorProducto && this.isPermisoDuplicarProveedorProducto));			
			this.jMenuItemCopiarProveedorProducto.setVisible((this.isVisibilidadCeldaCopiarProveedorProducto && this.isPermisoCopiarProveedorProducto));			
			this.jMenuItemVerFormProveedorProducto.setVisible((this.isVisibilidadCeldaVerFormProveedorProducto && this.isPermisoVerFormProveedorProducto));			
			this.jMenuItemAbrirOrderByProveedorProducto.setVisible((this.isVisibilidadCeldaOrdenProveedorProducto && this.isPermisoOrdenProveedorProducto));			
			//this.jMenuItemMostrarOcultarProveedorProducto.setVisible((this.isVisibilidadCeldaOrdenProveedorProducto && this.isPermisoOrdenProveedorProducto));
			this.jMenuItemDetalleAbrirOrderByProveedorProducto.setVisible((this.isVisibilidadCeldaOrdenProveedorProducto && this.isPermisoOrdenProveedorProducto));			
			//this.jMenuItemDetalleMostrarOcultarProveedorProducto.setVisible((this.isVisibilidadCeldaOrdenProveedorProducto && this.isPermisoOrdenProveedorProducto));			
			this.jMenuItemNuevoRelacionesProveedorProducto.setVisible((this.isVisibilidadCeldaNuevoRelacionesProveedorProducto && this.isPermisoNuevoProveedorProducto));			
			this.jMenuItemNuevoGuardarCambiosProveedorProducto.setVisible((this.isVisibilidadCeldaNuevoProveedorProducto && this.isPermisoNuevoProveedorProducto && this.isPermisoGuardarCambiosProveedorProducto));									
			
			if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
			this.jInternalFrameDetalleFormProveedorProducto.jMenuItemModificarProveedorProducto.setVisible((this.isVisibilidadCeldaModificarProveedorProducto && this.isPermisoActualizarProveedorProducto));	
			this.jInternalFrameDetalleFormProveedorProducto.jMenuItemActualizarProveedorProducto.setVisible((this.isVisibilidadCeldaActualizarProveedorProducto && this.isPermisoActualizarProveedorProducto));	
			this.jInternalFrameDetalleFormProveedorProducto.jMenuItemEliminarProveedorProducto.setVisible((this.isVisibilidadCeldaEliminarProveedorProducto && this.isPermisoEliminarProveedorProducto));
			this.jInternalFrameDetalleFormProveedorProducto.jMenuItemCancelarProveedorProducto.setVisible(this.isVisibilidadCeldaCancelarProveedorProducto);				
			}
			
			this.jMenuItemGuardarCambiosProveedorProducto.setVisible((this.isVisibilidadCeldaGuardarProveedorProducto && this.isPermisoGuardarCambiosProveedorProducto));						
			this.jMenuItemGuardarCambiosTablaProveedorProducto.setVisible((this.isVisibilidadCeldaGuardarCambiosProveedorProducto && this.isPermisoGuardarCambiosProveedorProducto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProveedorProducto=this.jButtonNuevoProveedorProducto.isVisible();
			this.isVisibilidadCeldaDuplicarProveedorProducto=this.jButtonDuplicarProveedorProducto.isVisible();
			this.isVisibilidadCeldaCopiarProveedorProducto=this.jButtonCopiarProveedorProducto.isVisible();
			this.isVisibilidadCeldaVerFormProveedorProducto=this.jButtonVerFormProveedorProducto.isVisible();
			
			this.isVisibilidadCeldaOrdenProveedorProducto=this.jButtonAbrirOrderByProveedorProducto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProveedorProducto=this.jButtonNuevoRelacionesProveedorProducto.isVisible();
			this.isVisibilidadCeldaModificarProveedorProducto=this.jButtonModificarProveedorProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
			this.isVisibilidadCeldaActualizarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jButtonActualizarProveedorProducto.isVisible();
			this.isVisibilidadCeldaEliminarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jButtonEliminarProveedorProducto.isVisible();
			this.isVisibilidadCeldaCancelarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jButtonCancelarProveedorProducto.isVisible();
			this.isVisibilidadCeldaGuardarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jButtonGuardarCambiosProveedorProducto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProveedorProducto=this.jButtonGuardarCambiosTablaProveedorProducto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProveedorProducto=this.jButtonNuevoToolBarProveedorProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProveedorProducto=this.jButtonNuevoRelacionesToolBarProveedorProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
			this.isVisibilidadCeldaModificarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jButtonModificarToolBarProveedorProducto.isVisible();
			this.isVisibilidadCeldaActualizarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jButtonActualizarToolBarProveedorProducto.isVisible();
			this.isVisibilidadCeldaEliminarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jButtonEliminarToolBarProveedorProducto.isVisible();
			this.isVisibilidadCeldaCancelarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jButtonCancelarToolBarProveedorProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProveedorProducto=this.jButtonGuardarCambiosToolBarProveedorProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProveedorProducto=this.jButtonGuardarCambiosTablaToolBarProveedorProducto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProveedorProducto=this.jMenuItemNuevoProveedorProducto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProveedorProducto=this.jMenuItemNuevoRelacionesProveedorProducto.isVisible();
			
			if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
			this.isVisibilidadCeldaModificarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jMenuItemModificarProveedorProducto.isVisible();
			this.isVisibilidadCeldaActualizarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jMenuItemActualizarProveedorProducto.isVisible();
			this.isVisibilidadCeldaEliminarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jMenuItemEliminarProveedorProducto.isVisible();
			this.isVisibilidadCeldaCancelarProveedorProducto=this.jInternalFrameDetalleFormProveedorProducto.jMenuItemCancelarProveedorProducto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProveedorProducto=this.jMenuItemGuardarCambiosProveedorProducto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProveedorProducto=this.jMenuItemGuardarCambiosTablaProveedorProducto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProveedorProducto(Boolean esInicializar) {
		if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.proveedorproductoSessionBean.getConGuardarRelaciones()) {
				//if(this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProveedorProducto();
			}
			
			this.inicializarActualizarBindingBotonesManualProveedorProducto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProveedorProducto() {
		this.jButtonNuevoProveedorProducto.setVisible(this.isPermisoNuevoProveedorProducto);			
		this.jButtonDuplicarProveedorProducto.setVisible(this.isPermisoDuplicarProveedorProducto);			
		this.jButtonCopiarProveedorProducto.setVisible(this.isPermisoCopiarProveedorProducto);			
		this.jButtonVerFormProveedorProducto.setVisible(this.isPermisoVerFormProveedorProducto);			
		
		this.jButtonAbrirOrderByProveedorProducto.setVisible(this.isPermisoOrdenProveedorProducto);					
		
		this.jButtonNuevoRelacionesProveedorProducto.setVisible(this.isPermisoNuevoProveedorProducto);			
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProveedorProducto.jButtonModificarProveedorProducto.setVisible(this.isPermisoActualizarProveedorProducto);	
			this.jInternalFrameDetalleFormProveedorProducto.jButtonActualizarProveedorProducto.setVisible(this.isPermisoActualizarProveedorProducto);	
			this.jInternalFrameDetalleFormProveedorProducto.jButtonEliminarProveedorProducto.setVisible(this.isPermisoEliminarProveedorProducto);
			this.jInternalFrameDetalleFormProveedorProducto.jButtonCancelarProveedorProducto.setVisible(this.isVisibilidadCeldaCancelarProveedorProducto);						
			this.jInternalFrameDetalleFormProveedorProducto.jButtonGuardarCambiosProveedorProducto.setVisible(this.isPermisoGuardarCambiosProveedorProducto);							
		}
		
		this.jButtonGuardarCambiosTablaProveedorProducto.setVisible(this.isPermisoActualizarProveedorProducto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProveedorProducto() {
		this.jInternalFrameDetalleFormProveedorProducto.jButtonModificarProveedorProducto.setVisible(this.isPermisoActualizarProveedorProducto);	
		this.jInternalFrameDetalleFormProveedorProducto.jButtonActualizarProveedorProducto.setVisible(this.isPermisoActualizarProveedorProducto);	
		this.jInternalFrameDetalleFormProveedorProducto.jButtonEliminarProveedorProducto.setVisible(this.isPermisoEliminarProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jButtonCancelarProveedorProducto.setVisible(this.isVisibilidadCeldaCancelarProveedorProducto);							
		this.jInternalFrameDetalleFormProveedorProducto.jButtonGuardarCambiosProveedorProducto.setVisible((this.isVisibilidadCeldaGuardarProveedorProducto && this.isPermisoGuardarCambiosProveedorProducto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProveedorProducto() {
		if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProveedorProducto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProveedorProducto() {
	}
	
	public void jTableDatosProveedorProductoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProveedorProducto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProveedorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProveedorProducto(this.getproveedorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.proveedorproducto==null) {
						this.proveedorproducto = new ProveedorProducto();
					}

					this.setVariablesFormularioToObjetoActualProveedorProducto(this.proveedorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
				}

				if(this.proveedorproducto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.proveedorproducto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProveedorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProveedorProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProveedorProducto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProveedorProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProveedorProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProveedorProducto(this.getproveedorproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.proveedorproductoLogic.getConnexion());

				if(this.proveedorproducto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.proveedorproducto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProveedorProducto=(TitledBorder)this.jScrollPanelDatosProveedorProducto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProveedorProducto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProveedorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProveedorProducto(this.getproveedorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.proveedorproducto==null) {
						this.proveedorproducto = new ProveedorProducto();
					}

					this.setVariablesFormularioToObjetoActualProveedorProducto(this.proveedorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
				}

				if(this.proveedorproducto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.proveedorproducto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProveedorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProveedorProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProveedorProducto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProveedorProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProveedorProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProveedorProducto(this.getproveedorproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.proveedorproductoLogic.getConnexion());

				if(this.proveedorproducto.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.proveedorproducto.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProveedorProducto=(TitledBorder)this.jScrollPanelDatosProveedorProducto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProveedorProducto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProveedorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProveedorProducto(this.getproveedorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.proveedorproducto==null) {
						this.proveedorproducto = new ProveedorProducto();
					}

					this.setVariablesFormularioToObjetoActualProveedorProducto(this.proveedorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
				}

				if(this.proveedorproducto.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.proveedorproducto.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProveedorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProveedorProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProveedorProducto(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProveedorProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProveedorProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProveedorProducto(this.getproveedorproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.proveedorproductoLogic.getConnexion());

				if(this.proveedorproducto.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.proveedorproducto.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProveedorProducto=(TitledBorder)this.jScrollPanelDatosProveedorProducto.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProveedorProducto.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProveedorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProveedorProducto(this.getproveedorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.proveedorproducto==null) {
						this.proveedorproducto = new ProveedorProducto();
					}

					this.setVariablesFormularioToObjetoActualProveedorProducto(this.proveedorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
				}

				if(this.proveedorproducto.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.proveedorproducto.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProveedorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProveedorProductoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderProveedorProducto=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosProveedorProducto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProveedorProducto=(TitledBorder)this.jScrollPanelDatosProveedorProducto.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProveedorProducto.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoProveedorProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProveedorProducto(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProveedorProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProveedorProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProveedorProducto(this.getproveedorproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.proveedorproductoLogic.getConnexion());

				if(this.proveedorproducto.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.proveedorproducto.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProveedorProducto=(TitledBorder)this.jScrollPanelDatosProveedorProducto.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProveedorProducto.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProveedorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProveedorProducto(this.getproveedorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.proveedorproducto==null) {
						this.proveedorproducto = new ProveedorProducto();
					}

					this.setVariablesFormularioToObjetoActualProveedorProducto(this.proveedorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
				}

				if(this.proveedorproducto.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.proveedorproducto.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProveedorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteProveedorProductoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderProveedorProducto=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosProveedorProducto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProveedorProducto=(TitledBorder)this.jScrollPanelDatosProveedorProducto.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderProveedorProducto.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteProveedorProductoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebProveedorProducto(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProveedorProducto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProveedorProducto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProveedorProducto(this.getproveedorproducto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.proveedorproductoLogic.getConnexion());

				if(this.proveedorproducto.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.proveedorproducto.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProveedorProducto=(TitledBorder)this.jScrollPanelDatosProveedorProducto.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderProveedorProducto.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteProveedorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProveedorProducto(this.getproveedorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.proveedorproducto==null) {
						this.proveedorproducto = new ProveedorProducto();
					}

					this.setVariablesFormularioToObjetoActualProveedorProducto(this.proveedorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
				}

				if(this.proveedorproducto.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.proveedorproducto.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProveedorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonultimo_precioProveedorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProveedorProducto(this.getproveedorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.proveedorproducto==null) {
						this.proveedorproducto = new ProveedorProducto();
					}

					this.setVariablesFormularioToObjetoActualProveedorProducto(this.proveedorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
				}

				if(this.proveedorproducto.getultimo_precio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ultimo_precio = "+this.proveedorproducto.getultimo_precio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProveedorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecio_pactadoProveedorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProveedorProducto(this.getproveedorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.proveedorproducto==null) {
						this.proveedorproducto = new ProveedorProducto();
					}

					this.setVariablesFormularioToObjetoActualProveedorProducto(this.proveedorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
				}

				if(this.proveedorproducto.getprecio_pactado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio_pactado = "+this.proveedorproducto.getprecio_pactado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProveedorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondias_entregaProveedorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProveedorProducto(this.getproveedorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.proveedorproducto==null) {
						this.proveedorproducto = new ProveedorProducto();
					}

					this.setVariablesFormularioToObjetoActualProveedorProducto(this.proveedorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
				}

				if(this.proveedorproducto.getdias_entrega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dias_entrega = "+this.proveedorproducto.getdias_entrega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProveedorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionProveedorProductoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProveedorProducto(this.getproveedorproducto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.proveedorproducto==null) {
						this.proveedorproducto = new ProveedorProducto();
					}

					this.setVariablesFormularioToObjetoActualProveedorProducto(this.proveedorproducto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);
				}

				if(this.proveedorproducto.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.proveedorproducto.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProveedorProducto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaProveedorProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProveedorProducto(false,false);

			this.getProveedorProductosFK_IdBodega();

			this.inicializarActualizarBindingProveedorProducto(false);

			//if(ProveedorProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProveedorProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteProveedorProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProveedorProducto(false,false);

			this.getProveedorProductosFK_IdCliente();

			this.inicializarActualizarBindingProveedorProducto(false);

			//if(ProveedorProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProveedorProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProveedorProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProveedorProducto(false,false);

			this.getProveedorProductosFK_IdEmpresa();

			this.inicializarActualizarBindingProveedorProducto(false);

			//if(ProveedorProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProveedorProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProveedorProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProveedorProducto(false,false);

			this.getProveedorProductosFK_IdProducto();

			this.inicializarActualizarBindingProveedorProducto(false);

			//if(ProveedorProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProveedorProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProveedorProductoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProveedorProducto(false,false);

			this.getProveedorProductosFK_IdSucursal();

			this.inicializarActualizarBindingProveedorProducto(false);

			//if(ProveedorProductoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProveedorProducto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.proveedorproductoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProveedorProducto() {
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
			this.jInternalFrameDetalleFormProveedorProducto.setVisible(false);	    			
			this.jInternalFrameDetalleFormProveedorProducto.dispose();
			this.jInternalFrameDetalleFormProveedorProducto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProveedorProducto!=null) {
			this.jInternalFrameReporteDinamicoProveedorProducto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProveedorProducto.dispose();
			this.jInternalFrameReporteDinamicoProveedorProducto=null;
		}
		
		if(this.jInternalFrameImportacionProveedorProducto!=null) {
			this.jInternalFrameImportacionProveedorProducto.setVisible(false);	    			
			this.jInternalFrameImportacionProveedorProducto.dispose();
			this.jInternalFrameImportacionProveedorProducto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProveedorProducto();
			
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			
			
			if(sTipo.equals("NuevoProveedorProducto")) {
				jButtonNuevoProveedorProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProveedorProducto")) {
				jButtonDuplicarProveedorProductoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProveedorProducto")) {
				jButtonCopiarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormProveedorProducto")) {
				jButtonVerFormProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProveedorProducto")) {
				jButtonNuevoProveedorProductoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProveedorProducto")) {
				jButtonDuplicarProveedorProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProveedorProducto")) {
				jButtonNuevoProveedorProductoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProveedorProducto")) {
				jButtonDuplicarProveedorProductoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProveedorProducto")) {
				jButtonNuevoProveedorProductoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProveedorProducto")) {
				jButtonNuevoProveedorProductoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProveedorProducto")) {
				jButtonNuevoProveedorProductoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProveedorProducto")) {
				jButtonModificarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProveedorProducto")) {
				jButtonModificarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProveedorProducto")) {
				jButtonModificarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProveedorProducto")) {
				jButtonActualizarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProveedorProducto")) {
				jButtonActualizarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProveedorProducto")) {
				jButtonActualizarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarProveedorProducto")) {
				jButtonEliminarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProveedorProducto")) {
				jButtonEliminarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProveedorProducto")) {
				jButtonEliminarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarProveedorProducto")) {
				jButtonCancelarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProveedorProducto")) {
				jButtonCancelarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProveedorProducto")) {
				jButtonCancelarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarProveedorProducto")) {
				jButtonCerrarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProveedorProducto")) {
				jButtonCerrarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProveedorProducto")) {
				jButtonCerrarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProveedorProducto")) {
				jButtonMostrarOcultarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProveedorProducto")) {
				jButtonCancelarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProveedorProducto")) {
				jButtonGuardarCambiosProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProveedorProducto")) {
				jButtonGuardarCambiosProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProveedorProducto")) {
				jButtonCopiarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProveedorProducto")) {
				jButtonVerFormProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProveedorProducto")) {
				jButtonGuardarCambiosProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProveedorProducto")) {
				jButtonCopiarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProveedorProducto")) {
				jButtonVerFormProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProveedorProducto")) {
				jButtonGuardarCambiosProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProveedorProducto")) {
				jButtonGuardarCambiosProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProveedorProducto")) {
				jButtonGuardarCambiosProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProveedorProducto")) {
				jButtonRecargarInformacionProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProveedorProducto")) {
				jButtonRecargarInformacionProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProveedorProducto")) {
				jButtonRecargarInformacionProveedorProductoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProveedorProducto")) {
				jButtonAnterioresProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProveedorProducto")) {
				jButtonAnterioresProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProveedorProducto")) {
				jButtonAnterioresProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProveedorProducto")) {
				jButtonSiguientesProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProveedorProducto")) {
				jButtonSiguientesProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProveedorProducto")) {
				jButtonSiguientesProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProveedorProducto") || sTipo.equals("MenuItemDetalleAbrirOrderByProveedorProducto")) {
				jButtonAbrirOrderByProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProveedorProducto") || sTipo.equals("MenuItemDetalleMostrarOcultarProveedorProducto")) {
				jButtonMostrarOcultarProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProveedorProducto")) {
				jButtonNuevoGuardarCambiosProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProveedorProducto")) {
				jButtonNuevoGuardarCambiosProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProveedorProducto")) {
				jButtonNuevoGuardarCambiosProveedorProductoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProveedorProducto")) {
				jButtonCerrarReporteDinamicoProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProveedorProducto")) {
				jButtonGenerarReporteDinamicoProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProveedorProducto")) {
				
				jButtonGenerarExcelReporteDinamicoProveedorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProveedorProducto")) {
				jButtonCerrarImportacionProveedorProductoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProveedorProducto")) {
				
				jButtonGenerarImportacionProveedorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProveedorProducto")) {
				
				jButtonAbrirImportacionProveedorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProveedorProducto")) {
				jComboBoxTiposAccionesProveedorProductoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProveedorProducto")) {
				jComboBoxTiposRelacionesProveedorProductoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProveedorProducto")) {
				jComboBoxTiposAccionesProveedorProductoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProveedorProducto")) {
				
				jComboBoxTiposSeleccionarProveedorProductoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProveedorProducto")) {
				jTextFieldValorCampoGeneralProveedorProductoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProveedorProducto")) {
				jButtonAbrirOrderByProveedorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProveedorProducto")) {
				jButtonAbrirOrderByProveedorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProveedorProducto")) {
				jButtonCerrarOrderByProveedorProductoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProveedorProductoBusqueda")) {
				this.jButtonidProveedorProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProveedorProductoUpdate")) {
				this.jButtonid_empresaProveedorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProveedorProductoBusqueda")) {
				this.jButtonid_empresaProveedorProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProveedorProductoUpdate")) {
				this.jButtonid_sucursalProveedorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProveedorProductoBusqueda")) {
				this.jButtonid_sucursalProveedorProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProveedorProductoUpdate")) {
				this.jButtonid_bodegaProveedorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProveedorProductoBusqueda")) {
				this.jButtonid_bodegaProveedorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProveedorProducto")) {
				this.jButtonid_productoProveedorProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProveedorProductoUpdate")) {
				this.jButtonid_productoProveedorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProveedorProductoBusqueda")) {
				this.jButtonid_productoProveedorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteProveedorProducto")) {
				this.jButtonid_clienteProveedorProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteProveedorProductoUpdate")) {
				this.jButtonid_clienteProveedorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteProveedorProductoBusqueda")) {
				this.jButtonid_clienteProveedorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ultimo_precioProveedorProductoBusqueda")) {
				this.jButtonultimo_precioProveedorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio_pactadoProveedorProductoBusqueda")) {
				this.jButtonprecio_pactadoProveedorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_entregaProveedorProductoBusqueda")) {
				this.jButtondias_entregaProveedorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProveedorProductoBusqueda")) {
				this.jButtondescripcionProveedorProductoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteProveedorProducto")) {
				this.jButtonid_clienteProveedorProductoActionPerformed(evt);
			}
			else if(sTipo.equals("id_productoProveedorProducto")) {
				this.jButtonid_productoProveedorProductoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaProveedorProducto")) {
				this.jButtonFK_IdBodegaProveedorProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteProveedorProducto")) {
				this.jButtonFK_IdClienteProveedorProductoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoProveedorProducto")) {
				this.jButtonFK_IdProductoProveedorProductoActionPerformed(evt);
			}
			
			;
			
			
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProveedorProducto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProveedorProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.proveedorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
				
				


				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProveedorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProveedorProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProveedorProducto proveedorproductoLocal=null;
			
			if(!this.getEsControlTabla()) {
				proveedorproductoLocal=this.proveedorproducto;
			} else {
				proveedorproductoLocal=this.proveedorproductoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.proveedorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
							
				
				


				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProveedorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProveedorProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProveedorProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoAnterior =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.proveedorproductoAnterior =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
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
			
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			
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
			
			


			
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProveedorProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.proveedorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
								
						
				


				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProveedorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProveedorProducto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.proveedorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
								
				
				


				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProveedorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProveedorProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProveedorProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoAnterior =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.proveedorproductoAnterior =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.proveedorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProveedorProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoAnterior =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.proveedorproductoAnterior =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProveedorProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.proveedorproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.proveedorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
							
				
				


				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProveedorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProveedorProducto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProveedorProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.proveedorproductoAnterior =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.proveedorproductoAnterior =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
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
			
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			
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
			
			


			
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProveedorProductoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.proveedorproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.proveedorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
								
				
				


				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProveedorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProveedorProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProveedorProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoAnterior =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.proveedorproductoAnterior =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProveedorProductoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.proveedorproducto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProveedorProductoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.proveedorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProveedorProducto")) {
					jCheckBoxSeleccionarTodosProveedorProductoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProveedorProducto")) {
					jCheckBoxSeleccionadosProveedorProductoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProveedorProducto")) {
					
				}
				
				


				
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProveedorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProveedorProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.proveedorproducto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
												
				
				


				
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProveedorProducto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProveedorProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProveedorProductoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.proveedorproductoAnterior =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.proveedorproductoAnterior =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProveedorProductoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.proveedorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
				
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
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
			
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
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
			
			


			
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProveedorProductoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.proveedorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProveedorProducto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProveedorProducto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.proveedorproducto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.proveedorproducto);
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
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
				
				


				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProveedorProducto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProveedorProducto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProveedorProductoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.proveedorproductoAnterior =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.proveedorproductoAnterior =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProveedorProducto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProveedorProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProveedorProducto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.proveedorproducto =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.proveedorproducto =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.proveedorproducto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProveedorProducto")) {
				
				}
				
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProveedorProducto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProveedorProducto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProveedorProducto")) {
			
			}
			
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProveedorProducto();
			
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			
			if(sTipo.equals("NuevoProveedorProducto")) {
				jButtonNuevoProveedorProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProveedorProducto")) {
				jButtonDuplicarProveedorProductoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProveedorProducto")) {
				jButtonCopiarProveedorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProveedorProducto")) {
				jButtonVerFormProveedorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProveedorProducto")) {
				jButtonNuevoProveedorProductoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProveedorProducto")) {
				jButtonModificarProveedorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProveedorProducto")) {
				jButtonActualizarProveedorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProveedorProducto")) {
				jButtonEliminarProveedorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProveedorProducto")) {
				jButtonGuardarCambiosProveedorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProveedorProducto")) {
				jButtonCancelarProveedorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProveedorProducto")) {
				jButtonCerrarProveedorProductoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProveedorProducto")) {
				jButtonGuardarCambiosProveedorProductoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProveedorProducto")) {
				jButtonNuevoGuardarCambiosProveedorProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProveedorProducto")) {
				jButtonAbrirOrderByProveedorProductoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProveedorProducto")) {
				jButtonRecargarInformacionProveedorProductoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProveedorProducto")) {
				jButtonAnterioresProveedorProductoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProveedorProducto")) {
				jButtonSiguientesProveedorProductoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProveedorProductoBusqueda")) {
				this.jButtonidProveedorProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProveedorProductoUpdate")) {
				this.jButtonid_empresaProveedorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProveedorProductoBusqueda")) {
				this.jButtonid_empresaProveedorProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProveedorProductoUpdate")) {
				this.jButtonid_sucursalProveedorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProveedorProductoBusqueda")) {
				this.jButtonid_sucursalProveedorProductoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProveedorProductoUpdate")) {
				this.jButtonid_bodegaProveedorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProveedorProductoBusqueda")) {
				this.jButtonid_bodegaProveedorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProveedorProducto")) {
				this.jButtonid_productoProveedorProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProveedorProductoUpdate")) {
				this.jButtonid_productoProveedorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProveedorProductoBusqueda")) {
				this.jButtonid_productoProveedorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteProveedorProducto")) {
				this.jButtonid_clienteProveedorProductoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteProveedorProductoUpdate")) {
				this.jButtonid_clienteProveedorProductoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteProveedorProductoBusqueda")) {
				this.jButtonid_clienteProveedorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ultimo_precioProveedorProductoBusqueda")) {
				this.jButtonultimo_precioProveedorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precio_pactadoProveedorProductoBusqueda")) {
				this.jButtonprecio_pactadoProveedorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("dias_entregaProveedorProductoBusqueda")) {
				this.jButtondias_entregaProveedorProductoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProveedorProductoBusqueda")) {
				this.jButtondescripcionProveedorProductoBusquedaActionPerformed(evt);
			}
			
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProveedorProducto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProveedorProducto")) {
				closingInternalFrameProveedorProducto();
				
			} else if(sTipo.equals("jButtonCancelarProveedorProducto")) {
				JInternalFrameBase jInternalFrameDetalleFormProveedorProducto = (JInternalFrameBase)evt.getSource();
	            	
	            ProveedorProductoBeanSwingJInternalFrame jInternalFrameParent=(ProveedorProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormProveedorProducto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProveedorProductoActionPerformed(null);
			}
			
			ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.proveedorproducto,new Object(),this.proveedorproductoParameterGeneral,this.proveedorproductoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProveedorProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProveedorProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProveedorProducto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.proveedorproducto)) {
			if(!esControlTabla) {
				if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProveedorProducto(this.proveedorproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);			
				}
				
				if(this.proveedorproductoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProveedorProducto(this.proveedorproducto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.proveedorproductoReturnGeneral=proveedorproductoLogic.procesarEventosProveedorProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.proveedorproductoLogic.getProveedorProductos(),this.proveedorproducto,this.proveedorproductoParameterGeneral,this.isEsNuevoProveedorProducto,classes);//this.proveedorproductoLogic.getProveedorProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProveedorProducto(this.proveedorproductoReturnGeneral,this.proveedorproductoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.proveedorproductoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProveedorProducto(classes,this.proveedorproductoReturnGeneral,this.proveedorproductoBean,false);
					}
						
					if(this.proveedorproductoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProveedorProducto(this.proveedorproductoReturnGeneral.getProveedorProducto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProveedorProducto(this.proveedorproductoReturnGeneral.getProveedorProducto());	
					}
						
					if(this.proveedorproductoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProveedorProducto(this.proveedorproductoReturnGeneral.getProveedorProducto(),classes);//this.proveedorproductoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProveedorProducto(this.proveedorproducto,classes);//this.proveedorproductoBean);									
				}
			
				if(ProveedorProductoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProveedorProducto(this.proveedorproducto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProveedorProducto(this.proveedorproducto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.proveedorproductoAnterior!=null) {
						this.proveedorproducto=this.proveedorproductoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.proveedorproductoReturnGeneral=proveedorproductoLogic.procesarEventosProveedorProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.proveedorproductoLogic.getProveedorProductos(),this.proveedorproducto,this.proveedorproductoParameterGeneral,this.isEsNuevoProveedorProducto,classes);//this.proveedorproductoLogic.getProveedorProducto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.proveedorproductoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.proveedorproductoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.proveedorproductoReturnGeneral.getProveedorProducto(),proveedorproductoLogic.getProveedorProductos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.proveedorproductoReturnGeneral.getProveedorProducto(),this.proveedorproductos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProveedorProducto.repaint();
				
				//((AbstractTableModel) this.jTableDatosProveedorProducto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProveedorProducto();
			}
		}
	}
	
	public void actualizarVisualTableDatosProveedorProducto() throws Exception {
		
		ProveedorProductoModel proveedorproductoModel=(ProveedorProductoModel)this.jTableDatosProveedorProducto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			proveedorproductoModel.proveedorproductos=this.proveedorproductoLogic.getProveedorProductos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			proveedorproductoModel.proveedorproductos=this.proveedorproductos;
		}
		
		
		((ProveedorProductoModel) this.jTableDatosProveedorProducto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProveedorProducto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproveedorproductoAnterior(),this.proveedorproductoLogic.getProveedorProductos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproveedorproductoAnterior(),this.proveedorproductos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProveedorProducto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProveedorProducto(ProveedorProducto proveedorproducto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
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
										
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.proveedorproducto,new Object(),generalEntityParameterGeneral,this.proveedorproductoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.proveedorproductoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProveedorProductoConstantesFunciones.getClassesRelationshipsOfProveedorProducto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProveedorProductoConstantesFunciones.getClassesRelationshipsFromStringsOfProveedorProducto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProveedorProducto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProveedorProductoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.proveedorproducto,new Object(),generalEntityParameterGeneral,this.proveedorproductoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProveedorProducto(ProveedorProductoBean proveedorproductoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProveedorProducto(ArrayList<Classe> classes,ProveedorProductoReturnGeneral proveedorproductoReturnGeneral,ProveedorProductoBean proveedorproductoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProveedorProducto(ProveedorProducto proveedorproducto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.proveedorproducto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProveedorProducto = new ProveedorProductoDetalleFormJInternalFrame(jDesktopPane,this.proveedorproductoSessionBean.getConGuardarRelaciones(),this.proveedorproductoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.setVisible(false);
		this.jInternalFrameDetalleFormProveedorProducto.setSelected(false);						
		
		this.jInternalFrameDetalleFormProveedorProducto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProveedorProducto.proveedorproductoLogic=this.proveedorproductoLogic;
		
		this.cargarCombosFrameForeignKeyProveedorProducto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProveedorProducto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProveedorProducto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProveedorProducto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProveedorProducto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProveedorProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProveedorProducto"));
		
		this.jInternalFrameDetalleFormProveedorProducto.jButtonModificarProveedorProducto.addActionListener(new ButtonActionListener(this,"ModificarProveedorProducto"));

		
		this.jInternalFrameDetalleFormProveedorProducto.jButtonModificarToolBarProveedorProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarProveedorProducto"));
					
		this.jInternalFrameDetalleFormProveedorProducto.jMenuItemModificarProveedorProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarProveedorProducto"));		
		
		
		
		this.jInternalFrameDetalleFormProveedorProducto.jButtonActualizarProveedorProducto.addActionListener (new ButtonActionListener(this,"ActualizarProveedorProducto"));
		
		
		this.jInternalFrameDetalleFormProveedorProducto.jButtonActualizarToolBarProveedorProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProveedorProducto"));
						
		this.jInternalFrameDetalleFormProveedorProducto.jMenuItemActualizarProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProveedorProducto"));		
		
		
		
		this.jInternalFrameDetalleFormProveedorProducto.jButtonEliminarProveedorProducto.addActionListener (new ButtonActionListener(this,"EliminarProveedorProducto"));
		
		
		this.jInternalFrameDetalleFormProveedorProducto.jButtonEliminarToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarProveedorProducto"));
								
		this.jInternalFrameDetalleFormProveedorProducto.jMenuItemEliminarProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProveedorProducto"));		
		
		
		
		this.jInternalFrameDetalleFormProveedorProducto.jButtonCancelarProveedorProducto.addActionListener (new ButtonActionListener(this,"CancelarProveedorProducto"));
		
		
		this.jInternalFrameDetalleFormProveedorProducto.jButtonCancelarToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarProveedorProducto"));
					
		this.jInternalFrameDetalleFormProveedorProducto.jMenuItemCancelarProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProveedorProducto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProveedorProducto.jMenuItemDetalleCerrarProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProveedorProducto"));		
		
		
		
		this.jInternalFrameDetalleFormProveedorProducto.jButtonGuardarCambiosToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProveedorProducto"));
		
		
		
		this.jInternalFrameDetalleFormProveedorProducto.jButtonGuardarCambiosToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProveedorProducto"));
		
		
		
		this.jInternalFrameDetalleFormProveedorProducto.jComboBoxTiposAccionesFormularioProveedorProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProveedorProducto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonidProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"idProveedorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_empresaProveedorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProveedorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_empresaProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProveedorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_sucursalProveedorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProveedorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_sucursalProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProveedorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_bodegaProveedorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProveedorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_bodegaProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProveedorProductoBusqueda"));
		//jButtonid_productoProveedorProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProveedorProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_productoProveedorProducto.addActionListener(new ButtonActionListener(this,"id_productoProveedorProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_productoProveedorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoProveedorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_productoProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProveedorProductoBusqueda"));
		//jButtonid_clienteProveedorProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteProveedorProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_clienteProveedorProducto.addActionListener(new ButtonActionListener(this,"id_clienteProveedorProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_clienteProveedorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteProveedorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_clienteProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteProveedorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonultimo_precioProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"ultimo_precioProveedorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonprecio_pactadoProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"precio_pactadoProveedorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtondias_entregaProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"dias_entregaProveedorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtondescripcionProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProveedorProductoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProveedorProducto.jTabbedPaneRelacionesProveedorProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProveedorProducto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProveedorProducto"));
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProveedorProducto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProveedorProducto"));
		}
		
		this.jTableDatosProveedorProducto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProveedorProducto"));
		
		this.jTableDatosProveedorProducto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProveedorProducto"));
		
		this.jButtonNuevoProveedorProducto.addActionListener(new ButtonActionListener(this,"NuevoProveedorProducto"));
		
		this.jButtonDuplicarProveedorProducto.addActionListener(new ButtonActionListener(this,"DuplicarProveedorProducto"));
		
		this.jButtonCopiarProveedorProducto.addActionListener(new ButtonActionListener(this,"CopiarProveedorProducto"));
		
		this.jButtonVerFormProveedorProducto.addActionListener(new ButtonActionListener(this,"VerFormProveedorProducto"));
		
		
		this.jButtonNuevoToolBarProveedorProducto.addActionListener(new ButtonActionListener(this,"NuevoToolBarProveedorProducto"));
			
		this.jButtonDuplicarToolBarProveedorProducto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProveedorProducto"));
			
		this.jMenuItemNuevoProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProveedorProducto"));
			
		this.jMenuItemDuplicarProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProveedorProducto"));		
		
		
		this.jButtonNuevoRelacionesProveedorProducto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProveedorProducto"));
		
		
		this.jButtonNuevoRelacionesToolBarProveedorProducto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProveedorProducto"));
			
		this.jMenuItemNuevoRelacionesProveedorProducto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProveedorProducto"));		
		
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProveedorProducto.jButtonModificarProveedorProducto.addActionListener(new ButtonActionListener(this,"ModificarProveedorProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProveedorProducto.jButtonModificarToolBarProveedorProducto.addActionListener(new ButtonActionListener(this,"ModificarToolBarProveedorProducto"));
			
			this.jInternalFrameDetalleFormProveedorProducto.jMenuItemModificarProveedorProducto.addActionListener(new ButtonActionListener(this,"MenuItemModificarProveedorProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProveedorProducto.jButtonActualizarProveedorProducto.addActionListener (new ButtonActionListener(this,"ActualizarProveedorProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProveedorProducto.jButtonActualizarToolBarProveedorProducto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProveedorProducto"));
				
			this.jInternalFrameDetalleFormProveedorProducto.jMenuItemActualizarProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProveedorProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProveedorProducto.jButtonEliminarProveedorProducto.addActionListener (new ButtonActionListener(this,"EliminarProveedorProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProveedorProducto.jButtonEliminarToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"EliminarToolBarProveedorProducto"));
						
			this.jInternalFrameDetalleFormProveedorProducto.jMenuItemEliminarProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProveedorProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProveedorProducto.jButtonCancelarProveedorProducto.addActionListener (new ButtonActionListener(this,"CancelarProveedorProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProveedorProducto.jButtonCancelarToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"CancelarToolBarProveedorProducto"));
			
			this.jInternalFrameDetalleFormProveedorProducto.jMenuItemCancelarProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProveedorProducto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProveedorProducto"));		
		
		
		this.jButtonCerrarProveedorProducto.addActionListener (new ButtonActionListener(this,"CerrarProveedorProducto"));
		
		
		this.jButtonCerrarToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"CerrarToolBarProveedorProducto"));
			
		this.jMenuItemCerrarProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProveedorProducto"));
			
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProveedorProducto.jMenuItemDetalleCerrarProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProveedorProducto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProveedorProducto.jButtonGuardarCambiosProveedorProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosProveedorProducto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProveedorProducto.jButtonGuardarCambiosToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProveedorProducto"));
		}
		
		this.jButtonCopiarToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"CopiarToolBarProveedorProducto"));
			
		this.jButtonVerFormToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"VerFormToolBarProveedorProducto"));
		
		this.jMenuItemGuardarCambiosProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProveedorProducto"));
			
		this.jMenuItemCopiarProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProveedorProducto"));		
		
		this.jMenuItemVerFormProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProveedorProducto"));		
		
		
		this.jButtonGuardarCambiosTablaProveedorProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProveedorProducto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProveedorProducto"));
			
		this.jMenuItemGuardarCambiosTablaProveedorProducto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProveedorProducto"));		
		
		
		
		this.jButtonRecargarInformacionProveedorProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionProveedorProducto"));
					
		this.jButtonRecargarInformacionToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProveedorProducto"));
		
		this.jMenuItemRecargarInformacionProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProveedorProducto"));		
		
		
		
		this.jButtonAnterioresProveedorProducto.addActionListener (new ButtonActionListener(this,"AnterioresProveedorProducto"));
		
		
		this.jButtonAnterioresToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProveedorProducto"));
		
		this.jMenuItemAnterioresProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProveedorProducto"));		
		
		
		this.jButtonSiguientesProveedorProducto.addActionListener (new ButtonActionListener(this,"SiguientesProveedorProducto"));
		
		
		this.jButtonSiguientesToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProveedorProducto"));
			
		this.jMenuItemSiguientesProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProveedorProducto"));
			
		this.jMenuItemAbrirOrderByProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProveedorProducto"));
			
		this.jMenuItemMostrarOcultarProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProveedorProducto"));
			
		this.jMenuItemDetalleAbrirOrderByProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProveedorProducto"));
			
		this.jMenuItemDetalleMostarOcultarProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProveedorProducto"));		
		
		
		this.jButtonNuevoGuardarCambiosProveedorProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProveedorProducto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProveedorProducto"));
			
		this.jMenuItemNuevoGuardarCambiosProveedorProducto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProveedorProducto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProveedorProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProveedorProducto"));

		this.jCheckBoxSeleccionadosProveedorProducto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProveedorProducto"));
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProveedorProducto.jComboBoxTiposAccionesFormularioProveedorProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProveedorProducto"));
		}
		
		
		this.jComboBoxTiposRelacionesProveedorProducto.addActionListener (new ButtonActionListener(this,"TiposRelacionesProveedorProducto"));
			
		this.jComboBoxTiposAccionesProveedorProducto.addActionListener (new ButtonActionListener(this,"TiposAccionesProveedorProducto"));
					
		this.jComboBoxTiposSeleccionarProveedorProducto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProveedorProducto"));
			
		this.jTextFieldValorCampoGeneralProveedorProducto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProveedorProducto"));		
		
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonidProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"idProveedorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_empresaProveedorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProveedorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_empresaProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProveedorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_sucursalProveedorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProveedorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_sucursalProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProveedorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_bodegaProveedorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProveedorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_bodegaProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProveedorProductoBusqueda"));
		//jButtonid_productoProveedorProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProveedorProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_productoProveedorProducto.addActionListener(new ButtonActionListener(this,"id_productoProveedorProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_productoProveedorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoProveedorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_productoProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProveedorProductoBusqueda"));
		//jButtonid_clienteProveedorProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteProveedorProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_clienteProveedorProducto.addActionListener(new ButtonActionListener(this,"id_clienteProveedorProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_clienteProveedorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteProveedorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_clienteProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteProveedorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonultimo_precioProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"ultimo_precioProveedorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonprecio_pactadoProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"precio_pactadoProveedorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtondias_entregaProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"dias_entregaProveedorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtondescripcionProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProveedorProductoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaProveedorProducto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProveedorProducto"));

			this.jButtonFK_IdClienteProveedorProducto.addActionListener(new ButtonActionListener(this,"FK_IdClienteProveedorProducto"));

			this.jButtonBuscarFK_IdClienteid_clienteProveedorProducto.addActionListener(new ButtonActionListener(this,"id_clienteProveedorProducto"));

			this.jButtonFK_IdProductoProveedorProducto.addActionListener(new ButtonActionListener(this,"FK_IdProductoProveedorProducto"));

			this.jButtonBuscarFK_IdProductoid_productoProveedorProducto.addActionListener(new ButtonActionListener(this,"id_productoProveedorProducto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProveedorProducto!=null) {
				this.jInternalFrameReporteDinamicoProveedorProducto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProveedorProducto"));
				this.jInternalFrameReporteDinamicoProveedorProducto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProveedorProducto"));
				this.jInternalFrameReporteDinamicoProveedorProducto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProveedorProducto"));
			}
			
			//this.jButtonCerrarReporteDinamicoProveedorProducto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProveedorProducto"));				
			//this.jButtonGenerarReporteDinamicoProveedorProducto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProveedorProducto"));
			//this.jButtonGenerarExcelReporteDinamicoProveedorProducto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProveedorProducto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProveedorProducto!=null) {
				this.jInternalFrameImportacionProveedorProducto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProveedorProducto"));
				this.jInternalFrameImportacionProveedorProducto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProveedorProducto"));
				this.jInternalFrameImportacionProveedorProducto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProveedorProducto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProveedorProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByProveedorProducto"));
			
			this.jButtonAbrirOrderByToolBarProveedorProducto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProveedorProducto"));			
			
			if(this.jInternalFrameOrderByProveedorProducto!=null) {
				this.jInternalFrameOrderByProveedorProducto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProveedorProducto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProveedorProducto.jTabbedPaneRelacionesProveedorProducto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProveedorProducto"));
		
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
            		closingInternalFrameProveedorProducto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProveedorProducto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProveedorProducto = (JInternalFrameBase)event.getSource();
	            	
	            ProveedorProductoBeanSwingJInternalFrame jInternalFrameParent=(ProveedorProductoBeanSwingJInternalFrame)jInternalFrameDetalleFormProveedorProducto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProveedorProductoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProveedorProducto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProveedorProductoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProveedorProducto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProveedorProducto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProveedorProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProveedorProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProveedorProductoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProveedorProducto";
		inputMap = this.jButtonNuevoProveedorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProveedorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProveedorProductoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProveedorProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProveedorProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProveedorProductoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProveedorProducto";
		inputMap = this.jButtonNuevoRelacionesProveedorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProveedorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProveedorProductoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProveedorProducto";
		inputMap = this.jButtonModificarProveedorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProveedorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProveedorProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProveedorProducto";
		inputMap = this.jButtonActualizarProveedorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProveedorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProveedorProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProveedorProducto";
		inputMap = this.jButtonEliminarProveedorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProveedorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProveedorProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProveedorProducto";
		inputMap = this.jButtonCancelarProveedorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProveedorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProveedorProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProveedorProducto";
		inputMap = this.jButtonCerrarProveedorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProveedorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProveedorProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProveedorProducto.jButtonGuardarCambiosProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProveedorProducto";
		inputMap = this.jInternalFrameDetalleFormProveedorProducto.jButtonGuardarCambiosProveedorProducto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProveedorProducto.jButtonGuardarCambiosProveedorProducto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProveedorProductoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProveedorProducto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProveedorProductoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProveedorProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProveedorProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProveedorProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProveedorProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProveedorProducto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProveedorProductoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonidProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"idProveedorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_empresaProveedorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProveedorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_empresaProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProveedorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_sucursalProveedorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProveedorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_sucursalProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProveedorProductoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_bodegaProveedorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProveedorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_bodegaProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProveedorProductoBusqueda"));
		//jButtonid_productoProveedorProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProveedorProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_productoProveedorProducto.addActionListener(new ButtonActionListener(this,"id_productoProveedorProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_productoProveedorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_productoProveedorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_productoProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProveedorProductoBusqueda"));
		//jButtonid_clienteProveedorProducto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteProveedorProductoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_clienteProveedorProducto.addActionListener(new ButtonActionListener(this,"id_clienteProveedorProducto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_clienteProveedorProductoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteProveedorProductoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonid_clienteProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteProveedorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonultimo_precioProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"ultimo_precioProveedorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtonprecio_pactadoProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"precio_pactadoProveedorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtondias_entregaProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"dias_entregaProveedorProductoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProveedorProducto.jButtondescripcionProveedorProductoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProveedorProductoBusqueda"));
		
		
		this.jButtonFK_IdBodegaProveedorProducto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProveedorProducto"));

		this.jButtonFK_IdClienteProveedorProducto.addActionListener(new ButtonActionListener(this,"FK_IdClienteProveedorProducto"));

		this.jButtonBuscarFK_IdClienteid_clienteProveedorProducto.addActionListener(new ButtonActionListener(this,"id_clienteProveedorProducto"));

		this.jButtonFK_IdProductoProveedorProducto.addActionListener(new ButtonActionListener(this,"FK_IdProductoProveedorProducto"));

		this.jButtonBuscarFK_IdProductoid_productoProveedorProducto.addActionListener(new ButtonActionListener(this,"id_productoProveedorProducto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProveedorProducto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProveedorProductoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProveedorProductoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProveedorProducto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProveedorProducto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProveedorProducto proveedorproductoAux:this.proveedorproductoLogic.getProveedorProductos()) {
					proveedorproductoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProveedorProducto proveedorproductoAux:proveedorproductos) {
					proveedorproductoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProveedorProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProveedorProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProveedorProducto proveedorproductoAux:this.proveedorproductoLogic.getProveedorProductos()) {
						proveedorproductoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProveedorProducto proveedorproductoAux:proveedorproductos) {
						proveedorproductoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProveedorProducto proveedorproductoAux:this.proveedorproductoLogic.getProveedorProductos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProveedorProducto proveedorproductoAux:proveedorproductos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProveedorProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProveedorProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProveedorProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProveedorProductoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProveedorProducto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProveedorProducto.getSelectedRows();
			
			ProveedorProducto proveedorproductoLocal=new ProveedorProducto();
			
			//this.seleccionarTodosProveedorProducto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					proveedorproductoLocal =(ProveedorProducto) this.proveedorproductoLogic.getProveedorProductos().toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					proveedorproductoLocal =(ProveedorProducto) this.proveedorproductos.toArray()[this.jTableDatosProveedorProducto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				proveedorproductoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProveedorProducto proveedorproductoAux:this.proveedorproductoLogic.getProveedorProductos()) {
						proveedorproductoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProveedorProducto proveedorproductoAux:proveedorproductos) {
						proveedorproductoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProveedorProducto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProveedorProducto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProveedorProducto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProveedorProducto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProveedorProductoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProveedorProductoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProveedorProductoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProveedorProducto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProveedorProducto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProveedorProducto proveedorproductoAux:this.proveedorproductoLogic.getProveedorProductos()) {
				
						if(sTipoSeleccionar.equals(ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO)) {
							existe=true;
							proveedorproductoAux.setultimo_precio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO)) {
							existe=true;
							proveedorproductoAux.setprecio_pactado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA)) {
							existe=true;
							proveedorproductoAux.setdias_entrega(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							proveedorproductoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProveedorProducto proveedorproductoAux:proveedorproductos) {
					
						if(sTipoSeleccionar.equals(ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO)) {
							existe=true;
							proveedorproductoAux.setultimo_precio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO)) {
							existe=true;
							proveedorproductoAux.setprecio_pactado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA)) {
							existe=true;
							proveedorproductoAux.setdias_entrega(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							proveedorproductoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProveedorProducto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProveedorProductoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProveedorProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProveedorProducto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProveedorProducto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProveedorProducto.jComboBoxTiposAccionesFormularioProveedorProducto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProveedorProducto) {				
					conSplash=true;//false;										
					
					//this.startProcessProveedorProducto(conSplash);
				
					this.generarReporteProveedorProductosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProveedorProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProveedorProducto.jComboBoxTiposAccionesFormularioProveedorProducto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProveedorProductosSeleccionados();
				//this.jComboBoxTiposAccionesProveedorProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProveedorProductosSeleccionados(false);
				//this.jComboBoxTiposAccionesProveedorProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProveedorProductosSeleccionados(true);
				//this.jComboBoxTiposAccionesProveedorProducto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProveedorProducto();
				
				this.exportarProveedorProductosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProveedorProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProveedorProducto.jComboBoxTiposAccionesFormularioProveedorProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProveedorProductos();
				//this.importarProveedorProductos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProveedorProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProveedorProducto.jComboBoxTiposAccionesFormularioProveedorProducto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProveedorProducto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProveedorProductosSeleccionados();
				//this.jComboBoxTiposAccionesProveedorProducto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Producto Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProveedorProducto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProveedorProducto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProveedorProducto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProveedorProducto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProveedorProducto.jComboBoxTiposAccionesFormularioProveedorProducto.setSelectedIndex(0);					
				}	
			} 			
			else if(ProveedorProductoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProveedorProducto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProveedorProducto(conSplash);
					
						//this.actualizarParametrosGeneralProveedorProducto();
						
						this.generarReporteProcesoAccionProveedorProductosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProveedorProducto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProveedorProducto.jComboBoxTiposAccionesFormularioProveedorProducto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProveedorProductoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Producto ProveedorS SELECCIONADOS?", "MANTENIMIENTO DE Producto Proveedor", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProveedorProducto();
				
						this.actualizarParametrosGeneralProveedorProducto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.proveedorproductoReturnGeneral=proveedorproductoLogic.procesarAccionProveedorProductosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.proveedorproductoLogic.getProveedorProductos(),this.proveedorproductoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProveedorProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProveedorProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProveedorProducto.jComboBoxTiposAccionesFormularioProveedorProducto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProveedorProducto();
					
					ProveedorProductoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProveedorProductoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProveedorProducto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProveedorProducto.jComboBoxTiposAccionesFormularioProveedorProducto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProveedorProducto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProveedorProductoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProveedorProducto();
			
			if(this.jInternalFrameDetalleFormProveedorProducto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProveedorProducto> proveedorproductosSeleccionados=new ArrayList<ProveedorProducto>();		
			ProveedorProducto proveedorproducto=new ProveedorProducto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProveedorProducto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProveedorProducto.getSelectedItem();
			
			
			
			
			proveedorproductosSeleccionados=this.getProveedorProductosSeleccionados(true);
			//this.sTipoAccion;
			
			if(proveedorproductosSeleccionados.size()==1) {
				for(ProveedorProducto proveedorproductoAux:proveedorproductosSeleccionados) {
					proveedorproducto=proveedorproductoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProveedorProducto();
			
      		//this.finishProcessProveedorProducto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProveedorProductoReturnGeneral() throws Exception {
		if(this.proveedorproductoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.proveedorproductoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.proveedorproductoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.proveedorproductoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.proveedorproductoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.proveedorproductoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProveedorProducto(false);
		}
		
		if(this.proveedorproductoReturnGeneral.getConRetornoLista() || this.proveedorproductoReturnGeneral.getConRetornoObjeto()) {
			if(this.proveedorproductoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.proveedorproductoLogic.setProveedorProductos(this.proveedorproductoReturnGeneral.getProveedorProductos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.proveedorproductoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.proveedorproductoLogic.setProveedorProducto(this.proveedorproductoReturnGeneral.getProveedorProducto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProveedorProducto(false);
		}
	}
	
	public void actualizarParametrosGeneralProveedorProducto() throws Exception {
		
		
	}
	
	public ArrayList<ProveedorProducto> getProveedorProductosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProveedorProducto> proveedorproductosSeleccionados=new ArrayList<ProveedorProducto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProveedorProducto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProveedorProducto proveedorproductoAux:proveedorproductoLogic.getProveedorProductos()) {
					if(proveedorproductoAux.getIsSelected()) {
						proveedorproductosSeleccionados.add(proveedorproductoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProveedorProducto proveedorproductoAux:this.proveedorproductos) {
					if(proveedorproductoAux.getIsSelected()) {
						proveedorproductosSeleccionados.add(proveedorproductoAux);				
					}
				}
			}
			
			if(proveedorproductosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						proveedorproductosSeleccionados.addAll(this.proveedorproductoLogic.getProveedorProductos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						proveedorproductosSeleccionados.addAll(this.proveedorproductos);				
					}
				}
			}
		} else {
			proveedorproductosSeleccionados.add(this.proveedorproducto);
		}
		
		return proveedorproductosSeleccionados;
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
	
	public void generarReporteProveedorProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProveedorProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProveedorProductosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProveedorProductosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProveedorProductosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Producto Proveedor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProveedorProductosSeleccionados() throws Exception {
		ArrayList<ProveedorProducto> proveedorproductosSeleccionados=new ArrayList<ProveedorProducto>();		
		
		proveedorproductosSeleccionados=this.getProveedorProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProveedorProductos("Todos",proveedorproductosSeleccionados);
		
	}	
	
	public void generarReporteNormalProveedorProductosSeleccionados() throws Exception {
		ArrayList<ProveedorProducto> proveedorproductosSeleccionados=new ArrayList<ProveedorProducto>();		
		
		proveedorproductosSeleccionados=this.getProveedorProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProveedorProductos("Todos",proveedorproductosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProveedorProductosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProveedorProducto> proveedorproductosSeleccionados=new ArrayList<ProveedorProducto>();
		
		proveedorproductosSeleccionados=this.getProveedorProductosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProveedorProductos("Todos",proveedorproductosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProveedorProductosSeleccionados() throws Exception {
		ArrayList<ProveedorProducto> proveedorproductosSeleccionados=new ArrayList<ProveedorProducto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProveedorProducto();
		
		
		proveedorproductosSeleccionados=this.getProveedorProductosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProveedorProducto();
		
		
		//this.generarReporteProveedorProductos("Todos",proveedorproductosSeleccionados ,proveedorproductoImplementable,proveedorproductoImplementableHome);
	}
	
	public void mostrarImportacionProveedorProductos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProveedorProducto();
		
		this.abrirFrameImportacionProveedorProducto();		
		
			
		//this.generarReporteProveedorProductos("Todos",proveedorproductosSeleccionados ,proveedorproductoImplementable,proveedorproductoImplementableHome);
	}
	
	public void importarProveedorProductos() throws Exception {		
	
	}
	
	public void exportarProveedorProductosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProveedorProductosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProveedorProductosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProveedorProductosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Producto Proveedor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProveedorProductosSeleccionados() throws Exception {
		ArrayList<ProveedorProducto> proveedorproductosSeleccionados=new ArrayList<ProveedorProducto>();		
		
		proveedorproductosSeleccionados=this.getProveedorProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"proveedorproducto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProveedorProducto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProveedorProducto proveedorproductoAux:proveedorproductosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProveedorProducto(proveedorproductoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//proveedorproductoAux.setsDetalleGeneralEntityReporte(proveedorproductoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProveedorProducto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProveedorProductoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProveedorProductoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProveedorProductoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProveedorProductoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProveedorProductoConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProveedorProducto(ProveedorProducto proveedorproducto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=proveedorproducto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=proveedorproducto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=proveedorproducto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=proveedorproducto.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=proveedorproducto.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=proveedorproducto.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=proveedorproducto.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=proveedorproducto.getultimo_precio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=proveedorproducto.getprecio_pactado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=proveedorproducto.getdias_entrega().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=proveedorproducto.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProveedorProductosSeleccionados() throws Exception {
		ArrayList<ProveedorProducto> proveedorproductosSeleccionados=new ArrayList<ProveedorProducto>();		
		
		proveedorproductosSeleccionados=this.getProveedorProductosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"proveedorproducto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProveedorProductos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProveedorProducto(row);				
				iRow++;
			}				
			
			for(ProveedorProducto proveedorproductoAux:proveedorproductosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProveedorProducto(proveedorproductoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProveedorProductosSeleccionados() throws Exception {
		ArrayList<ProveedorProducto> proveedorproductosSeleccionados=new ArrayList<ProveedorProducto>();		
		
		proveedorproductosSeleccionados=this.getProveedorProductosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"proveedorproducto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("proveedorproductos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("proveedorproducto");
			//elementRoot.appendChild(element);
		
			for(ProveedorProducto proveedorproductoAux:proveedorproductosSeleccionados) {
				element = document.createElement("proveedorproducto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProveedorProducto(proveedorproductoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Proveedor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProveedorProducto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_ULTIMOPRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_PRECIOPACTADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProveedorProducto(ProveedorProducto proveedorproducto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(proveedorproducto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(proveedorproducto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(proveedorproducto.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(proveedorproducto.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(proveedorproducto.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(proveedorproducto.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(proveedorproducto.getultimo_precio());
		cell = row.createCell(iColumn++);cell.setCellValue(proveedorproducto.getprecio_pactado());
		cell = row.createCell(iColumn++);cell.setCellValue(proveedorproducto.getdias_entrega());
		cell = row.createCell(iColumn++);cell.setCellValue(proveedorproducto.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlProveedorProducto(ProveedorProducto proveedorproducto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProveedorProductoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(proveedorproducto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProveedorProductoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(proveedorproducto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProveedorProductoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(proveedorproducto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProveedorProductoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(proveedorproducto.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(ProveedorProductoConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(proveedorproducto.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ProveedorProductoConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(proveedorproducto.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementcliente_descripcion = document.createElement(ProveedorProductoConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(proveedorproducto.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementultimo_precio = document.createElement(ProveedorProductoConstantesFunciones.ULTIMOPRECIO);
		elementultimo_precio.appendChild(document.createTextNode(proveedorproducto.getultimo_precio().toString().trim()));
		element.appendChild(elementultimo_precio);

		Element elementprecio_pactado = document.createElement(ProveedorProductoConstantesFunciones.PRECIOPACTADO);
		elementprecio_pactado.appendChild(document.createTextNode(proveedorproducto.getprecio_pactado().toString().trim()));
		element.appendChild(elementprecio_pactado);

		Element elementdias_entrega = document.createElement(ProveedorProductoConstantesFunciones.DIASENTREGA);
		elementdias_entrega.appendChild(document.createTextNode(proveedorproducto.getdias_entrega().toString().trim()));
		element.appendChild(elementdias_entrega);

		Element elementdescripcion = document.createElement(ProveedorProductoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(proveedorproducto.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoProveedorProductosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProveedorProducto> proveedorproductosSeleccionados=new ArrayList<ProveedorProducto>();
		
		proveedorproductosSeleccionados=this.getProveedorProductosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProveedorProducto(proveedorproductosSeleccionados);
		
		this.generarReporteProveedorProductos("Todos",proveedorproductosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProveedorProducto(ArrayList<ProveedorProducto> proveedorproductosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProveedorProducto proveedorproductoAux:proveedorproductosSeleccionados) {
				proveedorproductoAux.setsDetalleGeneralEntityReporte(proveedorproductoAux.toString());
			
				if(sTipoSeleccionar.equals(ProveedorProductoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					proveedorproductoAux.setsDescripcionGeneralEntityReporte1(proveedorproductoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProveedorProductoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					proveedorproductoAux.setsDescripcionGeneralEntityReporte1(proveedorproductoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProveedorProductoConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					proveedorproductoAux.setsDescripcionGeneralEntityReporte1(proveedorproductoAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProveedorProductoConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					proveedorproductoAux.setsDescripcionGeneralEntityReporte1(proveedorproductoAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProveedorProductoConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					proveedorproductoAux.setsDescripcionGeneralEntityReporte1(proveedorproductoAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProveedorProductoConstantesFunciones.LABEL_DIASENTREGA)) {
					existe=true;
					proveedorproductoAux.setsDescripcionGeneralEntityReporte1(proveedorproductoAux.getdias_entrega().toString());
				}
				 else if(sTipoSeleccionar.equals(ProveedorProductoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					proveedorproductoAux.setsDescripcionGeneralEntityReporte1(proveedorproductoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProveedorProductoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProveedorProducto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProveedorProducto=true;
				this.isVisibilidadCeldaNuevoRelacionesProveedorProducto=true;
				this.isVisibilidadCeldaGuardarCambiosProveedorProducto=true;
			}
			
			this.isVisibilidadCeldaModificarProveedorProducto=false;
			this.isVisibilidadCeldaActualizarProveedorProducto=false;
			this.isVisibilidadCeldaEliminarProveedorProducto=false;
			this.isVisibilidadCeldaCancelarProveedorProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProveedorProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarProveedorProducto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProveedorProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesProveedorProducto=false;
			this.isVisibilidadCeldaGuardarCambiosProveedorProducto=false;
			this.isVisibilidadCeldaModificarProveedorProducto=false;
			this.isVisibilidadCeldaActualizarProveedorProducto=true;
			this.isVisibilidadCeldaEliminarProveedorProducto=false;
			this.isVisibilidadCeldaCancelarProveedorProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProveedorProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarProveedorProducto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProveedorProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesProveedorProducto=false;
			this.isVisibilidadCeldaGuardarCambiosProveedorProducto=false;
			this.isVisibilidadCeldaModificarProveedorProducto=false;
			this.isVisibilidadCeldaActualizarProveedorProducto=true;
			this.isVisibilidadCeldaEliminarProveedorProducto=true;
			this.isVisibilidadCeldaCancelarProveedorProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProveedorProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarProveedorProducto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProveedorProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesProveedorProducto=false;
			this.isVisibilidadCeldaGuardarCambiosProveedorProducto=false;
			this.isVisibilidadCeldaModificarProveedorProducto=false;
			this.isVisibilidadCeldaActualizarProveedorProducto=true;
			this.isVisibilidadCeldaEliminarProveedorProducto=false;
			this.isVisibilidadCeldaCancelarProveedorProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProveedorProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarProveedorProducto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProveedorProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesProveedorProducto=true;
			this.isVisibilidadCeldaGuardarCambiosProveedorProducto=true;
			this.isVisibilidadCeldaModificarProveedorProducto=false;
			this.isVisibilidadCeldaActualizarProveedorProducto=false;
			this.isVisibilidadCeldaEliminarProveedorProducto=false;
			this.isVisibilidadCeldaCancelarProveedorProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProveedorProducto=true;
				} else {
					this.isVisibilidadCeldaGuardarProveedorProducto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProveedorProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesProveedorProducto=false;
			this.isVisibilidadCeldaGuardarCambiosProveedorProducto=false;
			this.isVisibilidadCeldaActualizarProveedorProducto=false;
			this.isVisibilidadCeldaEliminarProveedorProducto=false;
			this.isVisibilidadCeldaCancelarProveedorProducto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProveedorProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarProveedorProducto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProveedorProducto=false;
			this.isVisibilidadCeldaNuevoRelacionesProveedorProducto=false;
			this.isVisibilidadCeldaGuardarCambiosProveedorProducto=false;
			this.isVisibilidadCeldaModificarProveedorProducto=true;
			this.isVisibilidadCeldaActualizarProveedorProducto=false;
			this.isVisibilidadCeldaEliminarProveedorProducto=false;
			this.isVisibilidadCeldaCancelarProveedorProducto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProveedorProducto=false;
				} else {
					this.isVisibilidadCeldaGuardarProveedorProducto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProveedorProductoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProveedorProducto=true;
			this.isVisibilidadCeldaNuevoRelacionesProveedorProducto=true;
			this.isVisibilidadCeldaGuardarCambiosProveedorProducto=true;
		} else {
			this.actualizarEstadoPanelsProveedorProducto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProveedorProducto=false;
			//this.isVisibilidadCeldaVerFormProveedorProducto=false;
			this.isVisibilidadCeldaDuplicarProveedorProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!proveedorproductoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProveedorProducto=false;
		} else {
			this.isVisibilidadCeldaNuevoProveedorProducto=false;
			this.isVisibilidadCeldaGuardarCambiosProveedorProducto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(proveedorproductoSessionBean.getEsGuardarRelacionado()) {
			if(!proveedorproductoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProveedorProducto=false;												
			}
			
			this.jButtonCerrarProveedorProducto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProveedorProducto=false;
		}
		
		if(!this.permiteMantenimiento(this.proveedorproducto)) {
			this.isVisibilidadCeldaActualizarProveedorProducto=false;
			this.isVisibilidadCeldaEliminarProveedorProducto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProveedorProducto() {
	}
	
	public void actualizarEstadoPanelsProveedorProducto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProveedorProducto!=null) {
				this.jScrollPanelDatosEdicionProveedorProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProveedorProducto!=null) {
				this.jTabbedPaneBusquedasProveedorProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProveedorProducto!=null) {
				this.jScrollPanelDatosProveedorProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProveedorProducto!=null) {
				this.jPanelPaginacionProveedorProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProveedorProducto!=null) {
				this.jPanelParametrosReportesProveedorProducto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProveedorProducto!=null) {
				this.jScrollPanelDatosEdicionProveedorProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProveedorProducto!=null) {
				this.jTabbedPaneBusquedasProveedorProducto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProveedorProducto!=null) {
				this.jScrollPanelDatosProveedorProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionProveedorProducto!=null) {
				this.jPanelPaginacionProveedorProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProveedorProducto!=null) {
				this.jPanelParametrosReportesProveedorProducto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProveedorProducto!=null) {
				this.jScrollPanelDatosEdicionProveedorProducto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProveedorProducto!=null) {
				this.jTabbedPaneBusquedasProveedorProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProveedorProducto!=null) {
				this.jScrollPanelDatosProveedorProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionProveedorProducto!=null) {
				this.jPanelPaginacionProveedorProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProveedorProducto!=null) {
				this.jPanelParametrosReportesProveedorProducto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProveedorProducto!=null) {
				this.jScrollPanelDatosEdicionProveedorProducto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProveedorProducto!=null) {
				this.jTabbedPaneBusquedasProveedorProducto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProveedorProducto!=null) {
				this.jScrollPanelDatosProveedorProducto.setVisible(false);
			}
			
			if(this.jPanelPaginacionProveedorProducto!=null) {
				this.jPanelPaginacionProveedorProducto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProveedorProducto!=null) {
				this.jPanelParametrosReportesProveedorProducto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProveedorProducto!=null) {
				this.jScrollPanelDatosEdicionProveedorProducto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProveedorProducto!=null) {
				this.jTabbedPaneBusquedasProveedorProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProveedorProducto!=null) {
				this.jScrollPanelDatosProveedorProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProveedorProducto!=null) {
				this.jPanelPaginacionProveedorProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProveedorProducto!=null) {
				this.jPanelParametrosReportesProveedorProducto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProveedorProducto!=null) {
				this.jScrollPanelDatosEdicionProveedorProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProveedorProducto!=null) {
				this.jTabbedPaneBusquedasProveedorProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProveedorProducto!=null) {
				this.jScrollPanelDatosProveedorProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProveedorProducto!=null) {
				this.jPanelPaginacionProveedorProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProveedorProducto!=null) {
				this.jPanelParametrosReportesProveedorProducto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProveedorProducto!=null) {
				this.jScrollPanelDatosEdicionProveedorProducto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProveedorProducto!=null) {
				this.jTabbedPaneBusquedasProveedorProducto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProveedorProducto!=null) {
				this.jScrollPanelDatosProveedorProducto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProveedorProducto!=null) {
				this.jPanelPaginacionProveedorProducto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProveedorProducto!=null) {
				this.jPanelParametrosReportesProveedorProducto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProveedorProducto!=null) {
					this.jTabbedPaneBusquedasProveedorProducto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProveedorProducto!=null) {
				this.jPanelParametrosReportesProveedorProducto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.proveedorproductoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProveedorProducto!=null) {
				this.jTabbedPaneBusquedasProveedorProducto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProveedorProducto!=null) {
				this.jPanelParametrosReportesProveedorProducto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProveedorProducto.remove(jPanelFK_IdBodegaProveedorProducto);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasProveedorProducto.remove(jPanelFK_IdClienteProveedorProducto);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProveedorProducto.remove(jPanelFK_IdProductoProveedorProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProveedorProducto.remove(jPanelFK_IdBodegaProveedorProducto);}

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasProveedorProducto.remove(jPanelFK_IdClienteProveedorProducto);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProveedorProducto.remove(jPanelFK_IdProductoProveedorProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProveedorProducto.remove(jPanelFK_IdBodegaProveedorProducto);}

			this.isVisibilidadFK_IdCliente=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasProveedorProducto.remove(jPanelFK_IdClienteProveedorProducto);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProveedorProducto.remove(jPanelFK_IdProductoProveedorProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProveedorProducto.remove(jPanelFK_IdBodegaProveedorProducto);}

			this.isVisibilidadFK_IdCliente=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasProveedorProducto.remove(jPanelFK_IdClienteProveedorProducto);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProveedorProducto.remove(jPanelFK_IdProductoProveedorProducto);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdBodega=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProveedorProducto.remove(jPanelFK_IdBodegaProveedorProducto);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasProveedorProducto.remove(jPanelFK_IdClienteProveedorProducto);}

			this.isVisibilidadFK_IdProducto=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProveedorProducto.remove(jPanelFK_IdProductoProveedorProducto);}
		}
		
	}
	
	
	
	

	public String registrarSesionProveedorProductoParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(proveedorproductoSessionBean==null) {
				proveedorproductoSessionBean=new ProveedorProductoSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(proveedorproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.proveedorproductoFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ProveedorProductoConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionProveedorProducto(true);
			//productoSessionBean.setlidProveedorProductoActual(this.idProveedorProductoActual);

			proveedorproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProveedorProducto(true);
			proveedorproductoSessionBean.setlIdProveedorProductoActualForeignKey(this.idProveedorProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionProveedorProductoParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(proveedorproductoSessionBean==null) {
				proveedorproductoSessionBean=new ProveedorProductoSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(proveedorproductoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.proveedorproductoFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ProveedorProductoConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionProveedorProducto(true);
			//clienteSessionBean.setlidProveedorProductoActual(this.idProveedorProductoActual);

			proveedorproductoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProveedorProducto(true);
			proveedorproductoSessionBean.setlIdProveedorProductoActualForeignKey(this.idProveedorProductoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProveedorProductoSessionBean proveedorproductoSessionBean=new ProveedorProductoSessionBean();
		
		if(this.proveedorproductoSessionBean==null) {
			this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
		}
		
		this.proveedorproductoSessionBean.setsUltimaBusquedaProveedorProducto(this.getsAccionBusqueda());
		this.proveedorproductoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.proveedorproductoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			proveedorproductoSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			proveedorproductoSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			proveedorproductoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			proveedorproductoSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			proveedorproductoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProveedorProductoSessionBean proveedorproductoSessionBean=new ProveedorProductoSessionBean();
		
		if(this.proveedorproductoSessionBean==null) {
			this.proveedorproductoSessionBean=new ProveedorProductoSessionBean();
		}
		
		if(this.proveedorproductoSessionBean.getsUltimaBusquedaProveedorProducto()!=null&&!this.proveedorproductoSessionBean.getsUltimaBusquedaProveedorProducto().equals("")) {
			this.setsAccionBusqueda(proveedorproductoSessionBean.getsUltimaBusquedaProveedorProducto());
			this.setiNumeroPaginacion(proveedorproductoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(proveedorproductoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(proveedorproductoSessionBean.getid_bodega());
				proveedorproductoSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(proveedorproductoSessionBean.getid_cliente());
				proveedorproductoSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(proveedorproductoSessionBean.getid_empresa());
				proveedorproductoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(proveedorproductoSessionBean.getid_producto());
				proveedorproductoSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(proveedorproductoSessionBean.getid_sucursal());
				proveedorproductoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.proveedorproductoSessionBean.setsUltimaBusquedaProveedorProducto("");
		this.proveedorproductoSessionBean.setiNumeroPaginacion(ProveedorProductoConstantesFunciones.INUMEROPAGINACION);
		this.proveedorproductoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProveedorProducto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProveedorProducto() {
		this.updateBorderResaltarBusquedasFormularioProveedorProducto();
		this.updateVisibilidadBusquedasFormularioProveedorProducto();
		this.updateHabilitarBusquedasFormularioProveedorProducto();
	}
	
	public void updateBorderResaltarBusquedasFormularioProveedorProducto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProveedorProducto.getComponents().length>0) {
	

		if(this.proveedorproductoConstantesFunciones.resaltarFK_IdBodegaProveedorProducto!=null) {
			index= this.jTabbedPaneBusquedasProveedorProducto.indexOfComponent(this.jPanelFK_IdBodegaProveedorProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProveedorProducto.getComponent(index);
				jPanel.setBorder(this.proveedorproductoConstantesFunciones.resaltarFK_IdBodegaProveedorProducto);
			}
		}

		if(this.proveedorproductoConstantesFunciones.resaltarFK_IdClienteProveedorProducto!=null) {
			index= this.jTabbedPaneBusquedasProveedorProducto.indexOfComponent(this.jPanelFK_IdClienteProveedorProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProveedorProducto.getComponent(index);
				jPanel.setBorder(this.proveedorproductoConstantesFunciones.resaltarFK_IdClienteProveedorProducto);
			}
		}

		if(this.proveedorproductoConstantesFunciones.resaltarFK_IdProductoProveedorProducto!=null) {
			index= this.jTabbedPaneBusquedasProveedorProducto.indexOfComponent(this.jPanelFK_IdProductoProveedorProducto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProveedorProducto.getComponent(index);
				jPanel.setBorder(this.proveedorproductoConstantesFunciones.resaltarFK_IdProductoProveedorProducto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProveedorProducto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProveedorProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProveedorProducto.indexOfComponent(this.jPanelFK_IdBodegaProveedorProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProveedorProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.proveedorproductoConstantesFunciones.mostrarFK_IdBodegaProveedorProducto);
			if(!this.proveedorproductoConstantesFunciones.mostrarFK_IdBodegaProveedorProducto && index>-1) {
				this.jTabbedPaneBusquedasProveedorProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProveedorProducto.indexOfComponent(this.jPanelFK_IdClienteProveedorProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProveedorProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.proveedorproductoConstantesFunciones.mostrarFK_IdClienteProveedorProducto);
			if(!this.proveedorproductoConstantesFunciones.mostrarFK_IdClienteProveedorProducto && index>-1) {
				this.jTabbedPaneBusquedasProveedorProducto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProveedorProducto.indexOfComponent(this.jPanelFK_IdProductoProveedorProducto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProveedorProducto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.proveedorproductoConstantesFunciones.mostrarFK_IdProductoProveedorProducto);
			if(!this.proveedorproductoConstantesFunciones.mostrarFK_IdProductoProveedorProducto && index>-1) {
				this.jTabbedPaneBusquedasProveedorProducto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProveedorProducto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProveedorProducto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProveedorProducto.indexOfComponent(this.jPanelFK_IdBodegaProveedorProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProveedorProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.proveedorproductoConstantesFunciones.activarFK_IdBodegaProveedorProducto);
				this.jTabbedPaneBusquedasProveedorProducto.setEnabledAt(index,this.proveedorproductoConstantesFunciones.activarFK_IdBodegaProveedorProducto);
			}

			index= this.jTabbedPaneBusquedasProveedorProducto.indexOfComponent(this.jPanelFK_IdClienteProveedorProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProveedorProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.proveedorproductoConstantesFunciones.activarFK_IdClienteProveedorProducto);
				this.jTabbedPaneBusquedasProveedorProducto.setEnabledAt(index,this.proveedorproductoConstantesFunciones.activarFK_IdClienteProveedorProducto);
			}

			index= this.jTabbedPaneBusquedasProveedorProducto.indexOfComponent(this.jPanelFK_IdProductoProveedorProducto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProveedorProducto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.proveedorproductoConstantesFunciones.activarFK_IdProductoProveedorProducto);
				this.jTabbedPaneBusquedasProveedorProducto.setEnabledAt(index,this.proveedorproductoConstantesFunciones.activarFK_IdProductoProveedorProducto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProveedorProducto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasProveedorProducto.indexOfComponent(this.jPanelFK_IdBodegaProveedorProducto);

			this.jTabbedPaneBusquedasProveedorProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProveedorProducto.getComponent(index);

			this.proveedorproductoConstantesFunciones.setResaltarFK_IdBodegaProveedorProducto(resaltar);

			jPanel.setBorder(this.proveedorproductoConstantesFunciones.resaltarFK_IdBodegaProveedorProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasProveedorProducto.indexOfComponent(this.jPanelFK_IdClienteProveedorProducto);

			this.jTabbedPaneBusquedasProveedorProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProveedorProducto.getComponent(index);

			this.proveedorproductoConstantesFunciones.setResaltarFK_IdClienteProveedorProducto(resaltar);

			jPanel.setBorder(this.proveedorproductoConstantesFunciones.resaltarFK_IdClienteProveedorProducto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasProveedorProducto.indexOfComponent(this.jPanelFK_IdProductoProveedorProducto);

			this.jTabbedPaneBusquedasProveedorProducto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProveedorProducto.getComponent(index);

			this.proveedorproductoConstantesFunciones.setResaltarFK_IdProductoProveedorProducto(resaltar);

			jPanel.setBorder(this.proveedorproductoConstantesFunciones.resaltarFK_IdProductoProveedorProducto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProveedorProducto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProveedorProducto() throws Exception {

		if(this.jInternalFrameDetalleFormProveedorProducto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProveedorProducto();
		this.updateVisibilidadResaltarControlesFormularioProveedorProducto();
		this.updateHabilitarResaltarControlesFormularioProveedorProducto();
		
	}
	
	public void updateBorderResaltarControlesFormularioProveedorProducto() throws Exception {
		if(this.jInternalFrameDetalleFormProveedorProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.proveedorproductoConstantesFunciones.resaltaridProveedorProducto!=null && this.jInternalFrameDetalleFormProveedorProducto!=null) {this.jInternalFrameDetalleFormProveedorProducto.jLabelidProveedorProducto.setBorder(this.proveedorproductoConstantesFunciones.resaltaridProveedorProducto);}
		if(this.proveedorproductoConstantesFunciones.resaltarid_empresaProveedorProducto!=null && this.jInternalFrameDetalleFormProveedorProducto!=null) {this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_empresaProveedorProducto.setBorder(this.proveedorproductoConstantesFunciones.resaltarid_empresaProveedorProducto);}
		if(this.proveedorproductoConstantesFunciones.resaltarid_sucursalProveedorProducto!=null && this.jInternalFrameDetalleFormProveedorProducto!=null) {this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_sucursalProveedorProducto.setBorder(this.proveedorproductoConstantesFunciones.resaltarid_sucursalProveedorProducto);}
		if(this.proveedorproductoConstantesFunciones.resaltarid_bodegaProveedorProducto!=null && this.jInternalFrameDetalleFormProveedorProducto!=null) {this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_bodegaProveedorProducto.setBorder(this.proveedorproductoConstantesFunciones.resaltarid_bodegaProveedorProducto);}
		if(this.proveedorproductoConstantesFunciones.resaltarid_productoProveedorProducto!=null && this.jInternalFrameDetalleFormProveedorProducto!=null) {this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_productoProveedorProducto.setBorder(this.proveedorproductoConstantesFunciones.resaltarid_productoProveedorProducto);}
		if(this.proveedorproductoConstantesFunciones.resaltarid_clienteProveedorProducto!=null && this.jInternalFrameDetalleFormProveedorProducto!=null) {this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_clienteProveedorProducto.setBorder(this.proveedorproductoConstantesFunciones.resaltarid_clienteProveedorProducto);}
		if(this.proveedorproductoConstantesFunciones.resaltarultimo_precioProveedorProducto!=null && this.jInternalFrameDetalleFormProveedorProducto!=null) {this.jInternalFrameDetalleFormProveedorProducto.jTextFieldultimo_precioProveedorProducto.setBorder(this.proveedorproductoConstantesFunciones.resaltarultimo_precioProveedorProducto);}
		if(this.proveedorproductoConstantesFunciones.resaltarprecio_pactadoProveedorProducto!=null && this.jInternalFrameDetalleFormProveedorProducto!=null) {this.jInternalFrameDetalleFormProveedorProducto.jTextFieldprecio_pactadoProveedorProducto.setBorder(this.proveedorproductoConstantesFunciones.resaltarprecio_pactadoProveedorProducto);}
		if(this.proveedorproductoConstantesFunciones.resaltardias_entregaProveedorProducto!=null && this.jInternalFrameDetalleFormProveedorProducto!=null) {this.jInternalFrameDetalleFormProveedorProducto.jTextFielddias_entregaProveedorProducto.setBorder(this.proveedorproductoConstantesFunciones.resaltardias_entregaProveedorProducto);}
		if(this.proveedorproductoConstantesFunciones.resaltardescripcionProveedorProducto!=null && this.jInternalFrameDetalleFormProveedorProducto!=null) {this.jInternalFrameDetalleFormProveedorProducto.jTextAreadescripcionProveedorProducto.setBorder(this.proveedorproductoConstantesFunciones.resaltardescripcionProveedorProducto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProveedorProducto() throws Exception {		
		if(this.jInternalFrameDetalleFormProveedorProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
	
		//this.jInternalFrameDetalleFormProveedorProducto.jLabelidProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostraridProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jPanelidProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostraridProveedorProducto);
		//this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_empresaProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarid_empresaProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jPanelid_empresaProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarid_empresaProveedorProducto);
		//this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_sucursalProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarid_sucursalProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jPanelid_sucursalProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarid_sucursalProveedorProducto);
		//this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_bodegaProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarid_bodegaProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jPanelid_bodegaProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarid_bodegaProveedorProducto);
		//this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_productoProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarid_productoProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jPanelid_productoProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarid_productoProveedorProducto);
			this.jInternalFrameDetalleFormProveedorProducto.jButtonid_productoProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarid_productoProveedorProducto);
		//this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_clienteProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarid_clienteProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jPanelid_clienteProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarid_clienteProveedorProducto);
			this.jInternalFrameDetalleFormProveedorProducto.jButtonid_clienteProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarid_clienteProveedorProducto);
		//this.jInternalFrameDetalleFormProveedorProducto.jTextFieldultimo_precioProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarultimo_precioProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jPanelultimo_precioProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarultimo_precioProveedorProducto);
		//this.jInternalFrameDetalleFormProveedorProducto.jTextFieldprecio_pactadoProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarprecio_pactadoProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jPanelprecio_pactadoProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrarprecio_pactadoProveedorProducto);
		//this.jInternalFrameDetalleFormProveedorProducto.jTextFielddias_entregaProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrardias_entregaProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jPaneldias_entregaProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrardias_entregaProveedorProducto);
		//this.jInternalFrameDetalleFormProveedorProducto.jTextAreadescripcionProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrardescripcionProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jPaneldescripcionProveedorProducto.setVisible(this.proveedorproductoConstantesFunciones.mostrardescripcionProveedorProducto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProveedorProducto() throws Exception {
		if(this.jInternalFrameDetalleFormProveedorProducto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProveedorProducto!=null) {
	
		this.jInternalFrameDetalleFormProveedorProducto.jLabelidProveedorProducto.setEnabled(this.proveedorproductoConstantesFunciones.activaridProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_empresaProveedorProducto.setEnabled(this.proveedorproductoConstantesFunciones.activarid_empresaProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_sucursalProveedorProducto.setEnabled(this.proveedorproductoConstantesFunciones.activarid_sucursalProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_bodegaProveedorProducto.setEnabled(this.proveedorproductoConstantesFunciones.activarid_bodegaProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_productoProveedorProducto.setEnabled(this.proveedorproductoConstantesFunciones.activarid_productoProveedorProducto);
			this.jInternalFrameDetalleFormProveedorProducto.jButtonid_productoProveedorProducto.setEnabled(this.proveedorproductoConstantesFunciones.activarid_productoProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jComboBoxid_clienteProveedorProducto.setEnabled(this.proveedorproductoConstantesFunciones.activarid_clienteProveedorProducto);
			this.jInternalFrameDetalleFormProveedorProducto.jButtonid_clienteProveedorProducto.setEnabled(this.proveedorproductoConstantesFunciones.activarid_clienteProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jTextFieldultimo_precioProveedorProducto.setEnabled(this.proveedorproductoConstantesFunciones.activarultimo_precioProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jTextFieldprecio_pactadoProveedorProducto.setEnabled(this.proveedorproductoConstantesFunciones.activarprecio_pactadoProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jTextFielddias_entregaProveedorProducto.setEnabled(this.proveedorproductoConstantesFunciones.activardias_entregaProveedorProducto);
		this.jInternalFrameDetalleFormProveedorProducto.jTextAreadescripcionProveedorProducto.setEnabled(this.proveedorproductoConstantesFunciones.activardescripcionProveedorProducto);
		}
	}
	
		
}