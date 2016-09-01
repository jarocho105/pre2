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

import com.bydan.erp.inventario.util.ProductoEspeciConstantesFunciones;
import com.bydan.erp.inventario.util.ProductoEspeciParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ProductoEspeciParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ProductoEspeciBean;
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
public class ProductoEspeciBeanSwingJInternalFrame extends ProductoEspeciJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoEspeciBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoEspeci> productoespeciValidator = new ClassValidator<ProductoEspeci>(ProductoEspeci.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoEspeci productoespeci;	
	public ProductoEspeci productoespeciAux;
	public ProductoEspeci productoespeciAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoEspeci productoespeciTotales;
	public Long idProductoEspeciActual;
	public Long iIdNuevoProductoEspeci=0L;
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
	
	public Boolean isPermisoTodoProductoEspeci;
	public Boolean isPermisoNuevoProductoEspeci;
	public Boolean isPermisoActualizarProductoEspeci;
	public Boolean isPermisoActualizarOriginalProductoEspeci;
	public Boolean isPermisoEliminarProductoEspeci;
	public Boolean isPermisoGuardarCambiosProductoEspeci;
	public Boolean isPermisoConsultaProductoEspeci;
	public Boolean isPermisoBusquedaProductoEspeci;
	public Boolean isPermisoReporteProductoEspeci;
	public Boolean isPermisoPaginacionMedioProductoEspeci;
	public Boolean isPermisoPaginacionAltoProductoEspeci;
	public Boolean isPermisoPaginacionTodoProductoEspeci;
	public Boolean isPermisoCopiarProductoEspeci;
	public Boolean isPermisoVerFormProductoEspeci;
	public Boolean isPermisoDuplicarProductoEspeci;
	public Boolean isPermisoOrdenProductoEspeci;
	
	
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
	
	public ProductoEspeciParameterReturnGeneral productoespeciReturnGeneral;
	public ProductoEspeciParameterReturnGeneral productoespeciParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoEspeci=false;
	public Boolean esParaAccionDesdeFormularioProductoEspeci=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoEspeciSessionBeanAdditional productoespeciSessionBeanAdditional=null;
	
	public ProductoEspeciSessionBeanAdditional getProductoEspeciSessionBeanAdditional() {
		return this.productoespeciSessionBeanAdditional;
	}
	
	public void setProductoEspeciSessionBeanAdditional(ProductoEspeciSessionBeanAdditional productoespeciSessionBeanAdditional) {
		try {
			this.productoespeciSessionBeanAdditional=productoespeciSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoEspeciBeanSwingJInternalFrameAdditional productoespeciBeanSwingJInternalFrameAdditional=null;
	//public class ProductoEspeciBeanSwingJInternalFrame
	
	public ProductoEspeciBeanSwingJInternalFrameAdditional getProductoEspeciBeanSwingJInternalFrameAdditional() {
		return this.productoespeciBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoEspeciBeanSwingJInternalFrameAdditional(ProductoEspeciBeanSwingJInternalFrameAdditional productoespeciBeanSwingJInternalFrameAdditional) {
		try {
			this.productoespeciBeanSwingJInternalFrameAdditional=productoespeciBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoEspeciLogic productoespeciLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoEspeci productoespeciBean;
	public ProductoEspeciConstantesFunciones productoespeciConstantesFunciones;
	//public ProductoEspeciParameterReturnGeneral productoespeciReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ProductoLogic productoLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoEspeci> productoespecis;	
	//public List<ProductoEspeci> productoespecisEliminados;
	//public List<ProductoEspeci> productoespecisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoEspeci=false;
	public Boolean isVisibilidadCeldaDuplicarProductoEspeci=true;
	public Boolean isVisibilidadCeldaCopiarProductoEspeci=true;
	public Boolean isVisibilidadCeldaVerFormProductoEspeci=true;
	public Boolean isVisibilidadCeldaOrdenProductoEspeci=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoEspeci=false;
	public Boolean isVisibilidadCeldaModificarProductoEspeci=false;
	public Boolean isVisibilidadCeldaActualizarProductoEspeci=false;
	public Boolean isVisibilidadCeldaEliminarProductoEspeci=false;
	public Boolean isVisibilidadCeldaCancelarProductoEspeci=false;
	public Boolean isVisibilidadCeldaGuardarProductoEspeci=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoEspeci=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProductoEspeci() {
		return this.iIdNuevoProductoEspeci;
	}

	public void setiIdNuevoProductoEspeci(Long iIdNuevoProductoEspeci) {
		this.iIdNuevoProductoEspeci = iIdNuevoProductoEspeci;
	}
	
	public Long getidProductoEspeciActual() {
		return this.idProductoEspeciActual;
	}

	public void setidProductoEspeciActual(Long idProductoEspeciActual) {
		this.idProductoEspeciActual = idProductoEspeciActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoEspeci getproductoespeci() {
		return this.productoespeci;
	}

	public void setproductoespeci(ProductoEspeci productoespeci) {
		this.productoespeci = productoespeci;
	}
	
	public ProductoEspeci getproductoespeciAux() {
		return this.productoespeciAux;
	}

	public void setproductoespeciAux(ProductoEspeci productoespeciAux) {
		this.productoespeciAux = productoespeciAux;
	}				
	
	public ProductoEspeci getproductoespeciAnterior() {
		return this.productoespeciAnterior;
	}

	public void setproductoespeciAnterior(ProductoEspeci productoespeciAnterior) {
		this.productoespeciAnterior = productoespeciAnterior;
	}	
	
	public ProductoEspeci getproductoespeciTotales() {
		return this.productoespeciTotales;
	}

	public void setproductoespeciTotales(ProductoEspeci productoespeciTotales) {
		this.productoespeciTotales = productoespeciTotales;
	}	
	
	public ProductoEspeci getproductoespeciBean() {
		return this.productoespeciBean;
	}

	public void setproductoespeciBean(ProductoEspeci productoespeciBean) {
		this.productoespeciBean = productoespeciBean;
	}	
	
	public ProductoEspeciParameterReturnGeneral getproductoespeciReturnGeneral() {
		return this.productoespeciReturnGeneral;
	}

	public void setproductoespeciReturnGeneral(ProductoEspeciParameterReturnGeneral productoespeciReturnGeneral) {
		this.productoespeciReturnGeneral = productoespeciReturnGeneral;
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
	
	
	public ProductoEspeciLogic getProductoEspeciLogic()	{		
		return productoespeciLogic;
	}

	public void setProductoEspeciLogic(ProductoEspeciLogic productoespeciLogic) {
		this.productoespeciLogic = productoespeciLogic;
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
	
	public Boolean getIsEsNuevoProductoEspeci() {
		return isEsNuevoProductoEspeci;
	}

	public void setIsEsNuevoProductoEspeci(Boolean isEsNuevoProductoEspeci) {
		this.isEsNuevoProductoEspeci = isEsNuevoProductoEspeci;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoEspeci() {
		return esParaAccionDesdeFormularioProductoEspeci;
	}
	
	public void setEsParaAccionDesdeFormularioProductoEspeci(Boolean esParaAccionDesdeFormularioProductoEspeci) {
		this.esParaAccionDesdeFormularioProductoEspeci = esParaAccionDesdeFormularioProductoEspeci;
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

			if(this.productoespeciSessionBean==null) {
				this.productoespeciSessionBean=new ProductoEspeciSessionBean();
			}

			if(!this.productoespeciSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productoespeciSessionBean.getlidEmpresaActual());
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

			if(this.productoespeciSessionBean==null) {
				this.productoespeciSessionBean=new ProductoEspeciSessionBean();
			}

			if(!this.productoespeciSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(productoespeciSessionBean.getlidSucursalActual());
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

			if(this.productoespeciSessionBean==null) {
				this.productoespeciSessionBean=new ProductoEspeciSessionBean();
			}

			if(!this.productoespeciSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(productoespeciSessionBean.getlidProductoActual());
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

					if(this.productoespeci!=null) {
						this.productoespeci.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
						this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_empresaProductoEspeci.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductoEspeci.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
						if(this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_empresaProductoEspeci.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_empresaProductoEspeci.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductoEspeciGenerico)throws Exception
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
				jComboBoxid_empresaProductoEspeciGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductoEspeciGenerico!=null && jComboBoxid_empresaProductoEspeciGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductoEspeciGenerico.setSelectedIndex(0);
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

					if(this.productoespeci!=null) {
						this.productoespeci.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
						this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_sucursalProductoEspeci.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProductoEspeci.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
						if(this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_sucursalProductoEspeci.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_sucursalProductoEspeci.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProductoEspeciGenerico)throws Exception
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
				jComboBoxid_sucursalProductoEspeciGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProductoEspeciGenerico!=null && jComboBoxid_sucursalProductoEspeciGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProductoEspeciGenerico.setSelectedIndex(0);
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

					if(this.productoespeci!=null) {
						this.productoespeci.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
						this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_productoProductoEspeci.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProductoEspeci.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
						if(this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_productoProductoEspeci.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_productoProductoEspeci.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoProductoEspeci!=null) {
						jComboBoxid_productoFK_IdProductoProductoEspeci.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoProductoEspeci!=null) {
							//jComboBoxid_productoFK_IdProductoProductoEspeci.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoProductoEspeci.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoProductoEspeci.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProductoEspeciGenerico)throws Exception
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
				jComboBoxid_productoProductoEspeciGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProductoEspeciGenerico!=null && jComboBoxid_productoProductoEspeciGenerico.getItemCount()>0) {
					jComboBoxid_productoProductoEspeciGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProductoEspeci productoespeci,JComboBox jComboBoxid_empresaProductoEspeciGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductoEspeciGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_empresaProductoEspeci.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductoEspeciGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productoespeci.setid_empresa(empresaAux.getId());
				productoespeci.setempresa_descripcion(ProductoEspeciConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productoespeci.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProductoEspeci productoespeci,JComboBox jComboBoxid_sucursalProductoEspeciGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProductoEspeciGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_sucursalProductoEspeci.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProductoEspeciGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				productoespeci.setid_sucursal(sucursalAux.getId());
				productoespeci.setsucursal_descripcion(ProductoEspeciConstantesFunciones.getSucursalDescripcion(sucursalAux));
				productoespeci.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProductoEspeci productoespeci,JComboBox jComboBoxid_productoProductoEspeciGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProductoEspeciGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_productoProductoEspeci.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProductoEspeciGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				productoespeci.setid_producto(productoAux.getId());
				productoespeci.setproducto_descripcion(ProductoEspeciConstantesFunciones.getProductoDescripcion(productoAux));
				productoespeci.setProducto(productoAux);			}
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

					if(!ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoEspeci!=null) { 
							this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_empresaProductoEspeci.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_empresaProductoEspeci.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoEspeci!=null) { 
					}

					if(!ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoEspeci!=null) { 
							this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_sucursalProductoEspeci.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_sucursalProductoEspeci.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoEspeci!=null) { 
					}

					if(!ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoEspeci!=null) { 
							this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_productoProductoEspeci.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_productoProductoEspeci.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoEspeci!=null) { 
					}

					if(!ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoEspeci.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoProductoEspeci.addItem(producto);
							}
						}

						if(!ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
							this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_empresaProductoEspeci.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
							this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_empresaProductoEspeci.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
							this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_sucursalProductoEspeci.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
							this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_sucursalProductoEspeci.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
							this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_productoProductoEspeci.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
							this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_productoProductoEspeci.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoProductoEspeci.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoEspeci.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoEspeci() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoEspeciConstantesFunciones.refrescarForeignKeysDescripcionesProductoEspeci(this.productoespeciLogic.getProductoEspecis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoEspeciConstantesFunciones.refrescarForeignKeysDescripcionesProductoEspeci(this.productoespecis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Producto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productoespeciLogic.setProductoEspecis(this.productoespecis);
			productoespeciLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoEspeciParameterReturnGeneral getProductoEspeciParameterGeneral() {
		return this.productoespeciParameterGeneral;
	}
	
	public void setProductoEspeciParameterGeneral(ProductoEspeciParameterReturnGeneral productoespeciParameterGeneral) {
		this.productoespeciParameterGeneral = productoespeciParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoEspeci() {
		return isPermisoTodoProductoEspeci;
	}

	public void setIsPermisoTodoProductoEspeci(Boolean isPermisoTodoProductoEspeci) {
		this.isPermisoTodoProductoEspeci = isPermisoTodoProductoEspeci;
	}

	public Boolean getIsPermisoNuevoProductoEspeci() {
		return isPermisoNuevoProductoEspeci;
	}

	public void setIsPermisoNuevoProductoEspeci(Boolean isPermisoNuevoProductoEspeci) {
		this.isPermisoNuevoProductoEspeci = isPermisoNuevoProductoEspeci;
	}

	public Boolean getIsPermisoActualizarProductoEspeci() {
		return isPermisoActualizarProductoEspeci;
	}

	public void setIsPermisoActualizarProductoEspeci(Boolean isPermisoActualizarProductoEspeci) {
		this.isPermisoActualizarProductoEspeci = isPermisoActualizarProductoEspeci;
	}

	public Boolean getIsPermisoEliminarProductoEspeci() {
		return isPermisoEliminarProductoEspeci;
	}

	public void setIsPermisoEliminarProductoEspeci(Boolean isPermisoEliminarProductoEspeci) {
		this.isPermisoEliminarProductoEspeci = isPermisoEliminarProductoEspeci;
	}

	public Boolean getIsPermisoGuardarCambiosProductoEspeci() {
		return isPermisoGuardarCambiosProductoEspeci;
	}

	public void setIsPermisoGuardarCambiosProductoEspeci(Boolean isPermisoGuardarCambiosProductoEspeci) {
		this.isPermisoGuardarCambiosProductoEspeci = isPermisoGuardarCambiosProductoEspeci;
	}
	
	public Boolean getIsPermisoConsultaProductoEspeci() {
		return isPermisoConsultaProductoEspeci;
	}

	public void setIsPermisoConsultaProductoEspeci(Boolean isPermisoConsultaProductoEspeci) {
		this.isPermisoConsultaProductoEspeci = isPermisoConsultaProductoEspeci;
	}

	public Boolean getIsPermisoBusquedaProductoEspeci() {
		return isPermisoBusquedaProductoEspeci;
	}

	public void setIsPermisoBusquedaProductoEspeci(Boolean isPermisoBusquedaProductoEspeci) {
		this.isPermisoBusquedaProductoEspeci = isPermisoBusquedaProductoEspeci;
	}

	public Boolean getIsPermisoReporteProductoEspeci() {
		return isPermisoReporteProductoEspeci;
	}

	public void setIsPermisoReporteProductoEspeci(Boolean isPermisoReporteProductoEspeci) {
		this.isPermisoReporteProductoEspeci = isPermisoReporteProductoEspeci;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoEspeci() {
		return isPermisoPaginacionMedioProductoEspeci;
	}

	public void setIsPermisoPaginacionMedioProductoEspeci(Boolean isPermisoPaginacionMedioProductoEspeci) {
		this.isPermisoPaginacionMedioProductoEspeci = isPermisoPaginacionMedioProductoEspeci;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoEspeci() {
		return isPermisoPaginacionTodoProductoEspeci;
	}

	public void setIsPermisoPaginacionTodoProductoEspeci(Boolean isPermisoPaginacionTodoProductoEspeci) {
		this.isPermisoPaginacionTodoProductoEspeci = isPermisoPaginacionTodoProductoEspeci;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoEspeci() {
		return isPermisoPaginacionAltoProductoEspeci;
	}

	public void setIsPermisoPaginacionAltoProductoEspeci(Boolean isPermisoPaginacionAltoProductoEspeci) {
		this.isPermisoPaginacionAltoProductoEspeci = isPermisoPaginacionAltoProductoEspeci;
	}
	
	public Boolean getIsPermisoCopiarProductoEspeci() {
		return isPermisoCopiarProductoEspeci;
	}

	public void setIsPermisoCopiarProductoEspeci(Boolean isPermisoCopiarProductoEspeci) {
		this.isPermisoCopiarProductoEspeci = isPermisoCopiarProductoEspeci;
	}
	
	public Boolean getIsPermisoVerFormProductoEspeci() {
		return isPermisoVerFormProductoEspeci;
	}

	public void setIsPermisoVerFormProductoEspeci(Boolean isPermisoVerFormProductoEspeci) {
		this.isPermisoVerFormProductoEspeci = isPermisoVerFormProductoEspeci;
	}
	
	public Boolean getIsPermisoDuplicarProductoEspeci() {
		return isPermisoDuplicarProductoEspeci;
	}

	public void setIsPermisoDuplicarProductoEspeci(Boolean isPermisoDuplicarProductoEspeci) {
		this.isPermisoDuplicarProductoEspeci = isPermisoDuplicarProductoEspeci;
	}
	
	public Boolean getIsPermisoOrdenProductoEspeci() {
		return isPermisoOrdenProductoEspeci;
	}

	public void setIsPermisoOrdenProductoEspeci(Boolean isPermisoOrdenProductoEspeci) {
		this.isPermisoOrdenProductoEspeci = isPermisoOrdenProductoEspeci;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoEspeci() {
		return isVisibilidadCeldaNuevoProductoEspeci;
	}

	public void setIsVisibilidadCeldaNuevoProductoEspeci(Boolean isVisibilidadCeldaNuevoProductoEspeci) {
		this.isVisibilidadCeldaNuevoProductoEspeci = isVisibilidadCeldaNuevoProductoEspeci;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoEspeci() {
		return isVisibilidadCeldaDuplicarProductoEspeci;
	}

	public void setIsVisibilidadCeldaDuplicarProductoEspeci(Boolean isVisibilidadCeldaDuplicarProductoEspeci) {
		this.isVisibilidadCeldaDuplicarProductoEspeci = isVisibilidadCeldaDuplicarProductoEspeci;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoEspeci() {
		return isVisibilidadCeldaCopiarProductoEspeci;
	}

	public void setIsVisibilidadCeldaCopiarProductoEspeci(Boolean isVisibilidadCeldaCopiarProductoEspeci) {
		this.isVisibilidadCeldaCopiarProductoEspeci = isVisibilidadCeldaCopiarProductoEspeci;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoEspeci() {
		return isVisibilidadCeldaVerFormProductoEspeci;
	}

	public void setIsVisibilidadCeldaVerFormProductoEspeci(Boolean isVisibilidadCeldaVerFormProductoEspeci) {
		this.isVisibilidadCeldaVerFormProductoEspeci = isVisibilidadCeldaVerFormProductoEspeci;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoEspeci() {
		return isVisibilidadCeldaOrdenProductoEspeci;
	}

	public void setIsVisibilidadCeldaOrdenProductoEspeci(Boolean isVisibilidadCeldaOrdenProductoEspeci) {
		this.isVisibilidadCeldaOrdenProductoEspeci = isVisibilidadCeldaOrdenProductoEspeci;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoEspeci() {
		return isVisibilidadCeldaNuevoRelacionesProductoEspeci;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoEspeci(Boolean isVisibilidadCeldaNuevoRelacionesProductoEspeci) {
		this.isVisibilidadCeldaNuevoRelacionesProductoEspeci = isVisibilidadCeldaNuevoRelacionesProductoEspeci;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoEspeci() {
		return isVisibilidadCeldaModificarProductoEspeci;
	}

	public void setIsVisibilidadCeldaModificarProductoEspeci(Boolean isVisibilidadCeldaModificarProductoEspeci) {
		this.isVisibilidadCeldaModificarProductoEspeci = isVisibilidadCeldaModificarProductoEspeci;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoEspeci() {
		return isVisibilidadCeldaActualizarProductoEspeci;
	}

	public void setIsVisibilidadCeldaActualizarProductoEspeci(Boolean isVisibilidadCeldaActualizarProductoEspeci) {
		this.isVisibilidadCeldaActualizarProductoEspeci = isVisibilidadCeldaActualizarProductoEspeci;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoEspeci() {
		return isVisibilidadCeldaEliminarProductoEspeci;
	}

	public void setIsVisibilidadCeldaEliminarProductoEspeci(Boolean isVisibilidadCeldaEliminarProductoEspeci) {
		this.isVisibilidadCeldaEliminarProductoEspeci = isVisibilidadCeldaEliminarProductoEspeci;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoEspeci() {
		return isVisibilidadCeldaCancelarProductoEspeci;
	}

	public void setIsVisibilidadCeldaCancelarProductoEspeci(Boolean isVisibilidadCeldaCancelarProductoEspeci) {
		this.isVisibilidadCeldaCancelarProductoEspeci = isVisibilidadCeldaCancelarProductoEspeci;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoEspeci() {
		return isVisibilidadCeldaGuardarProductoEspeci;
	}

	public void setIsVisibilidadCeldaGuardarProductoEspeci(Boolean isVisibilidadCeldaGuardarProductoEspeci) {
		this.isVisibilidadCeldaGuardarProductoEspeci = isVisibilidadCeldaGuardarProductoEspeci;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoEspeci() {
		return isVisibilidadCeldaGuardarCambiosProductoEspeci;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoEspeci(Boolean isVisibilidadCeldaGuardarCambiosProductoEspeci) {
		this.isVisibilidadCeldaGuardarCambiosProductoEspeci = isVisibilidadCeldaGuardarCambiosProductoEspeci;
	}
		
	public ProductoEspeciSessionBean getproductoespeciSessionBean() {
		return this.productoespeciSessionBean;
	}
	
	public void setproductoespeciSessionBean(ProductoEspeciSessionBean productoespeciSessionBean) {
		this.productoespeciSessionBean=productoespeciSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(ProductoEspeci productoespeci)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(productoespeci,null);
				this.setActualParaGuardarSucursalForeignKey(productoespeci,null);
				this.setActualParaGuardarProductoForeignKey(productoespeci,null);
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
	
	public void bugActualizarReferenciaActual(ProductoEspeci productoespeci,ProductoEspeci productoespeciAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoEspeci(productoespeci);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productoespeciAux.setId(productoespeci.getId());
		productoespeciAux.setVersionRow(productoespeci.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoEspeci();
		
			int intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoEspeci(this.productoespeci,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productoespeciValidator.getInvalidValues(this.productoespeci);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productoespeciLogic.setDatosCliente(datosCliente);
			productoespeciLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productoespeciAux=new  ProductoEspeci();
				
				productoespeciAux.setIsNew(true);
				productoespeciAux.setIsChanged(true);
				
				productoespeciAux.setProductoEspeciOriginal(this.productoespeci);
				
				productoespeciAux.setId(this.productoespeci.getId());	
				productoespeciAux.setVersionRow(this.productoespeci.getVersionRow());	
				productoespeciAux.setid_empresa(this.productoespeci.getid_empresa());	
				productoespeciAux.setid_sucursal(this.productoespeci.getid_sucursal());	
				productoespeciAux.setid_producto(this.productoespeci.getid_producto());	
				productoespeciAux.setespecificacion(this.productoespeci.getespecificacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoespeciSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoespeciSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productoespeciAux,productoespeciLogic.getProductoEspecis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoespeciAux,productoespecis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productoespeciSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoespeciSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoespeciLogic.saveProductoEspecis();//WithConnection
						//productoespeciLogic.getSetVersionRowProductoEspecis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoespeci,productoespeciAux);
					
					this.refrescarForeignKeysDescripcionesProductoEspeci();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoespeciSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoespeciLogic.saveProductoEspeciRelaciones(productoespeciAux);//WithConnection
								//productoespeciLogic.getSetVersionRowProductoEspecis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoespeci,productoespeciAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoespeciSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoespeciSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoespeciAux,productoespeciLogic.getProductoEspecis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoespeciAux,productoespecis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoespeci,productoespeciAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productoespeciAux=new  ProductoEspeci();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productoespeciSessionBean.getEsGuardarRelacionado() 
					|| (this.productoespeciSessionBean.getEsGuardarRelacionado() && this.productoespeci.getId()>=0)) {
						
					productoespeciAux.setIsNew(false);
				}
				
				productoespeciAux.setIsDeleted(false);
			
				productoespeciAux.setId(this.productoespeci.getId());	
				productoespeciAux.setVersionRow(this.productoespeci.getVersionRow());	
				productoespeciAux.setid_empresa(this.productoespeci.getid_empresa());	
				productoespeciAux.setid_sucursal(this.productoespeci.getid_sucursal());	
				productoespeciAux.setid_producto(this.productoespeci.getid_producto());	
				productoespeciAux.setespecificacion(this.productoespeci.getespecificacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoespeciAux,productoespeciLogic.getProductoEspecis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoespeciAux,productoespecis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productoespeciSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoespeciSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoespeciLogic.saveProductoEspecis();//WithConnection
						//productoespeciLogic.getSetVersionRowProductoEspecis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoespeci,productoespeciAux);
					
					this.refrescarForeignKeysDescripcionesProductoEspeci();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoespeciSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoespeciLogic.saveProductoEspeciRelaciones(productoespeciAux);//WithConnection
								//productoespeciLogic.getSetVersionRowProductoEspecis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoespeci,productoespeciAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoespeciSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoespeciSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoespeciAux,productoespeciLogic.getProductoEspecis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoespeciAux,productoespecis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoespeci,productoespeciAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productoespeciAux=new  ProductoEspeci();
				
				productoespeciAux.setIsNew(false);
				productoespeciAux.setIsChanged(false);
				
				productoespeciAux.setIsDeleted(true);
				
				productoespeciAux.setId(this.productoespeci.getId());	
				productoespeciAux.setVersionRow(this.productoespeci.getVersionRow());	
				productoespeciAux.setid_empresa(this.productoespeci.getid_empresa());	
				productoespeciAux.setid_sucursal(this.productoespeci.getid_sucursal());	
				productoespeciAux.setid_producto(this.productoespeci.getid_producto());	
				productoespeciAux.setespecificacion(this.productoespeci.getespecificacion());	
				
				if(this.productoespeciSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productoespeciAux.getId()>=0) {	
						this.productoespecisEliminados.add(productoespeciAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productoespeciAux,productoespeciLogic.getProductoEspecis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoespeciAux,productoespecis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productoespeciSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoespeciSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoespeciLogic.saveProductoEspecis();//WithConnection
						//productoespeciLogic.getSetVersionRowProductoEspecis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoespeciSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoespeciLogic.saveProductoEspeciRelaciones(productoespeciAux);//WithConnection
								//productoespeciLogic.getSetVersionRowProductoEspecis();//WithConnection
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
							if(this.productoespeciSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productoespeciSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productoespeciAux,productoespeciLogic.getProductoEspecis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productoespeciAux,productoespecis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.getProductoEspecis().addAll(this.productoespecisEliminados);
					
					productoespeciLogic.saveProductoEspecis();//WithConnection
					//productoespeciLogic.getSetVersionRowProductoEspecis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoEspeci();
				
				this.productoespecisEliminados= new ArrayList<ProductoEspeci>();		
			}
			
			if(this.productoespeciSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoespeciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Especificacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Especificacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productoespeci=productoespeciAux;
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
      		//this.finishProcessProductoEspeci();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoEspeci productoespeciLocal) throws Exception {
		
		if(this.productoespeciSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoEspeci productoespeciLocal) throws Exception {	
		if(this.productoespeciSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productoespeciLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				productoespeciLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				productoespeciLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoEspeciActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productoespeciValidator.getInvalidValues(this.productoespeci);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoEspeci productoespeci,List<ProductoEspeci> productoespecis) throws Exception {
		try	{		
			ProductoEspeciConstantesFunciones.actualizarLista(productoespeci,productoespecis,this.productoespeciSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoEspeci productoespeci,List<ProductoEspeci> productoespecis) throws Exception {
		try	{			
			ProductoEspeciConstantesFunciones.actualizarSelectedLista(productoespeci,productoespecis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoEspeci> productoespecisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productoespecisLocal=this.productoespeciLogic.getProductoEspecis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productoespecisLocal=this.productoespecis;
			}
			//ARCHITECTURE
		
			for(ProductoEspeci productoespeciLocal:productoespecisLocal) {
				if(this.permiteMantenimiento(productoespeciLocal) && productoespeciLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoEspeciConstantesFunciones.getProductoEspeciLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoEspeciConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoEspeci.jLabelid_empresaProductoEspeci,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoEspeciConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoEspeci.jLabelid_sucursalProductoEspeci,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoEspeciConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoEspeci.jLabelid_productoProductoEspeci,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoEspeciConstantesFunciones.ESPECIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoEspeci.jLabelespecificacionProductoEspeci,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoEspeci.jLabelid_empresaProductoEspeci,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoEspeci.jLabelid_sucursalProductoEspeci,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoEspeci.jLabelid_productoProductoEspeci,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoEspeci.jLabelespecificacionProductoEspeci,"");
		
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
		this.iIdNuevoProductoEspeci--;	
		
		
		this.productoespeciAux=new ProductoEspeci();
		
		this.productoespeciAux.setId(this.iIdNuevoProductoEspeci);
		this.productoespeciAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoespeciLogic.getProductoEspecis().add(this.productoespeciAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productoespecis.add(this.productoespeciAux);
		}
		//ARCHITECTURE
		
		this.productoespeci=this.productoespeciAux;
		
		if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoEspeci(this.productoespeci);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoEspeci(this.productoespeci);
		}
				
		//this.setDefaultControlesProductoEspeci();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoEspeci();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoEspeci();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoEspeci();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoEspeci(this.productoespeciBean,this.productoespeci,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoEspeciConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productoespeciSessionBean.getConGuardarRelaciones()) {
			classes=ProductoEspeciConstantesFunciones.getClassesRelationshipsOfProductoEspeci(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productoespeciReturnGeneral=productoespeciLogic.procesarEventosProductoEspecisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoespeciLogic.getProductoEspecis(),this.productoespeci,this.productoespeciParameterGeneral,this.isEsNuevoProductoEspeci,classes);//this.productoespeciLogic.getProductoEspeci()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoEspeci(this.productoespeciReturnGeneral,this.productoespeciBean,false);
		
		if(this.productoespeciReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoEspeci(this.productoespeciReturnGeneral.getProductoEspeci());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoEspeci(this.productoespeciReturnGeneral.getProductoEspeci());
		}
		
		if(this.productoespeciReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoEspeci(this.productoespeciReturnGeneral.getProductoEspeci(),classes);//this.productoespeciBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoEspeci(this.productoespeci,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoEspeci();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoEspeci();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoEspeciBeanSwingJInternalFrameAdditional.RecargarFormProductoEspeci(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoEspeci(false);
						
			if(productoespeciSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoEspeci();
			}
			
			this.actualizarVisualTableDatosProductoEspeci();
			
			this.jTableDatosProductoEspeci.setRowSelectionInterval(this.getIndiceNuevoProductoEspeci(), this.getIndiceNuevoProductoEspeci());
			
			this.seleccionarFilaTablaProductoEspeciActual();
						
			this.actualizarEstadoCeldasBotonesProductoEspeci("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoEspeci(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoEspeci.jTextAreaespecificacionProductoEspeci.setEnabled(isHabilitar && this.productoespeciConstantesFunciones.activarespecificacionProductoEspeci);	
		//
		this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_empresaProductoEspeci.setEnabled(isHabilitar && this.productoespeciConstantesFunciones.activarid_empresaProductoEspeci);//
		this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_sucursalProductoEspeci.setEnabled(isHabilitar && this.productoespeciConstantesFunciones.activarid_sucursalProductoEspeci);
		this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_productoProductoEspeci.setEnabled(isHabilitar && this.productoespeciConstantesFunciones.activarid_productoProductoEspeci);
	};
	
	public void setDefaultControlesProductoEspeci() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoEspeci(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productoespeciSessionBean.setConGuardarRelaciones(true);			
			this.productoespeciSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoEspeci.jTabbedPaneRelacionesProductoEspeci.setVisible(true);
			
					
		} else {
			//this.productoespeciSessionBean.setConGuardarRelaciones(false);			
			this.productoespeciSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoEspeci.jTabbedPaneRelacionesProductoEspeci.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoEspeci() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoEspeci productoespeciAux:this.productoespeciLogic.getProductoEspecis()) {
				if(productoespeciAux.getId().equals(this.iIdNuevoProductoEspeci)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoEspeci productoespeciAux:this.productoespecis) {
				if(productoespeciAux.getId().equals(this.iIdNuevoProductoEspeci)) {
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
	
	public int getIndiceActualProductoEspeci(ProductoEspeci productoespeci,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoEspeci productoespeciAux:this.productoespeciLogic.getProductoEspecis()) {
				if(productoespeciAux.getId().equals(productoespeci.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoEspeci productoespeciAux:this.productoespecis) {
				if(productoespeciAux.getId().equals(productoespeci.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoEspeci(ProductoEspeci productoespeciOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoEspeci productoespeciAux:this.productoespeciLogic.getProductoEspecis()) {
				if(productoespeciAux.getProductoEspeciOriginal().getId().equals(productoespeciOriginal.getId())) {
					existe=true;
					productoespeciOriginal.setId(productoespeciAux.getId());
					productoespeciOriginal.setVersionRow(productoespeciAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoEspeci productoespeciAux:this.productoespecis) {
				if(productoespeciAux.getProductoEspeciOriginal().getId().equals(productoespeciOriginal.getId())) {
					existe=true;
					productoespeciOriginal.setId(productoespeciAux.getId());
					productoespeciOriginal.setVersionRow(productoespeciAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoEspeci(Boolean esParaCancelar) throws Exception {
		productoespecisAux=new ArrayList<ProductoEspeci>();
		productoespeciAux=new ProductoEspeci();
		
		if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoEspeci productoespeciAux:this.productoespeciLogic.getProductoEspecis()) {
					if(productoespeciAux.getId()<0) {
						productoespecisAux.add(productoespeciAux);
					}		
				}
				this.iIdNuevoProductoEspeci=0L;
				this.productoespeciLogic.getProductoEspecis().removeAll(productoespecisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoEspeci productoespeciAux:this.productoespecis) {
					if(productoespeciAux.getId()<0) {
						productoespecisAux.add(productoespeciAux);
					}		
				}
				this.iIdNuevoProductoEspeci=0L;
				this.productoespecis.removeAll(productoespecisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoEspeci 
					&& this.productoespeciLogic.getProductoEspecis().size()>0
					) {
					productoespeciAux=this.productoespeciLogic.getProductoEspecis().get(this.productoespeciLogic.getProductoEspecis().size() - 1);
				
					if(productoespeciAux.getId()<0) {
						this.productoespeciLogic.getProductoEspecis().remove(productoespeciAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoEspeci && this.productoespecis.size()>0) {
					productoespeciAux=this.productoespecis.get(this.productoespecis.size() - 1);
				
					if(productoespeciAux.getId()<0) {
						this.productoespecis.remove(productoespeciAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoEspeci(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productoespeci.getId()<0) {
				this.productoespeciLogic.getProductoEspecis().remove(this.productoespeci);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productoespeci.getId()<0) {
				this.productoespecis.remove(this.productoespeci);
			}
		}			
	}
	
	public void setEstadosInicialesProductoEspeci(List<ProductoEspeci> productoespecisAux) throws Exception {
		ProductoEspeciConstantesFunciones.setEstadosInicialesProductoEspeci(productoespecisAux);
	}
	
	public void setEstadosInicialesProductoEspeci(ProductoEspeci productoespeciAux) throws Exception {
		ProductoEspeciConstantesFunciones.setEstadosInicialesProductoEspeci(productoespeciAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoEspeciActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoEspeci("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoEspeciActual()) {
				if(!this.isEsNuevoProductoEspeci) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoEspeci("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoEspeci=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoEspeciActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Especificacion ?", "MANTENIMIENTO DE Especificacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoEspeci("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoEspeci productoespeci) throws Exception {
		ProductoEspeciConstantesFunciones.seleccionarAsignar(this.productoespeci,productoespeci);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoEspeci=this.isPermisoActualizarOriginalProductoEspeci;
			
			
			this.seleccionarAsignar(productoespeci);
			
			

			idProductoActual=productoespeci.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoEspeciConstantesFunciones.quitarEspaciosProductoEspeci(this.productoespeci,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoEspeci("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productoespeciSessionBean.setsFuncionBusquedaRapida(this.productoespeciSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoProductoEspeci) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoEspeci(esParaCancelar);				
				this.cancelarNuevoProductoEspeci(esParaCancelar);								
			}
			
			this.productoespeci=new ProductoEspeci();
			
			this.inicializarProductoEspeci();
			
			this.actualizarEstadoCeldasBotonesProductoEspeci("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoEspeci() throws Exception {
		try {
			ProductoEspeciConstantesFunciones.inicializarProductoEspeci(this.productoespeci);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productoespeciLogic.getProductoEspecis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoEspecis(String sAccionBusqueda,List<ProductoEspeci> productoespecisParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoEspeci"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoEspeciMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoEspeciMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoEspeci"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Especificacions");		
		parameters.put("busquedapor", ProductoEspeciConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoEspeci=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoEspeciConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoEspeciConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoEspeci=new JRBeanArrayDataSource(ProductoEspeciJInternalFrame.TraerProductoEspeciBeans(productoespecisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoEspeci);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoEspeciConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoEspeciConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoEspeciBean.TraerProductoEspeciBeans(productoespecisParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoEspecis(sAccionBusqueda,sTipoArchivoReporte,productoespecisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoEspecis(sAccionBusqueda,sTipoArchivoReporte,productoespecisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoEspeciActionPerformed(null);
					//this.generarExcelReporteProductoEspecis(sAccionBusqueda,sTipoArchivoReporte,productoespecisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoEspecis(sAccionBusqueda,sTipoArchivoReporte,productoespecisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoEspecis(sAccionBusqueda,sTipoArchivoReporte,productoespecisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoEspecis(sAccionBusqueda,sTipoArchivoReporte,productoespecisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoEspecis(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoEspeci> productoespecisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoespeci";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoEspecis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoEspeci("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoEspeci productoespeci : productoespecisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoEspeciConstantesFunciones.generarExcelReporteDataProductoEspeci("NORMAL",row,workbook,productoespeci,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoespeciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especificacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoEspeci(String sTipo,Row row,Workbook workbook) {
		
		ProductoEspeciConstantesFunciones.generarExcelReporteHeaderProductoEspeci(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoEspecis(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoEspeci> productoespecisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoespeci_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoEspecis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoEspeci productoespeci : productoespecisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoEspeciConstantesFunciones.getProductoEspeciDescripcion(productoespeci));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoEspeciConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoEspeciConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoespeci.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoEspeciConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoEspeciConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoespeci.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoespeci.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoespeci.getespecificacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoespeciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especificacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoEspecis(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoEspeci> productoespecisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoEspeci> productoespecisRespaldo=null;
		
		classes=ProductoEspeciConstantesFunciones.getClassesRelationshipsOfProductoEspeci(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productoespeciLogic.setDatosCliente(this.datosCliente);
		this.productoespeciLogic.setDatosDeep(this.datosDeep);
		this.productoespeciLogic.setIsConDeep(true);
		
		productoespecisRespaldo=this.productoespeciLogic.getProductoEspecis();
		
		this.productoespeciLogic.setProductoEspecis(productoespecisParaReportes);	
		this.productoespeciLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productoespecisParaReportes=this.productoespeciLogic.getProductoEspecis();
		this.productoespeciLogic.setProductoEspecis(productoespecisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoespeci_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoEspecis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoEspeci("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoEspeci productoespeci : productoespecisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoEspeci("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoEspeciConstantesFunciones.generarExcelReporteDataProductoEspeci("NORMAL",row,workbook,productoespeci,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoEspeciConstantesFunciones.getProductoEspeciDescripcion(productoespeci));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoespeciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especificacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoEspeci.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoEspeci.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoEspeci.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoEspeci.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoEspeci() throws Exception {		
		this.startProcessProductoEspeci(true);
	}
	
	public void startProcessProductoEspeci(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoEspeci ,this.jPanelParametrosReportesProductoEspeci, this.jScrollPanelDatosProductoEspeci,this.jPanelPaginacionProductoEspeci, this.jScrollPanelDatosEdicionProductoEspeci, this.jPanelAccionesProductoEspeci,this.jPanelAccionesFormularioProductoEspeci,this.jmenuBarProductoEspeci,this.jmenuBarDetalleProductoEspeci,this.jTtoolBarProductoEspeci,this.jTtoolBarDetalleProductoEspeci);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoEspeci=this.jTabbedPaneBusquedasProductoEspeci; 
		
		final JPanel jPanelParametrosReportesProductoEspeci=this.jPanelParametrosReportesProductoEspeci;
		//final JScrollPane jScrollPanelDatosProductoEspeci=this.jScrollPanelDatosProductoEspeci;
		final JTable jTableDatosProductoEspeci=this.jTableDatosProductoEspeci;		
		final JPanel jPanelPaginacionProductoEspeci=this.jPanelPaginacionProductoEspeci;
		//final JScrollPane jScrollPanelDatosEdicionProductoEspeci=this.jScrollPanelDatosEdicionProductoEspeci;
		final JPanel jPanelAccionesProductoEspeci=this.jPanelAccionesProductoEspeci;
		
		JPanel jPanelCamposAuxiliarProductoEspeci=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoEspeci=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
			jPanelCamposAuxiliarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jPanelCamposProductoEspeci;
			jPanelAccionesFormularioAuxiliarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jPanelAccionesFormularioProductoEspeci;
		}
		
		final JPanel jPanelCamposProductoEspeci=jPanelCamposAuxiliarProductoEspeci;
		final JPanel jPanelAccionesFormularioProductoEspeci=jPanelAccionesFormularioAuxiliarProductoEspeci;
		
		
		final JMenuBar jmenuBarProductoEspeci=this.jmenuBarProductoEspeci;
		final JToolBar jTtoolBarProductoEspeci=this.jTtoolBarProductoEspeci;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoEspeci=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoEspeci=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
			jmenuBarDetalleAuxiliarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jmenuBarDetalleProductoEspeci;
			jTtoolBarDetalleAuxiliarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jTtoolBarDetalleProductoEspeci;
		}
		
		final JMenuBar jmenuBarDetalleProductoEspeci=jmenuBarDetalleAuxiliarProductoEspeci;
		final JToolBar jTtoolBarDetalleProductoEspeci=jTtoolBarDetalleAuxiliarProductoEspeci;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoEspeci;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoEspeci;
			processRunnable.jTableDatos=jTableDatosProductoEspeci;
			processRunnable.jPanelCampos=jPanelCamposProductoEspeci;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoEspeci;
			processRunnable.jPanelAcciones=jPanelAccionesProductoEspeci;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoEspeci;
			
			
			processRunnable.jmenuBar=jmenuBarProductoEspeci;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoEspeci;
			processRunnable.jTtoolBar=jTtoolBarProductoEspeci;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoEspeci;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoEspeci ,jPanelParametrosReportesProductoEspeci,jTableDatosProductoEspeci, /*jScrollPanelDatosProductoEspeci,*/jPanelCamposProductoEspeci,jPanelPaginacionProductoEspeci, /*jScrollPanelDatosEdicionProductoEspeci,*/ jPanelAccionesProductoEspeci,jPanelAccionesFormularioProductoEspeci,jmenuBarProductoEspeci,jmenuBarDetalleProductoEspeci,jTtoolBarProductoEspeci,jTtoolBarDetalleProductoEspeci);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoEspeci ,jPanelParametrosReportesProductoEspeci, jScrollPanelDatosProductoEspeci,jPanelPaginacionProductoEspeci, jScrollPanelDatosEdicionProductoEspeci, jPanelAccionesProductoEspeci,jPanelAccionesFormularioProductoEspeci,jmenuBarProductoEspeci,jmenuBarDetalleProductoEspeci,jTtoolBarProductoEspeci,jTtoolBarDetalleProductoEspeci);
						
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
	
	public void finishProcessProductoEspeci() {// throws Exception 
		this.finishProcessProductoEspeci(true);
	}
	
	public void finishProcessProductoEspeci(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoEspeci ,this.jPanelParametrosReportesProductoEspeci, this.jScrollPanelDatosProductoEspeci,this.jPanelPaginacionProductoEspeci, this.jScrollPanelDatosEdicionProductoEspeci, this.jPanelAccionesProductoEspeci,this.jPanelAccionesFormularioProductoEspeci,this.jmenuBarProductoEspeci,this.jmenuBarDetalleProductoEspeci,this.jTtoolBarProductoEspeci,this.jTtoolBarDetalleProductoEspeci);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoEspeci=this.jTabbedPaneBusquedasProductoEspeci; 
		
		final JPanel jPanelParametrosReportesProductoEspeci=this.jPanelParametrosReportesProductoEspeci;
		//final JScrollPane jScrollPanelDatosProductoEspeci=this.jScrollPanelDatosProductoEspeci;
		final JTable jTableDatosProductoEspeci=this.jTableDatosProductoEspeci;		
		final JPanel jPanelPaginacionProductoEspeci=this.jPanelPaginacionProductoEspeci;
		//final JScrollPane jScrollPanelDatosEdicionProductoEspeci=this.jScrollPanelDatosEdicionProductoEspeci;
		final JPanel jPanelAccionesProductoEspeci=this.jPanelAccionesProductoEspeci;
		
		JPanel jPanelCamposAuxiliarProductoEspeci=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoEspeci=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
			jPanelCamposAuxiliarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jPanelCamposProductoEspeci;
			jPanelAccionesFormularioAuxiliarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jPanelAccionesFormularioProductoEspeci;
		}
		
		final JPanel jPanelCamposProductoEspeci=jPanelCamposAuxiliarProductoEspeci;
		final JPanel jPanelAccionesFormularioProductoEspeci=jPanelAccionesFormularioAuxiliarProductoEspeci;
		
		
		final JMenuBar jmenuBarProductoEspeci=this.jmenuBarProductoEspeci;		
		final JToolBar jTtoolBarProductoEspeci=this.jTtoolBarProductoEspeci;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoEspeci=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoEspeci=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
			jmenuBarDetalleAuxiliarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jmenuBarDetalleProductoEspeci;
			jTtoolBarDetalleAuxiliarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jTtoolBarDetalleProductoEspeci;		
		}
		
		final JMenuBar jmenuBarDetalleProductoEspeci=jmenuBarDetalleAuxiliarProductoEspeci;
		final JToolBar jTtoolBarDetalleProductoEspeci=jTtoolBarDetalleAuxiliarProductoEspeci;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoEspeci;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoEspeci;
			processRunnable.jTableDatos=jTableDatosProductoEspeci;
			processRunnable.jPanelCampos=jPanelCamposProductoEspeci;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoEspeci;
			processRunnable.jPanelAcciones=jPanelAccionesProductoEspeci;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoEspeci;
			
			
			processRunnable.jmenuBar=jmenuBarProductoEspeci;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoEspeci;
			processRunnable.jTtoolBar=jTtoolBarProductoEspeci;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoEspeci;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoEspeci ,jPanelParametrosReportesProductoEspeci, jTableDatosProductoEspeci,/*jScrollPanelDatosProductoEspeci,*/jPanelCamposProductoEspeci,jPanelPaginacionProductoEspeci, /*jScrollPanelDatosEdicionProductoEspeci,*/ jPanelAccionesProductoEspeci,jPanelAccionesFormularioProductoEspeci,jmenuBarProductoEspeci,jmenuBarDetalleProductoEspeci,jTtoolBarProductoEspeci,jTtoolBarDetalleProductoEspeci));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoEspeci(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoEspeci(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoEspeci(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoEspeci(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoEspeci,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoEspeci,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoEspeci(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoEspeci,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoEspeci,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productoespeciConstantesFunciones.getsFinalQueryProductoEspeci();
		String  finalQueryPaginacionTodos=this.productoespeciConstantesFunciones.getsFinalQueryProductoEspeci();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoEspeciConstantesFunciones.getArrayColumnasGlobalesNoProductoEspeci(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoEspeciConstantesFunciones.getArrayColumnasGlobalesProductoEspeci(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoEspeciConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productoespecisEliminados= new ArrayList<ProductoEspeci>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoEspeci();
		
				///*ProductoEspeciSessionBean*/this.productoespeciSessionBean=new ProductoEspeciSessionBean();
			
			if(this.productoespeciSessionBean==null) {
				this.productoespeciSessionBean=new ProductoEspeciSessionBean();
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
					this.iNumeroPaginacion=ProductoEspeciConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoEspeciConstantesFunciones.getClassesForeignKeysOfProductoEspeci(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productoespeci."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productoespecisAux= new ArrayList<ProductoEspeci>();
			
				
			productoespeciLogic.setDatosCliente(this.datosCliente);
			productoespeciLogic.setDatosDeep(this.datosDeep);
			productoespeciLogic.setIsConDeep(true);
			
			
			productoespeciLogic.getProductoEspeciDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productoespeciLogic.getTodosProductoEspecis(finalQueryGlobal,pagination);
					
					//productoespeciLogic.getTodosProductoEspecisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productoespeciLogic.getProductoEspecis()==null|| productoespeciLogic.getProductoEspecis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoespecisAux= new ArrayList<ProductoEspeci>();
							productoespecisAux.addAll(productoespeciLogic.getProductoEspecis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoespecisAux= new ArrayList<ProductoEspeci>();
							productoespecisAux.addAll(productoespecis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoespeciLogic.getTodosProductoEspecis(finalQueryGlobal+"",this.pagination);												
							
							//productoespeciLogic.getTodosProductoEspecisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoEspecis("Todos",productoespeciLogic.getProductoEspecis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoespeciLogic.setProductoEspecis(new ArrayList<ProductoEspeci>());					
							productoespeciLogic.getProductoEspecis().addAll(productoespecisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoespecis=new ArrayList<ProductoEspeci>();
							productoespecis.addAll(productoespecisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoEspeci=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoEspeci=this.idActual;
				
				} else if(this.idProductoEspeciActual!=null && this.idProductoEspeciActual!=0L) {
					idProductoEspeci=idProductoEspeciActual;
				}
				
					
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndicePorId(idProductoEspeci);
				
				this.productoespecis=new ArrayList<ProductoEspeci>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productoespeciLogic.getEntity(idProductoEspeci);
					
					//productoespeciLogic.getEntityWithConnection(idProductoEspeci);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoespeciLogic.setProductoEspecis(new ArrayList<ProductoEspeci>());
					productoespeciLogic.getProductoEspecis().add(productoespeciLogic.getProductoEspeci());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoespecis=new ArrayList<ProductoEspeci>();
					this.productoespecis.add(productoespeci);
				}
				
				if(productoespeciLogic.getProductoEspeci()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoespeciLogic.getProductoEspecisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoespeciLogic.getProductoEspecis()==null||productoespeciLogic.getProductoEspecis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoespecis==null|| productoespecis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoespecisAux=new ArrayList<ProductoEspeci>();
						productoespecisAux.addAll(productoespeciLogic.getProductoEspecis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoespecisAux=new ArrayList<ProductoEspeci>();
							productoespecisAux.addAll(productoespecis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoespeciLogic.getProductoEspecisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoEspecis("FK_IdEmpresa",productoespeciLogic.getProductoEspecis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoEspecis("FK_IdEmpresa",productoespecis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoespeciLogic.setProductoEspecis(new ArrayList<ProductoEspeci>());
						productoespeciLogic.getProductoEspecis().addAll(productoespecisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoespecis=new ArrayList<ProductoEspeci>();
							productoespecis.addAll(productoespecisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoespeciLogic.getProductoEspecisFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoespeciLogic.getProductoEspecis()==null||productoespeciLogic.getProductoEspecis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoespecis==null|| productoespecis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoespecisAux=new ArrayList<ProductoEspeci>();
						productoespecisAux.addAll(productoespeciLogic.getProductoEspecis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoespecisAux=new ArrayList<ProductoEspeci>();
							productoespecisAux.addAll(productoespecis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoespeciLogic.getProductoEspecisFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoEspecis("FK_IdProducto",productoespeciLogic.getProductoEspecis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoEspecis("FK_IdProducto",productoespecis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoespeciLogic.setProductoEspecis(new ArrayList<ProductoEspeci>());
						productoespeciLogic.getProductoEspecis().addAll(productoespecisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoespecis=new ArrayList<ProductoEspeci>();
							productoespecis.addAll(productoespecisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoespeciLogic.getProductoEspecisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoespeciLogic.getProductoEspecis()==null||productoespeciLogic.getProductoEspecis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoespecis==null|| productoespecis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoespecisAux=new ArrayList<ProductoEspeci>();
						productoespecisAux.addAll(productoespeciLogic.getProductoEspecis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoespecisAux=new ArrayList<ProductoEspeci>();
							productoespecisAux.addAll(productoespecis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoespeciLogic.getProductoEspecisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoEspeciConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoEspecis("FK_IdSucursal",productoespeciLogic.getProductoEspecis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoEspecis("FK_IdSucursal",productoespecis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoespeciLogic.setProductoEspecis(new ArrayList<ProductoEspeci>());
						productoespeciLogic.getProductoEspecis().addAll(productoespecisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoespecis=new ArrayList<ProductoEspeci>();
							productoespecis.addAll(productoespecisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoEspeci();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoEspeci();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoespeciLogic.getProductoEspecis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoespecis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoespeciLogic.getProductoEspecis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoespecis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoEspeci productoespeci) {
		Boolean permite=true;
		
		if(this.productoespeci.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoEspeciConstantesFunciones.getOrderByListaProductoEspeci();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoEspeciConstantesFunciones.getOrderByListaProductoEspeci();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoEspeci productoespeci:productoespeciLogic.getProductoEspecis()) {
				if(productoespeci.getsType().equals(Constantes2.S_TOTALES)) {
					productoespeciTotales=productoespeci;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoEspeci productoespeci:this.productoespecis) {
				if(productoespeci.getsType().equals(Constantes2.S_TOTALES)) {
					productoespeciTotales=productoespeci;
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
			this.productoespeciAux=new ProductoEspeci();
			this.productoespeciAux.setsType(Constantes2.S_TOTALES);
			this.productoespeciAux.setIsNew(false);
			this.productoespeciAux.setIsChanged(false);
			this.productoespeciAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoEspeciConstantesFunciones.TotalizarValoresFilaProductoEspeci(this.productoespeciLogic.getProductoEspecis(),this.productoespeciAux);
				
				this.productoespeciLogic.getProductoEspecis().add(this.productoespeciAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoEspeciConstantesFunciones.TotalizarValoresFilaProductoEspeci(this.productoespecis,this.productoespeciAux);
				
				this.productoespecis.add(this.productoespeciAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productoespeciTotales=new ProductoEspeci();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoespeciLogic.getProductoEspecis().remove(productoespeciTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoespecis.remove(productoespeciTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productoespeciTotales=new ProductoEspeci();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoEspeci productoespeci:productoespeciLogic.getProductoEspecis()) {
				if(productoespeci.getsType().equals(Constantes2.S_TOTALES)) {
					productoespeciTotales=productoespeci;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoEspeciConstantesFunciones.TotalizarValoresFilaProductoEspeci(this.productoespeciLogic.getProductoEspecis(),productoespeciTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoEspeci productoespeci:this.productoespecis) {
				if(productoespeci.getsType().equals(Constantes2.S_TOTALES)) {
					productoespeciTotales=productoespeci;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoEspeciConstantesFunciones.TotalizarValoresFilaProductoEspeci(this.productoespecis,productoespeciTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoEspecisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoEspecisFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoEspecisFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoEspecisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoespeciLogic.getProductoEspecisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoEspecisFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoespeciLogic.getProductoEspecisFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoEspecisFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoespeciLogic.getProductoEspecisFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProductoEspeci() {
		this.isPermisoTodoProductoEspeci=false;
		this.isPermisoNuevoProductoEspeci=false;
		this.isPermisoActualizarProductoEspeci=false;
		this.isPermisoActualizarOriginalProductoEspeci=false;
		this.isPermisoEliminarProductoEspeci=false;
		this.isPermisoGuardarCambiosProductoEspeci=false;
		this.isPermisoConsultaProductoEspeci=false;
		this.isPermisoBusquedaProductoEspeci=false;
		this.isPermisoReporteProductoEspeci=false;		
		this.isPermisoOrdenProductoEspeci=false;		
		this.isPermisoPaginacionMedioProductoEspeci=false;		
		this.isPermisoPaginacionAltoProductoEspeci=false;
		this.isPermisoPaginacionTodoProductoEspeci=false;
		this.isPermisoCopiarProductoEspeci=false;		
		this.isPermisoVerFormProductoEspeci=false;		
		this.isPermisoDuplicarProductoEspeci=false;		
		this.isPermisoOrdenProductoEspeci=false;		
	}
	
	public void setPermisosUsuarioProductoEspeci(Boolean isPermiso) {
		this.isPermisoTodoProductoEspeci=isPermiso;
		this.isPermisoNuevoProductoEspeci=isPermiso;
		this.isPermisoActualizarProductoEspeci=isPermiso;
		this.isPermisoActualizarOriginalProductoEspeci=isPermiso;
		this.isPermisoEliminarProductoEspeci=isPermiso;
		this.isPermisoGuardarCambiosProductoEspeci=isPermiso;
		this.isPermisoConsultaProductoEspeci=isPermiso;
		this.isPermisoBusquedaProductoEspeci=isPermiso;
		this.isPermisoReporteProductoEspeci=isPermiso;
		this.isPermisoOrdenProductoEspeci=isPermiso;		
		this.isPermisoPaginacionMedioProductoEspeci=isPermiso;		
		this.isPermisoPaginacionAltoProductoEspeci=isPermiso;		
		this.isPermisoPaginacionTodoProductoEspeci=isPermiso;		
		this.isPermisoCopiarProductoEspeci=isPermiso;		
		this.isPermisoVerFormProductoEspeci=isPermiso;		
		this.isPermisoDuplicarProductoEspeci=isPermiso;
		this.isPermisoOrdenProductoEspeci=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoEspeci(Boolean isPermiso) {
		//this.isPermisoTodoProductoEspeci=isPermiso;
		this.isPermisoNuevoProductoEspeci=isPermiso;
		this.isPermisoActualizarProductoEspeci=isPermiso;
		this.isPermisoActualizarOriginalProductoEspeci=isPermiso;
		this.isPermisoEliminarProductoEspeci=isPermiso;
		this.isPermisoGuardarCambiosProductoEspeci=isPermiso;
		//this.isPermisoConsultaProductoEspeci=isPermiso;
		//this.isPermisoBusquedaProductoEspeci=isPermiso;
		//this.isPermisoReporteProductoEspeci=isPermiso;
		//this.isPermisoOrdenProductoEspeci=isPermiso;		
		//this.isPermisoPaginacionMedioProductoEspeci=isPermiso;		
		//this.isPermisoPaginacionAltoProductoEspeci=isPermiso;		
		//this.isPermisoPaginacionTodoProductoEspeci=isPermiso;		
		//this.isPermisoCopiarProductoEspeci=isPermiso;		
		//this.isPermisoDuplicarProductoEspeci=isPermiso;
		//this.isPermisoOrdenProductoEspeci=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoEspeciClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoEspeciJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoEspeci(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoEspeciClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoEspeciClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoEspeciClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoEspeciClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoEspeci() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoEspeciJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productoespeciSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoEspeciConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoEspeci=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoEspeci=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoEspeci=this.isPermisoActualizarProductoEspeci;
			this.isPermisoEliminarProductoEspeci=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoEspeci=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoEspeci=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoEspeci=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoEspeci=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoEspeci=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoEspeci=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoEspeci=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoEspeci=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoEspeci=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoEspeci=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoEspeci=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoEspeci=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoEspeci=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productoespeciSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoEspeci.setToolTipText(this.jTableDatosProductoEspeci.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoEspeci(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoEspeci(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoEspeciJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoEspeciJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoEspeci() throws Exception {
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
	public void inicializarCombosForeignKeyProductoEspeciListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoEspeciListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoEspeciJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoEspeciListas(false);
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
	
	public void cargarCombosLoteForeignKeyProductoEspeciListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoEspeciParameterReturnGeneral productoespeciReturnGeneral=new ProductoEspeciParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.productoespeciConstantesFunciones.cargarid_empresaProductoEspeci)
					 || (this.esRecargarFks && this.productoespeciConstantesFunciones.cargarid_empresaProductoEspeci)) {

					if(!this.productoespeciSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+productoespeciSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.productoespeciConstantesFunciones.cargarid_sucursalProductoEspeci)
					 || (this.esRecargarFks && this.productoespeciConstantesFunciones.cargarid_sucursalProductoEspeci)) {

					if(!this.productoespeciSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+productoespeciSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.productoespeciConstantesFunciones.cargarid_productoProductoEspeci)
					 || (this.esRecargarFks && this.productoespeciConstantesFunciones.cargarid_productoProductoEspeci)) {

					if(!this.productoespeciSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+productoespeciSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productoespeciReturnGeneral=productoespeciLogic.cargarCombosLoteForeignKeyProductoEspeci(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalProducto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=productoespeciReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=productoespeciReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=productoespeciReturnGeneral.getproductosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoEspeci()throws Exception {
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
			if(this.productoespeciSessionBean==null) {
				this.productoespeciSessionBean=new ProductoEspeciSessionBean();
			}

			if(!this.productoespeciSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.productoespeciSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.productoespeciSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
	
	public void initActionsCombosTodosForeignKeyProductoEspeci()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoEspeci(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductoEspeci()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoEspeci();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoEspeci(ProductoEspeci productoespeci)throws Exception {	
		try {
			
			this.setActualProductoForeignKey(productoespeci.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoEspeci(ProductoEspeci productoespeci,String sTipoEvento)throws Exception {	
		try {
			
			

				if(productoespeci.getProducto()!=null && !sTipoEvento.equals("id_productoProductoEspeci")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(productoespeci.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoEspeci()throws Exception {	
		try {
			
			this.setActualProductoForeignKey(this.productoespeciConstantesFunciones.getid_producto(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoEspeci()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoEspeci()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoEspeci()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoEspeci()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoEspeci()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoEspeci(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoEspeci()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_empresaProductoEspeci!=null && this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_empresaProductoEspeci.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_empresaProductoEspeci.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_sucursalProductoEspeci!=null && this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_sucursalProductoEspeci.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_sucursalProductoEspeci.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_productoProductoEspeci!=null && this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_productoProductoEspeci.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_productoProductoEspeci.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ProductoEspeciBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoEspeciBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoEspeciBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productoespeciSessionBean=new ProductoEspeciSessionBean(); 
		this.productoespeciConstantesFunciones=new ProductoEspeciConstantesFunciones(); 
		this.productoespeciBean=new ProductoEspeci();//(this.productoespeciConstantesFunciones); 		
		this.productoespeciReturnGeneral=new ProductoEspeciParameterReturnGeneral(); 
		
		this.productoespeciSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoespeciSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoEspeciBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoEspeciBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoEspeciBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoEspeci(true);
			
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
			
			this.productoespeciConstantesFunciones=new ProductoEspeciConstantesFunciones(); 
			this.productoespeciBean=new ProductoEspeci();//this.productoespeciConstantesFunciones); 			
			this.productoespeciReturnGeneral=new ProductoEspeciParameterReturnGeneral(); 
		
			ProductoEspeciBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Especificacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.productoespeci=new ProductoEspeci();
			this.productoespecis = new ArrayList<ProductoEspeci>();
			this.productoespecisAux = new ArrayList<ProductoEspeci>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic=new ProductoEspeciLogic();
				this.productoespeciLogic.getNewConnexionToDeep("");
			}
			
			//this.productoespeciSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productoespeciSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoEspeci);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoEspeci!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoEspeci);	
					}
					
					if(this.jInternalFrameImportacionProductoEspeci!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoEspeci);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoEspeci!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoEspeci);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoEspeci);
				this.jInternalFrameDetalleFormProductoEspeci.setVisible(false);
				this.jInternalFrameDetalleFormProductoEspeci.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoEspeci!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoEspeci);
					this.jInternalFrameReporteDinamicoProductoEspeci.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoEspeci.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoEspeci!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoEspeci);
					this.jInternalFrameImportacionProductoEspeci.setVisible(false);
					this.jInternalFrameImportacionProductoEspeci.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoEspeci!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoEspeci);
					this.jInternalFrameOrderByProductoEspeci.setVisible(false);
					this.jInternalFrameOrderByProductoEspeci.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoEspeciActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoEspeciConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productoespeciReturnGeneral=new ProductoEspeciParameterReturnGeneral();
			
			this.productoespeciParameterGeneral=new ProductoEspeciParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productoespeciLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoEspeciJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productoespeciSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoEspeciConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoespeciSessionBean.getEsGuardarRelacionado(),this.productoespeciSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoEspeciConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoespeciSessionBean.getEsGuardarRelacionado(),this.productoespeciSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoEspeci=false;
			this.isVisibilidadCeldaDuplicarProductoEspeci=true;
			this.isVisibilidadCeldaCopiarProductoEspeci=true;
			this.isVisibilidadCeldaVerFormProductoEspeci=true;
			this.isVisibilidadCeldaOrdenProductoEspeci=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoEspeci=false;
			this.isVisibilidadCeldaModificarProductoEspeci=false;
			this.isVisibilidadCeldaActualizarProductoEspeci=false;
			this.isVisibilidadCeldaEliminarProductoEspeci=false;
			this.isVisibilidadCeldaCancelarProductoEspeci=false;
			this.isVisibilidadCeldaGuardarProductoEspeci=false;
			this.isVisibilidadCeldaGuardarCambiosProductoEspeci=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoEspeci("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoEspeci();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoEspeci(false);
			
			this.setPermisosUsuarioProductoEspeci();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoespeciSessionBean.getEsGuardarRelacionado() 
				|| (this.productoespeciSessionBean.getEsGuardarRelacionado() && this.productoespeciSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoEspeciClasesRelacionadas();
			}
			
			if(this.productoespeciSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoEspeciClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoEspeci();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoEspeci();
			}
			
			if(!this.isPermisoBusquedaProductoEspeci) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoEspeci.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoEspeci,this.isPermisoPaginacionMedioProductoEspeci,this.isPermisoPaginacionTodoProductoEspeci);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoEspeciConstantesFunciones.getTiposSeleccionarProductoEspeci());
				
				this.tiposColumnasSelect=ProductoEspeciConstantesFunciones.getTiposSeleccionarProductoEspeci(true);
				
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
			//if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoEspeci();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioProductoEspeci(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioProductoEspeci(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoEspeci() ;
			
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
				productoespeciImplementable= (ProductoEspeciImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoEspeciConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productoespeciImplementableHome= (ProductoEspeciImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoEspeciConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productoespecis= new ArrayList<ProductoEspeci>();
			this.productoespecisEliminados= new ArrayList<ProductoEspeci>();
						
			this.isEsNuevoProductoEspeci=false;
			this.esParaAccionDesdeFormularioProductoEspeci=false;
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
				this.cargarCombosForeignKeyProductoEspeci(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoEspeci();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoEspeciBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoEspeciConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoEspeci("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoEspeci(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoEspeci!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoEspeci();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoEspeci();
			}
			
			ProductoEspeciBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoEspeci.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoEspeci.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoEspeci.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoEspeci(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoEspeci: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoEspeci() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoEspeci")) {
				iIndex=this.jInternalFrameDetalleFormProductoEspeci.jTabbedPaneRelacionesProductoEspeci.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoEspeci.jTabbedPaneRelacionesProductoEspeci.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoEspeci();	
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
	
	public void cargarCombosForeignKeyProductoEspeci(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoEspeci(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoEspeci(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoEspeciListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoEspeci();
		
		this.cargarCombosFrameForeignKeyProductoEspeci();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoEspeci();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoEspeci();
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
	
	public void jButtonNuevoProductoEspeciActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productoespeciSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoEspeci==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			
			
			if(jTableDatosProductoEspeci.getRowCount()>=1) {
				jTableDatosProductoEspeci.removeRowSelectionInterval(0, jTableDatosProductoEspeci.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoEspeci=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoEspeci(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoEspeci(true);			
			//this.productoespeci=new ProductoEspeci();
			//this.productoespeci.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoEspeci(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoEspeci() ;
			
			if(ProductoEspeciJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoEspeci(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productoespeci);	
			this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);				
			
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			
			if(this.productoespeciSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoEspeci: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoEspeciActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoEspeci> productoespecisSeleccionados=new ArrayList<ProductoEspeci>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoEspeci.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoEspeci.getSelectedRows().length;			
			}
			
			productoespecisSeleccionados=this.getProductoEspecisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoEspeci--;			
				//ProductoEspeci productoespeciAux= new ProductoEspeci();			
				//productoespeciAux.setId(this.iIdNuevoProductoEspeci);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoEspeci productoespeciOrigen=new ProductoEspeci();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoEspeci productoespeciOrigen : productoespecisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productoespeciOrigen =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoespeciOrigen =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoEspeci();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productoespeci.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoEspeci(productoespeciOrigen,this.productoespeci,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoespeciLogic.getProductoEspecis().add(this.productoespeciAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoespecis.add(this.productoespeciAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoEspeci(false);
				
				this.jTableDatosProductoEspeci.setRowSelectionInterval(this.getIndiceNuevoProductoEspeci(), this.getIndiceNuevoProductoEspeci());
				
				int iLastRow =  this.jTableDatosProductoEspeci.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoEspeci.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoEspeci.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoEspeci(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoEspeciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoEspeci> productoespecisSeleccionados=new ArrayList<ProductoEspeci>();									
		
			ProductoEspeci productoespeciOrigen=new ProductoEspeci();
			ProductoEspeci productoespeciDestino=new ProductoEspeci();
				
			productoespecisSeleccionados=this.getProductoEspecisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoEspeci.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productoespecisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoEspeci.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoespeciOrigen =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoespeciOrigen =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoespeciDestino =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoespeciDestino =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productoespeciOrigen =productoespecisSeleccionados.get(0);
				productoespeciDestino =productoespecisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoEspeci(productoespeciOrigen,productoespeciDestino,true,false);
				
				productoespeciDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoespeciDestino,productoespeciLogic.getProductoEspecis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoespeciDestino,productoespecis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoEspeci(false);
				
				//this.jTableDatosProductoEspeci.setRowSelectionInterval(this.getIndiceNuevoProductoEspeci(), this.getIndiceNuevoProductoEspeci());
				
				int iLastRow =  this.jTableDatosProductoEspeci.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoEspeci.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoEspeci.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoEspeci(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoEspeciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoEspeci==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoEspeci.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoEspeciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoEspeci.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoEspeci.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoEspeci.setVisible(!isVisible);
			this.jPanelPaginacionProductoEspeci.setVisible(!isVisible);
			this.jPanelAccionesProductoEspeci.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoEspeciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoEspeci();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoEspeciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoEspeci();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoEspeciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoEspeci();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoEspeciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoEspeci();
			
			this.abrirFrameOrderByProductoEspeci();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoEspeciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoEspeci();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoEspeci(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoEspeci);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoEspeci.isMaximum()) {
					this.jInternalFrameDetalleFormProductoEspeci.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoEspeci.setSize(this.jInternalFrameDetalleFormProductoEspeci.iWidthFormulario,this.jInternalFrameDetalleFormProductoEspeci.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoEspeci.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoEspeci.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoEspeci.isMaximum()) {
						this.jInternalFrameDetalleFormProductoEspeci.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoEspeci.jContentPaneDetalleProductoEspeci.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoEspeci.jTabbedPaneRelacionesProductoEspeci.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoEspeci.jContentPaneDetalleProductoEspeci.getWidth(),ProductoEspeciConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoEspeci.jTabbedPaneRelacionesProductoEspeci.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoEspeci.jContentPaneDetalleProductoEspeci.getWidth(),ProductoEspeciConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoEspeci.jTabbedPaneRelacionesProductoEspeci.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoEspeci.jContentPaneDetalleProductoEspeci.getWidth(),ProductoEspeciConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoEspeci.setVisible(true);
	        this.jInternalFrameDetalleFormProductoEspeci.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoEspeci() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoEspeci==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoEspeci=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoEspeci,false,this);
				} else {
					this.jInternalFrameOrderByProductoEspeci=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoEspeci,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoEspeci);
				this.jInternalFrameOrderByProductoEspeci.setVisible(false);
				this.jInternalFrameOrderByProductoEspeci.setSelected(false);
				
				this.jInternalFrameOrderByProductoEspeci.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoEspeci"));
				
				this.inicializarActualizarBindingTablaOrderByProductoEspeci();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoEspeci() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoEspeci==null) {
				
				this.jInternalFrameImportacionProductoEspeci=new ImportacionJInternalFrame(ProductoEspeciConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoEspeci);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoEspeci);
				this.jInternalFrameImportacionProductoEspeci.setVisible(false);
				this.jInternalFrameImportacionProductoEspeci.setSelected(false);


				this.jInternalFrameImportacionProductoEspeci.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoEspeci"));
				this.jInternalFrameImportacionProductoEspeci.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoEspeci"));
				this.jInternalFrameImportacionProductoEspeci.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoEspeci"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoEspeci() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoEspeci==null) {
				this.jInternalFrameReporteDinamicoProductoEspeci=new ReporteDinamicoJInternalFrame(ProductoEspeciConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoEspeci);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoEspeci);
				this.jInternalFrameReporteDinamicoProductoEspeci.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoEspeci.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoEspeci.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoEspeci"));
				this.jInternalFrameReporteDinamicoProductoEspeci.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoEspeci"));
				this.jInternalFrameReporteDinamicoProductoEspeci.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoEspeci"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoEspeci();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoEspeci() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoEspeci);
			
	       	this.jInternalFrameDetalleFormProductoEspeci.setVisible(false);
	        this.jInternalFrameDetalleFormProductoEspeci.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoEspeci.dispose();
			//this.jInternalFrameDetalleFormProductoEspeci=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoEspeci() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoEspeci.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoEspeci.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoEspeci() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoEspeci.setVisible(true);
	        this.jInternalFrameImportacionProductoEspeci.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoEspeci() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoEspeci.setVisible(true);
	        this.jInternalFrameOrderByProductoEspeci.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoEspeci() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoEspeci.setVisible(false);
	        this.jInternalFrameOrderByProductoEspeci.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoEspeci() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoEspeci.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoEspeci.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoEspeci() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoEspeci.setVisible(false);
	        this.jInternalFrameImportacionProductoEspeci.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductoEspeciActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoEspeci(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoEspeci(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoEspeci(true);
			//this.isEsNuevoProductoEspeci=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoEspeci("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoEspeci(false) ;
			
			if(productoespeciSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoEspeciJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoEspeci(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoEspeci(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoEspeciActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoEspeci(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoEspeci==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoEspeci(true);
			//this.isEsNuevoProductoEspeci=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productoespeci.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoEspeci("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoEspeci(false) ;
			
			if(ProductoEspeciJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoEspeci(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoEspeci(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.productoespeciConstantesFunciones.cargarid_productoProductoEspeci) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoEspeci(false,false);
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
		TableColumn tableColumnProducto=this.jTableDatosProductoEspeci.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoEspeci,ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoEspeci.getSelectedRow();

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
	
	public void jButtonActualizarProductoEspeciActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoEspeci(false);
			
			//if(!this.isEsNuevoProductoEspeci) {								
				int intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoEspeci(this.productoespeci,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);
				
			}
			
			if(this.permiteMantenimiento(this.productoespeci)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoespeciSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoEspeci=true;
					this.inicializarActualizarBindingTablaProductoEspeci(false);
					this.isEsNuevoProductoEspeci=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoEspeci=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoEspeci=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoEspeci(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoEspeci(false);
				
				this.habilitarDeshabilitarControlesProductoEspeci(false);
			
												
				
				if(ProductoEspeciJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoEspeci();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoEspeciActionPerformed(evt,productoespeciSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoEspeci(this.productoespeci,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoEspeci.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productoespeciSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productoespeci.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoEspeci.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoEspeci.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoEspeciActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				this.productoespeci.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				this.productoespeci.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productoespeci)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoespeciSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoEspeciModel) this.jTableDatosProductoEspeci.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoEspeci=true;
				this.inicializarActualizarBindingTablaProductoEspeci(false);
				this.isEsNuevoProductoEspeci=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoEspeci(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoEspeci(false);
				
				this.habilitarDeshabilitarControlesProductoEspeci(false);
				
				
				
				if(ProductoEspeciJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoEspeci();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoEspeciActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoEspeci.getRowCount()>=1) {
				jTableDatosProductoEspeci.removeRowSelectionInterval(0, jTableDatosProductoEspeci.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoEspeci(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoEspeci(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoEspeci(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoEspeci(false) ;
			
			this.isEsNuevoProductoEspeci=false;
			
			if(ProductoEspeciJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoEspeci();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoEspeciActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoEspeci(false);
				
				//SI ES MANUAL
				if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoEspeci();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoEspeciActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoEspeci--;			
			//ProductoEspeci productoespeciAux= new ProductoEspeci();			
			//productoespeciAux.setId(this.iIdNuevoProductoEspeci);
			
			if(this.jInternalFrameDetalleFormProductoEspeci==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoEspeci();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);
			
			this.productoespeci.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productoespeciLogic.getProductoEspecis().add(this.productoespeciAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productoespecis.add(this.productoespeciAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoEspeci(false);
			
			this.jTableDatosProductoEspeci.setRowSelectionInterval(this.getIndiceNuevoProductoEspeci(), this.getIndiceNuevoProductoEspeci());
			
			int iLastRow =  this.jTableDatosProductoEspeci.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoEspeci.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoEspeci.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoEspeci(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoEspeciActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoEspeci(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoEspeci(false);
			
			//SI ES MANUAL
			if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoEspeci();
			}
			
			//this.abrirFrameTreeProductoEspeci();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoEspeciActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE EspecificacionS ?", "MANTENIMIENTO DE Especificacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoEspeci.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoEspeci();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productoespeciReturnGeneral=productoespeciLogic.procesarImportacionProductoEspecisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productoespeciParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoEspeciReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoEspeciActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoEspeci.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoEspeci.setFileImportacion(this.jInternalFrameImportacionProductoEspeci.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoEspeci.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoEspeci.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoEspeci.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoEspeci.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoEspeciActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoEspeci> productoespecisSeleccionados=new ArrayList<ProductoEspeci>();		

		productoespecisSeleccionados=this.getProductoEspecisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoEspeci.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoEspeci.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoEspeciBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoEspeciBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoEspecis("Todos",productoespecisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoespeciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especificacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoEspeci.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoEspeci.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoEspeciConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoEspeciConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_pecificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_pecificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_pecificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_pecificacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProductoEspeci.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoEspeci.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoEspeci.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoEspeciConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ProductoEspeciConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION:
					sNombreCampoCategoria="especificacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoEspeci.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoEspeciConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ProductoEspeciConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION:
					sNombreCampoCategoriaValor="especificacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoEspeci.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoEspeci.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoEspeciConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ProductoEspeciConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Especificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"especificacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoEspeciActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoEspeci> productoespecisSeleccionados=new ArrayList<ProductoEspeci>();		
		
		productoespecisSeleccionados=this.getProductoEspecisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoespeci";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoEspecis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoEspeci.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoEspeci.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoEspeciConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoEspeciConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProductoEspeci productoespeci:productoespecisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoespeci.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoEspeciConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoEspeciConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProductoEspeci productoespeci:productoespecisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoespeci.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProductoEspeci productoespeci:productoespecisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoespeci.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION);
					iRow++;

					for(ProductoEspeci productoespeci:productoespecisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoespeci.getespecificacion());
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
			//	this.getFilaCabeceraExportarExcelProductoEspeci(row);				
			//	iRow++;
			//}				
			
			//for(ProductoEspeci productoespeciAux:productoespecisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoEspeci(productoespeciAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoespeciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especificacion",JOptionPane.INFORMATION_MESSAGE);
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
				this.productoespeciLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoEspeci(false);
			
			//SI ES MANUAL
			if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoEspeci();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoEspeciActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoEspeci(false);
			
			//SI ES MANUAL
			if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoEspeci();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoEspeciActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoEspeci(false);
			
			//SI ES MANUAL
			if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoEspeci();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoEspeci() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoEspeci.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoEspeci.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoEspeci.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoEspeci.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoEspeci.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoEspeci.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoEspeci.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoEspeci(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoEspeci(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoEspeci(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoEspeci(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoEspeci(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoEspeci(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoEspeci(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoEspeci(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoEspeciJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoEspeci() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoEspeci();
		
		this.inicializarActualizarBindingBotonesManualProductoEspeci(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoEspeci();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoEspeci() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoEspeci(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoEspeci(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoEspeci.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoEspeci.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoEspeci.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoEspeci.jCheckBoxPostAccionNuevoProductoEspeci.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoEspeci.jCheckBoxPostAccionSinCerrarProductoEspeci.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoEspeci.jCheckBoxPostAccionSinMensajeProductoEspeci.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoEspeci.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoEspeci.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoEspeci.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
				this.jInternalFrameDetalleFormProductoEspeci.jCheckBoxPostAccionNuevoProductoEspeci.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoEspeci.jCheckBoxPostAccionSinCerrarProductoEspeci.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoEspeci.jCheckBoxPostAccionSinMensajeProductoEspeci.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoEspeci.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoEspeci.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoEspeci.jComboBoxTiposAccionesFormularioProductoEspeci.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoEspeci.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoEspeci!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoEspeci.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoEspeci.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoEspeci.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoEspeci.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoEspeci.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoEspeci!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoEspeci.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoEspeci.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoEspeci.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoEspeci(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoEspeci(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoEspeci() throws Exception {
		try	{
			if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoEspeci();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoEspeci() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoEspeci.jComboBoxTiposAccionesFormularioProductoEspeci.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoEspeci.jComboBoxTiposAccionesFormularioProductoEspeci.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoEspeci() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoEspeci.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoEspeci.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoEspeci.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoEspeci.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoEspeci.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoEspeci.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoEspeci.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoEspeci.addItem(reporte);
			}
			
			
			if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoEspeci.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoEspeci.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoEspeci.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoEspeci.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoEspeci.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoEspeci.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoEspeci.jComboBoxTiposAccionesFormularioProductoEspeci.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoEspeci.jComboBoxTiposAccionesFormularioProductoEspeci.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoEspeci.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoEspeci.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoEspeci.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoEspeci();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoEspeci() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoEspeci!=null) {
				this.jInternalFrameReporteDinamicoProductoEspeci.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoEspeci.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoEspeci!=null) {
				this.jInternalFrameReporteDinamicoProductoEspeci.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoEspeci.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoEspeci!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoEspeci.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoEspeci.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoEspeci.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoEspeci.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoEspeci.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoEspeci.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoEspeci()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_productoFK_IdProductoProductoEspeci.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoProductoEspeci.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoEspeci(Boolean esInicializar) throws Exception {				
		if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoEspeci();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoEspeci() throws Exception {
		this.inicializarActualizarBindingTablaProductoEspeci(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoEspeci() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoEspeci.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoEspeci.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoEspeci.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoEspeciPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoEspeci.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoEspeci.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoEspeciPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoEspeciOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoEspeciOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoEspeciPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoEspeci.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoEspeci.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoEspeciPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoEspeci.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoEspeci(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productoespeciLogic.getProductoEspecis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productoespecis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoEspeci.setModel(new ProductoEspeciModel(this.productoespeciLogic.getProductoEspecis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoEspeci.setModel(new ProductoEspeciModel(this.productoespecis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoEspeci!=null && this.jInternalFrameOrderByProductoEspeci.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoEspeci();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoEspeci.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoEspeci,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoEspeciPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO,productoespeciConstantesFunciones.resaltarSeleccionarProductoEspeci,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoEspeciConstantesFunciones.SCLASSWEBTITULO,productoespeciConstantesFunciones.resaltarSeleccionarProductoEspeci,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoEspeci.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoEspeci,ProductoEspeciConstantesFunciones.LABEL_ID));

		if(this.productoespeciConstantesFunciones.mostraridProductoEspeci && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoEspeciConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoespeciConstantesFunciones.resaltaridProductoEspeci,this.productoespeciConstantesFunciones.activaridProductoEspeci,this,true,"idProductoEspeci","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoespeciConstantesFunciones.resaltaridProductoEspeci,this.productoespeciConstantesFunciones.activaridProductoEspeci,this,true,"idProductoEspeci","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoEspeci.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoEspeci,ProductoEspeciConstantesFunciones.LABEL_IDEMPRESA));

		if(this.productoespeciConstantesFunciones.mostrarid_empresaProductoEspeci && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoEspeciConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.productoespeciConstantesFunciones.resaltarid_empresaProductoEspeci,this,this.productoespeciConstantesFunciones.activarid_empresaProductoEspeci));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.productoespeciConstantesFunciones.resaltarid_empresaProductoEspeci,this,this.productoespeciConstantesFunciones.activarid_empresaProductoEspeci,false,"id_empresaProductoEspeci","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoEspeciPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoEspeci.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoEspeci,ProductoEspeciConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.productoespeciConstantesFunciones.mostrarid_sucursalProductoEspeci && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoEspeciConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.productoespeciConstantesFunciones.resaltarid_sucursalProductoEspeci,this,this.productoespeciConstantesFunciones.activarid_sucursalProductoEspeci));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.productoespeciConstantesFunciones.resaltarid_sucursalProductoEspeci,this,this.productoespeciConstantesFunciones.activarid_sucursalProductoEspeci,false,"id_sucursalProductoEspeci","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoEspeciPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoEspeci.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoEspeci,ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.productoespeciConstantesFunciones.mostrarid_productoProductoEspeci && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.productoespeciConstantesFunciones.resaltarid_productoProductoEspeci,this,this.productoespeciConstantesFunciones.activarid_productoProductoEspeci));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.productoespeciConstantesFunciones.resaltarid_productoProductoEspeci,this,this.productoespeciConstantesFunciones.activarid_productoProductoEspeci,true,"id_productoProductoEspeci","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ProductoEspeciPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoEspeci.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoEspeci,ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION));

		if(this.productoespeciConstantesFunciones.mostrarespecificacionProductoEspeci && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productoespeciConstantesFunciones.resaltarespecificacionProductoEspeci,this.productoespeciConstantesFunciones.activarespecificacionProductoEspeci,this,true,"especificacionProductoEspeci","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoespeciConstantesFunciones.resaltarespecificacionProductoEspeci,this.productoespeciConstantesFunciones.activarespecificacionProductoEspeci,this,true,"especificacionProductoEspeci","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoEspeciPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productoespeciSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoespeciSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoespeciSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoEspeci.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoespeciSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoespeciSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoEspeci.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoEspeci && this.isPermisoGuardarCambiosProductoEspeci) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productoespeciSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productoespeciSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoEspeci.addColumn(tableColumn);
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
			
			this.jTableDatosProductoEspeci.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoEspeci && this.isPermisoGuardarCambiosProductoEspeci) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoEspeci && this.isPermisoGuardarCambiosProductoEspeci) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoEspeci.moveColumn(this.jTableDatosProductoEspeci.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoEspeci.moveColumn(this.jTableDatosProductoEspeci.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoEspeci.moveColumn(this.jTableDatosProductoEspeci.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoEspeci.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoEspeci.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoEspeci,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoEspeciJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoEspeci.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoEspeci.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoEspeciJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoEspeciJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoEspeci.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoEspeci.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoEspeci.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productoespeciLogic.getProductoEspecis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productoespecis.size()-1;
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
		//this.jTableDatosProductoEspeci.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoEspeci.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoEspeci();
			
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
				
				//this.isEsNuevoProductoEspeci=false;
					
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			
				if(this.productoespeciSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoEspeci==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoEspeci.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoEspeci.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productoespeci.getsType().equals("DUPLICADO")
				   || this.productoespeci.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoEspeci=true;
				
				} else {
					this.isEsNuevoProductoEspeci=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productoespeciSessionBean.getEsGuardarRelacionado()) {
					if(this.productoespeci.getId()>=0 && !this.productoespeci.getIsNew()) {						
						this.isEsNuevoProductoEspeci=false;
						
					} else {
						this.isEsNuevoProductoEspeci=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoEspeci(esRelaciones);						
				
				this.seleccionarProductoEspeci(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productoespeci.getId()<0) {
					this.isEsNuevoProductoEspeci=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoEspeci(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoEspeci(evt,rowIndex);
				}	
				
				if(this.productoespeciSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoEspeci: " + this.dDif); 
					}
				}								
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoEspeci(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productoespeci)) {
					if(this.productoespeci.getId()>0) {
						this.productoespeci.setIsDeleted(true);
						
						this.productoespecisEliminados.add(this.productoespeci);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoespeciLogic.getProductoEspecis().remove(this.productoespeci);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoespecis.remove(this.productoespeci);				
					}
					
					
					((ProductoEspeciModel) this.jTableDatosProductoEspeci.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoEspeci(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoEspeci(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoEspeci) {
			
			if(this.jInternalFrameDetalleFormProductoEspeci==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoEspeci.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoEspeci.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoEspeci(this.productoespeci);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.productoespeciConstantesFunciones.cargarid_empresaProductoEspeci || this.productoespeciConstantesFunciones.event_dependid_empresaProductoEspeci) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.productoespeci.getid_empresa());
									//this.inicializarActualizarBindingProductoEspeci(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(productoespeci.getEmpresa()!=null) {
							this.empresasForeignKey.add(productoespeci.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.productoespeci.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.productoespeciConstantesFunciones.cargarid_sucursalProductoEspeci || this.productoespeciConstantesFunciones.event_dependid_sucursalProductoEspeci) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.productoespeci.getid_sucursal());
									//this.inicializarActualizarBindingProductoEspeci(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(productoespeci.getSucursal()!=null) {
							this.sucursalsForeignKey.add(productoespeci.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.productoespeci.getid_sucursal(),false,"Formulario");

					//Producto
					if(!this.productoespeciConstantesFunciones.cargarid_productoProductoEspeci || this.productoespeciConstantesFunciones.event_dependid_productoProductoEspeci) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.productoespeci.getid_producto());
									//this.inicializarActualizarBindingProductoEspeci(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(productoespeci.getProducto()!=null) {
							this.productosForeignKey.add(productoespeci.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.productoespeci.getid_producto(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoEspeci("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoEspeci(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoEspeci() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoEspeci(ProductoEspeci productoespeci) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoEspeci(productoespeci,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoEspeci(ProductoEspeci productoespeci,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoEspeci(productoespeci);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoEspeci(productoespeci,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoEspeci(productoespeci);
	}
	
	public void setVariablesObjetoActualToFormularioProductoEspeci(ProductoEspeci productoespeci) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoEspeci==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoEspeci.jLabelidProductoEspeci.setText(productoespeci.getId().toString());
			this.jInternalFrameDetalleFormProductoEspeci.jTextAreaespecificacionProductoEspeci.setText(productoespeci.getespecificacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoEspeci productoespeciLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productoespeciLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoEspeci productoespeciLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productoespeciLocal=this.productoespeci;
			} else {
				productoespeciLocal=this.productoespeciAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productoespeciLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoEspeci(productoespeciLocal,true);
					
					if(productoespeciSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productoespeciLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productoespeciSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productoespeciLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoEspeci(ProductoEspeci productoespeci,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoEspeci(productoespeci,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(productoespeci);
	}
	
	public void setVariablesFormularioToObjetoActualProductoEspeci(ProductoEspeci productoespeci,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoEspeci(productoespeci,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoEspeci(ProductoEspeci productoespeci,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoEspeci==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoEspeci.jLabelidProductoEspeci.getText()==null || this.jInternalFrameDetalleFormProductoEspeci.jLabelidProductoEspeci.getText()=="" || this.jInternalFrameDetalleFormProductoEspeci.jLabelidProductoEspeci.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoEspeci.jLabelidProductoEspeci.setText("0");
			}

			if(conColumnasBase) {productoespeci.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoEspeci.jLabelidProductoEspeci.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoEspeciConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoEspeci.jLabelIdProductoEspeci,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoespeci.setespecificacion(this.jInternalFrameDetalleFormProductoEspeci.jTextAreaespecificacionProductoEspeci.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoEspeci.jLabelespecificacionProductoEspeci,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoEspeci(ProductoEspeci productoespeciBean,ProductoEspeci productoespeci,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productoespeciBean.getid_producto()!=null && !productoespeciBean.getid_producto().equals(-1L))) {productoespeci.setid_producto(productoespeciBean.getid_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoEspeci(ProductoEspeci productoespeciOrigen,ProductoEspeci productoespeci,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoespeciOrigen.getId()!=null && !productoespeciOrigen.getId().equals(0L))) {productoespeci.setId(productoespeciOrigen.getId());}}
			if(conDefault || (!conDefault && productoespeciOrigen.getid_producto()!=null && !productoespeciOrigen.getid_producto().equals(-1L))) {productoespeci.setid_producto(productoespeciOrigen.getid_producto());}
			if(conDefault || (!conDefault && productoespeciOrigen.getespecificacion()!=null && !productoespeciOrigen.getespecificacion().equals(""))) {productoespeci.setespecificacion(productoespeciOrigen.getespecificacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoEspeci(ProductoEspeci productoespeci) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoEspeci.jLabelidProductoEspeci.setText(productoespeci.getId().toString());
			this.jInternalFrameDetalleFormProductoEspeci.jTextAreaespecificacionProductoEspeci.setText(productoespeci.getespecificacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoEspeci(ProductoEspeciBean productoespeciBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoEspeci.jLabelidProductoEspeci.setText(productoespeciBean.getId().toString());
			this.jInternalFrameDetalleFormProductoEspeci.jTextAreaespecificacionProductoEspeci.setText(productoespeciBean.getespecificacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoEspeci(ProductoEspeciParameterReturnGeneral productoespeciReturnGeneral,ProductoEspeciBean productoespeciBean,Boolean conDefault) throws Exception { 
		try {
			ProductoEspeci productoespeciLocal=new ProductoEspeci();
			
			productoespeciLocal=productoespeciReturnGeneral.getProductoEspeci();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoespeciLocal.getId()!=null && !productoespeciLocal.getId().equals(0L))) {productoespeciBean.setId(productoespeciLocal.getId());}}
			if(conDefault || (!conDefault && productoespeciLocal.getid_producto()!=null && !productoespeciLocal.getid_producto().equals(-1L))) {productoespeciBean.setid_producto(productoespeciLocal.getid_producto());}
			if(conDefault || (!conDefault && productoespeciLocal.getespecificacion()!=null && !productoespeciLocal.getespecificacion().equals(""))) {productoespeciBean.setespecificacion(productoespeciLocal.getespecificacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoEspeciGenerico(Long idProductoEspeciSeleccionado,JComboBox jComboBoxProductoEspeci,List<ProductoEspeci> productoespecisLocal)throws Exception {
		try {
			ProductoEspeci  productoespeciTemp=null;

			for(ProductoEspeci productoespeciAux:productoespecisLocal) {
				if(productoespeciAux.getId()!=null && productoespeciAux.getId().equals(idProductoEspeciSeleccionado)) {
					productoespeciTemp=productoespeciAux;
					break;
				}
			}

			jComboBoxProductoEspeci.setSelectedItem(productoespeciTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoEspeciGenerico(JComboBox jComboBoxProductoEspeci,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoEspeci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoEspeci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoEspeci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoEspeci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoEspeci.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoEspeci.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoEspeci.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoEspeci.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoEspeci.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoEspeci.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoespeci=(ProductoEspeci) productoespeciLogic.getProductoEspecis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoespeci =(ProductoEspeci) productoespecis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productoespeci.getIsNew() && !productoespeci.getIsChanged() && !productoespeci.getIsDeleted()) {
				sDescripcion=productoespeci.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productoespeci.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!productoespeci.getIsNew() && !productoespeci.getIsChanged() && !productoespeci.getIsDeleted()) {
				sDescripcion=productoespeci.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=productoespeci.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!productoespeci.getIsNew() && !productoespeci.getIsChanged() && !productoespeci.getIsDeleted()) {
				sDescripcion=productoespeci.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=productoespeci.getproducto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoEspeci productoespeciRow=new ProductoEspeci();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoespeciRow=(ProductoEspeci) productoespeciLogic.getProductoEspecis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoespeciRow=(ProductoEspeci) productoespecis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoEspeci(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoEspeci.setVisible((this.isVisibilidadCeldaNuevoProductoEspeci && this.isPermisoNuevoProductoEspeci));			
			this.jButtonDuplicarProductoEspeci.setVisible((this.isVisibilidadCeldaDuplicarProductoEspeci && this.isPermisoDuplicarProductoEspeci));			
			this.jButtonCopiarProductoEspeci.setVisible((this.isVisibilidadCeldaCopiarProductoEspeci && this.isPermisoCopiarProductoEspeci));
			this.jButtonVerFormProductoEspeci.setVisible((this.isVisibilidadCeldaVerFormProductoEspeci && this.isPermisoVerFormProductoEspeci));
			
			this.jButtonAbrirOrderByProductoEspeci.setVisible((this.isVisibilidadCeldaOrdenProductoEspeci && this.isPermisoOrdenProductoEspeci));			
			
			this.jButtonNuevoRelacionesProductoEspeci.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoEspeci && this.isPermisoNuevoProductoEspeci));			
			this.jButtonNuevoGuardarCambiosProductoEspeci.setVisible((this.isVisibilidadCeldaNuevoProductoEspeci && this.isPermisoNuevoProductoEspeci && this.isPermisoGuardarCambiosProductoEspeci));
			
			if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
			this.jInternalFrameDetalleFormProductoEspeci.jButtonModificarProductoEspeci.setVisible((this.isVisibilidadCeldaModificarProductoEspeci && this.isPermisoActualizarProductoEspeci));	
			this.jInternalFrameDetalleFormProductoEspeci.jButtonActualizarProductoEspeci.setVisible((this.isVisibilidadCeldaActualizarProductoEspeci && this.isPermisoActualizarProductoEspeci));	
			this.jInternalFrameDetalleFormProductoEspeci.jButtonEliminarProductoEspeci.setVisible((this.isVisibilidadCeldaEliminarProductoEspeci && this.isPermisoEliminarProductoEspeci));
			this.jInternalFrameDetalleFormProductoEspeci.jButtonCancelarProductoEspeci.setVisible(this.isVisibilidadCeldaCancelarProductoEspeci);							
			this.jInternalFrameDetalleFormProductoEspeci.jButtonGuardarCambiosProductoEspeci.setVisible((this.isVisibilidadCeldaGuardarProductoEspeci && this.isPermisoGuardarCambiosProductoEspeci));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoEspeci.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoEspeci && this.isPermisoGuardarCambiosProductoEspeci));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoEspeci.setVisible((this.isVisibilidadCeldaNuevoProductoEspeci && this.isPermisoNuevoProductoEspeci));						
			this.jButtonDuplicarToolBarProductoEspeci.setVisible((this.isVisibilidadCeldaDuplicarProductoEspeci && this.isPermisoDuplicarProductoEspeci));						
			this.jButtonCopiarToolBarProductoEspeci.setVisible((this.isVisibilidadCeldaCopiarProductoEspeci && this.isPermisoCopiarProductoEspeci));			
			this.jButtonVerFormToolBarProductoEspeci.setVisible((this.isVisibilidadCeldaVerFormProductoEspeci && this.isPermisoVerFormProductoEspeci));			
			this.jButtonAbrirOrderByToolBarProductoEspeci.setVisible((this.isVisibilidadCeldaOrdenProductoEspeci && this.isPermisoOrdenProductoEspeci));
			this.jButtonNuevoRelacionesToolBarProductoEspeci.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoEspeci && this.isPermisoNuevoProductoEspeci));			
			this.jButtonNuevoGuardarCambiosToolBarProductoEspeci.setVisible((this.isVisibilidadCeldaNuevoProductoEspeci && this.isPermisoNuevoProductoEspeci && this.isPermisoGuardarCambiosProductoEspeci));			
			
			if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
			this.jInternalFrameDetalleFormProductoEspeci.jButtonModificarToolBarProductoEspeci.setVisible((this.isVisibilidadCeldaModificarProductoEspeci && this.isPermisoActualizarProductoEspeci));	
			this.jInternalFrameDetalleFormProductoEspeci.jButtonActualizarToolBarProductoEspeci.setVisible((this.isVisibilidadCeldaActualizarProductoEspeci  && this.isPermisoActualizarProductoEspeci));	
			this.jInternalFrameDetalleFormProductoEspeci.jButtonEliminarToolBarProductoEspeci.setVisible((this.isVisibilidadCeldaEliminarProductoEspeci && this.isPermisoEliminarProductoEspeci));
			this.jInternalFrameDetalleFormProductoEspeci.jButtonCancelarToolBarProductoEspeci.setVisible(this.isVisibilidadCeldaCancelarProductoEspeci);				
			this.jInternalFrameDetalleFormProductoEspeci.jButtonGuardarCambiosToolBarProductoEspeci.setVisible((this.isVisibilidadCeldaGuardarProductoEspeci && this.isPermisoGuardarCambiosProductoEspeci));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoEspeci.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoEspeci && this.isPermisoGuardarCambiosProductoEspeci));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoEspeci.setVisible((this.isVisibilidadCeldaNuevoProductoEspeci && this.isPermisoNuevoProductoEspeci));			
			this.jMenuItemDuplicarProductoEspeci.setVisible((this.isVisibilidadCeldaDuplicarProductoEspeci && this.isPermisoDuplicarProductoEspeci));			
			this.jMenuItemCopiarProductoEspeci.setVisible((this.isVisibilidadCeldaCopiarProductoEspeci && this.isPermisoCopiarProductoEspeci));			
			this.jMenuItemVerFormProductoEspeci.setVisible((this.isVisibilidadCeldaVerFormProductoEspeci && this.isPermisoVerFormProductoEspeci));			
			this.jMenuItemAbrirOrderByProductoEspeci.setVisible((this.isVisibilidadCeldaOrdenProductoEspeci && this.isPermisoOrdenProductoEspeci));			
			//this.jMenuItemMostrarOcultarProductoEspeci.setVisible((this.isVisibilidadCeldaOrdenProductoEspeci && this.isPermisoOrdenProductoEspeci));
			this.jMenuItemDetalleAbrirOrderByProductoEspeci.setVisible((this.isVisibilidadCeldaOrdenProductoEspeci && this.isPermisoOrdenProductoEspeci));			
			//this.jMenuItemDetalleMostrarOcultarProductoEspeci.setVisible((this.isVisibilidadCeldaOrdenProductoEspeci && this.isPermisoOrdenProductoEspeci));			
			this.jMenuItemNuevoRelacionesProductoEspeci.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoEspeci && this.isPermisoNuevoProductoEspeci));			
			this.jMenuItemNuevoGuardarCambiosProductoEspeci.setVisible((this.isVisibilidadCeldaNuevoProductoEspeci && this.isPermisoNuevoProductoEspeci && this.isPermisoGuardarCambiosProductoEspeci));									
			
			if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
			this.jInternalFrameDetalleFormProductoEspeci.jMenuItemModificarProductoEspeci.setVisible((this.isVisibilidadCeldaModificarProductoEspeci && this.isPermisoActualizarProductoEspeci));	
			this.jInternalFrameDetalleFormProductoEspeci.jMenuItemActualizarProductoEspeci.setVisible((this.isVisibilidadCeldaActualizarProductoEspeci && this.isPermisoActualizarProductoEspeci));	
			this.jInternalFrameDetalleFormProductoEspeci.jMenuItemEliminarProductoEspeci.setVisible((this.isVisibilidadCeldaEliminarProductoEspeci && this.isPermisoEliminarProductoEspeci));
			this.jInternalFrameDetalleFormProductoEspeci.jMenuItemCancelarProductoEspeci.setVisible(this.isVisibilidadCeldaCancelarProductoEspeci);				
			}
			
			this.jMenuItemGuardarCambiosProductoEspeci.setVisible((this.isVisibilidadCeldaGuardarProductoEspeci && this.isPermisoGuardarCambiosProductoEspeci));						
			this.jMenuItemGuardarCambiosTablaProductoEspeci.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoEspeci && this.isPermisoGuardarCambiosProductoEspeci));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoEspeci=this.jButtonNuevoProductoEspeci.isVisible();
			this.isVisibilidadCeldaDuplicarProductoEspeci=this.jButtonDuplicarProductoEspeci.isVisible();
			this.isVisibilidadCeldaCopiarProductoEspeci=this.jButtonCopiarProductoEspeci.isVisible();
			this.isVisibilidadCeldaVerFormProductoEspeci=this.jButtonVerFormProductoEspeci.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoEspeci=this.jButtonAbrirOrderByProductoEspeci.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoEspeci=this.jButtonNuevoRelacionesProductoEspeci.isVisible();
			this.isVisibilidadCeldaModificarProductoEspeci=this.jButtonModificarProductoEspeci.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
			this.isVisibilidadCeldaActualizarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jButtonActualizarProductoEspeci.isVisible();
			this.isVisibilidadCeldaEliminarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jButtonEliminarProductoEspeci.isVisible();
			this.isVisibilidadCeldaCancelarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jButtonCancelarProductoEspeci.isVisible();
			this.isVisibilidadCeldaGuardarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jButtonGuardarCambiosProductoEspeci.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoEspeci=this.jButtonGuardarCambiosTablaProductoEspeci.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoEspeci=this.jButtonNuevoToolBarProductoEspeci.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoEspeci=this.jButtonNuevoRelacionesToolBarProductoEspeci.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
			this.isVisibilidadCeldaModificarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jButtonModificarToolBarProductoEspeci.isVisible();
			this.isVisibilidadCeldaActualizarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jButtonActualizarToolBarProductoEspeci.isVisible();
			this.isVisibilidadCeldaEliminarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jButtonEliminarToolBarProductoEspeci.isVisible();
			this.isVisibilidadCeldaCancelarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jButtonCancelarToolBarProductoEspeci.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoEspeci=this.jButtonGuardarCambiosToolBarProductoEspeci.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoEspeci=this.jButtonGuardarCambiosTablaToolBarProductoEspeci.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoEspeci=this.jMenuItemNuevoProductoEspeci.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoEspeci=this.jMenuItemNuevoRelacionesProductoEspeci.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
			this.isVisibilidadCeldaModificarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jMenuItemModificarProductoEspeci.isVisible();
			this.isVisibilidadCeldaActualizarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jMenuItemActualizarProductoEspeci.isVisible();
			this.isVisibilidadCeldaEliminarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jMenuItemEliminarProductoEspeci.isVisible();
			this.isVisibilidadCeldaCancelarProductoEspeci=this.jInternalFrameDetalleFormProductoEspeci.jMenuItemCancelarProductoEspeci.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoEspeci=this.jMenuItemGuardarCambiosProductoEspeci.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoEspeci=this.jMenuItemGuardarCambiosTablaProductoEspeci.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoEspeci(Boolean esInicializar) {
		if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productoespeciSessionBean.getConGuardarRelaciones()) {
				//if(this.productoespeciSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoEspeci();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoEspeci(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoEspeci() {
		this.jButtonNuevoProductoEspeci.setVisible(this.isPermisoNuevoProductoEspeci);			
		this.jButtonDuplicarProductoEspeci.setVisible(this.isPermisoDuplicarProductoEspeci);			
		this.jButtonCopiarProductoEspeci.setVisible(this.isPermisoCopiarProductoEspeci);			
		this.jButtonVerFormProductoEspeci.setVisible(this.isPermisoVerFormProductoEspeci);			
		
		this.jButtonAbrirOrderByProductoEspeci.setVisible(this.isPermisoOrdenProductoEspeci);					
		
		this.jButtonNuevoRelacionesProductoEspeci.setVisible(this.isPermisoNuevoProductoEspeci);			
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoEspeci.jButtonModificarProductoEspeci.setVisible(this.isPermisoActualizarProductoEspeci);	
			this.jInternalFrameDetalleFormProductoEspeci.jButtonActualizarProductoEspeci.setVisible(this.isPermisoActualizarProductoEspeci);	
			this.jInternalFrameDetalleFormProductoEspeci.jButtonEliminarProductoEspeci.setVisible(this.isPermisoEliminarProductoEspeci);
			this.jInternalFrameDetalleFormProductoEspeci.jButtonCancelarProductoEspeci.setVisible(this.isVisibilidadCeldaCancelarProductoEspeci);						
			this.jInternalFrameDetalleFormProductoEspeci.jButtonGuardarCambiosProductoEspeci.setVisible(this.isPermisoGuardarCambiosProductoEspeci);							
		}
		
		this.jButtonGuardarCambiosTablaProductoEspeci.setVisible(this.isPermisoActualizarProductoEspeci);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoEspeci() {
		this.jInternalFrameDetalleFormProductoEspeci.jButtonModificarProductoEspeci.setVisible(this.isPermisoActualizarProductoEspeci);	
		this.jInternalFrameDetalleFormProductoEspeci.jButtonActualizarProductoEspeci.setVisible(this.isPermisoActualizarProductoEspeci);	
		this.jInternalFrameDetalleFormProductoEspeci.jButtonEliminarProductoEspeci.setVisible(this.isPermisoEliminarProductoEspeci);
		this.jInternalFrameDetalleFormProductoEspeci.jButtonCancelarProductoEspeci.setVisible(this.isVisibilidadCeldaCancelarProductoEspeci);							
		this.jInternalFrameDetalleFormProductoEspeci.jButtonGuardarCambiosProductoEspeci.setVisible((this.isVisibilidadCeldaGuardarProductoEspeci && this.isPermisoGuardarCambiosProductoEspeci));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoEspeci() {
		if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoEspeci();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoEspeci() {
	}
	
	public void jTableDatosProductoEspeciListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoEspeci(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoEspeciBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoEspeci(this.getproductoespeci(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoespeci==null) {
						this.productoespeci = new ProductoEspeci();
					}

					this.setVariablesFormularioToObjetoActualProductoEspeci(this.productoespeci,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);
				}

				if(this.productoespeci.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productoespeci.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoEspeci(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductoEspeciUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductoEspeci(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoEspeci.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoEspeci.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoEspeci(this.getproductoespeci(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productoespeciLogic.getConnexion());

				if(this.productoespeci.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productoespeci.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoEspeci=(TitledBorder)this.jScrollPanelDatosProductoEspeci.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductoEspeci.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductoEspeciBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoEspeci(this.getproductoespeci(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoespeci==null) {
						this.productoespeci = new ProductoEspeci();
					}

					this.setVariablesFormularioToObjetoActualProductoEspeci(this.productoespeci,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);
				}

				if(this.productoespeci.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productoespeci.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoEspeci(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProductoEspeciUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProductoEspeci(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoEspeci.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoEspeci.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoEspeci(this.getproductoespeci(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.productoespeciLogic.getConnexion());

				if(this.productoespeci.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.productoespeci.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoEspeci=(TitledBorder)this.jScrollPanelDatosProductoEspeci.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProductoEspeci.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProductoEspeciBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoEspeci(this.getproductoespeci(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoespeci==null) {
						this.productoespeci = new ProductoEspeci();
					}

					this.setVariablesFormularioToObjetoActualProductoEspeci(this.productoespeci,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);
				}

				if(this.productoespeci.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.productoespeci.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoEspeci(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProductoEspeciActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderProductoEspeci=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosProductoEspeci.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoEspeci=(TitledBorder)this.jScrollPanelDatosProductoEspeci.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoEspeci.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoProductoEspeciUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProductoEspeci(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoEspeci.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoEspeci.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoEspeci(this.getproductoespeci(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.productoespeciLogic.getConnexion());

				if(this.productoespeci.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.productoespeci.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoEspeci=(TitledBorder)this.jScrollPanelDatosProductoEspeci.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoEspeci.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProductoEspeciBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoEspeci(this.getproductoespeci(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoespeci==null) {
						this.productoespeci = new ProductoEspeci();
					}

					this.setVariablesFormularioToObjetoActualProductoEspeci(this.productoespeci,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);
				}

				if(this.productoespeci.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.productoespeci.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoEspeci(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonespecificacionProductoEspeciBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoEspeci(this.getproductoespeci(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoespeci==null) {
						this.productoespeci = new ProductoEspeci();
					}

					this.setVariablesFormularioToObjetoActualProductoEspeci(this.productoespeci,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);
				}

				if(this.productoespeci.getespecificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where especificacion like '%"+this.productoespeci.getespecificacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoEspeci(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaProductoEspeciActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoEspeci(false,false);

			this.getProductoEspecisFK_IdEmpresa();

			this.inicializarActualizarBindingProductoEspeci(false);

			//if(ProductoEspeciBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoEspeci(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProductoEspeciActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoEspeci(false,false);

			this.getProductoEspecisFK_IdProducto();

			this.inicializarActualizarBindingProductoEspeci(false);

			//if(ProductoEspeciBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoEspeci(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProductoEspeciActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoEspeci(false,false);

			this.getProductoEspecisFK_IdSucursal();

			this.inicializarActualizarBindingProductoEspeci(false);

			//if(ProductoEspeciBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoEspeci(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoespeciLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoEspeci() {
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
			this.jInternalFrameDetalleFormProductoEspeci.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoEspeci.dispose();
			this.jInternalFrameDetalleFormProductoEspeci=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoEspeci!=null) {
			this.jInternalFrameReporteDinamicoProductoEspeci.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoEspeci.dispose();
			this.jInternalFrameReporteDinamicoProductoEspeci=null;
		}
		
		if(this.jInternalFrameImportacionProductoEspeci!=null) {
			this.jInternalFrameImportacionProductoEspeci.setVisible(false);	    			
			this.jInternalFrameImportacionProductoEspeci.dispose();
			this.jInternalFrameImportacionProductoEspeci=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoEspeci();
			
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoEspeci")) {
				jButtonNuevoProductoEspeciActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoEspeci")) {
				jButtonDuplicarProductoEspeciActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoEspeci")) {
				jButtonCopiarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoEspeci")) {
				jButtonVerFormProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoEspeci")) {
				jButtonNuevoProductoEspeciActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoEspeci")) {
				jButtonDuplicarProductoEspeciActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoEspeci")) {
				jButtonNuevoProductoEspeciActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoEspeci")) {
				jButtonDuplicarProductoEspeciActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoEspeci")) {
				jButtonNuevoProductoEspeciActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoEspeci")) {
				jButtonNuevoProductoEspeciActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoEspeci")) {
				jButtonNuevoProductoEspeciActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoEspeci")) {
				jButtonModificarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoEspeci")) {
				jButtonModificarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoEspeci")) {
				jButtonModificarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoEspeci")) {
				jButtonActualizarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoEspeci")) {
				jButtonActualizarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoEspeci")) {
				jButtonActualizarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoEspeci")) {
				jButtonEliminarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoEspeci")) {
				jButtonEliminarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoEspeci")) {
				jButtonEliminarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoEspeci")) {
				jButtonCancelarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoEspeci")) {
				jButtonCancelarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoEspeci")) {
				jButtonCancelarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoEspeci")) {
				jButtonCerrarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoEspeci")) {
				jButtonCerrarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoEspeci")) {
				jButtonCerrarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoEspeci")) {
				jButtonMostrarOcultarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoEspeci")) {
				jButtonCancelarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoEspeci")) {
				jButtonGuardarCambiosProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoEspeci")) {
				jButtonGuardarCambiosProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoEspeci")) {
				jButtonCopiarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoEspeci")) {
				jButtonVerFormProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoEspeci")) {
				jButtonGuardarCambiosProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoEspeci")) {
				jButtonCopiarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoEspeci")) {
				jButtonVerFormProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoEspeci")) {
				jButtonGuardarCambiosProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoEspeci")) {
				jButtonGuardarCambiosProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoEspeci")) {
				jButtonGuardarCambiosProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoEspeci")) {
				jButtonRecargarInformacionProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoEspeci")) {
				jButtonRecargarInformacionProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoEspeci")) {
				jButtonRecargarInformacionProductoEspeciActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoEspeci")) {
				jButtonAnterioresProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoEspeci")) {
				jButtonAnterioresProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoEspeci")) {
				jButtonAnterioresProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoEspeci")) {
				jButtonSiguientesProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoEspeci")) {
				jButtonSiguientesProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoEspeci")) {
				jButtonSiguientesProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoEspeci") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoEspeci")) {
				jButtonAbrirOrderByProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoEspeci") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoEspeci")) {
				jButtonMostrarOcultarProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoEspeci")) {
				jButtonNuevoGuardarCambiosProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoEspeci")) {
				jButtonNuevoGuardarCambiosProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoEspeci")) {
				jButtonNuevoGuardarCambiosProductoEspeciActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoEspeci")) {
				jButtonCerrarReporteDinamicoProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoEspeci")) {
				jButtonGenerarReporteDinamicoProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoEspeci")) {
				
				jButtonGenerarExcelReporteDinamicoProductoEspeciActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoEspeci")) {
				jButtonCerrarImportacionProductoEspeciActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoEspeci")) {
				
				jButtonGenerarImportacionProductoEspeciActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoEspeci")) {
				
				jButtonAbrirImportacionProductoEspeciActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoEspeci")) {
				jComboBoxTiposAccionesProductoEspeciActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoEspeci")) {
				jComboBoxTiposRelacionesProductoEspeciActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoEspeci")) {
				jComboBoxTiposAccionesProductoEspeciActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoEspeci")) {
				
				jComboBoxTiposSeleccionarProductoEspeciActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoEspeci")) {
				jTextFieldValorCampoGeneralProductoEspeciActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoEspeci")) {
				jButtonAbrirOrderByProductoEspeciActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoEspeci")) {
				jButtonAbrirOrderByProductoEspeciActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoEspeci")) {
				jButtonCerrarOrderByProductoEspeciActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoEspeciBusqueda")) {
				this.jButtonidProductoEspeciBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoEspeciUpdate")) {
				this.jButtonid_empresaProductoEspeciUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoEspeciBusqueda")) {
				this.jButtonid_empresaProductoEspeciBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoEspeciUpdate")) {
				this.jButtonid_sucursalProductoEspeciUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoEspeciBusqueda")) {
				this.jButtonid_sucursalProductoEspeciBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoEspeci")) {
				this.jButtonid_productoProductoEspeciActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoEspeciUpdate")) {
				this.jButtonid_productoProductoEspeciUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoEspeciBusqueda")) {
				this.jButtonid_productoProductoEspeciBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("especificacionProductoEspeciBusqueda")) {
				this.jButtonespecificacionProductoEspeciBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoProductoEspeci")) {
				this.jButtonid_productoProductoEspeciActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdProductoProductoEspeci")) {
				this.jButtonFK_IdProductoProductoEspeciActionPerformed(evt);
			}
			
			;
			
			
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoEspeci();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoEspeciActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoespeci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
				
				


				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoEspeci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoEspeci.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoEspeci productoespeciLocal=null;
			
			if(!this.getEsControlTabla()) {
				productoespeciLocal=this.productoespeci;
			} else {
				productoespeciLocal=this.productoespeciAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoespeci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
							
				
				


				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoEspeci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoEspeci.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoEspeciActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciAnterior =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoespeciAnterior =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
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
			
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			
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
			
			


			
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoEspeciActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoespeci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
								
						
				


				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoEspeci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoEspeci.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoespeci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
								
				
				


				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoEspeci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoEspeci.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoEspeciActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciAnterior =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoespeciAnterior =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoespeci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoEspeciActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciAnterior =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoespeciAnterior =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoEspeciActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoespeci);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoespeci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
							
				
				


				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoEspeci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoEspeci.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoEspeciActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoespeciAnterior =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoespeciAnterior =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
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
			
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			
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
			
			


			
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoEspeciActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoespeci);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoespeci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
								
				
				


				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoEspeci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoEspeci.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoEspeciActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciAnterior =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoespeciAnterior =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoEspeciActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoespeci);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoEspeciActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoespeci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoEspeci")) {
					jCheckBoxSeleccionarTodosProductoEspeciItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoEspeci")) {
					jCheckBoxSeleccionadosProductoEspeciItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoEspeci")) {
					
				}
				
				


				
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoEspeci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoEspeci.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productoespeci);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
												
				
				


				
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoEspeci.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoEspeci.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoEspeciActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoespeciAnterior =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoespeciAnterior =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoEspeciActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoespeci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
				
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
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
			
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
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
			
			


			
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoEspeciActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoespeci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoEspeci.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoEspeci.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoespeci);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoespeci);
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
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
				
				


				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoEspeci.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoEspeci.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoEspeciActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoespeciAnterior =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoespeciAnterior =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoEspeci")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoEspeciListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoEspeci.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productoespeci =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productoespeci =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productoespeci);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoEspeci")) {
				
				}
				
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoEspeci")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoEspeci.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoEspeci")) {
			
			}
			
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoEspeci();
			
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			
			if(sTipo.equals("NuevoProductoEspeci")) {
				jButtonNuevoProductoEspeciActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoEspeci")) {
				jButtonDuplicarProductoEspeciActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoEspeci")) {
				jButtonCopiarProductoEspeciActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoEspeci")) {
				jButtonVerFormProductoEspeciActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoEspeci")) {
				jButtonNuevoProductoEspeciActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoEspeci")) {
				jButtonModificarProductoEspeciActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoEspeci")) {
				jButtonActualizarProductoEspeciActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoEspeci")) {
				jButtonEliminarProductoEspeciActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoEspeci")) {
				jButtonGuardarCambiosProductoEspeciActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoEspeci")) {
				jButtonCancelarProductoEspeciActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoEspeci")) {
				jButtonCerrarProductoEspeciActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoEspeci")) {
				jButtonGuardarCambiosProductoEspeciActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoEspeci")) {
				jButtonNuevoGuardarCambiosProductoEspeciActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoEspeci")) {
				jButtonAbrirOrderByProductoEspeciActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoEspeci")) {
				jButtonRecargarInformacionProductoEspeciActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoEspeci")) {
				jButtonAnterioresProductoEspeciActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoEspeci")) {
				jButtonSiguientesProductoEspeciActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoEspeciBusqueda")) {
				this.jButtonidProductoEspeciBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoEspeciUpdate")) {
				this.jButtonid_empresaProductoEspeciUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoEspeciBusqueda")) {
				this.jButtonid_empresaProductoEspeciBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoEspeciUpdate")) {
				this.jButtonid_sucursalProductoEspeciUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoEspeciBusqueda")) {
				this.jButtonid_sucursalProductoEspeciBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoEspeci")) {
				this.jButtonid_productoProductoEspeciActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoEspeciUpdate")) {
				this.jButtonid_productoProductoEspeciUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoEspeciBusqueda")) {
				this.jButtonid_productoProductoEspeciBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("especificacionProductoEspeciBusqueda")) {
				this.jButtonespecificacionProductoEspeciBusquedaActionPerformed(evt);
			}
			
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoEspeci();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoEspeci")) {
				closingInternalFrameProductoEspeci();
				
			} else if(sTipo.equals("jButtonCancelarProductoEspeci")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoEspeci = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoEspeciBeanSwingJInternalFrame jInternalFrameParent=(ProductoEspeciBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoEspeci.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoEspeciActionPerformed(null);
			}
			
			ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoespeci,new Object(),this.productoespeciParameterGeneral,this.productoespeciReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoEspeci(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoEspeci(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoEspeci(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productoespeci)) {
			if(!esControlTabla) {
				if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoEspeci(this.productoespeci,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);			
				}
				
				if(this.productoespeciSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoEspeci(this.productoespeci,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoespeciReturnGeneral=productoespeciLogic.procesarEventosProductoEspecisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoespeciLogic.getProductoEspecis(),this.productoespeci,this.productoespeciParameterGeneral,this.isEsNuevoProductoEspeci,classes);//this.productoespeciLogic.getProductoEspeci()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoEspeci(this.productoespeciReturnGeneral,this.productoespeciBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productoespeciSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoEspeci(classes,this.productoespeciReturnGeneral,this.productoespeciBean,false);
					}
						
					if(this.productoespeciReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoEspeci(this.productoespeciReturnGeneral.getProductoEspeci());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoEspeci(this.productoespeciReturnGeneral.getProductoEspeci());	
					}
						
					if(this.productoespeciReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoEspeci(this.productoespeciReturnGeneral.getProductoEspeci(),classes);//this.productoespeciBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoEspeci(this.productoespeci,classes);//this.productoespeciBean);									
				}
			
				if(ProductoEspeciJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoEspeci(this.productoespeci,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoEspeci(this.productoespeci);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productoespeciAnterior!=null) {
						this.productoespeci=this.productoespeciAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoespeciReturnGeneral=productoespeciLogic.procesarEventosProductoEspecisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoespeciLogic.getProductoEspecis(),this.productoespeci,this.productoespeciParameterGeneral,this.isEsNuevoProductoEspeci,classes);//this.productoespeciLogic.getProductoEspeci()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoespeciSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoespeciSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productoespeciReturnGeneral.getProductoEspeci(),productoespeciLogic.getProductoEspecis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productoespeciReturnGeneral.getProductoEspeci(),this.productoespecis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoEspeci.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoEspeci.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoEspeci();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoEspeci() throws Exception {
		
		ProductoEspeciModel productoespeciModel=(ProductoEspeciModel)this.jTableDatosProductoEspeci.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoespeciModel.productoespecis=this.productoespeciLogic.getProductoEspecis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productoespeciModel.productoespecis=this.productoespecis;
		}
		
		
		((ProductoEspeciModel) this.jTableDatosProductoEspeci.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoEspeci() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductoespeciAnterior(),this.productoespeciLogic.getProductoEspecis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductoespeciAnterior(),this.productoespecis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoEspeci();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoEspeci(ProductoEspeci productoespeci,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
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
										
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoespeci,new Object(),generalEntityParameterGeneral,this.productoespeciReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productoespeciSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoEspeciConstantesFunciones.getClassesRelationshipsOfProductoEspeci(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoEspeciConstantesFunciones.getClassesRelationshipsFromStringsOfProductoEspeci(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoEspeci(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoEspeciBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoespeci,new Object(),generalEntityParameterGeneral,this.productoespeciReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoEspeci(ProductoEspeciBean productoespeciBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoEspeci(ArrayList<Classe> classes,ProductoEspeciReturnGeneral productoespeciReturnGeneral,ProductoEspeciBean productoespeciBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoEspeci(ProductoEspeci productoespeci,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productoespeci)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoEspeci = new ProductoEspeciDetalleFormJInternalFrame(jDesktopPane,this.productoespeciSessionBean.getConGuardarRelaciones(),this.productoespeciSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoEspeci);
		this.jInternalFrameDetalleFormProductoEspeci.setVisible(false);
		this.jInternalFrameDetalleFormProductoEspeci.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoEspeci.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoEspeci.productoespeciLogic=this.productoespeciLogic;
		
		this.cargarCombosFrameForeignKeyProductoEspeci("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoEspeci();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoEspeci();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoEspeci("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoEspeci();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoEspeci.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoEspeci"));
		
		this.jInternalFrameDetalleFormProductoEspeci.jButtonModificarProductoEspeci.addActionListener(new ButtonActionListener(this,"ModificarProductoEspeci"));

		
		this.jInternalFrameDetalleFormProductoEspeci.jButtonModificarToolBarProductoEspeci.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoEspeci"));
					
		this.jInternalFrameDetalleFormProductoEspeci.jMenuItemModificarProductoEspeci.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoEspeci"));		
		
		
		
		this.jInternalFrameDetalleFormProductoEspeci.jButtonActualizarProductoEspeci.addActionListener (new ButtonActionListener(this,"ActualizarProductoEspeci"));
		
		
		this.jInternalFrameDetalleFormProductoEspeci.jButtonActualizarToolBarProductoEspeci.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoEspeci"));
						
		this.jInternalFrameDetalleFormProductoEspeci.jMenuItemActualizarProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoEspeci"));		
		
		
		
		this.jInternalFrameDetalleFormProductoEspeci.jButtonEliminarProductoEspeci.addActionListener (new ButtonActionListener(this,"EliminarProductoEspeci"));
		
		
		this.jInternalFrameDetalleFormProductoEspeci.jButtonEliminarToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoEspeci"));
								
		this.jInternalFrameDetalleFormProductoEspeci.jMenuItemEliminarProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoEspeci"));		
		
		
		
		this.jInternalFrameDetalleFormProductoEspeci.jButtonCancelarProductoEspeci.addActionListener (new ButtonActionListener(this,"CancelarProductoEspeci"));
		
		
		this.jInternalFrameDetalleFormProductoEspeci.jButtonCancelarToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoEspeci"));
					
		this.jInternalFrameDetalleFormProductoEspeci.jMenuItemCancelarProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoEspeci"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoEspeci.jMenuItemDetalleCerrarProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoEspeci"));		
		
		
		
		this.jInternalFrameDetalleFormProductoEspeci.jButtonGuardarCambiosToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoEspeci"));
		
		
		
		this.jInternalFrameDetalleFormProductoEspeci.jButtonGuardarCambiosToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoEspeci"));
		
		
		
		this.jInternalFrameDetalleFormProductoEspeci.jComboBoxTiposAccionesFormularioProductoEspeci.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoEspeci"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoEspeci.jButtonidProductoEspeciBusqueda.addActionListener(new ButtonActionListener(this,"idProductoEspeciBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_empresaProductoEspeciUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoEspeciUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_empresaProductoEspeciBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoEspeciBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_sucursalProductoEspeciUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoEspeciUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_sucursalProductoEspeciBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoEspeciBusqueda"));
		//jButtonid_productoProductoEspeci.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoEspeciActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_productoProductoEspeci.addActionListener(new ButtonActionListener(this,"id_productoProductoEspeci"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_productoProductoEspeciUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoEspeciUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_productoProductoEspeciBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoEspeciBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoEspeci.jButtonespecificacionProductoEspeciBusqueda.addActionListener(new ButtonActionListener(this,"especificacionProductoEspeciBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoEspeci.jTabbedPaneRelacionesProductoEspeci.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoEspeci"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoEspeci"));
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoEspeci.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoEspeci"));
		}
		
		this.jTableDatosProductoEspeci.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoEspeci"));
		
		this.jTableDatosProductoEspeci.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoEspeci"));
		
		this.jButtonNuevoProductoEspeci.addActionListener(new ButtonActionListener(this,"NuevoProductoEspeci"));
		
		this.jButtonDuplicarProductoEspeci.addActionListener(new ButtonActionListener(this,"DuplicarProductoEspeci"));
		
		this.jButtonCopiarProductoEspeci.addActionListener(new ButtonActionListener(this,"CopiarProductoEspeci"));
		
		this.jButtonVerFormProductoEspeci.addActionListener(new ButtonActionListener(this,"VerFormProductoEspeci"));
		
		
		this.jButtonNuevoToolBarProductoEspeci.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoEspeci"));
			
		this.jButtonDuplicarToolBarProductoEspeci.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoEspeci"));
			
		this.jMenuItemNuevoProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoEspeci"));
			
		this.jMenuItemDuplicarProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoEspeci"));		
		
		
		this.jButtonNuevoRelacionesProductoEspeci.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoEspeci"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoEspeci.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoEspeci"));
			
		this.jMenuItemNuevoRelacionesProductoEspeci.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoEspeci"));		
		
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoEspeci.jButtonModificarProductoEspeci.addActionListener(new ButtonActionListener(this,"ModificarProductoEspeci"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoEspeci.jButtonModificarToolBarProductoEspeci.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoEspeci"));
			
			this.jInternalFrameDetalleFormProductoEspeci.jMenuItemModificarProductoEspeci.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoEspeci"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoEspeci.jButtonActualizarProductoEspeci.addActionListener (new ButtonActionListener(this,"ActualizarProductoEspeci"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoEspeci.jButtonActualizarToolBarProductoEspeci.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoEspeci"));
				
			this.jInternalFrameDetalleFormProductoEspeci.jMenuItemActualizarProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoEspeci"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoEspeci.jButtonEliminarProductoEspeci.addActionListener (new ButtonActionListener(this,"EliminarProductoEspeci"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoEspeci.jButtonEliminarToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoEspeci"));
						
			this.jInternalFrameDetalleFormProductoEspeci.jMenuItemEliminarProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoEspeci"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoEspeci.jButtonCancelarProductoEspeci.addActionListener (new ButtonActionListener(this,"CancelarProductoEspeci"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoEspeci.jButtonCancelarToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoEspeci"));
			
			this.jInternalFrameDetalleFormProductoEspeci.jMenuItemCancelarProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoEspeci"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoEspeci"));		
		
		
		this.jButtonCerrarProductoEspeci.addActionListener (new ButtonActionListener(this,"CerrarProductoEspeci"));
		
		
		this.jButtonCerrarToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoEspeci"));
			
		this.jMenuItemCerrarProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoEspeci"));
			
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoEspeci.jMenuItemDetalleCerrarProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoEspeci"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoEspeci.jButtonGuardarCambiosProductoEspeci.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoEspeci"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoEspeci.jButtonGuardarCambiosToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoEspeci"));
		}
		
		this.jButtonCopiarToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoEspeci"));
			
		this.jButtonVerFormToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoEspeci"));
		
		this.jMenuItemGuardarCambiosProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoEspeci"));
			
		this.jMenuItemCopiarProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoEspeci"));		
		
		this.jMenuItemVerFormProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoEspeci"));		
		
		
		this.jButtonGuardarCambiosTablaProductoEspeci.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoEspeci"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoEspeci"));
			
		this.jMenuItemGuardarCambiosTablaProductoEspeci.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoEspeci"));		
		
		
		
		this.jButtonRecargarInformacionProductoEspeci.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoEspeci"));
					
		this.jButtonRecargarInformacionToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoEspeci"));
		
		this.jMenuItemRecargarInformacionProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoEspeci"));		
		
		
		
		this.jButtonAnterioresProductoEspeci.addActionListener (new ButtonActionListener(this,"AnterioresProductoEspeci"));
		
		
		this.jButtonAnterioresToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoEspeci"));
		
		this.jMenuItemAnterioresProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoEspeci"));		
		
		
		this.jButtonSiguientesProductoEspeci.addActionListener (new ButtonActionListener(this,"SiguientesProductoEspeci"));
		
		
		this.jButtonSiguientesToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoEspeci"));
			
		this.jMenuItemSiguientesProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoEspeci"));
			
		this.jMenuItemAbrirOrderByProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoEspeci"));
			
		this.jMenuItemMostrarOcultarProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoEspeci"));
			
		this.jMenuItemDetalleAbrirOrderByProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoEspeci"));
			
		this.jMenuItemDetalleMostarOcultarProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoEspeci"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoEspeci.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoEspeci"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoEspeci"));
			
		this.jMenuItemNuevoGuardarCambiosProductoEspeci.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoEspeci"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoEspeci.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoEspeci"));

		this.jCheckBoxSeleccionadosProductoEspeci.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoEspeci"));
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoEspeci.jComboBoxTiposAccionesFormularioProductoEspeci.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoEspeci"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoEspeci.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoEspeci"));
			
		this.jComboBoxTiposAccionesProductoEspeci.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoEspeci"));
					
		this.jComboBoxTiposSeleccionarProductoEspeci.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoEspeci"));
			
		this.jTextFieldValorCampoGeneralProductoEspeci.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoEspeci"));		
		
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoEspeci.jButtonidProductoEspeciBusqueda.addActionListener(new ButtonActionListener(this,"idProductoEspeciBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_empresaProductoEspeciUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoEspeciUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_empresaProductoEspeciBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoEspeciBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_sucursalProductoEspeciUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoEspeciUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_sucursalProductoEspeciBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoEspeciBusqueda"));
		//jButtonid_productoProductoEspeci.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoEspeciActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_productoProductoEspeci.addActionListener(new ButtonActionListener(this,"id_productoProductoEspeci"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_productoProductoEspeciUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoEspeciUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_productoProductoEspeciBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoEspeciBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoEspeci.jButtonespecificacionProductoEspeciBusqueda.addActionListener(new ButtonActionListener(this,"especificacionProductoEspeciBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdProductoProductoEspeci.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoEspeci"));

			this.jButtonBuscarFK_IdProductoid_productoProductoEspeci.addActionListener(new ButtonActionListener(this,"id_productoProductoEspeci"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoEspeci!=null) {
				this.jInternalFrameReporteDinamicoProductoEspeci.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoEspeci"));
				this.jInternalFrameReporteDinamicoProductoEspeci.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoEspeci"));
				this.jInternalFrameReporteDinamicoProductoEspeci.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoEspeci"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoEspeci.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoEspeci"));				
			//this.jButtonGenerarReporteDinamicoProductoEspeci.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoEspeci"));
			//this.jButtonGenerarExcelReporteDinamicoProductoEspeci.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoEspeci"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoEspeci!=null) {
				this.jInternalFrameImportacionProductoEspeci.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoEspeci"));
				this.jInternalFrameImportacionProductoEspeci.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoEspeci"));
				this.jInternalFrameImportacionProductoEspeci.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoEspeci"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoEspeci.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoEspeci"));
			
			this.jButtonAbrirOrderByToolBarProductoEspeci.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoEspeci"));			
			
			if(this.jInternalFrameOrderByProductoEspeci!=null) {
				this.jInternalFrameOrderByProductoEspeci.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoEspeci"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoEspeci.jTabbedPaneRelacionesProductoEspeci.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoEspeci"));
		
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
            		closingInternalFrameProductoEspeci();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoEspeci.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoEspeci = (JInternalFrameBase)event.getSource();
	            	
	            ProductoEspeciBeanSwingJInternalFrame jInternalFrameParent=(ProductoEspeciBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoEspeci.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoEspeciActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoEspeci.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoEspeciListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoEspeci.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoEspeci.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoEspeciActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoEspeciActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoEspeciActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoEspeci";
		inputMap = this.jButtonNuevoProductoEspeci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoEspeci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoEspeciActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoEspeciActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoEspeciActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoEspeciActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoEspeci";
		inputMap = this.jButtonNuevoRelacionesProductoEspeci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoEspeci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoEspeciActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoEspeci";
		inputMap = this.jButtonModificarProductoEspeci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoEspeci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoEspeciActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoEspeci";
		inputMap = this.jButtonActualizarProductoEspeci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoEspeci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoEspeciActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoEspeci";
		inputMap = this.jButtonEliminarProductoEspeci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoEspeci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoEspeciActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoEspeci";
		inputMap = this.jButtonCancelarProductoEspeci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoEspeci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoEspeciActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoEspeci";
		inputMap = this.jButtonCerrarProductoEspeci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoEspeci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoEspeciActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoEspeci.jButtonGuardarCambiosProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoEspeci";
		inputMap = this.jInternalFrameDetalleFormProductoEspeci.jButtonGuardarCambiosProductoEspeci.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoEspeci.jButtonGuardarCambiosProductoEspeci.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoEspeciActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoEspeci.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoEspeciItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoEspeci.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoEspeciActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoEspeci.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoEspeciActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoEspeci.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoEspeciActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoEspeci.jButtonidProductoEspeciBusqueda.addActionListener(new ButtonActionListener(this,"idProductoEspeciBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_empresaProductoEspeciUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoEspeciUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_empresaProductoEspeciBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoEspeciBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_sucursalProductoEspeciUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoEspeciUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_sucursalProductoEspeciBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoEspeciBusqueda"));
		//jButtonid_productoProductoEspeci.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoEspeciActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_productoProductoEspeci.addActionListener(new ButtonActionListener(this,"id_productoProductoEspeci"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_productoProductoEspeciUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoEspeciUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoEspeci.jButtonid_productoProductoEspeciBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoEspeciBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoEspeci.jButtonespecificacionProductoEspeciBusqueda.addActionListener(new ButtonActionListener(this,"especificacionProductoEspeciBusqueda"));
		
		
		this.jButtonFK_IdProductoProductoEspeci.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoEspeci"));

		this.jButtonBuscarFK_IdProductoid_productoProductoEspeci.addActionListener(new ButtonActionListener(this,"id_productoProductoEspeci"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoEspeci.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoEspeciActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoEspeciActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoEspeci.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoEspeci(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoEspeci productoespeciAux:this.productoespeciLogic.getProductoEspecis()) {
					productoespeciAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoEspeci productoespeciAux:productoespecis) {
					productoespeciAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoEspeciItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoEspeci(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoEspeci productoespeciAux:this.productoespeciLogic.getProductoEspecis()) {
						productoespeciAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoEspeci productoespeciAux:productoespecis) {
						productoespeciAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoEspeci productoespeciAux:this.productoespeciLogic.getProductoEspecis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoEspeci productoespeciAux:productoespecis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoEspeci(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoEspeci.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoEspeci.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoEspeci,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoEspeciItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoEspeci(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoEspeci.getSelectedRows();
			
			ProductoEspeci productoespeciLocal=new ProductoEspeci();
			
			//this.seleccionarTodosProductoEspeci(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoespeciLocal =(ProductoEspeci) this.productoespeciLogic.getProductoEspecis().toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productoespeciLocal =(ProductoEspeci) this.productoespecis.toArray()[this.jTableDatosProductoEspeci.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productoespeciLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoEspeci productoespeciAux:this.productoespeciLogic.getProductoEspecis()) {
						productoespeciAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoEspeci productoespeciAux:productoespecis) {
						productoespeciAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoEspeci(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoEspeci.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoEspeci.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoEspeci,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoEspeciItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoEspeciParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoEspeciActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoEspeci(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoEspeci.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoEspeci productoespeciAux:this.productoespeciLogic.getProductoEspecis()) {
				
						if(sTipoSeleccionar.equals(ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION)) {
							existe=true;
							productoespeciAux.setespecificacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoEspeci productoespeciAux:productoespecis) {
					
						if(sTipoSeleccionar.equals(ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION)) {
							existe=true;
							productoespeciAux.setespecificacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoEspeci(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoEspeciActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoEspeci(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoEspeci=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoEspeci.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoEspeci.jComboBoxTiposAccionesFormularioProductoEspeci.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoEspeci) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoEspeci(conSplash);
				
					this.generarReporteProductoEspecisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoEspeci.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoEspeci.jComboBoxTiposAccionesFormularioProductoEspeci.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoEspecisSeleccionados();
				//this.jComboBoxTiposAccionesProductoEspeci.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoEspecisSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoEspeci.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoEspecisSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoEspeci.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoEspeci();
				
				this.exportarProductoEspecisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoEspeci.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoEspeci.jComboBoxTiposAccionesFormularioProductoEspeci.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoEspecis();
				//this.importarProductoEspecis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoEspeci.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoEspeci.jComboBoxTiposAccionesFormularioProductoEspeci.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoEspeci();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoEspecisSeleccionados();
				//this.jComboBoxTiposAccionesProductoEspeci.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Especificacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoEspeci();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoEspeci)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoEspeci(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Especificacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoEspeci.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoEspeci.jComboBoxTiposAccionesFormularioProductoEspeci.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoEspeciBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoEspeci) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoEspeci(conSplash);
					
						//this.actualizarParametrosGeneralProductoEspeci();
						
						this.generarReporteProcesoAccionProductoEspecisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoEspeci.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoEspeci.jComboBoxTiposAccionesFormularioProductoEspeci.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoEspeciBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO EspecificacionS SELECCIONADOS?", "MANTENIMIENTO DE Especificacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoEspeci();
				
						this.actualizarParametrosGeneralProductoEspeci();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productoespeciReturnGeneral=productoespeciLogic.procesarAccionProductoEspecisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productoespeciLogic.getProductoEspecis(),this.productoespeciParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoEspeciReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoEspeci.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoEspeci.jComboBoxTiposAccionesFormularioProductoEspeci.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoEspeci();
					
					ProductoEspeciBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoEspeciReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoEspeci.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoEspeci.jComboBoxTiposAccionesFormularioProductoEspeci.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoEspeci(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoEspeciActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoEspeci();
			
			if(this.jInternalFrameDetalleFormProductoEspeci==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoEspeci> productoespecisSeleccionados=new ArrayList<ProductoEspeci>();		
			ProductoEspeci productoespeci=new ProductoEspeci();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoEspeci(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoEspeci.getSelectedItem();
			
			
			
			
			productoespecisSeleccionados=this.getProductoEspecisSeleccionados(true);
			//this.sTipoAccion;
			
			if(productoespecisSeleccionados.size()==1) {
				for(ProductoEspeci productoespeciAux:productoespecisSeleccionados) {
					productoespeci=productoespeciAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoEspeci();
			
      		//this.finishProcessProductoEspeci(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoEspeciReturnGeneral() throws Exception {
		if(this.productoespeciReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productoespeciReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productoespeciReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productoespeciReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productoespeciReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productoespeciReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoEspeci(false);
		}
		
		if(this.productoespeciReturnGeneral.getConRetornoLista() || this.productoespeciReturnGeneral.getConRetornoObjeto()) {
			if(this.productoespeciReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoespeciLogic.setProductoEspecis(this.productoespeciReturnGeneral.getProductoEspecis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productoespeciReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoespeciLogic.setProductoEspeci(this.productoespeciReturnGeneral.getProductoEspeci());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoEspeci(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoEspeci() throws Exception {
		
		
	}
	
	public ArrayList<ProductoEspeci> getProductoEspecisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoEspeci> productoespecisSeleccionados=new ArrayList<ProductoEspeci>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoEspeci) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoEspeci productoespeciAux:productoespeciLogic.getProductoEspecis()) {
					if(productoespeciAux.getIsSelected()) {
						productoespecisSeleccionados.add(productoespeciAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoEspeci productoespeciAux:this.productoespecis) {
					if(productoespeciAux.getIsSelected()) {
						productoespecisSeleccionados.add(productoespeciAux);				
					}
				}
			}
			
			if(productoespecisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productoespecisSeleccionados.addAll(this.productoespeciLogic.getProductoEspecis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productoespecisSeleccionados.addAll(this.productoespecis);				
					}
				}
			}
		} else {
			productoespecisSeleccionados.add(this.productoespeci);
		}
		
		return productoespecisSeleccionados;
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
	
	public void generarReporteProductoEspecisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoEspecisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoEspecisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoEspecisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoEspecisSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Especificacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoEspecisSeleccionados() throws Exception {
		ArrayList<ProductoEspeci> productoespecisSeleccionados=new ArrayList<ProductoEspeci>();		
		
		productoespecisSeleccionados=this.getProductoEspecisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoEspecis("Todos",productoespecisSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoEspecisSeleccionados() throws Exception {
		ArrayList<ProductoEspeci> productoespecisSeleccionados=new ArrayList<ProductoEspeci>();		
		
		productoespecisSeleccionados=this.getProductoEspecisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoEspecis("Todos",productoespecisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoEspecisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoEspeci> productoespecisSeleccionados=new ArrayList<ProductoEspeci>();
		
		productoespecisSeleccionados=this.getProductoEspecisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoEspecis("Todos",productoespecisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoEspecisSeleccionados() throws Exception {
		ArrayList<ProductoEspeci> productoespecisSeleccionados=new ArrayList<ProductoEspeci>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoEspeci();
		
		
		productoespecisSeleccionados=this.getProductoEspecisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoEspeci();
		
		
		//this.generarReporteProductoEspecis("Todos",productoespecisSeleccionados ,productoespeciImplementable,productoespeciImplementableHome);
	}
	
	public void mostrarImportacionProductoEspecis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoEspeci();
		
		this.abrirFrameImportacionProductoEspeci();		
		
			
		//this.generarReporteProductoEspecis("Todos",productoespecisSeleccionados ,productoespeciImplementable,productoespeciImplementableHome);
	}
	
	public void importarProductoEspecis() throws Exception {		
	
	}
	
	public void exportarProductoEspecisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoEspecisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoEspecisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoEspecisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Especificacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoEspecisSeleccionados() throws Exception {
		ArrayList<ProductoEspeci> productoespecisSeleccionados=new ArrayList<ProductoEspeci>();		
		
		productoespecisSeleccionados=this.getProductoEspecisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoespeci."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoEspeci(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoEspeci productoespeciAux:productoespecisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoEspeci(productoespeciAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productoespeciAux.setsDetalleGeneralEntityReporte(productoespeciAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoespeciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especificacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoEspeci(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoEspeciConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoEspeciConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoEspeciConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoEspeciConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoEspeci(ProductoEspeci productoespeci,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productoespeci.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productoespeci.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoespeci.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoespeci.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoespeci.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoespeci.getespecificacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoEspecisSeleccionados() throws Exception {
		ArrayList<ProductoEspeci> productoespecisSeleccionados=new ArrayList<ProductoEspeci>();		
		
		productoespecisSeleccionados=this.getProductoEspecisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoespeci.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoEspecis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoEspeci(row);				
				iRow++;
			}				
			
			for(ProductoEspeci productoespeciAux:productoespecisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoEspeci(productoespeciAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoespeciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especificacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoEspecisSeleccionados() throws Exception {
		ArrayList<ProductoEspeci> productoespecisSeleccionados=new ArrayList<ProductoEspeci>();		
		
		productoespecisSeleccionados=this.getProductoEspecisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoespeci.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productoespecis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productoespeci");
			//elementRoot.appendChild(element);
		
			for(ProductoEspeci productoespeciAux:productoespecisSeleccionados) {
				element = document.createElement("productoespeci");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoEspeci(productoespeciAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoespeciSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Especificacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoEspeci(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoEspeciConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoEspeciConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoEspeciConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoEspeciConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoEspeci(ProductoEspeci productoespeci,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productoespeci.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productoespeci.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoespeci.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoespeci.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoespeci.getespecificacion());				
	}
	
	public void setFilaDatosExportarXmlProductoEspeci(ProductoEspeci productoespeci,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoEspeciConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productoespeci.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoEspeciConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productoespeci.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProductoEspeciConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productoespeci.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProductoEspeciConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(productoespeci.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementproducto_descripcion = document.createElement(ProductoEspeciConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(productoespeci.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementespecificacion = document.createElement(ProductoEspeciConstantesFunciones.ESPECIFICACION);
		elementespecificacion.appendChild(document.createTextNode(productoespeci.getespecificacion().trim()));
		element.appendChild(elementespecificacion);
	}
	
	public void generarReporteGroupGenericoProductoEspecisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoEspeci> productoespecisSeleccionados=new ArrayList<ProductoEspeci>();
		
		productoespecisSeleccionados=this.getProductoEspecisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoEspeci(productoespecisSeleccionados);
		
		this.generarReporteProductoEspecis("Todos",productoespecisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoEspeci(ArrayList<ProductoEspeci> productoespecisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoEspeci productoespeciAux:productoespecisSeleccionados) {
				productoespeciAux.setsDetalleGeneralEntityReporte(productoespeciAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoEspeciConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productoespeciAux.setsDescripcionGeneralEntityReporte1(productoespeciAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoEspeciConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					productoespeciAux.setsDescripcionGeneralEntityReporte1(productoespeciAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoEspeciConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					productoespeciAux.setsDescripcionGeneralEntityReporte1(productoespeciAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoEspeciConstantesFunciones.LABEL_ESPECIFICACION)) {
					existe=true;
					productoespeciAux.setsDescripcionGeneralEntityReporte1(productoespeciAux.getespecificacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoEspeciConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoEspeci(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoEspeci=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoEspeci=true;
				this.isVisibilidadCeldaGuardarCambiosProductoEspeci=true;
			}
			
			this.isVisibilidadCeldaModificarProductoEspeci=false;
			this.isVisibilidadCeldaActualizarProductoEspeci=false;
			this.isVisibilidadCeldaEliminarProductoEspeci=false;
			this.isVisibilidadCeldaCancelarProductoEspeci=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoEspeci=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoEspeci=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoEspeci=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoEspeci=false;
			this.isVisibilidadCeldaGuardarCambiosProductoEspeci=false;
			this.isVisibilidadCeldaModificarProductoEspeci=false;
			this.isVisibilidadCeldaActualizarProductoEspeci=true;
			this.isVisibilidadCeldaEliminarProductoEspeci=false;
			this.isVisibilidadCeldaCancelarProductoEspeci=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoEspeci=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoEspeci=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoEspeci=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoEspeci=false;
			this.isVisibilidadCeldaGuardarCambiosProductoEspeci=false;
			this.isVisibilidadCeldaModificarProductoEspeci=false;
			this.isVisibilidadCeldaActualizarProductoEspeci=true;
			this.isVisibilidadCeldaEliminarProductoEspeci=true;
			this.isVisibilidadCeldaCancelarProductoEspeci=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoEspeci=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoEspeci=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoEspeci=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoEspeci=false;
			this.isVisibilidadCeldaGuardarCambiosProductoEspeci=false;
			this.isVisibilidadCeldaModificarProductoEspeci=false;
			this.isVisibilidadCeldaActualizarProductoEspeci=true;
			this.isVisibilidadCeldaEliminarProductoEspeci=false;
			this.isVisibilidadCeldaCancelarProductoEspeci=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoEspeci=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoEspeci=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoEspeci=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoEspeci=true;
			this.isVisibilidadCeldaGuardarCambiosProductoEspeci=true;
			this.isVisibilidadCeldaModificarProductoEspeci=false;
			this.isVisibilidadCeldaActualizarProductoEspeci=false;
			this.isVisibilidadCeldaEliminarProductoEspeci=false;
			this.isVisibilidadCeldaCancelarProductoEspeci=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoEspeci=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoEspeci=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoEspeci=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoEspeci=false;
			this.isVisibilidadCeldaGuardarCambiosProductoEspeci=false;
			this.isVisibilidadCeldaActualizarProductoEspeci=false;
			this.isVisibilidadCeldaEliminarProductoEspeci=false;
			this.isVisibilidadCeldaCancelarProductoEspeci=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoEspeci=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoEspeci=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoEspeci=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoEspeci=false;
			this.isVisibilidadCeldaGuardarCambiosProductoEspeci=false;
			this.isVisibilidadCeldaModificarProductoEspeci=true;
			this.isVisibilidadCeldaActualizarProductoEspeci=false;
			this.isVisibilidadCeldaEliminarProductoEspeci=false;
			this.isVisibilidadCeldaCancelarProductoEspeci=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoEspeci=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoEspeci=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoEspeciJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoEspeci=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoEspeci=true;
			this.isVisibilidadCeldaGuardarCambiosProductoEspeci=true;
		} else {
			this.actualizarEstadoPanelsProductoEspeci(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoEspeci=false;
			//this.isVisibilidadCeldaVerFormProductoEspeci=false;
			this.isVisibilidadCeldaDuplicarProductoEspeci=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productoespeciSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoEspeci=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoEspeci=false;
			this.isVisibilidadCeldaGuardarCambiosProductoEspeci=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productoespeciSessionBean.getEsGuardarRelacionado()) {
			if(!productoespeciSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoEspeci=false;												
			}
			
			this.jButtonCerrarProductoEspeci.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoEspeci=false;
		}
		
		if(!this.permiteMantenimiento(this.productoespeci)) {
			this.isVisibilidadCeldaActualizarProductoEspeci=false;
			this.isVisibilidadCeldaEliminarProductoEspeci=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoEspeci() {
	}
	
	public void actualizarEstadoPanelsProductoEspeci(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoEspeci!=null) {
				this.jScrollPanelDatosEdicionProductoEspeci.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoEspeci!=null) {
				this.jTabbedPaneBusquedasProductoEspeci.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoEspeci!=null) {
				this.jScrollPanelDatosProductoEspeci.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoEspeci!=null) {
				this.jPanelPaginacionProductoEspeci.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoEspeci!=null) {
				this.jPanelParametrosReportesProductoEspeci.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoEspeci!=null) {
				this.jScrollPanelDatosEdicionProductoEspeci.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoEspeci!=null) {
				this.jTabbedPaneBusquedasProductoEspeci.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoEspeci!=null) {
				this.jScrollPanelDatosProductoEspeci.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoEspeci!=null) {
				this.jPanelPaginacionProductoEspeci.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoEspeci!=null) {
				this.jPanelParametrosReportesProductoEspeci.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoEspeci!=null) {
				this.jScrollPanelDatosEdicionProductoEspeci.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoEspeci!=null) {
				this.jTabbedPaneBusquedasProductoEspeci.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoEspeci!=null) {
				this.jScrollPanelDatosProductoEspeci.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoEspeci!=null) {
				this.jPanelPaginacionProductoEspeci.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoEspeci!=null) {
				this.jPanelParametrosReportesProductoEspeci.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoEspeci!=null) {
				this.jScrollPanelDatosEdicionProductoEspeci.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoEspeci!=null) {
				this.jTabbedPaneBusquedasProductoEspeci.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoEspeci!=null) {
				this.jScrollPanelDatosProductoEspeci.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoEspeci!=null) {
				this.jPanelPaginacionProductoEspeci.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoEspeci!=null) {
				this.jPanelParametrosReportesProductoEspeci.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoEspeci!=null) {
				this.jScrollPanelDatosEdicionProductoEspeci.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoEspeci!=null) {
				this.jTabbedPaneBusquedasProductoEspeci.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoEspeci!=null) {
				this.jScrollPanelDatosProductoEspeci.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoEspeci!=null) {
				this.jPanelPaginacionProductoEspeci.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoEspeci!=null) {
				this.jPanelParametrosReportesProductoEspeci.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoEspeci!=null) {
				this.jScrollPanelDatosEdicionProductoEspeci.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoEspeci!=null) {
				this.jTabbedPaneBusquedasProductoEspeci.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoEspeci!=null) {
				this.jScrollPanelDatosProductoEspeci.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoEspeci!=null) {
				this.jPanelPaginacionProductoEspeci.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoEspeci!=null) {
				this.jPanelParametrosReportesProductoEspeci.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoEspeci!=null) {
				this.jScrollPanelDatosEdicionProductoEspeci.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoEspeci!=null) {
				this.jTabbedPaneBusquedasProductoEspeci.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoEspeci!=null) {
				this.jScrollPanelDatosProductoEspeci.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoEspeci!=null) {
				this.jPanelPaginacionProductoEspeci.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoEspeci!=null) {
				this.jPanelParametrosReportesProductoEspeci.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productoespeciSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoEspeci!=null) {
					this.jTabbedPaneBusquedasProductoEspeci.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoEspeci!=null) {
				this.jPanelParametrosReportesProductoEspeci.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productoespeciSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoEspeci!=null) {
				this.jTabbedPaneBusquedasProductoEspeci.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoEspeci!=null) {
				this.jPanelParametrosReportesProductoEspeci.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoEspeci.remove(jPanelFK_IdProductoProductoEspeci);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoEspeci.remove(jPanelFK_IdProductoProductoEspeci);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoEspeci.remove(jPanelFK_IdProductoProductoEspeci);}
		}
		
	}
	
	
	
	

	public String registrarSesionProductoEspeciParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(productoespeciSessionBean==null) {
				productoespeciSessionBean=new ProductoEspeciSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(productoespeciSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.productoespeciFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ProductoEspeciConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionProductoEspeci(true);
			//productoSessionBean.setlidProductoEspeciActual(this.idProductoEspeciActual);

			productoespeciSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoEspeci(true);
			productoespeciSessionBean.setlIdProductoEspeciActualForeignKey(this.idProductoEspeciActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoEspeciSessionBean productoespeciSessionBean=new ProductoEspeciSessionBean();
		
		if(this.productoespeciSessionBean==null) {
			this.productoespeciSessionBean=new ProductoEspeciSessionBean();
		}
		
		this.productoespeciSessionBean.setsUltimaBusquedaProductoEspeci(this.getsAccionBusqueda());
		this.productoespeciSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productoespeciSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			productoespeciSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			productoespeciSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			productoespeciSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoEspeciSessionBean productoespeciSessionBean=new ProductoEspeciSessionBean();
		
		if(this.productoespeciSessionBean==null) {
			this.productoespeciSessionBean=new ProductoEspeciSessionBean();
		}
		
		if(this.productoespeciSessionBean.getsUltimaBusquedaProductoEspeci()!=null&&!this.productoespeciSessionBean.getsUltimaBusquedaProductoEspeci().equals("")) {
			this.setsAccionBusqueda(productoespeciSessionBean.getsUltimaBusquedaProductoEspeci());
			this.setiNumeroPaginacion(productoespeciSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productoespeciSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(productoespeciSessionBean.getid_empresa());
				productoespeciSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(productoespeciSessionBean.getid_producto());
				productoespeciSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(productoespeciSessionBean.getid_sucursal());
				productoespeciSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.productoespeciSessionBean.setsUltimaBusquedaProductoEspeci("");
		this.productoespeciSessionBean.setiNumeroPaginacion(ProductoEspeciConstantesFunciones.INUMEROPAGINACION);
		this.productoespeciSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoEspeci(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoEspeci() {
		this.updateBorderResaltarBusquedasFormularioProductoEspeci();
		this.updateVisibilidadBusquedasFormularioProductoEspeci();
		this.updateHabilitarBusquedasFormularioProductoEspeci();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoEspeci() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoEspeci.getComponents().length>0) {
	

		if(this.productoespeciConstantesFunciones.resaltarFK_IdProductoProductoEspeci!=null) {
			index= this.jTabbedPaneBusquedasProductoEspeci.indexOfComponent(this.jPanelFK_IdProductoProductoEspeci);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoEspeci.getComponent(index);
				jPanel.setBorder(this.productoespeciConstantesFunciones.resaltarFK_IdProductoProductoEspeci);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoEspeci() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoEspeci.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoEspeci.indexOfComponent(this.jPanelFK_IdProductoProductoEspeci);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoEspeci.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoespeciConstantesFunciones.mostrarFK_IdProductoProductoEspeci);
			if(!this.productoespeciConstantesFunciones.mostrarFK_IdProductoProductoEspeci && index>-1) {
				this.jTabbedPaneBusquedasProductoEspeci.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoEspeci() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoEspeci.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoEspeci.indexOfComponent(this.jPanelFK_IdProductoProductoEspeci);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoEspeci.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoespeciConstantesFunciones.activarFK_IdProductoProductoEspeci);
				this.jTabbedPaneBusquedasProductoEspeci.setEnabledAt(index,this.productoespeciConstantesFunciones.activarFK_IdProductoProductoEspeci);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoEspeci(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasProductoEspeci.indexOfComponent(this.jPanelFK_IdProductoProductoEspeci);

			this.jTabbedPaneBusquedasProductoEspeci.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoEspeci.getComponent(index);

			this.productoespeciConstantesFunciones.setResaltarFK_IdProductoProductoEspeci(resaltar);

			jPanel.setBorder(this.productoespeciConstantesFunciones.resaltarFK_IdProductoProductoEspeci);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoEspeci.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoEspeci() throws Exception {

		if(this.jInternalFrameDetalleFormProductoEspeci==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoEspeci();
		this.updateVisibilidadResaltarControlesFormularioProductoEspeci();
		this.updateHabilitarResaltarControlesFormularioProductoEspeci();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoEspeci() throws Exception {
		if(this.jInternalFrameDetalleFormProductoEspeci==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productoespeciConstantesFunciones.resaltaridProductoEspeci!=null && this.jInternalFrameDetalleFormProductoEspeci!=null) {this.jInternalFrameDetalleFormProductoEspeci.jLabelidProductoEspeci.setBorder(this.productoespeciConstantesFunciones.resaltaridProductoEspeci);}
		if(this.productoespeciConstantesFunciones.resaltarid_empresaProductoEspeci!=null && this.jInternalFrameDetalleFormProductoEspeci!=null) {this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_empresaProductoEspeci.setBorder(this.productoespeciConstantesFunciones.resaltarid_empresaProductoEspeci);}
		if(this.productoespeciConstantesFunciones.resaltarid_sucursalProductoEspeci!=null && this.jInternalFrameDetalleFormProductoEspeci!=null) {this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_sucursalProductoEspeci.setBorder(this.productoespeciConstantesFunciones.resaltarid_sucursalProductoEspeci);}
		if(this.productoespeciConstantesFunciones.resaltarid_productoProductoEspeci!=null && this.jInternalFrameDetalleFormProductoEspeci!=null) {this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_productoProductoEspeci.setBorder(this.productoespeciConstantesFunciones.resaltarid_productoProductoEspeci);}
		if(this.productoespeciConstantesFunciones.resaltarespecificacionProductoEspeci!=null && this.jInternalFrameDetalleFormProductoEspeci!=null) {this.jInternalFrameDetalleFormProductoEspeci.jTextAreaespecificacionProductoEspeci.setBorder(this.productoespeciConstantesFunciones.resaltarespecificacionProductoEspeci);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoEspeci() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoEspeci==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
	
		//this.jInternalFrameDetalleFormProductoEspeci.jLabelidProductoEspeci.setVisible(this.productoespeciConstantesFunciones.mostraridProductoEspeci);
		this.jInternalFrameDetalleFormProductoEspeci.jPanelidProductoEspeci.setVisible(this.productoespeciConstantesFunciones.mostraridProductoEspeci);
		//this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_empresaProductoEspeci.setVisible(this.productoespeciConstantesFunciones.mostrarid_empresaProductoEspeci);
		this.jInternalFrameDetalleFormProductoEspeci.jPanelid_empresaProductoEspeci.setVisible(this.productoespeciConstantesFunciones.mostrarid_empresaProductoEspeci);
		//this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_sucursalProductoEspeci.setVisible(this.productoespeciConstantesFunciones.mostrarid_sucursalProductoEspeci);
		this.jInternalFrameDetalleFormProductoEspeci.jPanelid_sucursalProductoEspeci.setVisible(this.productoespeciConstantesFunciones.mostrarid_sucursalProductoEspeci);
		//this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_productoProductoEspeci.setVisible(this.productoespeciConstantesFunciones.mostrarid_productoProductoEspeci);
		this.jInternalFrameDetalleFormProductoEspeci.jPanelid_productoProductoEspeci.setVisible(this.productoespeciConstantesFunciones.mostrarid_productoProductoEspeci);
			this.jInternalFrameDetalleFormProductoEspeci.jButtonid_productoProductoEspeci.setVisible(this.productoespeciConstantesFunciones.mostrarid_productoProductoEspeci);
		//this.jInternalFrameDetalleFormProductoEspeci.jTextAreaespecificacionProductoEspeci.setVisible(this.productoespeciConstantesFunciones.mostrarespecificacionProductoEspeci);
		this.jInternalFrameDetalleFormProductoEspeci.jPanelespecificacionProductoEspeci.setVisible(this.productoespeciConstantesFunciones.mostrarespecificacionProductoEspeci);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoEspeci() throws Exception {
		if(this.jInternalFrameDetalleFormProductoEspeci==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoEspeci!=null) {
	
		this.jInternalFrameDetalleFormProductoEspeci.jLabelidProductoEspeci.setEnabled(this.productoespeciConstantesFunciones.activaridProductoEspeci);
		this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_empresaProductoEspeci.setEnabled(this.productoespeciConstantesFunciones.activarid_empresaProductoEspeci);
		this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_sucursalProductoEspeci.setEnabled(this.productoespeciConstantesFunciones.activarid_sucursalProductoEspeci);
		this.jInternalFrameDetalleFormProductoEspeci.jComboBoxid_productoProductoEspeci.setEnabled(this.productoespeciConstantesFunciones.activarid_productoProductoEspeci);
			this.jInternalFrameDetalleFormProductoEspeci.jButtonid_productoProductoEspeci.setEnabled(this.productoespeciConstantesFunciones.activarid_productoProductoEspeci);
		this.jInternalFrameDetalleFormProductoEspeci.jTextAreaespecificacionProductoEspeci.setEnabled(this.productoespeciConstantesFunciones.activarespecificacionProductoEspeci);
		}
	}
	
		
}