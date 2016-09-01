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

import com.bydan.erp.inventario.util.ProductoReemplaConstantesFunciones;
import com.bydan.erp.inventario.util.ProductoReemplaParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ProductoReemplaParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ProductoReemplaBean;
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
public class ProductoReemplaBeanSwingJInternalFrame extends ProductoReemplaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoReemplaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoReempla> productoreemplaValidator = new ClassValidator<ProductoReempla>(ProductoReempla.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoReempla productoreempla;	
	public ProductoReempla productoreemplaAux;
	public ProductoReempla productoreemplaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoReempla productoreemplaTotales;
	public Long idProductoReemplaActual;
	public Long iIdNuevoProductoReempla=0L;
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

	public String sFinalQueryComboProductoReempla="";

	public List<ProductoReempla> productoreemplasForeignKey;

	public List<ProductoReempla> getproductoreemplasForeignKey() {
		return productoreemplasForeignKey;
	}

	public void setproductoreemplasForeignKey(List<ProductoReempla> productoreemplasForeignKey) {
		this.productoreemplasForeignKey = productoreemplasForeignKey;
	}

	//OBJETO FK ACTUAL
	public ProductoReempla productoreemplaForeignKey;

	public ProductoReempla getproductoreemplaForeignKey() {
		return productoreemplaForeignKey;
	}

	public void setproductoreemplaForeignKey(ProductoReempla productoreemplaForeignKey) {
		this.productoreemplaForeignKey = productoreemplaForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idProductoActual=0L;

	public Long getidProductoActual() {
		return idProductoActual;
	}

	public void setidProductoActual(Long idProductoActual) {
		this.idProductoActual= idProductoActual;
	}
	
	

	public Boolean isTienePermisosProductoReempla=false;

	public Boolean getIsTienePermisosProductoReempla() {
		return isTienePermisosProductoReempla;
	}

	public void setIsTienePermisosProductoReempla(Boolean isTienePermisosProductoReempla) {
		this.isTienePermisosProductoReempla= isTienePermisosProductoReempla;
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
	
	public Boolean isPermisoTodoProductoReempla;
	public Boolean isPermisoNuevoProductoReempla;
	public Boolean isPermisoActualizarProductoReempla;
	public Boolean isPermisoActualizarOriginalProductoReempla;
	public Boolean isPermisoEliminarProductoReempla;
	public Boolean isPermisoGuardarCambiosProductoReempla;
	public Boolean isPermisoConsultaProductoReempla;
	public Boolean isPermisoBusquedaProductoReempla;
	public Boolean isPermisoReporteProductoReempla;
	public Boolean isPermisoPaginacionMedioProductoReempla;
	public Boolean isPermisoPaginacionAltoProductoReempla;
	public Boolean isPermisoPaginacionTodoProductoReempla;
	public Boolean isPermisoCopiarProductoReempla;
	public Boolean isPermisoVerFormProductoReempla;
	public Boolean isPermisoDuplicarProductoReempla;
	public Boolean isPermisoOrdenProductoReempla;
	
	public List<ProductoReempla> productoreemplasArbol;
	
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
	
	public ProductoReemplaParameterReturnGeneral productoreemplaReturnGeneral;
	public ProductoReemplaParameterReturnGeneral productoreemplaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoReempla=false;
	public Boolean esParaAccionDesdeFormularioProductoReempla=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoReemplaSessionBeanAdditional productoreemplaSessionBeanAdditional=null;
	
	public ProductoReemplaSessionBeanAdditional getProductoReemplaSessionBeanAdditional() {
		return this.productoreemplaSessionBeanAdditional;
	}
	
	public void setProductoReemplaSessionBeanAdditional(ProductoReemplaSessionBeanAdditional productoreemplaSessionBeanAdditional) {
		try {
			this.productoreemplaSessionBeanAdditional=productoreemplaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoReemplaBeanSwingJInternalFrameAdditional productoreemplaBeanSwingJInternalFrameAdditional=null;
	//public class ProductoReemplaBeanSwingJInternalFrame
	
	public ProductoReemplaBeanSwingJInternalFrameAdditional getProductoReemplaBeanSwingJInternalFrameAdditional() {
		return this.productoreemplaBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoReemplaBeanSwingJInternalFrameAdditional(ProductoReemplaBeanSwingJInternalFrameAdditional productoreemplaBeanSwingJInternalFrameAdditional) {
		try {
			this.productoreemplaBeanSwingJInternalFrameAdditional=productoreemplaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoReemplaLogic productoreemplaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoReempla productoreemplaBean;
	public ProductoReemplaConstantesFunciones productoreemplaConstantesFunciones;
	//public ProductoReemplaParameterReturnGeneral productoreemplaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoReempla> productoreemplas;	
	//public List<ProductoReempla> productoreemplasEliminados;
	//public List<ProductoReempla> productoreemplasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoReempla=false;
	public Boolean isVisibilidadCeldaDuplicarProductoReempla=true;
	public Boolean isVisibilidadCeldaCopiarProductoReempla=true;
	public Boolean isVisibilidadCeldaVerFormProductoReempla=true;
	public Boolean isVisibilidadCeldaOrdenProductoReempla=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoReempla=false;
	public Boolean isVisibilidadCeldaModificarProductoReempla=false;
	public Boolean isVisibilidadCeldaActualizarProductoReempla=false;
	public Boolean isVisibilidadCeldaEliminarProductoReempla=false;
	public Boolean isVisibilidadCeldaCancelarProductoReempla=false;
	public Boolean isVisibilidadCeldaGuardarProductoReempla=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoReempla=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdProductoReempla=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProductoReempla() {
		return this.iIdNuevoProductoReempla;
	}

	public void setiIdNuevoProductoReempla(Long iIdNuevoProductoReempla) {
		this.iIdNuevoProductoReempla = iIdNuevoProductoReempla;
	}
	
	public Long getidProductoReemplaActual() {
		return this.idProductoReemplaActual;
	}

	public void setidProductoReemplaActual(Long idProductoReemplaActual) {
		this.idProductoReemplaActual = idProductoReemplaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoReempla getproductoreempla() {
		return this.productoreempla;
	}

	public void setproductoreempla(ProductoReempla productoreempla) {
		this.productoreempla = productoreempla;
	}
	
	public ProductoReempla getproductoreemplaAux() {
		return this.productoreemplaAux;
	}

	public void setproductoreemplaAux(ProductoReempla productoreemplaAux) {
		this.productoreemplaAux = productoreemplaAux;
	}				
	
	public ProductoReempla getproductoreemplaAnterior() {
		return this.productoreemplaAnterior;
	}

	public void setproductoreemplaAnterior(ProductoReempla productoreemplaAnterior) {
		this.productoreemplaAnterior = productoreemplaAnterior;
	}	
	
	public ProductoReempla getproductoreemplaTotales() {
		return this.productoreemplaTotales;
	}

	public void setproductoreemplaTotales(ProductoReempla productoreemplaTotales) {
		this.productoreemplaTotales = productoreemplaTotales;
	}	
	
	public ProductoReempla getproductoreemplaBean() {
		return this.productoreemplaBean;
	}

	public void setproductoreemplaBean(ProductoReempla productoreemplaBean) {
		this.productoreemplaBean = productoreemplaBean;
	}	
	
	public ProductoReemplaParameterReturnGeneral getproductoreemplaReturnGeneral() {
		return this.productoreemplaReturnGeneral;
	}

	public void setproductoreemplaReturnGeneral(ProductoReemplaParameterReturnGeneral productoreemplaReturnGeneral) {
		this.productoreemplaReturnGeneral = productoreemplaReturnGeneral;
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

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
	}

	public Long id_producto_reemplaFK_IdProductoReempla=-1L;

	public Long getid_producto_reemplaFK_IdProductoReempla() {
		return this.id_producto_reemplaFK_IdProductoReempla;
	}

	public void setid_producto_reemplaFK_IdProductoReempla(Long id_producto_reemplaFK_IdProductoReempla) {
		this.id_producto_reemplaFK_IdProductoReempla = id_producto_reemplaFK_IdProductoReempla;
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
	
	
	public ProductoReemplaLogic getProductoReemplaLogic()	{		
		return productoreemplaLogic;
	}

	public void setProductoReemplaLogic(ProductoReemplaLogic productoreemplaLogic) {
		this.productoreemplaLogic = productoreemplaLogic;
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
	
	public Boolean getIsEsNuevoProductoReempla() {
		return isEsNuevoProductoReempla;
	}

	public void setIsEsNuevoProductoReempla(Boolean isEsNuevoProductoReempla) {
		this.isEsNuevoProductoReempla = isEsNuevoProductoReempla;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoReempla() {
		return esParaAccionDesdeFormularioProductoReempla;
	}
	
	public void setEsParaAccionDesdeFormularioProductoReempla(Boolean esParaAccionDesdeFormularioProductoReempla) {
		this.esParaAccionDesdeFormularioProductoReempla = esParaAccionDesdeFormularioProductoReempla;
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

			if(this.productoreemplaSessionBean==null) {
				this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
			}

			if(!this.productoreemplaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productoreemplaSessionBean.getlidEmpresaActual());
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

			if(this.productoreemplaSessionBean==null) {
				this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
			}

			if(!this.productoreemplaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(productoreemplaSessionBean.getlidSucursalActual());
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

			if(this.productoreemplaSessionBean==null) {
				this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
			}

			if(!this.productoreemplaSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(productoreemplaSessionBean.getlidBodegaActual());
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

			if(this.productoreemplaSessionBean==null) {
				this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
			}

			if(!this.productoreemplaSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(productoreemplaSessionBean.getlidProductoActual());
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

	public void cargarCombosProductoReemplasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.productoreemplasForeignKey=new ArrayList<ProductoReempla>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProductoReemplaLogic productoreemplaLogic=new ProductoReemplaLogic();

			//productoreemplaLogic.getProductoReemplaDataAccess().setIsForForeingKeyData(true);

			if(this.productoreemplaSessionBean==null) {
				this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
			}

			if(!this.productoreemplaSessionBean.getisBusquedaDesdeForeignKeySesionProductoReempla()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productoreemplaLogic.getProductoReemplaDataAccess().setIsForForeingKeyData(true);

					productoreemplaLogic.getTodosProductoReemplasWithConnection(sFinalQuery,new Pagination());

					this.productoreemplasForeignKey=productoreemplaLogic.getProductoReemplas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProductoReempla(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoreemplaLogic.getEntityWithConnection(productoreemplaSessionBean.getlidProductoReemplaActual());
					this.productoreemplasForeignKey.add(productoreemplaLogic.getProductoReempla());
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

					if(this.productoreempla!=null) {
						this.productoreempla.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoReempla!=null) {
						this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_empresaProductoReempla.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductoReempla.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductoReempla!=null) {
						if(this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_empresaProductoReempla.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_empresaProductoReempla.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductoReemplaGenerico)throws Exception
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
				jComboBoxid_empresaProductoReemplaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductoReemplaGenerico!=null && jComboBoxid_empresaProductoReemplaGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductoReemplaGenerico.setSelectedIndex(0);
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

					if(this.productoreempla!=null) {
						this.productoreempla.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProductoReempla!=null) {
						this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_sucursalProductoReempla.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProductoReempla.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProductoReempla!=null) {
						if(this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_sucursalProductoReempla.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_sucursalProductoReempla.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProductoReemplaGenerico)throws Exception
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
				jComboBoxid_sucursalProductoReemplaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProductoReemplaGenerico!=null && jComboBoxid_sucursalProductoReemplaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProductoReemplaGenerico.setSelectedIndex(0);
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

					if(this.productoreempla!=null) {
						this.productoreempla.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoReempla!=null) {
						this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_bodegaProductoReempla.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProductoReempla.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProductoReempla!=null) {
						if(this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_bodegaProductoReempla.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_bodegaProductoReempla.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaProductoReempla!=null) {
						jComboBoxid_bodegaFK_IdBodegaProductoReempla.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaProductoReempla!=null) {
							//jComboBoxid_bodegaFK_IdBodegaProductoReempla.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaProductoReempla.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaProductoReempla.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProductoReemplaGenerico)throws Exception
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
				jComboBoxid_bodegaProductoReemplaGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProductoReemplaGenerico!=null && jComboBoxid_bodegaProductoReemplaGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProductoReemplaGenerico.setSelectedIndex(0);
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

					if(this.productoreempla!=null) {
						this.productoreempla.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoReempla!=null) {
						this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_productoProductoReempla.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProductoReempla.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProductoReempla!=null) {
						if(this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_productoProductoReempla.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_productoProductoReempla.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoProductoReempla!=null) {
						jComboBoxid_productoFK_IdProductoProductoReempla.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoProductoReempla!=null) {
							//jComboBoxid_productoFK_IdProductoProductoReempla.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoProductoReempla.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoProductoReempla.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProductoReemplaGenerico)throws Exception
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
				jComboBoxid_productoProductoReemplaGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProductoReemplaGenerico!=null && jComboBoxid_productoProductoReemplaGenerico.getItemCount()>0) {
					jComboBoxid_productoProductoReemplaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProductoReemplaForeignKey(Long idProductoReemplaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			ProductoReempla  productoreemplaTemp=null;

			for(ProductoReempla productoreemplaAux:productoreemplasForeignKey) {
				if(productoreemplaAux.getId()!=null && productoreemplaAux.getId().equals(idProductoReemplaSeleccionado)) {
					productoreemplaTemp=productoreemplaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(productoreemplaTemp!=null) {

					if(this.productoreempla!=null) {
						this.productoreempla.setProductoReempla(productoreemplaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoReempla!=null) {
						this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_producto_reemplaProductoReempla.setSelectedItem(productoreemplaTemp);
					}
				} else {
					//jComboBoxid_producto_reemplaProductoReempla.setSelectedItem(productoreemplaTemp);
					if(this.jInternalFrameDetalleFormProductoReempla!=null) {
						if(this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_producto_reemplaProductoReempla.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_producto_reemplaProductoReempla.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProductoReempla") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoreemplaTemp!=null && jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla!=null) {
						jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla.setSelectedItem(productoreemplaTemp);
					} else {
						if(jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla!=null) {
							//jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla.setSelectedItem(productoreemplaTemp);
							if(jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla.getItemCount()>0) {
								jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla.setSelectedIndex(0);
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

	public String getActualProductoReemplaForeignKeyDescripcion(Long idProductoReemplaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			ProductoReempla  productoreemplaTemp=null;

			for(ProductoReempla productoreemplaAux:productoreemplasForeignKey) {
				if(productoreemplaAux.getId()!=null && productoreemplaAux.getId().equals(idProductoReemplaSeleccionado)) {
					productoreemplaTemp=productoreemplaAux;
					break;
				}
			}


			sDescripcion=ProductoReemplaConstantesFunciones.getProductoReemplaDescripcion(productoreemplaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProductoReemplaForeignKeyGenerico(Long idProductoReemplaSeleccionado,JComboBox jComboBoxid_producto_reemplaProductoReemplaGenerico)throws Exception
	{
		try
		{
			ProductoReempla  productoreemplaTemp=null;

			for(ProductoReempla productoreemplaAux:productoreemplasForeignKey) {
				if(productoreemplaAux.getId()!=null && productoreemplaAux.getId().equals(idProductoReemplaSeleccionado)) {
					productoreemplaTemp=productoreemplaAux;
					break;
				}
			}

			if(productoreemplaTemp!=null) {
				jComboBoxid_producto_reemplaProductoReemplaGenerico.setSelectedItem(productoreemplaTemp);
			} else {
				if(jComboBoxid_producto_reemplaProductoReemplaGenerico!=null && jComboBoxid_producto_reemplaProductoReemplaGenerico.getItemCount()>0) {
					jComboBoxid_producto_reemplaProductoReemplaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProductoReempla productoreempla,JComboBox jComboBoxid_empresaProductoReemplaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductoReemplaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_empresaProductoReempla.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductoReemplaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productoreempla.setid_empresa(empresaAux.getId());
				productoreempla.setempresa_descripcion(ProductoReemplaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productoreempla.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProductoReempla productoreempla,JComboBox jComboBoxid_sucursalProductoReemplaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProductoReemplaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_sucursalProductoReempla.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProductoReemplaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				productoreempla.setid_sucursal(sucursalAux.getId());
				productoreempla.setsucursal_descripcion(ProductoReemplaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				productoreempla.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProductoReempla productoreempla,JComboBox jComboBoxid_bodegaProductoReemplaGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProductoReemplaGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_bodegaProductoReempla.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProductoReemplaGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				productoreempla.setid_bodega(bodegaAux.getId());
				productoreempla.setbodega_descripcion(ProductoReemplaConstantesFunciones.getBodegaDescripcion(bodegaAux));
				productoreempla.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProductoReempla productoreempla,JComboBox jComboBoxid_productoProductoReemplaGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProductoReemplaGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_productoProductoReempla.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProductoReemplaGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				productoreempla.setid_producto(productoAux.getId());
				productoreempla.setproducto_descripcion(ProductoReemplaConstantesFunciones.getProductoDescripcion(productoAux));
				productoreempla.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoReemplaForeignKey(ProductoReempla productoreempla,JComboBox jComboBoxid_producto_reemplaProductoReemplaGenerico)throws Exception
	{
		try
		{
			ProductoReempla  productoreemplaAux=new ProductoReempla();

			if(jComboBoxid_producto_reemplaProductoReemplaGenerico==null) {
				productoreemplaAux=(ProductoReempla)this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_producto_reemplaProductoReempla.getSelectedItem();
			} else {
				productoreemplaAux=(ProductoReempla)jComboBoxid_producto_reemplaProductoReemplaGenerico.getSelectedItem();
			}

			if(productoreemplaAux!=null && productoreemplaAux.getId()!=null) {
				productoreempla.setid_producto_reempla(productoreemplaAux.getId());
				productoreempla.setproductoreempla_descripcion(ProductoReemplaConstantesFunciones.getProductoReemplaDescripcion(productoreemplaAux));
				productoreempla.setProductoReempla(productoreemplaAux);			}
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

					if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoReempla!=null) { 
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_empresaProductoReempla.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_empresaProductoReempla.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoReempla!=null) { 
					}

					if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoReempla!=null) { 
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_sucursalProductoReempla.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_sucursalProductoReempla.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoReempla!=null) { 
					}

					if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoReempla!=null) { 
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_bodegaProductoReempla.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_bodegaProductoReempla.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoReempla!=null) { 
					}

					if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProductoReempla.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaProductoReempla.addItem(bodega);
							}
						}

						if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoReempla!=null) { 
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_productoProductoReempla.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_productoProductoReempla.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoReempla!=null) { 
					}

					if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoReempla.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoProductoReempla.addItem(producto);
							}
						}

						if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductoReemplasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProductoReempla=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoReempla!=null) { 
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_producto_reemplaProductoReempla.removeAllItems();

							for(ProductoReempla productoreempla:this.productoreemplasForeignKey) {
								this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_producto_reemplaProductoReempla.addItem(productoreempla);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoReempla!=null) { 
					}

					if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProductoReempla") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla.removeAllItems();

							for(ProductoReempla productoreempla:this.productoreemplasForeignKey) {
								this.jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla.addItem(productoreempla);
							}
						}

						if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductoReempla!=null) {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_empresaProductoReempla.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoReempla!=null) {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_empresaProductoReempla.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoReempla!=null) {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_sucursalProductoReempla.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoReempla!=null) {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_sucursalProductoReempla.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoReempla!=null) {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_bodegaProductoReempla.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoReempla!=null) {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_bodegaProductoReempla.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaProductoReempla.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProductoReempla.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoReempla!=null) {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_productoProductoReempla.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoReempla!=null) {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_productoProductoReempla.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoProductoReempla.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoReempla.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameProductoReemplaForeignKey(ProductoReempla productoreempla,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoReempla!=null) {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_producto_reemplaProductoReempla.setSelectedItem(productoreempla);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoReempla!=null) {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_producto_reemplaProductoReempla.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla.setSelectedItem(productoreempla);
						} else {
							this.jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoReempla() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoReemplaConstantesFunciones.refrescarForeignKeysDescripcionesProductoReempla(this.productoreemplaLogic.getProductoReemplas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoReemplaConstantesFunciones.refrescarForeignKeysDescripcionesProductoReempla(this.productoreemplas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(ProductoReempla.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productoreemplaLogic.setProductoReemplas(this.productoreemplas);
			productoreemplaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoReemplaParameterReturnGeneral getProductoReemplaParameterGeneral() {
		return this.productoreemplaParameterGeneral;
	}
	
	public void setProductoReemplaParameterGeneral(ProductoReemplaParameterReturnGeneral productoreemplaParameterGeneral) {
		this.productoreemplaParameterGeneral = productoreemplaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoReempla() {
		return isPermisoTodoProductoReempla;
	}

	public void setIsPermisoTodoProductoReempla(Boolean isPermisoTodoProductoReempla) {
		this.isPermisoTodoProductoReempla = isPermisoTodoProductoReempla;
	}

	public Boolean getIsPermisoNuevoProductoReempla() {
		return isPermisoNuevoProductoReempla;
	}

	public void setIsPermisoNuevoProductoReempla(Boolean isPermisoNuevoProductoReempla) {
		this.isPermisoNuevoProductoReempla = isPermisoNuevoProductoReempla;
	}

	public Boolean getIsPermisoActualizarProductoReempla() {
		return isPermisoActualizarProductoReempla;
	}

	public void setIsPermisoActualizarProductoReempla(Boolean isPermisoActualizarProductoReempla) {
		this.isPermisoActualizarProductoReempla = isPermisoActualizarProductoReempla;
	}

	public Boolean getIsPermisoEliminarProductoReempla() {
		return isPermisoEliminarProductoReempla;
	}

	public void setIsPermisoEliminarProductoReempla(Boolean isPermisoEliminarProductoReempla) {
		this.isPermisoEliminarProductoReempla = isPermisoEliminarProductoReempla;
	}

	public Boolean getIsPermisoGuardarCambiosProductoReempla() {
		return isPermisoGuardarCambiosProductoReempla;
	}

	public void setIsPermisoGuardarCambiosProductoReempla(Boolean isPermisoGuardarCambiosProductoReempla) {
		this.isPermisoGuardarCambiosProductoReempla = isPermisoGuardarCambiosProductoReempla;
	}
	
	public Boolean getIsPermisoConsultaProductoReempla() {
		return isPermisoConsultaProductoReempla;
	}

	public void setIsPermisoConsultaProductoReempla(Boolean isPermisoConsultaProductoReempla) {
		this.isPermisoConsultaProductoReempla = isPermisoConsultaProductoReempla;
	}

	public Boolean getIsPermisoBusquedaProductoReempla() {
		return isPermisoBusquedaProductoReempla;
	}

	public void setIsPermisoBusquedaProductoReempla(Boolean isPermisoBusquedaProductoReempla) {
		this.isPermisoBusquedaProductoReempla = isPermisoBusquedaProductoReempla;
	}

	public Boolean getIsPermisoReporteProductoReempla() {
		return isPermisoReporteProductoReempla;
	}

	public void setIsPermisoReporteProductoReempla(Boolean isPermisoReporteProductoReempla) {
		this.isPermisoReporteProductoReempla = isPermisoReporteProductoReempla;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoReempla() {
		return isPermisoPaginacionMedioProductoReempla;
	}

	public void setIsPermisoPaginacionMedioProductoReempla(Boolean isPermisoPaginacionMedioProductoReempla) {
		this.isPermisoPaginacionMedioProductoReempla = isPermisoPaginacionMedioProductoReempla;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoReempla() {
		return isPermisoPaginacionTodoProductoReempla;
	}

	public void setIsPermisoPaginacionTodoProductoReempla(Boolean isPermisoPaginacionTodoProductoReempla) {
		this.isPermisoPaginacionTodoProductoReempla = isPermisoPaginacionTodoProductoReempla;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoReempla() {
		return isPermisoPaginacionAltoProductoReempla;
	}

	public void setIsPermisoPaginacionAltoProductoReempla(Boolean isPermisoPaginacionAltoProductoReempla) {
		this.isPermisoPaginacionAltoProductoReempla = isPermisoPaginacionAltoProductoReempla;
	}
	
	public Boolean getIsPermisoCopiarProductoReempla() {
		return isPermisoCopiarProductoReempla;
	}

	public void setIsPermisoCopiarProductoReempla(Boolean isPermisoCopiarProductoReempla) {
		this.isPermisoCopiarProductoReempla = isPermisoCopiarProductoReempla;
	}
	
	public Boolean getIsPermisoVerFormProductoReempla() {
		return isPermisoVerFormProductoReempla;
	}

	public void setIsPermisoVerFormProductoReempla(Boolean isPermisoVerFormProductoReempla) {
		this.isPermisoVerFormProductoReempla = isPermisoVerFormProductoReempla;
	}
	
	public Boolean getIsPermisoDuplicarProductoReempla() {
		return isPermisoDuplicarProductoReempla;
	}

	public void setIsPermisoDuplicarProductoReempla(Boolean isPermisoDuplicarProductoReempla) {
		this.isPermisoDuplicarProductoReempla = isPermisoDuplicarProductoReempla;
	}
	
	public Boolean getIsPermisoOrdenProductoReempla() {
		return isPermisoOrdenProductoReempla;
	}

	public void setIsPermisoOrdenProductoReempla(Boolean isPermisoOrdenProductoReempla) {
		this.isPermisoOrdenProductoReempla = isPermisoOrdenProductoReempla;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoReempla() {
		return isVisibilidadCeldaNuevoProductoReempla;
	}

	public void setIsVisibilidadCeldaNuevoProductoReempla(Boolean isVisibilidadCeldaNuevoProductoReempla) {
		this.isVisibilidadCeldaNuevoProductoReempla = isVisibilidadCeldaNuevoProductoReempla;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoReempla() {
		return isVisibilidadCeldaDuplicarProductoReempla;
	}

	public void setIsVisibilidadCeldaDuplicarProductoReempla(Boolean isVisibilidadCeldaDuplicarProductoReempla) {
		this.isVisibilidadCeldaDuplicarProductoReempla = isVisibilidadCeldaDuplicarProductoReempla;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoReempla() {
		return isVisibilidadCeldaCopiarProductoReempla;
	}

	public void setIsVisibilidadCeldaCopiarProductoReempla(Boolean isVisibilidadCeldaCopiarProductoReempla) {
		this.isVisibilidadCeldaCopiarProductoReempla = isVisibilidadCeldaCopiarProductoReempla;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoReempla() {
		return isVisibilidadCeldaVerFormProductoReempla;
	}

	public void setIsVisibilidadCeldaVerFormProductoReempla(Boolean isVisibilidadCeldaVerFormProductoReempla) {
		this.isVisibilidadCeldaVerFormProductoReempla = isVisibilidadCeldaVerFormProductoReempla;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoReempla() {
		return isVisibilidadCeldaOrdenProductoReempla;
	}

	public void setIsVisibilidadCeldaOrdenProductoReempla(Boolean isVisibilidadCeldaOrdenProductoReempla) {
		this.isVisibilidadCeldaOrdenProductoReempla = isVisibilidadCeldaOrdenProductoReempla;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoReempla() {
		return isVisibilidadCeldaNuevoRelacionesProductoReempla;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoReempla(Boolean isVisibilidadCeldaNuevoRelacionesProductoReempla) {
		this.isVisibilidadCeldaNuevoRelacionesProductoReempla = isVisibilidadCeldaNuevoRelacionesProductoReempla;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoReempla() {
		return isVisibilidadCeldaModificarProductoReempla;
	}

	public void setIsVisibilidadCeldaModificarProductoReempla(Boolean isVisibilidadCeldaModificarProductoReempla) {
		this.isVisibilidadCeldaModificarProductoReempla = isVisibilidadCeldaModificarProductoReempla;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoReempla() {
		return isVisibilidadCeldaActualizarProductoReempla;
	}

	public void setIsVisibilidadCeldaActualizarProductoReempla(Boolean isVisibilidadCeldaActualizarProductoReempla) {
		this.isVisibilidadCeldaActualizarProductoReempla = isVisibilidadCeldaActualizarProductoReempla;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoReempla() {
		return isVisibilidadCeldaEliminarProductoReempla;
	}

	public void setIsVisibilidadCeldaEliminarProductoReempla(Boolean isVisibilidadCeldaEliminarProductoReempla) {
		this.isVisibilidadCeldaEliminarProductoReempla = isVisibilidadCeldaEliminarProductoReempla;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoReempla() {
		return isVisibilidadCeldaCancelarProductoReempla;
	}

	public void setIsVisibilidadCeldaCancelarProductoReempla(Boolean isVisibilidadCeldaCancelarProductoReempla) {
		this.isVisibilidadCeldaCancelarProductoReempla = isVisibilidadCeldaCancelarProductoReempla;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoReempla() {
		return isVisibilidadCeldaGuardarProductoReempla;
	}

	public void setIsVisibilidadCeldaGuardarProductoReempla(Boolean isVisibilidadCeldaGuardarProductoReempla) {
		this.isVisibilidadCeldaGuardarProductoReempla = isVisibilidadCeldaGuardarProductoReempla;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoReempla() {
		return isVisibilidadCeldaGuardarCambiosProductoReempla;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoReempla(Boolean isVisibilidadCeldaGuardarCambiosProductoReempla) {
		this.isVisibilidadCeldaGuardarCambiosProductoReempla = isVisibilidadCeldaGuardarCambiosProductoReempla;
	}
		
	public ProductoReemplaSessionBean getproductoreemplaSessionBean() {
		return this.productoreemplaSessionBean;
	}
	
	public void setproductoreemplaSessionBean(ProductoReemplaSessionBean productoreemplaSessionBean) {
		this.productoreemplaSessionBean=productoreemplaSessionBean;
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

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	public Boolean getisVisibilidadFK_IdProductoReempla() {
		return this.isVisibilidadFK_IdProductoReempla;
	}

	public void setisVisibilidadFK_IdProductoReempla(Boolean isVisibilidadFK_IdProductoReempla) {
		this.isVisibilidadFK_IdProductoReempla=isVisibilidadFK_IdProductoReempla;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoReempla(ProductoReempla productoreempla)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(productoreempla,null);
				this.setActualParaGuardarSucursalForeignKey(productoreempla,null);
				this.setActualParaGuardarBodegaForeignKey(productoreempla,null);
				this.setActualParaGuardarProductoForeignKey(productoreempla,null);
				this.setActualParaGuardarProductoReemplaForeignKey(productoreempla,null);
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
	
	public void bugActualizarReferenciaActual(ProductoReempla productoreempla,ProductoReempla productoreemplaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoReempla(productoreempla);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productoreemplaAux.setId(productoreempla.getId());
		productoreemplaAux.setVersionRow(productoreempla.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoReempla();
		
			int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoReempla(this.productoreempla,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productoreemplaValidator.getInvalidValues(this.productoreempla);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productoreemplaLogic.setDatosCliente(datosCliente);
			productoreemplaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productoreemplaAux=new  ProductoReempla();
				
				productoreemplaAux.setIsNew(true);
				productoreemplaAux.setIsChanged(true);
				
				productoreemplaAux.setProductoReemplaOriginal(this.productoreempla);
				
				productoreemplaAux.setId(this.productoreempla.getId());	
				productoreemplaAux.setVersionRow(this.productoreempla.getVersionRow());	
				productoreemplaAux.setid_empresa(this.productoreempla.getid_empresa());	
				productoreemplaAux.setid_sucursal(this.productoreempla.getid_sucursal());	
				productoreemplaAux.setid_bodega(this.productoreempla.getid_bodega());	
				productoreemplaAux.setid_producto(this.productoreempla.getid_producto());	
				productoreemplaAux.setid_producto_reempla(this.productoreempla.getid_producto_reempla());	
				productoreemplaAux.setdescripcion(this.productoreempla.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoreemplaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoreemplaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productoreemplaAux,productoreemplaLogic.getProductoReemplas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoreemplaAux,productoreemplas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productoreemplaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoreemplaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoreemplaLogic.saveProductoReemplas();//WithConnection
						//productoreemplaLogic.getSetVersionRowProductoReemplas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoreempla,productoreemplaAux);
					
					this.refrescarForeignKeysDescripcionesProductoReempla();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoreemplaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.getProductoReemplas().addAll(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplas.addAll(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoreemplaLogic.saveProductoReemplaRelaciones(productoreemplaAux,this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.getProductoReemplas());//WithConnection
								//productoreemplaLogic.getSetVersionRowProductoReemplas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoreempla,productoreemplaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.setProductoReemplas(new ArrayList<ProductoReempla>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplas= new ArrayList<ProductoReempla>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.quitarFilaTotales();}
							productoreemplaAux.setProductoReemplas(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.getProductoReemplas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoreemplaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoreemplaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoreemplaAux,productoreemplaLogic.getProductoReemplas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoreemplaAux,productoreemplas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoreempla,productoreemplaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productoreemplaAux=new  ProductoReempla();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productoreemplaSessionBean.getEsGuardarRelacionado() 
					|| (this.productoreemplaSessionBean.getEsGuardarRelacionado() && this.productoreempla.getId()>=0)) {
						
					productoreemplaAux.setIsNew(false);
				}
				
				productoreemplaAux.setIsDeleted(false);
			
				productoreemplaAux.setId(this.productoreempla.getId());	
				productoreemplaAux.setVersionRow(this.productoreempla.getVersionRow());	
				productoreemplaAux.setid_empresa(this.productoreempla.getid_empresa());	
				productoreemplaAux.setid_sucursal(this.productoreempla.getid_sucursal());	
				productoreemplaAux.setid_bodega(this.productoreempla.getid_bodega());	
				productoreemplaAux.setid_producto(this.productoreempla.getid_producto());	
				productoreemplaAux.setid_producto_reempla(this.productoreempla.getid_producto_reempla());	
				productoreemplaAux.setdescripcion(this.productoreempla.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoreemplaAux,productoreemplaLogic.getProductoReemplas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoreemplaAux,productoreemplas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productoreemplaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoreemplaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoreemplaLogic.saveProductoReemplas();//WithConnection
						//productoreemplaLogic.getSetVersionRowProductoReemplas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoreempla,productoreemplaAux);
					
					this.refrescarForeignKeysDescripcionesProductoReempla();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoreemplaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.getProductoReemplas().addAll(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplas.addAll(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoreemplaLogic.saveProductoReemplaRelaciones(productoreemplaAux,this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.getProductoReemplas());//WithConnection
								//productoreemplaLogic.getSetVersionRowProductoReemplas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoreempla,productoreemplaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.setProductoReemplas(new ArrayList<ProductoReempla>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplas= new ArrayList<ProductoReempla>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.quitarFilaTotales();}
							productoreemplaAux.setProductoReemplas(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.getProductoReemplas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoreemplaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoreemplaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoreemplaAux,productoreemplaLogic.getProductoReemplas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoreemplaAux,productoreemplas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoreempla,productoreemplaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productoreemplaAux=new  ProductoReempla();
				
				productoreemplaAux.setIsNew(false);
				productoreemplaAux.setIsChanged(false);
				
				productoreemplaAux.setIsDeleted(true);
				
				productoreemplaAux.setId(this.productoreempla.getId());	
				productoreemplaAux.setVersionRow(this.productoreempla.getVersionRow());	
				productoreemplaAux.setid_empresa(this.productoreempla.getid_empresa());	
				productoreemplaAux.setid_sucursal(this.productoreempla.getid_sucursal());	
				productoreemplaAux.setid_bodega(this.productoreempla.getid_bodega());	
				productoreemplaAux.setid_producto(this.productoreempla.getid_producto());	
				productoreemplaAux.setid_producto_reempla(this.productoreempla.getid_producto_reempla());	
				productoreemplaAux.setdescripcion(this.productoreempla.getdescripcion());	
				
				if(this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productoreemplaAux.getId()>=0) {	
						this.productoreemplasEliminados.add(productoreemplaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productoreemplaAux,productoreemplaLogic.getProductoReemplas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoreemplaAux,productoreemplas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productoreemplaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoreemplaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoreemplaLogic.saveProductoReemplas();//WithConnection
						//productoreemplaLogic.getSetVersionRowProductoReemplas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoreemplaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.getProductoReemplas().addAll(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplas.addAll(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoreemplaLogic.saveProductoReemplaRelaciones(productoreemplaAux,this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.getProductoReemplas());//WithConnection
								//productoreemplaLogic.getSetVersionRowProductoReemplas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.setProductoReemplas(new ArrayList<ProductoReempla>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplas= new ArrayList<ProductoReempla>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.quitarFilaTotales();}
							productoreemplaAux.setProductoReemplas(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.getProductoReemplas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.productoreemplaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productoreemplaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productoreemplaAux,productoreemplaLogic.getProductoReemplas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productoreemplaAux,productoreemplas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.getProductoReemplas().addAll(this.productoreemplasEliminados);
					
					productoreemplaLogic.saveProductoReemplas();//WithConnection
					//productoreemplaLogic.getSetVersionRowProductoReemplas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoReempla();
				
				this.productoreemplasEliminados= new ArrayList<ProductoReempla>();		
			}
			
			if(this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
			//ACTUALIZA ARBOL
			this.getTodosProductoReemplaArbol();
			
			//TO_OPTIMIZE POR TIPO FK NO TODOS
			this.inicializarCombosForeignKeyProductoReemplaListas();
			
			this.cargarCombosForeignKeyProductoReempla(false);
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoreemplaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Reemplazo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Reemplazo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productoreempla=productoreemplaAux;
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
      		//this.finishProcessProductoReempla();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoReempla productoreemplaLocal) throws Exception {
		
		if(this.productoreemplaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				productoreemplaLocal.setProductoReemplas(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.getProductoReemplas());
			
			} else {
			
				productoreemplaLocal.setProductoReemplas(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoReempla productoreemplaLocal) throws Exception {	
		if(this.productoreemplaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productoreemplaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				productoreemplaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				productoreemplaLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				productoreemplaLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoReemplaDetalleFormJInternalFrame.class)) {
				ProductoReemplaBeanSwingJInternalFrame productoreemplaBeanSwingJInternalFrameLocal=(ProductoReemplaBeanSwingJInternalFrame) ((ProductoReemplaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoreemplaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProductoReempla(productoreemplaBeanSwingJInternalFrameLocal.getproductoreempla(),true);
				productoreemplaBeanSwingJInternalFrameLocal.actualizarLista(productoreemplaBeanSwingJInternalFrameLocal.productoreempla,this.productoreemplasForeignKey);

				productoreemplaBeanSwingJInternalFrameLocal.actualizarRelaciones(productoreemplaBeanSwingJInternalFrameLocal.productoreempla);

				productoreemplaLocal.setProductoReempla(productoreemplaBeanSwingJInternalFrameLocal.productoreempla);

				this.addItemDefectoCombosForeignKeyProductoReempla();
				this.cargarCombosFrameProductoReemplasForeignKey("Formulario");
				this.setActualProductoReemplaForeignKey(productoreemplaBeanSwingJInternalFrameLocal.productoreempla.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoReemplaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productoreemplaValidator.getInvalidValues(this.productoreempla);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoReempla productoreempla,List<ProductoReempla> productoreemplas) throws Exception {
		try	{		
			ProductoReemplaConstantesFunciones.actualizarLista(productoreempla,productoreemplas,this.productoreemplaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoReempla productoreempla,List<ProductoReempla> productoreemplas) throws Exception {
		try	{			
			ProductoReemplaConstantesFunciones.actualizarSelectedLista(productoreempla,productoreemplas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoReempla> productoreemplasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productoreemplasLocal=this.productoreemplaLogic.getProductoReemplas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productoreemplasLocal=this.productoreemplas;
			}
			//ARCHITECTURE
		
			for(ProductoReempla productoreemplaLocal:productoreemplasLocal) {
				if(this.permiteMantenimiento(productoreemplaLocal) && productoreemplaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoReemplaConstantesFunciones.getProductoReemplaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoReemplaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoReempla.jLabelid_empresaProductoReempla,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoReemplaConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoReempla.jLabelid_sucursalProductoReempla,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoReemplaConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoReempla.jLabelid_bodegaProductoReempla,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoReemplaConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoReempla.jLabelid_productoProductoReempla,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoReemplaConstantesFunciones.IDPRODUCTOREEMPLA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoReempla.jLabelid_producto_reemplaProductoReempla,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoReemplaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoReempla.jLabeldescripcionProductoReempla,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoReempla.jLabelid_empresaProductoReempla,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoReempla.jLabelid_sucursalProductoReempla,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoReempla.jLabelid_bodegaProductoReempla,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoReempla.jLabelid_productoProductoReempla,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoReempla.jLabelid_producto_reemplaProductoReempla,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoReempla.jLabeldescripcionProductoReempla,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ProductoReempla")) {
			if(this.productoreempla==null) {
				this.productoreempla= new ProductoReempla();
			}

			if(this.productoreemplaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProductoReempla
				this.setVariablesFormularioToObjetoActualProductoReempla(this.productoreempla,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);

				this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.getproductoreempla().setProductoReempla(this.productoreempla);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoProductoReempla--;	
		
		
		this.productoreemplaAux=new ProductoReempla();
		
		this.productoreemplaAux.setId(this.iIdNuevoProductoReempla);
		this.productoreemplaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoreemplaLogic.getProductoReemplas().add(this.productoreemplaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productoreemplas.add(this.productoreemplaAux);
		}
		//ARCHITECTURE
		
		this.productoreempla=this.productoreemplaAux;
		
		if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoReempla(this.productoreempla);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoReempla(this.productoreempla);
		}
				
		//this.setDefaultControlesProductoReempla();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoReempla();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoReempla();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoReempla();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoReempla(this.productoreemplaBean,this.productoreempla,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoReemplaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productoreemplaSessionBean.getConGuardarRelaciones()) {
			classes=ProductoReemplaConstantesFunciones.getClassesRelationshipsOfProductoReempla(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productoreemplaReturnGeneral=productoreemplaLogic.procesarEventosProductoReemplasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoreemplaLogic.getProductoReemplas(),this.productoreempla,this.productoreemplaParameterGeneral,this.isEsNuevoProductoReempla,classes);//this.productoreemplaLogic.getProductoReempla()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoReempla(this.productoreemplaReturnGeneral,this.productoreemplaBean,false);
		
		if(this.productoreemplaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoReempla(this.productoreemplaReturnGeneral.getProductoReempla());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoReempla(this.productoreemplaReturnGeneral.getProductoReempla());
		}
		
		if(this.productoreemplaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoReempla(this.productoreemplaReturnGeneral.getProductoReempla(),classes);//this.productoreemplaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoReempla(this.productoreempla,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoReempla();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoReempla();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoReemplaBeanSwingJInternalFrameAdditional.RecargarFormProductoReempla(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoReempla(false);
						
			if(productoreemplaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaSessionBean.getEsGuardarRelacionado() && ProductoReemplaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoReemplaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoReempla();
			}
			
			this.actualizarVisualTableDatosProductoReempla();
			
			this.jTableDatosProductoReempla.setRowSelectionInterval(this.getIndiceNuevoProductoReempla(), this.getIndiceNuevoProductoReempla());
			
			this.seleccionarFilaTablaProductoReemplaActual();
						
			this.actualizarEstadoCeldasBotonesProductoReempla("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoReempla(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoReempla.jTextAreadescripcionProductoReempla.setEnabled(isHabilitar && this.productoreemplaConstantesFunciones.activardescripcionProductoReempla);	
		//
		this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_empresaProductoReempla.setEnabled(isHabilitar && this.productoreemplaConstantesFunciones.activarid_empresaProductoReempla);//
		this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_sucursalProductoReempla.setEnabled(isHabilitar && this.productoreemplaConstantesFunciones.activarid_sucursalProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_bodegaProductoReempla.setEnabled(isHabilitar && this.productoreemplaConstantesFunciones.activarid_bodegaProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_productoProductoReempla.setEnabled(isHabilitar && this.productoreemplaConstantesFunciones.activarid_productoProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_producto_reemplaProductoReempla.setEnabled(isHabilitar && this.productoreemplaConstantesFunciones.activarid_producto_reemplaProductoReempla);
	};
	
	public void setDefaultControlesProductoReempla() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoReempla(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productoreemplaSessionBean.setConGuardarRelaciones(true);			
			this.productoreemplaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoReempla.jTabbedPaneRelacionesProductoReempla.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.productoreemplaSessionBean.setConGuardarRelaciones(false);			
			this.productoreemplaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoReempla.jTabbedPaneRelacionesProductoReempla.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoProductoReempla() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoReempla productoreemplaAux:this.productoreemplaLogic.getProductoReemplas()) {
				if(productoreemplaAux.getId().equals(this.iIdNuevoProductoReempla)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoReempla productoreemplaAux:this.productoreemplas) {
				if(productoreemplaAux.getId().equals(this.iIdNuevoProductoReempla)) {
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
	
	public int getIndiceActualProductoReempla(ProductoReempla productoreempla,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoReempla productoreemplaAux:this.productoreemplaLogic.getProductoReemplas()) {
				if(productoreemplaAux.getId().equals(productoreempla.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoReempla productoreemplaAux:this.productoreemplas) {
				if(productoreemplaAux.getId().equals(productoreempla.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoReempla(ProductoReempla productoreemplaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoReempla productoreemplaAux:this.productoreemplaLogic.getProductoReemplas()) {
				if(productoreemplaAux.getProductoReemplaOriginal().getId().equals(productoreemplaOriginal.getId())) {
					existe=true;
					productoreemplaOriginal.setId(productoreemplaAux.getId());
					productoreemplaOriginal.setVersionRow(productoreemplaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoReempla productoreemplaAux:this.productoreemplas) {
				if(productoreemplaAux.getProductoReemplaOriginal().getId().equals(productoreemplaOriginal.getId())) {
					existe=true;
					productoreemplaOriginal.setId(productoreemplaAux.getId());
					productoreemplaOriginal.setVersionRow(productoreemplaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoReempla(Boolean esParaCancelar) throws Exception {
		productoreemplasAux=new ArrayList<ProductoReempla>();
		productoreemplaAux=new ProductoReempla();
		
		if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoReempla productoreemplaAux:this.productoreemplaLogic.getProductoReemplas()) {
					if(productoreemplaAux.getId()<0) {
						productoreemplasAux.add(productoreemplaAux);
					}		
				}
				this.iIdNuevoProductoReempla=0L;
				this.productoreemplaLogic.getProductoReemplas().removeAll(productoreemplasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoReempla productoreemplaAux:this.productoreemplas) {
					if(productoreemplaAux.getId()<0) {
						productoreemplasAux.add(productoreemplaAux);
					}		
				}
				this.iIdNuevoProductoReempla=0L;
				this.productoreemplas.removeAll(productoreemplasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoReempla 
					&& this.productoreemplaLogic.getProductoReemplas().size()>0
					) {
					productoreemplaAux=this.productoreemplaLogic.getProductoReemplas().get(this.productoreemplaLogic.getProductoReemplas().size() - 1);
				
					if(productoreemplaAux.getId()<0) {
						this.productoreemplaLogic.getProductoReemplas().remove(productoreemplaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoReempla && this.productoreemplas.size()>0) {
					productoreemplaAux=this.productoreemplas.get(this.productoreemplas.size() - 1);
				
					if(productoreemplaAux.getId()<0) {
						this.productoreemplas.remove(productoreemplaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoReempla(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productoreempla.getId()<0) {
				this.productoreemplaLogic.getProductoReemplas().remove(this.productoreempla);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productoreempla.getId()<0) {
				this.productoreemplas.remove(this.productoreempla);
			}
		}			
	}
	
	public void setEstadosInicialesProductoReempla(List<ProductoReempla> productoreemplasAux) throws Exception {
		ProductoReemplaConstantesFunciones.setEstadosInicialesProductoReempla(productoreemplasAux);
	}
	
	public void setEstadosInicialesProductoReempla(ProductoReempla productoreemplaAux) throws Exception {
		ProductoReemplaConstantesFunciones.setEstadosInicialesProductoReempla(productoreemplaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoReemplaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoReempla("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoReemplaActual()) {
				if(!this.isEsNuevoProductoReempla) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoReempla("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoReempla=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoReemplaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Reemplazo ?", "MANTENIMIENTO DE Reemplazo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoReempla("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoReempla productoreempla) throws Exception {
		ProductoReemplaConstantesFunciones.seleccionarAsignar(this.productoreempla,productoreempla);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoReempla=this.isPermisoActualizarOriginalProductoReempla;
			
			
			this.seleccionarAsignar(productoreempla);
			
			

			idProductoActual=productoreempla.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoReemplaConstantesFunciones.quitarEspaciosProductoReempla(this.productoreempla,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoReempla("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productoreemplaSessionBean.setsFuncionBusquedaRapida(this.productoreemplaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoProductoReempla) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoReempla(esParaCancelar);				
				this.cancelarNuevoProductoReempla(esParaCancelar);								
			}
			
			this.productoreempla=new ProductoReempla();
			
			this.inicializarProductoReempla();
			
			this.actualizarEstadoCeldasBotonesProductoReempla("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoReempla() throws Exception {
		try {
			ProductoReemplaConstantesFunciones.inicializarProductoReempla(this.productoreempla);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productoreemplaLogic.getProductoReemplas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoReemplas(String sAccionBusqueda,List<ProductoReempla> productoreemplasParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoReempla"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoReemplaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoReemplaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoReempla"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Reemplazos");		
		parameters.put("busquedapor", ProductoReemplaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ProductoReempla.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ProductoReemplaLogic productoreemplaLogicAuxiliar=new ProductoReemplaLogic();
					productoreemplaLogicAuxiliar.setDatosCliente(productoreemplaLogic.getDatosCliente());				
					productoreemplaLogicAuxiliar.setProductoReemplas(productoreemplasParaReportes);
					
					productoreemplaLogicAuxiliar.cargarRelacionesLoteForeignKeyProductoReemplaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					productoreemplasParaReportes=productoreemplaLogicAuxiliar.getProductoReemplas();
					
					//productoreemplaLogic.getNewConnexionToDeep();
					
					//for (ProductoReempla productoreempla:productoreemplasParaReportes) {
					//	productoreemplaLogic.deepLoad(productoreempla, false, DeepLoadType.INCLUDE, classes);
					//}						
					//productoreemplaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//productoreemplaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileProductoReempla = AuxiliarReportes.class.getResourceAsStream("ProductoReemplaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_productoreempla", reportFileProductoReempla);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoReempla=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoReemplaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoReemplaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoReempla=new JRBeanArrayDataSource(ProductoReemplaJInternalFrame.TraerProductoReemplaBeans(productoreemplasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoReempla);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoReemplaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoReemplaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoReemplaBean.TraerProductoReemplaBeans(productoreemplasParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoReemplas(sAccionBusqueda,sTipoArchivoReporte,productoreemplasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoReemplas(sAccionBusqueda,sTipoArchivoReporte,productoreemplasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoReemplaActionPerformed(null);
					//this.generarExcelReporteProductoReemplas(sAccionBusqueda,sTipoArchivoReporte,productoreemplasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoReemplas(sAccionBusqueda,sTipoArchivoReporte,productoreemplasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoReemplas(sAccionBusqueda,sTipoArchivoReporte,productoreemplasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoReemplas(sAccionBusqueda,sTipoArchivoReporte,productoreemplasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoReemplas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoReempla> productoreemplasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoreempla";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoReemplas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoReempla("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoReempla productoreempla : productoreemplasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoReemplaConstantesFunciones.generarExcelReporteDataProductoReempla("NORMAL",row,workbook,productoreempla,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoreemplaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reemplazo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoReempla(String sTipo,Row row,Workbook workbook) {
		
		ProductoReemplaConstantesFunciones.generarExcelReporteHeaderProductoReempla(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoReemplas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoReempla> productoreemplasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoreempla_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoReemplas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoReempla productoreempla : productoreemplasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoReemplaConstantesFunciones.getProductoReemplaDescripcion(productoreempla));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoReemplaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoreempla.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoReemplaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoreempla.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoReemplaConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoreempla.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoreempla.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoreempla.getproductoreempla_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoreempla.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoreemplaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reemplazo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoReemplas(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoReempla> productoreemplasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoReempla> productoreemplasRespaldo=null;
		
		classes=ProductoReemplaConstantesFunciones.getClassesRelationshipsOfProductoReempla(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productoreemplaLogic.setDatosCliente(this.datosCliente);
		this.productoreemplaLogic.setDatosDeep(this.datosDeep);
		this.productoreemplaLogic.setIsConDeep(true);
		
		productoreemplasRespaldo=this.productoreemplaLogic.getProductoReemplas();
		
		this.productoreemplaLogic.setProductoReemplas(productoreemplasParaReportes);	
		this.productoreemplaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productoreemplasParaReportes=this.productoreemplaLogic.getProductoReemplas();
		this.productoreemplaLogic.setProductoReemplas(productoreemplasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoreempla_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoReemplas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoReempla("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoReempla productoreempla : productoreemplasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoReempla("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoReemplaConstantesFunciones.generarExcelReporteDataProductoReempla("NORMAL",row,workbook,productoreempla,cellStyleDataAux);
		
			
			


				//ProductoReempla
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProductoReemplaConstantesFunciones.SCLASSWEBTITULO))) {

				if(productoreempla.getProductoReemplas()!=null && productoreempla.getProductoReemplas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProductoReemplaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProductoReemplaConstantesFunciones.generarExcelReporteHeaderProductoReempla("RELACIONADO",row,workbook);
				}

				if(productoreempla.getProductoReemplas()!=null) {
					i2=0;
					for(ProductoReempla productoreemplaAutoRef : productoreempla.getProductoReemplas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProductoReemplaConstantesFunciones.generarExcelReporteDataProductoReempla("RELACIONADO",row,workbook,productoreemplaAutoRef,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoReemplaConstantesFunciones.getProductoReemplaDescripcion(productoreempla));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoreemplaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reemplazo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoReempla.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoReempla.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoReempla.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoReempla.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoReempla() throws Exception {		
		this.startProcessProductoReempla(true);
	}
	
	public void startProcessProductoReempla(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoReempla ,this.jPanelParametrosReportesProductoReempla, this.jScrollPanelDatosProductoReempla,this.jPanelPaginacionProductoReempla, this.jScrollPanelDatosEdicionProductoReempla, this.jPanelAccionesProductoReempla,this.jPanelAccionesFormularioProductoReempla,this.jmenuBarProductoReempla,this.jmenuBarDetalleProductoReempla,this.jTtoolBarProductoReempla,this.jTtoolBarDetalleProductoReempla);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoReempla=this.jTabbedPaneBusquedasProductoReempla; 
		
		final JPanel jPanelParametrosReportesProductoReempla=this.jPanelParametrosReportesProductoReempla;
		//final JScrollPane jScrollPanelDatosProductoReempla=this.jScrollPanelDatosProductoReempla;
		final JTable jTableDatosProductoReempla=this.jTableDatosProductoReempla;		
		final JPanel jPanelPaginacionProductoReempla=this.jPanelPaginacionProductoReempla;
		//final JScrollPane jScrollPanelDatosEdicionProductoReempla=this.jScrollPanelDatosEdicionProductoReempla;
		final JPanel jPanelAccionesProductoReempla=this.jPanelAccionesProductoReempla;
		
		JPanel jPanelCamposAuxiliarProductoReempla=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoReempla=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) {
			jPanelCamposAuxiliarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jPanelCamposProductoReempla;
			jPanelAccionesFormularioAuxiliarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jPanelAccionesFormularioProductoReempla;
		}
		
		final JPanel jPanelCamposProductoReempla=jPanelCamposAuxiliarProductoReempla;
		final JPanel jPanelAccionesFormularioProductoReempla=jPanelAccionesFormularioAuxiliarProductoReempla;
		
		
		final JMenuBar jmenuBarProductoReempla=this.jmenuBarProductoReempla;
		final JToolBar jTtoolBarProductoReempla=this.jTtoolBarProductoReempla;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoReempla=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoReempla=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) {
			jmenuBarDetalleAuxiliarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jmenuBarDetalleProductoReempla;
			jTtoolBarDetalleAuxiliarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jTtoolBarDetalleProductoReempla;
		}
		
		final JMenuBar jmenuBarDetalleProductoReempla=jmenuBarDetalleAuxiliarProductoReempla;
		final JToolBar jTtoolBarDetalleProductoReempla=jTtoolBarDetalleAuxiliarProductoReempla;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoReempla;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoReempla;
			processRunnable.jTableDatos=jTableDatosProductoReempla;
			processRunnable.jPanelCampos=jPanelCamposProductoReempla;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoReempla;
			processRunnable.jPanelAcciones=jPanelAccionesProductoReempla;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoReempla;
			
			
			processRunnable.jmenuBar=jmenuBarProductoReempla;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoReempla;
			processRunnable.jTtoolBar=jTtoolBarProductoReempla;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoReempla;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoReempla ,jPanelParametrosReportesProductoReempla,jTableDatosProductoReempla, /*jScrollPanelDatosProductoReempla,*/jPanelCamposProductoReempla,jPanelPaginacionProductoReempla, /*jScrollPanelDatosEdicionProductoReempla,*/ jPanelAccionesProductoReempla,jPanelAccionesFormularioProductoReempla,jmenuBarProductoReempla,jmenuBarDetalleProductoReempla,jTtoolBarProductoReempla,jTtoolBarDetalleProductoReempla);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoReempla ,jPanelParametrosReportesProductoReempla, jScrollPanelDatosProductoReempla,jPanelPaginacionProductoReempla, jScrollPanelDatosEdicionProductoReempla, jPanelAccionesProductoReempla,jPanelAccionesFormularioProductoReempla,jmenuBarProductoReempla,jmenuBarDetalleProductoReempla,jTtoolBarProductoReempla,jTtoolBarDetalleProductoReempla);
						
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
	
	public void finishProcessProductoReempla() {// throws Exception 
		this.finishProcessProductoReempla(true);
	}
	
	public void finishProcessProductoReempla(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoReempla ,this.jPanelParametrosReportesProductoReempla, this.jScrollPanelDatosProductoReempla,this.jPanelPaginacionProductoReempla, this.jScrollPanelDatosEdicionProductoReempla, this.jPanelAccionesProductoReempla,this.jPanelAccionesFormularioProductoReempla,this.jmenuBarProductoReempla,this.jmenuBarDetalleProductoReempla,this.jTtoolBarProductoReempla,this.jTtoolBarDetalleProductoReempla);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoReempla=this.jTabbedPaneBusquedasProductoReempla; 
		
		final JPanel jPanelParametrosReportesProductoReempla=this.jPanelParametrosReportesProductoReempla;
		//final JScrollPane jScrollPanelDatosProductoReempla=this.jScrollPanelDatosProductoReempla;
		final JTable jTableDatosProductoReempla=this.jTableDatosProductoReempla;		
		final JPanel jPanelPaginacionProductoReempla=this.jPanelPaginacionProductoReempla;
		//final JScrollPane jScrollPanelDatosEdicionProductoReempla=this.jScrollPanelDatosEdicionProductoReempla;
		final JPanel jPanelAccionesProductoReempla=this.jPanelAccionesProductoReempla;
		
		JPanel jPanelCamposAuxiliarProductoReempla=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoReempla=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) {
			jPanelCamposAuxiliarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jPanelCamposProductoReempla;
			jPanelAccionesFormularioAuxiliarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jPanelAccionesFormularioProductoReempla;
		}
		
		final JPanel jPanelCamposProductoReempla=jPanelCamposAuxiliarProductoReempla;
		final JPanel jPanelAccionesFormularioProductoReempla=jPanelAccionesFormularioAuxiliarProductoReempla;
		
		
		final JMenuBar jmenuBarProductoReempla=this.jmenuBarProductoReempla;		
		final JToolBar jTtoolBarProductoReempla=this.jTtoolBarProductoReempla;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoReempla=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoReempla=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) {
			jmenuBarDetalleAuxiliarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jmenuBarDetalleProductoReempla;
			jTtoolBarDetalleAuxiliarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jTtoolBarDetalleProductoReempla;		
		}
		
		final JMenuBar jmenuBarDetalleProductoReempla=jmenuBarDetalleAuxiliarProductoReempla;
		final JToolBar jTtoolBarDetalleProductoReempla=jTtoolBarDetalleAuxiliarProductoReempla;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoReempla;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoReempla;
			processRunnable.jTableDatos=jTableDatosProductoReempla;
			processRunnable.jPanelCampos=jPanelCamposProductoReempla;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoReempla;
			processRunnable.jPanelAcciones=jPanelAccionesProductoReempla;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoReempla;
			
			
			processRunnable.jmenuBar=jmenuBarProductoReempla;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoReempla;
			processRunnable.jTtoolBar=jTtoolBarProductoReempla;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoReempla;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoReempla ,jPanelParametrosReportesProductoReempla, jTableDatosProductoReempla,/*jScrollPanelDatosProductoReempla,*/jPanelCamposProductoReempla,jPanelPaginacionProductoReempla, /*jScrollPanelDatosEdicionProductoReempla,*/ jPanelAccionesProductoReempla,jPanelAccionesFormularioProductoReempla,jmenuBarProductoReempla,jmenuBarDetalleProductoReempla,jTtoolBarProductoReempla,jTtoolBarDetalleProductoReempla));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoReempla(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoReempla(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoReempla(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoReempla(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoReempla,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoReempla,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoReempla(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoReempla,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoReempla,esHabilitar,1,1);
		}
	}
	*/
	
	
	public void getTodosProductoReemplaArbol() throws Exception {	
		ArrayList<String> arrColumnasGlobales=ProductoReemplaConstantesFunciones.getArrayColumnasGlobalesProductoReempla(this.arrDatoGeneral);
		
		String  finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoReemplaConstantesFunciones.TABLENAME);
		
		this.pagination=new Pagination();
		
		this.pagination.setiFirstResult(-1);
		this.pagination.setiMaxResults(-1);
		
		this.cargarDatosCliente();
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			productoreemplaLogic.getTodosProductoReemplas(finalQueryGlobal+"",this.pagination);//WithConnection
			this.productoreemplasArbol=productoreemplaLogic.getProductoReemplas();
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
	}
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productoreemplaConstantesFunciones.getsFinalQueryProductoReempla();
		String  finalQueryPaginacionTodos=this.productoreemplaConstantesFunciones.getsFinalQueryProductoReempla();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoReemplaConstantesFunciones.getArrayColumnasGlobalesNoProductoReempla(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoReemplaConstantesFunciones.getArrayColumnasGlobalesProductoReempla(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoReemplaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productoreemplasEliminados= new ArrayList<ProductoReempla>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoReempla();
		
				///*ProductoReemplaSessionBean*/this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
			
			if(this.productoreemplaSessionBean==null) {
				this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
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
					this.iNumeroPaginacion=ProductoReemplaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoReemplaConstantesFunciones.getClassesForeignKeysOfProductoReempla(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productoreempla."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productoreemplasAux= new ArrayList<ProductoReempla>();
			
				
			productoreemplaLogic.setDatosCliente(this.datosCliente);
			productoreemplaLogic.setDatosDeep(this.datosDeep);
			productoreemplaLogic.setIsConDeep(true);
			
			
			productoreemplaLogic.getProductoReemplaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productoreemplaLogic.getTodosProductoReemplas(finalQueryGlobal,pagination);
					
					//productoreemplaLogic.getTodosProductoReemplasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productoreemplaLogic.getProductoReemplas()==null|| productoreemplaLogic.getProductoReemplas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoreemplasAux= new ArrayList<ProductoReempla>();
							productoreemplasAux.addAll(productoreemplaLogic.getProductoReemplas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoreemplasAux= new ArrayList<ProductoReempla>();
							productoreemplasAux.addAll(productoreemplas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoreemplaLogic.getTodosProductoReemplas(finalQueryGlobal+"",this.pagination);												
							
							//productoreemplaLogic.getTodosProductoReemplasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoReemplas("Todos",productoreemplaLogic.getProductoReemplas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoreemplaLogic.setProductoReemplas(new ArrayList<ProductoReempla>());					
							productoreemplaLogic.getProductoReemplas().addAll(productoreemplasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoreemplas=new ArrayList<ProductoReempla>();
							productoreemplas.addAll(productoreemplasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoReempla=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoReempla=this.idActual;
				
				} else if(this.idProductoReemplaActual!=null && this.idProductoReemplaActual!=0L) {
					idProductoReempla=idProductoReemplaActual;
				}
				
					
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndicePorId(idProductoReempla);
				
				this.productoreemplas=new ArrayList<ProductoReempla>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productoreemplaLogic.getEntity(idProductoReempla);
					
					//productoreemplaLogic.getEntityWithConnection(idProductoReempla);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoreemplaLogic.setProductoReemplas(new ArrayList<ProductoReempla>());
					productoreemplaLogic.getProductoReemplas().add(productoreemplaLogic.getProductoReempla());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoreemplas=new ArrayList<ProductoReempla>();
					this.productoreemplas.add(productoreempla);
				}
				
				if(productoreemplaLogic.getProductoReempla()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoreemplaLogic.getProductoReemplasFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoreemplaLogic.getProductoReemplas()==null||productoreemplaLogic.getProductoReemplas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoreemplas==null|| productoreemplas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoreemplasAux=new ArrayList<ProductoReempla>();
						productoreemplasAux.addAll(productoreemplaLogic.getProductoReemplas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoreemplasAux=new ArrayList<ProductoReempla>();
							productoreemplasAux.addAll(productoreemplas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoreemplaLogic.getProductoReemplasFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoReemplas("FK_IdBodega",productoreemplaLogic.getProductoReemplas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoReemplas("FK_IdBodega",productoreemplas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoreemplaLogic.setProductoReemplas(new ArrayList<ProductoReempla>());
						productoreemplaLogic.getProductoReemplas().addAll(productoreemplasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoreemplas=new ArrayList<ProductoReempla>();
							productoreemplas.addAll(productoreemplasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoreemplaLogic.getProductoReemplasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoreemplaLogic.getProductoReemplas()==null||productoreemplaLogic.getProductoReemplas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoreemplas==null|| productoreemplas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoreemplasAux=new ArrayList<ProductoReempla>();
						productoreemplasAux.addAll(productoreemplaLogic.getProductoReemplas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoreemplasAux=new ArrayList<ProductoReempla>();
							productoreemplasAux.addAll(productoreemplas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoreemplaLogic.getProductoReemplasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoReemplas("FK_IdEmpresa",productoreemplaLogic.getProductoReemplas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoReemplas("FK_IdEmpresa",productoreemplas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoreemplaLogic.setProductoReemplas(new ArrayList<ProductoReempla>());
						productoreemplaLogic.getProductoReemplas().addAll(productoreemplasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoreemplas=new ArrayList<ProductoReempla>();
							productoreemplas.addAll(productoreemplasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoreemplaLogic.getProductoReemplasFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoreemplaLogic.getProductoReemplas()==null||productoreemplaLogic.getProductoReemplas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoreemplas==null|| productoreemplas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoreemplasAux=new ArrayList<ProductoReempla>();
						productoreemplasAux.addAll(productoreemplaLogic.getProductoReemplas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoreemplasAux=new ArrayList<ProductoReempla>();
							productoreemplasAux.addAll(productoreemplas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoreemplaLogic.getProductoReemplasFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoReemplas("FK_IdProducto",productoreemplaLogic.getProductoReemplas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoReemplas("FK_IdProducto",productoreemplas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoreemplaLogic.setProductoReemplas(new ArrayList<ProductoReempla>());
						productoreemplaLogic.getProductoReemplas().addAll(productoreemplasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoreemplas=new ArrayList<ProductoReempla>();
							productoreemplas.addAll(productoreemplasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProductoReempla")) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdProductoReempla(id_producto_reemplaFK_IdProductoReempla);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoreemplaLogic.getProductoReemplasFK_IdProductoReempla(finalQueryGlobal,pagination,id_producto_reemplaFK_IdProductoReempla);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdProductoReempla(id_producto_reemplaFK_IdProductoReempla);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdProductoReempla(id_producto_reemplaFK_IdProductoReempla);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoreemplaLogic.getProductoReemplas()==null||productoreemplaLogic.getProductoReemplas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoreemplas==null|| productoreemplas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoreemplasAux=new ArrayList<ProductoReempla>();
						productoreemplasAux.addAll(productoreemplaLogic.getProductoReemplas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoreemplasAux=new ArrayList<ProductoReempla>();
							productoreemplasAux.addAll(productoreemplas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoreemplaLogic.getProductoReemplasFK_IdProductoReempla(finalQueryGlobal,pagination,id_producto_reemplaFK_IdProductoReempla);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdProductoReempla(id_producto_reemplaFK_IdProductoReempla);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdProductoReempla(id_producto_reemplaFK_IdProductoReempla);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoReemplas("FK_IdProductoReempla",productoreemplaLogic.getProductoReemplas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoReemplas("FK_IdProductoReempla",productoreemplas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoreemplaLogic.setProductoReemplas(new ArrayList<ProductoReempla>());
						productoreemplaLogic.getProductoReemplas().addAll(productoreemplasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoreemplas=new ArrayList<ProductoReempla>();
							productoreemplas.addAll(productoreemplasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoreemplaLogic.getProductoReemplasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoreemplaLogic.getProductoReemplas()==null||productoreemplaLogic.getProductoReemplas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoreemplas==null|| productoreemplas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoreemplasAux=new ArrayList<ProductoReempla>();
						productoreemplasAux.addAll(productoreemplaLogic.getProductoReemplas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoreemplasAux=new ArrayList<ProductoReempla>();
							productoreemplasAux.addAll(productoreemplas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoreemplaLogic.getProductoReemplasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoReemplaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoReemplas("FK_IdSucursal",productoreemplaLogic.getProductoReemplas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoReemplas("FK_IdSucursal",productoreemplas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoreemplaLogic.setProductoReemplas(new ArrayList<ProductoReempla>());
						productoreemplaLogic.getProductoReemplas().addAll(productoreemplasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoreemplas=new ArrayList<ProductoReempla>();
							productoreemplas.addAll(productoreemplasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoReempla();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoReempla();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoreemplaLogic.getProductoReemplas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoreemplas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoreemplaLogic.getProductoReemplas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoreemplas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoReempla productoreempla) {
		Boolean permite=true;
		
		if(this.productoreempla.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoReemplaConstantesFunciones.getOrderByListaProductoReempla();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoReemplaConstantesFunciones.getOrderByListaProductoReempla();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoReempla productoreempla:productoreemplaLogic.getProductoReemplas()) {
				if(productoreempla.getsType().equals(Constantes2.S_TOTALES)) {
					productoreemplaTotales=productoreempla;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoReempla productoreempla:this.productoreemplas) {
				if(productoreempla.getsType().equals(Constantes2.S_TOTALES)) {
					productoreemplaTotales=productoreempla;
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
			this.productoreemplaAux=new ProductoReempla();
			this.productoreemplaAux.setsType(Constantes2.S_TOTALES);
			this.productoreemplaAux.setIsNew(false);
			this.productoreemplaAux.setIsChanged(false);
			this.productoreemplaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoReemplaConstantesFunciones.TotalizarValoresFilaProductoReempla(this.productoreemplaLogic.getProductoReemplas(),this.productoreemplaAux);
				
				this.productoreemplaLogic.getProductoReemplas().add(this.productoreemplaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoReemplaConstantesFunciones.TotalizarValoresFilaProductoReempla(this.productoreemplas,this.productoreemplaAux);
				
				this.productoreemplas.add(this.productoreemplaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productoreemplaTotales=new ProductoReempla();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoreemplaLogic.getProductoReemplas().remove(productoreemplaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoreemplas.remove(productoreemplaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productoreemplaTotales=new ProductoReempla();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoReempla productoreempla:productoreemplaLogic.getProductoReemplas()) {
				if(productoreempla.getsType().equals(Constantes2.S_TOTALES)) {
					productoreemplaTotales=productoreempla;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoReemplaConstantesFunciones.TotalizarValoresFilaProductoReempla(this.productoreemplaLogic.getProductoReemplas(),productoreemplaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoReempla productoreempla:this.productoreemplas) {
				if(productoreempla.getsType().equals(Constantes2.S_TOTALES)) {
					productoreemplaTotales=productoreempla;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoReemplaConstantesFunciones.TotalizarValoresFilaProductoReempla(this.productoreemplas,productoreemplaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoReemplasFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoReemplasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoReemplasFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoReemplasFK_IdProductoReempla()throws Exception {
		try {
			sAccionBusqueda="FK_IdProductoReempla";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoReemplasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoReemplasFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoreemplaLogic.getProductoReemplasFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoReemplasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoreemplaLogic.getProductoReemplasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoReemplasFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoreemplaLogic.getProductoReemplasFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoReemplasFK_IdProductoReempla(String sFinalQuery,Long id_producto_reempla)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoreemplaLogic.getProductoReemplasFK_IdProductoReempla(sFinalQuery,this.pagination,id_producto_reempla);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoReemplasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoreemplaLogic.getProductoReemplasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProductoReempla() {
		this.isPermisoTodoProductoReempla=false;
		this.isPermisoNuevoProductoReempla=false;
		this.isPermisoActualizarProductoReempla=false;
		this.isPermisoActualizarOriginalProductoReempla=false;
		this.isPermisoEliminarProductoReempla=false;
		this.isPermisoGuardarCambiosProductoReempla=false;
		this.isPermisoConsultaProductoReempla=false;
		this.isPermisoBusquedaProductoReempla=false;
		this.isPermisoReporteProductoReempla=false;		
		this.isPermisoOrdenProductoReempla=false;		
		this.isPermisoPaginacionMedioProductoReempla=false;		
		this.isPermisoPaginacionAltoProductoReempla=false;
		this.isPermisoPaginacionTodoProductoReempla=false;
		this.isPermisoCopiarProductoReempla=false;		
		this.isPermisoVerFormProductoReempla=false;		
		this.isPermisoDuplicarProductoReempla=false;		
		this.isPermisoOrdenProductoReempla=false;		
	}
	
	public void setPermisosUsuarioProductoReempla(Boolean isPermiso) {
		this.isPermisoTodoProductoReempla=isPermiso;
		this.isPermisoNuevoProductoReempla=isPermiso;
		this.isPermisoActualizarProductoReempla=isPermiso;
		this.isPermisoActualizarOriginalProductoReempla=isPermiso;
		this.isPermisoEliminarProductoReempla=isPermiso;
		this.isPermisoGuardarCambiosProductoReempla=isPermiso;
		this.isPermisoConsultaProductoReempla=isPermiso;
		this.isPermisoBusquedaProductoReempla=isPermiso;
		this.isPermisoReporteProductoReempla=isPermiso;
		this.isPermisoOrdenProductoReempla=isPermiso;		
		this.isPermisoPaginacionMedioProductoReempla=isPermiso;		
		this.isPermisoPaginacionAltoProductoReempla=isPermiso;		
		this.isPermisoPaginacionTodoProductoReempla=isPermiso;		
		this.isPermisoCopiarProductoReempla=isPermiso;		
		this.isPermisoVerFormProductoReempla=isPermiso;		
		this.isPermisoDuplicarProductoReempla=isPermiso;
		this.isPermisoOrdenProductoReempla=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoReempla(Boolean isPermiso) {
		//this.isPermisoTodoProductoReempla=isPermiso;
		this.isPermisoNuevoProductoReempla=isPermiso;
		this.isPermisoActualizarProductoReempla=isPermiso;
		this.isPermisoActualizarOriginalProductoReempla=isPermiso;
		this.isPermisoEliminarProductoReempla=isPermiso;
		this.isPermisoGuardarCambiosProductoReempla=isPermiso;
		//this.isPermisoConsultaProductoReempla=isPermiso;
		//this.isPermisoBusquedaProductoReempla=isPermiso;
		//this.isPermisoReporteProductoReempla=isPermiso;
		//this.isPermisoOrdenProductoReempla=isPermiso;		
		//this.isPermisoPaginacionMedioProductoReempla=isPermiso;		
		//this.isPermisoPaginacionAltoProductoReempla=isPermiso;		
		//this.isPermisoPaginacionTodoProductoReempla=isPermiso;		
		//this.isPermisoCopiarProductoReempla=isPermiso;		
		//this.isPermisoDuplicarProductoReempla=isPermiso;
		//this.isPermisoOrdenProductoReempla=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoReemplaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProductoReemplaConstantesFunciones.SNOMBREOPCION);
		
		if(ProductoReemplaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosProductoReempla=false;
		this.isTienePermisosProductoReempla=this.verificarGetPermisosUsuarioOpcionProductoReemplaClaseRelacionada(this.opcionsRelacionadas,ProductoReemplaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoReempla(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoReemplaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProductoReempla=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioProductoReemplaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoReemplaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoReemplaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProductoReempla && this.jInternalFrameDetalleFormProductoReempla!=null && this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProductoReempla.jTabbedPaneRelacionesProductoReempla.remove(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioProductoReempla() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoReemplaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoReemplaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoReempla=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoReempla=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoReempla=this.isPermisoActualizarProductoReempla;
			this.isPermisoEliminarProductoReempla=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoReempla=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoReempla=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoReempla=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoReempla=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoReempla=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoReempla=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoReempla=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoReempla=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoReempla=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoReempla=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoReempla=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoReempla=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoReempla=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoReempla.setToolTipText(this.jTableDatosProductoReempla.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoReempla(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoReempla(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoReemplaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoReemplaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoReempla() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProductoReempla && this.productoreemplaConstantesFunciones.mostrarProductoReemplaProductoReempla && !ProductoReemplaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Reemplazo");
			reporte.setsDescripcion("Reemplazo");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyProductoReemplaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.productoreemplasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoReemplaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoReemplaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoReemplaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoReemplaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyProductoReemplaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.productoreemplasForeignKey==null||this.productoreemplasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProductoReemplaConstantesFunciones.getArrayColumnasGlobalesProductoReempla(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoReemplaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProductoReemplaConstantesFunciones.SFINALQUERY;

				this.cargarCombosProductoReemplasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyProductoReemplaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoReemplaParameterReturnGeneral productoreemplaReturnGeneral=new ProductoReemplaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.productoreemplaConstantesFunciones.cargarid_empresaProductoReempla)
					 || (this.esRecargarFks && this.productoreemplaConstantesFunciones.cargarid_empresaProductoReempla)) {

					if(!this.productoreemplaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+productoreemplaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.productoreemplaConstantesFunciones.cargarid_sucursalProductoReempla)
					 || (this.esRecargarFks && this.productoreemplaConstantesFunciones.cargarid_sucursalProductoReempla)) {

					if(!this.productoreemplaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+productoreemplaSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.productoreemplaConstantesFunciones.cargarid_bodegaProductoReempla)
					 || (this.esRecargarFks && this.productoreemplaConstantesFunciones.cargarid_bodegaProductoReempla)) {

					if(!this.productoreemplaSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+productoreemplaSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.productoreemplaConstantesFunciones.cargarid_productoProductoReempla)
					 || (this.esRecargarFks && this.productoreemplaConstantesFunciones.cargarid_productoProductoReempla)) {

					if(!this.productoreemplaSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+productoreemplaSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalProductoReempla="";

				if(((this.productoreemplasForeignKey==null||this.productoreemplasForeignKey.size()<=0) && this.productoreemplaConstantesFunciones.cargarid_producto_reemplaProductoReempla)
					 || (this.esRecargarFks && this.productoreemplaConstantesFunciones.cargarid_producto_reemplaProductoReempla)) {

					if(!this.productoreemplaSessionBean.getisBusquedaDesdeForeignKeySesionProductoReempla()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoReemplaConstantesFunciones.getArrayColumnasGlobalesProductoReempla(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProductoReempla=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoReemplaConstantesFunciones.TABLENAME);

						finalQueryGlobalProductoReempla=Funciones.GetFinalQueryAppend(finalQueryGlobalProductoReempla, "");
						finalQueryGlobalProductoReempla+=ProductoReemplaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductoReemplasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProductoReempla=" WHERE " + ConstantesSql.ID + "="+productoreemplaSessionBean.getlidProductoReemplaActual();
					}
				} else {
					finalQueryGlobalProductoReempla="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productoreemplaReturnGeneral=productoreemplaLogic.cargarCombosLoteForeignKeyProductoReempla(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalProductoReempla);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=productoreemplaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=productoreemplaReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=productoreemplaReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=productoreemplaReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalProductoReempla.equals("NONE")) {
				this.productoreemplasForeignKey=productoreemplaReturnGeneral.getproductoreemplasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoReempla()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyProductoReempla();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.productoreemplaSessionBean==null) {
				this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
			}

			if(!this.productoreemplaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.productoreemplaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.productoreemplaSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.productoreemplaSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyProductoReempla()throws Exception {
		try {

			if(!this.productoreemplaSessionBean.getisBusquedaDesdeForeignKeySesionProductoReempla()) {
				ProductoReempla productoreempla=new ProductoReempla();
				ProductoReemplaConstantesFunciones.setProductoReemplaDescripcion(productoreempla,Constantes.SMENSAJE_ESCOJA_OPCION);
				productoreempla.setId(null);

				if(!ProductoReemplaConstantesFunciones.ExisteEnLista(this.productoreemplasForeignKey,productoreempla,true)) {

					this.productoreemplasForeignKey.add(0,productoreempla);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProductoReempla()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoReempla(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductoReempla()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoReempla();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoReempla(ProductoReempla productoreempla)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(productoreempla.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(productoreempla.getid_producto(),false,"Formulario");
			this.setActualProductoReemplaForeignKey(productoreempla.getid_producto_reempla(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoReempla(ProductoReempla productoreempla,String sTipoEvento)throws Exception {	
		try {
			
			

				if(productoreempla.getProducto()!=null && !sTipoEvento.equals("id_productoProductoReempla")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(productoreempla.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoReempla()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.productoreemplaConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.productoreemplaConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualProductoReemplaForeignKey(this.productoreemplaConstantesFunciones.getid_producto_reempla(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoReempla()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoReempla()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoReempla()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoReempla()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoReempla()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameProductoReemplasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoReempla(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductoReemplasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoReempla()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_empresaProductoReempla!=null && this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_empresaProductoReempla.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_empresaProductoReempla.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_sucursalProductoReempla!=null && this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_sucursalProductoReempla.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_sucursalProductoReempla.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_bodegaProductoReempla!=null && this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_bodegaProductoReempla.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_bodegaProductoReempla.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_productoProductoReempla!=null && this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_productoProductoReempla.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_productoProductoReempla.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_producto_reemplaProductoReempla!=null && this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_producto_reemplaProductoReempla.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_producto_reemplaProductoReempla.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public ProductoReemplaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoReemplaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoReemplaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productoreemplaSessionBean=new ProductoReemplaSessionBean(); 
		this.productoreemplaConstantesFunciones=new ProductoReemplaConstantesFunciones(); 
		this.productoreemplaBean=new ProductoReempla();//(this.productoreemplaConstantesFunciones); 		
		this.productoreemplaReturnGeneral=new ProductoReemplaParameterReturnGeneral(); 
		
		this.productoreemplaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoreemplaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoReemplaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoReemplaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoReemplaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoReempla(true);
			
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
			
			this.productoreemplaConstantesFunciones=new ProductoReemplaConstantesFunciones(); 
			this.productoreemplaBean=new ProductoReempla();//this.productoreemplaConstantesFunciones); 			
			this.productoreemplaReturnGeneral=new ProductoReemplaParameterReturnGeneral(); 
		
			ProductoReemplaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Reemplazo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.productoreempla=new ProductoReempla();
			this.productoreemplas = new ArrayList<ProductoReempla>();
			this.productoreemplasAux = new ArrayList<ProductoReempla>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic=new ProductoReemplaLogic();
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}
			
			//this.productoreemplaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productoreemplaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoReempla);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoReempla!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoReempla);	
					}
					
					if(this.jInternalFrameImportacionProductoReempla!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoReempla);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoReempla!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoReempla);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoReempla!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoReempla);
				this.jInternalFrameDetalleFormProductoReempla.setVisible(false);
				this.jInternalFrameDetalleFormProductoReempla.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoReempla!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoReempla);
					this.jInternalFrameReporteDinamicoProductoReempla.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoReempla.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoReempla!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoReempla);
					this.jInternalFrameImportacionProductoReempla.setVisible(false);
					this.jInternalFrameImportacionProductoReempla.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoReempla!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoReempla);
					this.jInternalFrameOrderByProductoReempla.setVisible(false);
					this.jInternalFrameOrderByProductoReempla.setSelected(false);				
				}
				
			}
			
			this.productoreemplasArbol= new ArrayList<ProductoReempla>();
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameTreeProductoReempla);    		
			}
			
			this.jDesktopPane.add(this.jInternalFrameTreeProductoReempla);
			this.jInternalFrameTreeProductoReempla.setVisible(false);
	        this.jInternalFrameTreeProductoReempla.setSelected(false);						
			
			if(!esParaBusquedaForeignKey) {
				this.getTodosProductoReemplaArbol();
			}			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoReemplaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoReemplaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productoreemplaReturnGeneral=new ProductoReemplaParameterReturnGeneral();
			
			this.productoreemplaParameterGeneral=new ProductoReemplaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productoreemplaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoReemplaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProductoReemplaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoReemplaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoreemplaSessionBean.getEsGuardarRelacionado(),this.productoreemplaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoReemplaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoreemplaSessionBean.getEsGuardarRelacionado(),this.productoreemplaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoReempla=false;
			this.isVisibilidadCeldaDuplicarProductoReempla=true;
			this.isVisibilidadCeldaCopiarProductoReempla=true;
			this.isVisibilidadCeldaVerFormProductoReempla=true;
			this.isVisibilidadCeldaOrdenProductoReempla=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoReempla=false;
			this.isVisibilidadCeldaModificarProductoReempla=false;
			this.isVisibilidadCeldaActualizarProductoReempla=false;
			this.isVisibilidadCeldaEliminarProductoReempla=false;
			this.isVisibilidadCeldaCancelarProductoReempla=false;
			this.isVisibilidadCeldaGuardarProductoReempla=false;
			this.isVisibilidadCeldaGuardarCambiosProductoReempla=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdProductoReempla=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoReempla("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoReempla();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoReempla(false);
			
			this.setPermisosUsuarioProductoReempla();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoreemplaSessionBean.getEsGuardarRelacionado() 
				|| (this.productoreemplaSessionBean.getEsGuardarRelacionado() && this.productoreemplaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoReemplaClasesRelacionadas();
			}
			
			if(this.productoreemplaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoReemplaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoReempla();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoReempla();
			}
			
			if(!this.isPermisoBusquedaProductoReempla) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoReempla.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoReempla,this.isPermisoPaginacionMedioProductoReempla,this.isPermisoPaginacionTodoProductoReempla);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoReemplaConstantesFunciones.getTiposSeleccionarProductoReempla());
				
				this.tiposColumnasSelect=ProductoReemplaConstantesFunciones.getTiposSeleccionarProductoReempla(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectProductoReempla();				
				//this.tiposRelacionesSelect=ProductoReemplaConstantesFunciones.getTiposRelacionesProductoReempla(true);
				
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
			//if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoReempla();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioProductoReempla(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioProductoReempla(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoReempla() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				productoreemplaImplementable= (ProductoReemplaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoReemplaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productoreemplaImplementableHome= (ProductoReemplaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoReemplaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productoreemplas= new ArrayList<ProductoReempla>();
			this.productoreemplasEliminados= new ArrayList<ProductoReempla>();
						
			this.isEsNuevoProductoReempla=false;
			this.esParaAccionDesdeFormularioProductoReempla=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.productoreemplasForeignKey=new ArrayList<ProductoReempla>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoReempla(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoReempla();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoReemplaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoReemplaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoReempla("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoReempla(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoReempla!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoReempla();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoReempla();
			}
			
			ProductoReemplaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoReempla.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoReempla.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoReempla.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoReempla(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoReempla: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoReempla() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ProductoReemplaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProductoReemplaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoReempla")) {
				iIndex=this.jInternalFrameDetalleFormProductoReempla.jTabbedPaneRelacionesProductoReempla.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoReempla.jTabbedPaneRelacionesProductoReempla.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();	
				
				

				if(sTitle.equals("Reemplazos")) {
					if(!ProductoReemplaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProductoReempla();

						this.cargarParteTabPanelRelacionadaProductoReempla(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoReempla();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaProductoReempla(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProductoReempla.cargarSessionConBeanSwingJInternalFrameProductoReempla(false,true,iIndex);
		this.jButtonProductoReemplaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProductoReempla();

		//this.jTabbedPaneRelacionesProductoReempla.updateUI();
		//this.jTabbedPaneRelacionesProductoReempla.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProductoReempla.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ProductoReempla")) {
				int row=this.jTableDatosProductoReempla.getSelectedRow();
				jButtonProductoReemplaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Reemplazo")) {

					if(this.isTienePermisosProductoReempla && this.productoreemplaConstantesFunciones.mostrarProductoReemplaProductoReempla && !ProductoReemplaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Reemplazos"+"("+ProductoReemplaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Reemplazos");

						if(productoreemplaConstantesFunciones.resaltarProductoReemplaProductoReempla!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(productoreemplaConstantesFunciones.resaltarProductoReemplaProductoReempla);
						}

						jmenuItem.setEnabled(this.productoreemplaConstantesFunciones.activarProductoReemplaProductoReempla);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProductoReempla"));

						

						this.jInternalFrameDetalleFormProductoReempla.jmenuDetalleProductoReempla.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyProductoReempla(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoReempla(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoReempla(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoReemplaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoReempla();
		
		this.cargarCombosFrameForeignKeyProductoReempla();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoReempla();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoReempla();
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

	public void cargarCombosForeignKeyProductoReempla(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProductoReemplaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProductoReempla();
				this.cargarCombosFrameProductoReemplasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProductoReempla(this.productoreemplasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProductoReemplaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productoreemplaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoReempla==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			
			
			if(jTableDatosProductoReempla.getRowCount()>=1) {
				jTableDatosProductoReempla.removeRowSelectionInterval(0, jTableDatosProductoReempla.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoReempla=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoReempla(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoReempla(true);			
			//this.productoreempla=new ProductoReempla();
			//this.productoreempla.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoReempla(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoReempla() ;
			
			if(ProductoReemplaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoReempla(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productoreempla);	
			this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);				
			
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			
			if(this.productoreemplaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoReempla: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoReemplaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoReempla> productoreemplasSeleccionados=new ArrayList<ProductoReempla>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoReempla.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoReempla.getSelectedRows().length;			
			}
			
			productoreemplasSeleccionados=this.getProductoReemplasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoReempla--;			
				//ProductoReempla productoreemplaAux= new ProductoReempla();			
				//productoreemplaAux.setId(this.iIdNuevoProductoReempla);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoReempla productoreemplaOrigen=new ProductoReempla();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoReempla productoreemplaOrigen : productoreemplasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productoreemplaOrigen =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoreemplaOrigen =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoReempla();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productoreempla.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoReempla(productoreemplaOrigen,this.productoreempla,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoreemplaLogic.getProductoReemplas().add(this.productoreemplaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoreemplas.add(this.productoreemplaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoReempla(false);
				
				this.jTableDatosProductoReempla.setRowSelectionInterval(this.getIndiceNuevoProductoReempla(), this.getIndiceNuevoProductoReempla());
				
				int iLastRow =  this.jTableDatosProductoReempla.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoReempla.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoReempla.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoReempla(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoReemplaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoReempla> productoreemplasSeleccionados=new ArrayList<ProductoReempla>();									
		
			ProductoReempla productoreemplaOrigen=new ProductoReempla();
			ProductoReempla productoreemplaDestino=new ProductoReempla();
				
			productoreemplasSeleccionados=this.getProductoReemplasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoReempla.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productoreemplasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoReempla.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoreemplaOrigen =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoreemplaOrigen =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoreemplaDestino =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoreemplaDestino =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productoreemplaOrigen =productoreemplasSeleccionados.get(0);
				productoreemplaDestino =productoreemplasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoReempla(productoreemplaOrigen,productoreemplaDestino,true,false);
				
				productoreemplaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoreemplaDestino,productoreemplaLogic.getProductoReemplas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoreemplaDestino,productoreemplas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoReempla(false);
				
				//this.jTableDatosProductoReempla.setRowSelectionInterval(this.getIndiceNuevoProductoReempla(), this.getIndiceNuevoProductoReempla());
				
				int iLastRow =  this.jTableDatosProductoReempla.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoReempla.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoReempla.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoReempla(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoReemplaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoReempla==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoReempla.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoReemplaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoReempla.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoReempla.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoReempla.setVisible(!isVisible);
			this.jPanelPaginacionProductoReempla.setVisible(!isVisible);
			this.jPanelAccionesProductoReempla.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoReemplaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoReempla();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoReemplaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoReempla();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoReemplaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoReempla();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoReemplaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoReempla();
			
			this.abrirFrameOrderByProductoReempla();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoReemplaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoReempla();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoReempla(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoReempla);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoReempla.isMaximum()) {
					this.jInternalFrameDetalleFormProductoReempla.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoReempla.setSize(this.jInternalFrameDetalleFormProductoReempla.iWidthFormulario,this.jInternalFrameDetalleFormProductoReempla.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoReempla.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoReempla.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoReempla.isMaximum()) {
						this.jInternalFrameDetalleFormProductoReempla.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoReempla.jContentPaneDetalleProductoReempla.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoReempla.jTabbedPaneRelacionesProductoReempla.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoReempla.jContentPaneDetalleProductoReempla.getWidth(),ProductoReemplaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoReempla.jTabbedPaneRelacionesProductoReempla.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoReempla.jContentPaneDetalleProductoReempla.getWidth(),ProductoReemplaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoReempla.jTabbedPaneRelacionesProductoReempla.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoReempla.jContentPaneDetalleProductoReempla.getWidth(),ProductoReemplaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ProductoReemplaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProductoReempla();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoReempla.setVisible(true);
	        this.jInternalFrameDetalleFormProductoReempla.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoReempla() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoReempla==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoReempla=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoReempla,false,this);
				} else {
					this.jInternalFrameOrderByProductoReempla=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoReempla,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoReempla);
				this.jInternalFrameOrderByProductoReempla.setVisible(false);
				this.jInternalFrameOrderByProductoReempla.setSelected(false);
				
				this.jInternalFrameOrderByProductoReempla.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoReempla"));
				
				this.inicializarActualizarBindingTablaOrderByProductoReempla();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoReempla() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoReempla==null) {
				
				this.jInternalFrameImportacionProductoReempla=new ImportacionJInternalFrame(ProductoReemplaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoReempla);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoReempla);
				this.jInternalFrameImportacionProductoReempla.setVisible(false);
				this.jInternalFrameImportacionProductoReempla.setSelected(false);


				this.jInternalFrameImportacionProductoReempla.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoReempla"));
				this.jInternalFrameImportacionProductoReempla.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoReempla"));
				this.jInternalFrameImportacionProductoReempla.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoReempla"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoReempla() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoReempla==null) {
				this.jInternalFrameReporteDinamicoProductoReempla=new ReporteDinamicoJInternalFrame(ProductoReemplaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoReempla);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoReempla);
				this.jInternalFrameReporteDinamicoProductoReempla.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoReempla.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoReempla.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoReempla"));
				this.jInternalFrameReporteDinamicoProductoReempla.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoReempla"));
				this.jInternalFrameReporteDinamicoProductoReempla.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoReempla"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoReempla();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaProductoReempla() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.jScrollPanelDatosProductoReempla.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProductoReempla.jContentPaneDetalleProductoReempla.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.jScrollPanelDatosProductoReempla.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.jScrollPanelDatosProductoReempla.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.jScrollPanelDatosProductoReempla.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleProductoReempla() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoReempla);
			
	       	this.jInternalFrameDetalleFormProductoReempla.setVisible(false);
	        this.jInternalFrameDetalleFormProductoReempla.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoReempla.dispose();
			//this.jInternalFrameDetalleFormProductoReempla=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoReempla() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoReempla.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoReempla.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoReempla() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoReempla.setVisible(true);
	        this.jInternalFrameImportacionProductoReempla.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoReempla() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoReempla.setVisible(true);
	        this.jInternalFrameOrderByProductoReempla.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoReempla() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoReempla.setVisible(false);
	        this.jInternalFrameOrderByProductoReempla.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoReempla() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoReempla.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoReempla.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoReempla() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoReempla.setVisible(false);
	        this.jInternalFrameImportacionProductoReempla.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	 public void abrirFrameTreeProductoReempla(String sTipoProceso) { //throws Exception	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameTreeProductoReempla);
			
			this.jInternalFrameTreeProductoReempla.setsTipoProceso(sTipoProceso);
			
			if(sTipoProceso.equals("BUSQUEDA_FK")) {
				this.jInternalFrameTreeProductoReempla.sTipoBusqueda="ProductoReempla";
			}
			
			this.jInternalFrameTreeProductoReempla.setProductoReemplas(this.productoreemplasArbol);
			this.jInternalFrameTreeProductoReempla.CargarTreeProductoReempla();
			
	       	this.jInternalFrameTreeProductoReempla.setVisible(true);
	        this.jInternalFrameTreeProductoReempla.setSelected(true);
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			e.getStackTrace();
			//FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
	    }
	}
	
	public void cerrarFrameTreeProductoReempla() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameTreeProductoReempla);
			
	       	this.jInternalFrameTreeProductoReempla.setVisible(false);
	        this.jInternalFrameTreeProductoReempla.setSelected(false);
			
			//this.jInternalFrameTreeProductoReempla.dispose();
			//this.jInternalFrameTreeProductoReempla=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void jButtonModificarProductoReemplaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoReempla(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoReempla(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoReempla(true);
			//this.isEsNuevoProductoReempla=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoReempla("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoReempla(false) ;
			
			if(productoreemplaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaSessionBean.getEsGuardarRelacionado() && ProductoReemplaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProductoReemplaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ProductoReemplaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoReempla(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoReempla(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoReemplaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoReempla(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoReempla==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoReempla(true);
			//this.isEsNuevoProductoReempla=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productoreempla.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoReempla("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoReempla(false) ;
			
			if(ProductoReemplaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoReempla(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoReempla(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.productoreemplaConstantesFunciones.cargarid_productoProductoReempla) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoReempla(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProductoReempla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoReempla,ProductoReemplaConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoReempla.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosProductoReempla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoReempla,ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoReempla.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProductoReempla(List<ProductoReempla> productoreemplasForeignKey)throws Exception{
		TableColumn tableColumnProductoReempla=this.jTableDatosProductoReempla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoReempla,ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA));
		TableCellEditor tableCellEditorProductoReempla =tableColumnProductoReempla.getCellEditor();

		ProductoReemplaTableCell productoreemplaTableCellFk=(ProductoReemplaTableCell)tableCellEditorProductoReempla;

		if(productoreemplaTableCellFk!=null) {
			productoreemplaTableCellFk.setproductoreemplasForeignKey(productoreemplasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoReempla.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoreemplaTableCellFk.setRowActual(intSelectedRow);
			//productoreemplaTableCellFk.setproductoreemplasForeignKeyActual(productoreemplasForeignKey);
		//}


		if(productoreemplaTableCellFk!=null) {
			productoreemplaTableCellFk.RecargarProductoReemplasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarProductoReemplaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoReempla(false);
			
			//if(!this.isEsNuevoProductoReempla) {								
				int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoReempla(this.productoreempla,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
				
			}
			
			if(this.permiteMantenimiento(this.productoreempla)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoReempla=true;
					this.inicializarActualizarBindingTablaProductoReempla(false);
					this.isEsNuevoProductoReempla=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoReempla=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoReempla=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoReempla(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoReempla(false);
				
				this.habilitarDeshabilitarControlesProductoReempla(false);
			
												
				
				if(ProductoReemplaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoReempla();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoReemplaActionPerformed(evt,productoreemplaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoReempla(this.productoreempla,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoReempla.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productoreemplaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productoreempla.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoReempla.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoReempla.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoReemplaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				this.productoreempla.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				this.productoreempla.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productoreempla)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoReemplaModel) this.jTableDatosProductoReempla.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoReempla=true;
				this.inicializarActualizarBindingTablaProductoReempla(false);
				this.isEsNuevoProductoReempla=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoReempla(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoReempla(false);
				
				this.habilitarDeshabilitarControlesProductoReempla(false);
				
				
				
				if(ProductoReemplaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoReempla();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoReemplaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoReempla.getRowCount()>=1) {
				jTableDatosProductoReempla.removeRowSelectionInterval(0, jTableDatosProductoReempla.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoReempla(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoReempla(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoReempla(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoReempla(false) ;
			
			this.isEsNuevoProductoReempla=false;
			
			if(ProductoReemplaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoReempla();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoReemplaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoReempla(false);
				
				//SI ES MANUAL
				if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoReempla();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoReemplaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoReempla--;			
			//ProductoReempla productoreemplaAux= new ProductoReempla();			
			//productoreemplaAux.setId(this.iIdNuevoProductoReempla);
			
			if(this.jInternalFrameDetalleFormProductoReempla==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoReempla();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
			
			this.productoreempla.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productoreemplaLogic.getProductoReemplas().add(this.productoreemplaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productoreemplas.add(this.productoreemplaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoReempla(false);
			
			this.jTableDatosProductoReempla.setRowSelectionInterval(this.getIndiceNuevoProductoReempla(), this.getIndiceNuevoProductoReempla());
			
			int iLastRow =  this.jTableDatosProductoReempla.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoReempla.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoReempla.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoReempla(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoReemplaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoReempla(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoReempla(false);
			
			//SI ES MANUAL
			if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoReempla();
			}
			
			//this.abrirFrameTreeProductoReempla();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoReemplaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ReemplazoS ?", "MANTENIMIENTO DE Reemplazo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoReempla.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoReempla();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productoreemplaReturnGeneral=productoreemplaLogic.procesarImportacionProductoReemplasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productoreemplaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoReemplaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoReemplaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoReempla.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoReempla.setFileImportacion(this.jInternalFrameImportacionProductoReempla.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoReempla.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoReempla.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoReempla.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoReempla.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoReemplaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoReempla> productoreemplasSeleccionados=new ArrayList<ProductoReempla>();		

		productoreemplasSeleccionados=this.getProductoReemplasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoReempla.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoReempla.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoReemplaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoReemplaBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoReemplas("Todos",productoreemplasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoreemplaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reemplazo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoReempla.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoReempla.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoReemplaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ProductoReempla_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ProductoReempla_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ProductoReempla_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ProductoReempla_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoProductoReempla.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoReempla.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoReempla.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoReemplaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA:
					sNombreCampoCategoria="id_producto_reempla";
					break;

				case ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoReempla.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoReemplaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA:
					sNombreCampoCategoriaValor="id_producto_reempla";
					break;

				case ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoReempla.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoReempla.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoReemplaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto Reempla",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto_reempla");
					break;

				case ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoReemplaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoReempla> productoreemplasSeleccionados=new ArrayList<ProductoReempla>();		
		
		productoreemplasSeleccionados=this.getProductoReemplasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoreempla";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoReemplas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoReempla.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoReempla.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoReemplaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProductoReempla productoreempla:productoreemplasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoreempla.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProductoReempla productoreempla:productoreemplasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoreempla.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProductoReempla productoreempla:productoreemplasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoreempla.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProductoReempla productoreempla:productoreemplasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoreempla.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA);
					iRow++;

					for(ProductoReempla productoreempla:productoreemplasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoreempla.getproductoreempla_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ProductoReempla productoreempla:productoreemplasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoreempla.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelProductoReempla(row);				
			//	iRow++;
			//}				
			
			//for(ProductoReempla productoreemplaAux:productoreemplasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoReempla(productoreemplaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoreemplaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reemplazo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	public void jButtonArbolProductoReemplaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.abrirFrameTreeProductoReempla("BUSQUEDA_NORMAL");
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoReempla(false);
			
			//SI ES MANUAL
			if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoReempla();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoReemplaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoReempla(false);
			
			//SI ES MANUAL
			if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoReempla();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoReemplaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoReempla(false);
			
			//SI ES MANUAL
			if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoReempla();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoReempla() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoReempla.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoReempla.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoReempla.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoReempla.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoReempla.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoReempla.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoReempla.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoReempla(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoReempla(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoReempla(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoReempla(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoReempla(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoReempla(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoReempla(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoReempla(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoReemplaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoReempla() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoReempla();
		
		this.inicializarActualizarBindingBotonesManualProductoReempla(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoReempla();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoReempla() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoReempla(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoReempla(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoReempla.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoReempla.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoReempla.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoReempla!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoReempla.jCheckBoxPostAccionNuevoProductoReempla.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoReempla.jCheckBoxPostAccionSinCerrarProductoReempla.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoReempla.jCheckBoxPostAccionSinMensajeProductoReempla.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoReempla.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoReempla.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoReempla.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoReempla!=null) {
				this.jInternalFrameDetalleFormProductoReempla.jCheckBoxPostAccionNuevoProductoReempla.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoReempla.jCheckBoxPostAccionSinCerrarProductoReempla.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoReempla.jCheckBoxPostAccionSinMensajeProductoReempla.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoReempla.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoReempla.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoReempla!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoReempla.jComboBoxTiposAccionesFormularioProductoReempla.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoReempla.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoReempla!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoReempla.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoReempla.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoReempla.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoReempla.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoReempla.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoReempla!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoReempla.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoReempla.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoReempla.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoReempla(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoReempla(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoReempla() throws Exception {
		try	{
			if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoReempla();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoReempla() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoReempla.jComboBoxTiposAccionesFormularioProductoReempla.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoReempla.jComboBoxTiposAccionesFormularioProductoReempla.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoReempla() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoReempla.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoReempla.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoReempla.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoReempla.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoReempla.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoReempla.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoReempla.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoReempla.addItem(reporte);
			}
			
			
			if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoReempla.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoReempla.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoReempla.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoReempla.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoReempla.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoReempla.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoReempla.jComboBoxTiposAccionesFormularioProductoReempla.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoReempla.jComboBoxTiposAccionesFormularioProductoReempla.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoReempla.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoReempla.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoReempla.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoReempla();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoReempla() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoReempla!=null) {
				this.jInternalFrameReporteDinamicoProductoReempla.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoReempla.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoReempla!=null) {
				this.jInternalFrameReporteDinamicoProductoReempla.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoReempla.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoReempla!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoReempla.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoReempla.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoReempla.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoReempla.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoReempla.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoReempla.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoReempla()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaProductoReempla.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaProductoReempla.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoProductoReempla.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoProductoReempla.getSelectedItem()).getId();}
		if(this.jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla.getSelectedItem()!=null){this.id_producto_reemplaFK_IdProductoReempla=((ProductoReempla)this.jComboBoxid_producto_reemplaFK_IdProductoReemplaProductoReempla.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoReempla(Boolean esInicializar) throws Exception {				
		if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoReempla();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoReempla() throws Exception {
		this.inicializarActualizarBindingTablaProductoReempla(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoReempla() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoReempla.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoReempla.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoReempla.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoReemplaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoReempla.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoReempla.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoReemplaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoReemplaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoReemplaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoReemplaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoReempla.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoReempla.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoReemplaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoReempla.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoReempla(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productoreemplaLogic.getProductoReemplas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productoreemplas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoReempla.setModel(new ProductoReemplaModel(this.productoreemplaLogic.getProductoReemplas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoReempla.setModel(new ProductoReemplaModel(this.productoreemplas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoReempla!=null && this.jInternalFrameOrderByProductoReempla.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoReempla();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoReempla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoReempla,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoReemplaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO,productoreemplaConstantesFunciones.resaltarSeleccionarProductoReempla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO,productoreemplaConstantesFunciones.resaltarSeleccionarProductoReempla,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoReempla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoReempla,ProductoReemplaConstantesFunciones.LABEL_ID));

		if(this.productoreemplaConstantesFunciones.mostraridProductoReempla && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoReemplaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoreemplaConstantesFunciones.resaltaridProductoReempla,this.productoreemplaConstantesFunciones.activaridProductoReempla,this,true,"idProductoReempla","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoreemplaConstantesFunciones.resaltaridProductoReempla,this.productoreemplaConstantesFunciones.activaridProductoReempla,this,true,"idProductoReempla","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoReempla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoReempla,ProductoReemplaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.productoreemplaConstantesFunciones.mostrarid_empresaProductoReempla && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoReemplaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.productoreemplaConstantesFunciones.resaltarid_empresaProductoReempla,this,this.productoreemplaConstantesFunciones.activarid_empresaProductoReempla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.productoreemplaConstantesFunciones.resaltarid_empresaProductoReempla,this,this.productoreemplaConstantesFunciones.activarid_empresaProductoReempla,false,"id_empresaProductoReempla","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoReemplaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoReempla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoReempla,ProductoReemplaConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.productoreemplaConstantesFunciones.mostrarid_sucursalProductoReempla && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoReemplaConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.productoreemplaConstantesFunciones.resaltarid_sucursalProductoReempla,this,this.productoreemplaConstantesFunciones.activarid_sucursalProductoReempla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.productoreemplaConstantesFunciones.resaltarid_sucursalProductoReempla,this,this.productoreemplaConstantesFunciones.activarid_sucursalProductoReempla,false,"id_sucursalProductoReempla","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoReemplaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoReempla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoReempla,ProductoReemplaConstantesFunciones.LABEL_IDBODEGA));

		if(this.productoreemplaConstantesFunciones.mostrarid_bodegaProductoReempla && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoReemplaConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.productoreemplaConstantesFunciones.resaltarid_bodegaProductoReempla,this,this.productoreemplaConstantesFunciones.activarid_bodegaProductoReempla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.productoreemplaConstantesFunciones.resaltarid_bodegaProductoReempla,this,this.productoreemplaConstantesFunciones.activarid_bodegaProductoReempla,true,"id_bodegaProductoReempla","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ProductoReemplaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoReempla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoReempla,ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.productoreemplaConstantesFunciones.mostrarid_productoProductoReempla && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.productoreemplaConstantesFunciones.resaltarid_productoProductoReempla,this,this.productoreemplaConstantesFunciones.activarid_productoProductoReempla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.productoreemplaConstantesFunciones.resaltarid_productoProductoReempla,this,this.productoreemplaConstantesFunciones.activarid_productoProductoReempla,true,"id_productoProductoReempla","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ProductoReemplaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoReempla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoReempla,ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA));

		if(this.productoreemplaConstantesFunciones.mostrarid_producto_reemplaProductoReempla && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoReemplaTableCell(this.productoreemplasForeignKey,this.productoreemplaConstantesFunciones.resaltarid_producto_reemplaProductoReempla,this,this.productoreemplaConstantesFunciones.activarid_producto_reemplaProductoReempla));
			tableColumn.setCellEditor(new ProductoReemplaTableCell(this.productoreemplasForeignKey,this.productoreemplaConstantesFunciones.resaltarid_producto_reemplaProductoReempla,this,this.productoreemplaConstantesFunciones.activarid_producto_reemplaProductoReempla,true,"id_producto_reemplaProductoReempla","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoReemplaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoReempla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoReempla,ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.productoreemplaConstantesFunciones.mostrardescripcionProductoReempla && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productoreemplaConstantesFunciones.resaltardescripcionProductoReempla,this.productoreemplaConstantesFunciones.activardescripcionProductoReempla,this,true,"descripcionProductoReempla","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoreemplaConstantesFunciones.resaltardescripcionProductoReempla,this.productoreemplaConstantesFunciones.activardescripcionProductoReempla,this,true,"descripcionProductoReempla","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoReemplaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProductoReempla && this.productoreemplaConstantesFunciones.mostrarProductoReemplaProductoReempla && !ProductoReemplaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Reemplazos");
				tableColumn.setHeaderValue("Reemplazos");
				tableColumn.setCellRenderer(new ProductoReemplaTableCell(productoreemplaConstantesFunciones.resaltarProductoReemplaProductoReempla,this,this.productoreemplaConstantesFunciones.activarProductoReemplaProductoReempla));
				tableColumn.setCellEditor(new ProductoReemplaTableCell(productoreemplaConstantesFunciones.resaltarProductoReemplaProductoReempla,this,this.productoreemplaConstantesFunciones.activarProductoReemplaProductoReempla));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProductoReempla.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoreemplaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoreemplaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoReempla.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoreemplaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoreemplaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoReempla.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoReempla && this.isPermisoGuardarCambiosProductoReempla) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productoreemplaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productoreemplaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoReempla.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.productoreemplaSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosProductoReempla.addColumn(tableColumn);
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
			
			this.jTableDatosProductoReempla.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoReempla && this.isPermisoGuardarCambiosProductoReempla) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.productoreemplaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoReempla && this.isPermisoGuardarCambiosProductoReempla) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoReempla.moveColumn(this.jTableDatosProductoReempla.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoReempla.moveColumn(this.jTableDatosProductoReempla.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.productoreemplaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosProductoReempla.moveColumn(this.jTableDatosProductoReempla.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoReempla.moveColumn(this.jTableDatosProductoReempla.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoReempla.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoReempla.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoReempla,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoReempla.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoReempla.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoReemplaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoReempla.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoReempla.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoReempla.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productoreemplaLogic.getProductoReemplas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productoreemplas.size()-1;
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
		//this.jTableDatosProductoReempla.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoReempla.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoReempla();
			
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
				
				//this.isEsNuevoProductoReempla=false;
					
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			
				if(this.productoreemplaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoReempla==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoReempla.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoReempla.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productoreempla.getsType().equals("DUPLICADO")
				   || this.productoreempla.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoReempla=true;
				
				} else {
					this.isEsNuevoProductoReempla=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
					if(this.productoreempla.getId()>=0 && !this.productoreempla.getIsNew()) {						
						this.isEsNuevoProductoReempla=false;
						
					} else {
						this.isEsNuevoProductoReempla=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoReempla(esRelaciones);						
				
				this.seleccionarProductoReempla(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productoreempla.getId()<0) {
					this.isEsNuevoProductoReempla=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoReempla(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoReempla(evt,rowIndex);
				}	
				
				if(this.productoreemplaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoReempla: " + this.dDif); 
					}
				}								
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoReempla(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productoreempla)) {
					if(this.productoreempla.getId()>0) {
						this.productoreempla.setIsDeleted(true);
						
						this.productoreemplasEliminados.add(this.productoreempla);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoreemplaLogic.getProductoReemplas().remove(this.productoreempla);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoreemplas.remove(this.productoreempla);				
					}
					
					
					((ProductoReemplaModel) this.jTableDatosProductoReempla.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoReempla(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoReempla(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoReempla) {
			
			if(this.jInternalFrameDetalleFormProductoReempla==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoReempla.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoReempla.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoReempla(this.productoreempla);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.productoreemplaConstantesFunciones.cargarid_empresaProductoReempla || this.productoreemplaConstantesFunciones.event_dependid_empresaProductoReempla) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.productoreempla.getid_empresa());
									//this.inicializarActualizarBindingProductoReempla(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(productoreempla.getEmpresa()!=null) {
							this.empresasForeignKey.add(productoreempla.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.productoreempla.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.productoreemplaConstantesFunciones.cargarid_sucursalProductoReempla || this.productoreemplaConstantesFunciones.event_dependid_sucursalProductoReempla) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.productoreempla.getid_sucursal());
									//this.inicializarActualizarBindingProductoReempla(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(productoreempla.getSucursal()!=null) {
							this.sucursalsForeignKey.add(productoreempla.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.productoreempla.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.productoreemplaConstantesFunciones.cargarid_bodegaProductoReempla || this.productoreemplaConstantesFunciones.event_dependid_bodegaProductoReempla) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.productoreempla.getid_bodega());
									//this.inicializarActualizarBindingProductoReempla(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(productoreempla.getBodega()!=null) {
							this.bodegasForeignKey.add(productoreempla.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.productoreempla.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.productoreemplaConstantesFunciones.cargarid_productoProductoReempla || this.productoreemplaConstantesFunciones.event_dependid_productoProductoReempla) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.productoreempla.getid_producto());
									//this.inicializarActualizarBindingProductoReempla(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(productoreempla.getProducto()!=null) {
							this.productosForeignKey.add(productoreempla.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.productoreempla.getid_producto(),false,"Formulario");

					//ProductoReempla
					if(!this.productoreemplaConstantesFunciones.cargarid_producto_reemplaProductoReempla || this.productoreemplaConstantesFunciones.event_dependid_producto_reemplaProductoReempla) {
						//this.cargarCombosProductoReemplasForeignKeyLista(" where id="+this.productoreempla.getid_producto_reempla());
									//this.inicializarActualizarBindingProductoReempla(false,false);
						this.productoreemplasForeignKey=new ArrayList<ProductoReempla>();

						if(productoreempla.getProductoReempla()!=null) {
							this.productoreemplasForeignKey.add(productoreempla.getProductoReempla());
						}

						this.addItemDefectoCombosForeignKeyProductoReempla();
						this.cargarCombosFrameProductoReemplasForeignKey("Todos");
					}
					this.setActualProductoReemplaForeignKey(this.productoreempla.getid_producto_reempla(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoReempla("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoReempla(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoReempla() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoReempla(ProductoReempla productoreempla) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoReempla(productoreempla,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoReempla(ProductoReempla productoreempla,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoReempla(productoreempla);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoReempla(productoreempla,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoReempla(productoreempla);
	}
	
	public void setVariablesObjetoActualToFormularioProductoReempla(ProductoReempla productoreempla) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoReempla==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoReempla.jLabelidProductoReempla.setText(productoreempla.getId().toString());
			this.jInternalFrameDetalleFormProductoReempla.jTextAreadescripcionProductoReempla.setText(productoreempla.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoReempla productoreemplaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productoreemplaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoReempla productoreemplaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productoreemplaLocal=this.productoreempla;
			} else {
				productoreemplaLocal=this.productoreemplaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productoreemplaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoReempla(productoreemplaLocal,true);
					
					if(productoreemplaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productoreemplaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productoreemplaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoReempla(ProductoReempla productoreempla,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoReempla(productoreempla,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(productoreempla);
	}
	
	public void setVariablesFormularioToObjetoActualProductoReempla(ProductoReempla productoreempla,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoReempla(productoreempla,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoReempla(ProductoReempla productoreempla,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoReempla==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoReempla.jLabelidProductoReempla.getText()==null || this.jInternalFrameDetalleFormProductoReempla.jLabelidProductoReempla.getText()=="" || this.jInternalFrameDetalleFormProductoReempla.jLabelidProductoReempla.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoReempla.jLabelidProductoReempla.setText("0");
			}

			if(conColumnasBase) {productoreempla.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoReempla.jLabelidProductoReempla.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoReemplaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoReempla.jLabelIdProductoReempla,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoreempla.setdescripcion(this.jInternalFrameDetalleFormProductoReempla.jTextAreadescripcionProductoReempla.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoReempla.jLabeldescripcionProductoReempla,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoReempla(ProductoReempla productoreemplaBean,ProductoReempla productoreempla,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productoreemplaBean.getid_bodega()!=null && !productoreemplaBean.getid_bodega().equals(-1L))) {productoreempla.setid_bodega(productoreemplaBean.getid_bodega());}
			if(conDefault || (!conDefault && productoreemplaBean.getid_producto()!=null && !productoreemplaBean.getid_producto().equals(-1L))) {productoreempla.setid_producto(productoreemplaBean.getid_producto());}
			if(conDefault || (!conDefault && productoreemplaBean.getid_producto_reempla()!=null && !productoreemplaBean.getid_producto_reempla().equals(-1L))) {productoreempla.setid_producto_reempla(productoreemplaBean.getid_producto_reempla());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoReempla(ProductoReempla productoreemplaOrigen,ProductoReempla productoreempla,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoreemplaOrigen.getId()!=null && !productoreemplaOrigen.getId().equals(0L))) {productoreempla.setId(productoreemplaOrigen.getId());}}
			if(conDefault || (!conDefault && productoreemplaOrigen.getid_bodega()!=null && !productoreemplaOrigen.getid_bodega().equals(-1L))) {productoreempla.setid_bodega(productoreemplaOrigen.getid_bodega());}
			if(conDefault || (!conDefault && productoreemplaOrigen.getid_producto()!=null && !productoreemplaOrigen.getid_producto().equals(-1L))) {productoreempla.setid_producto(productoreemplaOrigen.getid_producto());}
			if(conDefault || (!conDefault && productoreemplaOrigen.getid_producto_reempla()!=null && !productoreemplaOrigen.getid_producto_reempla().equals(-1L))) {productoreempla.setid_producto_reempla(productoreemplaOrigen.getid_producto_reempla());}
			if(conDefault || (!conDefault && productoreemplaOrigen.getdescripcion()!=null && !productoreemplaOrigen.getdescripcion().equals(""))) {productoreempla.setdescripcion(productoreemplaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoReempla(ProductoReempla productoreempla) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoReempla.jLabelidProductoReempla.setText(productoreempla.getId().toString());
			this.jInternalFrameDetalleFormProductoReempla.jTextAreadescripcionProductoReempla.setText(productoreempla.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoReempla(ProductoReemplaBean productoreemplaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoReempla.jLabelidProductoReempla.setText(productoreemplaBean.getId().toString());
			this.jInternalFrameDetalleFormProductoReempla.jTextAreadescripcionProductoReempla.setText(productoreemplaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoReempla(ProductoReemplaParameterReturnGeneral productoreemplaReturnGeneral,ProductoReemplaBean productoreemplaBean,Boolean conDefault) throws Exception { 
		try {
			ProductoReempla productoreemplaLocal=new ProductoReempla();
			
			productoreemplaLocal=productoreemplaReturnGeneral.getProductoReempla();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoreemplaLocal.getId()!=null && !productoreemplaLocal.getId().equals(0L))) {productoreemplaBean.setId(productoreemplaLocal.getId());}}
			if(conDefault || (!conDefault && productoreemplaLocal.getid_bodega()!=null && !productoreemplaLocal.getid_bodega().equals(-1L))) {productoreemplaBean.setid_bodega(productoreemplaLocal.getid_bodega());}
			if(conDefault || (!conDefault && productoreemplaLocal.getid_producto()!=null && !productoreemplaLocal.getid_producto().equals(-1L))) {productoreemplaBean.setid_producto(productoreemplaLocal.getid_producto());}
			if(conDefault || (!conDefault && productoreemplaLocal.getid_producto_reempla()!=null && !productoreemplaLocal.getid_producto_reempla().equals(-1L))) {productoreemplaBean.setid_producto_reempla(productoreemplaLocal.getid_producto_reempla());}
			if(conDefault || (!conDefault && productoreemplaLocal.getdescripcion()!=null && !productoreemplaLocal.getdescripcion().equals(""))) {productoreemplaBean.setdescripcion(productoreemplaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoReemplaGenerico(Long idProductoReemplaSeleccionado,JComboBox jComboBoxProductoReempla,List<ProductoReempla> productoreemplasLocal)throws Exception {
		try {
			ProductoReempla  productoreemplaTemp=null;

			for(ProductoReempla productoreemplaAux:productoreemplasLocal) {
				if(productoreemplaAux.getId()!=null && productoreemplaAux.getId().equals(idProductoReemplaSeleccionado)) {
					productoreemplaTemp=productoreemplaAux;
					break;
				}
			}

			jComboBoxProductoReempla.setSelectedItem(productoreemplaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoReemplaGenerico(JComboBox jComboBoxProductoReempla,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoReempla.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoReempla.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoReempla.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoReempla.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
				//AUTOREFERENCIADA
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
				
				jComboBoxProductoReempla.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoReempla.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Arbol"));			
				//AUTOREFERENCIADA
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
			
		if(sTipo.equals("ProductoReempla")) {
			jButtonProductoReemplaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoreempla=(ProductoReempla) productoreemplaLogic.getProductoReemplas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoreempla =(ProductoReempla) productoreemplas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productoreempla.getIsNew() && !productoreempla.getIsChanged() && !productoreempla.getIsDeleted()) {
				sDescripcion=productoreempla.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productoreempla.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!productoreempla.getIsNew() && !productoreempla.getIsChanged() && !productoreempla.getIsDeleted()) {
				sDescripcion=productoreempla.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=productoreempla.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!productoreempla.getIsNew() && !productoreempla.getIsChanged() && !productoreempla.getIsDeleted()) {
				sDescripcion=productoreempla.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=productoreempla.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!productoreempla.getIsNew() && !productoreempla.getIsChanged() && !productoreempla.getIsDeleted()) {
				sDescripcion=productoreempla.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=productoreempla.getproducto_descripcion();
			}
		}

		if(sTipo.equals("ProductoReempla")) {
			//sDescripcion=this.getActualProductoReemplaForeignKeyDescripcion((Long)value);
			if(!productoreempla.getIsNew() && !productoreempla.getIsChanged() && !productoreempla.getIsDeleted()) {
				sDescripcion=productoreempla.getproductoreempla_descripcion();
			} else {
				//sDescripcion=this.getActualProductoReemplaForeignKeyDescripcion((Long)value);
				sDescripcion=productoreempla.getproductoreempla_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoReempla productoreemplaRow=new ProductoReempla();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoreemplaRow=(ProductoReempla) productoreemplaLogic.getProductoReemplas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoreemplaRow=(ProductoReempla) productoreemplas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProductoReemplaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,ProductoReempla productoreempla) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProductoReempla==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoreempla = (ProductoReempla)this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.productoreempla = (ProductoReempla)this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(productoreempla!=null) {
						this.productoreempla = productoreempla;
					} else {
						this.productoreempla = new ProductoReempla();
					}
				}

				if(this.isTienePermisosProductoReempla && this.permiteMantenimiento(this.productoreempla)) {
					ProductoReemplaBeanSwingJInternalFrame productoreemplaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFramePopup=new ProductoReemplaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						productoreemplaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFramePopup;
					} else {
						productoreemplaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame;
					}

					List<ProductoReempla> productoreemplas=new ArrayList<ProductoReempla>();
					productoreemplas.add(this.productoreempla);
					if(!esRelacionado) {
						//productoreemplaBeanSwingJInternalFrame.productoreemplaSessionBean.setConGuardarRelaciones(false);
						//productoreemplaBeanSwingJInternalFrame.productoreemplaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					productoreemplaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProductoReempla.cargarProductoReemplaBeanSwingJInternalFrame(productoreemplas,this.productoreempla,productoreemplaBeanSwingJInternalFrame,/*conInicializar,*/productoreemplaBeanSwingJInternalFrame.productoreemplaSessionBean.getConGuardarRelaciones(),productoreemplaBeanSwingJInternalFrame.productoreemplaSessionBean.getEsGuardarRelacionado());
					productoreemplaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						productoreemplaBeanSwingJInternalFrame.actualizarEstadoPanelsProductoReempla("no_relacionado");

						productoreemplaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProductoReemplaConstantesFunciones.ITAMANIOFILATABLA + (ProductoReemplaConstantesFunciones.ITAMANIOFILATABLA/2));

						productoreemplaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProductoReempla=(TitledBorder)this.jScrollPanelDatosProductoReempla.getBorder();
						titledBorderProductoReempla.setTitle(titledBorderProductoReempla.getTitle() + " -> Reemplazo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,productoreemplaBeanSwingJInternalFrame);
						}

						productoreemplaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(productoreemplaBeanSwingJInternalFrame);

						productoreemplaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.productoreemplaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Reemplazo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoReempla(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoReempla.setVisible((this.isVisibilidadCeldaNuevoProductoReempla && this.isPermisoNuevoProductoReempla));			
			this.jButtonDuplicarProductoReempla.setVisible((this.isVisibilidadCeldaDuplicarProductoReempla && this.isPermisoDuplicarProductoReempla));			
			this.jButtonCopiarProductoReempla.setVisible((this.isVisibilidadCeldaCopiarProductoReempla && this.isPermisoCopiarProductoReempla));
			this.jButtonVerFormProductoReempla.setVisible((this.isVisibilidadCeldaVerFormProductoReempla && this.isPermisoVerFormProductoReempla));
			
			this.jButtonAbrirOrderByProductoReempla.setVisible((this.isVisibilidadCeldaOrdenProductoReempla && this.isPermisoOrdenProductoReempla));			
			
			this.jButtonNuevoRelacionesProductoReempla.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoReempla && this.isPermisoNuevoProductoReempla));			
			this.jButtonNuevoGuardarCambiosProductoReempla.setVisible((this.isVisibilidadCeldaNuevoProductoReempla && this.isPermisoNuevoProductoReempla && this.isPermisoGuardarCambiosProductoReempla));
			
			if(this.jInternalFrameDetalleFormProductoReempla!=null) {
			this.jInternalFrameDetalleFormProductoReempla.jButtonModificarProductoReempla.setVisible((this.isVisibilidadCeldaModificarProductoReempla && this.isPermisoActualizarProductoReempla));	
			this.jInternalFrameDetalleFormProductoReempla.jButtonActualizarProductoReempla.setVisible((this.isVisibilidadCeldaActualizarProductoReempla && this.isPermisoActualizarProductoReempla));	
			this.jInternalFrameDetalleFormProductoReempla.jButtonEliminarProductoReempla.setVisible((this.isVisibilidadCeldaEliminarProductoReempla && this.isPermisoEliminarProductoReempla));
			this.jInternalFrameDetalleFormProductoReempla.jButtonCancelarProductoReempla.setVisible(this.isVisibilidadCeldaCancelarProductoReempla);							
			this.jInternalFrameDetalleFormProductoReempla.jButtonGuardarCambiosProductoReempla.setVisible((this.isVisibilidadCeldaGuardarProductoReempla && this.isPermisoGuardarCambiosProductoReempla));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoReempla.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoReempla && this.isPermisoGuardarCambiosProductoReempla));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoReempla.setVisible((this.isVisibilidadCeldaNuevoProductoReempla && this.isPermisoNuevoProductoReempla));						
			this.jButtonDuplicarToolBarProductoReempla.setVisible((this.isVisibilidadCeldaDuplicarProductoReempla && this.isPermisoDuplicarProductoReempla));						
			this.jButtonCopiarToolBarProductoReempla.setVisible((this.isVisibilidadCeldaCopiarProductoReempla && this.isPermisoCopiarProductoReempla));			
			this.jButtonVerFormToolBarProductoReempla.setVisible((this.isVisibilidadCeldaVerFormProductoReempla && this.isPermisoVerFormProductoReempla));			
			this.jButtonAbrirOrderByToolBarProductoReempla.setVisible((this.isVisibilidadCeldaOrdenProductoReempla && this.isPermisoOrdenProductoReempla));
			this.jButtonNuevoRelacionesToolBarProductoReempla.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoReempla && this.isPermisoNuevoProductoReempla));			
			this.jButtonNuevoGuardarCambiosToolBarProductoReempla.setVisible((this.isVisibilidadCeldaNuevoProductoReempla && this.isPermisoNuevoProductoReempla && this.isPermisoGuardarCambiosProductoReempla));			
			
			if(this.jInternalFrameDetalleFormProductoReempla!=null) {
			this.jInternalFrameDetalleFormProductoReempla.jButtonModificarToolBarProductoReempla.setVisible((this.isVisibilidadCeldaModificarProductoReempla && this.isPermisoActualizarProductoReempla));	
			this.jInternalFrameDetalleFormProductoReempla.jButtonActualizarToolBarProductoReempla.setVisible((this.isVisibilidadCeldaActualizarProductoReempla  && this.isPermisoActualizarProductoReempla));	
			this.jInternalFrameDetalleFormProductoReempla.jButtonEliminarToolBarProductoReempla.setVisible((this.isVisibilidadCeldaEliminarProductoReempla && this.isPermisoEliminarProductoReempla));
			this.jInternalFrameDetalleFormProductoReempla.jButtonCancelarToolBarProductoReempla.setVisible(this.isVisibilidadCeldaCancelarProductoReempla);				
			this.jInternalFrameDetalleFormProductoReempla.jButtonGuardarCambiosToolBarProductoReempla.setVisible((this.isVisibilidadCeldaGuardarProductoReempla && this.isPermisoGuardarCambiosProductoReempla));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoReempla.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoReempla && this.isPermisoGuardarCambiosProductoReempla));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoReempla.setVisible((this.isVisibilidadCeldaNuevoProductoReempla && this.isPermisoNuevoProductoReempla));			
			this.jMenuItemDuplicarProductoReempla.setVisible((this.isVisibilidadCeldaDuplicarProductoReempla && this.isPermisoDuplicarProductoReempla));			
			this.jMenuItemCopiarProductoReempla.setVisible((this.isVisibilidadCeldaCopiarProductoReempla && this.isPermisoCopiarProductoReempla));			
			this.jMenuItemVerFormProductoReempla.setVisible((this.isVisibilidadCeldaVerFormProductoReempla && this.isPermisoVerFormProductoReempla));			
			this.jMenuItemAbrirOrderByProductoReempla.setVisible((this.isVisibilidadCeldaOrdenProductoReempla && this.isPermisoOrdenProductoReempla));			
			//this.jMenuItemMostrarOcultarProductoReempla.setVisible((this.isVisibilidadCeldaOrdenProductoReempla && this.isPermisoOrdenProductoReempla));
			this.jMenuItemDetalleAbrirOrderByProductoReempla.setVisible((this.isVisibilidadCeldaOrdenProductoReempla && this.isPermisoOrdenProductoReempla));			
			//this.jMenuItemDetalleMostrarOcultarProductoReempla.setVisible((this.isVisibilidadCeldaOrdenProductoReempla && this.isPermisoOrdenProductoReempla));			
			this.jMenuItemNuevoRelacionesProductoReempla.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoReempla && this.isPermisoNuevoProductoReempla));			
			this.jMenuItemNuevoGuardarCambiosProductoReempla.setVisible((this.isVisibilidadCeldaNuevoProductoReempla && this.isPermisoNuevoProductoReempla && this.isPermisoGuardarCambiosProductoReempla));									
			
			if(this.jInternalFrameDetalleFormProductoReempla!=null) {
			this.jInternalFrameDetalleFormProductoReempla.jMenuItemModificarProductoReempla.setVisible((this.isVisibilidadCeldaModificarProductoReempla && this.isPermisoActualizarProductoReempla));	
			this.jInternalFrameDetalleFormProductoReempla.jMenuItemActualizarProductoReempla.setVisible((this.isVisibilidadCeldaActualizarProductoReempla && this.isPermisoActualizarProductoReempla));	
			this.jInternalFrameDetalleFormProductoReempla.jMenuItemEliminarProductoReempla.setVisible((this.isVisibilidadCeldaEliminarProductoReempla && this.isPermisoEliminarProductoReempla));
			this.jInternalFrameDetalleFormProductoReempla.jMenuItemCancelarProductoReempla.setVisible(this.isVisibilidadCeldaCancelarProductoReempla);				
			}
			
			this.jMenuItemGuardarCambiosProductoReempla.setVisible((this.isVisibilidadCeldaGuardarProductoReempla && this.isPermisoGuardarCambiosProductoReempla));						
			this.jMenuItemGuardarCambiosTablaProductoReempla.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoReempla && this.isPermisoGuardarCambiosProductoReempla));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoReempla=this.jButtonNuevoProductoReempla.isVisible();
			this.isVisibilidadCeldaDuplicarProductoReempla=this.jButtonDuplicarProductoReempla.isVisible();
			this.isVisibilidadCeldaCopiarProductoReempla=this.jButtonCopiarProductoReempla.isVisible();
			this.isVisibilidadCeldaVerFormProductoReempla=this.jButtonVerFormProductoReempla.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoReempla=this.jButtonAbrirOrderByProductoReempla.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoReempla=this.jButtonNuevoRelacionesProductoReempla.isVisible();
			this.isVisibilidadCeldaModificarProductoReempla=this.jButtonModificarProductoReempla.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoReempla!=null) {
			this.isVisibilidadCeldaActualizarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jButtonActualizarProductoReempla.isVisible();
			this.isVisibilidadCeldaEliminarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jButtonEliminarProductoReempla.isVisible();
			this.isVisibilidadCeldaCancelarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jButtonCancelarProductoReempla.isVisible();
			this.isVisibilidadCeldaGuardarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jButtonGuardarCambiosProductoReempla.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoReempla=this.jButtonGuardarCambiosTablaProductoReempla.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoReempla=this.jButtonNuevoToolBarProductoReempla.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoReempla=this.jButtonNuevoRelacionesToolBarProductoReempla.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoReempla!=null) {
			this.isVisibilidadCeldaModificarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jButtonModificarToolBarProductoReempla.isVisible();
			this.isVisibilidadCeldaActualizarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jButtonActualizarToolBarProductoReempla.isVisible();
			this.isVisibilidadCeldaEliminarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jButtonEliminarToolBarProductoReempla.isVisible();
			this.isVisibilidadCeldaCancelarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jButtonCancelarToolBarProductoReempla.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoReempla=this.jButtonGuardarCambiosToolBarProductoReempla.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoReempla=this.jButtonGuardarCambiosTablaToolBarProductoReempla.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoReempla=this.jMenuItemNuevoProductoReempla.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoReempla=this.jMenuItemNuevoRelacionesProductoReempla.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoReempla!=null) {
			this.isVisibilidadCeldaModificarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jMenuItemModificarProductoReempla.isVisible();
			this.isVisibilidadCeldaActualizarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jMenuItemActualizarProductoReempla.isVisible();
			this.isVisibilidadCeldaEliminarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jMenuItemEliminarProductoReempla.isVisible();
			this.isVisibilidadCeldaCancelarProductoReempla=this.jInternalFrameDetalleFormProductoReempla.jMenuItemCancelarProductoReempla.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoReempla=this.jMenuItemGuardarCambiosProductoReempla.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoReempla=this.jMenuItemGuardarCambiosTablaProductoReempla.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoReempla(Boolean esInicializar) {
		if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productoreemplaSessionBean.getConGuardarRelaciones()) {
				//if(this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoReempla();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoReempla(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoReempla() {
		this.jButtonNuevoProductoReempla.setVisible(this.isPermisoNuevoProductoReempla);			
		this.jButtonDuplicarProductoReempla.setVisible(this.isPermisoDuplicarProductoReempla);			
		this.jButtonCopiarProductoReempla.setVisible(this.isPermisoCopiarProductoReempla);			
		this.jButtonVerFormProductoReempla.setVisible(this.isPermisoVerFormProductoReempla);			
		
		this.jButtonAbrirOrderByProductoReempla.setVisible(this.isPermisoOrdenProductoReempla);					
		
		this.jButtonNuevoRelacionesProductoReempla.setVisible(this.isPermisoNuevoProductoReempla);			
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoReempla.jButtonModificarProductoReempla.setVisible(this.isPermisoActualizarProductoReempla);	
			this.jInternalFrameDetalleFormProductoReempla.jButtonActualizarProductoReempla.setVisible(this.isPermisoActualizarProductoReempla);	
			this.jInternalFrameDetalleFormProductoReempla.jButtonEliminarProductoReempla.setVisible(this.isPermisoEliminarProductoReempla);
			this.jInternalFrameDetalleFormProductoReempla.jButtonCancelarProductoReempla.setVisible(this.isVisibilidadCeldaCancelarProductoReempla);						
			this.jInternalFrameDetalleFormProductoReempla.jButtonGuardarCambiosProductoReempla.setVisible(this.isPermisoGuardarCambiosProductoReempla);							
		}
		
		this.jButtonGuardarCambiosTablaProductoReempla.setVisible(this.isPermisoActualizarProductoReempla);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoReempla() {
		this.jInternalFrameDetalleFormProductoReempla.jButtonModificarProductoReempla.setVisible(this.isPermisoActualizarProductoReempla);	
		this.jInternalFrameDetalleFormProductoReempla.jButtonActualizarProductoReempla.setVisible(this.isPermisoActualizarProductoReempla);	
		this.jInternalFrameDetalleFormProductoReempla.jButtonEliminarProductoReempla.setVisible(this.isPermisoEliminarProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jButtonCancelarProductoReempla.setVisible(this.isVisibilidadCeldaCancelarProductoReempla);							
		this.jInternalFrameDetalleFormProductoReempla.jButtonGuardarCambiosProductoReempla.setVisible((this.isVisibilidadCeldaGuardarProductoReempla && this.isPermisoGuardarCambiosProductoReempla));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoReempla() {
		if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoReempla();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoReempla() {
	}
	
	public void jTableDatosProductoReemplaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoReempla(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoReemplaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoReempla(this.getproductoreempla(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoreempla==null) {
						this.productoreempla = new ProductoReempla();
					}

					this.setVariablesFormularioToObjetoActualProductoReempla(this.productoreempla,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
				}

				if(this.productoreempla.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productoreempla.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoReempla(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductoReemplaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductoReempla(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoReempla.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoReempla.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoReempla(this.getproductoreempla(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productoreemplaLogic.getConnexion());

				if(this.productoreempla.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productoreempla.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoReempla=(TitledBorder)this.jScrollPanelDatosProductoReempla.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductoReempla.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductoReemplaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoReempla(this.getproductoreempla(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoreempla==null) {
						this.productoreempla = new ProductoReempla();
					}

					this.setVariablesFormularioToObjetoActualProductoReempla(this.productoreempla,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
				}

				if(this.productoreempla.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productoreempla.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoReempla(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProductoReemplaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProductoReempla(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoReempla.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoReempla.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoReempla(this.getproductoreempla(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.productoreemplaLogic.getConnexion());

				if(this.productoreempla.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.productoreempla.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoReempla=(TitledBorder)this.jScrollPanelDatosProductoReempla.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProductoReempla.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProductoReemplaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoReempla(this.getproductoreempla(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoreempla==null) {
						this.productoreempla = new ProductoReempla();
					}

					this.setVariablesFormularioToObjetoActualProductoReempla(this.productoreempla,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
				}

				if(this.productoreempla.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.productoreempla.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoReempla(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProductoReemplaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProductoReempla(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoReempla.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoReempla.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoReempla(this.getproductoreempla(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.productoreemplaLogic.getConnexion());

				if(this.productoreempla.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.productoreempla.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoReempla=(TitledBorder)this.jScrollPanelDatosProductoReempla.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProductoReempla.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProductoReemplaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoReempla(this.getproductoreempla(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoreempla==null) {
						this.productoreempla = new ProductoReempla();
					}

					this.setVariablesFormularioToObjetoActualProductoReempla(this.productoreempla,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
				}

				if(this.productoreempla.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.productoreempla.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoReempla(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProductoReemplaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderProductoReempla=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosProductoReempla.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoReempla=(TitledBorder)this.jScrollPanelDatosProductoReempla.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoReempla.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoProductoReemplaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProductoReempla(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoReempla.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoReempla.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoReempla(this.getproductoreempla(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.productoreemplaLogic.getConnexion());

				if(this.productoreempla.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.productoreempla.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoReempla=(TitledBorder)this.jScrollPanelDatosProductoReempla.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoReempla.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProductoReemplaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoReempla(this.getproductoreempla(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoreempla==null) {
						this.productoreempla = new ProductoReempla();
					}

					this.setVariablesFormularioToObjetoActualProductoReempla(this.productoreempla,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
				}

				if(this.productoreempla.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.productoreempla.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoReempla(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_producto_reemplaProductoReemplaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproductoreempla=true;

			idTienePermisoproductoreempla=this.tienePermisosUsuarioEnPaginaWebProductoReempla(ProductoReemplaConstantesFunciones.CLASSNAME);

			if(idTienePermisoproductoreempla) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoReempla.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoReempla.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoReempla(this.getproductoreempla(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);

				this.productoreemplaBeanSwingJInternalFrame=new ProductoReemplaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoreemplaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoreemplaBeanSwingJInternalFrame.getProductoReemplaLogic().setConnexion(this.productoreemplaLogic.getConnexion());

				if(this.productoreempla.getid_producto_reempla()!=null) {
					this.productoreemplaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoreemplaBeanSwingJInternalFrame.setIdActual(this.productoreempla.getid_producto_reempla());
					this.productoreemplaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoreemplaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoreemplaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoReempla();
				}

				JInternalFrameBase jinternalFrame =this.productoreemplaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoReempla=(TitledBorder)this.jScrollPanelDatosProductoReempla.getBorder();
				TitledBorder titledBorderproductoreempla=(TitledBorder)this.productoreemplaBeanSwingJInternalFrame.jScrollPanelDatosProductoReempla.getBorder();

				titledBorderproductoreempla.setTitle(titledBorderProductoReempla.getTitle() + " -> Reemplazo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_producto_reemplaProductoReemplaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoReempla(this.getproductoreempla(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoreempla==null) {
						this.productoreempla = new ProductoReempla();
					}

					this.setVariablesFormularioToObjetoActualProductoReempla(this.productoreempla,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
				}

				if(this.productoreempla.getid_producto_reempla()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto_reempla = "+this.productoreempla.getid_producto_reempla().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoReempla(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionProductoReemplaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoReempla(this.getproductoreempla(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoreempla==null) {
						this.productoreempla = new ProductoReempla();
					}

					this.setVariablesFormularioToObjetoActualProductoReempla(this.productoreempla,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);
				}

				if(this.productoreempla.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.productoreempla.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoReempla(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaProductoReemplaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoReempla(false,false);

			this.getProductoReemplasFK_IdBodega();

			this.inicializarActualizarBindingProductoReempla(false);

			//if(ProductoReemplaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoReempla(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProductoReemplaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoReempla(false,false);

			this.getProductoReemplasFK_IdEmpresa();

			this.inicializarActualizarBindingProductoReempla(false);

			//if(ProductoReemplaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoReempla(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProductoReemplaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoReempla(false,false);

			this.getProductoReemplasFK_IdProducto();

			this.inicializarActualizarBindingProductoReempla(false);

			//if(ProductoReemplaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoReempla(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoReemplaProductoReemplaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoReempla(false,false);

			this.getProductoReemplasFK_IdProductoReempla();

			this.inicializarActualizarBindingProductoReempla(false);

			//if(ProductoReemplaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoReempla(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProductoReemplaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoReempla(false,false);

			this.getProductoReemplasFK_IdSucursal();

			this.inicializarActualizarBindingProductoReempla(false);

			//if(ProductoReemplaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoReempla(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoreemplaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoReempla() {
		if(this.jInternalFrameDetalleFormProductoReempla!=null) {
		

		if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) {
			this.jInternalFrameDetalleFormProductoReempla.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoReempla.dispose();
			this.jInternalFrameDetalleFormProductoReempla=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoReempla!=null) {
			this.jInternalFrameReporteDinamicoProductoReempla.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoReempla.dispose();
			this.jInternalFrameReporteDinamicoProductoReempla=null;
		}
		
		if(this.jInternalFrameImportacionProductoReempla!=null) {
			this.jInternalFrameImportacionProductoReempla.setVisible(false);	    			
			this.jInternalFrameImportacionProductoReempla.dispose();
			this.jInternalFrameImportacionProductoReempla=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	public void closingTreeFrameProductoReempla() {
		
		if(this.jInternalFrameTreeProductoReempla!=null) {
			this.jInternalFrameTreeProductoReempla.setVisible(false);	    			
			this.jInternalFrameTreeProductoReempla.dispose();
			this.jInternalFrameTreeProductoReempla=null;
		}
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoReempla();
			
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoReempla")) {
				jButtonNuevoProductoReemplaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoReempla")) {
				jButtonDuplicarProductoReemplaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoReempla")) {
				jButtonCopiarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoReempla")) {
				jButtonVerFormProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoReempla")) {
				jButtonNuevoProductoReemplaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoReempla")) {
				jButtonDuplicarProductoReemplaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoReempla")) {
				jButtonNuevoProductoReemplaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoReempla")) {
				jButtonDuplicarProductoReemplaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoReempla")) {
				jButtonNuevoProductoReemplaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoReempla")) {
				jButtonNuevoProductoReemplaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoReempla")) {
				jButtonNuevoProductoReemplaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoReempla")) {
				jButtonModificarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoReempla")) {
				jButtonModificarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoReempla")) {
				jButtonModificarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoReempla")) {
				jButtonActualizarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoReempla")) {
				jButtonActualizarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoReempla")) {
				jButtonActualizarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoReempla")) {
				jButtonEliminarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoReempla")) {
				jButtonEliminarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoReempla")) {
				jButtonEliminarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoReempla")) {
				jButtonCancelarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoReempla")) {
				jButtonCancelarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoReempla")) {
				jButtonCancelarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoReempla")) {
				jButtonCerrarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoReempla")) {
				jButtonCerrarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoReempla")) {
				jButtonCerrarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoReempla")) {
				jButtonMostrarOcultarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoReempla")) {
				jButtonCancelarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoReempla")) {
				jButtonGuardarCambiosProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoReempla")) {
				jButtonGuardarCambiosProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoReempla")) {
				jButtonCopiarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoReempla")) {
				jButtonVerFormProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoReempla")) {
				jButtonGuardarCambiosProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoReempla")) {
				jButtonCopiarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoReempla")) {
				jButtonVerFormProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoReempla")) {
				jButtonGuardarCambiosProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoReempla")) {
				jButtonGuardarCambiosProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoReempla")) {
				jButtonGuardarCambiosProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoReempla")) {
				jButtonRecargarInformacionProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoReempla")) {
				jButtonRecargarInformacionProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoReempla")) {
				jButtonRecargarInformacionProductoReemplaActionPerformed(evt);
			}
			else if(sTipo.equals("ArbolProductoReempla")) {
				jButtonArbolProductoReemplaActionPerformed(evt);
			} 
			else if(sTipo.equals("AnterioresProductoReempla")) {
				jButtonAnterioresProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoReempla")) {
				jButtonAnterioresProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoReempla")) {
				jButtonAnterioresProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoReempla")) {
				jButtonSiguientesProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoReempla")) {
				jButtonSiguientesProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoReempla")) {
				jButtonSiguientesProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoReempla") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoReempla")) {
				jButtonAbrirOrderByProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoReempla") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoReempla")) {
				jButtonMostrarOcultarProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoReempla")) {
				jButtonNuevoGuardarCambiosProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoReempla")) {
				jButtonNuevoGuardarCambiosProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoReempla")) {
				jButtonNuevoGuardarCambiosProductoReemplaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoReempla")) {
				jButtonCerrarReporteDinamicoProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoReempla")) {
				jButtonGenerarReporteDinamicoProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoReempla")) {
				
				jButtonGenerarExcelReporteDinamicoProductoReemplaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoReempla")) {
				jButtonCerrarImportacionProductoReemplaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoReempla")) {
				
				jButtonGenerarImportacionProductoReemplaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoReempla")) {
				
				jButtonAbrirImportacionProductoReemplaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoReempla")) {
				jComboBoxTiposAccionesProductoReemplaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoReempla")) {
				jComboBoxTiposRelacionesProductoReemplaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoReempla")) {
				jComboBoxTiposAccionesProductoReemplaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoReempla")) {
				
				jComboBoxTiposSeleccionarProductoReemplaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoReempla")) {
				jTextFieldValorCampoGeneralProductoReemplaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoReempla")) {
				jButtonAbrirOrderByProductoReemplaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoReempla")) {
				jButtonAbrirOrderByProductoReemplaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoReempla")) {
				jButtonCerrarOrderByProductoReemplaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoReemplaBusqueda")) {
				this.jButtonidProductoReemplaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoReemplaUpdate")) {
				this.jButtonid_empresaProductoReemplaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoReemplaBusqueda")) {
				this.jButtonid_empresaProductoReemplaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoReemplaUpdate")) {
				this.jButtonid_sucursalProductoReemplaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoReemplaBusqueda")) {
				this.jButtonid_sucursalProductoReemplaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoReemplaUpdate")) {
				this.jButtonid_bodegaProductoReemplaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoReemplaBusqueda")) {
				this.jButtonid_bodegaProductoReemplaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoReempla")) {
				this.jButtonid_productoProductoReemplaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoReemplaUpdate")) {
				this.jButtonid_productoProductoReemplaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoReemplaBusqueda")) {
				this.jButtonid_productoProductoReemplaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_reemplaProductoReemplaUpdate")) {
				this.jButtonid_producto_reemplaProductoReemplaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_reemplaProductoReemplaBusqueda")) {
				this.jButtonid_producto_reemplaProductoReemplaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoReemplaBusqueda")) {
				this.jButtondescripcionProductoReemplaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoProductoReempla")) {
				this.jButtonid_productoProductoReemplaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaProductoReempla")) {
				this.jButtonFK_IdBodegaProductoReemplaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoProductoReempla")) {
				this.jButtonFK_IdProductoProductoReemplaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoReemplaProductoReempla")) {
				this.jButtonFK_IdProductoReemplaProductoReemplaActionPerformed(evt);
			}
			
			;
			
			
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoReempla();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoReemplaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoreempla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
				
				


				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoReempla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoReempla.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoReempla productoreemplaLocal=null;
			
			if(!this.getEsControlTabla()) {
				productoreemplaLocal=this.productoreempla;
			} else {
				productoreemplaLocal=this.productoreemplaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoreempla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
							
				
				


				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoReempla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoReempla.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoReemplaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaAnterior =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoreemplaAnterior =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
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
			
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			
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
			
			


			
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoReemplaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoreempla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
								
						
				


				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoReempla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoReempla.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoreempla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
								
				
				


				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoReempla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoReempla.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoReemplaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaAnterior =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoreemplaAnterior =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoreempla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoReemplaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaAnterior =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoreemplaAnterior =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoReemplaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoreempla);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoreempla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
							
				
				


				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoReempla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoReempla.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoReemplaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoreemplaAnterior =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoreemplaAnterior =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
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
			
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			
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
			
			


			
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoReemplaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoreempla);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoreempla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
								
				
				


				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoReempla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoReempla.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoReemplaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaAnterior =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoreemplaAnterior =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoReemplaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoreempla);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoReemplaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoreempla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoReempla")) {
					jCheckBoxSeleccionarTodosProductoReemplaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoReempla")) {
					jCheckBoxSeleccionadosProductoReemplaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoReempla")) {
					
				}
				
				


				
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoReempla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoReempla.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productoreempla);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
												
				
				


				
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoReempla.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoReempla.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoReemplaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoreemplaAnterior =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoreemplaAnterior =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoReemplaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoreempla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
				
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
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
			
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
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
			
			


			
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoReemplaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoreempla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoReempla.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoReempla.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoreempla);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoreempla);
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
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
				
				


				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoReempla.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoReempla.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoReemplaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoreemplaAnterior =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoreemplaAnterior =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoReempla")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoReemplaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoReempla.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productoreempla =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productoreempla =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productoreempla);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoReempla")) {
				
				}
				
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoReempla")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoReempla.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoReempla")) {
			
			}
			
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoReempla();
			
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			
			if(sTipo.equals("NuevoProductoReempla")) {
				jButtonNuevoProductoReemplaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoReempla")) {
				jButtonDuplicarProductoReemplaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoReempla")) {
				jButtonCopiarProductoReemplaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoReempla")) {
				jButtonVerFormProductoReemplaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoReempla")) {
				jButtonNuevoProductoReemplaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoReempla")) {
				jButtonModificarProductoReemplaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoReempla")) {
				jButtonActualizarProductoReemplaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoReempla")) {
				jButtonEliminarProductoReemplaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoReempla")) {
				jButtonGuardarCambiosProductoReemplaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoReempla")) {
				jButtonCancelarProductoReemplaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoReempla")) {
				jButtonCerrarProductoReemplaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoReempla")) {
				jButtonGuardarCambiosProductoReemplaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoReempla")) {
				jButtonNuevoGuardarCambiosProductoReemplaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoReempla")) {
				jButtonAbrirOrderByProductoReemplaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoReempla")) {
				jButtonRecargarInformacionProductoReemplaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoReempla")) {
				jButtonAnterioresProductoReemplaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoReempla")) {
				jButtonSiguientesProductoReemplaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoReemplaBusqueda")) {
				this.jButtonidProductoReemplaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoReemplaUpdate")) {
				this.jButtonid_empresaProductoReemplaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoReemplaBusqueda")) {
				this.jButtonid_empresaProductoReemplaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoReemplaUpdate")) {
				this.jButtonid_sucursalProductoReemplaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoReemplaBusqueda")) {
				this.jButtonid_sucursalProductoReemplaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoReemplaUpdate")) {
				this.jButtonid_bodegaProductoReemplaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoReemplaBusqueda")) {
				this.jButtonid_bodegaProductoReemplaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoReempla")) {
				this.jButtonid_productoProductoReemplaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoReemplaUpdate")) {
				this.jButtonid_productoProductoReemplaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoReemplaBusqueda")) {
				this.jButtonid_productoProductoReemplaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_reemplaProductoReemplaUpdate")) {
				this.jButtonid_producto_reemplaProductoReemplaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_reemplaProductoReemplaBusqueda")) {
				this.jButtonid_producto_reemplaProductoReemplaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoReemplaBusqueda")) {
				this.jButtondescripcionProductoReemplaBusquedaActionPerformed(evt);
			}
			
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoReempla();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoReempla")) {
				closingInternalFrameProductoReempla();
				
			} else if(sTipo.equals("jButtonCancelarProductoReempla")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoReempla = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoReemplaBeanSwingJInternalFrame jInternalFrameParent=(ProductoReemplaBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoReempla.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoReemplaActionPerformed(null);
			}
			
			ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoreempla,new Object(),this.productoreemplaParameterGeneral,this.productoreemplaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoReempla(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoReempla(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoReempla(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productoreempla)) {
			if(!esControlTabla) {
				if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoReempla(this.productoreempla,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);			
				}
				
				if(this.productoreemplaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoReempla(this.productoreempla,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoreemplaReturnGeneral=productoreemplaLogic.procesarEventosProductoReemplasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoreemplaLogic.getProductoReemplas(),this.productoreempla,this.productoreemplaParameterGeneral,this.isEsNuevoProductoReempla,classes);//this.productoreemplaLogic.getProductoReempla()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoReempla(this.productoreemplaReturnGeneral,this.productoreemplaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productoreemplaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoReempla(classes,this.productoreemplaReturnGeneral,this.productoreemplaBean,false);
					}
						
					if(this.productoreemplaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoReempla(this.productoreemplaReturnGeneral.getProductoReempla());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoReempla(this.productoreemplaReturnGeneral.getProductoReempla());	
					}
						
					if(this.productoreemplaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoReempla(this.productoreemplaReturnGeneral.getProductoReempla(),classes);//this.productoreemplaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoReempla(this.productoreempla,classes);//this.productoreemplaBean);									
				}
			
				if(ProductoReemplaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoReempla(this.productoreempla,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoReempla(this.productoreempla);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productoreemplaAnterior!=null) {
						this.productoreempla=this.productoreemplaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoreemplaReturnGeneral=productoreemplaLogic.procesarEventosProductoReemplasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoreemplaLogic.getProductoReemplas(),this.productoreempla,this.productoreemplaParameterGeneral,this.isEsNuevoProductoReempla,classes);//this.productoreemplaLogic.getProductoReempla()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoreemplaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoreemplaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productoreemplaReturnGeneral.getProductoReempla(),productoreemplaLogic.getProductoReemplas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productoreemplaReturnGeneral.getProductoReempla(),this.productoreemplas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoReempla.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoReempla.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoReempla();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoReempla() throws Exception {
		
		ProductoReemplaModel productoreemplaModel=(ProductoReemplaModel)this.jTableDatosProductoReempla.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoreemplaModel.productoreemplas=this.productoreemplaLogic.getProductoReemplas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productoreemplaModel.productoreemplas=this.productoreemplas;
		}
		
		
		((ProductoReemplaModel) this.jTableDatosProductoReempla.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoReempla() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductoreemplaAnterior(),this.productoreemplaLogic.getProductoReemplas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductoreemplaAnterior(),this.productoreemplas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoReempla();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoReempla(ProductoReempla productoreempla,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoReempla.class)) {
					this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.setProductoReemplas(productoreempla.getProductoReemplas());
					this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoReempla(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
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
										
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoreempla,new Object(),generalEntityParameterGeneral,this.productoreemplaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productoreemplaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoReemplaConstantesFunciones.getClassesRelationshipsOfProductoReempla(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoReemplaConstantesFunciones.getClassesRelationshipsFromStringsOfProductoReempla(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoReempla(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoReemplaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoreempla,new Object(),generalEntityParameterGeneral,this.productoreemplaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoReempla(ProductoReemplaBean productoreemplaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoReempla.class)) {
					this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.setProductoReemplas(productoreempla.getProductoReemplas());
					this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoReempla(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoReempla(ArrayList<Classe> classes,ProductoReemplaReturnGeneral productoreemplaReturnGeneral,ProductoReemplaBean productoreemplaBean,Boolean conDefault) throws Exception {
		
			this.productoreemplaBean.setProductoReemplas(productoreemplaReturnGeneral.getProductoReempla().getProductoReemplas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoReempla(ProductoReempla productoreempla,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ProductoReempla.class)) {
					productoreempla.setProductoReemplas(this.jInternalFrameDetalleFormProductoReempla.productoreemplaBeanSwingJInternalFrame.productoreemplaLogic.getProductoReemplas());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productoreempla)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoReempla = new ProductoReemplaDetalleFormJInternalFrame(jDesktopPane,this.productoreemplaSessionBean.getConGuardarRelaciones(),this.productoreemplaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.setVisible(false);
		this.jInternalFrameDetalleFormProductoReempla.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoReempla.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoReempla.productoreemplaLogic=this.productoreemplaLogic;
		
		this.cargarCombosFrameForeignKeyProductoReempla("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoReempla();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoReempla();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoReempla("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoReempla();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoReempla.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoReempla"));
		
		this.jInternalFrameDetalleFormProductoReempla.jButtonModificarProductoReempla.addActionListener(new ButtonActionListener(this,"ModificarProductoReempla"));

		
		this.jInternalFrameDetalleFormProductoReempla.jButtonModificarToolBarProductoReempla.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoReempla"));
					
		this.jInternalFrameDetalleFormProductoReempla.jMenuItemModificarProductoReempla.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoReempla"));		
		
		
		
		this.jInternalFrameDetalleFormProductoReempla.jButtonActualizarProductoReempla.addActionListener (new ButtonActionListener(this,"ActualizarProductoReempla"));
		
		
		this.jInternalFrameDetalleFormProductoReempla.jButtonActualizarToolBarProductoReempla.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoReempla"));
						
		this.jInternalFrameDetalleFormProductoReempla.jMenuItemActualizarProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoReempla"));		
		
		
		
		this.jInternalFrameDetalleFormProductoReempla.jButtonEliminarProductoReempla.addActionListener (new ButtonActionListener(this,"EliminarProductoReempla"));
		
		
		this.jInternalFrameDetalleFormProductoReempla.jButtonEliminarToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoReempla"));
								
		this.jInternalFrameDetalleFormProductoReempla.jMenuItemEliminarProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoReempla"));		
		
		
		
		this.jInternalFrameDetalleFormProductoReempla.jButtonCancelarProductoReempla.addActionListener (new ButtonActionListener(this,"CancelarProductoReempla"));
		
		
		this.jInternalFrameDetalleFormProductoReempla.jButtonCancelarToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoReempla"));
					
		this.jInternalFrameDetalleFormProductoReempla.jMenuItemCancelarProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoReempla"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoReempla.jMenuItemDetalleCerrarProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoReempla"));		
		
		
		
		this.jInternalFrameDetalleFormProductoReempla.jButtonGuardarCambiosToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoReempla"));
		
		
		
		this.jInternalFrameDetalleFormProductoReempla.jButtonGuardarCambiosToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoReempla"));
		
		
		
		this.jInternalFrameDetalleFormProductoReempla.jComboBoxTiposAccionesFormularioProductoReempla.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoReempla"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonidProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoReemplaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_empresaProductoReemplaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoReemplaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_empresaProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoReemplaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_sucursalProductoReemplaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoReemplaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_sucursalProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoReemplaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_bodegaProductoReemplaUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoReemplaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_bodegaProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoReemplaBusqueda"));
		//jButtonid_productoProductoReempla.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoReemplaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_productoProductoReempla.addActionListener(new ButtonActionListener(this,"id_productoProductoReempla"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_productoProductoReemplaUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoReemplaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_productoProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoReemplaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_producto_reemplaProductoReemplaUpdate.addActionListener(new ButtonActionListener(this,"id_producto_reemplaProductoReemplaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_producto_reemplaProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_reemplaProductoReemplaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtondescripcionProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoReemplaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoReempla.jTabbedPaneRelacionesProductoReempla.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoReempla"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoReempla"));
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoReempla.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoReempla"));
		}
		
		this.jTableDatosProductoReempla.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoReempla"));
		
		this.jTableDatosProductoReempla.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoReempla"));
		
		this.jButtonNuevoProductoReempla.addActionListener(new ButtonActionListener(this,"NuevoProductoReempla"));
		
		this.jButtonDuplicarProductoReempla.addActionListener(new ButtonActionListener(this,"DuplicarProductoReempla"));
		
		this.jButtonCopiarProductoReempla.addActionListener(new ButtonActionListener(this,"CopiarProductoReempla"));
		
		this.jButtonVerFormProductoReempla.addActionListener(new ButtonActionListener(this,"VerFormProductoReempla"));
		
		
		this.jButtonNuevoToolBarProductoReempla.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoReempla"));
			
		this.jButtonDuplicarToolBarProductoReempla.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoReempla"));
			
		this.jMenuItemNuevoProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoReempla"));
			
		this.jMenuItemDuplicarProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoReempla"));		
		
		
		this.jButtonNuevoRelacionesProductoReempla.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoReempla"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoReempla.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoReempla"));
			
		this.jMenuItemNuevoRelacionesProductoReempla.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoReempla"));		
		
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoReempla.jButtonModificarProductoReempla.addActionListener(new ButtonActionListener(this,"ModificarProductoReempla"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoReempla.jButtonModificarToolBarProductoReempla.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoReempla"));
			
			this.jInternalFrameDetalleFormProductoReempla.jMenuItemModificarProductoReempla.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoReempla"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoReempla.jButtonActualizarProductoReempla.addActionListener (new ButtonActionListener(this,"ActualizarProductoReempla"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoReempla.jButtonActualizarToolBarProductoReempla.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoReempla"));
				
			this.jInternalFrameDetalleFormProductoReempla.jMenuItemActualizarProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoReempla"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoReempla.jButtonEliminarProductoReempla.addActionListener (new ButtonActionListener(this,"EliminarProductoReempla"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoReempla.jButtonEliminarToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoReempla"));
						
			this.jInternalFrameDetalleFormProductoReempla.jMenuItemEliminarProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoReempla"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoReempla.jButtonCancelarProductoReempla.addActionListener (new ButtonActionListener(this,"CancelarProductoReempla"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoReempla.jButtonCancelarToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoReempla"));
			
			this.jInternalFrameDetalleFormProductoReempla.jMenuItemCancelarProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoReempla"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoReempla"));		
		
		
		this.jButtonCerrarProductoReempla.addActionListener (new ButtonActionListener(this,"CerrarProductoReempla"));
		
		
		this.jButtonCerrarToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoReempla"));
			
		this.jMenuItemCerrarProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoReempla"));
			
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoReempla.jMenuItemDetalleCerrarProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoReempla"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoReempla.jButtonGuardarCambiosProductoReempla.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoReempla"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoReempla.jButtonGuardarCambiosToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoReempla"));
		}
		
		this.jButtonCopiarToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoReempla"));
			
		this.jButtonVerFormToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoReempla"));
		
		this.jMenuItemGuardarCambiosProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoReempla"));
			
		this.jMenuItemCopiarProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoReempla"));		
		
		this.jMenuItemVerFormProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoReempla"));		
		
		
		this.jButtonGuardarCambiosTablaProductoReempla.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoReempla"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoReempla"));
			
		this.jMenuItemGuardarCambiosTablaProductoReempla.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoReempla"));		
		
		
		
		this.jButtonRecargarInformacionProductoReempla.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoReempla"));
					
		this.jButtonRecargarInformacionToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoReempla"));
		
		this.jMenuItemRecargarInformacionProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoReempla"));		
		
		
		this.jButtonArbolProductoReempla.addActionListener (new ButtonActionListener(this,"ArbolProductoReempla"));
		
		this.jButtonAnterioresProductoReempla.addActionListener (new ButtonActionListener(this,"AnterioresProductoReempla"));
		
		
		this.jButtonAnterioresToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoReempla"));
		
		this.jMenuItemAnterioresProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoReempla"));		
		
		
		this.jButtonSiguientesProductoReempla.addActionListener (new ButtonActionListener(this,"SiguientesProductoReempla"));
		
		
		this.jButtonSiguientesToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoReempla"));
			
		this.jMenuItemSiguientesProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoReempla"));
			
		this.jMenuItemAbrirOrderByProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoReempla"));
			
		this.jMenuItemMostrarOcultarProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoReempla"));
			
		this.jMenuItemDetalleAbrirOrderByProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoReempla"));
			
		this.jMenuItemDetalleMostarOcultarProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoReempla"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoReempla.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoReempla"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoReempla"));
			
		this.jMenuItemNuevoGuardarCambiosProductoReempla.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoReempla"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoReempla.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoReempla"));

		this.jCheckBoxSeleccionadosProductoReempla.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoReempla"));
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoReempla.jComboBoxTiposAccionesFormularioProductoReempla.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoReempla"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoReempla.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoReempla"));
			
		this.jComboBoxTiposAccionesProductoReempla.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoReempla"));
					
		this.jComboBoxTiposSeleccionarProductoReempla.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoReempla"));
			
		this.jTextFieldValorCampoGeneralProductoReempla.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoReempla"));		
		
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonidProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoReemplaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_empresaProductoReemplaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoReemplaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_empresaProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoReemplaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_sucursalProductoReemplaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoReemplaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_sucursalProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoReemplaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_bodegaProductoReemplaUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoReemplaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_bodegaProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoReemplaBusqueda"));
		//jButtonid_productoProductoReempla.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoReemplaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_productoProductoReempla.addActionListener(new ButtonActionListener(this,"id_productoProductoReempla"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_productoProductoReemplaUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoReemplaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_productoProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoReemplaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_producto_reemplaProductoReemplaUpdate.addActionListener(new ButtonActionListener(this,"id_producto_reemplaProductoReemplaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_producto_reemplaProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_reemplaProductoReemplaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtondescripcionProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoReemplaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaProductoReempla.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProductoReempla"));

			this.jButtonFK_IdProductoProductoReempla.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoReempla"));

			this.jButtonBuscarFK_IdProductoid_productoProductoReempla.addActionListener(new ButtonActionListener(this,"id_productoProductoReempla"));

			this.jButtonFK_IdProductoReemplaProductoReempla.addActionListener(new ButtonActionListener(this,"FK_IdProductoReemplaProductoReempla"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoReempla!=null) {
				this.jInternalFrameReporteDinamicoProductoReempla.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoReempla"));
				this.jInternalFrameReporteDinamicoProductoReempla.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoReempla"));
				this.jInternalFrameReporteDinamicoProductoReempla.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoReempla"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoReempla.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoReempla"));				
			//this.jButtonGenerarReporteDinamicoProductoReempla.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoReempla"));
			//this.jButtonGenerarExcelReporteDinamicoProductoReempla.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoReempla"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoReempla!=null) {
				this.jInternalFrameImportacionProductoReempla.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoReempla"));
				this.jInternalFrameImportacionProductoReempla.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoReempla"));
				this.jInternalFrameImportacionProductoReempla.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoReempla"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoReempla.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoReempla"));
			
			this.jButtonAbrirOrderByToolBarProductoReempla.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoReempla"));			
			
			if(this.jInternalFrameOrderByProductoReempla!=null) {
				this.jInternalFrameOrderByProductoReempla.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoReempla"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoReempla!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoReempla.jTabbedPaneRelacionesProductoReempla.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoReempla"));
		
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
            		closingInternalFrameProductoReempla();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoReempla.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoReempla = (JInternalFrameBase)event.getSource();
	            	
	            ProductoReemplaBeanSwingJInternalFrame jInternalFrameParent=(ProductoReemplaBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoReempla.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoReemplaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoReempla.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoReemplaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoReempla.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoReempla.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoReemplaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoReemplaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoReemplaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoReempla";
		inputMap = this.jButtonNuevoProductoReempla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoReempla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoReemplaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoReemplaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoReemplaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoReemplaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoReempla";
		inputMap = this.jButtonNuevoRelacionesProductoReempla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoReempla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoReemplaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoReempla";
		inputMap = this.jButtonModificarProductoReempla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoReempla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoReemplaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoReempla";
		inputMap = this.jButtonActualizarProductoReempla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoReempla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoReemplaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoReempla";
		inputMap = this.jButtonEliminarProductoReempla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoReempla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoReemplaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoReempla";
		inputMap = this.jButtonCancelarProductoReempla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoReempla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoReemplaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoReempla";
		inputMap = this.jButtonCerrarProductoReempla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoReempla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoReemplaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoReempla.jButtonGuardarCambiosProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoReempla";
		inputMap = this.jInternalFrameDetalleFormProductoReempla.jButtonGuardarCambiosProductoReempla.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoReempla.jButtonGuardarCambiosProductoReempla.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoReemplaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonArbolProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonArbolProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoReempla.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoReemplaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoReempla.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoReemplaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoReempla.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoReemplaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoReempla.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoReemplaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonidProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"idProductoReemplaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_empresaProductoReemplaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoReemplaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_empresaProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoReemplaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_sucursalProductoReemplaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoReemplaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_sucursalProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoReemplaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_bodegaProductoReemplaUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoReemplaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_bodegaProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoReemplaBusqueda"));
		//jButtonid_productoProductoReempla.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoReemplaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_productoProductoReempla.addActionListener(new ButtonActionListener(this,"id_productoProductoReempla"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_productoProductoReemplaUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoReemplaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_productoProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoReemplaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_producto_reemplaProductoReemplaUpdate.addActionListener(new ButtonActionListener(this,"id_producto_reemplaProductoReemplaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtonid_producto_reemplaProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_reemplaProductoReemplaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoReempla.jButtondescripcionProductoReemplaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoReemplaBusqueda"));
		
		
		this.jButtonFK_IdBodegaProductoReempla.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProductoReempla"));

		this.jButtonFK_IdProductoProductoReempla.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoReempla"));

		this.jButtonBuscarFK_IdProductoid_productoProductoReempla.addActionListener(new ButtonActionListener(this,"id_productoProductoReempla"));

		this.jButtonFK_IdProductoReemplaProductoReempla.addActionListener(new ButtonActionListener(this,"FK_IdProductoReemplaProductoReempla"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoReempla.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoReemplaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoReemplaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoReempla.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoReempla(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoReempla productoreemplaAux:this.productoreemplaLogic.getProductoReemplas()) {
					productoreemplaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoReempla productoreemplaAux:productoreemplas) {
					productoreemplaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoReemplaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoReempla(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoReempla productoreemplaAux:this.productoreemplaLogic.getProductoReemplas()) {
						productoreemplaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoReempla productoreemplaAux:productoreemplas) {
						productoreemplaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoReempla productoreemplaAux:this.productoreemplaLogic.getProductoReemplas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoReempla productoreemplaAux:productoreemplas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoReempla(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoReempla.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoReempla.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoReempla,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoReemplaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoReempla(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoReempla.getSelectedRows();
			
			ProductoReempla productoreemplaLocal=new ProductoReempla();
			
			//this.seleccionarTodosProductoReempla(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoreemplaLocal =(ProductoReempla) this.productoreemplaLogic.getProductoReemplas().toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productoreemplaLocal =(ProductoReempla) this.productoreemplas.toArray()[this.jTableDatosProductoReempla.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productoreemplaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoReempla productoreemplaAux:this.productoreemplaLogic.getProductoReemplas()) {
						productoreemplaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoReempla productoreemplaAux:productoreemplas) {
						productoreemplaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoReempla(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoReempla.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoReempla.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoReempla,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoReemplaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoReemplaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoReemplaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoReempla(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoReempla.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoReempla productoreemplaAux:this.productoreemplaLogic.getProductoReemplas()) {
				
						if(sTipoSeleccionar.equals(ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoreemplaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoReempla productoreemplaAux:productoreemplas) {
					
						if(sTipoSeleccionar.equals(ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoreemplaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoReempla(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoReemplaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoReempla(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoReempla=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoReempla.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoReempla.jComboBoxTiposAccionesFormularioProductoReempla.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoReempla) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoReempla(conSplash);
				
					this.generarReporteProductoReemplasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoReempla.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoReempla.jComboBoxTiposAccionesFormularioProductoReempla.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoReemplasSeleccionados();
				//this.jComboBoxTiposAccionesProductoReempla.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoReemplasSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoReempla.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoReemplasSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoReempla.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoReempla();
				
				this.exportarProductoReemplasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoReempla.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoReempla.jComboBoxTiposAccionesFormularioProductoReempla.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoReemplas();
				//this.importarProductoReemplas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoReempla.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoReempla.jComboBoxTiposAccionesFormularioProductoReempla.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoReempla();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoReemplasSeleccionados();
				//this.jComboBoxTiposAccionesProductoReempla.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Reemplazo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoReempla();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoReempla)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoReempla(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Reemplazo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoReempla.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoReempla.jComboBoxTiposAccionesFormularioProductoReempla.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoReemplaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoReempla) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoReempla(conSplash);
					
						//this.actualizarParametrosGeneralProductoReempla();
						
						this.generarReporteProcesoAccionProductoReemplasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoReempla.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoReempla.jComboBoxTiposAccionesFormularioProductoReempla.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoReemplaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ReemplazoS SELECCIONADOS?", "MANTENIMIENTO DE Reemplazo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoReempla();
				
						this.actualizarParametrosGeneralProductoReempla();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productoreemplaReturnGeneral=productoreemplaLogic.procesarAccionProductoReemplasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productoreemplaLogic.getProductoReemplas(),this.productoreemplaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoReemplaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoReempla.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoReempla.jComboBoxTiposAccionesFormularioProductoReempla.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoReempla();
					
					ProductoReemplaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoReemplaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoReempla.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoReempla.jComboBoxTiposAccionesFormularioProductoReempla.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoReempla(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoReemplaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoReempla();
			
			if(this.jInternalFrameDetalleFormProductoReempla==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoReempla> productoreemplasSeleccionados=new ArrayList<ProductoReempla>();		
			ProductoReempla productoreempla=new ProductoReempla();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoReempla(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoReempla.getSelectedItem();
			
			
			
			
			productoreemplasSeleccionados=this.getProductoReemplasSeleccionados(true);
			//this.sTipoAccion;
			
			if(productoreemplasSeleccionados.size()==1) {
				for(ProductoReempla productoreemplaAux:productoreemplasSeleccionados) {
					productoreempla=productoreemplaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Reemplazo")) {
					jButtonProductoReemplaActionPerformed(null,rowIndex,true,false,productoreempla);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoReempla();
			
      		//this.finishProcessProductoReempla(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoReemplaReturnGeneral() throws Exception {
		if(this.productoreemplaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productoreemplaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productoreemplaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productoreemplaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productoreemplaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productoreemplaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoReempla(false);
		}
		
		if(this.productoreemplaReturnGeneral.getConRetornoLista() || this.productoreemplaReturnGeneral.getConRetornoObjeto()) {
			if(this.productoreemplaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoreemplaLogic.setProductoReemplas(this.productoreemplaReturnGeneral.getProductoReemplas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productoreemplaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoreemplaLogic.setProductoReempla(this.productoreemplaReturnGeneral.getProductoReempla());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoReempla(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoReempla() throws Exception {
		
		
	}
	
	public ArrayList<ProductoReempla> getProductoReemplasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoReempla> productoreemplasSeleccionados=new ArrayList<ProductoReempla>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoReempla) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoReempla productoreemplaAux:productoreemplaLogic.getProductoReemplas()) {
					if(productoreemplaAux.getIsSelected()) {
						productoreemplasSeleccionados.add(productoreemplaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoReempla productoreemplaAux:this.productoreemplas) {
					if(productoreemplaAux.getIsSelected()) {
						productoreemplasSeleccionados.add(productoreemplaAux);				
					}
				}
			}
			
			if(productoreemplasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productoreemplasSeleccionados.addAll(this.productoreemplaLogic.getProductoReemplas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productoreemplasSeleccionados.addAll(this.productoreemplas);				
					}
				}
			}
		} else {
			productoreemplasSeleccionados.add(this.productoreempla);
		}
		
		return productoreemplasSeleccionados;
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
	
	public void generarReporteProductoReemplasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoReemplasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoReemplasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoReemplasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoReemplasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesProductoReemplasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Reemplazo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoReemplasSeleccionados() throws Exception {
		ArrayList<ProductoReempla> productoreemplasSeleccionados=new ArrayList<ProductoReempla>();		
		
		productoreemplasSeleccionados=this.getProductoReemplasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoReemplas("Todos",productoreemplasSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoReemplasSeleccionados() throws Exception {
		ArrayList<ProductoReempla> productoreemplasSeleccionados=new ArrayList<ProductoReempla>();		
		
		productoreemplasSeleccionados=this.getProductoReemplasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoReemplas("Todos",productoreemplasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoReemplasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoReempla> productoreemplasSeleccionados=new ArrayList<ProductoReempla>();
		
		productoreemplasSeleccionados=this.getProductoReemplasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoReemplas("Todos",productoreemplasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoReemplasSeleccionados() throws Exception {
		ArrayList<ProductoReempla> productoreemplasSeleccionados=new ArrayList<ProductoReempla>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoReempla();
		
		
		productoreemplasSeleccionados=this.getProductoReemplasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoReempla();
		
		
		//this.generarReporteProductoReemplas("Todos",productoreemplasSeleccionados ,productoreemplaImplementable,productoreemplaImplementableHome);
	}
	
	public void mostrarImportacionProductoReemplas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoReempla();
		
		this.abrirFrameImportacionProductoReempla();		
		
			
		//this.generarReporteProductoReemplas("Todos",productoreemplasSeleccionados ,productoreemplaImplementable,productoreemplaImplementableHome);
	}
	
	public void importarProductoReemplas() throws Exception {		
	
	}
	
	public void exportarProductoReemplasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoReemplasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoReemplasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoReemplasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Reemplazo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoReemplasSeleccionados() throws Exception {
		ArrayList<ProductoReempla> productoreemplasSeleccionados=new ArrayList<ProductoReempla>();		
		
		productoreemplasSeleccionados=this.getProductoReemplasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoreempla."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoReempla(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoReempla productoreemplaAux:productoreemplasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoReempla(productoreemplaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productoreemplaAux.setsDetalleGeneralEntityReporte(productoreemplaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoreemplaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reemplazo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoReempla(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoReemplaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoReemplaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoReemplaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoReemplaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoReemplaConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoReempla(ProductoReempla productoreempla,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productoreempla.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productoreempla.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoreempla.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoreempla.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoreempla.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoreempla.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoreempla.getproductoreempla_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoreempla.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoReemplasSeleccionados() throws Exception {
		ArrayList<ProductoReempla> productoreemplasSeleccionados=new ArrayList<ProductoReempla>();		
		
		productoreemplasSeleccionados=this.getProductoReemplasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoreempla.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoReemplas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoReempla(row);				
				iRow++;
			}				
			
			for(ProductoReempla productoreemplaAux:productoreemplasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoReempla(productoreemplaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoreemplaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reemplazo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoReemplasSeleccionados() throws Exception {
		ArrayList<ProductoReempla> productoreemplasSeleccionados=new ArrayList<ProductoReempla>();		
		
		productoreemplasSeleccionados=this.getProductoReemplasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoreempla.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productoreemplas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productoreempla");
			//elementRoot.appendChild(element);
		
			for(ProductoReempla productoreemplaAux:productoreemplasSeleccionados) {
				element = document.createElement("productoreempla");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoReempla(productoreemplaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoreemplaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Reemplazo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoReempla(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoReempla(ProductoReempla productoreempla,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productoreempla.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productoreempla.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoreempla.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoreempla.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoreempla.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoreempla.getproductoreempla_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoreempla.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlProductoReempla(ProductoReempla productoreempla,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoReemplaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productoreempla.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoReemplaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productoreempla.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProductoReemplaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productoreempla.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProductoReemplaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(productoreempla.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(ProductoReemplaConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(productoreempla.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ProductoReemplaConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(productoreempla.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementproductoreempla_descripcion = document.createElement(ProductoReemplaConstantesFunciones.IDPRODUCTOREEMPLA);
		elementproductoreempla_descripcion.appendChild(document.createTextNode(productoreempla.getproductoreempla_descripcion()));
		element.appendChild(elementproductoreempla_descripcion);

		Element elementdescripcion = document.createElement(ProductoReemplaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(productoreempla.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoProductoReemplasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoReempla> productoreemplasSeleccionados=new ArrayList<ProductoReempla>();
		
		productoreemplasSeleccionados=this.getProductoReemplasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoReempla(productoreemplasSeleccionados);
		
		this.generarReporteProductoReemplas("Todos",productoreemplasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoReempla(ArrayList<ProductoReempla> productoreemplasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoReempla productoreemplaAux:productoreemplasSeleccionados) {
				productoreemplaAux.setsDetalleGeneralEntityReporte(productoreemplaAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoReemplaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productoreemplaAux.setsDescripcionGeneralEntityReporte1(productoreemplaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoReemplaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					productoreemplaAux.setsDescripcionGeneralEntityReporte1(productoreemplaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoReemplaConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					productoreemplaAux.setsDescripcionGeneralEntityReporte1(productoreemplaAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					productoreemplaAux.setsDescripcionGeneralEntityReporte1(productoreemplaAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoReemplaConstantesFunciones.LABEL_IDPRODUCTOREEMPLA)) {
					existe=true;
					productoreemplaAux.setsDescripcionGeneralEntityReporte1(productoreemplaAux.getproductoreempla_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoReemplaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					productoreemplaAux.setsDescripcionGeneralEntityReporte1(productoreemplaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoReemplaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoReempla(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoReempla=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoReempla=true;
				this.isVisibilidadCeldaGuardarCambiosProductoReempla=true;
			}
			
			this.isVisibilidadCeldaModificarProductoReempla=false;
			this.isVisibilidadCeldaActualizarProductoReempla=false;
			this.isVisibilidadCeldaEliminarProductoReempla=false;
			this.isVisibilidadCeldaCancelarProductoReempla=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoReempla=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoReempla=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoReempla=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoReempla=false;
			this.isVisibilidadCeldaGuardarCambiosProductoReempla=false;
			this.isVisibilidadCeldaModificarProductoReempla=false;
			this.isVisibilidadCeldaActualizarProductoReempla=true;
			this.isVisibilidadCeldaEliminarProductoReempla=false;
			this.isVisibilidadCeldaCancelarProductoReempla=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoReempla=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoReempla=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoReempla=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoReempla=false;
			this.isVisibilidadCeldaGuardarCambiosProductoReempla=false;
			this.isVisibilidadCeldaModificarProductoReempla=false;
			this.isVisibilidadCeldaActualizarProductoReempla=true;
			this.isVisibilidadCeldaEliminarProductoReempla=true;
			this.isVisibilidadCeldaCancelarProductoReempla=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoReempla=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoReempla=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoReempla=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoReempla=false;
			this.isVisibilidadCeldaGuardarCambiosProductoReempla=false;
			this.isVisibilidadCeldaModificarProductoReempla=false;
			this.isVisibilidadCeldaActualizarProductoReempla=true;
			this.isVisibilidadCeldaEliminarProductoReempla=false;
			this.isVisibilidadCeldaCancelarProductoReempla=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoReempla=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoReempla=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoReempla=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoReempla=true;
			this.isVisibilidadCeldaGuardarCambiosProductoReempla=true;
			this.isVisibilidadCeldaModificarProductoReempla=false;
			this.isVisibilidadCeldaActualizarProductoReempla=false;
			this.isVisibilidadCeldaEliminarProductoReempla=false;
			this.isVisibilidadCeldaCancelarProductoReempla=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoReempla=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoReempla=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoReempla=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoReempla=false;
			this.isVisibilidadCeldaGuardarCambiosProductoReempla=false;
			this.isVisibilidadCeldaActualizarProductoReempla=false;
			this.isVisibilidadCeldaEliminarProductoReempla=false;
			this.isVisibilidadCeldaCancelarProductoReempla=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoReempla=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoReempla=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoReempla=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoReempla=false;
			this.isVisibilidadCeldaGuardarCambiosProductoReempla=false;
			this.isVisibilidadCeldaModificarProductoReempla=true;
			this.isVisibilidadCeldaActualizarProductoReempla=false;
			this.isVisibilidadCeldaEliminarProductoReempla=false;
			this.isVisibilidadCeldaCancelarProductoReempla=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoReempla=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoReempla=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoReemplaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoReempla=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoReempla=true;
			this.isVisibilidadCeldaGuardarCambiosProductoReempla=true;
		} else {
			this.actualizarEstadoPanelsProductoReempla(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoReempla=false;
			//this.isVisibilidadCeldaVerFormProductoReempla=false;
			this.isVisibilidadCeldaDuplicarProductoReempla=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productoreemplaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoReempla=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoReempla=false;
			this.isVisibilidadCeldaGuardarCambiosProductoReempla=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productoreemplaSessionBean.getEsGuardarRelacionado()) {
			if(!productoreemplaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoReempla=false;												
			}
			
			this.jButtonCerrarProductoReempla.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoReempla=false;
		}
		
		if(!this.permiteMantenimiento(this.productoreempla)) {
			this.isVisibilidadCeldaActualizarProductoReempla=false;
			this.isVisibilidadCeldaEliminarProductoReempla=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoReempla() {
		this.isVisibilidadCeldaNuevoProductoReempla=false;
		this.isVisibilidadCeldaGuardarCambiosProductoReempla=false;
	}
	
	public void actualizarEstadoPanelsProductoReempla(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoReempla!=null) {
				this.jScrollPanelDatosEdicionProductoReempla.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoReempla!=null) {
				this.jTabbedPaneBusquedasProductoReempla.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoReempla!=null) {
				this.jScrollPanelDatosProductoReempla.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoReempla!=null) {
				this.jPanelPaginacionProductoReempla.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoReempla!=null) {
				this.jPanelParametrosReportesProductoReempla.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoReempla!=null) {
				this.jScrollPanelDatosEdicionProductoReempla.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoReempla!=null) {
				this.jTabbedPaneBusquedasProductoReempla.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoReempla!=null) {
				this.jScrollPanelDatosProductoReempla.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoReempla!=null) {
				this.jPanelPaginacionProductoReempla.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoReempla!=null) {
				this.jPanelParametrosReportesProductoReempla.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoReempla!=null) {
				this.jScrollPanelDatosEdicionProductoReempla.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoReempla!=null) {
				this.jTabbedPaneBusquedasProductoReempla.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoReempla!=null) {
				this.jScrollPanelDatosProductoReempla.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoReempla!=null) {
				this.jPanelPaginacionProductoReempla.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoReempla!=null) {
				this.jPanelParametrosReportesProductoReempla.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoReempla!=null) {
				this.jScrollPanelDatosEdicionProductoReempla.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoReempla!=null) {
				this.jTabbedPaneBusquedasProductoReempla.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoReempla!=null) {
				this.jScrollPanelDatosProductoReempla.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoReempla!=null) {
				this.jPanelPaginacionProductoReempla.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoReempla!=null) {
				this.jPanelParametrosReportesProductoReempla.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoReempla!=null) {
				this.jScrollPanelDatosEdicionProductoReempla.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoReempla!=null) {
				this.jTabbedPaneBusquedasProductoReempla.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoReempla!=null) {
				this.jScrollPanelDatosProductoReempla.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoReempla!=null) {
				this.jPanelPaginacionProductoReempla.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoReempla!=null) {
				this.jPanelParametrosReportesProductoReempla.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoReempla!=null) {
				this.jScrollPanelDatosEdicionProductoReempla.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoReempla!=null) {
				this.jTabbedPaneBusquedasProductoReempla.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoReempla!=null) {
				this.jScrollPanelDatosProductoReempla.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoReempla!=null) {
				this.jPanelPaginacionProductoReempla.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoReempla!=null) {
				this.jPanelParametrosReportesProductoReempla.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoReempla!=null) {
				this.jScrollPanelDatosEdicionProductoReempla.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoReempla!=null) {
				this.jTabbedPaneBusquedasProductoReempla.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoReempla!=null) {
				this.jScrollPanelDatosProductoReempla.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoReempla!=null) {
				this.jPanelPaginacionProductoReempla.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoReempla!=null) {
				this.jPanelParametrosReportesProductoReempla.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoReempla!=null) {
					this.jTabbedPaneBusquedasProductoReempla.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoReempla!=null) {
				this.jPanelParametrosReportesProductoReempla.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productoreemplaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoReempla!=null) {
				this.jTabbedPaneBusquedasProductoReempla.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoReempla!=null) {
				this.jPanelParametrosReportesProductoReempla.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoReempla.remove(jPanelFK_IdBodegaProductoReempla);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoReempla.remove(jPanelFK_IdProductoProductoReempla);}

			this.isVisibilidadFK_IdProductoReempla=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProductoReempla) {this.jTabbedPaneBusquedasProductoReempla.remove(jPanelFK_IdProductoReemplaProductoReempla);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoReempla.remove(jPanelFK_IdBodegaProductoReempla);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoReempla.remove(jPanelFK_IdProductoProductoReempla);}

			this.isVisibilidadFK_IdProductoReempla=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProductoReempla) {this.jTabbedPaneBusquedasProductoReempla.remove(jPanelFK_IdProductoReemplaProductoReempla);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoReempla.remove(jPanelFK_IdBodegaProductoReempla);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoReempla.remove(jPanelFK_IdProductoProductoReempla);}

			this.isVisibilidadFK_IdProductoReempla=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProductoReempla) {this.jTabbedPaneBusquedasProductoReempla.remove(jPanelFK_IdProductoReemplaProductoReempla);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoReempla.remove(jPanelFK_IdBodegaProductoReempla);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoReempla.remove(jPanelFK_IdProductoProductoReempla);}

			this.isVisibilidadFK_IdProductoReempla=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdProductoReempla) {this.jTabbedPaneBusquedasProductoReempla.remove(jPanelFK_IdProductoReemplaProductoReempla);}
		}
		
	}

	public void setVisibilidadBusquedasParaProductoReempla(Boolean isParaProductoReempla){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoReemplaNegation=!isParaProductoReempla;

			this.isVisibilidadFK_IdBodega=isParaProductoReemplaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoReempla.remove(jPanelFK_IdBodegaProductoReempla);}

			this.isVisibilidadFK_IdProducto=isParaProductoReemplaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoReempla.remove(jPanelFK_IdProductoProductoReempla);}

			this.isVisibilidadFK_IdProductoReempla=isParaProductoReempla;
			if(!this.isVisibilidadFK_IdProductoReempla) {this.jTabbedPaneBusquedasProductoReempla.remove(jPanelFK_IdProductoReemplaProductoReempla);}
		}
		
	}
	
	

	public String registrarSesionProductoReemplaParaProductoReemplas() throws Exception {
		Boolean isPaginaPopupProductoReempla=false;

		try {

			if(this.productoreemplaSessionBean==null) {
				this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
			}

			if(this.jInternalFrameDetalleFormProductoReempla.productoreemplaSessionBean==null) {
				this.jInternalFrameDetalleFormProductoReempla.productoreemplaSessionBean=new ProductoReemplaSessionBean();
			}

			this.jInternalFrameDetalleFormProductoReempla.productoreemplaSessionBean.setsPathNavegacionActual(productoreemplaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoReemplaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProductoReempla.productoreemplaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProductoReempla=this.jInternalFrameDetalleFormProductoReempla.productoreemplaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProductoReempla.productoreemplaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProductoReempla(true);
			this.jInternalFrameDetalleFormProductoReempla.productoreemplaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProductoReempla(ProductoReemplaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProductoReempla.productoreemplaSessionBean.setisBusquedaDesdeForeignKeySesionProductoReempla(true);
			this.jInternalFrameDetalleFormProductoReempla.productoreemplaSessionBean.setlidProductoReemplaActual(this.idProductoReemplaActual);

			productoreemplaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoReempla(true);
			productoreemplaSessionBean.setlIdProductoReemplaActualForeignKey(this.idProductoReemplaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionProductoReemplaParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(productoreemplaSessionBean==null) {
				productoreemplaSessionBean=new ProductoReemplaSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(productoreemplaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.productoreemplaFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ProductoReemplaConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionProductoReempla(true);
			//productoSessionBean.setlidProductoReemplaActual(this.idProductoReemplaActual);

			productoreemplaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoReempla(true);
			productoreemplaSessionBean.setlIdProductoReemplaActualForeignKey(this.idProductoReemplaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoReemplaSessionBean productoreemplaSessionBean=new ProductoReemplaSessionBean();
		
		if(this.productoreemplaSessionBean==null) {
			this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
		}
		
		this.productoreemplaSessionBean.setsUltimaBusquedaProductoReempla(this.getsAccionBusqueda());
		this.productoreemplaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productoreemplaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			productoreemplaSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			productoreemplaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			productoreemplaSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProductoReempla")) {
			productoreemplaSessionBean.setid_producto_reempla(this.getid_producto_reemplaFK_IdProductoReempla());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			productoreemplaSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoReemplaSessionBean productoreemplaSessionBean=new ProductoReemplaSessionBean();
		
		if(this.productoreemplaSessionBean==null) {
			this.productoreemplaSessionBean=new ProductoReemplaSessionBean();
		}
		
		if(this.productoreemplaSessionBean.getsUltimaBusquedaProductoReempla()!=null&&!this.productoreemplaSessionBean.getsUltimaBusquedaProductoReempla().equals("")) {
			this.setsAccionBusqueda(productoreemplaSessionBean.getsUltimaBusquedaProductoReempla());
			this.setiNumeroPaginacion(productoreemplaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productoreemplaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(productoreemplaSessionBean.getid_bodega());
				productoreemplaSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(productoreemplaSessionBean.getid_empresa());
				productoreemplaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(productoreemplaSessionBean.getid_producto());
				productoreemplaSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProductoReempla")) {
				this.setid_producto_reemplaFK_IdProductoReempla(productoreemplaSessionBean.getid_producto_reempla());
				productoreemplaSessionBean.setid_producto_reempla(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(productoreemplaSessionBean.getid_sucursal());
				productoreemplaSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.productoreemplaSessionBean.setsUltimaBusquedaProductoReempla("");
		this.productoreemplaSessionBean.setiNumeroPaginacion(ProductoReemplaConstantesFunciones.INUMEROPAGINACION);
		this.productoreemplaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoReempla(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoReempla() {
		this.updateBorderResaltarBusquedasFormularioProductoReempla();
		this.updateVisibilidadBusquedasFormularioProductoReempla();
		this.updateHabilitarBusquedasFormularioProductoReempla();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoReempla() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoReempla.getComponents().length>0) {
	

		if(this.productoreemplaConstantesFunciones.resaltarFK_IdBodegaProductoReempla!=null) {
			index= this.jTabbedPaneBusquedasProductoReempla.indexOfComponent(this.jPanelFK_IdBodegaProductoReempla);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoReempla.getComponent(index);
				jPanel.setBorder(this.productoreemplaConstantesFunciones.resaltarFK_IdBodegaProductoReempla);
			}
		}

		if(this.productoreemplaConstantesFunciones.resaltarFK_IdProductoProductoReempla!=null) {
			index= this.jTabbedPaneBusquedasProductoReempla.indexOfComponent(this.jPanelFK_IdProductoProductoReempla);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoReempla.getComponent(index);
				jPanel.setBorder(this.productoreemplaConstantesFunciones.resaltarFK_IdProductoProductoReempla);
			}
		}

		if(this.productoreemplaConstantesFunciones.resaltarFK_IdProductoReemplaProductoReempla!=null) {
			index= this.jTabbedPaneBusquedasProductoReempla.indexOfComponent(this.jPanelFK_IdProductoReemplaProductoReempla);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoReempla.getComponent(index);
				jPanel.setBorder(this.productoreemplaConstantesFunciones.resaltarFK_IdProductoReemplaProductoReempla);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoReempla() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoReempla.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoReempla.indexOfComponent(this.jPanelFK_IdBodegaProductoReempla);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoReempla.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoreemplaConstantesFunciones.mostrarFK_IdBodegaProductoReempla);
			if(!this.productoreemplaConstantesFunciones.mostrarFK_IdBodegaProductoReempla && index>-1) {
				this.jTabbedPaneBusquedasProductoReempla.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoReempla.indexOfComponent(this.jPanelFK_IdProductoProductoReempla);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoReempla.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoreemplaConstantesFunciones.mostrarFK_IdProductoProductoReempla);
			if(!this.productoreemplaConstantesFunciones.mostrarFK_IdProductoProductoReempla && index>-1) {
				this.jTabbedPaneBusquedasProductoReempla.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoReempla.indexOfComponent(this.jPanelFK_IdProductoReemplaProductoReempla);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoReempla.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoreemplaConstantesFunciones.mostrarFK_IdProductoReemplaProductoReempla);
			if(!this.productoreemplaConstantesFunciones.mostrarFK_IdProductoReemplaProductoReempla && index>-1) {
				this.jTabbedPaneBusquedasProductoReempla.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoReempla() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoReempla.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoReempla.indexOfComponent(this.jPanelFK_IdBodegaProductoReempla);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoReempla.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoreemplaConstantesFunciones.activarFK_IdBodegaProductoReempla);
				this.jTabbedPaneBusquedasProductoReempla.setEnabledAt(index,this.productoreemplaConstantesFunciones.activarFK_IdBodegaProductoReempla);
			}

			index= this.jTabbedPaneBusquedasProductoReempla.indexOfComponent(this.jPanelFK_IdProductoProductoReempla);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoReempla.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoreemplaConstantesFunciones.activarFK_IdProductoProductoReempla);
				this.jTabbedPaneBusquedasProductoReempla.setEnabledAt(index,this.productoreemplaConstantesFunciones.activarFK_IdProductoProductoReempla);
			}

			index= this.jTabbedPaneBusquedasProductoReempla.indexOfComponent(this.jPanelFK_IdProductoReemplaProductoReempla);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoReempla.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoreemplaConstantesFunciones.activarFK_IdProductoReemplaProductoReempla);
				this.jTabbedPaneBusquedasProductoReempla.setEnabledAt(index,this.productoreemplaConstantesFunciones.activarFK_IdProductoReemplaProductoReempla);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoReempla(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasProductoReempla.indexOfComponent(this.jPanelFK_IdBodegaProductoReempla);

			this.jTabbedPaneBusquedasProductoReempla.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoReempla.getComponent(index);

			this.productoreemplaConstantesFunciones.setResaltarFK_IdBodegaProductoReempla(resaltar);

			jPanel.setBorder(this.productoreemplaConstantesFunciones.resaltarFK_IdBodegaProductoReempla);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasProductoReempla.indexOfComponent(this.jPanelFK_IdProductoProductoReempla);

			this.jTabbedPaneBusquedasProductoReempla.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoReempla.getComponent(index);

			this.productoreemplaConstantesFunciones.setResaltarFK_IdProductoProductoReempla(resaltar);

			jPanel.setBorder(this.productoreemplaConstantesFunciones.resaltarFK_IdProductoProductoReempla);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProductoReempla")) {
			index= this.jTabbedPaneBusquedasProductoReempla.indexOfComponent(this.jPanelFK_IdProductoReemplaProductoReempla);

			this.jTabbedPaneBusquedasProductoReempla.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoReempla.getComponent(index);

			this.productoreemplaConstantesFunciones.setResaltarFK_IdProductoReemplaProductoReempla(resaltar);

			jPanel.setBorder(this.productoreemplaConstantesFunciones.resaltarFK_IdProductoReemplaProductoReempla);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoReempla.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoReempla() throws Exception {

		if(this.jInternalFrameDetalleFormProductoReempla==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoReempla();
		this.updateVisibilidadResaltarControlesFormularioProductoReempla();
		this.updateHabilitarResaltarControlesFormularioProductoReempla();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoReempla() throws Exception {
		if(this.jInternalFrameDetalleFormProductoReempla==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productoreemplaConstantesFunciones.resaltaridProductoReempla!=null && this.jInternalFrameDetalleFormProductoReempla!=null) {this.jInternalFrameDetalleFormProductoReempla.jLabelidProductoReempla.setBorder(this.productoreemplaConstantesFunciones.resaltaridProductoReempla);}
		if(this.productoreemplaConstantesFunciones.resaltarid_empresaProductoReempla!=null && this.jInternalFrameDetalleFormProductoReempla!=null) {this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_empresaProductoReempla.setBorder(this.productoreemplaConstantesFunciones.resaltarid_empresaProductoReempla);}
		if(this.productoreemplaConstantesFunciones.resaltarid_sucursalProductoReempla!=null && this.jInternalFrameDetalleFormProductoReempla!=null) {this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_sucursalProductoReempla.setBorder(this.productoreemplaConstantesFunciones.resaltarid_sucursalProductoReempla);}
		if(this.productoreemplaConstantesFunciones.resaltarid_bodegaProductoReempla!=null && this.jInternalFrameDetalleFormProductoReempla!=null) {this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_bodegaProductoReempla.setBorder(this.productoreemplaConstantesFunciones.resaltarid_bodegaProductoReempla);}
		if(this.productoreemplaConstantesFunciones.resaltarid_productoProductoReempla!=null && this.jInternalFrameDetalleFormProductoReempla!=null) {this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_productoProductoReempla.setBorder(this.productoreemplaConstantesFunciones.resaltarid_productoProductoReempla);}
		if(this.productoreemplaConstantesFunciones.resaltarid_producto_reemplaProductoReempla!=null && this.jInternalFrameDetalleFormProductoReempla!=null) {this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_producto_reemplaProductoReempla.setBorder(this.productoreemplaConstantesFunciones.resaltarid_producto_reemplaProductoReempla);}
		if(this.productoreemplaConstantesFunciones.resaltardescripcionProductoReempla!=null && this.jInternalFrameDetalleFormProductoReempla!=null) {this.jInternalFrameDetalleFormProductoReempla.jTextAreadescripcionProductoReempla.setBorder(this.productoreemplaConstantesFunciones.resaltardescripcionProductoReempla);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoReempla() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoReempla==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) {
	
		//this.jInternalFrameDetalleFormProductoReempla.jLabelidProductoReempla.setVisible(this.productoreemplaConstantesFunciones.mostraridProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jPanelidProductoReempla.setVisible(this.productoreemplaConstantesFunciones.mostraridProductoReempla);
		//this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_empresaProductoReempla.setVisible(this.productoreemplaConstantesFunciones.mostrarid_empresaProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jPanelid_empresaProductoReempla.setVisible(this.productoreemplaConstantesFunciones.mostrarid_empresaProductoReempla);
		//this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_sucursalProductoReempla.setVisible(this.productoreemplaConstantesFunciones.mostrarid_sucursalProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jPanelid_sucursalProductoReempla.setVisible(this.productoreemplaConstantesFunciones.mostrarid_sucursalProductoReempla);
		//this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_bodegaProductoReempla.setVisible(this.productoreemplaConstantesFunciones.mostrarid_bodegaProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jPanelid_bodegaProductoReempla.setVisible(this.productoreemplaConstantesFunciones.mostrarid_bodegaProductoReempla);
		//this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_productoProductoReempla.setVisible(this.productoreemplaConstantesFunciones.mostrarid_productoProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jPanelid_productoProductoReempla.setVisible(this.productoreemplaConstantesFunciones.mostrarid_productoProductoReempla);
			this.jInternalFrameDetalleFormProductoReempla.jButtonid_productoProductoReempla.setVisible(this.productoreemplaConstantesFunciones.mostrarid_productoProductoReempla);
		//this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_producto_reemplaProductoReempla.setVisible(this.productoreemplaConstantesFunciones.mostrarid_producto_reemplaProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jPanelid_producto_reemplaProductoReempla.setVisible(this.productoreemplaConstantesFunciones.mostrarid_producto_reemplaProductoReempla);
		//this.jInternalFrameDetalleFormProductoReempla.jTextAreadescripcionProductoReempla.setVisible(this.productoreemplaConstantesFunciones.mostrardescripcionProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jPaneldescripcionProductoReempla.setVisible(this.productoreemplaConstantesFunciones.mostrardescripcionProductoReempla);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoReempla() throws Exception {
		if(this.jInternalFrameDetalleFormProductoReempla==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoReempla!=null) {
	
		this.jInternalFrameDetalleFormProductoReempla.jLabelidProductoReempla.setEnabled(this.productoreemplaConstantesFunciones.activaridProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_empresaProductoReempla.setEnabled(this.productoreemplaConstantesFunciones.activarid_empresaProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_sucursalProductoReempla.setEnabled(this.productoreemplaConstantesFunciones.activarid_sucursalProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_bodegaProductoReempla.setEnabled(this.productoreemplaConstantesFunciones.activarid_bodegaProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_productoProductoReempla.setEnabled(this.productoreemplaConstantesFunciones.activarid_productoProductoReempla);
			this.jInternalFrameDetalleFormProductoReempla.jButtonid_productoProductoReempla.setEnabled(this.productoreemplaConstantesFunciones.activarid_productoProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jComboBoxid_producto_reemplaProductoReempla.setEnabled(this.productoreemplaConstantesFunciones.activarid_producto_reemplaProductoReempla);
		this.jInternalFrameDetalleFormProductoReempla.jTextAreadescripcionProductoReempla.setEnabled(this.productoreemplaConstantesFunciones.activardescripcionProductoReempla);
		}
	}
	
		
}