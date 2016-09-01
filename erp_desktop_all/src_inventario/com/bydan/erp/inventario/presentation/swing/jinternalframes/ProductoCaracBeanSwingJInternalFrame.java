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

import com.bydan.erp.inventario.util.ProductoCaracConstantesFunciones;
import com.bydan.erp.inventario.util.ProductoCaracParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ProductoCaracParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ProductoCaracBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProductoCaracBeanSwingJInternalFrame extends ProductoCaracJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoCaracBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoCarac> productocaracValidator = new ClassValidator<ProductoCarac>(ProductoCarac.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoCarac productocarac;	
	public ProductoCarac productocaracAux;
	public ProductoCarac productocaracAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoCarac productocaracTotales;
	public Long idProductoCaracActual;
	public Long iIdNuevoProductoCarac=0L;
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
	
	public Boolean isPermisoTodoProductoCarac;
	public Boolean isPermisoNuevoProductoCarac;
	public Boolean isPermisoActualizarProductoCarac;
	public Boolean isPermisoActualizarOriginalProductoCarac;
	public Boolean isPermisoEliminarProductoCarac;
	public Boolean isPermisoGuardarCambiosProductoCarac;
	public Boolean isPermisoConsultaProductoCarac;
	public Boolean isPermisoBusquedaProductoCarac;
	public Boolean isPermisoReporteProductoCarac;
	public Boolean isPermisoPaginacionMedioProductoCarac;
	public Boolean isPermisoPaginacionAltoProductoCarac;
	public Boolean isPermisoPaginacionTodoProductoCarac;
	public Boolean isPermisoCopiarProductoCarac;
	public Boolean isPermisoVerFormProductoCarac;
	public Boolean isPermisoDuplicarProductoCarac;
	public Boolean isPermisoOrdenProductoCarac;
	
	
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
	
	public ProductoCaracParameterReturnGeneral productocaracReturnGeneral;
	public ProductoCaracParameterReturnGeneral productocaracParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoCarac=false;
	public Boolean esParaAccionDesdeFormularioProductoCarac=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoCaracSessionBeanAdditional productocaracSessionBeanAdditional=null;
	
	public ProductoCaracSessionBeanAdditional getProductoCaracSessionBeanAdditional() {
		return this.productocaracSessionBeanAdditional;
	}
	
	public void setProductoCaracSessionBeanAdditional(ProductoCaracSessionBeanAdditional productocaracSessionBeanAdditional) {
		try {
			this.productocaracSessionBeanAdditional=productocaracSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoCaracBeanSwingJInternalFrameAdditional productocaracBeanSwingJInternalFrameAdditional=null;
	//public class ProductoCaracBeanSwingJInternalFrame
	
	public ProductoCaracBeanSwingJInternalFrameAdditional getProductoCaracBeanSwingJInternalFrameAdditional() {
		return this.productocaracBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoCaracBeanSwingJInternalFrameAdditional(ProductoCaracBeanSwingJInternalFrameAdditional productocaracBeanSwingJInternalFrameAdditional) {
		try {
			this.productocaracBeanSwingJInternalFrameAdditional=productocaracBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoCaracLogic productocaracLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoCarac productocaracBean;
	public ProductoCaracConstantesFunciones productocaracConstantesFunciones;
	//public ProductoCaracParameterReturnGeneral productocaracReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ProductoLogic productoLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoCarac> productocaracs;	
	//public List<ProductoCarac> productocaracsEliminados;
	//public List<ProductoCarac> productocaracsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoCarac=false;
	public Boolean isVisibilidadCeldaDuplicarProductoCarac=true;
	public Boolean isVisibilidadCeldaCopiarProductoCarac=true;
	public Boolean isVisibilidadCeldaVerFormProductoCarac=true;
	public Boolean isVisibilidadCeldaOrdenProductoCarac=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoCarac=false;
	public Boolean isVisibilidadCeldaModificarProductoCarac=false;
	public Boolean isVisibilidadCeldaActualizarProductoCarac=false;
	public Boolean isVisibilidadCeldaEliminarProductoCarac=false;
	public Boolean isVisibilidadCeldaCancelarProductoCarac=false;
	public Boolean isVisibilidadCeldaGuardarProductoCarac=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoCarac=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProductoCarac() {
		return this.iIdNuevoProductoCarac;
	}

	public void setiIdNuevoProductoCarac(Long iIdNuevoProductoCarac) {
		this.iIdNuevoProductoCarac = iIdNuevoProductoCarac;
	}
	
	public Long getidProductoCaracActual() {
		return this.idProductoCaracActual;
	}

	public void setidProductoCaracActual(Long idProductoCaracActual) {
		this.idProductoCaracActual = idProductoCaracActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoCarac getproductocarac() {
		return this.productocarac;
	}

	public void setproductocarac(ProductoCarac productocarac) {
		this.productocarac = productocarac;
	}
	
	public ProductoCarac getproductocaracAux() {
		return this.productocaracAux;
	}

	public void setproductocaracAux(ProductoCarac productocaracAux) {
		this.productocaracAux = productocaracAux;
	}				
	
	public ProductoCarac getproductocaracAnterior() {
		return this.productocaracAnterior;
	}

	public void setproductocaracAnterior(ProductoCarac productocaracAnterior) {
		this.productocaracAnterior = productocaracAnterior;
	}	
	
	public ProductoCarac getproductocaracTotales() {
		return this.productocaracTotales;
	}

	public void setproductocaracTotales(ProductoCarac productocaracTotales) {
		this.productocaracTotales = productocaracTotales;
	}	
	
	public ProductoCarac getproductocaracBean() {
		return this.productocaracBean;
	}

	public void setproductocaracBean(ProductoCarac productocaracBean) {
		this.productocaracBean = productocaracBean;
	}	
	
	public ProductoCaracParameterReturnGeneral getproductocaracReturnGeneral() {
		return this.productocaracReturnGeneral;
	}

	public void setproductocaracReturnGeneral(ProductoCaracParameterReturnGeneral productocaracReturnGeneral) {
		this.productocaracReturnGeneral = productocaracReturnGeneral;
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
	
	
	public ProductoCaracLogic getProductoCaracLogic()	{		
		return productocaracLogic;
	}

	public void setProductoCaracLogic(ProductoCaracLogic productocaracLogic) {
		this.productocaracLogic = productocaracLogic;
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
	
	public Boolean getIsEsNuevoProductoCarac() {
		return isEsNuevoProductoCarac;
	}

	public void setIsEsNuevoProductoCarac(Boolean isEsNuevoProductoCarac) {
		this.isEsNuevoProductoCarac = isEsNuevoProductoCarac;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoCarac() {
		return esParaAccionDesdeFormularioProductoCarac;
	}
	
	public void setEsParaAccionDesdeFormularioProductoCarac(Boolean esParaAccionDesdeFormularioProductoCarac) {
		this.esParaAccionDesdeFormularioProductoCarac = esParaAccionDesdeFormularioProductoCarac;
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

			if(this.productocaracSessionBean==null) {
				this.productocaracSessionBean=new ProductoCaracSessionBean();
			}

			if(!this.productocaracSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productocaracSessionBean.getlidEmpresaActual());
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

			if(this.productocaracSessionBean==null) {
				this.productocaracSessionBean=new ProductoCaracSessionBean();
			}

			if(!this.productocaracSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(productocaracSessionBean.getlidSucursalActual());
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

			if(this.productocaracSessionBean==null) {
				this.productocaracSessionBean=new ProductoCaracSessionBean();
			}

			if(!this.productocaracSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(productocaracSessionBean.getlidProductoActual());
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

					if(this.productocarac!=null) {
						this.productocarac.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoCarac!=null) {
						this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_empresaProductoCarac.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductoCarac.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductoCarac!=null) {
						if(this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_empresaProductoCarac.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_empresaProductoCarac.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductoCaracGenerico)throws Exception
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
				jComboBoxid_empresaProductoCaracGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductoCaracGenerico!=null && jComboBoxid_empresaProductoCaracGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductoCaracGenerico.setSelectedIndex(0);
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

					if(this.productocarac!=null) {
						this.productocarac.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProductoCarac!=null) {
						this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_sucursalProductoCarac.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProductoCarac.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProductoCarac!=null) {
						if(this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_sucursalProductoCarac.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_sucursalProductoCarac.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProductoCaracGenerico)throws Exception
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
				jComboBoxid_sucursalProductoCaracGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProductoCaracGenerico!=null && jComboBoxid_sucursalProductoCaracGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProductoCaracGenerico.setSelectedIndex(0);
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

					if(this.productocarac!=null) {
						this.productocarac.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoCarac!=null) {
						this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_productoProductoCarac.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProductoCarac.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProductoCarac!=null) {
						if(this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_productoProductoCarac.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_productoProductoCarac.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoProductoCarac!=null) {
						jComboBoxid_productoFK_IdProductoProductoCarac.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoProductoCarac!=null) {
							//jComboBoxid_productoFK_IdProductoProductoCarac.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoProductoCarac.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoProductoCarac.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProductoCaracGenerico)throws Exception
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
				jComboBoxid_productoProductoCaracGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProductoCaracGenerico!=null && jComboBoxid_productoProductoCaracGenerico.getItemCount()>0) {
					jComboBoxid_productoProductoCaracGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProductoCarac productocarac,JComboBox jComboBoxid_empresaProductoCaracGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductoCaracGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_empresaProductoCarac.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductoCaracGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productocarac.setid_empresa(empresaAux.getId());
				productocarac.setempresa_descripcion(ProductoCaracConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productocarac.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProductoCarac productocarac,JComboBox jComboBoxid_sucursalProductoCaracGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProductoCaracGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_sucursalProductoCarac.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProductoCaracGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				productocarac.setid_sucursal(sucursalAux.getId());
				productocarac.setsucursal_descripcion(ProductoCaracConstantesFunciones.getSucursalDescripcion(sucursalAux));
				productocarac.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProductoCarac productocarac,JComboBox jComboBoxid_productoProductoCaracGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProductoCaracGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_productoProductoCarac.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProductoCaracGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				productocarac.setid_producto(productoAux.getId());
				productocarac.setproducto_descripcion(ProductoCaracConstantesFunciones.getProductoDescripcion(productoAux));
				productocarac.setProducto(productoAux);			}
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

					if(!ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoCarac!=null) { 
							this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_empresaProductoCarac.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_empresaProductoCarac.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoCarac!=null) { 
					}

					if(!ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoCarac!=null) { 
							this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_sucursalProductoCarac.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_sucursalProductoCarac.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoCarac!=null) { 
					}

					if(!ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoCarac!=null) { 
							this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_productoProductoCarac.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_productoProductoCarac.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoCarac!=null) { 
					}

					if(!ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoCarac.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoProductoCarac.addItem(producto);
							}
						}

						if(!ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductoCarac!=null) {
							this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_empresaProductoCarac.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoCarac!=null) {
							this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_empresaProductoCarac.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoCarac!=null) {
							this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_sucursalProductoCarac.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoCarac!=null) {
							this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_sucursalProductoCarac.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoCarac!=null) {
							this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_productoProductoCarac.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoCarac!=null) {
							this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_productoProductoCarac.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoProductoCarac.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoCarac.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoCarac() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoCaracConstantesFunciones.refrescarForeignKeysDescripcionesProductoCarac(this.productocaracLogic.getProductoCaracs());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoCaracConstantesFunciones.refrescarForeignKeysDescripcionesProductoCarac(this.productocaracs);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Producto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productocaracLogic.setProductoCaracs(this.productocaracs);
			productocaracLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoCaracParameterReturnGeneral getProductoCaracParameterGeneral() {
		return this.productocaracParameterGeneral;
	}
	
	public void setProductoCaracParameterGeneral(ProductoCaracParameterReturnGeneral productocaracParameterGeneral) {
		this.productocaracParameterGeneral = productocaracParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoCarac() {
		return isPermisoTodoProductoCarac;
	}

	public void setIsPermisoTodoProductoCarac(Boolean isPermisoTodoProductoCarac) {
		this.isPermisoTodoProductoCarac = isPermisoTodoProductoCarac;
	}

	public Boolean getIsPermisoNuevoProductoCarac() {
		return isPermisoNuevoProductoCarac;
	}

	public void setIsPermisoNuevoProductoCarac(Boolean isPermisoNuevoProductoCarac) {
		this.isPermisoNuevoProductoCarac = isPermisoNuevoProductoCarac;
	}

	public Boolean getIsPermisoActualizarProductoCarac() {
		return isPermisoActualizarProductoCarac;
	}

	public void setIsPermisoActualizarProductoCarac(Boolean isPermisoActualizarProductoCarac) {
		this.isPermisoActualizarProductoCarac = isPermisoActualizarProductoCarac;
	}

	public Boolean getIsPermisoEliminarProductoCarac() {
		return isPermisoEliminarProductoCarac;
	}

	public void setIsPermisoEliminarProductoCarac(Boolean isPermisoEliminarProductoCarac) {
		this.isPermisoEliminarProductoCarac = isPermisoEliminarProductoCarac;
	}

	public Boolean getIsPermisoGuardarCambiosProductoCarac() {
		return isPermisoGuardarCambiosProductoCarac;
	}

	public void setIsPermisoGuardarCambiosProductoCarac(Boolean isPermisoGuardarCambiosProductoCarac) {
		this.isPermisoGuardarCambiosProductoCarac = isPermisoGuardarCambiosProductoCarac;
	}
	
	public Boolean getIsPermisoConsultaProductoCarac() {
		return isPermisoConsultaProductoCarac;
	}

	public void setIsPermisoConsultaProductoCarac(Boolean isPermisoConsultaProductoCarac) {
		this.isPermisoConsultaProductoCarac = isPermisoConsultaProductoCarac;
	}

	public Boolean getIsPermisoBusquedaProductoCarac() {
		return isPermisoBusquedaProductoCarac;
	}

	public void setIsPermisoBusquedaProductoCarac(Boolean isPermisoBusquedaProductoCarac) {
		this.isPermisoBusquedaProductoCarac = isPermisoBusquedaProductoCarac;
	}

	public Boolean getIsPermisoReporteProductoCarac() {
		return isPermisoReporteProductoCarac;
	}

	public void setIsPermisoReporteProductoCarac(Boolean isPermisoReporteProductoCarac) {
		this.isPermisoReporteProductoCarac = isPermisoReporteProductoCarac;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoCarac() {
		return isPermisoPaginacionMedioProductoCarac;
	}

	public void setIsPermisoPaginacionMedioProductoCarac(Boolean isPermisoPaginacionMedioProductoCarac) {
		this.isPermisoPaginacionMedioProductoCarac = isPermisoPaginacionMedioProductoCarac;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoCarac() {
		return isPermisoPaginacionTodoProductoCarac;
	}

	public void setIsPermisoPaginacionTodoProductoCarac(Boolean isPermisoPaginacionTodoProductoCarac) {
		this.isPermisoPaginacionTodoProductoCarac = isPermisoPaginacionTodoProductoCarac;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoCarac() {
		return isPermisoPaginacionAltoProductoCarac;
	}

	public void setIsPermisoPaginacionAltoProductoCarac(Boolean isPermisoPaginacionAltoProductoCarac) {
		this.isPermisoPaginacionAltoProductoCarac = isPermisoPaginacionAltoProductoCarac;
	}
	
	public Boolean getIsPermisoCopiarProductoCarac() {
		return isPermisoCopiarProductoCarac;
	}

	public void setIsPermisoCopiarProductoCarac(Boolean isPermisoCopiarProductoCarac) {
		this.isPermisoCopiarProductoCarac = isPermisoCopiarProductoCarac;
	}
	
	public Boolean getIsPermisoVerFormProductoCarac() {
		return isPermisoVerFormProductoCarac;
	}

	public void setIsPermisoVerFormProductoCarac(Boolean isPermisoVerFormProductoCarac) {
		this.isPermisoVerFormProductoCarac = isPermisoVerFormProductoCarac;
	}
	
	public Boolean getIsPermisoDuplicarProductoCarac() {
		return isPermisoDuplicarProductoCarac;
	}

	public void setIsPermisoDuplicarProductoCarac(Boolean isPermisoDuplicarProductoCarac) {
		this.isPermisoDuplicarProductoCarac = isPermisoDuplicarProductoCarac;
	}
	
	public Boolean getIsPermisoOrdenProductoCarac() {
		return isPermisoOrdenProductoCarac;
	}

	public void setIsPermisoOrdenProductoCarac(Boolean isPermisoOrdenProductoCarac) {
		this.isPermisoOrdenProductoCarac = isPermisoOrdenProductoCarac;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoCarac() {
		return isVisibilidadCeldaNuevoProductoCarac;
	}

	public void setIsVisibilidadCeldaNuevoProductoCarac(Boolean isVisibilidadCeldaNuevoProductoCarac) {
		this.isVisibilidadCeldaNuevoProductoCarac = isVisibilidadCeldaNuevoProductoCarac;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoCarac() {
		return isVisibilidadCeldaDuplicarProductoCarac;
	}

	public void setIsVisibilidadCeldaDuplicarProductoCarac(Boolean isVisibilidadCeldaDuplicarProductoCarac) {
		this.isVisibilidadCeldaDuplicarProductoCarac = isVisibilidadCeldaDuplicarProductoCarac;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoCarac() {
		return isVisibilidadCeldaCopiarProductoCarac;
	}

	public void setIsVisibilidadCeldaCopiarProductoCarac(Boolean isVisibilidadCeldaCopiarProductoCarac) {
		this.isVisibilidadCeldaCopiarProductoCarac = isVisibilidadCeldaCopiarProductoCarac;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoCarac() {
		return isVisibilidadCeldaVerFormProductoCarac;
	}

	public void setIsVisibilidadCeldaVerFormProductoCarac(Boolean isVisibilidadCeldaVerFormProductoCarac) {
		this.isVisibilidadCeldaVerFormProductoCarac = isVisibilidadCeldaVerFormProductoCarac;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoCarac() {
		return isVisibilidadCeldaOrdenProductoCarac;
	}

	public void setIsVisibilidadCeldaOrdenProductoCarac(Boolean isVisibilidadCeldaOrdenProductoCarac) {
		this.isVisibilidadCeldaOrdenProductoCarac = isVisibilidadCeldaOrdenProductoCarac;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoCarac() {
		return isVisibilidadCeldaNuevoRelacionesProductoCarac;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoCarac(Boolean isVisibilidadCeldaNuevoRelacionesProductoCarac) {
		this.isVisibilidadCeldaNuevoRelacionesProductoCarac = isVisibilidadCeldaNuevoRelacionesProductoCarac;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoCarac() {
		return isVisibilidadCeldaModificarProductoCarac;
	}

	public void setIsVisibilidadCeldaModificarProductoCarac(Boolean isVisibilidadCeldaModificarProductoCarac) {
		this.isVisibilidadCeldaModificarProductoCarac = isVisibilidadCeldaModificarProductoCarac;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoCarac() {
		return isVisibilidadCeldaActualizarProductoCarac;
	}

	public void setIsVisibilidadCeldaActualizarProductoCarac(Boolean isVisibilidadCeldaActualizarProductoCarac) {
		this.isVisibilidadCeldaActualizarProductoCarac = isVisibilidadCeldaActualizarProductoCarac;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoCarac() {
		return isVisibilidadCeldaEliminarProductoCarac;
	}

	public void setIsVisibilidadCeldaEliminarProductoCarac(Boolean isVisibilidadCeldaEliminarProductoCarac) {
		this.isVisibilidadCeldaEliminarProductoCarac = isVisibilidadCeldaEliminarProductoCarac;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoCarac() {
		return isVisibilidadCeldaCancelarProductoCarac;
	}

	public void setIsVisibilidadCeldaCancelarProductoCarac(Boolean isVisibilidadCeldaCancelarProductoCarac) {
		this.isVisibilidadCeldaCancelarProductoCarac = isVisibilidadCeldaCancelarProductoCarac;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoCarac() {
		return isVisibilidadCeldaGuardarProductoCarac;
	}

	public void setIsVisibilidadCeldaGuardarProductoCarac(Boolean isVisibilidadCeldaGuardarProductoCarac) {
		this.isVisibilidadCeldaGuardarProductoCarac = isVisibilidadCeldaGuardarProductoCarac;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoCarac() {
		return isVisibilidadCeldaGuardarCambiosProductoCarac;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoCarac(Boolean isVisibilidadCeldaGuardarCambiosProductoCarac) {
		this.isVisibilidadCeldaGuardarCambiosProductoCarac = isVisibilidadCeldaGuardarCambiosProductoCarac;
	}
		
	public ProductoCaracSessionBean getproductocaracSessionBean() {
		return this.productocaracSessionBean;
	}
	
	public void setproductocaracSessionBean(ProductoCaracSessionBean productocaracSessionBean) {
		this.productocaracSessionBean=productocaracSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoCarac(ProductoCarac productocarac)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(productocarac,null);
				this.setActualParaGuardarSucursalForeignKey(productocarac,null);
				this.setActualParaGuardarProductoForeignKey(productocarac,null);
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
	
	public void bugActualizarReferenciaActual(ProductoCarac productocarac,ProductoCarac productocaracAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoCarac(productocarac);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productocaracAux.setId(productocarac.getId());
		productocaracAux.setVersionRow(productocarac.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoCarac();
		
			int intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoCaracJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoCarac(this.productocarac,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productocaracValidator.getInvalidValues(this.productocarac);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productocaracLogic.setDatosCliente(datosCliente);
			productocaracLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productocaracAux=new  ProductoCarac();
				
				productocaracAux.setIsNew(true);
				productocaracAux.setIsChanged(true);
				
				productocaracAux.setProductoCaracOriginal(this.productocarac);
				
				productocaracAux.setId(this.productocarac.getId());	
				productocaracAux.setVersionRow(this.productocarac.getVersionRow());	
				productocaracAux.setid_empresa(this.productocarac.getid_empresa());	
				productocaracAux.setid_sucursal(this.productocarac.getid_sucursal());	
				productocaracAux.setid_producto(this.productocarac.getid_producto());	
				productocaracAux.setcaracteristica(this.productocarac.getcaracteristica());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productocaracSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productocaracSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productocaracAux,productocaracLogic.getProductoCaracs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productocaracAux,productocaracs);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productocaracSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productocaracSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productocaracLogic.saveProductoCaracs();//WithConnection
						//productocaracLogic.getSetVersionRowProductoCaracs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productocarac,productocaracAux);
					
					this.refrescarForeignKeysDescripcionesProductoCarac();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productocaracSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productocaracLogic.saveProductoCaracRelaciones(productocaracAux);//WithConnection
								//productocaracLogic.getSetVersionRowProductoCaracs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productocarac,productocaracAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productocaracSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productocaracSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productocaracAux,productocaracLogic.getProductoCaracs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productocaracAux,productocaracs);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productocarac,productocaracAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productocaracAux=new  ProductoCarac();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productocaracSessionBean.getEsGuardarRelacionado() 
					|| (this.productocaracSessionBean.getEsGuardarRelacionado() && this.productocarac.getId()>=0)) {
						
					productocaracAux.setIsNew(false);
				}
				
				productocaracAux.setIsDeleted(false);
			
				productocaracAux.setId(this.productocarac.getId());	
				productocaracAux.setVersionRow(this.productocarac.getVersionRow());	
				productocaracAux.setid_empresa(this.productocarac.getid_empresa());	
				productocaracAux.setid_sucursal(this.productocarac.getid_sucursal());	
				productocaracAux.setid_producto(this.productocarac.getid_producto());	
				productocaracAux.setcaracteristica(this.productocarac.getcaracteristica());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productocaracAux,productocaracLogic.getProductoCaracs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productocaracAux,productocaracs);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productocaracSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productocaracSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productocaracLogic.saveProductoCaracs();//WithConnection
						//productocaracLogic.getSetVersionRowProductoCaracs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productocarac,productocaracAux);
					
					this.refrescarForeignKeysDescripcionesProductoCarac();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productocaracSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productocaracLogic.saveProductoCaracRelaciones(productocaracAux);//WithConnection
								//productocaracLogic.getSetVersionRowProductoCaracs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productocarac,productocaracAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productocaracSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productocaracSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productocaracAux,productocaracLogic.getProductoCaracs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productocaracAux,productocaracs);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productocarac,productocaracAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productocaracAux=new  ProductoCarac();
				
				productocaracAux.setIsNew(false);
				productocaracAux.setIsChanged(false);
				
				productocaracAux.setIsDeleted(true);
				
				productocaracAux.setId(this.productocarac.getId());	
				productocaracAux.setVersionRow(this.productocarac.getVersionRow());	
				productocaracAux.setid_empresa(this.productocarac.getid_empresa());	
				productocaracAux.setid_sucursal(this.productocarac.getid_sucursal());	
				productocaracAux.setid_producto(this.productocarac.getid_producto());	
				productocaracAux.setcaracteristica(this.productocarac.getcaracteristica());	
				
				if(this.productocaracSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productocaracAux.getId()>=0) {	
						this.productocaracsEliminados.add(productocaracAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productocaracAux,productocaracLogic.getProductoCaracs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productocaracAux,productocaracs);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productocaracSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productocaracSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productocaracLogic.saveProductoCaracs();//WithConnection
						//productocaracLogic.getSetVersionRowProductoCaracs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productocaracSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productocaracLogic.saveProductoCaracRelaciones(productocaracAux);//WithConnection
								//productocaracLogic.getSetVersionRowProductoCaracs();//WithConnection
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
							if(this.productocaracSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productocaracSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productocaracAux,productocaracLogic.getProductoCaracs());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productocaracAux,productocaracs);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.getProductoCaracs().addAll(this.productocaracsEliminados);
					
					productocaracLogic.saveProductoCaracs();//WithConnection
					//productocaracLogic.getSetVersionRowProductoCaracs();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoCarac();
				
				this.productocaracsEliminados= new ArrayList<ProductoCarac>();		
			}
			
			if(this.productocaracSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productocaracSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Caracteristica GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Caracteristica",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productocarac=productocaracAux;
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
      		//this.finishProcessProductoCarac();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoCarac productocaracLocal) throws Exception {
		
		if(this.productocaracSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoCarac productocaracLocal) throws Exception {	
		if(this.productocaracSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productocaracLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				productocaracLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				productocaracLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoCaracActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productocaracValidator.getInvalidValues(this.productocarac);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoCarac productocarac,List<ProductoCarac> productocaracs) throws Exception {
		try	{		
			ProductoCaracConstantesFunciones.actualizarLista(productocarac,productocaracs,this.productocaracSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoCarac productocarac,List<ProductoCarac> productocaracs) throws Exception {
		try	{			
			ProductoCaracConstantesFunciones.actualizarSelectedLista(productocarac,productocaracs);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoCarac> productocaracsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productocaracsLocal=this.productocaracLogic.getProductoCaracs();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productocaracsLocal=this.productocaracs;
			}
			//ARCHITECTURE
		
			for(ProductoCarac productocaracLocal:productocaracsLocal) {
				if(this.permiteMantenimiento(productocaracLocal) && productocaracLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoCaracConstantesFunciones.getProductoCaracLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoCaracConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoCarac.jLabelid_empresaProductoCarac,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoCaracConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoCarac.jLabelid_sucursalProductoCarac,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoCaracConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoCarac.jLabelid_productoProductoCarac,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoCaracConstantesFunciones.CARACTERISTICA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoCarac.jLabelcaracteristicaProductoCarac,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoCarac.jLabelid_empresaProductoCarac,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoCarac.jLabelid_sucursalProductoCarac,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoCarac.jLabelid_productoProductoCarac,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoCarac.jLabelcaracteristicaProductoCarac,"");
		
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
		this.iIdNuevoProductoCarac--;	
		
		
		this.productocaracAux=new ProductoCarac();
		
		this.productocaracAux.setId(this.iIdNuevoProductoCarac);
		this.productocaracAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productocaracLogic.getProductoCaracs().add(this.productocaracAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productocaracs.add(this.productocaracAux);
		}
		//ARCHITECTURE
		
		this.productocarac=this.productocaracAux;
		
		if(ProductoCaracJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoCarac(this.productocarac);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoCarac(this.productocarac);
		}
				
		//this.setDefaultControlesProductoCarac();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoCarac();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoCarac();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoCarac();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoCarac(this.productocaracBean,this.productocarac,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoCaracConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productocaracSessionBean.getConGuardarRelaciones()) {
			classes=ProductoCaracConstantesFunciones.getClassesRelationshipsOfProductoCarac(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productocaracReturnGeneral=productocaracLogic.procesarEventosProductoCaracsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productocaracLogic.getProductoCaracs(),this.productocarac,this.productocaracParameterGeneral,this.isEsNuevoProductoCarac,classes);//this.productocaracLogic.getProductoCarac()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoCarac(this.productocaracReturnGeneral,this.productocaracBean,false);
		
		if(this.productocaracReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoCarac(this.productocaracReturnGeneral.getProductoCarac());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoCarac(this.productocaracReturnGeneral.getProductoCarac());
		}
		
		if(this.productocaracReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoCarac(this.productocaracReturnGeneral.getProductoCarac(),classes);//this.productocaracBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoCarac(this.productocarac,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoCarac();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoCarac();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoCaracBeanSwingJInternalFrameAdditional.RecargarFormProductoCarac(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoCarac(false);
						
			if(productocaracSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoCarac();
			}
			
			this.actualizarVisualTableDatosProductoCarac();
			
			this.jTableDatosProductoCarac.setRowSelectionInterval(this.getIndiceNuevoProductoCarac(), this.getIndiceNuevoProductoCarac());
			
			this.seleccionarFilaTablaProductoCaracActual();
						
			this.actualizarEstadoCeldasBotonesProductoCarac("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoCarac(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoCarac.jTextAreacaracteristicaProductoCarac.setEnabled(isHabilitar && this.productocaracConstantesFunciones.activarcaracteristicaProductoCarac);	
		//
		this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_empresaProductoCarac.setEnabled(isHabilitar && this.productocaracConstantesFunciones.activarid_empresaProductoCarac);//
		this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_sucursalProductoCarac.setEnabled(isHabilitar && this.productocaracConstantesFunciones.activarid_sucursalProductoCarac);
		this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_productoProductoCarac.setEnabled(isHabilitar && this.productocaracConstantesFunciones.activarid_productoProductoCarac);
	};
	
	public void setDefaultControlesProductoCarac() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoCarac(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productocaracSessionBean.setConGuardarRelaciones(true);			
			this.productocaracSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoCarac.jTabbedPaneRelacionesProductoCarac.setVisible(true);
			
					
		} else {
			//this.productocaracSessionBean.setConGuardarRelaciones(false);			
			this.productocaracSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoCarac.jTabbedPaneRelacionesProductoCarac.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoCarac() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoCarac productocaracAux:this.productocaracLogic.getProductoCaracs()) {
				if(productocaracAux.getId().equals(this.iIdNuevoProductoCarac)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoCarac productocaracAux:this.productocaracs) {
				if(productocaracAux.getId().equals(this.iIdNuevoProductoCarac)) {
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
	
	public int getIndiceActualProductoCarac(ProductoCarac productocarac,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoCarac productocaracAux:this.productocaracLogic.getProductoCaracs()) {
				if(productocaracAux.getId().equals(productocarac.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoCarac productocaracAux:this.productocaracs) {
				if(productocaracAux.getId().equals(productocarac.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoCarac(ProductoCarac productocaracOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoCarac productocaracAux:this.productocaracLogic.getProductoCaracs()) {
				if(productocaracAux.getProductoCaracOriginal().getId().equals(productocaracOriginal.getId())) {
					existe=true;
					productocaracOriginal.setId(productocaracAux.getId());
					productocaracOriginal.setVersionRow(productocaracAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoCarac productocaracAux:this.productocaracs) {
				if(productocaracAux.getProductoCaracOriginal().getId().equals(productocaracOriginal.getId())) {
					existe=true;
					productocaracOriginal.setId(productocaracAux.getId());
					productocaracOriginal.setVersionRow(productocaracAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoCarac(Boolean esParaCancelar) throws Exception {
		productocaracsAux=new ArrayList<ProductoCarac>();
		productocaracAux=new ProductoCarac();
		
		if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoCarac productocaracAux:this.productocaracLogic.getProductoCaracs()) {
					if(productocaracAux.getId()<0) {
						productocaracsAux.add(productocaracAux);
					}		
				}
				this.iIdNuevoProductoCarac=0L;
				this.productocaracLogic.getProductoCaracs().removeAll(productocaracsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoCarac productocaracAux:this.productocaracs) {
					if(productocaracAux.getId()<0) {
						productocaracsAux.add(productocaracAux);
					}		
				}
				this.iIdNuevoProductoCarac=0L;
				this.productocaracs.removeAll(productocaracsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoCarac 
					&& this.productocaracLogic.getProductoCaracs().size()>0
					) {
					productocaracAux=this.productocaracLogic.getProductoCaracs().get(this.productocaracLogic.getProductoCaracs().size() - 1);
				
					if(productocaracAux.getId()<0) {
						this.productocaracLogic.getProductoCaracs().remove(productocaracAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoCarac && this.productocaracs.size()>0) {
					productocaracAux=this.productocaracs.get(this.productocaracs.size() - 1);
				
					if(productocaracAux.getId()<0) {
						this.productocaracs.remove(productocaracAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoCarac(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productocarac.getId()<0) {
				this.productocaracLogic.getProductoCaracs().remove(this.productocarac);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productocarac.getId()<0) {
				this.productocaracs.remove(this.productocarac);
			}
		}			
	}
	
	public void setEstadosInicialesProductoCarac(List<ProductoCarac> productocaracsAux) throws Exception {
		ProductoCaracConstantesFunciones.setEstadosInicialesProductoCarac(productocaracsAux);
	}
	
	public void setEstadosInicialesProductoCarac(ProductoCarac productocaracAux) throws Exception {
		ProductoCaracConstantesFunciones.setEstadosInicialesProductoCarac(productocaracAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoCaracActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoCarac("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoCaracActual()) {
				if(!this.isEsNuevoProductoCarac) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoCarac("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoCarac=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoCaracActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Caracteristica ?", "MANTENIMIENTO DE Caracteristica", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoCarac("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoCarac productocarac) throws Exception {
		ProductoCaracConstantesFunciones.seleccionarAsignar(this.productocarac,productocarac);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoCarac=this.isPermisoActualizarOriginalProductoCarac;
			
			
			this.seleccionarAsignar(productocarac);
			
			

			idProductoActual=productocarac.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoCaracConstantesFunciones.quitarEspaciosProductoCarac(this.productocarac,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoCarac("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productocaracSessionBean.setsFuncionBusquedaRapida(this.productocaracSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoProductoCarac) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoCarac(esParaCancelar);				
				this.cancelarNuevoProductoCarac(esParaCancelar);								
			}
			
			this.productocarac=new ProductoCarac();
			
			this.inicializarProductoCarac();
			
			this.actualizarEstadoCeldasBotonesProductoCarac("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoCarac() throws Exception {
		try {
			ProductoCaracConstantesFunciones.inicializarProductoCarac(this.productocarac);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productocaracLogic.getProductoCaracs().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoCaracs(String sAccionBusqueda,List<ProductoCarac> productocaracsParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoCarac"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoCaracMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoCaracMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoCarac"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Caracteristicas");		
		parameters.put("busquedapor", ProductoCaracConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoCarac=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoCaracConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoCaracConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoCarac=new JRBeanArrayDataSource(ProductoCaracJInternalFrame.TraerProductoCaracBeans(productocaracsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoCarac);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoCaracConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoCaracConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoCaracBean.TraerProductoCaracBeans(productocaracsParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoCaracs(sAccionBusqueda,sTipoArchivoReporte,productocaracsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoCaracs(sAccionBusqueda,sTipoArchivoReporte,productocaracsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoCaracActionPerformed(null);
					//this.generarExcelReporteProductoCaracs(sAccionBusqueda,sTipoArchivoReporte,productocaracsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoCaracs(sAccionBusqueda,sTipoArchivoReporte,productocaracsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoCaracs(sAccionBusqueda,sTipoArchivoReporte,productocaracsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoCaracs(sAccionBusqueda,sTipoArchivoReporte,productocaracsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoCaracs(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoCarac> productocaracsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productocarac";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoCaracs");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoCarac("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoCarac productocarac : productocaracsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoCaracConstantesFunciones.generarExcelReporteDataProductoCarac("NORMAL",row,workbook,productocarac,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productocaracSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caracteristica",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoCarac(String sTipo,Row row,Workbook workbook) {
		
		ProductoCaracConstantesFunciones.generarExcelReporteHeaderProductoCarac(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoCaracs(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoCarac> productocaracsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productocarac_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoCaracs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoCarac productocarac : productocaracsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoCaracConstantesFunciones.getProductoCaracDescripcion(productocarac));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoCaracConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoCaracConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productocarac.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoCaracConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoCaracConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productocarac.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productocarac.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productocarac.getcaracteristica());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productocaracSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caracteristica",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoCaracs(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoCarac> productocaracsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoCarac> productocaracsRespaldo=null;
		
		classes=ProductoCaracConstantesFunciones.getClassesRelationshipsOfProductoCarac(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productocaracLogic.setDatosCliente(this.datosCliente);
		this.productocaracLogic.setDatosDeep(this.datosDeep);
		this.productocaracLogic.setIsConDeep(true);
		
		productocaracsRespaldo=this.productocaracLogic.getProductoCaracs();
		
		this.productocaracLogic.setProductoCaracs(productocaracsParaReportes);	
		this.productocaracLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productocaracsParaReportes=this.productocaracLogic.getProductoCaracs();
		this.productocaracLogic.setProductoCaracs(productocaracsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productocarac_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoCaracs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoCarac("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoCarac productocarac : productocaracsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoCarac("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoCaracConstantesFunciones.generarExcelReporteDataProductoCarac("NORMAL",row,workbook,productocarac,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoCaracConstantesFunciones.getProductoCaracDescripcion(productocarac));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productocaracSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caracteristica",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoCarac.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoCarac.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoCarac.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoCarac.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoCarac() throws Exception {		
		this.startProcessProductoCarac(true);
	}
	
	public void startProcessProductoCarac(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoCarac ,this.jPanelParametrosReportesProductoCarac, this.jScrollPanelDatosProductoCarac,this.jPanelPaginacionProductoCarac, this.jScrollPanelDatosEdicionProductoCarac, this.jPanelAccionesProductoCarac,this.jPanelAccionesFormularioProductoCarac,this.jmenuBarProductoCarac,this.jmenuBarDetalleProductoCarac,this.jTtoolBarProductoCarac,this.jTtoolBarDetalleProductoCarac);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoCarac=this.jTabbedPaneBusquedasProductoCarac; 
		
		final JPanel jPanelParametrosReportesProductoCarac=this.jPanelParametrosReportesProductoCarac;
		//final JScrollPane jScrollPanelDatosProductoCarac=this.jScrollPanelDatosProductoCarac;
		final JTable jTableDatosProductoCarac=this.jTableDatosProductoCarac;		
		final JPanel jPanelPaginacionProductoCarac=this.jPanelPaginacionProductoCarac;
		//final JScrollPane jScrollPanelDatosEdicionProductoCarac=this.jScrollPanelDatosEdicionProductoCarac;
		final JPanel jPanelAccionesProductoCarac=this.jPanelAccionesProductoCarac;
		
		JPanel jPanelCamposAuxiliarProductoCarac=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoCarac=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) {
			jPanelCamposAuxiliarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jPanelCamposProductoCarac;
			jPanelAccionesFormularioAuxiliarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jPanelAccionesFormularioProductoCarac;
		}
		
		final JPanel jPanelCamposProductoCarac=jPanelCamposAuxiliarProductoCarac;
		final JPanel jPanelAccionesFormularioProductoCarac=jPanelAccionesFormularioAuxiliarProductoCarac;
		
		
		final JMenuBar jmenuBarProductoCarac=this.jmenuBarProductoCarac;
		final JToolBar jTtoolBarProductoCarac=this.jTtoolBarProductoCarac;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoCarac=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoCarac=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) {
			jmenuBarDetalleAuxiliarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jmenuBarDetalleProductoCarac;
			jTtoolBarDetalleAuxiliarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jTtoolBarDetalleProductoCarac;
		}
		
		final JMenuBar jmenuBarDetalleProductoCarac=jmenuBarDetalleAuxiliarProductoCarac;
		final JToolBar jTtoolBarDetalleProductoCarac=jTtoolBarDetalleAuxiliarProductoCarac;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoCarac;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoCarac;
			processRunnable.jTableDatos=jTableDatosProductoCarac;
			processRunnable.jPanelCampos=jPanelCamposProductoCarac;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoCarac;
			processRunnable.jPanelAcciones=jPanelAccionesProductoCarac;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoCarac;
			
			
			processRunnable.jmenuBar=jmenuBarProductoCarac;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoCarac;
			processRunnable.jTtoolBar=jTtoolBarProductoCarac;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoCarac;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoCarac ,jPanelParametrosReportesProductoCarac,jTableDatosProductoCarac, /*jScrollPanelDatosProductoCarac,*/jPanelCamposProductoCarac,jPanelPaginacionProductoCarac, /*jScrollPanelDatosEdicionProductoCarac,*/ jPanelAccionesProductoCarac,jPanelAccionesFormularioProductoCarac,jmenuBarProductoCarac,jmenuBarDetalleProductoCarac,jTtoolBarProductoCarac,jTtoolBarDetalleProductoCarac);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoCarac ,jPanelParametrosReportesProductoCarac, jScrollPanelDatosProductoCarac,jPanelPaginacionProductoCarac, jScrollPanelDatosEdicionProductoCarac, jPanelAccionesProductoCarac,jPanelAccionesFormularioProductoCarac,jmenuBarProductoCarac,jmenuBarDetalleProductoCarac,jTtoolBarProductoCarac,jTtoolBarDetalleProductoCarac);
						
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
	
	public void finishProcessProductoCarac() {// throws Exception 
		this.finishProcessProductoCarac(true);
	}
	
	public void finishProcessProductoCarac(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoCarac ,this.jPanelParametrosReportesProductoCarac, this.jScrollPanelDatosProductoCarac,this.jPanelPaginacionProductoCarac, this.jScrollPanelDatosEdicionProductoCarac, this.jPanelAccionesProductoCarac,this.jPanelAccionesFormularioProductoCarac,this.jmenuBarProductoCarac,this.jmenuBarDetalleProductoCarac,this.jTtoolBarProductoCarac,this.jTtoolBarDetalleProductoCarac);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoCarac=this.jTabbedPaneBusquedasProductoCarac; 
		
		final JPanel jPanelParametrosReportesProductoCarac=this.jPanelParametrosReportesProductoCarac;
		//final JScrollPane jScrollPanelDatosProductoCarac=this.jScrollPanelDatosProductoCarac;
		final JTable jTableDatosProductoCarac=this.jTableDatosProductoCarac;		
		final JPanel jPanelPaginacionProductoCarac=this.jPanelPaginacionProductoCarac;
		//final JScrollPane jScrollPanelDatosEdicionProductoCarac=this.jScrollPanelDatosEdicionProductoCarac;
		final JPanel jPanelAccionesProductoCarac=this.jPanelAccionesProductoCarac;
		
		JPanel jPanelCamposAuxiliarProductoCarac=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoCarac=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) {
			jPanelCamposAuxiliarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jPanelCamposProductoCarac;
			jPanelAccionesFormularioAuxiliarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jPanelAccionesFormularioProductoCarac;
		}
		
		final JPanel jPanelCamposProductoCarac=jPanelCamposAuxiliarProductoCarac;
		final JPanel jPanelAccionesFormularioProductoCarac=jPanelAccionesFormularioAuxiliarProductoCarac;
		
		
		final JMenuBar jmenuBarProductoCarac=this.jmenuBarProductoCarac;		
		final JToolBar jTtoolBarProductoCarac=this.jTtoolBarProductoCarac;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoCarac=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoCarac=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) {
			jmenuBarDetalleAuxiliarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jmenuBarDetalleProductoCarac;
			jTtoolBarDetalleAuxiliarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jTtoolBarDetalleProductoCarac;		
		}
		
		final JMenuBar jmenuBarDetalleProductoCarac=jmenuBarDetalleAuxiliarProductoCarac;
		final JToolBar jTtoolBarDetalleProductoCarac=jTtoolBarDetalleAuxiliarProductoCarac;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoCarac;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoCarac;
			processRunnable.jTableDatos=jTableDatosProductoCarac;
			processRunnable.jPanelCampos=jPanelCamposProductoCarac;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoCarac;
			processRunnable.jPanelAcciones=jPanelAccionesProductoCarac;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoCarac;
			
			
			processRunnable.jmenuBar=jmenuBarProductoCarac;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoCarac;
			processRunnable.jTtoolBar=jTtoolBarProductoCarac;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoCarac;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoCarac ,jPanelParametrosReportesProductoCarac, jTableDatosProductoCarac,/*jScrollPanelDatosProductoCarac,*/jPanelCamposProductoCarac,jPanelPaginacionProductoCarac, /*jScrollPanelDatosEdicionProductoCarac,*/ jPanelAccionesProductoCarac,jPanelAccionesFormularioProductoCarac,jmenuBarProductoCarac,jmenuBarDetalleProductoCarac,jTtoolBarProductoCarac,jTtoolBarDetalleProductoCarac));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoCarac(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoCarac(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoCarac(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoCarac(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoCarac,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoCarac,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoCarac(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoCarac,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoCarac,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productocaracConstantesFunciones.getsFinalQueryProductoCarac();
		String  finalQueryPaginacionTodos=this.productocaracConstantesFunciones.getsFinalQueryProductoCarac();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoCaracConstantesFunciones.getArrayColumnasGlobalesNoProductoCarac(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoCaracConstantesFunciones.getArrayColumnasGlobalesProductoCarac(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoCaracConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productocaracsEliminados= new ArrayList<ProductoCarac>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoCarac();
		
				///*ProductoCaracSessionBean*/this.productocaracSessionBean=new ProductoCaracSessionBean();
			
			if(this.productocaracSessionBean==null) {
				this.productocaracSessionBean=new ProductoCaracSessionBean();
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
					this.iNumeroPaginacion=ProductoCaracConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoCaracConstantesFunciones.getClassesForeignKeysOfProductoCarac(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productocarac."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productocaracsAux= new ArrayList<ProductoCarac>();
			
				
			productocaracLogic.setDatosCliente(this.datosCliente);
			productocaracLogic.setDatosDeep(this.datosDeep);
			productocaracLogic.setIsConDeep(true);
			
			
			productocaracLogic.getProductoCaracDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productocaracLogic.getTodosProductoCaracs(finalQueryGlobal,pagination);
					
					//productocaracLogic.getTodosProductoCaracsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productocaracLogic.getProductoCaracs()==null|| productocaracLogic.getProductoCaracs().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productocaracsAux= new ArrayList<ProductoCarac>();
							productocaracsAux.addAll(productocaracLogic.getProductoCaracs());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productocaracsAux= new ArrayList<ProductoCarac>();
							productocaracsAux.addAll(productocaracs);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productocaracLogic.getTodosProductoCaracs(finalQueryGlobal+"",this.pagination);												
							
							//productocaracLogic.getTodosProductoCaracsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoCaracs("Todos",productocaracLogic.getProductoCaracs() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productocaracLogic.setProductoCaracs(new ArrayList<ProductoCarac>());					
							productocaracLogic.getProductoCaracs().addAll(productocaracsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productocaracs=new ArrayList<ProductoCarac>();
							productocaracs.addAll(productocaracsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoCarac=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoCarac=this.idActual;
				
				} else if(this.idProductoCaracActual!=null && this.idProductoCaracActual!=0L) {
					idProductoCarac=idProductoCaracActual;
				}
				
					
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndicePorId(idProductoCarac);
				
				this.productocaracs=new ArrayList<ProductoCarac>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productocaracLogic.getEntity(idProductoCarac);
					
					//productocaracLogic.getEntityWithConnection(idProductoCarac);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productocaracLogic.setProductoCaracs(new ArrayList<ProductoCarac>());
					productocaracLogic.getProductoCaracs().add(productocaracLogic.getProductoCarac());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productocaracs=new ArrayList<ProductoCarac>();
					this.productocaracs.add(productocarac);
				}
				
				if(productocaracLogic.getProductoCarac()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productocaracLogic.getProductoCaracsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productocaracLogic.getProductoCaracs()==null||productocaracLogic.getProductoCaracs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productocaracs==null|| productocaracs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productocaracsAux=new ArrayList<ProductoCarac>();
						productocaracsAux.addAll(productocaracLogic.getProductoCaracs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productocaracsAux=new ArrayList<ProductoCarac>();
							productocaracsAux.addAll(productocaracs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productocaracLogic.getProductoCaracsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoCaracs("FK_IdEmpresa",productocaracLogic.getProductoCaracs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoCaracs("FK_IdEmpresa",productocaracs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productocaracLogic.setProductoCaracs(new ArrayList<ProductoCarac>());
						productocaracLogic.getProductoCaracs().addAll(productocaracsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productocaracs=new ArrayList<ProductoCarac>();
							productocaracs.addAll(productocaracsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productocaracLogic.getProductoCaracsFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productocaracLogic.getProductoCaracs()==null||productocaracLogic.getProductoCaracs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productocaracs==null|| productocaracs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productocaracsAux=new ArrayList<ProductoCarac>();
						productocaracsAux.addAll(productocaracLogic.getProductoCaracs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productocaracsAux=new ArrayList<ProductoCarac>();
							productocaracsAux.addAll(productocaracs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productocaracLogic.getProductoCaracsFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoCaracs("FK_IdProducto",productocaracLogic.getProductoCaracs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoCaracs("FK_IdProducto",productocaracs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productocaracLogic.setProductoCaracs(new ArrayList<ProductoCarac>());
						productocaracLogic.getProductoCaracs().addAll(productocaracsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productocaracs=new ArrayList<ProductoCarac>();
							productocaracs.addAll(productocaracsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productocaracLogic.getProductoCaracsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productocaracLogic.getProductoCaracs()==null||productocaracLogic.getProductoCaracs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productocaracs==null|| productocaracs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productocaracsAux=new ArrayList<ProductoCarac>();
						productocaracsAux.addAll(productocaracLogic.getProductoCaracs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productocaracsAux=new ArrayList<ProductoCarac>();
							productocaracsAux.addAll(productocaracs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productocaracLogic.getProductoCaracsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoCaracConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoCaracs("FK_IdSucursal",productocaracLogic.getProductoCaracs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoCaracs("FK_IdSucursal",productocaracs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productocaracLogic.setProductoCaracs(new ArrayList<ProductoCarac>());
						productocaracLogic.getProductoCaracs().addAll(productocaracsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productocaracs=new ArrayList<ProductoCarac>();
							productocaracs.addAll(productocaracsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoCarac();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoCarac();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productocaracLogic.getProductoCaracs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productocaracs.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productocaracLogic.getProductoCaracs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productocaracs.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoCarac productocarac) {
		Boolean permite=true;
		
		if(this.productocarac.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoCaracConstantesFunciones.getOrderByListaProductoCarac();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoCaracConstantesFunciones.getOrderByListaProductoCarac();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoCarac productocarac:productocaracLogic.getProductoCaracs()) {
				if(productocarac.getsType().equals(Constantes2.S_TOTALES)) {
					productocaracTotales=productocarac;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoCarac productocarac:this.productocaracs) {
				if(productocarac.getsType().equals(Constantes2.S_TOTALES)) {
					productocaracTotales=productocarac;
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
			this.productocaracAux=new ProductoCarac();
			this.productocaracAux.setsType(Constantes2.S_TOTALES);
			this.productocaracAux.setIsNew(false);
			this.productocaracAux.setIsChanged(false);
			this.productocaracAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoCaracConstantesFunciones.TotalizarValoresFilaProductoCarac(this.productocaracLogic.getProductoCaracs(),this.productocaracAux);
				
				this.productocaracLogic.getProductoCaracs().add(this.productocaracAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoCaracConstantesFunciones.TotalizarValoresFilaProductoCarac(this.productocaracs,this.productocaracAux);
				
				this.productocaracs.add(this.productocaracAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productocaracTotales=new ProductoCarac();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productocaracLogic.getProductoCaracs().remove(productocaracTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productocaracs.remove(productocaracTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productocaracTotales=new ProductoCarac();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoCarac productocarac:productocaracLogic.getProductoCaracs()) {
				if(productocarac.getsType().equals(Constantes2.S_TOTALES)) {
					productocaracTotales=productocarac;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoCaracConstantesFunciones.TotalizarValoresFilaProductoCarac(this.productocaracLogic.getProductoCaracs(),productocaracTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoCarac productocarac:this.productocaracs) {
				if(productocarac.getsType().equals(Constantes2.S_TOTALES)) {
					productocaracTotales=productocarac;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoCaracConstantesFunciones.TotalizarValoresFilaProductoCarac(this.productocaracs,productocaracTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoCaracsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoCaracsFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoCaracsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoCaracsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productocaracLogic.getProductoCaracsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoCaracsFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productocaracLogic.getProductoCaracsFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoCaracsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productocaracLogic.getProductoCaracsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProductoCarac() {
		this.isPermisoTodoProductoCarac=false;
		this.isPermisoNuevoProductoCarac=false;
		this.isPermisoActualizarProductoCarac=false;
		this.isPermisoActualizarOriginalProductoCarac=false;
		this.isPermisoEliminarProductoCarac=false;
		this.isPermisoGuardarCambiosProductoCarac=false;
		this.isPermisoConsultaProductoCarac=false;
		this.isPermisoBusquedaProductoCarac=false;
		this.isPermisoReporteProductoCarac=false;		
		this.isPermisoOrdenProductoCarac=false;		
		this.isPermisoPaginacionMedioProductoCarac=false;		
		this.isPermisoPaginacionAltoProductoCarac=false;
		this.isPermisoPaginacionTodoProductoCarac=false;
		this.isPermisoCopiarProductoCarac=false;		
		this.isPermisoVerFormProductoCarac=false;		
		this.isPermisoDuplicarProductoCarac=false;		
		this.isPermisoOrdenProductoCarac=false;		
	}
	
	public void setPermisosUsuarioProductoCarac(Boolean isPermiso) {
		this.isPermisoTodoProductoCarac=isPermiso;
		this.isPermisoNuevoProductoCarac=isPermiso;
		this.isPermisoActualizarProductoCarac=isPermiso;
		this.isPermisoActualizarOriginalProductoCarac=isPermiso;
		this.isPermisoEliminarProductoCarac=isPermiso;
		this.isPermisoGuardarCambiosProductoCarac=isPermiso;
		this.isPermisoConsultaProductoCarac=isPermiso;
		this.isPermisoBusquedaProductoCarac=isPermiso;
		this.isPermisoReporteProductoCarac=isPermiso;
		this.isPermisoOrdenProductoCarac=isPermiso;		
		this.isPermisoPaginacionMedioProductoCarac=isPermiso;		
		this.isPermisoPaginacionAltoProductoCarac=isPermiso;		
		this.isPermisoPaginacionTodoProductoCarac=isPermiso;		
		this.isPermisoCopiarProductoCarac=isPermiso;		
		this.isPermisoVerFormProductoCarac=isPermiso;		
		this.isPermisoDuplicarProductoCarac=isPermiso;
		this.isPermisoOrdenProductoCarac=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoCarac(Boolean isPermiso) {
		//this.isPermisoTodoProductoCarac=isPermiso;
		this.isPermisoNuevoProductoCarac=isPermiso;
		this.isPermisoActualizarProductoCarac=isPermiso;
		this.isPermisoActualizarOriginalProductoCarac=isPermiso;
		this.isPermisoEliminarProductoCarac=isPermiso;
		this.isPermisoGuardarCambiosProductoCarac=isPermiso;
		//this.isPermisoConsultaProductoCarac=isPermiso;
		//this.isPermisoBusquedaProductoCarac=isPermiso;
		//this.isPermisoReporteProductoCarac=isPermiso;
		//this.isPermisoOrdenProductoCarac=isPermiso;		
		//this.isPermisoPaginacionMedioProductoCarac=isPermiso;		
		//this.isPermisoPaginacionAltoProductoCarac=isPermiso;		
		//this.isPermisoPaginacionTodoProductoCarac=isPermiso;		
		//this.isPermisoCopiarProductoCarac=isPermiso;		
		//this.isPermisoDuplicarProductoCarac=isPermiso;
		//this.isPermisoOrdenProductoCarac=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoCaracClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoCaracJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoCarac(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoCaracClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoCaracClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoCaracClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoCaracClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoCarac() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoCaracJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productocaracSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoCaracConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoCarac=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoCarac=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoCarac=this.isPermisoActualizarProductoCarac;
			this.isPermisoEliminarProductoCarac=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoCarac=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoCarac=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoCarac=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoCarac=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoCarac=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoCarac=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoCarac=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoCarac=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoCarac=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoCarac=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoCarac=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoCarac=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoCarac=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productocaracSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoCarac.setToolTipText(this.jTableDatosProductoCarac.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoCarac(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoCarac(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoCaracJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoCaracJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoCarac() throws Exception {
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
	public void inicializarCombosForeignKeyProductoCaracListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoCaracListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoCaracJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoCaracListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyProductoCaracListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoCaracParameterReturnGeneral productocaracReturnGeneral=new ProductoCaracParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.productocaracConstantesFunciones.cargarid_empresaProductoCarac)
					 || (this.esRecargarFks && this.productocaracConstantesFunciones.cargarid_empresaProductoCarac)) {

					if(!this.productocaracSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+productocaracSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.productocaracConstantesFunciones.cargarid_sucursalProductoCarac)
					 || (this.esRecargarFks && this.productocaracConstantesFunciones.cargarid_sucursalProductoCarac)) {

					if(!this.productocaracSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+productocaracSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.productocaracConstantesFunciones.cargarid_productoProductoCarac)
					 || (this.esRecargarFks && this.productocaracConstantesFunciones.cargarid_productoProductoCarac)) {

					if(!this.productocaracSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+productocaracSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productocaracReturnGeneral=productocaracLogic.cargarCombosLoteForeignKeyProductoCarac(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=productocaracReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=productocaracReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=productocaracReturnGeneral.getproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoCarac()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyProducto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.productocaracSessionBean==null) {
				this.productocaracSessionBean=new ProductoCaracSessionBean();
			}

			if(!this.productocaracSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.productocaracSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.productocaracSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyProductoCarac()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoCarac(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductoCarac()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoCarac();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoCarac(ProductoCarac productocarac)throws Exception {	
		try {
			
			this.setActualProductoForeignKey(productocarac.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoCarac(ProductoCarac productocarac,String sTipoEvento)throws Exception {	
		try {
			
			

				if(productocarac.getProducto()!=null && !sTipoEvento.equals("id_productoProductoCarac")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(productocarac.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoCarac()throws Exception {	
		try {
			
			this.setActualProductoForeignKey(this.productocaracConstantesFunciones.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoCarac()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoCarac()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoCarac()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoCarac()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoCarac()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoCarac(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoCarac()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_empresaProductoCarac!=null && this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_empresaProductoCarac.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_empresaProductoCarac.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_sucursalProductoCarac!=null && this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_sucursalProductoCarac.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_sucursalProductoCarac.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_productoProductoCarac!=null && this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_productoProductoCarac.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_productoProductoCarac.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ProductoCaracBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoCaracBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoCaracBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productocaracSessionBean=new ProductoCaracSessionBean(); 
		this.productocaracConstantesFunciones=new ProductoCaracConstantesFunciones(); 
		this.productocaracBean=new ProductoCarac();//(this.productocaracConstantesFunciones); 		
		this.productocaracReturnGeneral=new ProductoCaracParameterReturnGeneral(); 
		
		this.productocaracSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productocaracSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoCaracBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoCaracBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoCaracBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoCarac(true);
			
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
			
			this.productocaracConstantesFunciones=new ProductoCaracConstantesFunciones(); 
			this.productocaracBean=new ProductoCarac();//this.productocaracConstantesFunciones); 			
			this.productocaracReturnGeneral=new ProductoCaracParameterReturnGeneral(); 
		
			ProductoCaracBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caracteristica Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.productocarac=new ProductoCarac();
			this.productocaracs = new ArrayList<ProductoCarac>();
			this.productocaracsAux = new ArrayList<ProductoCarac>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic=new ProductoCaracLogic();
				this.productocaracLogic.getNewConnexionToDeep("");
			}
			
			//this.productocaracSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productocaracSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoCarac);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoCarac!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoCarac);	
					}
					
					if(this.jInternalFrameImportacionProductoCarac!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoCarac);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoCarac!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoCarac);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoCarac!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoCarac);
				this.jInternalFrameDetalleFormProductoCarac.setVisible(false);
				this.jInternalFrameDetalleFormProductoCarac.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoCarac!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoCarac);
					this.jInternalFrameReporteDinamicoProductoCarac.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoCarac.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoCarac!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoCarac);
					this.jInternalFrameImportacionProductoCarac.setVisible(false);
					this.jInternalFrameImportacionProductoCarac.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoCarac!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoCarac);
					this.jInternalFrameOrderByProductoCarac.setVisible(false);
					this.jInternalFrameOrderByProductoCarac.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoCaracActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoCaracConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productocaracReturnGeneral=new ProductoCaracParameterReturnGeneral();
			
			this.productocaracParameterGeneral=new ProductoCaracParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productocaracLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoCaracJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productocaracSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoCaracConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productocaracSessionBean.getEsGuardarRelacionado(),this.productocaracSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoCaracConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productocaracSessionBean.getEsGuardarRelacionado(),this.productocaracSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoCarac=false;
			this.isVisibilidadCeldaDuplicarProductoCarac=true;
			this.isVisibilidadCeldaCopiarProductoCarac=true;
			this.isVisibilidadCeldaVerFormProductoCarac=true;
			this.isVisibilidadCeldaOrdenProductoCarac=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoCarac=false;
			this.isVisibilidadCeldaModificarProductoCarac=false;
			this.isVisibilidadCeldaActualizarProductoCarac=false;
			this.isVisibilidadCeldaEliminarProductoCarac=false;
			this.isVisibilidadCeldaCancelarProductoCarac=false;
			this.isVisibilidadCeldaGuardarProductoCarac=false;
			this.isVisibilidadCeldaGuardarCambiosProductoCarac=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoCarac("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoCarac();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoCarac(false);
			
			this.setPermisosUsuarioProductoCarac();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productocaracSessionBean.getEsGuardarRelacionado() 
				|| (this.productocaracSessionBean.getEsGuardarRelacionado() && this.productocaracSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoCaracClasesRelacionadas();
			}
			
			if(this.productocaracSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoCaracClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoCarac();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoCarac();
			}
			
			if(!this.isPermisoBusquedaProductoCarac) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoCarac.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoCarac,this.isPermisoPaginacionMedioProductoCarac,this.isPermisoPaginacionTodoProductoCarac);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoCaracConstantesFunciones.getTiposSeleccionarProductoCarac());
				
				this.tiposColumnasSelect=ProductoCaracConstantesFunciones.getTiposSeleccionarProductoCarac(true);
				
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
			//if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoCarac();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioProductoCarac(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioProductoCarac(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoCarac() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				productocaracImplementable= (ProductoCaracImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoCaracConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productocaracImplementableHome= (ProductoCaracImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoCaracConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productocaracs= new ArrayList<ProductoCarac>();
			this.productocaracsEliminados= new ArrayList<ProductoCarac>();
						
			this.isEsNuevoProductoCarac=false;
			this.esParaAccionDesdeFormularioProductoCarac=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoCarac(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoCarac();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoCaracBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoCaracConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoCarac("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoCarac(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoCarac!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoCarac();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoCarac();
			}
			
			ProductoCaracBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoCarac.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoCarac.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoCarac.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoCarac(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoCarac: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoCarac() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoCarac")) {
				iIndex=this.jInternalFrameDetalleFormProductoCarac.jTabbedPaneRelacionesProductoCarac.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoCarac.jTabbedPaneRelacionesProductoCarac.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoCarac();	
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
	
	public void cargarCombosForeignKeyProductoCarac(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoCarac(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoCarac(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoCaracListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoCarac();
		
		this.cargarCombosFrameForeignKeyProductoCarac();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoCarac();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoCarac();
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
	
	public void jButtonNuevoProductoCaracActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productocaracSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoCarac==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			
			
			if(jTableDatosProductoCarac.getRowCount()>=1) {
				jTableDatosProductoCarac.removeRowSelectionInterval(0, jTableDatosProductoCarac.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoCarac=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoCarac(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoCarac(true);			
			//this.productocarac=new ProductoCarac();
			//this.productocarac.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoCarac(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoCarac() ;
			
			if(ProductoCaracJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoCarac(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productocarac);	
			this.actualizarInformacion("INFO_PADRE",false,this.productocarac);				
			
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			
			if(this.productocaracSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoCarac: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoCaracActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoCarac> productocaracsSeleccionados=new ArrayList<ProductoCarac>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoCarac.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoCarac.getSelectedRows().length;			
			}
			
			productocaracsSeleccionados=this.getProductoCaracsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoCarac--;			
				//ProductoCarac productocaracAux= new ProductoCarac();			
				//productocaracAux.setId(this.iIdNuevoProductoCarac);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoCarac productocaracOrigen=new ProductoCarac();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoCarac productocaracOrigen : productocaracsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productocaracOrigen =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productocaracOrigen =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoCarac();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productocarac.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoCarac(productocaracOrigen,this.productocarac,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productocaracLogic.getProductoCaracs().add(this.productocaracAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productocaracs.add(this.productocaracAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoCarac(false);
				
				this.jTableDatosProductoCarac.setRowSelectionInterval(this.getIndiceNuevoProductoCarac(), this.getIndiceNuevoProductoCarac());
				
				int iLastRow =  this.jTableDatosProductoCarac.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoCarac.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoCarac.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoCarac(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoCaracActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoCarac> productocaracsSeleccionados=new ArrayList<ProductoCarac>();									
		
			ProductoCarac productocaracOrigen=new ProductoCarac();
			ProductoCarac productocaracDestino=new ProductoCarac();
				
			productocaracsSeleccionados=this.getProductoCaracsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoCarac.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productocaracsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoCarac.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productocaracOrigen =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productocaracOrigen =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productocaracDestino =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productocaracDestino =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productocaracOrigen =productocaracsSeleccionados.get(0);
				productocaracDestino =productocaracsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoCarac(productocaracOrigen,productocaracDestino,true,false);
				
				productocaracDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productocaracDestino,productocaracLogic.getProductoCaracs());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productocaracDestino,productocaracs);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoCarac(false);
				
				//this.jTableDatosProductoCarac.setRowSelectionInterval(this.getIndiceNuevoProductoCarac(), this.getIndiceNuevoProductoCarac());
				
				int iLastRow =  this.jTableDatosProductoCarac.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoCarac.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoCarac.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoCarac(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoCaracActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoCarac==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoCarac.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoCaracActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoCarac.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoCarac.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoCarac.setVisible(!isVisible);
			this.jPanelPaginacionProductoCarac.setVisible(!isVisible);
			this.jPanelAccionesProductoCarac.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoCaracActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoCarac();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoCaracActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoCarac();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoCaracActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoCarac();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoCaracActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoCarac();
			
			this.abrirFrameOrderByProductoCarac();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoCaracActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoCarac();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoCarac(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoCarac);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoCarac.isMaximum()) {
					this.jInternalFrameDetalleFormProductoCarac.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoCarac.setSize(this.jInternalFrameDetalleFormProductoCarac.iWidthFormulario,this.jInternalFrameDetalleFormProductoCarac.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoCarac.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoCarac.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoCarac.isMaximum()) {
						this.jInternalFrameDetalleFormProductoCarac.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoCarac.jContentPaneDetalleProductoCarac.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoCarac.jTabbedPaneRelacionesProductoCarac.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoCarac.jContentPaneDetalleProductoCarac.getWidth(),ProductoCaracConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoCarac.jTabbedPaneRelacionesProductoCarac.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoCarac.jContentPaneDetalleProductoCarac.getWidth(),ProductoCaracConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoCarac.jTabbedPaneRelacionesProductoCarac.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoCarac.jContentPaneDetalleProductoCarac.getWidth(),ProductoCaracConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoCarac.setVisible(true);
	        this.jInternalFrameDetalleFormProductoCarac.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoCarac() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoCarac==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoCarac=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoCarac,false,this);
				} else {
					this.jInternalFrameOrderByProductoCarac=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoCarac,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoCarac);
				this.jInternalFrameOrderByProductoCarac.setVisible(false);
				this.jInternalFrameOrderByProductoCarac.setSelected(false);
				
				this.jInternalFrameOrderByProductoCarac.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoCarac"));
				
				this.inicializarActualizarBindingTablaOrderByProductoCarac();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoCarac() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoCarac==null) {
				
				this.jInternalFrameImportacionProductoCarac=new ImportacionJInternalFrame(ProductoCaracConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoCarac);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoCarac);
				this.jInternalFrameImportacionProductoCarac.setVisible(false);
				this.jInternalFrameImportacionProductoCarac.setSelected(false);


				this.jInternalFrameImportacionProductoCarac.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoCarac"));
				this.jInternalFrameImportacionProductoCarac.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoCarac"));
				this.jInternalFrameImportacionProductoCarac.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoCarac"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoCarac() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoCarac==null) {
				this.jInternalFrameReporteDinamicoProductoCarac=new ReporteDinamicoJInternalFrame(ProductoCaracConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoCarac);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoCarac);
				this.jInternalFrameReporteDinamicoProductoCarac.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoCarac.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoCarac.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoCarac"));
				this.jInternalFrameReporteDinamicoProductoCarac.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoCarac"));
				this.jInternalFrameReporteDinamicoProductoCarac.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoCarac"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoCarac();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoCarac() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoCarac);
			
	       	this.jInternalFrameDetalleFormProductoCarac.setVisible(false);
	        this.jInternalFrameDetalleFormProductoCarac.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoCarac.dispose();
			//this.jInternalFrameDetalleFormProductoCarac=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoCarac() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoCarac.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoCarac.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoCarac() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoCarac.setVisible(true);
	        this.jInternalFrameImportacionProductoCarac.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoCarac() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoCarac.setVisible(true);
	        this.jInternalFrameOrderByProductoCarac.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoCarac() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoCarac.setVisible(false);
	        this.jInternalFrameOrderByProductoCarac.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoCarac() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoCarac.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoCarac.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoCarac() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoCarac.setVisible(false);
	        this.jInternalFrameImportacionProductoCarac.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductoCaracActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoCarac(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoCarac(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoCarac(true);
			//this.isEsNuevoProductoCarac=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoCarac("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoCarac(false) ;
			
			if(productocaracSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoCaracJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoCarac(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoCarac(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoCaracActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoCarac(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoCarac==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoCarac(true);
			//this.isEsNuevoProductoCarac=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productocarac.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoCarac("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoCarac(false) ;
			
			if(ProductoCaracJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoCarac(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoCarac(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.productocaracConstantesFunciones.cargarid_productoProductoCarac) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoCarac(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosProductoCarac.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoCarac,ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoCarac.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarProductoCaracActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoCarac(false);
			
			//if(!this.isEsNuevoProductoCarac) {								
				int intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoCaracJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoCarac(this.productocarac,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);
				
			}
			
			if(this.permiteMantenimiento(this.productocarac)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productocaracSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoCarac=true;
					this.inicializarActualizarBindingTablaProductoCarac(false);
					this.isEsNuevoProductoCarac=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoCarac=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoCarac=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoCarac(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoCarac(false);
				
				this.habilitarDeshabilitarControlesProductoCarac(false);
			
												
				
				if(ProductoCaracJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoCarac();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoCaracActionPerformed(evt,productocaracSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoCarac(this.productocarac,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoCarac.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productocaracSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productocarac.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoCarac.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoCarac.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoCaracActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				this.productocarac.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				this.productocarac.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productocarac)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productocaracSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoCaracModel) this.jTableDatosProductoCarac.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoCarac=true;
				this.inicializarActualizarBindingTablaProductoCarac(false);
				this.isEsNuevoProductoCarac=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoCarac(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoCarac(false);
				
				this.habilitarDeshabilitarControlesProductoCarac(false);
				
				
				
				if(ProductoCaracJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoCarac();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoCaracActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoCarac.getRowCount()>=1) {
				jTableDatosProductoCarac.removeRowSelectionInterval(0, jTableDatosProductoCarac.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoCarac(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoCarac(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoCarac(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoCarac(false) ;
			
			this.isEsNuevoProductoCarac=false;
			
			if(ProductoCaracJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoCarac();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoCaracActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoCarac(false);
				
				//SI ES MANUAL
				if(ProductoCaracJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoCarac();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoCaracActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoCarac--;			
			//ProductoCarac productocaracAux= new ProductoCarac();			
			//productocaracAux.setId(this.iIdNuevoProductoCarac);
			
			if(this.jInternalFrameDetalleFormProductoCarac==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoCarac();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);
			
			this.productocarac.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productocaracLogic.getProductoCaracs().add(this.productocaracAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productocaracs.add(this.productocaracAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoCarac(false);
			
			this.jTableDatosProductoCarac.setRowSelectionInterval(this.getIndiceNuevoProductoCarac(), this.getIndiceNuevoProductoCarac());
			
			int iLastRow =  this.jTableDatosProductoCarac.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoCarac.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoCarac.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoCarac(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoCaracActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoCarac(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoCarac(false);
			
			//SI ES MANUAL
			if(ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoCarac();
			}
			
			//this.abrirFrameTreeProductoCarac();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoCaracActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE CaracteristicaS ?", "MANTENIMIENTO DE Caracteristica", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoCarac.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoCarac();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productocaracReturnGeneral=productocaracLogic.procesarImportacionProductoCaracsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productocaracParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoCaracReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoCaracActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoCarac.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoCarac.setFileImportacion(this.jInternalFrameImportacionProductoCarac.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoCarac.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoCarac.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoCarac.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoCarac.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoCaracActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoCarac> productocaracsSeleccionados=new ArrayList<ProductoCarac>();		

		productocaracsSeleccionados=this.getProductoCaracsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoCarac.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoCarac.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoCaracBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoCaracBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoCaracs("Todos",productocaracsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productocaracSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caracteristica",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoCarac.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoCarac.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoCaracConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoCaracConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_racteristica_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_racteristica_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_racteristica_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_racteristica_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProductoCarac.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoCarac.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoCarac.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoCaracConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ProductoCaracConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA:
					sNombreCampoCategoria="caracteristica";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoCarac.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoCaracConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ProductoCaracConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA:
					sNombreCampoCategoriaValor="caracteristica";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoCarac.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoCarac.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoCaracConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ProductoCaracConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caracteristica",sNombreCampoCategoria,sNombreCampoCategoriaValor,"caracteristica");
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoCaracActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoCarac> productocaracsSeleccionados=new ArrayList<ProductoCarac>();		
		
		productocaracsSeleccionados=this.getProductoCaracsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productocarac";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoCaracs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoCarac.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoCarac.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoCaracConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoCaracConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProductoCarac productocarac:productocaracsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productocarac.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoCaracConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoCaracConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProductoCarac productocarac:productocaracsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productocarac.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProductoCarac productocarac:productocaracsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productocarac.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA);
					iRow++;

					for(ProductoCarac productocarac:productocaracsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productocarac.getcaracteristica());
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
			//	this.getFilaCabeceraExportarExcelProductoCarac(row);				
			//	iRow++;
			//}				
			
			//for(ProductoCarac productocaracAux:productocaracsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoCarac(productocaracAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productocaracSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caracteristica",JOptionPane.INFORMATION_MESSAGE);
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
				this.productocaracLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoCarac(false);
			
			//SI ES MANUAL
			if(ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoCarac();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoCaracActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoCarac(false);
			
			//SI ES MANUAL
			if(ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoCarac();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoCaracActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoCarac(false);
			
			//SI ES MANUAL
			if(ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoCarac();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoCarac() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoCarac.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoCarac.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoCarac.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoCarac.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoCarac.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoCarac.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoCarac.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoCarac(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoCarac(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoCarac(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoCarac(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoCarac(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoCarac(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoCarac(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoCarac(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoCaracJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoCarac() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoCarac();
		
		this.inicializarActualizarBindingBotonesManualProductoCarac(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoCarac();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoCarac() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoCarac(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoCarac(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoCarac.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoCarac.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoCarac.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoCarac!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoCarac.jCheckBoxPostAccionNuevoProductoCarac.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoCarac.jCheckBoxPostAccionSinCerrarProductoCarac.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoCarac.jCheckBoxPostAccionSinMensajeProductoCarac.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoCarac.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoCarac.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoCarac.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoCarac!=null) {
				this.jInternalFrameDetalleFormProductoCarac.jCheckBoxPostAccionNuevoProductoCarac.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoCarac.jCheckBoxPostAccionSinCerrarProductoCarac.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoCarac.jCheckBoxPostAccionSinMensajeProductoCarac.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoCarac.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoCarac.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoCarac!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoCarac.jComboBoxTiposAccionesFormularioProductoCarac.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoCarac.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoCarac!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoCarac.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoCarac.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoCarac.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoCarac.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoCarac.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoCarac!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoCarac.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoCarac.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoCarac.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoCarac(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoCarac(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoCarac() throws Exception {
		try	{
			if(ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoCarac();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoCarac() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoCarac.jComboBoxTiposAccionesFormularioProductoCarac.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoCarac.jComboBoxTiposAccionesFormularioProductoCarac.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoCarac() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoCarac.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoCarac.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoCarac.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoCarac.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoCarac.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoCarac.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoCarac.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoCarac.addItem(reporte);
			}
			
			
			if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoCarac.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoCarac.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoCarac.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoCarac.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoCarac.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoCarac.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoCarac.jComboBoxTiposAccionesFormularioProductoCarac.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoCarac.jComboBoxTiposAccionesFormularioProductoCarac.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoCarac.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoCarac.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoCarac.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoCarac();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoCarac() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoCarac!=null) {
				this.jInternalFrameReporteDinamicoProductoCarac.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoCarac.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoCarac!=null) {
				this.jInternalFrameReporteDinamicoProductoCarac.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoCarac.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoCarac!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoCarac.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoCarac.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoCarac.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoCarac.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoCarac.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoCarac.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoCarac()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_productoFK_IdProductoProductoCarac.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoProductoCarac.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoCarac(Boolean esInicializar) throws Exception {				
		if(ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoCarac();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoCarac() throws Exception {
		this.inicializarActualizarBindingTablaProductoCarac(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoCarac() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoCarac.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoCarac.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoCarac.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoCaracPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoCarac.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoCarac.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoCaracPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoCaracOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoCaracOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoCaracPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoCarac.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoCarac.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoCaracPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoCarac.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoCarac(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productocaracLogic.getProductoCaracs().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productocaracs.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoCaracJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoCarac.setModel(new ProductoCaracModel(this.productocaracLogic.getProductoCaracs(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoCarac.setModel(new ProductoCaracModel(this.productocaracs,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoCarac!=null && this.jInternalFrameOrderByProductoCarac.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoCarac();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoCarac.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoCarac,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoCaracPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO,productocaracConstantesFunciones.resaltarSeleccionarProductoCarac,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoCaracConstantesFunciones.SCLASSWEBTITULO,productocaracConstantesFunciones.resaltarSeleccionarProductoCarac,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoCarac.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoCarac,ProductoCaracConstantesFunciones.LABEL_ID));

		if(this.productocaracConstantesFunciones.mostraridProductoCarac && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoCaracConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productocaracConstantesFunciones.resaltaridProductoCarac,this.productocaracConstantesFunciones.activaridProductoCarac,this,true,"idProductoCarac","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productocaracConstantesFunciones.resaltaridProductoCarac,this.productocaracConstantesFunciones.activaridProductoCarac,this,true,"idProductoCarac","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoCarac.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoCarac,ProductoCaracConstantesFunciones.LABEL_IDEMPRESA));

		if(this.productocaracConstantesFunciones.mostrarid_empresaProductoCarac && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoCaracConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.productocaracConstantesFunciones.resaltarid_empresaProductoCarac,this,this.productocaracConstantesFunciones.activarid_empresaProductoCarac));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.productocaracConstantesFunciones.resaltarid_empresaProductoCarac,this,this.productocaracConstantesFunciones.activarid_empresaProductoCarac,false,"id_empresaProductoCarac","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoCaracPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoCarac.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoCarac,ProductoCaracConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.productocaracConstantesFunciones.mostrarid_sucursalProductoCarac && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoCaracConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.productocaracConstantesFunciones.resaltarid_sucursalProductoCarac,this,this.productocaracConstantesFunciones.activarid_sucursalProductoCarac));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.productocaracConstantesFunciones.resaltarid_sucursalProductoCarac,this,this.productocaracConstantesFunciones.activarid_sucursalProductoCarac,false,"id_sucursalProductoCarac","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoCaracPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoCarac.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoCarac,ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.productocaracConstantesFunciones.mostrarid_productoProductoCarac && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.productocaracConstantesFunciones.resaltarid_productoProductoCarac,this,this.productocaracConstantesFunciones.activarid_productoProductoCarac));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.productocaracConstantesFunciones.resaltarid_productoProductoCarac,this,this.productocaracConstantesFunciones.activarid_productoProductoCarac,true,"id_productoProductoCarac","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ProductoCaracPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoCarac.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoCarac,ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA));

		if(this.productocaracConstantesFunciones.mostrarcaracteristicaProductoCarac && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productocaracConstantesFunciones.resaltarcaracteristicaProductoCarac,this.productocaracConstantesFunciones.activarcaracteristicaProductoCarac,this,true,"caracteristicaProductoCarac","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productocaracConstantesFunciones.resaltarcaracteristicaProductoCarac,this.productocaracConstantesFunciones.activarcaracteristicaProductoCarac,this,true,"caracteristicaProductoCarac","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoCaracPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productocaracSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productocaracSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productocaracSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoCarac.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productocaracSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productocaracSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoCarac.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoCarac && this.isPermisoGuardarCambiosProductoCarac) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productocaracSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productocaracSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoCarac.addColumn(tableColumn);
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
			
			this.jTableDatosProductoCarac.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoCarac && this.isPermisoGuardarCambiosProductoCarac) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoCarac && this.isPermisoGuardarCambiosProductoCarac) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoCarac.moveColumn(this.jTableDatosProductoCarac.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoCarac.moveColumn(this.jTableDatosProductoCarac.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoCarac.moveColumn(this.jTableDatosProductoCarac.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoCarac.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoCarac.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoCarac,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoCaracJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoCarac.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoCarac.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoCaracJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoCaracJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoCarac.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoCarac.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoCarac.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productocaracLogic.getProductoCaracs().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productocaracs.size()-1;
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
		//this.jTableDatosProductoCarac.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoCarac.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoCarac();
			
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
				
				//this.isEsNuevoProductoCarac=false;
					
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			
				if(this.productocaracSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoCarac==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoCarac.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoCarac.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productocarac.getsType().equals("DUPLICADO")
				   || this.productocarac.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoCarac=true;
				
				} else {
					this.isEsNuevoProductoCarac=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productocaracSessionBean.getEsGuardarRelacionado()) {
					if(this.productocarac.getId()>=0 && !this.productocarac.getIsNew()) {						
						this.isEsNuevoProductoCarac=false;
						
					} else {
						this.isEsNuevoProductoCarac=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoCarac(esRelaciones);						
				
				this.seleccionarProductoCarac(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productocarac.getId()<0) {
					this.isEsNuevoProductoCarac=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoCarac(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoCarac(evt,rowIndex);
				}	
				
				if(this.productocaracSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoCarac: " + this.dDif); 
					}
				}								
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoCarac(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productocarac)) {
					if(this.productocarac.getId()>0) {
						this.productocarac.setIsDeleted(true);
						
						this.productocaracsEliminados.add(this.productocarac);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productocaracLogic.getProductoCaracs().remove(this.productocarac);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productocaracs.remove(this.productocarac);				
					}
					
					
					((ProductoCaracModel) this.jTableDatosProductoCarac.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoCarac(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoCarac(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoCarac) {
			
			if(this.jInternalFrameDetalleFormProductoCarac==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoCarac.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoCarac.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoCaracJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoCarac(this.productocarac);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.productocaracConstantesFunciones.cargarid_empresaProductoCarac || this.productocaracConstantesFunciones.event_dependid_empresaProductoCarac) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.productocarac.getid_empresa());
									//this.inicializarActualizarBindingProductoCarac(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(productocarac.getEmpresa()!=null) {
							this.empresasForeignKey.add(productocarac.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.productocarac.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.productocaracConstantesFunciones.cargarid_sucursalProductoCarac || this.productocaracConstantesFunciones.event_dependid_sucursalProductoCarac) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.productocarac.getid_sucursal());
									//this.inicializarActualizarBindingProductoCarac(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(productocarac.getSucursal()!=null) {
							this.sucursalsForeignKey.add(productocarac.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.productocarac.getid_sucursal(),false,"Formulario");

					//Producto
					if(!this.productocaracConstantesFunciones.cargarid_productoProductoCarac || this.productocaracConstantesFunciones.event_dependid_productoProductoCarac) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.productocarac.getid_producto());
									//this.inicializarActualizarBindingProductoCarac(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(productocarac.getProducto()!=null) {
							this.productosForeignKey.add(productocarac.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.productocarac.getid_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoCarac("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoCarac(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoCarac() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoCarac(ProductoCarac productocarac) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoCarac(productocarac,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoCarac(ProductoCarac productocarac,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoCarac(productocarac);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoCarac(productocarac,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoCarac(productocarac);
	}
	
	public void setVariablesObjetoActualToFormularioProductoCarac(ProductoCarac productocarac) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoCarac==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoCarac.jLabelidProductoCarac.setText(productocarac.getId().toString());
			this.jInternalFrameDetalleFormProductoCarac.jTextAreacaracteristicaProductoCarac.setText(productocarac.getcaracteristica());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoCarac productocaracLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productocaracLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoCarac productocaracLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productocaracLocal=this.productocarac;
			} else {
				productocaracLocal=this.productocaracAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productocaracLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoCarac(productocaracLocal,true);
					
					if(productocaracSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productocaracLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productocaracSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productocaracLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoCarac(ProductoCarac productocarac,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoCarac(productocarac,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(productocarac);
	}
	
	public void setVariablesFormularioToObjetoActualProductoCarac(ProductoCarac productocarac,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoCarac(productocarac,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoCarac(ProductoCarac productocarac,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoCarac==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoCarac.jLabelidProductoCarac.getText()==null || this.jInternalFrameDetalleFormProductoCarac.jLabelidProductoCarac.getText()=="" || this.jInternalFrameDetalleFormProductoCarac.jLabelidProductoCarac.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoCarac.jLabelidProductoCarac.setText("0");
			}

			if(conColumnasBase) {productocarac.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoCarac.jLabelidProductoCarac.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoCaracConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoCarac.jLabelIdProductoCarac,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productocarac.setcaracteristica(this.jInternalFrameDetalleFormProductoCarac.jTextAreacaracteristicaProductoCarac.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoCarac.jLabelcaracteristicaProductoCarac,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoCarac(ProductoCarac productocaracBean,ProductoCarac productocarac,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productocaracBean.getid_producto()!=null && !productocaracBean.getid_producto().equals(-1L))) {productocarac.setid_producto(productocaracBean.getid_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoCarac(ProductoCarac productocaracOrigen,ProductoCarac productocarac,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productocaracOrigen.getId()!=null && !productocaracOrigen.getId().equals(0L))) {productocarac.setId(productocaracOrigen.getId());}}
			if(conDefault || (!conDefault && productocaracOrigen.getid_producto()!=null && !productocaracOrigen.getid_producto().equals(-1L))) {productocarac.setid_producto(productocaracOrigen.getid_producto());}
			if(conDefault || (!conDefault && productocaracOrigen.getcaracteristica()!=null && !productocaracOrigen.getcaracteristica().equals(""))) {productocarac.setcaracteristica(productocaracOrigen.getcaracteristica());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoCarac(ProductoCarac productocarac) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoCarac.jLabelidProductoCarac.setText(productocarac.getId().toString());
			this.jInternalFrameDetalleFormProductoCarac.jTextAreacaracteristicaProductoCarac.setText(productocarac.getcaracteristica());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoCarac(ProductoCaracBean productocaracBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoCarac.jLabelidProductoCarac.setText(productocaracBean.getId().toString());
			this.jInternalFrameDetalleFormProductoCarac.jTextAreacaracteristicaProductoCarac.setText(productocaracBean.getcaracteristica());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoCarac(ProductoCaracParameterReturnGeneral productocaracReturnGeneral,ProductoCaracBean productocaracBean,Boolean conDefault) throws Exception { 
		try {
			ProductoCarac productocaracLocal=new ProductoCarac();
			
			productocaracLocal=productocaracReturnGeneral.getProductoCarac();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productocaracLocal.getId()!=null && !productocaracLocal.getId().equals(0L))) {productocaracBean.setId(productocaracLocal.getId());}}
			if(conDefault || (!conDefault && productocaracLocal.getid_producto()!=null && !productocaracLocal.getid_producto().equals(-1L))) {productocaracBean.setid_producto(productocaracLocal.getid_producto());}
			if(conDefault || (!conDefault && productocaracLocal.getcaracteristica()!=null && !productocaracLocal.getcaracteristica().equals(""))) {productocaracBean.setcaracteristica(productocaracLocal.getcaracteristica());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoCaracGenerico(Long idProductoCaracSeleccionado,JComboBox jComboBoxProductoCarac,List<ProductoCarac> productocaracsLocal)throws Exception {
		try {
			ProductoCarac  productocaracTemp=null;

			for(ProductoCarac productocaracAux:productocaracsLocal) {
				if(productocaracAux.getId()!=null && productocaracAux.getId().equals(idProductoCaracSeleccionado)) {
					productocaracTemp=productocaracAux;
					break;
				}
			}

			jComboBoxProductoCarac.setSelectedItem(productocaracTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoCaracGenerico(JComboBox jComboBoxProductoCarac,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoCarac.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoCarac.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoCarac.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoCarac.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoCarac.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoCarac.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoCarac.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoCarac.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoCarac.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoCarac.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productocarac=(ProductoCarac) productocaracLogic.getProductoCaracs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productocarac =(ProductoCarac) productocaracs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productocarac.getIsNew() && !productocarac.getIsChanged() && !productocarac.getIsDeleted()) {
				sDescripcion=productocarac.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productocarac.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!productocarac.getIsNew() && !productocarac.getIsChanged() && !productocarac.getIsDeleted()) {
				sDescripcion=productocarac.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=productocarac.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!productocarac.getIsNew() && !productocarac.getIsChanged() && !productocarac.getIsDeleted()) {
				sDescripcion=productocarac.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=productocarac.getproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoCarac productocaracRow=new ProductoCarac();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productocaracRow=(ProductoCarac) productocaracLogic.getProductoCaracs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productocaracRow=(ProductoCarac) productocaracs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoCarac(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoCarac.setVisible((this.isVisibilidadCeldaNuevoProductoCarac && this.isPermisoNuevoProductoCarac));			
			this.jButtonDuplicarProductoCarac.setVisible((this.isVisibilidadCeldaDuplicarProductoCarac && this.isPermisoDuplicarProductoCarac));			
			this.jButtonCopiarProductoCarac.setVisible((this.isVisibilidadCeldaCopiarProductoCarac && this.isPermisoCopiarProductoCarac));
			this.jButtonVerFormProductoCarac.setVisible((this.isVisibilidadCeldaVerFormProductoCarac && this.isPermisoVerFormProductoCarac));
			
			this.jButtonAbrirOrderByProductoCarac.setVisible((this.isVisibilidadCeldaOrdenProductoCarac && this.isPermisoOrdenProductoCarac));			
			
			this.jButtonNuevoRelacionesProductoCarac.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoCarac && this.isPermisoNuevoProductoCarac));			
			this.jButtonNuevoGuardarCambiosProductoCarac.setVisible((this.isVisibilidadCeldaNuevoProductoCarac && this.isPermisoNuevoProductoCarac && this.isPermisoGuardarCambiosProductoCarac));
			
			if(this.jInternalFrameDetalleFormProductoCarac!=null) {
			this.jInternalFrameDetalleFormProductoCarac.jButtonModificarProductoCarac.setVisible((this.isVisibilidadCeldaModificarProductoCarac && this.isPermisoActualizarProductoCarac));	
			this.jInternalFrameDetalleFormProductoCarac.jButtonActualizarProductoCarac.setVisible((this.isVisibilidadCeldaActualizarProductoCarac && this.isPermisoActualizarProductoCarac));	
			this.jInternalFrameDetalleFormProductoCarac.jButtonEliminarProductoCarac.setVisible((this.isVisibilidadCeldaEliminarProductoCarac && this.isPermisoEliminarProductoCarac));
			this.jInternalFrameDetalleFormProductoCarac.jButtonCancelarProductoCarac.setVisible(this.isVisibilidadCeldaCancelarProductoCarac);							
			this.jInternalFrameDetalleFormProductoCarac.jButtonGuardarCambiosProductoCarac.setVisible((this.isVisibilidadCeldaGuardarProductoCarac && this.isPermisoGuardarCambiosProductoCarac));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoCarac.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoCarac && this.isPermisoGuardarCambiosProductoCarac));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoCarac.setVisible((this.isVisibilidadCeldaNuevoProductoCarac && this.isPermisoNuevoProductoCarac));						
			this.jButtonDuplicarToolBarProductoCarac.setVisible((this.isVisibilidadCeldaDuplicarProductoCarac && this.isPermisoDuplicarProductoCarac));						
			this.jButtonCopiarToolBarProductoCarac.setVisible((this.isVisibilidadCeldaCopiarProductoCarac && this.isPermisoCopiarProductoCarac));			
			this.jButtonVerFormToolBarProductoCarac.setVisible((this.isVisibilidadCeldaVerFormProductoCarac && this.isPermisoVerFormProductoCarac));			
			this.jButtonAbrirOrderByToolBarProductoCarac.setVisible((this.isVisibilidadCeldaOrdenProductoCarac && this.isPermisoOrdenProductoCarac));
			this.jButtonNuevoRelacionesToolBarProductoCarac.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoCarac && this.isPermisoNuevoProductoCarac));			
			this.jButtonNuevoGuardarCambiosToolBarProductoCarac.setVisible((this.isVisibilidadCeldaNuevoProductoCarac && this.isPermisoNuevoProductoCarac && this.isPermisoGuardarCambiosProductoCarac));			
			
			if(this.jInternalFrameDetalleFormProductoCarac!=null) {
			this.jInternalFrameDetalleFormProductoCarac.jButtonModificarToolBarProductoCarac.setVisible((this.isVisibilidadCeldaModificarProductoCarac && this.isPermisoActualizarProductoCarac));	
			this.jInternalFrameDetalleFormProductoCarac.jButtonActualizarToolBarProductoCarac.setVisible((this.isVisibilidadCeldaActualizarProductoCarac  && this.isPermisoActualizarProductoCarac));	
			this.jInternalFrameDetalleFormProductoCarac.jButtonEliminarToolBarProductoCarac.setVisible((this.isVisibilidadCeldaEliminarProductoCarac && this.isPermisoEliminarProductoCarac));
			this.jInternalFrameDetalleFormProductoCarac.jButtonCancelarToolBarProductoCarac.setVisible(this.isVisibilidadCeldaCancelarProductoCarac);				
			this.jInternalFrameDetalleFormProductoCarac.jButtonGuardarCambiosToolBarProductoCarac.setVisible((this.isVisibilidadCeldaGuardarProductoCarac && this.isPermisoGuardarCambiosProductoCarac));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoCarac.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoCarac && this.isPermisoGuardarCambiosProductoCarac));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoCarac.setVisible((this.isVisibilidadCeldaNuevoProductoCarac && this.isPermisoNuevoProductoCarac));			
			this.jMenuItemDuplicarProductoCarac.setVisible((this.isVisibilidadCeldaDuplicarProductoCarac && this.isPermisoDuplicarProductoCarac));			
			this.jMenuItemCopiarProductoCarac.setVisible((this.isVisibilidadCeldaCopiarProductoCarac && this.isPermisoCopiarProductoCarac));			
			this.jMenuItemVerFormProductoCarac.setVisible((this.isVisibilidadCeldaVerFormProductoCarac && this.isPermisoVerFormProductoCarac));			
			this.jMenuItemAbrirOrderByProductoCarac.setVisible((this.isVisibilidadCeldaOrdenProductoCarac && this.isPermisoOrdenProductoCarac));			
			//this.jMenuItemMostrarOcultarProductoCarac.setVisible((this.isVisibilidadCeldaOrdenProductoCarac && this.isPermisoOrdenProductoCarac));
			this.jMenuItemDetalleAbrirOrderByProductoCarac.setVisible((this.isVisibilidadCeldaOrdenProductoCarac && this.isPermisoOrdenProductoCarac));			
			//this.jMenuItemDetalleMostrarOcultarProductoCarac.setVisible((this.isVisibilidadCeldaOrdenProductoCarac && this.isPermisoOrdenProductoCarac));			
			this.jMenuItemNuevoRelacionesProductoCarac.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoCarac && this.isPermisoNuevoProductoCarac));			
			this.jMenuItemNuevoGuardarCambiosProductoCarac.setVisible((this.isVisibilidadCeldaNuevoProductoCarac && this.isPermisoNuevoProductoCarac && this.isPermisoGuardarCambiosProductoCarac));									
			
			if(this.jInternalFrameDetalleFormProductoCarac!=null) {
			this.jInternalFrameDetalleFormProductoCarac.jMenuItemModificarProductoCarac.setVisible((this.isVisibilidadCeldaModificarProductoCarac && this.isPermisoActualizarProductoCarac));	
			this.jInternalFrameDetalleFormProductoCarac.jMenuItemActualizarProductoCarac.setVisible((this.isVisibilidadCeldaActualizarProductoCarac && this.isPermisoActualizarProductoCarac));	
			this.jInternalFrameDetalleFormProductoCarac.jMenuItemEliminarProductoCarac.setVisible((this.isVisibilidadCeldaEliminarProductoCarac && this.isPermisoEliminarProductoCarac));
			this.jInternalFrameDetalleFormProductoCarac.jMenuItemCancelarProductoCarac.setVisible(this.isVisibilidadCeldaCancelarProductoCarac);				
			}
			
			this.jMenuItemGuardarCambiosProductoCarac.setVisible((this.isVisibilidadCeldaGuardarProductoCarac && this.isPermisoGuardarCambiosProductoCarac));						
			this.jMenuItemGuardarCambiosTablaProductoCarac.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoCarac && this.isPermisoGuardarCambiosProductoCarac));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoCarac=this.jButtonNuevoProductoCarac.isVisible();
			this.isVisibilidadCeldaDuplicarProductoCarac=this.jButtonDuplicarProductoCarac.isVisible();
			this.isVisibilidadCeldaCopiarProductoCarac=this.jButtonCopiarProductoCarac.isVisible();
			this.isVisibilidadCeldaVerFormProductoCarac=this.jButtonVerFormProductoCarac.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoCarac=this.jButtonAbrirOrderByProductoCarac.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoCarac=this.jButtonNuevoRelacionesProductoCarac.isVisible();
			this.isVisibilidadCeldaModificarProductoCarac=this.jButtonModificarProductoCarac.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoCarac!=null) {
			this.isVisibilidadCeldaActualizarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jButtonActualizarProductoCarac.isVisible();
			this.isVisibilidadCeldaEliminarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jButtonEliminarProductoCarac.isVisible();
			this.isVisibilidadCeldaCancelarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jButtonCancelarProductoCarac.isVisible();
			this.isVisibilidadCeldaGuardarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jButtonGuardarCambiosProductoCarac.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoCarac=this.jButtonGuardarCambiosTablaProductoCarac.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoCarac=this.jButtonNuevoToolBarProductoCarac.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoCarac=this.jButtonNuevoRelacionesToolBarProductoCarac.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoCarac!=null) {
			this.isVisibilidadCeldaModificarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jButtonModificarToolBarProductoCarac.isVisible();
			this.isVisibilidadCeldaActualizarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jButtonActualizarToolBarProductoCarac.isVisible();
			this.isVisibilidadCeldaEliminarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jButtonEliminarToolBarProductoCarac.isVisible();
			this.isVisibilidadCeldaCancelarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jButtonCancelarToolBarProductoCarac.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoCarac=this.jButtonGuardarCambiosToolBarProductoCarac.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoCarac=this.jButtonGuardarCambiosTablaToolBarProductoCarac.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoCarac=this.jMenuItemNuevoProductoCarac.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoCarac=this.jMenuItemNuevoRelacionesProductoCarac.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoCarac!=null) {
			this.isVisibilidadCeldaModificarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jMenuItemModificarProductoCarac.isVisible();
			this.isVisibilidadCeldaActualizarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jMenuItemActualizarProductoCarac.isVisible();
			this.isVisibilidadCeldaEliminarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jMenuItemEliminarProductoCarac.isVisible();
			this.isVisibilidadCeldaCancelarProductoCarac=this.jInternalFrameDetalleFormProductoCarac.jMenuItemCancelarProductoCarac.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoCarac=this.jMenuItemGuardarCambiosProductoCarac.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoCarac=this.jMenuItemGuardarCambiosTablaProductoCarac.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoCarac(Boolean esInicializar) {
		if(ProductoCaracJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productocaracSessionBean.getConGuardarRelaciones()) {
				//if(this.productocaracSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoCarac();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoCarac(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoCarac() {
		this.jButtonNuevoProductoCarac.setVisible(this.isPermisoNuevoProductoCarac);			
		this.jButtonDuplicarProductoCarac.setVisible(this.isPermisoDuplicarProductoCarac);			
		this.jButtonCopiarProductoCarac.setVisible(this.isPermisoCopiarProductoCarac);			
		this.jButtonVerFormProductoCarac.setVisible(this.isPermisoVerFormProductoCarac);			
		
		this.jButtonAbrirOrderByProductoCarac.setVisible(this.isPermisoOrdenProductoCarac);					
		
		this.jButtonNuevoRelacionesProductoCarac.setVisible(this.isPermisoNuevoProductoCarac);			
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoCarac.jButtonModificarProductoCarac.setVisible(this.isPermisoActualizarProductoCarac);	
			this.jInternalFrameDetalleFormProductoCarac.jButtonActualizarProductoCarac.setVisible(this.isPermisoActualizarProductoCarac);	
			this.jInternalFrameDetalleFormProductoCarac.jButtonEliminarProductoCarac.setVisible(this.isPermisoEliminarProductoCarac);
			this.jInternalFrameDetalleFormProductoCarac.jButtonCancelarProductoCarac.setVisible(this.isVisibilidadCeldaCancelarProductoCarac);						
			this.jInternalFrameDetalleFormProductoCarac.jButtonGuardarCambiosProductoCarac.setVisible(this.isPermisoGuardarCambiosProductoCarac);							
		}
		
		this.jButtonGuardarCambiosTablaProductoCarac.setVisible(this.isPermisoActualizarProductoCarac);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoCarac() {
		this.jInternalFrameDetalleFormProductoCarac.jButtonModificarProductoCarac.setVisible(this.isPermisoActualizarProductoCarac);	
		this.jInternalFrameDetalleFormProductoCarac.jButtonActualizarProductoCarac.setVisible(this.isPermisoActualizarProductoCarac);	
		this.jInternalFrameDetalleFormProductoCarac.jButtonEliminarProductoCarac.setVisible(this.isPermisoEliminarProductoCarac);
		this.jInternalFrameDetalleFormProductoCarac.jButtonCancelarProductoCarac.setVisible(this.isVisibilidadCeldaCancelarProductoCarac);							
		this.jInternalFrameDetalleFormProductoCarac.jButtonGuardarCambiosProductoCarac.setVisible((this.isVisibilidadCeldaGuardarProductoCarac && this.isPermisoGuardarCambiosProductoCarac));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoCarac() {
		if(ProductoCaracJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoCarac();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoCarac() {
	}
	
	public void jTableDatosProductoCaracListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoCarac(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoCaracBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoCarac(this.getproductocarac(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productocarac==null) {
						this.productocarac = new ProductoCarac();
					}

					this.setVariablesFormularioToObjetoActualProductoCarac(this.productocarac,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);
				}

				if(this.productocarac.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productocarac.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoCarac(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductoCaracUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductoCarac(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoCarac.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoCarac.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoCarac(this.getproductocarac(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productocaracLogic.getConnexion());

				if(this.productocarac.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productocarac.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoCarac=(TitledBorder)this.jScrollPanelDatosProductoCarac.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductoCarac.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductoCaracBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoCarac(this.getproductocarac(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productocarac==null) {
						this.productocarac = new ProductoCarac();
					}

					this.setVariablesFormularioToObjetoActualProductoCarac(this.productocarac,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);
				}

				if(this.productocarac.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productocarac.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoCarac(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProductoCaracUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProductoCarac(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoCarac.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoCarac.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoCarac(this.getproductocarac(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.productocaracLogic.getConnexion());

				if(this.productocarac.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.productocarac.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoCarac=(TitledBorder)this.jScrollPanelDatosProductoCarac.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProductoCarac.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProductoCaracBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoCarac(this.getproductocarac(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productocarac==null) {
						this.productocarac = new ProductoCarac();
					}

					this.setVariablesFormularioToObjetoActualProductoCarac(this.productocarac,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);
				}

				if(this.productocarac.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.productocarac.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoCarac(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProductoCaracActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderProductoCarac=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosProductoCarac.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoCarac=(TitledBorder)this.jScrollPanelDatosProductoCarac.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoCarac.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoProductoCaracUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProductoCarac(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoCarac.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoCarac.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoCarac(this.getproductocarac(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.productocaracLogic.getConnexion());

				if(this.productocarac.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.productocarac.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoCarac=(TitledBorder)this.jScrollPanelDatosProductoCarac.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoCarac.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProductoCaracBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoCarac(this.getproductocarac(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productocarac==null) {
						this.productocarac = new ProductoCarac();
					}

					this.setVariablesFormularioToObjetoActualProductoCarac(this.productocarac,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);
				}

				if(this.productocarac.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.productocarac.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoCarac(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncaracteristicaProductoCaracBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoCarac(this.getproductocarac(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productocarac==null) {
						this.productocarac = new ProductoCarac();
					}

					this.setVariablesFormularioToObjetoActualProductoCarac(this.productocarac,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);
				}

				if(this.productocarac.getcaracteristica()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where caracteristica like '%"+this.productocarac.getcaracteristica()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoCarac(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaProductoCaracActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoCarac(false,false);

			this.getProductoCaracsFK_IdEmpresa();

			this.inicializarActualizarBindingProductoCarac(false);

			//if(ProductoCaracBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoCarac(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProductoCaracActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoCarac(false,false);

			this.getProductoCaracsFK_IdProducto();

			this.inicializarActualizarBindingProductoCarac(false);

			//if(ProductoCaracBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoCarac(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProductoCaracActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoCarac(false,false);

			this.getProductoCaracsFK_IdSucursal();

			this.inicializarActualizarBindingProductoCarac(false);

			//if(ProductoCaracBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoCarac(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productocaracLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoCarac() {
		if(this.jInternalFrameDetalleFormProductoCarac!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) {
			this.jInternalFrameDetalleFormProductoCarac.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoCarac.dispose();
			this.jInternalFrameDetalleFormProductoCarac=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoCarac!=null) {
			this.jInternalFrameReporteDinamicoProductoCarac.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoCarac.dispose();
			this.jInternalFrameReporteDinamicoProductoCarac=null;
		}
		
		if(this.jInternalFrameImportacionProductoCarac!=null) {
			this.jInternalFrameImportacionProductoCarac.setVisible(false);	    			
			this.jInternalFrameImportacionProductoCarac.dispose();
			this.jInternalFrameImportacionProductoCarac=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoCarac();
			
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoCarac")) {
				jButtonNuevoProductoCaracActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoCarac")) {
				jButtonDuplicarProductoCaracActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoCarac")) {
				jButtonCopiarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoCarac")) {
				jButtonVerFormProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoCarac")) {
				jButtonNuevoProductoCaracActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoCarac")) {
				jButtonDuplicarProductoCaracActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoCarac")) {
				jButtonNuevoProductoCaracActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoCarac")) {
				jButtonDuplicarProductoCaracActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoCarac")) {
				jButtonNuevoProductoCaracActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoCarac")) {
				jButtonNuevoProductoCaracActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoCarac")) {
				jButtonNuevoProductoCaracActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoCarac")) {
				jButtonModificarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoCarac")) {
				jButtonModificarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoCarac")) {
				jButtonModificarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoCarac")) {
				jButtonActualizarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoCarac")) {
				jButtonActualizarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoCarac")) {
				jButtonActualizarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoCarac")) {
				jButtonEliminarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoCarac")) {
				jButtonEliminarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoCarac")) {
				jButtonEliminarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoCarac")) {
				jButtonCancelarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoCarac")) {
				jButtonCancelarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoCarac")) {
				jButtonCancelarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoCarac")) {
				jButtonCerrarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoCarac")) {
				jButtonCerrarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoCarac")) {
				jButtonCerrarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoCarac")) {
				jButtonMostrarOcultarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoCarac")) {
				jButtonCancelarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoCarac")) {
				jButtonGuardarCambiosProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoCarac")) {
				jButtonGuardarCambiosProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoCarac")) {
				jButtonCopiarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoCarac")) {
				jButtonVerFormProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoCarac")) {
				jButtonGuardarCambiosProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoCarac")) {
				jButtonCopiarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoCarac")) {
				jButtonVerFormProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoCarac")) {
				jButtonGuardarCambiosProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoCarac")) {
				jButtonGuardarCambiosProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoCarac")) {
				jButtonGuardarCambiosProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoCarac")) {
				jButtonRecargarInformacionProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoCarac")) {
				jButtonRecargarInformacionProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoCarac")) {
				jButtonRecargarInformacionProductoCaracActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoCarac")) {
				jButtonAnterioresProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoCarac")) {
				jButtonAnterioresProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoCarac")) {
				jButtonAnterioresProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoCarac")) {
				jButtonSiguientesProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoCarac")) {
				jButtonSiguientesProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoCarac")) {
				jButtonSiguientesProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoCarac") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoCarac")) {
				jButtonAbrirOrderByProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoCarac") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoCarac")) {
				jButtonMostrarOcultarProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoCarac")) {
				jButtonNuevoGuardarCambiosProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoCarac")) {
				jButtonNuevoGuardarCambiosProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoCarac")) {
				jButtonNuevoGuardarCambiosProductoCaracActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoCarac")) {
				jButtonCerrarReporteDinamicoProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoCarac")) {
				jButtonGenerarReporteDinamicoProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoCarac")) {
				
				jButtonGenerarExcelReporteDinamicoProductoCaracActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoCarac")) {
				jButtonCerrarImportacionProductoCaracActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoCarac")) {
				
				jButtonGenerarImportacionProductoCaracActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoCarac")) {
				
				jButtonAbrirImportacionProductoCaracActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoCarac")) {
				jComboBoxTiposAccionesProductoCaracActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoCarac")) {
				jComboBoxTiposRelacionesProductoCaracActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoCarac")) {
				jComboBoxTiposAccionesProductoCaracActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoCarac")) {
				
				jComboBoxTiposSeleccionarProductoCaracActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoCarac")) {
				jTextFieldValorCampoGeneralProductoCaracActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoCarac")) {
				jButtonAbrirOrderByProductoCaracActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoCarac")) {
				jButtonAbrirOrderByProductoCaracActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoCarac")) {
				jButtonCerrarOrderByProductoCaracActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoCaracBusqueda")) {
				this.jButtonidProductoCaracBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoCaracUpdate")) {
				this.jButtonid_empresaProductoCaracUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoCaracBusqueda")) {
				this.jButtonid_empresaProductoCaracBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoCaracUpdate")) {
				this.jButtonid_sucursalProductoCaracUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoCaracBusqueda")) {
				this.jButtonid_sucursalProductoCaracBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoCarac")) {
				this.jButtonid_productoProductoCaracActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoCaracUpdate")) {
				this.jButtonid_productoProductoCaracUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoCaracBusqueda")) {
				this.jButtonid_productoProductoCaracBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("caracteristicaProductoCaracBusqueda")) {
				this.jButtoncaracteristicaProductoCaracBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoProductoCarac")) {
				this.jButtonid_productoProductoCaracActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdProductoProductoCarac")) {
				this.jButtonFK_IdProductoProductoCaracActionPerformed(evt);
			}
			
			;
			
			
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoCarac();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoCaracActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productocarac);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productocarac);
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
				
				


				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoCarac.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoCarac.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoCarac productocaracLocal=null;
			
			if(!this.getEsControlTabla()) {
				productocaracLocal=this.productocarac;
			} else {
				productocaracLocal=this.productocaracAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productocarac);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productocarac);
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
							
				
				


				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoCarac.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoCarac.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoCaracActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracAnterior =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productocaracAnterior =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
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
			
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			
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
			
			


			
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoCaracActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productocarac);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productocarac);
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
								
						
				


				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoCarac.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoCarac.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productocarac);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productocarac);
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
								
				
				


				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoCarac.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoCarac.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoCaracActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracAnterior =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productocaracAnterior =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productocarac);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productocarac);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoCaracActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracAnterior =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productocaracAnterior =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoCaracActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productocarac);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productocarac);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productocarac);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productocarac);
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
							
				
				


				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoCarac.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoCarac.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoCaracActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productocaracAnterior =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productocaracAnterior =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
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
			
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			
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
			
			


			
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoCaracActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productocarac);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productocarac);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productocarac);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productocarac);
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
								
				
				


				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoCarac.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoCarac.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoCaracActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracAnterior =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productocaracAnterior =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoCaracActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productocarac);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productocarac);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoCaracActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productocarac);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productocarac);
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoCarac")) {
					jCheckBoxSeleccionarTodosProductoCaracItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoCarac")) {
					jCheckBoxSeleccionadosProductoCaracItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoCarac")) {
					
				}
				
				


				
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoCarac.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoCarac.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productocarac);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productocarac);
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
												
				
				


				
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoCarac.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoCarac.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoCaracActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productocaracAnterior =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productocaracAnterior =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoCaracActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productocarac);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productocarac);
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
				
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
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
			
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
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
			
			


			
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoCaracActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productocarac);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productocarac);
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoCarac.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoCarac.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productocarac);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productocarac);
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
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
				
				


				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoCarac.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoCarac.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoCaracActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productocaracAnterior =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productocaracAnterior =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoCarac")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoCaracListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoCarac.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productocarac =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productocarac =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productocarac);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoCarac")) {
				
				}
				
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoCarac")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoCarac.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoCarac")) {
			
			}
			
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoCarac();
			
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			
			if(sTipo.equals("NuevoProductoCarac")) {
				jButtonNuevoProductoCaracActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoCarac")) {
				jButtonDuplicarProductoCaracActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoCarac")) {
				jButtonCopiarProductoCaracActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoCarac")) {
				jButtonVerFormProductoCaracActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoCarac")) {
				jButtonNuevoProductoCaracActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoCarac")) {
				jButtonModificarProductoCaracActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoCarac")) {
				jButtonActualizarProductoCaracActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoCarac")) {
				jButtonEliminarProductoCaracActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoCarac")) {
				jButtonGuardarCambiosProductoCaracActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoCarac")) {
				jButtonCancelarProductoCaracActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoCarac")) {
				jButtonCerrarProductoCaracActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoCarac")) {
				jButtonGuardarCambiosProductoCaracActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoCarac")) {
				jButtonNuevoGuardarCambiosProductoCaracActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoCarac")) {
				jButtonAbrirOrderByProductoCaracActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoCarac")) {
				jButtonRecargarInformacionProductoCaracActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoCarac")) {
				jButtonAnterioresProductoCaracActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoCarac")) {
				jButtonSiguientesProductoCaracActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoCaracBusqueda")) {
				this.jButtonidProductoCaracBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoCaracUpdate")) {
				this.jButtonid_empresaProductoCaracUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoCaracBusqueda")) {
				this.jButtonid_empresaProductoCaracBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoCaracUpdate")) {
				this.jButtonid_sucursalProductoCaracUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoCaracBusqueda")) {
				this.jButtonid_sucursalProductoCaracBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoCarac")) {
				this.jButtonid_productoProductoCaracActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoCaracUpdate")) {
				this.jButtonid_productoProductoCaracUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoCaracBusqueda")) {
				this.jButtonid_productoProductoCaracBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("caracteristicaProductoCaracBusqueda")) {
				this.jButtoncaracteristicaProductoCaracBusquedaActionPerformed(evt);
			}
			
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoCarac();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoCarac")) {
				closingInternalFrameProductoCarac();
				
			} else if(sTipo.equals("jButtonCancelarProductoCarac")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoCarac = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoCaracBeanSwingJInternalFrame jInternalFrameParent=(ProductoCaracBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoCarac.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoCaracActionPerformed(null);
			}
			
			ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productocarac,new Object(),this.productocaracParameterGeneral,this.productocaracReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoCarac(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoCarac(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoCarac(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productocarac)) {
			if(!esControlTabla) {
				if(ProductoCaracJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoCarac(this.productocarac,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);			
				}
				
				if(this.productocaracSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoCarac(this.productocarac,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productocaracReturnGeneral=productocaracLogic.procesarEventosProductoCaracsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productocaracLogic.getProductoCaracs(),this.productocarac,this.productocaracParameterGeneral,this.isEsNuevoProductoCarac,classes);//this.productocaracLogic.getProductoCarac()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoCarac(this.productocaracReturnGeneral,this.productocaracBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productocaracSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoCarac(classes,this.productocaracReturnGeneral,this.productocaracBean,false);
					}
						
					if(this.productocaracReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoCarac(this.productocaracReturnGeneral.getProductoCarac());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoCarac(this.productocaracReturnGeneral.getProductoCarac());	
					}
						
					if(this.productocaracReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoCarac(this.productocaracReturnGeneral.getProductoCarac(),classes);//this.productocaracBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoCarac(this.productocarac,classes);//this.productocaracBean);									
				}
			
				if(ProductoCaracJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoCarac(this.productocarac,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoCarac(this.productocarac);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productocaracAnterior!=null) {
						this.productocarac=this.productocaracAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productocaracReturnGeneral=productocaracLogic.procesarEventosProductoCaracsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productocaracLogic.getProductoCaracs(),this.productocarac,this.productocaracParameterGeneral,this.isEsNuevoProductoCarac,classes);//this.productocaracLogic.getProductoCarac()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productocaracSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productocaracSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productocaracReturnGeneral.getProductoCarac(),productocaracLogic.getProductoCaracs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productocaracReturnGeneral.getProductoCarac(),this.productocaracs);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoCarac.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoCarac.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoCarac();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoCarac() throws Exception {
		
		ProductoCaracModel productocaracModel=(ProductoCaracModel)this.jTableDatosProductoCarac.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productocaracModel.productocaracs=this.productocaracLogic.getProductoCaracs();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productocaracModel.productocaracs=this.productocaracs;
		}
		
		
		((ProductoCaracModel) this.jTableDatosProductoCarac.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoCarac() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductocaracAnterior(),this.productocaracLogic.getProductoCaracs());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductocaracAnterior(),this.productocaracs);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoCarac();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoCarac(ProductoCarac productocarac,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
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
										
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productocarac,new Object(),generalEntityParameterGeneral,this.productocaracReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productocaracSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoCaracConstantesFunciones.getClassesRelationshipsOfProductoCarac(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoCaracConstantesFunciones.getClassesRelationshipsFromStringsOfProductoCarac(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoCarac(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoCaracBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productocarac,new Object(),generalEntityParameterGeneral,this.productocaracReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoCarac(ProductoCaracBean productocaracBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoCarac(ArrayList<Classe> classes,ProductoCaracReturnGeneral productocaracReturnGeneral,ProductoCaracBean productocaracBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoCarac(ProductoCarac productocarac,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productocarac)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoCarac = new ProductoCaracDetalleFormJInternalFrame(jDesktopPane,this.productocaracSessionBean.getConGuardarRelaciones(),this.productocaracSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoCarac);
		this.jInternalFrameDetalleFormProductoCarac.setVisible(false);
		this.jInternalFrameDetalleFormProductoCarac.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoCarac.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoCarac.productocaracLogic=this.productocaracLogic;
		
		this.cargarCombosFrameForeignKeyProductoCarac("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoCarac();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoCarac();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoCarac("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoCarac();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoCarac.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoCarac"));
		
		this.jInternalFrameDetalleFormProductoCarac.jButtonModificarProductoCarac.addActionListener(new ButtonActionListener(this,"ModificarProductoCarac"));

		
		this.jInternalFrameDetalleFormProductoCarac.jButtonModificarToolBarProductoCarac.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoCarac"));
					
		this.jInternalFrameDetalleFormProductoCarac.jMenuItemModificarProductoCarac.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoCarac"));		
		
		
		
		this.jInternalFrameDetalleFormProductoCarac.jButtonActualizarProductoCarac.addActionListener (new ButtonActionListener(this,"ActualizarProductoCarac"));
		
		
		this.jInternalFrameDetalleFormProductoCarac.jButtonActualizarToolBarProductoCarac.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoCarac"));
						
		this.jInternalFrameDetalleFormProductoCarac.jMenuItemActualizarProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoCarac"));		
		
		
		
		this.jInternalFrameDetalleFormProductoCarac.jButtonEliminarProductoCarac.addActionListener (new ButtonActionListener(this,"EliminarProductoCarac"));
		
		
		this.jInternalFrameDetalleFormProductoCarac.jButtonEliminarToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoCarac"));
								
		this.jInternalFrameDetalleFormProductoCarac.jMenuItemEliminarProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoCarac"));		
		
		
		
		this.jInternalFrameDetalleFormProductoCarac.jButtonCancelarProductoCarac.addActionListener (new ButtonActionListener(this,"CancelarProductoCarac"));
		
		
		this.jInternalFrameDetalleFormProductoCarac.jButtonCancelarToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoCarac"));
					
		this.jInternalFrameDetalleFormProductoCarac.jMenuItemCancelarProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoCarac"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoCarac.jMenuItemDetalleCerrarProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoCarac"));		
		
		
		
		this.jInternalFrameDetalleFormProductoCarac.jButtonGuardarCambiosToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoCarac"));
		
		
		
		this.jInternalFrameDetalleFormProductoCarac.jButtonGuardarCambiosToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoCarac"));
		
		
		
		this.jInternalFrameDetalleFormProductoCarac.jComboBoxTiposAccionesFormularioProductoCarac.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoCarac"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoCarac.jButtonidProductoCaracBusqueda.addActionListener(new ButtonActionListener(this,"idProductoCaracBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_empresaProductoCaracUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoCaracUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_empresaProductoCaracBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoCaracBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_sucursalProductoCaracUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoCaracUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_sucursalProductoCaracBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoCaracBusqueda"));
		//jButtonid_productoProductoCarac.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoCaracActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_productoProductoCarac.addActionListener(new ButtonActionListener(this,"id_productoProductoCarac"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_productoProductoCaracUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoCaracUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_productoProductoCaracBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoCaracBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoCarac.jButtoncaracteristicaProductoCaracBusqueda.addActionListener(new ButtonActionListener(this,"caracteristicaProductoCaracBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoCarac.jTabbedPaneRelacionesProductoCarac.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoCarac"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoCarac"));
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoCarac.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoCarac"));
		}
		
		this.jTableDatosProductoCarac.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoCarac"));
		
		this.jTableDatosProductoCarac.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoCarac"));
		
		this.jButtonNuevoProductoCarac.addActionListener(new ButtonActionListener(this,"NuevoProductoCarac"));
		
		this.jButtonDuplicarProductoCarac.addActionListener(new ButtonActionListener(this,"DuplicarProductoCarac"));
		
		this.jButtonCopiarProductoCarac.addActionListener(new ButtonActionListener(this,"CopiarProductoCarac"));
		
		this.jButtonVerFormProductoCarac.addActionListener(new ButtonActionListener(this,"VerFormProductoCarac"));
		
		
		this.jButtonNuevoToolBarProductoCarac.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoCarac"));
			
		this.jButtonDuplicarToolBarProductoCarac.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoCarac"));
			
		this.jMenuItemNuevoProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoCarac"));
			
		this.jMenuItemDuplicarProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoCarac"));		
		
		
		this.jButtonNuevoRelacionesProductoCarac.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoCarac"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoCarac.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoCarac"));
			
		this.jMenuItemNuevoRelacionesProductoCarac.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoCarac"));		
		
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoCarac.jButtonModificarProductoCarac.addActionListener(new ButtonActionListener(this,"ModificarProductoCarac"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoCarac.jButtonModificarToolBarProductoCarac.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoCarac"));
			
			this.jInternalFrameDetalleFormProductoCarac.jMenuItemModificarProductoCarac.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoCarac"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoCarac.jButtonActualizarProductoCarac.addActionListener (new ButtonActionListener(this,"ActualizarProductoCarac"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoCarac.jButtonActualizarToolBarProductoCarac.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoCarac"));
				
			this.jInternalFrameDetalleFormProductoCarac.jMenuItemActualizarProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoCarac"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoCarac.jButtonEliminarProductoCarac.addActionListener (new ButtonActionListener(this,"EliminarProductoCarac"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoCarac.jButtonEliminarToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoCarac"));
						
			this.jInternalFrameDetalleFormProductoCarac.jMenuItemEliminarProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoCarac"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoCarac.jButtonCancelarProductoCarac.addActionListener (new ButtonActionListener(this,"CancelarProductoCarac"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoCarac.jButtonCancelarToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoCarac"));
			
			this.jInternalFrameDetalleFormProductoCarac.jMenuItemCancelarProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoCarac"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoCarac"));		
		
		
		this.jButtonCerrarProductoCarac.addActionListener (new ButtonActionListener(this,"CerrarProductoCarac"));
		
		
		this.jButtonCerrarToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoCarac"));
			
		this.jMenuItemCerrarProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoCarac"));
			
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoCarac.jMenuItemDetalleCerrarProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoCarac"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoCarac.jButtonGuardarCambiosProductoCarac.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoCarac"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoCarac.jButtonGuardarCambiosToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoCarac"));
		}
		
		this.jButtonCopiarToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoCarac"));
			
		this.jButtonVerFormToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoCarac"));
		
		this.jMenuItemGuardarCambiosProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoCarac"));
			
		this.jMenuItemCopiarProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoCarac"));		
		
		this.jMenuItemVerFormProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoCarac"));		
		
		
		this.jButtonGuardarCambiosTablaProductoCarac.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoCarac"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoCarac"));
			
		this.jMenuItemGuardarCambiosTablaProductoCarac.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoCarac"));		
		
		
		
		this.jButtonRecargarInformacionProductoCarac.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoCarac"));
					
		this.jButtonRecargarInformacionToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoCarac"));
		
		this.jMenuItemRecargarInformacionProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoCarac"));		
		
		
		
		this.jButtonAnterioresProductoCarac.addActionListener (new ButtonActionListener(this,"AnterioresProductoCarac"));
		
		
		this.jButtonAnterioresToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoCarac"));
		
		this.jMenuItemAnterioresProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoCarac"));		
		
		
		this.jButtonSiguientesProductoCarac.addActionListener (new ButtonActionListener(this,"SiguientesProductoCarac"));
		
		
		this.jButtonSiguientesToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoCarac"));
			
		this.jMenuItemSiguientesProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoCarac"));
			
		this.jMenuItemAbrirOrderByProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoCarac"));
			
		this.jMenuItemMostrarOcultarProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoCarac"));
			
		this.jMenuItemDetalleAbrirOrderByProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoCarac"));
			
		this.jMenuItemDetalleMostarOcultarProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoCarac"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoCarac.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoCarac"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoCarac"));
			
		this.jMenuItemNuevoGuardarCambiosProductoCarac.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoCarac"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoCarac.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoCarac"));

		this.jCheckBoxSeleccionadosProductoCarac.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoCarac"));
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoCarac.jComboBoxTiposAccionesFormularioProductoCarac.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoCarac"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoCarac.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoCarac"));
			
		this.jComboBoxTiposAccionesProductoCarac.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoCarac"));
					
		this.jComboBoxTiposSeleccionarProductoCarac.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoCarac"));
			
		this.jTextFieldValorCampoGeneralProductoCarac.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoCarac"));		
		
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoCarac.jButtonidProductoCaracBusqueda.addActionListener(new ButtonActionListener(this,"idProductoCaracBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_empresaProductoCaracUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoCaracUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_empresaProductoCaracBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoCaracBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_sucursalProductoCaracUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoCaracUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_sucursalProductoCaracBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoCaracBusqueda"));
		//jButtonid_productoProductoCarac.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoCaracActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_productoProductoCarac.addActionListener(new ButtonActionListener(this,"id_productoProductoCarac"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_productoProductoCaracUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoCaracUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_productoProductoCaracBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoCaracBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoCarac.jButtoncaracteristicaProductoCaracBusqueda.addActionListener(new ButtonActionListener(this,"caracteristicaProductoCaracBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdProductoProductoCarac.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoCarac"));

			this.jButtonBuscarFK_IdProductoid_productoProductoCarac.addActionListener(new ButtonActionListener(this,"id_productoProductoCarac"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoCarac!=null) {
				this.jInternalFrameReporteDinamicoProductoCarac.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoCarac"));
				this.jInternalFrameReporteDinamicoProductoCarac.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoCarac"));
				this.jInternalFrameReporteDinamicoProductoCarac.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoCarac"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoCarac.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoCarac"));				
			//this.jButtonGenerarReporteDinamicoProductoCarac.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoCarac"));
			//this.jButtonGenerarExcelReporteDinamicoProductoCarac.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoCarac"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoCarac!=null) {
				this.jInternalFrameImportacionProductoCarac.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoCarac"));
				this.jInternalFrameImportacionProductoCarac.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoCarac"));
				this.jInternalFrameImportacionProductoCarac.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoCarac"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoCarac.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoCarac"));
			
			this.jButtonAbrirOrderByToolBarProductoCarac.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoCarac"));			
			
			if(this.jInternalFrameOrderByProductoCarac!=null) {
				this.jInternalFrameOrderByProductoCarac.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoCarac"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoCarac!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoCarac.jTabbedPaneRelacionesProductoCarac.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoCarac"));
		
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
            		closingInternalFrameProductoCarac();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoCarac.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoCarac = (JInternalFrameBase)event.getSource();
	            	
	            ProductoCaracBeanSwingJInternalFrame jInternalFrameParent=(ProductoCaracBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoCarac.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoCaracActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoCarac.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoCaracListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoCarac.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoCarac.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoCaracActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoCaracActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoCaracActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoCarac";
		inputMap = this.jButtonNuevoProductoCarac.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoCarac.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoCaracActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoCaracActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoCaracActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoCaracActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoCarac";
		inputMap = this.jButtonNuevoRelacionesProductoCarac.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoCarac.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoCaracActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoCarac";
		inputMap = this.jButtonModificarProductoCarac.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoCarac.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoCaracActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoCarac";
		inputMap = this.jButtonActualizarProductoCarac.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoCarac.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoCaracActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoCarac";
		inputMap = this.jButtonEliminarProductoCarac.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoCarac.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoCaracActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoCarac";
		inputMap = this.jButtonCancelarProductoCarac.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoCarac.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoCaracActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoCarac";
		inputMap = this.jButtonCerrarProductoCarac.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoCarac.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoCaracActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoCarac.jButtonGuardarCambiosProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoCarac";
		inputMap = this.jInternalFrameDetalleFormProductoCarac.jButtonGuardarCambiosProductoCarac.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoCarac.jButtonGuardarCambiosProductoCarac.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoCaracActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoCarac.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoCaracItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoCarac.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoCaracActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoCarac.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoCaracActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoCarac.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoCaracActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoCarac.jButtonidProductoCaracBusqueda.addActionListener(new ButtonActionListener(this,"idProductoCaracBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_empresaProductoCaracUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoCaracUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_empresaProductoCaracBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoCaracBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_sucursalProductoCaracUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoCaracUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_sucursalProductoCaracBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoCaracBusqueda"));
		//jButtonid_productoProductoCarac.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoCaracActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_productoProductoCarac.addActionListener(new ButtonActionListener(this,"id_productoProductoCarac"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_productoProductoCaracUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoCaracUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoCarac.jButtonid_productoProductoCaracBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoCaracBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoCarac.jButtoncaracteristicaProductoCaracBusqueda.addActionListener(new ButtonActionListener(this,"caracteristicaProductoCaracBusqueda"));
		
		
		this.jButtonFK_IdProductoProductoCarac.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoCarac"));

		this.jButtonBuscarFK_IdProductoid_productoProductoCarac.addActionListener(new ButtonActionListener(this,"id_productoProductoCarac"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoCarac.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoCaracActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoCaracActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoCarac.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoCarac(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoCarac productocaracAux:this.productocaracLogic.getProductoCaracs()) {
					productocaracAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoCarac productocaracAux:productocaracs) {
					productocaracAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoCaracItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoCarac(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoCarac productocaracAux:this.productocaracLogic.getProductoCaracs()) {
						productocaracAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoCarac productocaracAux:productocaracs) {
						productocaracAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoCarac productocaracAux:this.productocaracLogic.getProductoCaracs()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoCarac productocaracAux:productocaracs) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoCarac(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoCarac.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoCarac.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoCarac,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoCaracItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoCarac(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoCarac.getSelectedRows();
			
			ProductoCarac productocaracLocal=new ProductoCarac();
			
			//this.seleccionarTodosProductoCarac(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productocaracLocal =(ProductoCarac) this.productocaracLogic.getProductoCaracs().toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productocaracLocal =(ProductoCarac) this.productocaracs.toArray()[this.jTableDatosProductoCarac.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productocaracLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoCarac productocaracAux:this.productocaracLogic.getProductoCaracs()) {
						productocaracAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoCarac productocaracAux:productocaracs) {
						productocaracAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoCarac(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoCarac.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoCarac.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoCarac,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoCaracItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoCaracParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoCaracActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoCarac(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoCarac.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoCarac productocaracAux:this.productocaracLogic.getProductoCaracs()) {
				
						if(sTipoSeleccionar.equals(ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA)) {
							existe=true;
							productocaracAux.setcaracteristica(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoCarac productocaracAux:productocaracs) {
					
						if(sTipoSeleccionar.equals(ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA)) {
							existe=true;
							productocaracAux.setcaracteristica(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoCarac(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoCaracActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoCarac(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoCarac=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoCarac.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoCarac.jComboBoxTiposAccionesFormularioProductoCarac.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoCarac) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoCarac(conSplash);
				
					this.generarReporteProductoCaracsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoCarac.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoCarac.jComboBoxTiposAccionesFormularioProductoCarac.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoCaracsSeleccionados();
				//this.jComboBoxTiposAccionesProductoCarac.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoCaracsSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoCarac.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoCaracsSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoCarac.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoCarac();
				
				this.exportarProductoCaracsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoCarac.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoCarac.jComboBoxTiposAccionesFormularioProductoCarac.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoCaracs();
				//this.importarProductoCaracs();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoCarac.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoCarac.jComboBoxTiposAccionesFormularioProductoCarac.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoCarac();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoCaracsSeleccionados();
				//this.jComboBoxTiposAccionesProductoCarac.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Caracteristica", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoCarac();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoCarac)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoCarac(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Caracteristica",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoCarac.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoCarac.jComboBoxTiposAccionesFormularioProductoCarac.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoCaracBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoCarac) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoCarac(conSplash);
					
						//this.actualizarParametrosGeneralProductoCarac();
						
						this.generarReporteProcesoAccionProductoCaracsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoCarac.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoCarac.jComboBoxTiposAccionesFormularioProductoCarac.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoCaracBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO CaracteristicaS SELECCIONADOS?", "MANTENIMIENTO DE Caracteristica", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoCarac();
				
						this.actualizarParametrosGeneralProductoCarac();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productocaracReturnGeneral=productocaracLogic.procesarAccionProductoCaracsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productocaracLogic.getProductoCaracs(),this.productocaracParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoCaracReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoCarac.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoCarac.jComboBoxTiposAccionesFormularioProductoCarac.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoCarac();
					
					ProductoCaracBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoCaracReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoCarac.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoCarac.jComboBoxTiposAccionesFormularioProductoCarac.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoCarac(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoCaracActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoCarac();
			
			if(this.jInternalFrameDetalleFormProductoCarac==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoCarac> productocaracsSeleccionados=new ArrayList<ProductoCarac>();		
			ProductoCarac productocarac=new ProductoCarac();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoCarac(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoCarac.getSelectedItem();
			
			
			
			
			productocaracsSeleccionados=this.getProductoCaracsSeleccionados(true);
			//this.sTipoAccion;
			
			if(productocaracsSeleccionados.size()==1) {
				for(ProductoCarac productocaracAux:productocaracsSeleccionados) {
					productocarac=productocaracAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoCarac();
			
      		//this.finishProcessProductoCarac(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoCaracReturnGeneral() throws Exception {
		if(this.productocaracReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productocaracReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productocaracReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productocaracReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productocaracReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productocaracReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoCarac(false);
		}
		
		if(this.productocaracReturnGeneral.getConRetornoLista() || this.productocaracReturnGeneral.getConRetornoObjeto()) {
			if(this.productocaracReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productocaracLogic.setProductoCaracs(this.productocaracReturnGeneral.getProductoCaracs());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productocaracReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productocaracLogic.setProductoCarac(this.productocaracReturnGeneral.getProductoCarac());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoCarac(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoCarac() throws Exception {
		
		
	}
	
	public ArrayList<ProductoCarac> getProductoCaracsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoCarac> productocaracsSeleccionados=new ArrayList<ProductoCarac>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoCarac) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoCarac productocaracAux:productocaracLogic.getProductoCaracs()) {
					if(productocaracAux.getIsSelected()) {
						productocaracsSeleccionados.add(productocaracAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoCarac productocaracAux:this.productocaracs) {
					if(productocaracAux.getIsSelected()) {
						productocaracsSeleccionados.add(productocaracAux);				
					}
				}
			}
			
			if(productocaracsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productocaracsSeleccionados.addAll(this.productocaracLogic.getProductoCaracs());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productocaracsSeleccionados.addAll(this.productocaracs);				
					}
				}
			}
		} else {
			productocaracsSeleccionados.add(this.productocarac);
		}
		
		return productocaracsSeleccionados;
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
	
	public void generarReporteProductoCaracsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoCaracsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoCaracsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoCaracsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoCaracsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Caracteristica",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoCaracsSeleccionados() throws Exception {
		ArrayList<ProductoCarac> productocaracsSeleccionados=new ArrayList<ProductoCarac>();		
		
		productocaracsSeleccionados=this.getProductoCaracsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoCaracs("Todos",productocaracsSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoCaracsSeleccionados() throws Exception {
		ArrayList<ProductoCarac> productocaracsSeleccionados=new ArrayList<ProductoCarac>();		
		
		productocaracsSeleccionados=this.getProductoCaracsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoCaracs("Todos",productocaracsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoCaracsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoCarac> productocaracsSeleccionados=new ArrayList<ProductoCarac>();
		
		productocaracsSeleccionados=this.getProductoCaracsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoCaracs("Todos",productocaracsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoCaracsSeleccionados() throws Exception {
		ArrayList<ProductoCarac> productocaracsSeleccionados=new ArrayList<ProductoCarac>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoCarac();
		
		
		productocaracsSeleccionados=this.getProductoCaracsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoCarac();
		
		
		//this.generarReporteProductoCaracs("Todos",productocaracsSeleccionados ,productocaracImplementable,productocaracImplementableHome);
	}
	
	public void mostrarImportacionProductoCaracs() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoCarac();
		
		this.abrirFrameImportacionProductoCarac();		
		
			
		//this.generarReporteProductoCaracs("Todos",productocaracsSeleccionados ,productocaracImplementable,productocaracImplementableHome);
	}
	
	public void importarProductoCaracs() throws Exception {		
	
	}
	
	public void exportarProductoCaracsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoCaracsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoCaracsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoCaracsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Caracteristica",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoCaracsSeleccionados() throws Exception {
		ArrayList<ProductoCarac> productocaracsSeleccionados=new ArrayList<ProductoCarac>();		
		
		productocaracsSeleccionados=this.getProductoCaracsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productocarac."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoCarac(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoCarac productocaracAux:productocaracsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoCarac(productocaracAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productocaracAux.setsDetalleGeneralEntityReporte(productocaracAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productocaracSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caracteristica",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoCarac(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoCaracConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoCaracConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoCaracConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoCaracConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoCarac(ProductoCarac productocarac,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productocarac.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productocarac.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productocarac.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productocarac.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productocarac.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productocarac.getcaracteristica();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoCaracsSeleccionados() throws Exception {
		ArrayList<ProductoCarac> productocaracsSeleccionados=new ArrayList<ProductoCarac>();		
		
		productocaracsSeleccionados=this.getProductoCaracsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productocarac.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoCaracs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoCarac(row);				
				iRow++;
			}				
			
			for(ProductoCarac productocaracAux:productocaracsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoCarac(productocaracAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productocaracSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caracteristica",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoCaracsSeleccionados() throws Exception {
		ArrayList<ProductoCarac> productocaracsSeleccionados=new ArrayList<ProductoCarac>();		
		
		productocaracsSeleccionados=this.getProductoCaracsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productocarac.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productocaracs");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productocarac");
			//elementRoot.appendChild(element);
		
			for(ProductoCarac productocaracAux:productocaracsSeleccionados) {
				element = document.createElement("productocarac");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoCarac(productocaracAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productocaracSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caracteristica",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoCarac(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoCaracConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoCaracConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoCaracConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoCaracConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoCarac(ProductoCarac productocarac,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productocarac.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productocarac.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productocarac.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productocarac.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productocarac.getcaracteristica());				
	}
	
	public void setFilaDatosExportarXmlProductoCarac(ProductoCarac productocarac,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoCaracConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productocarac.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoCaracConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productocarac.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProductoCaracConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productocarac.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProductoCaracConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(productocarac.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementproducto_descripcion = document.createElement(ProductoCaracConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(productocarac.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementcaracteristica = document.createElement(ProductoCaracConstantesFunciones.CARACTERISTICA);
		elementcaracteristica.appendChild(document.createTextNode(productocarac.getcaracteristica().trim()));
		element.appendChild(elementcaracteristica);
	}
	
	public void generarReporteGroupGenericoProductoCaracsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoCarac> productocaracsSeleccionados=new ArrayList<ProductoCarac>();
		
		productocaracsSeleccionados=this.getProductoCaracsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoCarac(productocaracsSeleccionados);
		
		this.generarReporteProductoCaracs("Todos",productocaracsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoCarac(ArrayList<ProductoCarac> productocaracsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoCarac productocaracAux:productocaracsSeleccionados) {
				productocaracAux.setsDetalleGeneralEntityReporte(productocaracAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoCaracConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productocaracAux.setsDescripcionGeneralEntityReporte1(productocaracAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoCaracConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					productocaracAux.setsDescripcionGeneralEntityReporte1(productocaracAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoCaracConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					productocaracAux.setsDescripcionGeneralEntityReporte1(productocaracAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoCaracConstantesFunciones.LABEL_CARACTERISTICA)) {
					existe=true;
					productocaracAux.setsDescripcionGeneralEntityReporte1(productocaracAux.getcaracteristica());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoCaracConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoCarac(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoCarac=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoCarac=true;
				this.isVisibilidadCeldaGuardarCambiosProductoCarac=true;
			}
			
			this.isVisibilidadCeldaModificarProductoCarac=false;
			this.isVisibilidadCeldaActualizarProductoCarac=false;
			this.isVisibilidadCeldaEliminarProductoCarac=false;
			this.isVisibilidadCeldaCancelarProductoCarac=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoCarac=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoCarac=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoCarac=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoCarac=false;
			this.isVisibilidadCeldaGuardarCambiosProductoCarac=false;
			this.isVisibilidadCeldaModificarProductoCarac=false;
			this.isVisibilidadCeldaActualizarProductoCarac=true;
			this.isVisibilidadCeldaEliminarProductoCarac=false;
			this.isVisibilidadCeldaCancelarProductoCarac=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoCarac=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoCarac=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoCarac=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoCarac=false;
			this.isVisibilidadCeldaGuardarCambiosProductoCarac=false;
			this.isVisibilidadCeldaModificarProductoCarac=false;
			this.isVisibilidadCeldaActualizarProductoCarac=true;
			this.isVisibilidadCeldaEliminarProductoCarac=true;
			this.isVisibilidadCeldaCancelarProductoCarac=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoCarac=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoCarac=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoCarac=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoCarac=false;
			this.isVisibilidadCeldaGuardarCambiosProductoCarac=false;
			this.isVisibilidadCeldaModificarProductoCarac=false;
			this.isVisibilidadCeldaActualizarProductoCarac=true;
			this.isVisibilidadCeldaEliminarProductoCarac=false;
			this.isVisibilidadCeldaCancelarProductoCarac=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoCarac=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoCarac=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoCarac=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoCarac=true;
			this.isVisibilidadCeldaGuardarCambiosProductoCarac=true;
			this.isVisibilidadCeldaModificarProductoCarac=false;
			this.isVisibilidadCeldaActualizarProductoCarac=false;
			this.isVisibilidadCeldaEliminarProductoCarac=false;
			this.isVisibilidadCeldaCancelarProductoCarac=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoCarac=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoCarac=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoCarac=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoCarac=false;
			this.isVisibilidadCeldaGuardarCambiosProductoCarac=false;
			this.isVisibilidadCeldaActualizarProductoCarac=false;
			this.isVisibilidadCeldaEliminarProductoCarac=false;
			this.isVisibilidadCeldaCancelarProductoCarac=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoCarac=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoCarac=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoCarac=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoCarac=false;
			this.isVisibilidadCeldaGuardarCambiosProductoCarac=false;
			this.isVisibilidadCeldaModificarProductoCarac=true;
			this.isVisibilidadCeldaActualizarProductoCarac=false;
			this.isVisibilidadCeldaEliminarProductoCarac=false;
			this.isVisibilidadCeldaCancelarProductoCarac=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoCarac=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoCarac=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoCaracJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoCarac=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoCarac=true;
			this.isVisibilidadCeldaGuardarCambiosProductoCarac=true;
		} else {
			this.actualizarEstadoPanelsProductoCarac(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoCarac=false;
			//this.isVisibilidadCeldaVerFormProductoCarac=false;
			this.isVisibilidadCeldaDuplicarProductoCarac=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productocaracSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoCarac=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoCarac=false;
			this.isVisibilidadCeldaGuardarCambiosProductoCarac=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productocaracSessionBean.getEsGuardarRelacionado()) {
			if(!productocaracSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoCarac=false;												
			}
			
			this.jButtonCerrarProductoCarac.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoCarac=false;
		}
		
		if(!this.permiteMantenimiento(this.productocarac)) {
			this.isVisibilidadCeldaActualizarProductoCarac=false;
			this.isVisibilidadCeldaEliminarProductoCarac=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoCarac() {
	}
	
	public void actualizarEstadoPanelsProductoCarac(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoCarac!=null) {
				this.jScrollPanelDatosEdicionProductoCarac.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoCarac!=null) {
				this.jTabbedPaneBusquedasProductoCarac.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoCarac!=null) {
				this.jScrollPanelDatosProductoCarac.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoCarac!=null) {
				this.jPanelPaginacionProductoCarac.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoCarac!=null) {
				this.jPanelParametrosReportesProductoCarac.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoCarac!=null) {
				this.jScrollPanelDatosEdicionProductoCarac.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoCarac!=null) {
				this.jTabbedPaneBusquedasProductoCarac.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoCarac!=null) {
				this.jScrollPanelDatosProductoCarac.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoCarac!=null) {
				this.jPanelPaginacionProductoCarac.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoCarac!=null) {
				this.jPanelParametrosReportesProductoCarac.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoCarac!=null) {
				this.jScrollPanelDatosEdicionProductoCarac.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoCarac!=null) {
				this.jTabbedPaneBusquedasProductoCarac.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoCarac!=null) {
				this.jScrollPanelDatosProductoCarac.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoCarac!=null) {
				this.jPanelPaginacionProductoCarac.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoCarac!=null) {
				this.jPanelParametrosReportesProductoCarac.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoCarac!=null) {
				this.jScrollPanelDatosEdicionProductoCarac.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoCarac!=null) {
				this.jTabbedPaneBusquedasProductoCarac.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoCarac!=null) {
				this.jScrollPanelDatosProductoCarac.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoCarac!=null) {
				this.jPanelPaginacionProductoCarac.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoCarac!=null) {
				this.jPanelParametrosReportesProductoCarac.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoCarac!=null) {
				this.jScrollPanelDatosEdicionProductoCarac.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoCarac!=null) {
				this.jTabbedPaneBusquedasProductoCarac.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoCarac!=null) {
				this.jScrollPanelDatosProductoCarac.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoCarac!=null) {
				this.jPanelPaginacionProductoCarac.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoCarac!=null) {
				this.jPanelParametrosReportesProductoCarac.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoCarac!=null) {
				this.jScrollPanelDatosEdicionProductoCarac.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoCarac!=null) {
				this.jTabbedPaneBusquedasProductoCarac.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoCarac!=null) {
				this.jScrollPanelDatosProductoCarac.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoCarac!=null) {
				this.jPanelPaginacionProductoCarac.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoCarac!=null) {
				this.jPanelParametrosReportesProductoCarac.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoCarac!=null) {
				this.jScrollPanelDatosEdicionProductoCarac.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoCarac!=null) {
				this.jTabbedPaneBusquedasProductoCarac.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoCarac!=null) {
				this.jScrollPanelDatosProductoCarac.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoCarac!=null) {
				this.jPanelPaginacionProductoCarac.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoCarac!=null) {
				this.jPanelParametrosReportesProductoCarac.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productocaracSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoCarac!=null) {
					this.jTabbedPaneBusquedasProductoCarac.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoCarac!=null) {
				this.jPanelParametrosReportesProductoCarac.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productocaracSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoCarac!=null) {
				this.jTabbedPaneBusquedasProductoCarac.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoCarac!=null) {
				this.jPanelParametrosReportesProductoCarac.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoCarac.remove(jPanelFK_IdProductoProductoCarac);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoCarac.remove(jPanelFK_IdProductoProductoCarac);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoCarac.remove(jPanelFK_IdProductoProductoCarac);}
		}
		
	}
	
	
	
	

	public String registrarSesionProductoCaracParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(productocaracSessionBean==null) {
				productocaracSessionBean=new ProductoCaracSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(productocaracSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.productocaracFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ProductoCaracConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionProductoCarac(true);
			//productoSessionBean.setlidProductoCaracActual(this.idProductoCaracActual);

			productocaracSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoCarac(true);
			productocaracSessionBean.setlIdProductoCaracActualForeignKey(this.idProductoCaracActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoCaracSessionBean productocaracSessionBean=new ProductoCaracSessionBean();
		
		if(this.productocaracSessionBean==null) {
			this.productocaracSessionBean=new ProductoCaracSessionBean();
		}
		
		this.productocaracSessionBean.setsUltimaBusquedaProductoCarac(this.getsAccionBusqueda());
		this.productocaracSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productocaracSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			productocaracSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			productocaracSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			productocaracSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoCaracSessionBean productocaracSessionBean=new ProductoCaracSessionBean();
		
		if(this.productocaracSessionBean==null) {
			this.productocaracSessionBean=new ProductoCaracSessionBean();
		}
		
		if(this.productocaracSessionBean.getsUltimaBusquedaProductoCarac()!=null&&!this.productocaracSessionBean.getsUltimaBusquedaProductoCarac().equals("")) {
			this.setsAccionBusqueda(productocaracSessionBean.getsUltimaBusquedaProductoCarac());
			this.setiNumeroPaginacion(productocaracSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productocaracSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(productocaracSessionBean.getid_empresa());
				productocaracSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(productocaracSessionBean.getid_producto());
				productocaracSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(productocaracSessionBean.getid_sucursal());
				productocaracSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.productocaracSessionBean.setsUltimaBusquedaProductoCarac("");
		this.productocaracSessionBean.setiNumeroPaginacion(ProductoCaracConstantesFunciones.INUMEROPAGINACION);
		this.productocaracSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoCarac(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoCarac() {
		this.updateBorderResaltarBusquedasFormularioProductoCarac();
		this.updateVisibilidadBusquedasFormularioProductoCarac();
		this.updateHabilitarBusquedasFormularioProductoCarac();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoCarac() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoCarac.getComponents().length>0) {
	

		if(this.productocaracConstantesFunciones.resaltarFK_IdProductoProductoCarac!=null) {
			index= this.jTabbedPaneBusquedasProductoCarac.indexOfComponent(this.jPanelFK_IdProductoProductoCarac);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoCarac.getComponent(index);
				jPanel.setBorder(this.productocaracConstantesFunciones.resaltarFK_IdProductoProductoCarac);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoCarac() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoCarac.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoCarac.indexOfComponent(this.jPanelFK_IdProductoProductoCarac);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoCarac.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productocaracConstantesFunciones.mostrarFK_IdProductoProductoCarac);
			if(!this.productocaracConstantesFunciones.mostrarFK_IdProductoProductoCarac && index>-1) {
				this.jTabbedPaneBusquedasProductoCarac.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoCarac() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoCarac.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoCarac.indexOfComponent(this.jPanelFK_IdProductoProductoCarac);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoCarac.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productocaracConstantesFunciones.activarFK_IdProductoProductoCarac);
				this.jTabbedPaneBusquedasProductoCarac.setEnabledAt(index,this.productocaracConstantesFunciones.activarFK_IdProductoProductoCarac);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoCarac(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasProductoCarac.indexOfComponent(this.jPanelFK_IdProductoProductoCarac);

			this.jTabbedPaneBusquedasProductoCarac.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoCarac.getComponent(index);

			this.productocaracConstantesFunciones.setResaltarFK_IdProductoProductoCarac(resaltar);

			jPanel.setBorder(this.productocaracConstantesFunciones.resaltarFK_IdProductoProductoCarac);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoCarac.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoCarac() throws Exception {

		if(this.jInternalFrameDetalleFormProductoCarac==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoCarac();
		this.updateVisibilidadResaltarControlesFormularioProductoCarac();
		this.updateHabilitarResaltarControlesFormularioProductoCarac();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoCarac() throws Exception {
		if(this.jInternalFrameDetalleFormProductoCarac==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productocaracConstantesFunciones.resaltaridProductoCarac!=null && this.jInternalFrameDetalleFormProductoCarac!=null) {this.jInternalFrameDetalleFormProductoCarac.jLabelidProductoCarac.setBorder(this.productocaracConstantesFunciones.resaltaridProductoCarac);}
		if(this.productocaracConstantesFunciones.resaltarid_empresaProductoCarac!=null && this.jInternalFrameDetalleFormProductoCarac!=null) {this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_empresaProductoCarac.setBorder(this.productocaracConstantesFunciones.resaltarid_empresaProductoCarac);}
		if(this.productocaracConstantesFunciones.resaltarid_sucursalProductoCarac!=null && this.jInternalFrameDetalleFormProductoCarac!=null) {this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_sucursalProductoCarac.setBorder(this.productocaracConstantesFunciones.resaltarid_sucursalProductoCarac);}
		if(this.productocaracConstantesFunciones.resaltarid_productoProductoCarac!=null && this.jInternalFrameDetalleFormProductoCarac!=null) {this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_productoProductoCarac.setBorder(this.productocaracConstantesFunciones.resaltarid_productoProductoCarac);}
		if(this.productocaracConstantesFunciones.resaltarcaracteristicaProductoCarac!=null && this.jInternalFrameDetalleFormProductoCarac!=null) {this.jInternalFrameDetalleFormProductoCarac.jTextAreacaracteristicaProductoCarac.setBorder(this.productocaracConstantesFunciones.resaltarcaracteristicaProductoCarac);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoCarac() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoCarac==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) {
	
		//this.jInternalFrameDetalleFormProductoCarac.jLabelidProductoCarac.setVisible(this.productocaracConstantesFunciones.mostraridProductoCarac);
		this.jInternalFrameDetalleFormProductoCarac.jPanelidProductoCarac.setVisible(this.productocaracConstantesFunciones.mostraridProductoCarac);
		//this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_empresaProductoCarac.setVisible(this.productocaracConstantesFunciones.mostrarid_empresaProductoCarac);
		this.jInternalFrameDetalleFormProductoCarac.jPanelid_empresaProductoCarac.setVisible(this.productocaracConstantesFunciones.mostrarid_empresaProductoCarac);
		//this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_sucursalProductoCarac.setVisible(this.productocaracConstantesFunciones.mostrarid_sucursalProductoCarac);
		this.jInternalFrameDetalleFormProductoCarac.jPanelid_sucursalProductoCarac.setVisible(this.productocaracConstantesFunciones.mostrarid_sucursalProductoCarac);
		//this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_productoProductoCarac.setVisible(this.productocaracConstantesFunciones.mostrarid_productoProductoCarac);
		this.jInternalFrameDetalleFormProductoCarac.jPanelid_productoProductoCarac.setVisible(this.productocaracConstantesFunciones.mostrarid_productoProductoCarac);
			this.jInternalFrameDetalleFormProductoCarac.jButtonid_productoProductoCarac.setVisible(this.productocaracConstantesFunciones.mostrarid_productoProductoCarac);
		//this.jInternalFrameDetalleFormProductoCarac.jTextAreacaracteristicaProductoCarac.setVisible(this.productocaracConstantesFunciones.mostrarcaracteristicaProductoCarac);
		this.jInternalFrameDetalleFormProductoCarac.jPanelcaracteristicaProductoCarac.setVisible(this.productocaracConstantesFunciones.mostrarcaracteristicaProductoCarac);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoCarac() throws Exception {
		if(this.jInternalFrameDetalleFormProductoCarac==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoCarac!=null) {
	
		this.jInternalFrameDetalleFormProductoCarac.jLabelidProductoCarac.setEnabled(this.productocaracConstantesFunciones.activaridProductoCarac);
		this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_empresaProductoCarac.setEnabled(this.productocaracConstantesFunciones.activarid_empresaProductoCarac);
		this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_sucursalProductoCarac.setEnabled(this.productocaracConstantesFunciones.activarid_sucursalProductoCarac);
		this.jInternalFrameDetalleFormProductoCarac.jComboBoxid_productoProductoCarac.setEnabled(this.productocaracConstantesFunciones.activarid_productoProductoCarac);
			this.jInternalFrameDetalleFormProductoCarac.jButtonid_productoProductoCarac.setEnabled(this.productocaracConstantesFunciones.activarid_productoProductoCarac);
		this.jInternalFrameDetalleFormProductoCarac.jTextAreacaracteristicaProductoCarac.setEnabled(this.productocaracConstantesFunciones.activarcaracteristicaProductoCarac);
		}
	}
	
		
}