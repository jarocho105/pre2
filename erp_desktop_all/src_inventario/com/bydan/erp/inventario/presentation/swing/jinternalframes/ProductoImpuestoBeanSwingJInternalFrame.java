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

import com.bydan.erp.inventario.util.ProductoImpuestoConstantesFunciones;
import com.bydan.erp.inventario.util.ProductoImpuestoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ProductoImpuestoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ProductoImpuestoBean;
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
public class ProductoImpuestoBeanSwingJInternalFrame extends ProductoImpuestoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoImpuestoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoImpuesto> productoimpuestoValidator = new ClassValidator<ProductoImpuesto>(ProductoImpuesto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoImpuesto productoimpuesto;	
	public ProductoImpuesto productoimpuestoAux;
	public ProductoImpuesto productoimpuestoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoImpuesto productoimpuestoTotales;
	public Long idProductoImpuestoActual;
	public Long iIdNuevoProductoImpuesto=0L;
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

	public String sFinalQueryComboImpuestoInven="";

	public List<ImpuestoInven> impuestoinvensForeignKey;

	public List<ImpuestoInven> getimpuestoinvensForeignKey() {
		return impuestoinvensForeignKey;
	}

	public void setimpuestoinvensForeignKey(List<ImpuestoInven> impuestoinvensForeignKey) {
		this.impuestoinvensForeignKey = impuestoinvensForeignKey;
	}

	//OBJETO FK ACTUAL
	public ImpuestoInven impuestoinvenForeignKey;

	public ImpuestoInven getimpuestoinvenForeignKey() {
		return impuestoinvenForeignKey;
	}

	public void setimpuestoinvenForeignKey(ImpuestoInven impuestoinvenForeignKey) {
		this.impuestoinvenForeignKey = impuestoinvenForeignKey;
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
	
	public Boolean isPermisoTodoProductoImpuesto;
	public Boolean isPermisoNuevoProductoImpuesto;
	public Boolean isPermisoActualizarProductoImpuesto;
	public Boolean isPermisoActualizarOriginalProductoImpuesto;
	public Boolean isPermisoEliminarProductoImpuesto;
	public Boolean isPermisoGuardarCambiosProductoImpuesto;
	public Boolean isPermisoConsultaProductoImpuesto;
	public Boolean isPermisoBusquedaProductoImpuesto;
	public Boolean isPermisoReporteProductoImpuesto;
	public Boolean isPermisoPaginacionMedioProductoImpuesto;
	public Boolean isPermisoPaginacionAltoProductoImpuesto;
	public Boolean isPermisoPaginacionTodoProductoImpuesto;
	public Boolean isPermisoCopiarProductoImpuesto;
	public Boolean isPermisoVerFormProductoImpuesto;
	public Boolean isPermisoDuplicarProductoImpuesto;
	public Boolean isPermisoOrdenProductoImpuesto;
	
	
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
	
	public ProductoImpuestoParameterReturnGeneral productoimpuestoReturnGeneral;
	public ProductoImpuestoParameterReturnGeneral productoimpuestoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoImpuesto=false;
	public Boolean esParaAccionDesdeFormularioProductoImpuesto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoImpuestoSessionBeanAdditional productoimpuestoSessionBeanAdditional=null;
	
	public ProductoImpuestoSessionBeanAdditional getProductoImpuestoSessionBeanAdditional() {
		return this.productoimpuestoSessionBeanAdditional;
	}
	
	public void setProductoImpuestoSessionBeanAdditional(ProductoImpuestoSessionBeanAdditional productoimpuestoSessionBeanAdditional) {
		try {
			this.productoimpuestoSessionBeanAdditional=productoimpuestoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoImpuestoBeanSwingJInternalFrameAdditional productoimpuestoBeanSwingJInternalFrameAdditional=null;
	//public class ProductoImpuestoBeanSwingJInternalFrame
	
	public ProductoImpuestoBeanSwingJInternalFrameAdditional getProductoImpuestoBeanSwingJInternalFrameAdditional() {
		return this.productoimpuestoBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoImpuestoBeanSwingJInternalFrameAdditional(ProductoImpuestoBeanSwingJInternalFrameAdditional productoimpuestoBeanSwingJInternalFrameAdditional) {
		try {
			this.productoimpuestoBeanSwingJInternalFrameAdditional=productoimpuestoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoImpuestoLogic productoimpuestoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoImpuesto productoimpuestoBean;
	public ProductoImpuestoConstantesFunciones productoimpuestoConstantesFunciones;
	//public ProductoImpuestoParameterReturnGeneral productoimpuestoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public ImpuestoInvenLogic impuestoinvenLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoImpuesto> productoimpuestos;	
	//public List<ProductoImpuesto> productoimpuestosEliminados;
	//public List<ProductoImpuesto> productoimpuestosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoImpuesto=false;
	public Boolean isVisibilidadCeldaDuplicarProductoImpuesto=true;
	public Boolean isVisibilidadCeldaCopiarProductoImpuesto=true;
	public Boolean isVisibilidadCeldaVerFormProductoImpuesto=true;
	public Boolean isVisibilidadCeldaOrdenProductoImpuesto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoImpuesto=false;
	public Boolean isVisibilidadCeldaModificarProductoImpuesto=false;
	public Boolean isVisibilidadCeldaActualizarProductoImpuesto=false;
	public Boolean isVisibilidadCeldaEliminarProductoImpuesto=false;
	public Boolean isVisibilidadCeldaCancelarProductoImpuesto=false;
	public Boolean isVisibilidadCeldaGuardarProductoImpuesto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoImpuesto=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdImpuestoInven=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProductoImpuesto() {
		return this.iIdNuevoProductoImpuesto;
	}

	public void setiIdNuevoProductoImpuesto(Long iIdNuevoProductoImpuesto) {
		this.iIdNuevoProductoImpuesto = iIdNuevoProductoImpuesto;
	}
	
	public Long getidProductoImpuestoActual() {
		return this.idProductoImpuestoActual;
	}

	public void setidProductoImpuestoActual(Long idProductoImpuestoActual) {
		this.idProductoImpuestoActual = idProductoImpuestoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoImpuesto getproductoimpuesto() {
		return this.productoimpuesto;
	}

	public void setproductoimpuesto(ProductoImpuesto productoimpuesto) {
		this.productoimpuesto = productoimpuesto;
	}
	
	public ProductoImpuesto getproductoimpuestoAux() {
		return this.productoimpuestoAux;
	}

	public void setproductoimpuestoAux(ProductoImpuesto productoimpuestoAux) {
		this.productoimpuestoAux = productoimpuestoAux;
	}				
	
	public ProductoImpuesto getproductoimpuestoAnterior() {
		return this.productoimpuestoAnterior;
	}

	public void setproductoimpuestoAnterior(ProductoImpuesto productoimpuestoAnterior) {
		this.productoimpuestoAnterior = productoimpuestoAnterior;
	}	
	
	public ProductoImpuesto getproductoimpuestoTotales() {
		return this.productoimpuestoTotales;
	}

	public void setproductoimpuestoTotales(ProductoImpuesto productoimpuestoTotales) {
		this.productoimpuestoTotales = productoimpuestoTotales;
	}	
	
	public ProductoImpuesto getproductoimpuestoBean() {
		return this.productoimpuestoBean;
	}

	public void setproductoimpuestoBean(ProductoImpuesto productoimpuestoBean) {
		this.productoimpuestoBean = productoimpuestoBean;
	}	
	
	public ProductoImpuestoParameterReturnGeneral getproductoimpuestoReturnGeneral() {
		return this.productoimpuestoReturnGeneral;
	}

	public void setproductoimpuestoReturnGeneral(ProductoImpuestoParameterReturnGeneral productoimpuestoReturnGeneral) {
		this.productoimpuestoReturnGeneral = productoimpuestoReturnGeneral;
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

	public Long id_impuesto_invenFK_IdImpuestoInven=-1L;

	public Long getid_impuesto_invenFK_IdImpuestoInven() {
		return this.id_impuesto_invenFK_IdImpuestoInven;
	}

	public void setid_impuesto_invenFK_IdImpuestoInven(Long id_impuesto_invenFK_IdImpuestoInven) {
		this.id_impuesto_invenFK_IdImpuestoInven = id_impuesto_invenFK_IdImpuestoInven;
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
	
	
	public ProductoImpuestoLogic getProductoImpuestoLogic()	{		
		return productoimpuestoLogic;
	}

	public void setProductoImpuestoLogic(ProductoImpuestoLogic productoimpuestoLogic) {
		this.productoimpuestoLogic = productoimpuestoLogic;
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
	
	public Boolean getIsEsNuevoProductoImpuesto() {
		return isEsNuevoProductoImpuesto;
	}

	public void setIsEsNuevoProductoImpuesto(Boolean isEsNuevoProductoImpuesto) {
		this.isEsNuevoProductoImpuesto = isEsNuevoProductoImpuesto;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoImpuesto() {
		return esParaAccionDesdeFormularioProductoImpuesto;
	}
	
	public void setEsParaAccionDesdeFormularioProductoImpuesto(Boolean esParaAccionDesdeFormularioProductoImpuesto) {
		this.esParaAccionDesdeFormularioProductoImpuesto = esParaAccionDesdeFormularioProductoImpuesto;
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

			if(this.productoimpuestoSessionBean==null) {
				this.productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
			}

			if(!this.productoimpuestoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(productoimpuestoSessionBean.getlidEmpresaActual());
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

			if(this.productoimpuestoSessionBean==null) {
				this.productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
			}

			if(!this.productoimpuestoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(productoimpuestoSessionBean.getlidSucursalActual());
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

			if(this.productoimpuestoSessionBean==null) {
				this.productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
			}

			if(!this.productoimpuestoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(productoimpuestoSessionBean.getlidBodegaActual());
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

			if(this.productoimpuestoSessionBean==null) {
				this.productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
			}

			if(!this.productoimpuestoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(productoimpuestoSessionBean.getlidProductoActual());
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

	public void cargarCombosImpuestoInvensForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.impuestoinvensForeignKey=new ArrayList<ImpuestoInven>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ImpuestoInvenLogic impuestoinvenLogic=new ImpuestoInvenLogic();

			//impuestoinvenLogic.getImpuestoInvenDataAccess().setIsForForeingKeyData(true);

			if(this.productoimpuestoSessionBean==null) {
				this.productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
			}

			if(!this.productoimpuestoSessionBean.getisBusquedaDesdeForeignKeySesionImpuestoInven()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//impuestoinvenLogic.getImpuestoInvenDataAccess().setIsForForeingKeyData(true);

					impuestoinvenLogic.getTodosImpuestoInvensWithConnection(sFinalQuery,new Pagination());

					this.impuestoinvensForeignKey=impuestoinvenLogic.getImpuestoInvens();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaImpuestoInven(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					impuestoinvenLogic.getEntityWithConnection(productoimpuestoSessionBean.getlidImpuestoInvenActual());
					this.impuestoinvensForeignKey.add(impuestoinvenLogic.getImpuestoInven());
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

					if(this.productoimpuesto!=null) {
						this.productoimpuesto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
						this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_empresaProductoImpuesto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProductoImpuesto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
						if(this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_empresaProductoImpuesto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_empresaProductoImpuesto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProductoImpuestoGenerico)throws Exception
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
				jComboBoxid_empresaProductoImpuestoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProductoImpuestoGenerico!=null && jComboBoxid_empresaProductoImpuestoGenerico.getItemCount()>0) {
					jComboBoxid_empresaProductoImpuestoGenerico.setSelectedIndex(0);
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

					if(this.productoimpuesto!=null) {
						this.productoimpuesto.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
						this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_sucursalProductoImpuesto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProductoImpuesto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
						if(this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_sucursalProductoImpuesto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_sucursalProductoImpuesto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProductoImpuestoGenerico)throws Exception
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
				jComboBoxid_sucursalProductoImpuestoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProductoImpuestoGenerico!=null && jComboBoxid_sucursalProductoImpuestoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProductoImpuestoGenerico.setSelectedIndex(0);
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

					if(this.productoimpuesto!=null) {
						this.productoimpuesto.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
						this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_bodegaProductoImpuesto.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProductoImpuesto.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
						if(this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_bodegaProductoImpuesto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_bodegaProductoImpuesto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaProductoImpuesto!=null) {
						jComboBoxid_bodegaFK_IdBodegaProductoImpuesto.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaProductoImpuesto!=null) {
							//jComboBoxid_bodegaFK_IdBodegaProductoImpuesto.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaProductoImpuesto.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaProductoImpuesto.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProductoImpuestoGenerico)throws Exception
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
				jComboBoxid_bodegaProductoImpuestoGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProductoImpuestoGenerico!=null && jComboBoxid_bodegaProductoImpuestoGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProductoImpuestoGenerico.setSelectedIndex(0);
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

					if(this.productoimpuesto!=null) {
						this.productoimpuesto.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
						this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_productoProductoImpuesto.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProductoImpuesto.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
						if(this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_productoProductoImpuesto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_productoProductoImpuesto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoProductoImpuesto!=null) {
						jComboBoxid_productoFK_IdProductoProductoImpuesto.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoProductoImpuesto!=null) {
							//jComboBoxid_productoFK_IdProductoProductoImpuesto.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoProductoImpuesto.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoProductoImpuesto.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProductoImpuestoGenerico)throws Exception
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
				jComboBoxid_productoProductoImpuestoGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProductoImpuestoGenerico!=null && jComboBoxid_productoProductoImpuestoGenerico.getItemCount()>0) {
					jComboBoxid_productoProductoImpuestoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualImpuestoInvenForeignKey(Long idImpuestoInvenSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			ImpuestoInven  impuestoinvenTemp=null;

			for(ImpuestoInven impuestoinvenAux:impuestoinvensForeignKey) {
				if(impuestoinvenAux.getId()!=null && impuestoinvenAux.getId().equals(idImpuestoInvenSeleccionado)) {
					impuestoinvenTemp=impuestoinvenAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(impuestoinvenTemp!=null) {

					if(this.productoimpuesto!=null) {
						this.productoimpuesto.setImpuestoInven(impuestoinvenTemp);
					}

					if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
						this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_impuesto_invenProductoImpuesto.setSelectedItem(impuestoinvenTemp);
					}
				} else {
					//jComboBoxid_impuesto_invenProductoImpuesto.setSelectedItem(impuestoinvenTemp);
					if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
						if(this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_impuesto_invenProductoImpuesto.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_impuesto_invenProductoImpuesto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdImpuestoInven") || sFormularioTipoBusqueda.equals("Todos")){
					if(impuestoinvenTemp!=null && jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto!=null) {
						jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.setSelectedItem(impuestoinvenTemp);
					} else {
						if(jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto!=null) {
							//jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.setSelectedItem(impuestoinvenTemp);
							if(jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.getItemCount()>0) {
								jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.setSelectedIndex(0);
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

	public String getActualImpuestoInvenForeignKeyDescripcion(Long idImpuestoInvenSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			ImpuestoInven  impuestoinvenTemp=null;

			for(ImpuestoInven impuestoinvenAux:impuestoinvensForeignKey) {
				if(impuestoinvenAux.getId()!=null && impuestoinvenAux.getId().equals(idImpuestoInvenSeleccionado)) {
					impuestoinvenTemp=impuestoinvenAux;
					break;
				}
			}


			sDescripcion=ImpuestoInvenConstantesFunciones.getImpuestoInvenDescripcion(impuestoinvenTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualImpuestoInvenForeignKeyGenerico(Long idImpuestoInvenSeleccionado,JComboBox jComboBoxid_impuesto_invenProductoImpuestoGenerico)throws Exception
	{
		try
		{
			ImpuestoInven  impuestoinvenTemp=null;

			for(ImpuestoInven impuestoinvenAux:impuestoinvensForeignKey) {
				if(impuestoinvenAux.getId()!=null && impuestoinvenAux.getId().equals(idImpuestoInvenSeleccionado)) {
					impuestoinvenTemp=impuestoinvenAux;
					break;
				}
			}

			if(impuestoinvenTemp!=null) {
				jComboBoxid_impuesto_invenProductoImpuestoGenerico.setSelectedItem(impuestoinvenTemp);
			} else {
				if(jComboBoxid_impuesto_invenProductoImpuestoGenerico!=null && jComboBoxid_impuesto_invenProductoImpuestoGenerico.getItemCount()>0) {
					jComboBoxid_impuesto_invenProductoImpuestoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProductoImpuesto productoimpuesto,JComboBox jComboBoxid_empresaProductoImpuestoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProductoImpuestoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_empresaProductoImpuesto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProductoImpuestoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				productoimpuesto.setid_empresa(empresaAux.getId());
				productoimpuesto.setempresa_descripcion(ProductoImpuestoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				productoimpuesto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProductoImpuesto productoimpuesto,JComboBox jComboBoxid_sucursalProductoImpuestoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProductoImpuestoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_sucursalProductoImpuesto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProductoImpuestoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				productoimpuesto.setid_sucursal(sucursalAux.getId());
				productoimpuesto.setsucursal_descripcion(ProductoImpuestoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				productoimpuesto.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProductoImpuesto productoimpuesto,JComboBox jComboBoxid_bodegaProductoImpuestoGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProductoImpuestoGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_bodegaProductoImpuesto.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProductoImpuestoGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				productoimpuesto.setid_bodega(bodegaAux.getId());
				productoimpuesto.setbodega_descripcion(ProductoImpuestoConstantesFunciones.getBodegaDescripcion(bodegaAux));
				productoimpuesto.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProductoImpuesto productoimpuesto,JComboBox jComboBoxid_productoProductoImpuestoGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProductoImpuestoGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_productoProductoImpuesto.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProductoImpuestoGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				productoimpuesto.setid_producto(productoAux.getId());
				productoimpuesto.setproducto_descripcion(ProductoImpuestoConstantesFunciones.getProductoDescripcion(productoAux));
				productoimpuesto.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarImpuestoInvenForeignKey(ProductoImpuesto productoimpuesto,JComboBox jComboBoxid_impuesto_invenProductoImpuestoGenerico)throws Exception
	{
		try
		{
			ImpuestoInven  impuestoinvenAux=new ImpuestoInven();

			if(jComboBoxid_impuesto_invenProductoImpuestoGenerico==null) {
				impuestoinvenAux=(ImpuestoInven)this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_impuesto_invenProductoImpuesto.getSelectedItem();
			} else {
				impuestoinvenAux=(ImpuestoInven)jComboBoxid_impuesto_invenProductoImpuestoGenerico.getSelectedItem();
			}

			if(impuestoinvenAux!=null && impuestoinvenAux.getId()!=null) {
				productoimpuesto.setid_impuesto_inven(impuestoinvenAux.getId());
				productoimpuesto.setimpuestoinven_descripcion(ProductoImpuestoConstantesFunciones.getImpuestoInvenDescripcion(impuestoinvenAux));
				productoimpuesto.setImpuestoInven(impuestoinvenAux);			}
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

					if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { 
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_empresaProductoImpuesto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_empresaProductoImpuesto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { 
					}

					if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { 
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_sucursalProductoImpuesto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_sucursalProductoImpuesto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { 
					}

					if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { 
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_bodegaProductoImpuesto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_bodegaProductoImpuesto.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { 
					}

					if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProductoImpuesto.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaProductoImpuesto.addItem(bodega);
							}
						}

						if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { 
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_productoProductoImpuesto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_productoProductoImpuesto.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { 
					}

					if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoImpuesto.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoProductoImpuesto.addItem(producto);
							}
						}

						if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameImpuestoInvensForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingImpuestoInven=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { 
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_impuesto_invenProductoImpuesto.removeAllItems();

							for(ImpuestoInven impuestoinven:this.impuestoinvensForeignKey) {
								this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_impuesto_invenProductoImpuesto.addItem(impuestoinven);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { 
					}

					if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdImpuestoInven") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.removeAllItems();

							for(ImpuestoInven impuestoinven:this.impuestoinvensForeignKey) {
								this.jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.addItem(impuestoinven);
							}
						}

						if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_empresaProductoImpuesto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_empresaProductoImpuesto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_sucursalProductoImpuesto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_sucursalProductoImpuesto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_bodegaProductoImpuesto.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_bodegaProductoImpuesto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaProductoImpuesto.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProductoImpuesto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_productoProductoImpuesto.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_productoProductoImpuesto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoProductoImpuesto.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoImpuesto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameImpuestoInvenForeignKey(ImpuestoInven impuestoinven,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_impuesto_invenProductoImpuesto.setSelectedItem(impuestoinven);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_impuesto_invenProductoImpuesto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.setSelectedItem(impuestoinven);
						} else {
							this.jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoImpuesto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoImpuestoConstantesFunciones.refrescarForeignKeysDescripcionesProductoImpuesto(this.productoimpuestoLogic.getProductoImpuestos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoImpuestoConstantesFunciones.refrescarForeignKeysDescripcionesProductoImpuesto(this.productoimpuestos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(ImpuestoInven.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productoimpuestoLogic.setProductoImpuestos(this.productoimpuestos);
			productoimpuestoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoImpuestoParameterReturnGeneral getProductoImpuestoParameterGeneral() {
		return this.productoimpuestoParameterGeneral;
	}
	
	public void setProductoImpuestoParameterGeneral(ProductoImpuestoParameterReturnGeneral productoimpuestoParameterGeneral) {
		this.productoimpuestoParameterGeneral = productoimpuestoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoImpuesto() {
		return isPermisoTodoProductoImpuesto;
	}

	public void setIsPermisoTodoProductoImpuesto(Boolean isPermisoTodoProductoImpuesto) {
		this.isPermisoTodoProductoImpuesto = isPermisoTodoProductoImpuesto;
	}

	public Boolean getIsPermisoNuevoProductoImpuesto() {
		return isPermisoNuevoProductoImpuesto;
	}

	public void setIsPermisoNuevoProductoImpuesto(Boolean isPermisoNuevoProductoImpuesto) {
		this.isPermisoNuevoProductoImpuesto = isPermisoNuevoProductoImpuesto;
	}

	public Boolean getIsPermisoActualizarProductoImpuesto() {
		return isPermisoActualizarProductoImpuesto;
	}

	public void setIsPermisoActualizarProductoImpuesto(Boolean isPermisoActualizarProductoImpuesto) {
		this.isPermisoActualizarProductoImpuesto = isPermisoActualizarProductoImpuesto;
	}

	public Boolean getIsPermisoEliminarProductoImpuesto() {
		return isPermisoEliminarProductoImpuesto;
	}

	public void setIsPermisoEliminarProductoImpuesto(Boolean isPermisoEliminarProductoImpuesto) {
		this.isPermisoEliminarProductoImpuesto = isPermisoEliminarProductoImpuesto;
	}

	public Boolean getIsPermisoGuardarCambiosProductoImpuesto() {
		return isPermisoGuardarCambiosProductoImpuesto;
	}

	public void setIsPermisoGuardarCambiosProductoImpuesto(Boolean isPermisoGuardarCambiosProductoImpuesto) {
		this.isPermisoGuardarCambiosProductoImpuesto = isPermisoGuardarCambiosProductoImpuesto;
	}
	
	public Boolean getIsPermisoConsultaProductoImpuesto() {
		return isPermisoConsultaProductoImpuesto;
	}

	public void setIsPermisoConsultaProductoImpuesto(Boolean isPermisoConsultaProductoImpuesto) {
		this.isPermisoConsultaProductoImpuesto = isPermisoConsultaProductoImpuesto;
	}

	public Boolean getIsPermisoBusquedaProductoImpuesto() {
		return isPermisoBusquedaProductoImpuesto;
	}

	public void setIsPermisoBusquedaProductoImpuesto(Boolean isPermisoBusquedaProductoImpuesto) {
		this.isPermisoBusquedaProductoImpuesto = isPermisoBusquedaProductoImpuesto;
	}

	public Boolean getIsPermisoReporteProductoImpuesto() {
		return isPermisoReporteProductoImpuesto;
	}

	public void setIsPermisoReporteProductoImpuesto(Boolean isPermisoReporteProductoImpuesto) {
		this.isPermisoReporteProductoImpuesto = isPermisoReporteProductoImpuesto;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoImpuesto() {
		return isPermisoPaginacionMedioProductoImpuesto;
	}

	public void setIsPermisoPaginacionMedioProductoImpuesto(Boolean isPermisoPaginacionMedioProductoImpuesto) {
		this.isPermisoPaginacionMedioProductoImpuesto = isPermisoPaginacionMedioProductoImpuesto;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoImpuesto() {
		return isPermisoPaginacionTodoProductoImpuesto;
	}

	public void setIsPermisoPaginacionTodoProductoImpuesto(Boolean isPermisoPaginacionTodoProductoImpuesto) {
		this.isPermisoPaginacionTodoProductoImpuesto = isPermisoPaginacionTodoProductoImpuesto;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoImpuesto() {
		return isPermisoPaginacionAltoProductoImpuesto;
	}

	public void setIsPermisoPaginacionAltoProductoImpuesto(Boolean isPermisoPaginacionAltoProductoImpuesto) {
		this.isPermisoPaginacionAltoProductoImpuesto = isPermisoPaginacionAltoProductoImpuesto;
	}
	
	public Boolean getIsPermisoCopiarProductoImpuesto() {
		return isPermisoCopiarProductoImpuesto;
	}

	public void setIsPermisoCopiarProductoImpuesto(Boolean isPermisoCopiarProductoImpuesto) {
		this.isPermisoCopiarProductoImpuesto = isPermisoCopiarProductoImpuesto;
	}
	
	public Boolean getIsPermisoVerFormProductoImpuesto() {
		return isPermisoVerFormProductoImpuesto;
	}

	public void setIsPermisoVerFormProductoImpuesto(Boolean isPermisoVerFormProductoImpuesto) {
		this.isPermisoVerFormProductoImpuesto = isPermisoVerFormProductoImpuesto;
	}
	
	public Boolean getIsPermisoDuplicarProductoImpuesto() {
		return isPermisoDuplicarProductoImpuesto;
	}

	public void setIsPermisoDuplicarProductoImpuesto(Boolean isPermisoDuplicarProductoImpuesto) {
		this.isPermisoDuplicarProductoImpuesto = isPermisoDuplicarProductoImpuesto;
	}
	
	public Boolean getIsPermisoOrdenProductoImpuesto() {
		return isPermisoOrdenProductoImpuesto;
	}

	public void setIsPermisoOrdenProductoImpuesto(Boolean isPermisoOrdenProductoImpuesto) {
		this.isPermisoOrdenProductoImpuesto = isPermisoOrdenProductoImpuesto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoImpuesto() {
		return isVisibilidadCeldaNuevoProductoImpuesto;
	}

	public void setIsVisibilidadCeldaNuevoProductoImpuesto(Boolean isVisibilidadCeldaNuevoProductoImpuesto) {
		this.isVisibilidadCeldaNuevoProductoImpuesto = isVisibilidadCeldaNuevoProductoImpuesto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoImpuesto() {
		return isVisibilidadCeldaDuplicarProductoImpuesto;
	}

	public void setIsVisibilidadCeldaDuplicarProductoImpuesto(Boolean isVisibilidadCeldaDuplicarProductoImpuesto) {
		this.isVisibilidadCeldaDuplicarProductoImpuesto = isVisibilidadCeldaDuplicarProductoImpuesto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoImpuesto() {
		return isVisibilidadCeldaCopiarProductoImpuesto;
	}

	public void setIsVisibilidadCeldaCopiarProductoImpuesto(Boolean isVisibilidadCeldaCopiarProductoImpuesto) {
		this.isVisibilidadCeldaCopiarProductoImpuesto = isVisibilidadCeldaCopiarProductoImpuesto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoImpuesto() {
		return isVisibilidadCeldaVerFormProductoImpuesto;
	}

	public void setIsVisibilidadCeldaVerFormProductoImpuesto(Boolean isVisibilidadCeldaVerFormProductoImpuesto) {
		this.isVisibilidadCeldaVerFormProductoImpuesto = isVisibilidadCeldaVerFormProductoImpuesto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoImpuesto() {
		return isVisibilidadCeldaOrdenProductoImpuesto;
	}

	public void setIsVisibilidadCeldaOrdenProductoImpuesto(Boolean isVisibilidadCeldaOrdenProductoImpuesto) {
		this.isVisibilidadCeldaOrdenProductoImpuesto = isVisibilidadCeldaOrdenProductoImpuesto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoImpuesto() {
		return isVisibilidadCeldaNuevoRelacionesProductoImpuesto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoImpuesto(Boolean isVisibilidadCeldaNuevoRelacionesProductoImpuesto) {
		this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto = isVisibilidadCeldaNuevoRelacionesProductoImpuesto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoImpuesto() {
		return isVisibilidadCeldaModificarProductoImpuesto;
	}

	public void setIsVisibilidadCeldaModificarProductoImpuesto(Boolean isVisibilidadCeldaModificarProductoImpuesto) {
		this.isVisibilidadCeldaModificarProductoImpuesto = isVisibilidadCeldaModificarProductoImpuesto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoImpuesto() {
		return isVisibilidadCeldaActualizarProductoImpuesto;
	}

	public void setIsVisibilidadCeldaActualizarProductoImpuesto(Boolean isVisibilidadCeldaActualizarProductoImpuesto) {
		this.isVisibilidadCeldaActualizarProductoImpuesto = isVisibilidadCeldaActualizarProductoImpuesto;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoImpuesto() {
		return isVisibilidadCeldaEliminarProductoImpuesto;
	}

	public void setIsVisibilidadCeldaEliminarProductoImpuesto(Boolean isVisibilidadCeldaEliminarProductoImpuesto) {
		this.isVisibilidadCeldaEliminarProductoImpuesto = isVisibilidadCeldaEliminarProductoImpuesto;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoImpuesto() {
		return isVisibilidadCeldaCancelarProductoImpuesto;
	}

	public void setIsVisibilidadCeldaCancelarProductoImpuesto(Boolean isVisibilidadCeldaCancelarProductoImpuesto) {
		this.isVisibilidadCeldaCancelarProductoImpuesto = isVisibilidadCeldaCancelarProductoImpuesto;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoImpuesto() {
		return isVisibilidadCeldaGuardarProductoImpuesto;
	}

	public void setIsVisibilidadCeldaGuardarProductoImpuesto(Boolean isVisibilidadCeldaGuardarProductoImpuesto) {
		this.isVisibilidadCeldaGuardarProductoImpuesto = isVisibilidadCeldaGuardarProductoImpuesto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoImpuesto() {
		return isVisibilidadCeldaGuardarCambiosProductoImpuesto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoImpuesto(Boolean isVisibilidadCeldaGuardarCambiosProductoImpuesto) {
		this.isVisibilidadCeldaGuardarCambiosProductoImpuesto = isVisibilidadCeldaGuardarCambiosProductoImpuesto;
	}
		
	public ProductoImpuestoSessionBean getproductoimpuestoSessionBean() {
		return this.productoimpuestoSessionBean;
	}
	
	public void setproductoimpuestoSessionBean(ProductoImpuestoSessionBean productoimpuestoSessionBean) {
		this.productoimpuestoSessionBean=productoimpuestoSessionBean;
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

	public Boolean getisVisibilidadFK_IdImpuestoInven() {
		return this.isVisibilidadFK_IdImpuestoInven;
	}

	public void setisVisibilidadFK_IdImpuestoInven(Boolean isVisibilidadFK_IdImpuestoInven) {
		this.isVisibilidadFK_IdImpuestoInven=isVisibilidadFK_IdImpuestoInven;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(ProductoImpuesto productoimpuesto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(productoimpuesto,null);
				this.setActualParaGuardarSucursalForeignKey(productoimpuesto,null);
				this.setActualParaGuardarBodegaForeignKey(productoimpuesto,null);
				this.setActualParaGuardarProductoForeignKey(productoimpuesto,null);
				this.setActualParaGuardarImpuestoInvenForeignKey(productoimpuesto,null);
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
	
	public void bugActualizarReferenciaActual(ProductoImpuesto productoimpuesto,ProductoImpuesto productoimpuestoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoImpuesto(productoimpuesto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productoimpuestoAux.setId(productoimpuesto.getId());
		productoimpuestoAux.setVersionRow(productoimpuesto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoImpuesto();
		
			int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoImpuesto(this.productoimpuesto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productoimpuestoValidator.getInvalidValues(this.productoimpuesto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productoimpuestoLogic.setDatosCliente(datosCliente);
			productoimpuestoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productoimpuestoAux=new  ProductoImpuesto();
				
				productoimpuestoAux.setIsNew(true);
				productoimpuestoAux.setIsChanged(true);
				
				productoimpuestoAux.setProductoImpuestoOriginal(this.productoimpuesto);
				
				productoimpuestoAux.setId(this.productoimpuesto.getId());	
				productoimpuestoAux.setVersionRow(this.productoimpuesto.getVersionRow());	
				productoimpuestoAux.setid_empresa(this.productoimpuesto.getid_empresa());	
				productoimpuestoAux.setid_sucursal(this.productoimpuesto.getid_sucursal());	
				productoimpuestoAux.setid_bodega(this.productoimpuesto.getid_bodega());	
				productoimpuestoAux.setid_producto(this.productoimpuesto.getid_producto());	
				productoimpuestoAux.setid_impuesto_inven(this.productoimpuesto.getid_impuesto_inven());	
				productoimpuestoAux.setporcentaje(this.productoimpuesto.getporcentaje());	
				productoimpuestoAux.setvalor(this.productoimpuesto.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoimpuestoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoimpuestoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productoimpuestoAux,productoimpuestoLogic.getProductoImpuestos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoimpuestoAux,productoimpuestos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productoimpuestoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoimpuestoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoimpuestoLogic.saveProductoImpuestos();//WithConnection
						//productoimpuestoLogic.getSetVersionRowProductoImpuestos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoimpuesto,productoimpuestoAux);
					
					this.refrescarForeignKeysDescripcionesProductoImpuesto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoimpuestoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoimpuestoLogic.saveProductoImpuestoRelaciones(productoimpuestoAux);//WithConnection
								//productoimpuestoLogic.getSetVersionRowProductoImpuestos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoimpuesto,productoimpuestoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoimpuestoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoimpuestoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoimpuestoAux,productoimpuestoLogic.getProductoImpuestos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoimpuestoAux,productoimpuestos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoimpuesto,productoimpuestoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productoimpuestoAux=new  ProductoImpuesto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado() 
					|| (this.productoimpuestoSessionBean.getEsGuardarRelacionado() && this.productoimpuesto.getId()>=0)) {
						
					productoimpuestoAux.setIsNew(false);
				}
				
				productoimpuestoAux.setIsDeleted(false);
			
				productoimpuestoAux.setId(this.productoimpuesto.getId());	
				productoimpuestoAux.setVersionRow(this.productoimpuesto.getVersionRow());	
				productoimpuestoAux.setid_empresa(this.productoimpuesto.getid_empresa());	
				productoimpuestoAux.setid_sucursal(this.productoimpuesto.getid_sucursal());	
				productoimpuestoAux.setid_bodega(this.productoimpuesto.getid_bodega());	
				productoimpuestoAux.setid_producto(this.productoimpuesto.getid_producto());	
				productoimpuestoAux.setid_impuesto_inven(this.productoimpuesto.getid_impuesto_inven());	
				productoimpuestoAux.setporcentaje(this.productoimpuesto.getporcentaje());	
				productoimpuestoAux.setvalor(this.productoimpuesto.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoimpuestoAux,productoimpuestoLogic.getProductoImpuestos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoimpuestoAux,productoimpuestos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productoimpuestoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoimpuestoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoimpuestoLogic.saveProductoImpuestos();//WithConnection
						//productoimpuestoLogic.getSetVersionRowProductoImpuestos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoimpuesto,productoimpuestoAux);
					
					this.refrescarForeignKeysDescripcionesProductoImpuesto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoimpuestoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoimpuestoLogic.saveProductoImpuestoRelaciones(productoimpuestoAux);//WithConnection
								//productoimpuestoLogic.getSetVersionRowProductoImpuestos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoimpuesto,productoimpuestoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoimpuestoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoimpuestoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoimpuestoAux,productoimpuestoLogic.getProductoImpuestos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoimpuestoAux,productoimpuestos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoimpuesto,productoimpuestoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productoimpuestoAux=new  ProductoImpuesto();
				
				productoimpuestoAux.setIsNew(false);
				productoimpuestoAux.setIsChanged(false);
				
				productoimpuestoAux.setIsDeleted(true);
				
				productoimpuestoAux.setId(this.productoimpuesto.getId());	
				productoimpuestoAux.setVersionRow(this.productoimpuesto.getVersionRow());	
				productoimpuestoAux.setid_empresa(this.productoimpuesto.getid_empresa());	
				productoimpuestoAux.setid_sucursal(this.productoimpuesto.getid_sucursal());	
				productoimpuestoAux.setid_bodega(this.productoimpuesto.getid_bodega());	
				productoimpuestoAux.setid_producto(this.productoimpuesto.getid_producto());	
				productoimpuestoAux.setid_impuesto_inven(this.productoimpuesto.getid_impuesto_inven());	
				productoimpuestoAux.setporcentaje(this.productoimpuesto.getporcentaje());	
				productoimpuestoAux.setvalor(this.productoimpuesto.getvalor());	
				
				if(this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productoimpuestoAux.getId()>=0) {	
						this.productoimpuestosEliminados.add(productoimpuestoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productoimpuestoAux,productoimpuestoLogic.getProductoImpuestos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoimpuestoAux,productoimpuestos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productoimpuestoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoimpuestoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoimpuestoLogic.saveProductoImpuestos();//WithConnection
						//productoimpuestoLogic.getSetVersionRowProductoImpuestos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoimpuestoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoimpuestoLogic.saveProductoImpuestoRelaciones(productoimpuestoAux);//WithConnection
								//productoimpuestoLogic.getSetVersionRowProductoImpuestos();//WithConnection
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
							if(this.productoimpuestoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productoimpuestoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productoimpuestoAux,productoimpuestoLogic.getProductoImpuestos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productoimpuestoAux,productoimpuestos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.getProductoImpuestos().addAll(this.productoimpuestosEliminados);
					
					productoimpuestoLogic.saveProductoImpuestos();//WithConnection
					//productoimpuestoLogic.getSetVersionRowProductoImpuestos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoImpuesto();
				
				this.productoimpuestosEliminados= new ArrayList<ProductoImpuesto>();		
			}
			
			if(this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Producto Impuesto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Producto Impuesto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productoimpuesto=productoimpuestoAux;
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
      		//this.finishProcessProductoImpuesto();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoImpuesto productoimpuestoLocal) throws Exception {
		
		if(this.productoimpuestoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoImpuesto productoimpuestoLocal) throws Exception {	
		if(this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				productoimpuestoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				productoimpuestoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				productoimpuestoLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				productoimpuestoLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ImpuestoInvenDetalleFormJInternalFrame.class)) {
				ImpuestoInvenBeanSwingJInternalFrame impuestoinvenBeanSwingJInternalFrameLocal=(ImpuestoInvenBeanSwingJInternalFrame) ((ImpuestoInvenDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				impuestoinvenBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoImpuestoInven(impuestoinvenBeanSwingJInternalFrameLocal.getimpuestoinven(),true);
				impuestoinvenBeanSwingJInternalFrameLocal.actualizarLista(impuestoinvenBeanSwingJInternalFrameLocal.impuestoinven,this.impuestoinvensForeignKey);

				impuestoinvenBeanSwingJInternalFrameLocal.actualizarRelaciones(impuestoinvenBeanSwingJInternalFrameLocal.impuestoinven);

				productoimpuestoLocal.setImpuestoInven(impuestoinvenBeanSwingJInternalFrameLocal.impuestoinven);

				this.addItemDefectoCombosForeignKeyImpuestoInven();
				this.cargarCombosFrameImpuestoInvensForeignKey("Formulario");
				this.setActualImpuestoInvenForeignKey(impuestoinvenBeanSwingJInternalFrameLocal.impuestoinven.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoImpuestoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productoimpuestoValidator.getInvalidValues(this.productoimpuesto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoImpuesto productoimpuesto,List<ProductoImpuesto> productoimpuestos) throws Exception {
		try	{		
			ProductoImpuestoConstantesFunciones.actualizarLista(productoimpuesto,productoimpuestos,this.productoimpuestoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoImpuesto productoimpuesto,List<ProductoImpuesto> productoimpuestos) throws Exception {
		try	{			
			ProductoImpuestoConstantesFunciones.actualizarSelectedLista(productoimpuesto,productoimpuestos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoImpuesto> productoimpuestosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productoimpuestosLocal=this.productoimpuestoLogic.getProductoImpuestos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productoimpuestosLocal=this.productoimpuestos;
			}
			//ARCHITECTURE
		
			for(ProductoImpuesto productoimpuestoLocal:productoimpuestosLocal) {
				if(this.permiteMantenimiento(productoimpuestoLocal) && productoimpuestoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoImpuestoConstantesFunciones.getProductoImpuestoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoImpuestoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoImpuesto.jLabelid_empresaProductoImpuesto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoImpuestoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoImpuesto.jLabelid_sucursalProductoImpuesto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoImpuestoConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoImpuesto.jLabelid_bodegaProductoImpuesto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoImpuestoConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoImpuesto.jLabelid_productoProductoImpuesto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoImpuestoConstantesFunciones.IDIMPUESTOINVEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoImpuesto.jLabelid_impuesto_invenProductoImpuesto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoImpuestoConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoImpuesto.jLabelporcentajeProductoImpuesto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoImpuestoConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoImpuesto.jLabelvalorProductoImpuesto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoImpuesto.jLabelid_empresaProductoImpuesto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoImpuesto.jLabelid_sucursalProductoImpuesto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoImpuesto.jLabelid_bodegaProductoImpuesto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoImpuesto.jLabelid_productoProductoImpuesto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoImpuesto.jLabelid_impuesto_invenProductoImpuesto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoImpuesto.jLabelporcentajeProductoImpuesto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoImpuesto.jLabelvalorProductoImpuesto,"");
		
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
		this.iIdNuevoProductoImpuesto--;	
		
		
		this.productoimpuestoAux=new ProductoImpuesto();
		
		this.productoimpuestoAux.setId(this.iIdNuevoProductoImpuesto);
		this.productoimpuestoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoimpuestoLogic.getProductoImpuestos().add(this.productoimpuestoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productoimpuestos.add(this.productoimpuestoAux);
		}
		//ARCHITECTURE
		
		this.productoimpuesto=this.productoimpuestoAux;
		
		if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoImpuesto(this.productoimpuesto);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoImpuesto(this.productoimpuesto);
		}
				
		//this.setDefaultControlesProductoImpuesto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoImpuesto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoImpuesto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoImpuesto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoImpuesto(this.productoimpuestoBean,this.productoimpuesto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoImpuestoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productoimpuestoSessionBean.getConGuardarRelaciones()) {
			classes=ProductoImpuestoConstantesFunciones.getClassesRelationshipsOfProductoImpuesto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productoimpuestoReturnGeneral=productoimpuestoLogic.procesarEventosProductoImpuestosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoimpuestoLogic.getProductoImpuestos(),this.productoimpuesto,this.productoimpuestoParameterGeneral,this.isEsNuevoProductoImpuesto,classes);//this.productoimpuestoLogic.getProductoImpuesto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoImpuesto(this.productoimpuestoReturnGeneral,this.productoimpuestoBean,false);
		
		if(this.productoimpuestoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoImpuesto(this.productoimpuestoReturnGeneral.getProductoImpuesto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoImpuesto(this.productoimpuestoReturnGeneral.getProductoImpuesto());
		}
		
		if(this.productoimpuestoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoImpuesto(this.productoimpuestoReturnGeneral.getProductoImpuesto(),classes);//this.productoimpuestoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoImpuesto(this.productoimpuesto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoImpuesto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoImpuesto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.RecargarFormProductoImpuesto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoImpuesto(false);
						
			if(productoimpuestoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoImpuesto();
			}
			
			this.actualizarVisualTableDatosProductoImpuesto();
			
			this.jTableDatosProductoImpuesto.setRowSelectionInterval(this.getIndiceNuevoProductoImpuesto(), this.getIndiceNuevoProductoImpuesto());
			
			this.seleccionarFilaTablaProductoImpuestoActual();
						
			this.actualizarEstadoCeldasBotonesProductoImpuesto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoImpuesto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldporcentajeProductoImpuesto.setEnabled(isHabilitar && this.productoimpuestoConstantesFunciones.activarporcentajeProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldvalorProductoImpuesto.setEnabled(isHabilitar && this.productoimpuestoConstantesFunciones.activarvalorProductoImpuesto);	
		//
		this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_empresaProductoImpuesto.setEnabled(isHabilitar && this.productoimpuestoConstantesFunciones.activarid_empresaProductoImpuesto);//
		this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_sucursalProductoImpuesto.setEnabled(isHabilitar && this.productoimpuestoConstantesFunciones.activarid_sucursalProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_bodegaProductoImpuesto.setEnabled(isHabilitar && this.productoimpuestoConstantesFunciones.activarid_bodegaProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_productoProductoImpuesto.setEnabled(isHabilitar && this.productoimpuestoConstantesFunciones.activarid_productoProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_impuesto_invenProductoImpuesto.setEnabled(isHabilitar && this.productoimpuestoConstantesFunciones.activarid_impuesto_invenProductoImpuesto);
	};
	
	public void setDefaultControlesProductoImpuesto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoImpuesto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productoimpuestoSessionBean.setConGuardarRelaciones(true);			
			this.productoimpuestoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoImpuesto.jTabbedPaneRelacionesProductoImpuesto.setVisible(true);
			
					
		} else {
			//this.productoimpuestoSessionBean.setConGuardarRelaciones(false);			
			this.productoimpuestoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoImpuesto.jTabbedPaneRelacionesProductoImpuesto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoImpuesto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoImpuesto productoimpuestoAux:this.productoimpuestoLogic.getProductoImpuestos()) {
				if(productoimpuestoAux.getId().equals(this.iIdNuevoProductoImpuesto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoImpuesto productoimpuestoAux:this.productoimpuestos) {
				if(productoimpuestoAux.getId().equals(this.iIdNuevoProductoImpuesto)) {
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
	
	public int getIndiceActualProductoImpuesto(ProductoImpuesto productoimpuesto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoImpuesto productoimpuestoAux:this.productoimpuestoLogic.getProductoImpuestos()) {
				if(productoimpuestoAux.getId().equals(productoimpuesto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoImpuesto productoimpuestoAux:this.productoimpuestos) {
				if(productoimpuestoAux.getId().equals(productoimpuesto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoImpuesto(ProductoImpuesto productoimpuestoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoImpuesto productoimpuestoAux:this.productoimpuestoLogic.getProductoImpuestos()) {
				if(productoimpuestoAux.getProductoImpuestoOriginal().getId().equals(productoimpuestoOriginal.getId())) {
					existe=true;
					productoimpuestoOriginal.setId(productoimpuestoAux.getId());
					productoimpuestoOriginal.setVersionRow(productoimpuestoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoImpuesto productoimpuestoAux:this.productoimpuestos) {
				if(productoimpuestoAux.getProductoImpuestoOriginal().getId().equals(productoimpuestoOriginal.getId())) {
					existe=true;
					productoimpuestoOriginal.setId(productoimpuestoAux.getId());
					productoimpuestoOriginal.setVersionRow(productoimpuestoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoImpuesto(Boolean esParaCancelar) throws Exception {
		productoimpuestosAux=new ArrayList<ProductoImpuesto>();
		productoimpuestoAux=new ProductoImpuesto();
		
		if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoImpuesto productoimpuestoAux:this.productoimpuestoLogic.getProductoImpuestos()) {
					if(productoimpuestoAux.getId()<0) {
						productoimpuestosAux.add(productoimpuestoAux);
					}		
				}
				this.iIdNuevoProductoImpuesto=0L;
				this.productoimpuestoLogic.getProductoImpuestos().removeAll(productoimpuestosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoImpuesto productoimpuestoAux:this.productoimpuestos) {
					if(productoimpuestoAux.getId()<0) {
						productoimpuestosAux.add(productoimpuestoAux);
					}		
				}
				this.iIdNuevoProductoImpuesto=0L;
				this.productoimpuestos.removeAll(productoimpuestosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoImpuesto 
					&& this.productoimpuestoLogic.getProductoImpuestos().size()>0
					) {
					productoimpuestoAux=this.productoimpuestoLogic.getProductoImpuestos().get(this.productoimpuestoLogic.getProductoImpuestos().size() - 1);
				
					if(productoimpuestoAux.getId()<0) {
						this.productoimpuestoLogic.getProductoImpuestos().remove(productoimpuestoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoImpuesto && this.productoimpuestos.size()>0) {
					productoimpuestoAux=this.productoimpuestos.get(this.productoimpuestos.size() - 1);
				
					if(productoimpuestoAux.getId()<0) {
						this.productoimpuestos.remove(productoimpuestoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoImpuesto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productoimpuesto.getId()<0) {
				this.productoimpuestoLogic.getProductoImpuestos().remove(this.productoimpuesto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productoimpuesto.getId()<0) {
				this.productoimpuestos.remove(this.productoimpuesto);
			}
		}			
	}
	
	public void setEstadosInicialesProductoImpuesto(List<ProductoImpuesto> productoimpuestosAux) throws Exception {
		ProductoImpuestoConstantesFunciones.setEstadosInicialesProductoImpuesto(productoimpuestosAux);
	}
	
	public void setEstadosInicialesProductoImpuesto(ProductoImpuesto productoimpuestoAux) throws Exception {
		ProductoImpuestoConstantesFunciones.setEstadosInicialesProductoImpuesto(productoimpuestoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoImpuestoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoImpuesto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoImpuestoActual()) {
				if(!this.isEsNuevoProductoImpuesto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoImpuesto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoImpuesto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoImpuestoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Producto Impuesto ?", "MANTENIMIENTO DE Producto Impuesto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoImpuesto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoImpuesto productoimpuesto) throws Exception {
		ProductoImpuestoConstantesFunciones.seleccionarAsignar(this.productoimpuesto,productoimpuesto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoImpuesto=this.isPermisoActualizarOriginalProductoImpuesto;
			
			
			this.seleccionarAsignar(productoimpuesto);
			
			

			idProductoActual=productoimpuesto.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoImpuestoConstantesFunciones.quitarEspaciosProductoImpuesto(this.productoimpuesto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoImpuesto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productoimpuestoSessionBean.setsFuncionBusquedaRapida(this.productoimpuestoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoProductoImpuesto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoImpuesto(esParaCancelar);				
				this.cancelarNuevoProductoImpuesto(esParaCancelar);								
			}
			
			this.productoimpuesto=new ProductoImpuesto();
			
			this.inicializarProductoImpuesto();
			
			this.actualizarEstadoCeldasBotonesProductoImpuesto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoImpuesto() throws Exception {
		try {
			ProductoImpuestoConstantesFunciones.inicializarProductoImpuesto(this.productoimpuesto);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productoimpuestoLogic.getProductoImpuestos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoImpuestos(String sAccionBusqueda,List<ProductoImpuesto> productoimpuestosParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoImpuesto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoImpuestoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoImpuestoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoImpuesto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Producto Impuestos");		
		parameters.put("busquedapor", ProductoImpuestoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoImpuesto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoImpuestoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoImpuestoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoImpuesto=new JRBeanArrayDataSource(ProductoImpuestoJInternalFrame.TraerProductoImpuestoBeans(productoimpuestosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoImpuesto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoImpuestoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoImpuestoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoImpuestoBean.TraerProductoImpuestoBeans(productoimpuestosParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoImpuestos(sAccionBusqueda,sTipoArchivoReporte,productoimpuestosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoImpuestos(sAccionBusqueda,sTipoArchivoReporte,productoimpuestosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoImpuestoActionPerformed(null);
					//this.generarExcelReporteProductoImpuestos(sAccionBusqueda,sTipoArchivoReporte,productoimpuestosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoImpuestos(sAccionBusqueda,sTipoArchivoReporte,productoimpuestosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoImpuestos(sAccionBusqueda,sTipoArchivoReporte,productoimpuestosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoImpuestos(sAccionBusqueda,sTipoArchivoReporte,productoimpuestosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoImpuestos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoImpuesto> productoimpuestosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoimpuesto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoImpuestos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoImpuesto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoImpuesto productoimpuesto : productoimpuestosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoImpuestoConstantesFunciones.generarExcelReporteDataProductoImpuesto("NORMAL",row,workbook,productoimpuesto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Impuesto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoImpuesto(String sTipo,Row row,Workbook workbook) {
		
		ProductoImpuestoConstantesFunciones.generarExcelReporteHeaderProductoImpuesto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoImpuestos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoImpuesto> productoimpuestosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoimpuesto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoImpuestos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoImpuesto productoimpuesto : productoimpuestosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoImpuestoConstantesFunciones.getProductoImpuestoDescripcion(productoimpuesto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoImpuestoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoimpuesto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoImpuestoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoimpuesto.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoimpuesto.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoimpuesto.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoimpuesto.getimpuestoinven_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoimpuesto.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoImpuestoConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoimpuesto.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Impuesto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoImpuestos(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoImpuesto> productoimpuestosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoImpuesto> productoimpuestosRespaldo=null;
		
		classes=ProductoImpuestoConstantesFunciones.getClassesRelationshipsOfProductoImpuesto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productoimpuestoLogic.setDatosCliente(this.datosCliente);
		this.productoimpuestoLogic.setDatosDeep(this.datosDeep);
		this.productoimpuestoLogic.setIsConDeep(true);
		
		productoimpuestosRespaldo=this.productoimpuestoLogic.getProductoImpuestos();
		
		this.productoimpuestoLogic.setProductoImpuestos(productoimpuestosParaReportes);	
		this.productoimpuestoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productoimpuestosParaReportes=this.productoimpuestoLogic.getProductoImpuestos();
		this.productoimpuestoLogic.setProductoImpuestos(productoimpuestosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoimpuesto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoImpuestos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoImpuesto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoImpuesto productoimpuesto : productoimpuestosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoImpuesto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoImpuestoConstantesFunciones.generarExcelReporteDataProductoImpuesto("NORMAL",row,workbook,productoimpuesto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoImpuestoConstantesFunciones.getProductoImpuestoDescripcion(productoimpuesto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Impuesto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoImpuesto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoImpuesto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoImpuesto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoImpuesto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoImpuesto() throws Exception {		
		this.startProcessProductoImpuesto(true);
	}
	
	public void startProcessProductoImpuesto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoImpuesto ,this.jPanelParametrosReportesProductoImpuesto, this.jScrollPanelDatosProductoImpuesto,this.jPanelPaginacionProductoImpuesto, this.jScrollPanelDatosEdicionProductoImpuesto, this.jPanelAccionesProductoImpuesto,this.jPanelAccionesFormularioProductoImpuesto,this.jmenuBarProductoImpuesto,this.jmenuBarDetalleProductoImpuesto,this.jTtoolBarProductoImpuesto,this.jTtoolBarDetalleProductoImpuesto);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoImpuesto=this.jTabbedPaneBusquedasProductoImpuesto; 
		
		final JPanel jPanelParametrosReportesProductoImpuesto=this.jPanelParametrosReportesProductoImpuesto;
		//final JScrollPane jScrollPanelDatosProductoImpuesto=this.jScrollPanelDatosProductoImpuesto;
		final JTable jTableDatosProductoImpuesto=this.jTableDatosProductoImpuesto;		
		final JPanel jPanelPaginacionProductoImpuesto=this.jPanelPaginacionProductoImpuesto;
		//final JScrollPane jScrollPanelDatosEdicionProductoImpuesto=this.jScrollPanelDatosEdicionProductoImpuesto;
		final JPanel jPanelAccionesProductoImpuesto=this.jPanelAccionesProductoImpuesto;
		
		JPanel jPanelCamposAuxiliarProductoImpuesto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoImpuesto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
			jPanelCamposAuxiliarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jPanelCamposProductoImpuesto;
			jPanelAccionesFormularioAuxiliarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jPanelAccionesFormularioProductoImpuesto;
		}
		
		final JPanel jPanelCamposProductoImpuesto=jPanelCamposAuxiliarProductoImpuesto;
		final JPanel jPanelAccionesFormularioProductoImpuesto=jPanelAccionesFormularioAuxiliarProductoImpuesto;
		
		
		final JMenuBar jmenuBarProductoImpuesto=this.jmenuBarProductoImpuesto;
		final JToolBar jTtoolBarProductoImpuesto=this.jTtoolBarProductoImpuesto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoImpuesto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoImpuesto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
			jmenuBarDetalleAuxiliarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jmenuBarDetalleProductoImpuesto;
			jTtoolBarDetalleAuxiliarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jTtoolBarDetalleProductoImpuesto;
		}
		
		final JMenuBar jmenuBarDetalleProductoImpuesto=jmenuBarDetalleAuxiliarProductoImpuesto;
		final JToolBar jTtoolBarDetalleProductoImpuesto=jTtoolBarDetalleAuxiliarProductoImpuesto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoImpuesto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoImpuesto;
			processRunnable.jTableDatos=jTableDatosProductoImpuesto;
			processRunnable.jPanelCampos=jPanelCamposProductoImpuesto;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoImpuesto;
			processRunnable.jPanelAcciones=jPanelAccionesProductoImpuesto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoImpuesto;
			
			
			processRunnable.jmenuBar=jmenuBarProductoImpuesto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoImpuesto;
			processRunnable.jTtoolBar=jTtoolBarProductoImpuesto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoImpuesto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoImpuesto ,jPanelParametrosReportesProductoImpuesto,jTableDatosProductoImpuesto, /*jScrollPanelDatosProductoImpuesto,*/jPanelCamposProductoImpuesto,jPanelPaginacionProductoImpuesto, /*jScrollPanelDatosEdicionProductoImpuesto,*/ jPanelAccionesProductoImpuesto,jPanelAccionesFormularioProductoImpuesto,jmenuBarProductoImpuesto,jmenuBarDetalleProductoImpuesto,jTtoolBarProductoImpuesto,jTtoolBarDetalleProductoImpuesto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoImpuesto ,jPanelParametrosReportesProductoImpuesto, jScrollPanelDatosProductoImpuesto,jPanelPaginacionProductoImpuesto, jScrollPanelDatosEdicionProductoImpuesto, jPanelAccionesProductoImpuesto,jPanelAccionesFormularioProductoImpuesto,jmenuBarProductoImpuesto,jmenuBarDetalleProductoImpuesto,jTtoolBarProductoImpuesto,jTtoolBarDetalleProductoImpuesto);
						
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
	
	public void finishProcessProductoImpuesto() {// throws Exception 
		this.finishProcessProductoImpuesto(true);
	}
	
	public void finishProcessProductoImpuesto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoImpuesto ,this.jPanelParametrosReportesProductoImpuesto, this.jScrollPanelDatosProductoImpuesto,this.jPanelPaginacionProductoImpuesto, this.jScrollPanelDatosEdicionProductoImpuesto, this.jPanelAccionesProductoImpuesto,this.jPanelAccionesFormularioProductoImpuesto,this.jmenuBarProductoImpuesto,this.jmenuBarDetalleProductoImpuesto,this.jTtoolBarProductoImpuesto,this.jTtoolBarDetalleProductoImpuesto);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoImpuesto=this.jTabbedPaneBusquedasProductoImpuesto; 
		
		final JPanel jPanelParametrosReportesProductoImpuesto=this.jPanelParametrosReportesProductoImpuesto;
		//final JScrollPane jScrollPanelDatosProductoImpuesto=this.jScrollPanelDatosProductoImpuesto;
		final JTable jTableDatosProductoImpuesto=this.jTableDatosProductoImpuesto;		
		final JPanel jPanelPaginacionProductoImpuesto=this.jPanelPaginacionProductoImpuesto;
		//final JScrollPane jScrollPanelDatosEdicionProductoImpuesto=this.jScrollPanelDatosEdicionProductoImpuesto;
		final JPanel jPanelAccionesProductoImpuesto=this.jPanelAccionesProductoImpuesto;
		
		JPanel jPanelCamposAuxiliarProductoImpuesto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoImpuesto=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
			jPanelCamposAuxiliarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jPanelCamposProductoImpuesto;
			jPanelAccionesFormularioAuxiliarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jPanelAccionesFormularioProductoImpuesto;
		}
		
		final JPanel jPanelCamposProductoImpuesto=jPanelCamposAuxiliarProductoImpuesto;
		final JPanel jPanelAccionesFormularioProductoImpuesto=jPanelAccionesFormularioAuxiliarProductoImpuesto;
		
		
		final JMenuBar jmenuBarProductoImpuesto=this.jmenuBarProductoImpuesto;		
		final JToolBar jTtoolBarProductoImpuesto=this.jTtoolBarProductoImpuesto;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoImpuesto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoImpuesto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
			jmenuBarDetalleAuxiliarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jmenuBarDetalleProductoImpuesto;
			jTtoolBarDetalleAuxiliarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jTtoolBarDetalleProductoImpuesto;		
		}
		
		final JMenuBar jmenuBarDetalleProductoImpuesto=jmenuBarDetalleAuxiliarProductoImpuesto;
		final JToolBar jTtoolBarDetalleProductoImpuesto=jTtoolBarDetalleAuxiliarProductoImpuesto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoImpuesto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoImpuesto;
			processRunnable.jTableDatos=jTableDatosProductoImpuesto;
			processRunnable.jPanelCampos=jPanelCamposProductoImpuesto;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoImpuesto;
			processRunnable.jPanelAcciones=jPanelAccionesProductoImpuesto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoImpuesto;
			
			
			processRunnable.jmenuBar=jmenuBarProductoImpuesto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoImpuesto;
			processRunnable.jTtoolBar=jTtoolBarProductoImpuesto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoImpuesto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoImpuesto ,jPanelParametrosReportesProductoImpuesto, jTableDatosProductoImpuesto,/*jScrollPanelDatosProductoImpuesto,*/jPanelCamposProductoImpuesto,jPanelPaginacionProductoImpuesto, /*jScrollPanelDatosEdicionProductoImpuesto,*/ jPanelAccionesProductoImpuesto,jPanelAccionesFormularioProductoImpuesto,jmenuBarProductoImpuesto,jmenuBarDetalleProductoImpuesto,jTtoolBarProductoImpuesto,jTtoolBarDetalleProductoImpuesto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoImpuesto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoImpuesto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoImpuesto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoImpuesto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoImpuesto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoImpuesto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoImpuesto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoImpuesto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoImpuesto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productoimpuestoConstantesFunciones.getsFinalQueryProductoImpuesto();
		String  finalQueryPaginacionTodos=this.productoimpuestoConstantesFunciones.getsFinalQueryProductoImpuesto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoImpuestoConstantesFunciones.getArrayColumnasGlobalesNoProductoImpuesto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoImpuestoConstantesFunciones.getArrayColumnasGlobalesProductoImpuesto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoImpuestoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productoimpuestosEliminados= new ArrayList<ProductoImpuesto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoImpuesto();
		
				///*ProductoImpuestoSessionBean*/this.productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
			
			if(this.productoimpuestoSessionBean==null) {
				this.productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
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
					this.iNumeroPaginacion=ProductoImpuestoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoImpuestoConstantesFunciones.getClassesForeignKeysOfProductoImpuesto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productoimpuesto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productoimpuestosAux= new ArrayList<ProductoImpuesto>();
			
				
			productoimpuestoLogic.setDatosCliente(this.datosCliente);
			productoimpuestoLogic.setDatosDeep(this.datosDeep);
			productoimpuestoLogic.setIsConDeep(true);
			
			
			productoimpuestoLogic.getProductoImpuestoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productoimpuestoLogic.getTodosProductoImpuestos(finalQueryGlobal,pagination);
					
					//productoimpuestoLogic.getTodosProductoImpuestosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productoimpuestoLogic.getProductoImpuestos()==null|| productoimpuestoLogic.getProductoImpuestos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoimpuestosAux= new ArrayList<ProductoImpuesto>();
							productoimpuestosAux.addAll(productoimpuestoLogic.getProductoImpuestos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoimpuestosAux= new ArrayList<ProductoImpuesto>();
							productoimpuestosAux.addAll(productoimpuestos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoimpuestoLogic.getTodosProductoImpuestos(finalQueryGlobal+"",this.pagination);												
							
							//productoimpuestoLogic.getTodosProductoImpuestosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoImpuestos("Todos",productoimpuestoLogic.getProductoImpuestos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoimpuestoLogic.setProductoImpuestos(new ArrayList<ProductoImpuesto>());					
							productoimpuestoLogic.getProductoImpuestos().addAll(productoimpuestosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoimpuestos=new ArrayList<ProductoImpuesto>();
							productoimpuestos.addAll(productoimpuestosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoImpuesto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoImpuesto=this.idActual;
				
				} else if(this.idProductoImpuestoActual!=null && this.idProductoImpuestoActual!=0L) {
					idProductoImpuesto=idProductoImpuestoActual;
				}
				
					
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndicePorId(idProductoImpuesto);
				
				this.productoimpuestos=new ArrayList<ProductoImpuesto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productoimpuestoLogic.getEntity(idProductoImpuesto);
					
					//productoimpuestoLogic.getEntityWithConnection(idProductoImpuesto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoimpuestoLogic.setProductoImpuestos(new ArrayList<ProductoImpuesto>());
					productoimpuestoLogic.getProductoImpuestos().add(productoimpuestoLogic.getProductoImpuesto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoimpuestos=new ArrayList<ProductoImpuesto>();
					this.productoimpuestos.add(productoimpuesto);
				}
				
				if(productoimpuestoLogic.getProductoImpuesto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoimpuestoLogic.getProductoImpuestosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoimpuestoLogic.getProductoImpuestos()==null||productoimpuestoLogic.getProductoImpuestos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoimpuestos==null|| productoimpuestos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoimpuestosAux=new ArrayList<ProductoImpuesto>();
						productoimpuestosAux.addAll(productoimpuestoLogic.getProductoImpuestos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoimpuestosAux=new ArrayList<ProductoImpuesto>();
							productoimpuestosAux.addAll(productoimpuestos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoimpuestoLogic.getProductoImpuestosFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoImpuestos("FK_IdBodega",productoimpuestoLogic.getProductoImpuestos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoImpuestos("FK_IdBodega",productoimpuestos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoimpuestoLogic.setProductoImpuestos(new ArrayList<ProductoImpuesto>());
						productoimpuestoLogic.getProductoImpuestos().addAll(productoimpuestosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoimpuestos=new ArrayList<ProductoImpuesto>();
							productoimpuestos.addAll(productoimpuestosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoimpuestoLogic.getProductoImpuestosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoimpuestoLogic.getProductoImpuestos()==null||productoimpuestoLogic.getProductoImpuestos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoimpuestos==null|| productoimpuestos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoimpuestosAux=new ArrayList<ProductoImpuesto>();
						productoimpuestosAux.addAll(productoimpuestoLogic.getProductoImpuestos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoimpuestosAux=new ArrayList<ProductoImpuesto>();
							productoimpuestosAux.addAll(productoimpuestos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoimpuestoLogic.getProductoImpuestosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoImpuestos("FK_IdEmpresa",productoimpuestoLogic.getProductoImpuestos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoImpuestos("FK_IdEmpresa",productoimpuestos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoimpuestoLogic.setProductoImpuestos(new ArrayList<ProductoImpuesto>());
						productoimpuestoLogic.getProductoImpuestos().addAll(productoimpuestosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoimpuestos=new ArrayList<ProductoImpuesto>();
							productoimpuestos.addAll(productoimpuestosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdImpuestoInven")) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdImpuestoInven(id_impuesto_invenFK_IdImpuestoInven);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoimpuestoLogic.getProductoImpuestosFK_IdImpuestoInven(finalQueryGlobal,pagination,id_impuesto_invenFK_IdImpuestoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdImpuestoInven(id_impuesto_invenFK_IdImpuestoInven);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdImpuestoInven(id_impuesto_invenFK_IdImpuestoInven);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoimpuestoLogic.getProductoImpuestos()==null||productoimpuestoLogic.getProductoImpuestos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoimpuestos==null|| productoimpuestos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoimpuestosAux=new ArrayList<ProductoImpuesto>();
						productoimpuestosAux.addAll(productoimpuestoLogic.getProductoImpuestos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoimpuestosAux=new ArrayList<ProductoImpuesto>();
							productoimpuestosAux.addAll(productoimpuestos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoimpuestoLogic.getProductoImpuestosFK_IdImpuestoInven(finalQueryGlobal,pagination,id_impuesto_invenFK_IdImpuestoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdImpuestoInven(id_impuesto_invenFK_IdImpuestoInven);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdImpuestoInven(id_impuesto_invenFK_IdImpuestoInven);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoImpuestos("FK_IdImpuestoInven",productoimpuestoLogic.getProductoImpuestos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoImpuestos("FK_IdImpuestoInven",productoimpuestos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoimpuestoLogic.setProductoImpuestos(new ArrayList<ProductoImpuesto>());
						productoimpuestoLogic.getProductoImpuestos().addAll(productoimpuestosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoimpuestos=new ArrayList<ProductoImpuesto>();
							productoimpuestos.addAll(productoimpuestosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoimpuestoLogic.getProductoImpuestosFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoimpuestoLogic.getProductoImpuestos()==null||productoimpuestoLogic.getProductoImpuestos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoimpuestos==null|| productoimpuestos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoimpuestosAux=new ArrayList<ProductoImpuesto>();
						productoimpuestosAux.addAll(productoimpuestoLogic.getProductoImpuestos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoimpuestosAux=new ArrayList<ProductoImpuesto>();
							productoimpuestosAux.addAll(productoimpuestos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoimpuestoLogic.getProductoImpuestosFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoImpuestos("FK_IdProducto",productoimpuestoLogic.getProductoImpuestos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoImpuestos("FK_IdProducto",productoimpuestos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoimpuestoLogic.setProductoImpuestos(new ArrayList<ProductoImpuesto>());
						productoimpuestoLogic.getProductoImpuestos().addAll(productoimpuestosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoimpuestos=new ArrayList<ProductoImpuesto>();
							productoimpuestos.addAll(productoimpuestosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoimpuestoLogic.getProductoImpuestosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoimpuestoLogic.getProductoImpuestos()==null||productoimpuestoLogic.getProductoImpuestos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoimpuestos==null|| productoimpuestos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoimpuestosAux=new ArrayList<ProductoImpuesto>();
						productoimpuestosAux.addAll(productoimpuestoLogic.getProductoImpuestos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoimpuestosAux=new ArrayList<ProductoImpuesto>();
							productoimpuestosAux.addAll(productoimpuestos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoimpuestoLogic.getProductoImpuestosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoImpuestoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoImpuestos("FK_IdSucursal",productoimpuestoLogic.getProductoImpuestos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoImpuestos("FK_IdSucursal",productoimpuestos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoimpuestoLogic.setProductoImpuestos(new ArrayList<ProductoImpuesto>());
						productoimpuestoLogic.getProductoImpuestos().addAll(productoimpuestosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoimpuestos=new ArrayList<ProductoImpuesto>();
							productoimpuestos.addAll(productoimpuestosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoImpuesto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoImpuesto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoimpuestoLogic.getProductoImpuestos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoimpuestos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoimpuestoLogic.getProductoImpuestos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoimpuestos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoImpuesto productoimpuesto) {
		Boolean permite=true;
		
		if(this.productoimpuesto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoImpuestoConstantesFunciones.getOrderByListaProductoImpuesto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoImpuestoConstantesFunciones.getOrderByListaProductoImpuesto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoImpuesto productoimpuesto:productoimpuestoLogic.getProductoImpuestos()) {
				if(productoimpuesto.getsType().equals(Constantes2.S_TOTALES)) {
					productoimpuestoTotales=productoimpuesto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoImpuesto productoimpuesto:this.productoimpuestos) {
				if(productoimpuesto.getsType().equals(Constantes2.S_TOTALES)) {
					productoimpuestoTotales=productoimpuesto;
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
			this.productoimpuestoAux=new ProductoImpuesto();
			this.productoimpuestoAux.setsType(Constantes2.S_TOTALES);
			this.productoimpuestoAux.setIsNew(false);
			this.productoimpuestoAux.setIsChanged(false);
			this.productoimpuestoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoImpuestoConstantesFunciones.TotalizarValoresFilaProductoImpuesto(this.productoimpuestoLogic.getProductoImpuestos(),this.productoimpuestoAux);
				
				this.productoimpuestoLogic.getProductoImpuestos().add(this.productoimpuestoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoImpuestoConstantesFunciones.TotalizarValoresFilaProductoImpuesto(this.productoimpuestos,this.productoimpuestoAux);
				
				this.productoimpuestos.add(this.productoimpuestoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productoimpuestoTotales=new ProductoImpuesto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoimpuestoLogic.getProductoImpuestos().remove(productoimpuestoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoimpuestos.remove(productoimpuestoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productoimpuestoTotales=new ProductoImpuesto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoImpuesto productoimpuesto:productoimpuestoLogic.getProductoImpuestos()) {
				if(productoimpuesto.getsType().equals(Constantes2.S_TOTALES)) {
					productoimpuestoTotales=productoimpuesto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoImpuestoConstantesFunciones.TotalizarValoresFilaProductoImpuesto(this.productoimpuestoLogic.getProductoImpuestos(),productoimpuestoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoImpuesto productoimpuesto:this.productoimpuestos) {
				if(productoimpuesto.getsType().equals(Constantes2.S_TOTALES)) {
					productoimpuestoTotales=productoimpuesto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoImpuestoConstantesFunciones.TotalizarValoresFilaProductoImpuesto(this.productoimpuestos,productoimpuestoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoImpuestosFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoImpuestosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoImpuestosFK_IdImpuestoInven()throws Exception {
		try {
			sAccionBusqueda="FK_IdImpuestoInven";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoImpuestosFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoImpuestosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoImpuestosFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoimpuestoLogic.getProductoImpuestosFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoImpuestosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoimpuestoLogic.getProductoImpuestosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoImpuestosFK_IdImpuestoInven(String sFinalQuery,Long id_impuesto_inven)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoimpuestoLogic.getProductoImpuestosFK_IdImpuestoInven(sFinalQuery,this.pagination,id_impuesto_inven);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoImpuestosFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoimpuestoLogic.getProductoImpuestosFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoImpuestosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoimpuestoLogic.getProductoImpuestosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProductoImpuesto() {
		this.isPermisoTodoProductoImpuesto=false;
		this.isPermisoNuevoProductoImpuesto=false;
		this.isPermisoActualizarProductoImpuesto=false;
		this.isPermisoActualizarOriginalProductoImpuesto=false;
		this.isPermisoEliminarProductoImpuesto=false;
		this.isPermisoGuardarCambiosProductoImpuesto=false;
		this.isPermisoConsultaProductoImpuesto=false;
		this.isPermisoBusquedaProductoImpuesto=false;
		this.isPermisoReporteProductoImpuesto=false;		
		this.isPermisoOrdenProductoImpuesto=false;		
		this.isPermisoPaginacionMedioProductoImpuesto=false;		
		this.isPermisoPaginacionAltoProductoImpuesto=false;
		this.isPermisoPaginacionTodoProductoImpuesto=false;
		this.isPermisoCopiarProductoImpuesto=false;		
		this.isPermisoVerFormProductoImpuesto=false;		
		this.isPermisoDuplicarProductoImpuesto=false;		
		this.isPermisoOrdenProductoImpuesto=false;		
	}
	
	public void setPermisosUsuarioProductoImpuesto(Boolean isPermiso) {
		this.isPermisoTodoProductoImpuesto=isPermiso;
		this.isPermisoNuevoProductoImpuesto=isPermiso;
		this.isPermisoActualizarProductoImpuesto=isPermiso;
		this.isPermisoActualizarOriginalProductoImpuesto=isPermiso;
		this.isPermisoEliminarProductoImpuesto=isPermiso;
		this.isPermisoGuardarCambiosProductoImpuesto=isPermiso;
		this.isPermisoConsultaProductoImpuesto=isPermiso;
		this.isPermisoBusquedaProductoImpuesto=isPermiso;
		this.isPermisoReporteProductoImpuesto=isPermiso;
		this.isPermisoOrdenProductoImpuesto=isPermiso;		
		this.isPermisoPaginacionMedioProductoImpuesto=isPermiso;		
		this.isPermisoPaginacionAltoProductoImpuesto=isPermiso;		
		this.isPermisoPaginacionTodoProductoImpuesto=isPermiso;		
		this.isPermisoCopiarProductoImpuesto=isPermiso;		
		this.isPermisoVerFormProductoImpuesto=isPermiso;		
		this.isPermisoDuplicarProductoImpuesto=isPermiso;
		this.isPermisoOrdenProductoImpuesto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoImpuesto(Boolean isPermiso) {
		//this.isPermisoTodoProductoImpuesto=isPermiso;
		this.isPermisoNuevoProductoImpuesto=isPermiso;
		this.isPermisoActualizarProductoImpuesto=isPermiso;
		this.isPermisoActualizarOriginalProductoImpuesto=isPermiso;
		this.isPermisoEliminarProductoImpuesto=isPermiso;
		this.isPermisoGuardarCambiosProductoImpuesto=isPermiso;
		//this.isPermisoConsultaProductoImpuesto=isPermiso;
		//this.isPermisoBusquedaProductoImpuesto=isPermiso;
		//this.isPermisoReporteProductoImpuesto=isPermiso;
		//this.isPermisoOrdenProductoImpuesto=isPermiso;		
		//this.isPermisoPaginacionMedioProductoImpuesto=isPermiso;		
		//this.isPermisoPaginacionAltoProductoImpuesto=isPermiso;		
		//this.isPermisoPaginacionTodoProductoImpuesto=isPermiso;		
		//this.isPermisoCopiarProductoImpuesto=isPermiso;		
		//this.isPermisoDuplicarProductoImpuesto=isPermiso;
		//this.isPermisoOrdenProductoImpuesto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoImpuestoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoImpuestoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoImpuesto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoImpuestoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoImpuestoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoImpuestoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoImpuestoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoImpuesto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoImpuestoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoImpuestoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoImpuesto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoImpuesto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoImpuesto=this.isPermisoActualizarProductoImpuesto;
			this.isPermisoEliminarProductoImpuesto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoImpuesto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoImpuesto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoImpuesto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoImpuesto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoImpuesto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoImpuesto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoImpuesto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoImpuesto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoImpuesto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoImpuesto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoImpuesto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoImpuesto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoImpuesto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoImpuesto.setToolTipText(this.jTableDatosProductoImpuesto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoImpuesto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoImpuesto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoImpuestoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoImpuestoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoImpuesto() throws Exception {
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
	public void inicializarCombosForeignKeyProductoImpuestoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.impuestoinvensForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoImpuestoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoImpuestoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoImpuestoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyImpuestoInvenListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyImpuestoInvenListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.impuestoinvensForeignKey==null||this.impuestoinvensForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ImpuestoInvenConstantesFunciones.getArrayColumnasGlobalesImpuestoInven(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ImpuestoInvenConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ImpuestoInvenConstantesFunciones.SFINALQUERY;

				this.cargarCombosImpuestoInvensForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyProductoImpuestoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoImpuestoParameterReturnGeneral productoimpuestoReturnGeneral=new ProductoImpuestoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.productoimpuestoConstantesFunciones.cargarid_empresaProductoImpuesto)
					 || (this.esRecargarFks && this.productoimpuestoConstantesFunciones.cargarid_empresaProductoImpuesto)) {

					if(!this.productoimpuestoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+productoimpuestoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.productoimpuestoConstantesFunciones.cargarid_sucursalProductoImpuesto)
					 || (this.esRecargarFks && this.productoimpuestoConstantesFunciones.cargarid_sucursalProductoImpuesto)) {

					if(!this.productoimpuestoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+productoimpuestoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.productoimpuestoConstantesFunciones.cargarid_bodegaProductoImpuesto)
					 || (this.esRecargarFks && this.productoimpuestoConstantesFunciones.cargarid_bodegaProductoImpuesto)) {

					if(!this.productoimpuestoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+productoimpuestoSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.productoimpuestoConstantesFunciones.cargarid_productoProductoImpuesto)
					 || (this.esRecargarFks && this.productoimpuestoConstantesFunciones.cargarid_productoProductoImpuesto)) {

					if(!this.productoimpuestoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+productoimpuestoSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalImpuestoInven="";

				if(((this.impuestoinvensForeignKey==null||this.impuestoinvensForeignKey.size()<=0) && this.productoimpuestoConstantesFunciones.cargarid_impuesto_invenProductoImpuesto)
					 || (this.esRecargarFks && this.productoimpuestoConstantesFunciones.cargarid_impuesto_invenProductoImpuesto)) {

					if(!this.productoimpuestoSessionBean.getisBusquedaDesdeForeignKeySesionImpuestoInven()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ImpuestoInvenConstantesFunciones.getArrayColumnasGlobalesImpuestoInven(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalImpuestoInven=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ImpuestoInvenConstantesFunciones.TABLENAME);

						finalQueryGlobalImpuestoInven=Funciones.GetFinalQueryAppend(finalQueryGlobalImpuestoInven, "");
						finalQueryGlobalImpuestoInven+=ImpuestoInvenConstantesFunciones.SFINALQUERY;

						//this.cargarCombosImpuestoInvensForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalImpuestoInven=" WHERE " + ConstantesSql.ID + "="+productoimpuestoSessionBean.getlidImpuestoInvenActual();
					}
				} else {
					finalQueryGlobalImpuestoInven="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productoimpuestoReturnGeneral=productoimpuestoLogic.cargarCombosLoteForeignKeyProductoImpuesto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalImpuestoInven);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=productoimpuestoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=productoimpuestoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=productoimpuestoReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=productoimpuestoReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalImpuestoInven.equals("NONE")) {
				this.impuestoinvensForeignKey=productoimpuestoReturnGeneral.getimpuestoinvensForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoImpuesto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyImpuestoInven();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.productoimpuestoSessionBean==null) {
				this.productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
			}

			if(!this.productoimpuestoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.productoimpuestoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.productoimpuestoSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.productoimpuestoSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyImpuestoInven()throws Exception {
		try {

			if(!this.productoimpuestoSessionBean.getisBusquedaDesdeForeignKeySesionImpuestoInven()) {
				ImpuestoInven impuestoinven=new ImpuestoInven();
				ImpuestoInvenConstantesFunciones.setImpuestoInvenDescripcion(impuestoinven,Constantes.SMENSAJE_ESCOJA_OPCION);
				impuestoinven.setId(null);

				if(!ImpuestoInvenConstantesFunciones.ExisteEnLista(this.impuestoinvensForeignKey,impuestoinven,true)) {

					this.impuestoinvensForeignKey.add(0,impuestoinven);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProductoImpuesto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoImpuesto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProductoImpuesto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoImpuesto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoImpuesto(ProductoImpuesto productoimpuesto)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(productoimpuesto.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(productoimpuesto.getid_producto(),false,"Formulario");
			this.setActualImpuestoInvenForeignKey(productoimpuesto.getid_impuesto_inven(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoImpuesto(ProductoImpuesto productoimpuesto,String sTipoEvento)throws Exception {	
		try {
			
			

				if(productoimpuesto.getProducto()!=null && !sTipoEvento.equals("id_productoProductoImpuesto")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(productoimpuesto.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoImpuesto()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.productoimpuestoConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.productoimpuestoConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualImpuestoInvenForeignKey(this.productoimpuestoConstantesFunciones.getid_impuesto_inven(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoImpuesto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoImpuesto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoImpuesto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoImpuesto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoImpuesto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameImpuestoInvensForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoImpuesto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameImpuestoInvensForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoImpuesto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_empresaProductoImpuesto!=null && this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_empresaProductoImpuesto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_empresaProductoImpuesto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_sucursalProductoImpuesto!=null && this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_sucursalProductoImpuesto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_sucursalProductoImpuesto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_bodegaProductoImpuesto!=null && this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_bodegaProductoImpuesto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_bodegaProductoImpuesto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_productoProductoImpuesto!=null && this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_productoProductoImpuesto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_productoProductoImpuesto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_impuesto_invenProductoImpuesto!=null && this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_impuesto_invenProductoImpuesto.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_impuesto_invenProductoImpuesto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public ProductoImpuestoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoImpuestoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoImpuestoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productoimpuestoSessionBean=new ProductoImpuestoSessionBean(); 
		this.productoimpuestoConstantesFunciones=new ProductoImpuestoConstantesFunciones(); 
		this.productoimpuestoBean=new ProductoImpuesto();//(this.productoimpuestoConstantesFunciones); 		
		this.productoimpuestoReturnGeneral=new ProductoImpuestoParameterReturnGeneral(); 
		
		this.productoimpuestoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoimpuestoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoImpuestoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoImpuestoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoImpuestoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoImpuesto(true);
			
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
			
			this.productoimpuestoConstantesFunciones=new ProductoImpuestoConstantesFunciones(); 
			this.productoimpuestoBean=new ProductoImpuesto();//this.productoimpuestoConstantesFunciones); 			
			this.productoimpuestoReturnGeneral=new ProductoImpuestoParameterReturnGeneral(); 
		
			ProductoImpuestoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Impuesto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productoimpuesto=new ProductoImpuesto();
			this.productoimpuestos = new ArrayList<ProductoImpuesto>();
			this.productoimpuestosAux = new ArrayList<ProductoImpuesto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic=new ProductoImpuestoLogic();
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}
			
			//this.productoimpuestoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productoimpuestoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoImpuesto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoImpuesto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoImpuesto);	
					}
					
					if(this.jInternalFrameImportacionProductoImpuesto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoImpuesto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoImpuesto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoImpuesto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoImpuesto);
				this.jInternalFrameDetalleFormProductoImpuesto.setVisible(false);
				this.jInternalFrameDetalleFormProductoImpuesto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoImpuesto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoImpuesto);
					this.jInternalFrameReporteDinamicoProductoImpuesto.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoImpuesto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoImpuesto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoImpuesto);
					this.jInternalFrameImportacionProductoImpuesto.setVisible(false);
					this.jInternalFrameImportacionProductoImpuesto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoImpuesto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoImpuesto);
					this.jInternalFrameOrderByProductoImpuesto.setVisible(false);
					this.jInternalFrameOrderByProductoImpuesto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoImpuestoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoImpuestoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productoimpuestoReturnGeneral=new ProductoImpuestoParameterReturnGeneral();
			
			this.productoimpuestoParameterGeneral=new ProductoImpuestoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productoimpuestoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoImpuestoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoImpuestoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoimpuestoSessionBean.getEsGuardarRelacionado(),this.productoimpuestoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoImpuestoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoimpuestoSessionBean.getEsGuardarRelacionado(),this.productoimpuestoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoImpuesto=false;
			this.isVisibilidadCeldaDuplicarProductoImpuesto=true;
			this.isVisibilidadCeldaCopiarProductoImpuesto=true;
			this.isVisibilidadCeldaVerFormProductoImpuesto=true;
			this.isVisibilidadCeldaOrdenProductoImpuesto=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto=false;
			this.isVisibilidadCeldaModificarProductoImpuesto=false;
			this.isVisibilidadCeldaActualizarProductoImpuesto=false;
			this.isVisibilidadCeldaEliminarProductoImpuesto=false;
			this.isVisibilidadCeldaCancelarProductoImpuesto=false;
			this.isVisibilidadCeldaGuardarProductoImpuesto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoImpuesto=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdImpuestoInven=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoImpuesto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoImpuesto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoImpuesto(false);
			
			this.setPermisosUsuarioProductoImpuesto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado() 
				|| (this.productoimpuestoSessionBean.getEsGuardarRelacionado() && this.productoimpuestoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoImpuestoClasesRelacionadas();
			}
			
			if(this.productoimpuestoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoImpuestoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoImpuesto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoImpuesto();
			}
			
			if(!this.isPermisoBusquedaProductoImpuesto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoImpuesto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoImpuesto,this.isPermisoPaginacionMedioProductoImpuesto,this.isPermisoPaginacionTodoProductoImpuesto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoImpuestoConstantesFunciones.getTiposSeleccionarProductoImpuesto());
				
				this.tiposColumnasSelect=ProductoImpuestoConstantesFunciones.getTiposSeleccionarProductoImpuesto(true);
				
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
			//if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoImpuesto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProductoImpuesto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProductoImpuesto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoImpuesto() ;
			
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
			this.impuestoinvenLogic=new ImpuestoInvenLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				productoimpuestoImplementable= (ProductoImpuestoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoImpuestoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productoimpuestoImplementableHome= (ProductoImpuestoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoImpuestoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productoimpuestos= new ArrayList<ProductoImpuesto>();
			this.productoimpuestosEliminados= new ArrayList<ProductoImpuesto>();
						
			this.isEsNuevoProductoImpuesto=false;
			this.esParaAccionDesdeFormularioProductoImpuesto=false;
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
			this.impuestoinvensForeignKey=new ArrayList<ImpuestoInven>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoImpuesto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoImpuesto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoImpuestoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoImpuestoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoImpuesto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoImpuesto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoImpuesto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoImpuesto();
			}
			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoImpuesto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoImpuesto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoImpuesto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoImpuesto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoImpuesto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoImpuesto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoImpuesto")) {
				iIndex=this.jInternalFrameDetalleFormProductoImpuesto.jTabbedPaneRelacionesProductoImpuesto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoImpuesto.jTabbedPaneRelacionesProductoImpuesto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoImpuesto();	
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
	
	public void cargarCombosForeignKeyProductoImpuesto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoImpuesto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoImpuesto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoImpuestoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoImpuesto();
		
		this.cargarCombosFrameForeignKeyProductoImpuesto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoImpuesto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoImpuesto();
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

	public void cargarCombosForeignKeyImpuestoInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyImpuestoInvenListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyImpuestoInven();
				this.cargarCombosFrameImpuestoInvensForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaImpuestoInven(this.impuestoinvensForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProductoImpuestoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productoimpuestoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoImpuesto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			
			
			if(jTableDatosProductoImpuesto.getRowCount()>=1) {
				jTableDatosProductoImpuesto.removeRowSelectionInterval(0, jTableDatosProductoImpuesto.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoImpuesto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoImpuesto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoImpuesto(true);			
			//this.productoimpuesto=new ProductoImpuesto();
			//this.productoimpuesto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoImpuesto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoImpuesto() ;
			
			if(ProductoImpuestoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoImpuesto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productoimpuesto);	
			this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);				
			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			
			if(this.productoimpuestoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoImpuesto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoImpuestoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoImpuesto> productoimpuestosSeleccionados=new ArrayList<ProductoImpuesto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoImpuesto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoImpuesto.getSelectedRows().length;			
			}
			
			productoimpuestosSeleccionados=this.getProductoImpuestosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoImpuesto--;			
				//ProductoImpuesto productoimpuestoAux= new ProductoImpuesto();			
				//productoimpuestoAux.setId(this.iIdNuevoProductoImpuesto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoImpuesto productoimpuestoOrigen=new ProductoImpuesto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoImpuesto productoimpuestoOrigen : productoimpuestosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productoimpuestoOrigen =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoimpuestoOrigen =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoImpuesto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productoimpuesto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoImpuesto(productoimpuestoOrigen,this.productoimpuesto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoimpuestoLogic.getProductoImpuestos().add(this.productoimpuestoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoimpuestos.add(this.productoimpuestoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoImpuesto(false);
				
				this.jTableDatosProductoImpuesto.setRowSelectionInterval(this.getIndiceNuevoProductoImpuesto(), this.getIndiceNuevoProductoImpuesto());
				
				int iLastRow =  this.jTableDatosProductoImpuesto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoImpuesto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoImpuesto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoImpuesto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoImpuesto> productoimpuestosSeleccionados=new ArrayList<ProductoImpuesto>();									
		
			ProductoImpuesto productoimpuestoOrigen=new ProductoImpuesto();
			ProductoImpuesto productoimpuestoDestino=new ProductoImpuesto();
				
			productoimpuestosSeleccionados=this.getProductoImpuestosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoImpuesto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productoimpuestosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoImpuesto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoimpuestoOrigen =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoimpuestoOrigen =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoimpuestoDestino =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoimpuestoDestino =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productoimpuestoOrigen =productoimpuestosSeleccionados.get(0);
				productoimpuestoDestino =productoimpuestosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoImpuesto(productoimpuestoOrigen,productoimpuestoDestino,true,false);
				
				productoimpuestoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoimpuestoDestino,productoimpuestoLogic.getProductoImpuestos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoimpuestoDestino,productoimpuestos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoImpuesto(false);
				
				//this.jTableDatosProductoImpuesto.setRowSelectionInterval(this.getIndiceNuevoProductoImpuesto(), this.getIndiceNuevoProductoImpuesto());
				
				int iLastRow =  this.jTableDatosProductoImpuesto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoImpuesto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoImpuesto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoImpuesto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoImpuesto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoImpuesto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoImpuesto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoImpuesto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoImpuesto.setVisible(!isVisible);
			this.jPanelPaginacionProductoImpuesto.setVisible(!isVisible);
			this.jPanelAccionesProductoImpuesto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoImpuesto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoImpuesto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoImpuesto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoImpuesto();
			
			this.abrirFrameOrderByProductoImpuesto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoImpuesto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoImpuesto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoImpuesto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoImpuesto.isMaximum()) {
					this.jInternalFrameDetalleFormProductoImpuesto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoImpuesto.setSize(this.jInternalFrameDetalleFormProductoImpuesto.iWidthFormulario,this.jInternalFrameDetalleFormProductoImpuesto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoImpuesto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoImpuesto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoImpuesto.isMaximum()) {
						this.jInternalFrameDetalleFormProductoImpuesto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoImpuesto.jContentPaneDetalleProductoImpuesto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoImpuesto.jTabbedPaneRelacionesProductoImpuesto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoImpuesto.jContentPaneDetalleProductoImpuesto.getWidth(),ProductoImpuestoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoImpuesto.jTabbedPaneRelacionesProductoImpuesto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoImpuesto.jContentPaneDetalleProductoImpuesto.getWidth(),ProductoImpuestoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoImpuesto.jTabbedPaneRelacionesProductoImpuesto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoImpuesto.jContentPaneDetalleProductoImpuesto.getWidth(),ProductoImpuestoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoImpuesto.setVisible(true);
	        this.jInternalFrameDetalleFormProductoImpuesto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoImpuesto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoImpuesto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoImpuesto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoImpuesto,false,this);
				} else {
					this.jInternalFrameOrderByProductoImpuesto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoImpuesto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoImpuesto);
				this.jInternalFrameOrderByProductoImpuesto.setVisible(false);
				this.jInternalFrameOrderByProductoImpuesto.setSelected(false);
				
				this.jInternalFrameOrderByProductoImpuesto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoImpuesto"));
				
				this.inicializarActualizarBindingTablaOrderByProductoImpuesto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoImpuesto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoImpuesto==null) {
				
				this.jInternalFrameImportacionProductoImpuesto=new ImportacionJInternalFrame(ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoImpuesto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoImpuesto);
				this.jInternalFrameImportacionProductoImpuesto.setVisible(false);
				this.jInternalFrameImportacionProductoImpuesto.setSelected(false);


				this.jInternalFrameImportacionProductoImpuesto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoImpuesto"));
				this.jInternalFrameImportacionProductoImpuesto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoImpuesto"));
				this.jInternalFrameImportacionProductoImpuesto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoImpuesto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoImpuesto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoImpuesto==null) {
				this.jInternalFrameReporteDinamicoProductoImpuesto=new ReporteDinamicoJInternalFrame(ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoImpuesto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoImpuesto);
				this.jInternalFrameReporteDinamicoProductoImpuesto.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoImpuesto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoImpuesto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoImpuesto"));
				this.jInternalFrameReporteDinamicoProductoImpuesto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoImpuesto"));
				this.jInternalFrameReporteDinamicoProductoImpuesto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoImpuesto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoImpuesto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoImpuesto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoImpuesto);
			
	       	this.jInternalFrameDetalleFormProductoImpuesto.setVisible(false);
	        this.jInternalFrameDetalleFormProductoImpuesto.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoImpuesto.dispose();
			//this.jInternalFrameDetalleFormProductoImpuesto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoImpuesto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoImpuesto.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoImpuesto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoImpuesto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoImpuesto.setVisible(true);
	        this.jInternalFrameImportacionProductoImpuesto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoImpuesto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoImpuesto.setVisible(true);
	        this.jInternalFrameOrderByProductoImpuesto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoImpuesto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoImpuesto.setVisible(false);
	        this.jInternalFrameOrderByProductoImpuesto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoImpuesto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoImpuesto.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoImpuesto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoImpuesto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoImpuesto.setVisible(false);
	        this.jInternalFrameImportacionProductoImpuesto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoImpuesto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoImpuesto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoImpuesto(true);
			//this.isEsNuevoProductoImpuesto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoImpuesto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoImpuesto(false) ;
			
			if(productoimpuestoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoImpuestoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoImpuesto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoImpuesto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoImpuestoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoImpuesto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoImpuesto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoImpuesto(true);
			//this.isEsNuevoProductoImpuesto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productoimpuesto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoImpuesto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoImpuesto(false) ;
			
			if(ProductoImpuestoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoImpuesto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoImpuesto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.productoimpuestoConstantesFunciones.cargarid_productoProductoImpuesto) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoImpuesto(false,false);
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
		TableColumn tableColumnBodega=this.jTableDatosProductoImpuesto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoImpuesto,ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoImpuesto.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosProductoImpuesto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoImpuesto,ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoImpuesto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaImpuestoInven(List<ImpuestoInven> impuestoinvensForeignKey)throws Exception{
		TableColumn tableColumnImpuestoInven=this.jTableDatosProductoImpuesto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoImpuesto,ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN));
		TableCellEditor tableCellEditorImpuestoInven =tableColumnImpuestoInven.getCellEditor();

		ImpuestoInvenTableCell impuestoinvenTableCellFk=(ImpuestoInvenTableCell)tableCellEditorImpuestoInven;

		if(impuestoinvenTableCellFk!=null) {
			impuestoinvenTableCellFk.setimpuestoinvensForeignKey(impuestoinvensForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoImpuesto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//impuestoinvenTableCellFk.setRowActual(intSelectedRow);
			//impuestoinvenTableCellFk.setimpuestoinvensForeignKeyActual(impuestoinvensForeignKey);
		//}


		if(impuestoinvenTableCellFk!=null) {
			impuestoinvenTableCellFk.RecargarImpuestoInvensForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoImpuesto(false);
			
			//if(!this.isEsNuevoProductoImpuesto) {								
				int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoImpuesto(this.productoimpuesto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
				
			}
			
			if(this.permiteMantenimiento(this.productoimpuesto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoImpuesto=true;
					this.inicializarActualizarBindingTablaProductoImpuesto(false);
					this.isEsNuevoProductoImpuesto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoImpuesto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoImpuesto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoImpuesto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoImpuesto(false);
				
				this.habilitarDeshabilitarControlesProductoImpuesto(false);
			
												
				
				if(ProductoImpuestoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoImpuesto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoImpuestoActionPerformed(evt,productoimpuestoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoImpuesto(this.productoimpuesto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoImpuesto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productoimpuestoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productoimpuesto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoImpuesto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoImpuesto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				this.productoimpuesto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				this.productoimpuesto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productoimpuesto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoImpuestoModel) this.jTableDatosProductoImpuesto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoImpuesto=true;
				this.inicializarActualizarBindingTablaProductoImpuesto(false);
				this.isEsNuevoProductoImpuesto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoImpuesto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoImpuesto(false);
				
				this.habilitarDeshabilitarControlesProductoImpuesto(false);
				
				
				
				if(ProductoImpuestoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoImpuesto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoImpuesto.getRowCount()>=1) {
				jTableDatosProductoImpuesto.removeRowSelectionInterval(0, jTableDatosProductoImpuesto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoImpuesto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoImpuesto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoImpuesto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoImpuesto(false) ;
			
			this.isEsNuevoProductoImpuesto=false;
			
			if(ProductoImpuestoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoImpuesto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoImpuesto(false);
				
				//SI ES MANUAL
				if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoImpuesto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoImpuesto--;			
			//ProductoImpuesto productoimpuestoAux= new ProductoImpuesto();			
			//productoimpuestoAux.setId(this.iIdNuevoProductoImpuesto);
			
			if(this.jInternalFrameDetalleFormProductoImpuesto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoImpuesto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
			
			this.productoimpuesto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productoimpuestoLogic.getProductoImpuestos().add(this.productoimpuestoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productoimpuestos.add(this.productoimpuestoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoImpuesto(false);
			
			this.jTableDatosProductoImpuesto.setRowSelectionInterval(this.getIndiceNuevoProductoImpuesto(), this.getIndiceNuevoProductoImpuesto());
			
			int iLastRow =  this.jTableDatosProductoImpuesto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoImpuesto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoImpuesto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoImpuesto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoImpuesto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoImpuesto(false);
			
			//SI ES MANUAL
			if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoImpuesto();
			}
			
			//this.abrirFrameTreeProductoImpuesto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Producto ImpuestoS ?", "MANTENIMIENTO DE Producto Impuesto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoImpuesto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoImpuesto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productoimpuestoReturnGeneral=productoimpuestoLogic.procesarImportacionProductoImpuestosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productoimpuestoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoImpuestoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoImpuesto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoImpuesto.setFileImportacion(this.jInternalFrameImportacionProductoImpuesto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoImpuesto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoImpuesto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoImpuesto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoImpuesto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoImpuesto> productoimpuestosSeleccionados=new ArrayList<ProductoImpuesto>();		

		productoimpuestosSeleccionados=this.getProductoImpuestosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoImpuestoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoImpuestoBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoImpuestos("Todos",productoimpuestosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Impuesto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoImpuesto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoImpuesto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoImpuestoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ImpuestoInven_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ImpuestoInven_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ImpuestoInven_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ImpuestoInven_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoImpuestoConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProductoImpuesto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoImpuestoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN:
					sNombreCampoCategoria="id_impuesto_inven";
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoImpuestoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN:
					sNombreCampoCategoriaValor="id_impuesto_inven";
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoImpuesto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoImpuesto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoImpuestoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Impuesto Inven",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_impuesto_inven");
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoImpuesto> productoimpuestosSeleccionados=new ArrayList<ProductoImpuesto>();		
		
		productoimpuestosSeleccionados=this.getProductoImpuestosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoimpuesto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoImpuestos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoImpuesto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoImpuesto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoImpuestoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProductoImpuesto productoimpuesto:productoimpuestosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoimpuesto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProductoImpuesto productoimpuesto:productoimpuestosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoimpuesto.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProductoImpuesto productoimpuesto:productoimpuestosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoimpuesto.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProductoImpuesto productoimpuesto:productoimpuestosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoimpuesto.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN);
					iRow++;

					for(ProductoImpuesto productoimpuesto:productoimpuestosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoimpuesto.getimpuestoinven_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(ProductoImpuesto productoimpuesto:productoimpuestosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoimpuesto.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoImpuestoConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ProductoImpuesto productoimpuesto:productoimpuestosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoimpuesto.getvalor());
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
			//	this.getFilaCabeceraExportarExcelProductoImpuesto(row);				
			//	iRow++;
			//}				
			
			//for(ProductoImpuesto productoimpuestoAux:productoimpuestosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoImpuesto(productoimpuestoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Impuesto",JOptionPane.INFORMATION_MESSAGE);
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
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoImpuesto(false);
			
			//SI ES MANUAL
			if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoImpuesto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoImpuesto(false);
			
			//SI ES MANUAL
			if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoImpuesto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoImpuesto(false);
			
			//SI ES MANUAL
			if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoImpuesto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoImpuesto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoImpuesto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoImpuesto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoImpuesto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoImpuesto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoImpuesto.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoImpuesto.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoImpuesto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoImpuesto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoImpuesto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoImpuesto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoImpuesto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoImpuesto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoImpuesto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoImpuesto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoImpuesto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoImpuestoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoImpuesto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoImpuesto();
		
		this.inicializarActualizarBindingBotonesManualProductoImpuesto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoImpuesto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoImpuesto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoImpuesto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoImpuesto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoImpuesto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoImpuesto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoImpuesto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoImpuesto.jCheckBoxPostAccionNuevoProductoImpuesto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoImpuesto.jCheckBoxPostAccionSinCerrarProductoImpuesto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoImpuesto.jCheckBoxPostAccionSinMensajeProductoImpuesto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoImpuesto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoImpuesto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoImpuesto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
				this.jInternalFrameDetalleFormProductoImpuesto.jCheckBoxPostAccionNuevoProductoImpuesto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoImpuesto.jCheckBoxPostAccionSinCerrarProductoImpuesto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoImpuesto.jCheckBoxPostAccionSinMensajeProductoImpuesto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoImpuesto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoImpuesto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxTiposAccionesFormularioProductoImpuesto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoImpuesto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoImpuesto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoImpuesto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoImpuesto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoImpuesto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoImpuesto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoImpuesto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoImpuesto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoImpuesto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoImpuesto(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoImpuesto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoImpuesto() throws Exception {
		try	{
			if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoImpuesto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoImpuesto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxTiposAccionesFormularioProductoImpuesto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxTiposAccionesFormularioProductoImpuesto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoImpuesto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoImpuesto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoImpuesto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoImpuesto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoImpuesto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoImpuesto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoImpuesto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoImpuesto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoImpuesto.addItem(reporte);
			}
			
			
			if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoImpuesto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoImpuesto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoImpuesto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoImpuesto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoImpuesto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoImpuesto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxTiposAccionesFormularioProductoImpuesto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxTiposAccionesFormularioProductoImpuesto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoImpuesto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoImpuesto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoImpuesto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoImpuesto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoImpuesto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoImpuesto!=null) {
				this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoImpuesto!=null) {
				this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoImpuesto!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoImpuesto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoImpuesto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoImpuesto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoImpuesto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoImpuesto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoImpuesto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductoImpuestoConstantesFunciones.getTiposSeleccionarProductoImpuesto(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductoImpuestoConstantesFunciones.getTiposSeleccionarProductoImpuesto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductoImpuesto.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoImpuesto.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductoImpuestoConstantesFunciones.getTiposSeleccionarProductoImpuesto(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoImpuesto.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductoImpuesto.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoImpuesto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaProductoImpuesto.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaProductoImpuesto.getSelectedItem()).getId();}
		if(this.jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.getSelectedItem()!=null){this.id_impuesto_invenFK_IdImpuestoInven=((ImpuestoInven)this.jComboBoxid_impuesto_invenFK_IdImpuestoInvenProductoImpuesto.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoProductoImpuesto.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoProductoImpuesto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoImpuesto(Boolean esInicializar) throws Exception {				
		if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoImpuesto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoImpuesto() throws Exception {
		this.inicializarActualizarBindingTablaProductoImpuesto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoImpuesto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoImpuesto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoImpuesto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoImpuesto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoImpuestoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoImpuesto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoImpuesto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoImpuestoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoImpuestoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoImpuestoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoImpuestoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoImpuesto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoImpuesto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoImpuestoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoImpuesto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoImpuesto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productoimpuestoLogic.getProductoImpuestos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productoimpuestos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoImpuesto.setModel(new ProductoImpuestoModel(this.productoimpuestoLogic.getProductoImpuestos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoImpuesto.setModel(new ProductoImpuestoModel(this.productoimpuestos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoImpuesto!=null && this.jInternalFrameOrderByProductoImpuesto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoImpuesto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoImpuesto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoImpuesto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoImpuestoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO,productoimpuestoConstantesFunciones.resaltarSeleccionarProductoImpuesto,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoImpuestoConstantesFunciones.SCLASSWEBTITULO,productoimpuestoConstantesFunciones.resaltarSeleccionarProductoImpuesto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoImpuesto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoImpuesto,ProductoImpuestoConstantesFunciones.LABEL_ID));

		if(this.productoimpuestoConstantesFunciones.mostraridProductoImpuesto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoImpuestoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoimpuestoConstantesFunciones.resaltaridProductoImpuesto,this.productoimpuestoConstantesFunciones.activaridProductoImpuesto,iSizeTabla,this,true,"idProductoImpuesto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoimpuestoConstantesFunciones.resaltaridProductoImpuesto,this.productoimpuestoConstantesFunciones.activaridProductoImpuesto,this,true,"idProductoImpuesto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoImpuesto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoImpuesto,ProductoImpuestoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.productoimpuestoConstantesFunciones.mostrarid_empresaProductoImpuesto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoImpuestoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.productoimpuestoConstantesFunciones.resaltarid_empresaProductoImpuesto,this,this.productoimpuestoConstantesFunciones.activarid_empresaProductoImpuesto,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.productoimpuestoConstantesFunciones.resaltarid_empresaProductoImpuesto,this,this.productoimpuestoConstantesFunciones.activarid_empresaProductoImpuesto,false,"id_empresaProductoImpuesto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoImpuestoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoImpuesto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoImpuesto,ProductoImpuestoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.productoimpuestoConstantesFunciones.mostrarid_sucursalProductoImpuesto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoImpuestoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.productoimpuestoConstantesFunciones.resaltarid_sucursalProductoImpuesto,this,this.productoimpuestoConstantesFunciones.activarid_sucursalProductoImpuesto,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.productoimpuestoConstantesFunciones.resaltarid_sucursalProductoImpuesto,this,this.productoimpuestoConstantesFunciones.activarid_sucursalProductoImpuesto,false,"id_sucursalProductoImpuesto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoImpuestoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoImpuesto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoImpuesto,ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA));

		if(this.productoimpuestoConstantesFunciones.mostrarid_bodegaProductoImpuesto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.productoimpuestoConstantesFunciones.resaltarid_bodegaProductoImpuesto,this,this.productoimpuestoConstantesFunciones.activarid_bodegaProductoImpuesto,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.productoimpuestoConstantesFunciones.resaltarid_bodegaProductoImpuesto,this,this.productoimpuestoConstantesFunciones.activarid_bodegaProductoImpuesto,true,"id_bodegaProductoImpuesto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ProductoImpuestoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoImpuesto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoImpuesto,ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.productoimpuestoConstantesFunciones.mostrarid_productoProductoImpuesto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.productoimpuestoConstantesFunciones.resaltarid_productoProductoImpuesto,this,this.productoimpuestoConstantesFunciones.activarid_productoProductoImpuesto,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.productoimpuestoConstantesFunciones.resaltarid_productoProductoImpuesto,this,this.productoimpuestoConstantesFunciones.activarid_productoProductoImpuesto,true,"id_productoProductoImpuesto","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ProductoImpuestoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoImpuesto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoImpuesto,ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN));

		if(this.productoimpuestoConstantesFunciones.mostrarid_impuesto_invenProductoImpuesto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ImpuestoInvenTableCell(this.impuestoinvensForeignKey,this.productoimpuestoConstantesFunciones.resaltarid_impuesto_invenProductoImpuesto,this,this.productoimpuestoConstantesFunciones.activarid_impuesto_invenProductoImpuesto,iSizeTabla));
			tableColumn.setCellEditor(new ImpuestoInvenTableCell(this.impuestoinvensForeignKey,this.productoimpuestoConstantesFunciones.resaltarid_impuesto_invenProductoImpuesto,this,this.productoimpuestoConstantesFunciones.activarid_impuesto_invenProductoImpuesto,true,"id_impuesto_invenProductoImpuesto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoImpuestoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoImpuesto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoImpuesto,ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE));

		if(this.productoimpuestoConstantesFunciones.mostrarporcentajeProductoImpuesto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoimpuestoConstantesFunciones.resaltarporcentajeProductoImpuesto,this.productoimpuestoConstantesFunciones.activarporcentajeProductoImpuesto,iSizeTabla,this,true,"porcentajeProductoImpuesto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoimpuestoConstantesFunciones.resaltarporcentajeProductoImpuesto,this.productoimpuestoConstantesFunciones.activarporcentajeProductoImpuesto,this,true,"porcentajeProductoImpuesto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoImpuestoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoImpuesto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoImpuesto,ProductoImpuestoConstantesFunciones.LABEL_VALOR));

		if(this.productoimpuestoConstantesFunciones.mostrarvalorProductoImpuesto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoImpuestoConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoimpuestoConstantesFunciones.resaltarvalorProductoImpuesto,this.productoimpuestoConstantesFunciones.activarvalorProductoImpuesto,iSizeTabla,this,true,"valorProductoImpuesto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoimpuestoConstantesFunciones.resaltarvalorProductoImpuesto,this.productoimpuestoConstantesFunciones.activarvalorProductoImpuesto,this,true,"valorProductoImpuesto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoImpuestoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoimpuestoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoimpuestoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoImpuesto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoimpuestoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoimpuestoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoImpuesto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoImpuesto && this.isPermisoGuardarCambiosProductoImpuesto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productoimpuestoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productoimpuestoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoImpuesto.addColumn(tableColumn);
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
			
			this.jTableDatosProductoImpuesto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoImpuesto && this.isPermisoGuardarCambiosProductoImpuesto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoImpuesto && this.isPermisoGuardarCambiosProductoImpuesto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoImpuesto.moveColumn(this.jTableDatosProductoImpuesto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoImpuesto.moveColumn(this.jTableDatosProductoImpuesto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoImpuesto.moveColumn(this.jTableDatosProductoImpuesto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoImpuesto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoImpuesto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoImpuesto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoImpuesto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoImpuesto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoImpuestoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoImpuesto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoImpuesto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoImpuesto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productoimpuestoLogic.getProductoImpuestos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productoimpuestos.size()-1;
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
		//this.jTableDatosProductoImpuesto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoImpuesto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoImpuesto();
			
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
				
				//this.isEsNuevoProductoImpuesto=false;
					
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			
				if(this.productoimpuestoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoImpuesto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoImpuesto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoImpuesto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productoimpuesto.getsType().equals("DUPLICADO")
				   || this.productoimpuesto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoImpuesto=true;
				
				} else {
					this.isEsNuevoProductoImpuesto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
					if(this.productoimpuesto.getId()>=0 && !this.productoimpuesto.getIsNew()) {						
						this.isEsNuevoProductoImpuesto=false;
						
					} else {
						this.isEsNuevoProductoImpuesto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoImpuesto(esRelaciones);						
				
				this.seleccionarProductoImpuesto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productoimpuesto.getId()<0) {
					this.isEsNuevoProductoImpuesto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoImpuesto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoImpuesto(evt,rowIndex);
				}	
				
				if(this.productoimpuestoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoImpuesto: " + this.dDif); 
					}
				}								
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoImpuesto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productoimpuesto)) {
					if(this.productoimpuesto.getId()>0) {
						this.productoimpuesto.setIsDeleted(true);
						
						this.productoimpuestosEliminados.add(this.productoimpuesto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoimpuestoLogic.getProductoImpuestos().remove(this.productoimpuesto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoimpuestos.remove(this.productoimpuesto);				
					}
					
					
					((ProductoImpuestoModel) this.jTableDatosProductoImpuesto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoImpuesto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoImpuesto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoImpuesto) {
			
			if(this.jInternalFrameDetalleFormProductoImpuesto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoImpuesto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoImpuesto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoImpuesto(this.productoimpuesto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.productoimpuestoConstantesFunciones.cargarid_empresaProductoImpuesto || this.productoimpuestoConstantesFunciones.event_dependid_empresaProductoImpuesto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.productoimpuesto.getid_empresa());
									//this.inicializarActualizarBindingProductoImpuesto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(productoimpuesto.getEmpresa()!=null) {
							this.empresasForeignKey.add(productoimpuesto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.productoimpuesto.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.productoimpuestoConstantesFunciones.cargarid_sucursalProductoImpuesto || this.productoimpuestoConstantesFunciones.event_dependid_sucursalProductoImpuesto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.productoimpuesto.getid_sucursal());
									//this.inicializarActualizarBindingProductoImpuesto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(productoimpuesto.getSucursal()!=null) {
							this.sucursalsForeignKey.add(productoimpuesto.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.productoimpuesto.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.productoimpuestoConstantesFunciones.cargarid_bodegaProductoImpuesto || this.productoimpuestoConstantesFunciones.event_dependid_bodegaProductoImpuesto) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.productoimpuesto.getid_bodega());
									//this.inicializarActualizarBindingProductoImpuesto(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(productoimpuesto.getBodega()!=null) {
							this.bodegasForeignKey.add(productoimpuesto.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.productoimpuesto.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.productoimpuestoConstantesFunciones.cargarid_productoProductoImpuesto || this.productoimpuestoConstantesFunciones.event_dependid_productoProductoImpuesto) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.productoimpuesto.getid_producto());
									//this.inicializarActualizarBindingProductoImpuesto(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(productoimpuesto.getProducto()!=null) {
							this.productosForeignKey.add(productoimpuesto.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.productoimpuesto.getid_producto(),false,"Formulario");

					//ImpuestoInven
					if(!this.productoimpuestoConstantesFunciones.cargarid_impuesto_invenProductoImpuesto || this.productoimpuestoConstantesFunciones.event_dependid_impuesto_invenProductoImpuesto) {
						//this.cargarCombosImpuestoInvensForeignKeyLista(" where id="+this.productoimpuesto.getid_impuesto_inven());
									//this.inicializarActualizarBindingProductoImpuesto(false,false);
						this.impuestoinvensForeignKey=new ArrayList<ImpuestoInven>();

						if(productoimpuesto.getImpuestoInven()!=null) {
							this.impuestoinvensForeignKey.add(productoimpuesto.getImpuestoInven());
						}

						this.addItemDefectoCombosForeignKeyImpuestoInven();
						this.cargarCombosFrameImpuestoInvensForeignKey("Todos");
					}
					this.setActualImpuestoInvenForeignKey(this.productoimpuesto.getid_impuesto_inven(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoImpuesto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoImpuesto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoImpuesto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoImpuesto(ProductoImpuesto productoimpuesto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoImpuesto(productoimpuesto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoImpuesto(ProductoImpuesto productoimpuesto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoImpuesto(productoimpuesto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoImpuesto(productoimpuesto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoImpuesto(productoimpuesto);
	}
	
	public void setVariablesObjetoActualToFormularioProductoImpuesto(ProductoImpuesto productoimpuesto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoImpuesto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoImpuesto.jLabelidProductoImpuesto.setText(productoimpuesto.getId().toString());
			this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldporcentajeProductoImpuesto.setText(productoimpuesto.getporcentaje().toString());
			this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldvalorProductoImpuesto.setText(productoimpuesto.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoImpuesto productoimpuestoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productoimpuestoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoImpuesto productoimpuestoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productoimpuestoLocal=this.productoimpuesto;
			} else {
				productoimpuestoLocal=this.productoimpuestoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productoimpuestoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoImpuesto(productoimpuestoLocal,true);
					
					if(productoimpuestoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productoimpuestoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productoimpuestoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoImpuesto(ProductoImpuesto productoimpuesto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoImpuesto(productoimpuesto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(productoimpuesto);
	}
	
	public void setVariablesFormularioToObjetoActualProductoImpuesto(ProductoImpuesto productoimpuesto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoImpuesto(productoimpuesto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoImpuesto(ProductoImpuesto productoimpuesto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoImpuesto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoImpuesto.jLabelidProductoImpuesto.getText()==null || this.jInternalFrameDetalleFormProductoImpuesto.jLabelidProductoImpuesto.getText()=="" || this.jInternalFrameDetalleFormProductoImpuesto.jLabelidProductoImpuesto.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoImpuesto.jLabelidProductoImpuesto.setText("0");
			}

			if(conColumnasBase) {productoimpuesto.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoImpuesto.jLabelidProductoImpuesto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoImpuestoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoImpuesto.jLabelIdProductoImpuesto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoimpuesto.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldporcentajeProductoImpuesto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoImpuesto.jLabelporcentajeProductoImpuesto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoimpuesto.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldvalorProductoImpuesto.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoImpuestoConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoImpuesto.jLabelvalorProductoImpuesto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoImpuesto(ProductoImpuesto productoimpuestoBean,ProductoImpuesto productoimpuesto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productoimpuestoBean.getid_bodega()!=null && !productoimpuestoBean.getid_bodega().equals(-1L))) {productoimpuesto.setid_bodega(productoimpuestoBean.getid_bodega());}
			if(conDefault || (!conDefault && productoimpuestoBean.getid_producto()!=null && !productoimpuestoBean.getid_producto().equals(-1L))) {productoimpuesto.setid_producto(productoimpuestoBean.getid_producto());}
			if(conDefault || (!conDefault && productoimpuestoBean.getid_impuesto_inven()!=null && !productoimpuestoBean.getid_impuesto_inven().equals(-1L))) {productoimpuesto.setid_impuesto_inven(productoimpuestoBean.getid_impuesto_inven());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoImpuesto(ProductoImpuesto productoimpuestoOrigen,ProductoImpuesto productoimpuesto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoimpuestoOrigen.getId()!=null && !productoimpuestoOrigen.getId().equals(0L))) {productoimpuesto.setId(productoimpuestoOrigen.getId());}}
			if(conDefault || (!conDefault && productoimpuestoOrigen.getid_bodega()!=null && !productoimpuestoOrigen.getid_bodega().equals(-1L))) {productoimpuesto.setid_bodega(productoimpuestoOrigen.getid_bodega());}
			if(conDefault || (!conDefault && productoimpuestoOrigen.getid_producto()!=null && !productoimpuestoOrigen.getid_producto().equals(-1L))) {productoimpuesto.setid_producto(productoimpuestoOrigen.getid_producto());}
			if(conDefault || (!conDefault && productoimpuestoOrigen.getid_impuesto_inven()!=null && !productoimpuestoOrigen.getid_impuesto_inven().equals(-1L))) {productoimpuesto.setid_impuesto_inven(productoimpuestoOrigen.getid_impuesto_inven());}
			if(conDefault || (!conDefault && productoimpuestoOrigen.getporcentaje()!=null && !productoimpuestoOrigen.getporcentaje().equals(0.0))) {productoimpuesto.setporcentaje(productoimpuestoOrigen.getporcentaje());}
			if(conDefault || (!conDefault && productoimpuestoOrigen.getvalor()!=null && !productoimpuestoOrigen.getvalor().equals(0.0))) {productoimpuesto.setvalor(productoimpuestoOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoImpuesto(ProductoImpuesto productoimpuesto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoImpuesto.jLabelidProductoImpuesto.setText(productoimpuesto.getId().toString());
			this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldporcentajeProductoImpuesto.setText(productoimpuesto.getporcentaje().toString());
			this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldvalorProductoImpuesto.setText(productoimpuesto.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoImpuesto(ProductoImpuestoBean productoimpuestoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoImpuesto.jLabelidProductoImpuesto.setText(productoimpuestoBean.getId().toString());
			this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldporcentajeProductoImpuesto.setText(productoimpuestoBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldvalorProductoImpuesto.setText(productoimpuestoBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoImpuesto(ProductoImpuestoParameterReturnGeneral productoimpuestoReturnGeneral,ProductoImpuestoBean productoimpuestoBean,Boolean conDefault) throws Exception { 
		try {
			ProductoImpuesto productoimpuestoLocal=new ProductoImpuesto();
			
			productoimpuestoLocal=productoimpuestoReturnGeneral.getProductoImpuesto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoimpuestoLocal.getId()!=null && !productoimpuestoLocal.getId().equals(0L))) {productoimpuestoBean.setId(productoimpuestoLocal.getId());}}
			if(conDefault || (!conDefault && productoimpuestoLocal.getid_bodega()!=null && !productoimpuestoLocal.getid_bodega().equals(-1L))) {productoimpuestoBean.setid_bodega(productoimpuestoLocal.getid_bodega());}
			if(conDefault || (!conDefault && productoimpuestoLocal.getid_producto()!=null && !productoimpuestoLocal.getid_producto().equals(-1L))) {productoimpuestoBean.setid_producto(productoimpuestoLocal.getid_producto());}
			if(conDefault || (!conDefault && productoimpuestoLocal.getid_impuesto_inven()!=null && !productoimpuestoLocal.getid_impuesto_inven().equals(-1L))) {productoimpuestoBean.setid_impuesto_inven(productoimpuestoLocal.getid_impuesto_inven());}
			if(conDefault || (!conDefault && productoimpuestoLocal.getporcentaje()!=null && !productoimpuestoLocal.getporcentaje().equals(0.0))) {productoimpuestoBean.setporcentaje(productoimpuestoLocal.getporcentaje());}
			if(conDefault || (!conDefault && productoimpuestoLocal.getvalor()!=null && !productoimpuestoLocal.getvalor().equals(0.0))) {productoimpuestoBean.setvalor(productoimpuestoLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoImpuestoGenerico(Long idProductoImpuestoSeleccionado,JComboBox jComboBoxProductoImpuesto,List<ProductoImpuesto> productoimpuestosLocal)throws Exception {
		try {
			ProductoImpuesto  productoimpuestoTemp=null;

			for(ProductoImpuesto productoimpuestoAux:productoimpuestosLocal) {
				if(productoimpuestoAux.getId()!=null && productoimpuestoAux.getId().equals(idProductoImpuestoSeleccionado)) {
					productoimpuestoTemp=productoimpuestoAux;
					break;
				}
			}

			jComboBoxProductoImpuesto.setSelectedItem(productoimpuestoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoImpuestoGenerico(JComboBox jComboBoxProductoImpuesto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoImpuesto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoImpuesto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoImpuesto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoImpuesto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoImpuesto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoImpuesto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoimpuesto=(ProductoImpuesto) productoimpuestoLogic.getProductoImpuestos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoimpuesto =(ProductoImpuesto) productoimpuestos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!productoimpuesto.getIsNew() && !productoimpuesto.getIsChanged() && !productoimpuesto.getIsDeleted()) {
				sDescripcion=productoimpuesto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=productoimpuesto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!productoimpuesto.getIsNew() && !productoimpuesto.getIsChanged() && !productoimpuesto.getIsDeleted()) {
				sDescripcion=productoimpuesto.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=productoimpuesto.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!productoimpuesto.getIsNew() && !productoimpuesto.getIsChanged() && !productoimpuesto.getIsDeleted()) {
				sDescripcion=productoimpuesto.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=productoimpuesto.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!productoimpuesto.getIsNew() && !productoimpuesto.getIsChanged() && !productoimpuesto.getIsDeleted()) {
				sDescripcion=productoimpuesto.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=productoimpuesto.getproducto_descripcion();
			}
		}

		if(sTipo.equals("ImpuestoInven")) {
			//sDescripcion=this.getActualImpuestoInvenForeignKeyDescripcion((Long)value);
			if(!productoimpuesto.getIsNew() && !productoimpuesto.getIsChanged() && !productoimpuesto.getIsDeleted()) {
				sDescripcion=productoimpuesto.getimpuestoinven_descripcion();
			} else {
				//sDescripcion=this.getActualImpuestoInvenForeignKeyDescripcion((Long)value);
				sDescripcion=productoimpuesto.getimpuestoinven_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoImpuesto productoimpuestoRow=new ProductoImpuesto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoimpuestoRow=(ProductoImpuesto) productoimpuestoLogic.getProductoImpuestos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoimpuestoRow=(ProductoImpuesto) productoimpuestos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoImpuesto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoImpuesto.setVisible((this.isVisibilidadCeldaNuevoProductoImpuesto && this.isPermisoNuevoProductoImpuesto));			
			this.jButtonDuplicarProductoImpuesto.setVisible((this.isVisibilidadCeldaDuplicarProductoImpuesto && this.isPermisoDuplicarProductoImpuesto));			
			this.jButtonCopiarProductoImpuesto.setVisible((this.isVisibilidadCeldaCopiarProductoImpuesto && this.isPermisoCopiarProductoImpuesto));
			this.jButtonVerFormProductoImpuesto.setVisible((this.isVisibilidadCeldaVerFormProductoImpuesto && this.isPermisoVerFormProductoImpuesto));
			
			this.jButtonAbrirOrderByProductoImpuesto.setVisible((this.isVisibilidadCeldaOrdenProductoImpuesto && this.isPermisoOrdenProductoImpuesto));			
			
			this.jButtonNuevoRelacionesProductoImpuesto.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto && this.isPermisoNuevoProductoImpuesto));			
			this.jButtonNuevoGuardarCambiosProductoImpuesto.setVisible((this.isVisibilidadCeldaNuevoProductoImpuesto && this.isPermisoNuevoProductoImpuesto && this.isPermisoGuardarCambiosProductoImpuesto));
			
			if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonModificarProductoImpuesto.setVisible((this.isVisibilidadCeldaModificarProductoImpuesto && this.isPermisoActualizarProductoImpuesto));	
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonActualizarProductoImpuesto.setVisible((this.isVisibilidadCeldaActualizarProductoImpuesto && this.isPermisoActualizarProductoImpuesto));	
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonEliminarProductoImpuesto.setVisible((this.isVisibilidadCeldaEliminarProductoImpuesto && this.isPermisoEliminarProductoImpuesto));
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonCancelarProductoImpuesto.setVisible(this.isVisibilidadCeldaCancelarProductoImpuesto);							
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonGuardarCambiosProductoImpuesto.setVisible((this.isVisibilidadCeldaGuardarProductoImpuesto && this.isPermisoGuardarCambiosProductoImpuesto));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoImpuesto.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoImpuesto && this.isPermisoGuardarCambiosProductoImpuesto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoImpuesto.setVisible((this.isVisibilidadCeldaNuevoProductoImpuesto && this.isPermisoNuevoProductoImpuesto));						
			this.jButtonDuplicarToolBarProductoImpuesto.setVisible((this.isVisibilidadCeldaDuplicarProductoImpuesto && this.isPermisoDuplicarProductoImpuesto));						
			this.jButtonCopiarToolBarProductoImpuesto.setVisible((this.isVisibilidadCeldaCopiarProductoImpuesto && this.isPermisoCopiarProductoImpuesto));			
			this.jButtonVerFormToolBarProductoImpuesto.setVisible((this.isVisibilidadCeldaVerFormProductoImpuesto && this.isPermisoVerFormProductoImpuesto));			
			this.jButtonAbrirOrderByToolBarProductoImpuesto.setVisible((this.isVisibilidadCeldaOrdenProductoImpuesto && this.isPermisoOrdenProductoImpuesto));
			this.jButtonNuevoRelacionesToolBarProductoImpuesto.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto && this.isPermisoNuevoProductoImpuesto));			
			this.jButtonNuevoGuardarCambiosToolBarProductoImpuesto.setVisible((this.isVisibilidadCeldaNuevoProductoImpuesto && this.isPermisoNuevoProductoImpuesto && this.isPermisoGuardarCambiosProductoImpuesto));			
			
			if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonModificarToolBarProductoImpuesto.setVisible((this.isVisibilidadCeldaModificarProductoImpuesto && this.isPermisoActualizarProductoImpuesto));	
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonActualizarToolBarProductoImpuesto.setVisible((this.isVisibilidadCeldaActualizarProductoImpuesto  && this.isPermisoActualizarProductoImpuesto));	
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonEliminarToolBarProductoImpuesto.setVisible((this.isVisibilidadCeldaEliminarProductoImpuesto && this.isPermisoEliminarProductoImpuesto));
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonCancelarToolBarProductoImpuesto.setVisible(this.isVisibilidadCeldaCancelarProductoImpuesto);				
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonGuardarCambiosToolBarProductoImpuesto.setVisible((this.isVisibilidadCeldaGuardarProductoImpuesto && this.isPermisoGuardarCambiosProductoImpuesto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoImpuesto.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoImpuesto && this.isPermisoGuardarCambiosProductoImpuesto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoImpuesto.setVisible((this.isVisibilidadCeldaNuevoProductoImpuesto && this.isPermisoNuevoProductoImpuesto));			
			this.jMenuItemDuplicarProductoImpuesto.setVisible((this.isVisibilidadCeldaDuplicarProductoImpuesto && this.isPermisoDuplicarProductoImpuesto));			
			this.jMenuItemCopiarProductoImpuesto.setVisible((this.isVisibilidadCeldaCopiarProductoImpuesto && this.isPermisoCopiarProductoImpuesto));			
			this.jMenuItemVerFormProductoImpuesto.setVisible((this.isVisibilidadCeldaVerFormProductoImpuesto && this.isPermisoVerFormProductoImpuesto));			
			this.jMenuItemAbrirOrderByProductoImpuesto.setVisible((this.isVisibilidadCeldaOrdenProductoImpuesto && this.isPermisoOrdenProductoImpuesto));			
			//this.jMenuItemMostrarOcultarProductoImpuesto.setVisible((this.isVisibilidadCeldaOrdenProductoImpuesto && this.isPermisoOrdenProductoImpuesto));
			this.jMenuItemDetalleAbrirOrderByProductoImpuesto.setVisible((this.isVisibilidadCeldaOrdenProductoImpuesto && this.isPermisoOrdenProductoImpuesto));			
			//this.jMenuItemDetalleMostrarOcultarProductoImpuesto.setVisible((this.isVisibilidadCeldaOrdenProductoImpuesto && this.isPermisoOrdenProductoImpuesto));			
			this.jMenuItemNuevoRelacionesProductoImpuesto.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto && this.isPermisoNuevoProductoImpuesto));			
			this.jMenuItemNuevoGuardarCambiosProductoImpuesto.setVisible((this.isVisibilidadCeldaNuevoProductoImpuesto && this.isPermisoNuevoProductoImpuesto && this.isPermisoGuardarCambiosProductoImpuesto));									
			
			if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
			this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemModificarProductoImpuesto.setVisible((this.isVisibilidadCeldaModificarProductoImpuesto && this.isPermisoActualizarProductoImpuesto));	
			this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemActualizarProductoImpuesto.setVisible((this.isVisibilidadCeldaActualizarProductoImpuesto && this.isPermisoActualizarProductoImpuesto));	
			this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemEliminarProductoImpuesto.setVisible((this.isVisibilidadCeldaEliminarProductoImpuesto && this.isPermisoEliminarProductoImpuesto));
			this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemCancelarProductoImpuesto.setVisible(this.isVisibilidadCeldaCancelarProductoImpuesto);				
			}
			
			this.jMenuItemGuardarCambiosProductoImpuesto.setVisible((this.isVisibilidadCeldaGuardarProductoImpuesto && this.isPermisoGuardarCambiosProductoImpuesto));						
			this.jMenuItemGuardarCambiosTablaProductoImpuesto.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoImpuesto && this.isPermisoGuardarCambiosProductoImpuesto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoImpuesto=this.jButtonNuevoProductoImpuesto.isVisible();
			this.isVisibilidadCeldaDuplicarProductoImpuesto=this.jButtonDuplicarProductoImpuesto.isVisible();
			this.isVisibilidadCeldaCopiarProductoImpuesto=this.jButtonCopiarProductoImpuesto.isVisible();
			this.isVisibilidadCeldaVerFormProductoImpuesto=this.jButtonVerFormProductoImpuesto.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoImpuesto=this.jButtonAbrirOrderByProductoImpuesto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto=this.jButtonNuevoRelacionesProductoImpuesto.isVisible();
			this.isVisibilidadCeldaModificarProductoImpuesto=this.jButtonModificarProductoImpuesto.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
			this.isVisibilidadCeldaActualizarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jButtonActualizarProductoImpuesto.isVisible();
			this.isVisibilidadCeldaEliminarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jButtonEliminarProductoImpuesto.isVisible();
			this.isVisibilidadCeldaCancelarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jButtonCancelarProductoImpuesto.isVisible();
			this.isVisibilidadCeldaGuardarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jButtonGuardarCambiosProductoImpuesto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoImpuesto=this.jButtonGuardarCambiosTablaProductoImpuesto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoImpuesto=this.jButtonNuevoToolBarProductoImpuesto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto=this.jButtonNuevoRelacionesToolBarProductoImpuesto.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
			this.isVisibilidadCeldaModificarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jButtonModificarToolBarProductoImpuesto.isVisible();
			this.isVisibilidadCeldaActualizarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jButtonActualizarToolBarProductoImpuesto.isVisible();
			this.isVisibilidadCeldaEliminarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jButtonEliminarToolBarProductoImpuesto.isVisible();
			this.isVisibilidadCeldaCancelarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jButtonCancelarToolBarProductoImpuesto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoImpuesto=this.jButtonGuardarCambiosToolBarProductoImpuesto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoImpuesto=this.jButtonGuardarCambiosTablaToolBarProductoImpuesto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoImpuesto=this.jMenuItemNuevoProductoImpuesto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto=this.jMenuItemNuevoRelacionesProductoImpuesto.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
			this.isVisibilidadCeldaModificarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemModificarProductoImpuesto.isVisible();
			this.isVisibilidadCeldaActualizarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemActualizarProductoImpuesto.isVisible();
			this.isVisibilidadCeldaEliminarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemEliminarProductoImpuesto.isVisible();
			this.isVisibilidadCeldaCancelarProductoImpuesto=this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemCancelarProductoImpuesto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoImpuesto=this.jMenuItemGuardarCambiosProductoImpuesto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoImpuesto=this.jMenuItemGuardarCambiosTablaProductoImpuesto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoImpuesto(Boolean esInicializar) {
		if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productoimpuestoSessionBean.getConGuardarRelaciones()) {
				//if(this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoImpuesto();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoImpuesto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoImpuesto() {
		this.jButtonNuevoProductoImpuesto.setVisible(this.isPermisoNuevoProductoImpuesto);			
		this.jButtonDuplicarProductoImpuesto.setVisible(this.isPermisoDuplicarProductoImpuesto);			
		this.jButtonCopiarProductoImpuesto.setVisible(this.isPermisoCopiarProductoImpuesto);			
		this.jButtonVerFormProductoImpuesto.setVisible(this.isPermisoVerFormProductoImpuesto);			
		
		this.jButtonAbrirOrderByProductoImpuesto.setVisible(this.isPermisoOrdenProductoImpuesto);					
		
		this.jButtonNuevoRelacionesProductoImpuesto.setVisible(this.isPermisoNuevoProductoImpuesto);			
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonModificarProductoImpuesto.setVisible(this.isPermisoActualizarProductoImpuesto);	
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonActualizarProductoImpuesto.setVisible(this.isPermisoActualizarProductoImpuesto);	
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonEliminarProductoImpuesto.setVisible(this.isPermisoEliminarProductoImpuesto);
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonCancelarProductoImpuesto.setVisible(this.isVisibilidadCeldaCancelarProductoImpuesto);						
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonGuardarCambiosProductoImpuesto.setVisible(this.isPermisoGuardarCambiosProductoImpuesto);							
		}
		
		this.jButtonGuardarCambiosTablaProductoImpuesto.setVisible(this.isPermisoActualizarProductoImpuesto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoImpuesto() {
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonModificarProductoImpuesto.setVisible(this.isPermisoActualizarProductoImpuesto);	
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonActualizarProductoImpuesto.setVisible(this.isPermisoActualizarProductoImpuesto);	
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonEliminarProductoImpuesto.setVisible(this.isPermisoEliminarProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonCancelarProductoImpuesto.setVisible(this.isVisibilidadCeldaCancelarProductoImpuesto);							
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonGuardarCambiosProductoImpuesto.setVisible((this.isVisibilidadCeldaGuardarProductoImpuesto && this.isPermisoGuardarCambiosProductoImpuesto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoImpuesto() {
		if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoImpuesto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoImpuesto() {
	}
	
	public void jTableDatosProductoImpuestoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoImpuesto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoImpuestoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.getproductoimpuesto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoimpuesto==null) {
						this.productoimpuesto = new ProductoImpuesto();
					}

					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.productoimpuesto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
				}

				if(this.productoimpuesto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productoimpuesto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoImpuesto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProductoImpuestoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProductoImpuesto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoImpuesto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoImpuesto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoImpuesto(this.getproductoimpuesto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.productoimpuestoLogic.getConnexion());

				if(this.productoimpuesto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.productoimpuesto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoImpuesto=(TitledBorder)this.jScrollPanelDatosProductoImpuesto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProductoImpuesto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProductoImpuestoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.getproductoimpuesto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoimpuesto==null) {
						this.productoimpuesto = new ProductoImpuesto();
					}

					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.productoimpuesto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
				}

				if(this.productoimpuesto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.productoimpuesto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoImpuesto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProductoImpuestoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProductoImpuesto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoImpuesto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoImpuesto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoImpuesto(this.getproductoimpuesto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.productoimpuestoLogic.getConnexion());

				if(this.productoimpuesto.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.productoimpuesto.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoImpuesto=(TitledBorder)this.jScrollPanelDatosProductoImpuesto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProductoImpuesto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProductoImpuestoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.getproductoimpuesto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoimpuesto==null) {
						this.productoimpuesto = new ProductoImpuesto();
					}

					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.productoimpuesto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
				}

				if(this.productoimpuesto.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.productoimpuesto.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoImpuesto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProductoImpuestoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProductoImpuesto(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoImpuesto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoImpuesto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoImpuesto(this.getproductoimpuesto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.productoimpuestoLogic.getConnexion());

				if(this.productoimpuesto.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.productoimpuesto.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoImpuesto=(TitledBorder)this.jScrollPanelDatosProductoImpuesto.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProductoImpuesto.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProductoImpuestoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.getproductoimpuesto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoimpuesto==null) {
						this.productoimpuesto = new ProductoImpuesto();
					}

					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.productoimpuesto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
				}

				if(this.productoimpuesto.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.productoimpuesto.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoImpuesto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProductoImpuestoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderProductoImpuesto=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosProductoImpuesto.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoImpuesto=(TitledBorder)this.jScrollPanelDatosProductoImpuesto.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoImpuesto.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoProductoImpuestoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProductoImpuesto(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoImpuesto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoImpuesto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoImpuesto(this.getproductoimpuesto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.productoimpuestoLogic.getConnexion());

				if(this.productoimpuesto.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.productoimpuesto.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoImpuesto=(TitledBorder)this.jScrollPanelDatosProductoImpuesto.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoImpuesto.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProductoImpuestoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.getproductoimpuesto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoimpuesto==null) {
						this.productoimpuesto = new ProductoImpuesto();
					}

					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.productoimpuesto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
				}

				if(this.productoimpuesto.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.productoimpuesto.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoImpuesto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_impuesto_invenProductoImpuestoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoimpuestoinven=true;

			idTienePermisoimpuestoinven=this.tienePermisosUsuarioEnPaginaWebProductoImpuesto(ImpuestoInvenConstantesFunciones.CLASSNAME);

			if(idTienePermisoimpuestoinven) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoImpuesto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoImpuesto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoImpuesto(this.getproductoimpuesto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);

				this.impuestoinvenBeanSwingJInternalFrame=new ImpuestoInvenBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.impuestoinvenBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.impuestoinvenBeanSwingJInternalFrame.getImpuestoInvenLogic().setConnexion(this.productoimpuestoLogic.getConnexion());

				if(this.productoimpuesto.getid_impuesto_inven()!=null) {
					this.impuestoinvenBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.impuestoinvenBeanSwingJInternalFrame.setIdActual(this.productoimpuesto.getid_impuesto_inven());
					this.impuestoinvenBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.impuestoinvenBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.impuestoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaImpuestoInven();
				}

				JInternalFrameBase jinternalFrame =this.impuestoinvenBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoImpuesto=(TitledBorder)this.jScrollPanelDatosProductoImpuesto.getBorder();
				TitledBorder titledBorderimpuestoinven=(TitledBorder)this.impuestoinvenBeanSwingJInternalFrame.jScrollPanelDatosImpuestoInven.getBorder();

				titledBorderimpuestoinven.setTitle(titledBorderProductoImpuesto.getTitle() + " -> Impuesto Inven");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_impuesto_invenProductoImpuestoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.getproductoimpuesto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoimpuesto==null) {
						this.productoimpuesto = new ProductoImpuesto();
					}

					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.productoimpuesto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
				}

				if(this.productoimpuesto.getid_impuesto_inven()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_impuesto_inven = "+this.productoimpuesto.getid_impuesto_inven().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoImpuesto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeProductoImpuestoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.getproductoimpuesto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoimpuesto==null) {
						this.productoimpuesto = new ProductoImpuesto();
					}

					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.productoimpuesto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
				}

				if(this.productoimpuesto.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.productoimpuesto.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoImpuesto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorProductoImpuestoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.getproductoimpuesto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoimpuesto==null) {
						this.productoimpuesto = new ProductoImpuesto();
					}

					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.productoimpuesto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);
				}

				if(this.productoimpuesto.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.productoimpuesto.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoImpuesto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoImpuesto(false,false);

			this.getProductoImpuestosFK_IdBodega();

			this.inicializarActualizarBindingProductoImpuesto(false);

			//if(ProductoImpuestoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoImpuesto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoImpuesto(false,false);

			this.getProductoImpuestosFK_IdEmpresa();

			this.inicializarActualizarBindingProductoImpuesto(false);

			//if(ProductoImpuestoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoImpuesto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdImpuestoInvenProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoImpuesto(false,false);

			this.getProductoImpuestosFK_IdImpuestoInven();

			this.inicializarActualizarBindingProductoImpuesto(false);

			//if(ProductoImpuestoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoImpuesto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoImpuesto(false,false);

			this.getProductoImpuestosFK_IdProducto();

			this.inicializarActualizarBindingProductoImpuesto(false);

			//if(ProductoImpuestoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoImpuesto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProductoImpuestoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoImpuesto(false,false);

			this.getProductoImpuestosFK_IdSucursal();

			this.inicializarActualizarBindingProductoImpuesto(false);

			//if(ProductoImpuestoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoImpuesto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoimpuestoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoImpuesto() {
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
			this.jInternalFrameDetalleFormProductoImpuesto.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoImpuesto.dispose();
			this.jInternalFrameDetalleFormProductoImpuesto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoImpuesto!=null) {
			this.jInternalFrameReporteDinamicoProductoImpuesto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoImpuesto.dispose();
			this.jInternalFrameReporteDinamicoProductoImpuesto=null;
		}
		
		if(this.jInternalFrameImportacionProductoImpuesto!=null) {
			this.jInternalFrameImportacionProductoImpuesto.setVisible(false);	    			
			this.jInternalFrameImportacionProductoImpuesto.dispose();
			this.jInternalFrameImportacionProductoImpuesto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoImpuesto();
			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoImpuesto")) {
				jButtonNuevoProductoImpuestoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoImpuesto")) {
				jButtonDuplicarProductoImpuestoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoImpuesto")) {
				jButtonCopiarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoImpuesto")) {
				jButtonVerFormProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoImpuesto")) {
				jButtonNuevoProductoImpuestoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoImpuesto")) {
				jButtonDuplicarProductoImpuestoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoImpuesto")) {
				jButtonNuevoProductoImpuestoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoImpuesto")) {
				jButtonDuplicarProductoImpuestoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoImpuesto")) {
				jButtonNuevoProductoImpuestoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoImpuesto")) {
				jButtonNuevoProductoImpuestoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoImpuesto")) {
				jButtonNuevoProductoImpuestoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoImpuesto")) {
				jButtonModificarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoImpuesto")) {
				jButtonModificarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoImpuesto")) {
				jButtonModificarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoImpuesto")) {
				jButtonActualizarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoImpuesto")) {
				jButtonActualizarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoImpuesto")) {
				jButtonActualizarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoImpuesto")) {
				jButtonEliminarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoImpuesto")) {
				jButtonEliminarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoImpuesto")) {
				jButtonEliminarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoImpuesto")) {
				jButtonCancelarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoImpuesto")) {
				jButtonCancelarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoImpuesto")) {
				jButtonCancelarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoImpuesto")) {
				jButtonCerrarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoImpuesto")) {
				jButtonCerrarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoImpuesto")) {
				jButtonCerrarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoImpuesto")) {
				jButtonMostrarOcultarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoImpuesto")) {
				jButtonCancelarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoImpuesto")) {
				jButtonGuardarCambiosProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoImpuesto")) {
				jButtonGuardarCambiosProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoImpuesto")) {
				jButtonCopiarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoImpuesto")) {
				jButtonVerFormProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoImpuesto")) {
				jButtonGuardarCambiosProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoImpuesto")) {
				jButtonCopiarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoImpuesto")) {
				jButtonVerFormProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoImpuesto")) {
				jButtonGuardarCambiosProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoImpuesto")) {
				jButtonGuardarCambiosProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoImpuesto")) {
				jButtonGuardarCambiosProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoImpuesto")) {
				jButtonRecargarInformacionProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoImpuesto")) {
				jButtonRecargarInformacionProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoImpuesto")) {
				jButtonRecargarInformacionProductoImpuestoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoImpuesto")) {
				jButtonAnterioresProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoImpuesto")) {
				jButtonAnterioresProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoImpuesto")) {
				jButtonAnterioresProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoImpuesto")) {
				jButtonSiguientesProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoImpuesto")) {
				jButtonSiguientesProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoImpuesto")) {
				jButtonSiguientesProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoImpuesto") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoImpuesto")) {
				jButtonAbrirOrderByProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoImpuesto") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoImpuesto")) {
				jButtonMostrarOcultarProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoImpuesto")) {
				jButtonNuevoGuardarCambiosProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoImpuesto")) {
				jButtonNuevoGuardarCambiosProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoImpuesto")) {
				jButtonNuevoGuardarCambiosProductoImpuestoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoImpuesto")) {
				jButtonCerrarReporteDinamicoProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoImpuesto")) {
				jButtonGenerarReporteDinamicoProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoImpuesto")) {
				
				jButtonGenerarExcelReporteDinamicoProductoImpuestoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoImpuesto")) {
				jButtonCerrarImportacionProductoImpuestoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoImpuesto")) {
				
				jButtonGenerarImportacionProductoImpuestoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoImpuesto")) {
				
				jButtonAbrirImportacionProductoImpuestoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoImpuesto")) {
				jComboBoxTiposAccionesProductoImpuestoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoImpuesto")) {
				jComboBoxTiposRelacionesProductoImpuestoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoImpuesto")) {
				jComboBoxTiposAccionesProductoImpuestoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoImpuesto")) {
				
				jComboBoxTiposSeleccionarProductoImpuestoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoImpuesto")) {
				jTextFieldValorCampoGeneralProductoImpuestoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoImpuesto")) {
				jButtonAbrirOrderByProductoImpuestoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoImpuesto")) {
				jButtonAbrirOrderByProductoImpuestoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoImpuesto")) {
				jButtonCerrarOrderByProductoImpuestoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoImpuestoBusqueda")) {
				this.jButtonidProductoImpuestoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoImpuestoUpdate")) {
				this.jButtonid_empresaProductoImpuestoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoImpuestoBusqueda")) {
				this.jButtonid_empresaProductoImpuestoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoImpuestoUpdate")) {
				this.jButtonid_sucursalProductoImpuestoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoImpuestoBusqueda")) {
				this.jButtonid_sucursalProductoImpuestoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoImpuestoUpdate")) {
				this.jButtonid_bodegaProductoImpuestoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoImpuestoBusqueda")) {
				this.jButtonid_bodegaProductoImpuestoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoImpuesto")) {
				this.jButtonid_productoProductoImpuestoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoImpuestoUpdate")) {
				this.jButtonid_productoProductoImpuestoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoImpuestoBusqueda")) {
				this.jButtonid_productoProductoImpuestoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_impuesto_invenProductoImpuestoUpdate")) {
				this.jButtonid_impuesto_invenProductoImpuestoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_impuesto_invenProductoImpuestoBusqueda")) {
				this.jButtonid_impuesto_invenProductoImpuestoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeProductoImpuestoBusqueda")) {
				this.jButtonporcentajeProductoImpuestoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorProductoImpuestoBusqueda")) {
				this.jButtonvalorProductoImpuestoBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoProductoImpuesto")) {
				this.jButtonid_productoProductoImpuestoActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaProductoImpuesto")) {
				this.jButtonFK_IdBodegaProductoImpuestoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdImpuestoInvenProductoImpuesto")) {
				this.jButtonFK_IdImpuestoInvenProductoImpuestoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoProductoImpuesto")) {
				this.jButtonFK_IdProductoProductoImpuestoActionPerformed(evt);
			}
			
			;
			
			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoImpuesto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoImpuestoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoimpuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
				
				


				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoImpuesto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoImpuesto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoImpuesto productoimpuestoLocal=null;
			
			if(!this.getEsControlTabla()) {
				productoimpuestoLocal=this.productoimpuesto;
			} else {
				productoimpuestoLocal=this.productoimpuestoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoimpuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
							
				
				


				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoImpuesto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoImpuesto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoImpuestoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoAnterior =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoimpuestoAnterior =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
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
			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			
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
			
			


			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoImpuestoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoimpuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
								
						
				


				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoImpuesto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoImpuesto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoimpuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
								
				
				


				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoImpuesto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoImpuesto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoImpuestoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoAnterior =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoimpuestoAnterior =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoimpuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoImpuestoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoAnterior =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoimpuestoAnterior =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoImpuestoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoimpuesto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoimpuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
							
				
				


				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoImpuesto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoImpuesto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoImpuestoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoimpuestoAnterior =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoimpuestoAnterior =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
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
			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			
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
			
			


			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoImpuestoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoimpuesto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoimpuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
								
				
				


				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoImpuesto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoImpuesto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoImpuestoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoAnterior =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoimpuestoAnterior =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoImpuestoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoimpuesto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoImpuestoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoimpuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoImpuesto")) {
					jCheckBoxSeleccionarTodosProductoImpuestoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoImpuesto")) {
					jCheckBoxSeleccionadosProductoImpuestoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoImpuesto")) {
					
				}
				
				


				
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoImpuesto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoImpuesto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productoimpuesto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
												
				
				


				
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoImpuesto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoImpuesto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoImpuestoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoimpuestoAnterior =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoimpuestoAnterior =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoImpuestoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoimpuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
				
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
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
			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
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
			
			


			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoImpuestoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoimpuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoImpuesto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoImpuesto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoimpuesto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoimpuesto);
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
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
				
				


				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoImpuesto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoImpuesto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoImpuestoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoimpuestoAnterior =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoimpuestoAnterior =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoImpuesto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoImpuestoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoImpuesto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productoimpuesto =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productoimpuesto =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productoimpuesto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoImpuesto")) {
				
				}
				
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoImpuesto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoImpuesto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoImpuesto")) {
			
			}
			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoImpuesto();
			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			
			if(sTipo.equals("NuevoProductoImpuesto")) {
				jButtonNuevoProductoImpuestoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoImpuesto")) {
				jButtonDuplicarProductoImpuestoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoImpuesto")) {
				jButtonCopiarProductoImpuestoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoImpuesto")) {
				jButtonVerFormProductoImpuestoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoImpuesto")) {
				jButtonNuevoProductoImpuestoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoImpuesto")) {
				jButtonModificarProductoImpuestoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoImpuesto")) {
				jButtonActualizarProductoImpuestoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoImpuesto")) {
				jButtonEliminarProductoImpuestoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoImpuesto")) {
				jButtonGuardarCambiosProductoImpuestoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoImpuesto")) {
				jButtonCancelarProductoImpuestoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoImpuesto")) {
				jButtonCerrarProductoImpuestoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoImpuesto")) {
				jButtonGuardarCambiosProductoImpuestoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoImpuesto")) {
				jButtonNuevoGuardarCambiosProductoImpuestoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoImpuesto")) {
				jButtonAbrirOrderByProductoImpuestoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoImpuesto")) {
				jButtonRecargarInformacionProductoImpuestoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoImpuesto")) {
				jButtonAnterioresProductoImpuestoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoImpuesto")) {
				jButtonSiguientesProductoImpuestoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoImpuestoBusqueda")) {
				this.jButtonidProductoImpuestoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProductoImpuestoUpdate")) {
				this.jButtonid_empresaProductoImpuestoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProductoImpuestoBusqueda")) {
				this.jButtonid_empresaProductoImpuestoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProductoImpuestoUpdate")) {
				this.jButtonid_sucursalProductoImpuestoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProductoImpuestoBusqueda")) {
				this.jButtonid_sucursalProductoImpuestoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoImpuestoUpdate")) {
				this.jButtonid_bodegaProductoImpuestoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoImpuestoBusqueda")) {
				this.jButtonid_bodegaProductoImpuestoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoImpuesto")) {
				this.jButtonid_productoProductoImpuestoActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoImpuestoUpdate")) {
				this.jButtonid_productoProductoImpuestoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoImpuestoBusqueda")) {
				this.jButtonid_productoProductoImpuestoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_impuesto_invenProductoImpuestoUpdate")) {
				this.jButtonid_impuesto_invenProductoImpuestoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_impuesto_invenProductoImpuestoBusqueda")) {
				this.jButtonid_impuesto_invenProductoImpuestoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeProductoImpuestoBusqueda")) {
				this.jButtonporcentajeProductoImpuestoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorProductoImpuestoBusqueda")) {
				this.jButtonvalorProductoImpuestoBusquedaActionPerformed(evt);
			}
			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoImpuesto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoImpuesto")) {
				closingInternalFrameProductoImpuesto();
				
			} else if(sTipo.equals("jButtonCancelarProductoImpuesto")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoImpuesto = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoImpuestoBeanSwingJInternalFrame jInternalFrameParent=(ProductoImpuestoBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoImpuesto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoImpuestoActionPerformed(null);
			}
			
			ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoimpuesto,new Object(),this.productoimpuestoParameterGeneral,this.productoimpuestoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoImpuesto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoImpuesto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoImpuesto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productoimpuesto)) {
			if(!esControlTabla) {
				if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.productoimpuesto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);			
				}
				
				if(this.productoimpuestoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoImpuesto(this.productoimpuesto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoimpuestoReturnGeneral=productoimpuestoLogic.procesarEventosProductoImpuestosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoimpuestoLogic.getProductoImpuestos(),this.productoimpuesto,this.productoimpuestoParameterGeneral,this.isEsNuevoProductoImpuesto,classes);//this.productoimpuestoLogic.getProductoImpuesto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoImpuesto(this.productoimpuestoReturnGeneral,this.productoimpuestoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productoimpuestoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoImpuesto(classes,this.productoimpuestoReturnGeneral,this.productoimpuestoBean,false);
					}
						
					if(this.productoimpuestoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoImpuesto(this.productoimpuestoReturnGeneral.getProductoImpuesto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoImpuesto(this.productoimpuestoReturnGeneral.getProductoImpuesto());	
					}
						
					if(this.productoimpuestoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoImpuesto(this.productoimpuestoReturnGeneral.getProductoImpuesto(),classes);//this.productoimpuestoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoImpuesto(this.productoimpuesto,classes);//this.productoimpuestoBean);									
				}
			
				if(ProductoImpuestoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoImpuesto(this.productoimpuesto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoImpuesto(this.productoimpuesto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productoimpuestoAnterior!=null) {
						this.productoimpuesto=this.productoimpuestoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoimpuestoReturnGeneral=productoimpuestoLogic.procesarEventosProductoImpuestosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoimpuestoLogic.getProductoImpuestos(),this.productoimpuesto,this.productoimpuestoParameterGeneral,this.isEsNuevoProductoImpuesto,classes);//this.productoimpuestoLogic.getProductoImpuesto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoimpuestoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoimpuestoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productoimpuestoReturnGeneral.getProductoImpuesto(),productoimpuestoLogic.getProductoImpuestos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productoimpuestoReturnGeneral.getProductoImpuesto(),this.productoimpuestos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoImpuesto.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoImpuesto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoImpuesto();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoImpuesto() throws Exception {
		
		ProductoImpuestoModel productoimpuestoModel=(ProductoImpuestoModel)this.jTableDatosProductoImpuesto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoimpuestoModel.productoimpuestos=this.productoimpuestoLogic.getProductoImpuestos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productoimpuestoModel.productoimpuestos=this.productoimpuestos;
		}
		
		
		((ProductoImpuestoModel) this.jTableDatosProductoImpuesto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoImpuesto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductoimpuestoAnterior(),this.productoimpuestoLogic.getProductoImpuestos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductoimpuestoAnterior(),this.productoimpuestos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoImpuesto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoImpuesto(ProductoImpuesto productoimpuesto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
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
										
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoimpuesto,new Object(),generalEntityParameterGeneral,this.productoimpuestoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productoimpuestoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoImpuestoConstantesFunciones.getClassesRelationshipsOfProductoImpuesto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoImpuestoConstantesFunciones.getClassesRelationshipsFromStringsOfProductoImpuesto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoImpuesto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoImpuestoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoimpuesto,new Object(),generalEntityParameterGeneral,this.productoimpuestoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoImpuesto(ProductoImpuestoBean productoimpuestoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoImpuesto(ArrayList<Classe> classes,ProductoImpuestoReturnGeneral productoimpuestoReturnGeneral,ProductoImpuestoBean productoimpuestoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoImpuesto(ProductoImpuesto productoimpuesto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productoimpuesto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoImpuesto = new ProductoImpuestoDetalleFormJInternalFrame(jDesktopPane,this.productoimpuestoSessionBean.getConGuardarRelaciones(),this.productoimpuestoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.setVisible(false);
		this.jInternalFrameDetalleFormProductoImpuesto.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoImpuesto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoImpuesto.productoimpuestoLogic=this.productoimpuestoLogic;
		
		this.cargarCombosFrameForeignKeyProductoImpuesto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoImpuesto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoImpuesto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoImpuesto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoImpuesto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoImpuesto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoImpuesto"));
		
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonModificarProductoImpuesto.addActionListener(new ButtonActionListener(this,"ModificarProductoImpuesto"));

		
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonModificarToolBarProductoImpuesto.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoImpuesto"));
					
		this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemModificarProductoImpuesto.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoImpuesto"));		
		
		
		
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonActualizarProductoImpuesto.addActionListener (new ButtonActionListener(this,"ActualizarProductoImpuesto"));
		
		
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonActualizarToolBarProductoImpuesto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoImpuesto"));
						
		this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemActualizarProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoImpuesto"));		
		
		
		
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonEliminarProductoImpuesto.addActionListener (new ButtonActionListener(this,"EliminarProductoImpuesto"));
		
		
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonEliminarToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoImpuesto"));
								
		this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemEliminarProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoImpuesto"));		
		
		
		
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonCancelarProductoImpuesto.addActionListener (new ButtonActionListener(this,"CancelarProductoImpuesto"));
		
		
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonCancelarToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoImpuesto"));
					
		this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemCancelarProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoImpuesto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemDetalleCerrarProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoImpuesto"));		
		
		
		
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonGuardarCambiosToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoImpuesto"));
		
		
		
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonGuardarCambiosToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoImpuesto"));
		
		
		
		this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxTiposAccionesFormularioProductoImpuesto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoImpuesto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonidProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"idProductoImpuestoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_empresaProductoImpuestoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoImpuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_empresaProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoImpuestoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_sucursalProductoImpuestoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoImpuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_sucursalProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoImpuestoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_bodegaProductoImpuestoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoImpuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_bodegaProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoImpuestoBusqueda"));
		//jButtonid_productoProductoImpuesto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoImpuestoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_productoProductoImpuesto.addActionListener(new ButtonActionListener(this,"id_productoProductoImpuesto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_productoProductoImpuestoUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoImpuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_productoProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoImpuestoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_impuesto_invenProductoImpuestoUpdate.addActionListener(new ButtonActionListener(this,"id_impuesto_invenProductoImpuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_impuesto_invenProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"id_impuesto_invenProductoImpuestoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonporcentajeProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProductoImpuestoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonvalorProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"valorProductoImpuestoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoImpuesto.jTabbedPaneRelacionesProductoImpuesto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoImpuesto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoImpuesto"));
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoImpuesto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoImpuesto"));
		}
		
		this.jTableDatosProductoImpuesto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoImpuesto"));
		
		this.jTableDatosProductoImpuesto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoImpuesto"));
		
		this.jButtonNuevoProductoImpuesto.addActionListener(new ButtonActionListener(this,"NuevoProductoImpuesto"));
		
		this.jButtonDuplicarProductoImpuesto.addActionListener(new ButtonActionListener(this,"DuplicarProductoImpuesto"));
		
		this.jButtonCopiarProductoImpuesto.addActionListener(new ButtonActionListener(this,"CopiarProductoImpuesto"));
		
		this.jButtonVerFormProductoImpuesto.addActionListener(new ButtonActionListener(this,"VerFormProductoImpuesto"));
		
		
		this.jButtonNuevoToolBarProductoImpuesto.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoImpuesto"));
			
		this.jButtonDuplicarToolBarProductoImpuesto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoImpuesto"));
			
		this.jMenuItemNuevoProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoImpuesto"));
			
		this.jMenuItemDuplicarProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoImpuesto"));		
		
		
		this.jButtonNuevoRelacionesProductoImpuesto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoImpuesto"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoImpuesto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoImpuesto"));
			
		this.jMenuItemNuevoRelacionesProductoImpuesto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoImpuesto"));		
		
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonModificarProductoImpuesto.addActionListener(new ButtonActionListener(this,"ModificarProductoImpuesto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonModificarToolBarProductoImpuesto.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoImpuesto"));
			
			this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemModificarProductoImpuesto.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoImpuesto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonActualizarProductoImpuesto.addActionListener (new ButtonActionListener(this,"ActualizarProductoImpuesto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonActualizarToolBarProductoImpuesto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoImpuesto"));
				
			this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemActualizarProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoImpuesto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonEliminarProductoImpuesto.addActionListener (new ButtonActionListener(this,"EliminarProductoImpuesto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonEliminarToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoImpuesto"));
						
			this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemEliminarProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoImpuesto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonCancelarProductoImpuesto.addActionListener (new ButtonActionListener(this,"CancelarProductoImpuesto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonCancelarToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoImpuesto"));
			
			this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemCancelarProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoImpuesto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoImpuesto"));		
		
		
		this.jButtonCerrarProductoImpuesto.addActionListener (new ButtonActionListener(this,"CerrarProductoImpuesto"));
		
		
		this.jButtonCerrarToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoImpuesto"));
			
		this.jMenuItemCerrarProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoImpuesto"));
			
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoImpuesto.jMenuItemDetalleCerrarProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoImpuesto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonGuardarCambiosProductoImpuesto.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoImpuesto"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonGuardarCambiosToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoImpuesto"));
		}
		
		this.jButtonCopiarToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoImpuesto"));
			
		this.jButtonVerFormToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoImpuesto"));
		
		this.jMenuItemGuardarCambiosProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoImpuesto"));
			
		this.jMenuItemCopiarProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoImpuesto"));		
		
		this.jMenuItemVerFormProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoImpuesto"));		
		
		
		this.jButtonGuardarCambiosTablaProductoImpuesto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoImpuesto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoImpuesto"));
			
		this.jMenuItemGuardarCambiosTablaProductoImpuesto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoImpuesto"));		
		
		
		
		this.jButtonRecargarInformacionProductoImpuesto.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoImpuesto"));
					
		this.jButtonRecargarInformacionToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoImpuesto"));
		
		this.jMenuItemRecargarInformacionProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoImpuesto"));		
		
		
		
		this.jButtonAnterioresProductoImpuesto.addActionListener (new ButtonActionListener(this,"AnterioresProductoImpuesto"));
		
		
		this.jButtonAnterioresToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoImpuesto"));
		
		this.jMenuItemAnterioresProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoImpuesto"));		
		
		
		this.jButtonSiguientesProductoImpuesto.addActionListener (new ButtonActionListener(this,"SiguientesProductoImpuesto"));
		
		
		this.jButtonSiguientesToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoImpuesto"));
			
		this.jMenuItemSiguientesProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoImpuesto"));
			
		this.jMenuItemAbrirOrderByProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoImpuesto"));
			
		this.jMenuItemMostrarOcultarProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoImpuesto"));
			
		this.jMenuItemDetalleAbrirOrderByProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoImpuesto"));
			
		this.jMenuItemDetalleMostarOcultarProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoImpuesto"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoImpuesto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoImpuesto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoImpuesto"));
			
		this.jMenuItemNuevoGuardarCambiosProductoImpuesto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoImpuesto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoImpuesto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoImpuesto"));

		this.jCheckBoxSeleccionadosProductoImpuesto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoImpuesto"));
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxTiposAccionesFormularioProductoImpuesto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoImpuesto"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoImpuesto.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoImpuesto"));
			
		this.jComboBoxTiposAccionesProductoImpuesto.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoImpuesto"));
					
		this.jComboBoxTiposSeleccionarProductoImpuesto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoImpuesto"));
			
		this.jTextFieldValorCampoGeneralProductoImpuesto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoImpuesto"));		
		
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonidProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"idProductoImpuestoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_empresaProductoImpuestoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoImpuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_empresaProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoImpuestoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_sucursalProductoImpuestoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoImpuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_sucursalProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoImpuestoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_bodegaProductoImpuestoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoImpuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_bodegaProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoImpuestoBusqueda"));
		//jButtonid_productoProductoImpuesto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoImpuestoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_productoProductoImpuesto.addActionListener(new ButtonActionListener(this,"id_productoProductoImpuesto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_productoProductoImpuestoUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoImpuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_productoProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoImpuestoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_impuesto_invenProductoImpuestoUpdate.addActionListener(new ButtonActionListener(this,"id_impuesto_invenProductoImpuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_impuesto_invenProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"id_impuesto_invenProductoImpuestoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonporcentajeProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProductoImpuestoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonvalorProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"valorProductoImpuestoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaProductoImpuesto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProductoImpuesto"));

			this.jButtonFK_IdImpuestoInvenProductoImpuesto.addActionListener(new ButtonActionListener(this,"FK_IdImpuestoInvenProductoImpuesto"));

			this.jButtonFK_IdProductoProductoImpuesto.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoImpuesto"));

			this.jButtonBuscarFK_IdProductoid_productoProductoImpuesto.addActionListener(new ButtonActionListener(this,"id_productoProductoImpuesto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoImpuesto!=null) {
				this.jInternalFrameReporteDinamicoProductoImpuesto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoImpuesto"));
				this.jInternalFrameReporteDinamicoProductoImpuesto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoImpuesto"));
				this.jInternalFrameReporteDinamicoProductoImpuesto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoImpuesto"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoImpuesto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoImpuesto"));				
			//this.jButtonGenerarReporteDinamicoProductoImpuesto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoImpuesto"));
			//this.jButtonGenerarExcelReporteDinamicoProductoImpuesto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoImpuesto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoImpuesto!=null) {
				this.jInternalFrameImportacionProductoImpuesto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoImpuesto"));
				this.jInternalFrameImportacionProductoImpuesto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoImpuesto"));
				this.jInternalFrameImportacionProductoImpuesto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoImpuesto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoImpuesto.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoImpuesto"));
			
			this.jButtonAbrirOrderByToolBarProductoImpuesto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoImpuesto"));			
			
			if(this.jInternalFrameOrderByProductoImpuesto!=null) {
				this.jInternalFrameOrderByProductoImpuesto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoImpuesto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoImpuesto.jTabbedPaneRelacionesProductoImpuesto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoImpuesto"));
		
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
            		closingInternalFrameProductoImpuesto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoImpuesto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoImpuesto = (JInternalFrameBase)event.getSource();
	            	
	            ProductoImpuestoBeanSwingJInternalFrame jInternalFrameParent=(ProductoImpuestoBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoImpuesto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoImpuestoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoImpuesto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoImpuestoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoImpuesto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoImpuesto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoImpuestoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoImpuestoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoImpuestoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoImpuesto";
		inputMap = this.jButtonNuevoProductoImpuesto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoImpuesto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoImpuestoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoImpuestoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoImpuestoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoImpuestoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoImpuesto";
		inputMap = this.jButtonNuevoRelacionesProductoImpuesto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoImpuesto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoImpuestoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoImpuesto";
		inputMap = this.jButtonModificarProductoImpuesto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoImpuesto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoImpuestoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoImpuesto";
		inputMap = this.jButtonActualizarProductoImpuesto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoImpuesto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoImpuestoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoImpuesto";
		inputMap = this.jButtonEliminarProductoImpuesto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoImpuesto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoImpuestoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoImpuesto";
		inputMap = this.jButtonCancelarProductoImpuesto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoImpuesto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoImpuestoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoImpuesto";
		inputMap = this.jButtonCerrarProductoImpuesto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoImpuesto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoImpuestoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonGuardarCambiosProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoImpuesto";
		inputMap = this.jInternalFrameDetalleFormProductoImpuesto.jButtonGuardarCambiosProductoImpuesto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonGuardarCambiosProductoImpuesto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoImpuestoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoImpuesto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoImpuestoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoImpuesto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoImpuestoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoImpuesto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoImpuestoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoImpuesto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoImpuestoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonidProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"idProductoImpuestoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_empresaProductoImpuestoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProductoImpuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_empresaProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProductoImpuestoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_sucursalProductoImpuestoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProductoImpuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_sucursalProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProductoImpuestoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_bodegaProductoImpuestoUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoImpuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_bodegaProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoImpuestoBusqueda"));
		//jButtonid_productoProductoImpuesto.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoImpuestoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_productoProductoImpuesto.addActionListener(new ButtonActionListener(this,"id_productoProductoImpuesto"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_productoProductoImpuestoUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoImpuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_productoProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoImpuestoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_impuesto_invenProductoImpuestoUpdate.addActionListener(new ButtonActionListener(this,"id_impuesto_invenProductoImpuestoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_impuesto_invenProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"id_impuesto_invenProductoImpuestoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonporcentajeProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProductoImpuestoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoImpuesto.jButtonvalorProductoImpuestoBusqueda.addActionListener(new ButtonActionListener(this,"valorProductoImpuestoBusqueda"));
		
		
		this.jButtonFK_IdBodegaProductoImpuesto.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProductoImpuesto"));

		this.jButtonFK_IdImpuestoInvenProductoImpuesto.addActionListener(new ButtonActionListener(this,"FK_IdImpuestoInvenProductoImpuesto"));

		this.jButtonFK_IdProductoProductoImpuesto.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoImpuesto"));

		this.jButtonBuscarFK_IdProductoid_productoProductoImpuesto.addActionListener(new ButtonActionListener(this,"id_productoProductoImpuesto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoImpuesto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoImpuestoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoImpuestoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoImpuesto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoImpuesto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoImpuesto productoimpuestoAux:this.productoimpuestoLogic.getProductoImpuestos()) {
					productoimpuestoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoImpuesto productoimpuestoAux:productoimpuestos) {
					productoimpuestoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoImpuestoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoImpuesto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoImpuesto productoimpuestoAux:this.productoimpuestoLogic.getProductoImpuestos()) {
						productoimpuestoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoImpuesto productoimpuestoAux:productoimpuestos) {
						productoimpuestoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoImpuesto productoimpuestoAux:this.productoimpuestoLogic.getProductoImpuestos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoImpuesto productoimpuestoAux:productoimpuestos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoImpuesto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoImpuesto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoImpuesto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoImpuesto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoImpuestoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoImpuesto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoImpuesto.getSelectedRows();
			
			ProductoImpuesto productoimpuestoLocal=new ProductoImpuesto();
			
			//this.seleccionarTodosProductoImpuesto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoimpuestoLocal =(ProductoImpuesto) this.productoimpuestoLogic.getProductoImpuestos().toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productoimpuestoLocal =(ProductoImpuesto) this.productoimpuestos.toArray()[this.jTableDatosProductoImpuesto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productoimpuestoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoImpuesto productoimpuestoAux:this.productoimpuestoLogic.getProductoImpuestos()) {
						productoimpuestoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoImpuesto productoimpuestoAux:productoimpuestos) {
						productoimpuestoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoImpuesto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoImpuesto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoImpuesto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoImpuesto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoImpuestoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoImpuestoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoImpuestoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoImpuesto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoImpuesto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoImpuesto productoimpuestoAux:this.productoimpuestoLogic.getProductoImpuestos()) {
				
						if(sTipoSeleccionar.equals(ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							productoimpuestoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoImpuestoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							productoimpuestoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoImpuesto productoimpuestoAux:productoimpuestos) {
					
						if(sTipoSeleccionar.equals(ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							productoimpuestoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoImpuestoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							productoimpuestoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoImpuesto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoImpuestoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoImpuesto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoImpuesto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoImpuesto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxTiposAccionesFormularioProductoImpuesto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoImpuesto) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoImpuesto(conSplash);
				
					this.generarReporteProductoImpuestosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoImpuesto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxTiposAccionesFormularioProductoImpuesto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoImpuestosSeleccionados();
				//this.jComboBoxTiposAccionesProductoImpuesto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoImpuestosSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoImpuesto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoImpuestosSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoImpuesto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoImpuesto();
				
				this.exportarProductoImpuestosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoImpuesto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxTiposAccionesFormularioProductoImpuesto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoImpuestos();
				//this.importarProductoImpuestos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoImpuesto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxTiposAccionesFormularioProductoImpuesto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoImpuesto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoImpuestosSeleccionados();
				//this.jComboBoxTiposAccionesProductoImpuesto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Producto Impuesto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoImpuesto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoImpuesto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoImpuesto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Producto Impuesto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoImpuesto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxTiposAccionesFormularioProductoImpuesto.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoImpuestoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoImpuesto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoImpuesto(conSplash);
					
						//this.actualizarParametrosGeneralProductoImpuesto();
						
						this.generarReporteProcesoAccionProductoImpuestosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoImpuesto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxTiposAccionesFormularioProductoImpuesto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoImpuestoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Producto ImpuestoS SELECCIONADOS?", "MANTENIMIENTO DE Producto Impuesto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoImpuesto();
				
						this.actualizarParametrosGeneralProductoImpuesto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productoimpuestoReturnGeneral=productoimpuestoLogic.procesarAccionProductoImpuestosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productoimpuestoLogic.getProductoImpuestos(),this.productoimpuestoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoImpuestoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoImpuesto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxTiposAccionesFormularioProductoImpuesto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoImpuesto();
					
					ProductoImpuestoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoImpuestoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoImpuesto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxTiposAccionesFormularioProductoImpuesto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoImpuesto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoImpuestoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoImpuesto();
			
			if(this.jInternalFrameDetalleFormProductoImpuesto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoImpuesto> productoimpuestosSeleccionados=new ArrayList<ProductoImpuesto>();		
			ProductoImpuesto productoimpuesto=new ProductoImpuesto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoImpuesto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoImpuesto.getSelectedItem();
			
			
			
			
			productoimpuestosSeleccionados=this.getProductoImpuestosSeleccionados(true);
			//this.sTipoAccion;
			
			if(productoimpuestosSeleccionados.size()==1) {
				for(ProductoImpuesto productoimpuestoAux:productoimpuestosSeleccionados) {
					productoimpuesto=productoimpuestoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoImpuesto();
			
      		//this.finishProcessProductoImpuesto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoImpuestoReturnGeneral() throws Exception {
		if(this.productoimpuestoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productoimpuestoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productoimpuestoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productoimpuestoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productoimpuestoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productoimpuestoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoImpuesto(false);
		}
		
		if(this.productoimpuestoReturnGeneral.getConRetornoLista() || this.productoimpuestoReturnGeneral.getConRetornoObjeto()) {
			if(this.productoimpuestoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoimpuestoLogic.setProductoImpuestos(this.productoimpuestoReturnGeneral.getProductoImpuestos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productoimpuestoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoimpuestoLogic.setProductoImpuesto(this.productoimpuestoReturnGeneral.getProductoImpuesto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoImpuesto(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoImpuesto() throws Exception {
		
		
	}
	
	public ArrayList<ProductoImpuesto> getProductoImpuestosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoImpuesto> productoimpuestosSeleccionados=new ArrayList<ProductoImpuesto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoImpuesto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoImpuesto productoimpuestoAux:productoimpuestoLogic.getProductoImpuestos()) {
					if(productoimpuestoAux.getIsSelected()) {
						productoimpuestosSeleccionados.add(productoimpuestoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoImpuesto productoimpuestoAux:this.productoimpuestos) {
					if(productoimpuestoAux.getIsSelected()) {
						productoimpuestosSeleccionados.add(productoimpuestoAux);				
					}
				}
			}
			
			if(productoimpuestosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productoimpuestosSeleccionados.addAll(this.productoimpuestoLogic.getProductoImpuestos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productoimpuestosSeleccionados.addAll(this.productoimpuestos);				
					}
				}
			}
		} else {
			productoimpuestosSeleccionados.add(this.productoimpuesto);
		}
		
		return productoimpuestosSeleccionados;
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
	
	public void generarReporteProductoImpuestosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoImpuestosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoImpuestosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoImpuestosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoImpuestosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Producto Impuesto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoImpuestosSeleccionados() throws Exception {
		ArrayList<ProductoImpuesto> productoimpuestosSeleccionados=new ArrayList<ProductoImpuesto>();		
		
		productoimpuestosSeleccionados=this.getProductoImpuestosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoImpuestos("Todos",productoimpuestosSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoImpuestosSeleccionados() throws Exception {
		ArrayList<ProductoImpuesto> productoimpuestosSeleccionados=new ArrayList<ProductoImpuesto>();		
		
		productoimpuestosSeleccionados=this.getProductoImpuestosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoImpuestos("Todos",productoimpuestosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoImpuestosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoImpuesto> productoimpuestosSeleccionados=new ArrayList<ProductoImpuesto>();
		
		productoimpuestosSeleccionados=this.getProductoImpuestosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoImpuestos("Todos",productoimpuestosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoImpuestosSeleccionados() throws Exception {
		ArrayList<ProductoImpuesto> productoimpuestosSeleccionados=new ArrayList<ProductoImpuesto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoImpuesto();
		
		
		productoimpuestosSeleccionados=this.getProductoImpuestosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoImpuesto();
		
		
		//this.generarReporteProductoImpuestos("Todos",productoimpuestosSeleccionados ,productoimpuestoImplementable,productoimpuestoImplementableHome);
	}
	
	public void mostrarImportacionProductoImpuestos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoImpuesto();
		
		this.abrirFrameImportacionProductoImpuesto();		
		
			
		//this.generarReporteProductoImpuestos("Todos",productoimpuestosSeleccionados ,productoimpuestoImplementable,productoimpuestoImplementableHome);
	}
	
	public void importarProductoImpuestos() throws Exception {		
	
	}
	
	public void exportarProductoImpuestosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoImpuestosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoImpuestosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoImpuestosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Producto Impuesto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoImpuestosSeleccionados() throws Exception {
		ArrayList<ProductoImpuesto> productoimpuestosSeleccionados=new ArrayList<ProductoImpuesto>();		
		
		productoimpuestosSeleccionados=this.getProductoImpuestosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoimpuesto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoImpuesto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoImpuesto productoimpuestoAux:productoimpuestosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoImpuesto(productoimpuestoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productoimpuestoAux.setsDetalleGeneralEntityReporte(productoimpuestoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Impuesto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoImpuesto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoImpuestoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoImpuestoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoImpuestoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoImpuestoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoImpuestoConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoImpuesto(ProductoImpuesto productoimpuesto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productoimpuesto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productoimpuesto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoimpuesto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoimpuesto.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoimpuesto.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoimpuesto.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoimpuesto.getimpuestoinven_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoimpuesto.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoimpuesto.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoImpuestosSeleccionados() throws Exception {
		ArrayList<ProductoImpuesto> productoimpuestosSeleccionados=new ArrayList<ProductoImpuesto>();		
		
		productoimpuestosSeleccionados=this.getProductoImpuestosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoimpuesto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoImpuestos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoImpuesto(row);				
				iRow++;
			}				
			
			for(ProductoImpuesto productoimpuestoAux:productoimpuestosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoImpuesto(productoimpuestoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Impuesto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoImpuestosSeleccionados() throws Exception {
		ArrayList<ProductoImpuesto> productoimpuestosSeleccionados=new ArrayList<ProductoImpuesto>();		
		
		productoimpuestosSeleccionados=this.getProductoImpuestosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoimpuesto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productoimpuestos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productoimpuesto");
			//elementRoot.appendChild(element);
		
			for(ProductoImpuesto productoimpuestoAux:productoimpuestosSeleccionados) {
				element = document.createElement("productoimpuesto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoImpuesto(productoimpuestoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Impuesto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoImpuesto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoImpuestoConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoImpuesto(ProductoImpuesto productoimpuesto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productoimpuesto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productoimpuesto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoimpuesto.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoimpuesto.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoimpuesto.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoimpuesto.getimpuestoinven_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoimpuesto.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(productoimpuesto.getvalor());				
	}
	
	public void setFilaDatosExportarXmlProductoImpuesto(ProductoImpuesto productoimpuesto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoImpuestoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productoimpuesto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoImpuestoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productoimpuesto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ProductoImpuestoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(productoimpuesto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProductoImpuestoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(productoimpuesto.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(ProductoImpuestoConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(productoimpuesto.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ProductoImpuestoConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(productoimpuesto.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementimpuestoinven_descripcion = document.createElement(ProductoImpuestoConstantesFunciones.IDIMPUESTOINVEN);
		elementimpuestoinven_descripcion.appendChild(document.createTextNode(productoimpuesto.getimpuestoinven_descripcion()));
		element.appendChild(elementimpuestoinven_descripcion);

		Element elementporcentaje = document.createElement(ProductoImpuestoConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(productoimpuesto.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementvalor = document.createElement(ProductoImpuestoConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(productoimpuesto.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoProductoImpuestosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoImpuesto> productoimpuestosSeleccionados=new ArrayList<ProductoImpuesto>();
		
		productoimpuestosSeleccionados=this.getProductoImpuestosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoImpuesto(productoimpuestosSeleccionados);
		
		this.generarReporteProductoImpuestos("Todos",productoimpuestosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoImpuesto(ArrayList<ProductoImpuesto> productoimpuestosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoImpuesto productoimpuestoAux:productoimpuestosSeleccionados) {
				productoimpuestoAux.setsDetalleGeneralEntityReporte(productoimpuestoAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoImpuestoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					productoimpuestoAux.setsDescripcionGeneralEntityReporte1(productoimpuestoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoImpuestoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					productoimpuestoAux.setsDescripcionGeneralEntityReporte1(productoimpuestoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoImpuestoConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					productoimpuestoAux.setsDescripcionGeneralEntityReporte1(productoimpuestoAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoImpuestoConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					productoimpuestoAux.setsDescripcionGeneralEntityReporte1(productoimpuestoAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoImpuestoConstantesFunciones.LABEL_IDIMPUESTOINVEN)) {
					existe=true;
					productoimpuestoAux.setsDescripcionGeneralEntityReporte1(productoimpuestoAux.getimpuestoinven_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoImpuestoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoImpuesto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoImpuesto=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto=true;
				this.isVisibilidadCeldaGuardarCambiosProductoImpuesto=true;
			}
			
			this.isVisibilidadCeldaModificarProductoImpuesto=false;
			this.isVisibilidadCeldaActualizarProductoImpuesto=false;
			this.isVisibilidadCeldaEliminarProductoImpuesto=false;
			this.isVisibilidadCeldaCancelarProductoImpuesto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoImpuesto=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoImpuesto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoImpuesto=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoImpuesto=false;
			this.isVisibilidadCeldaModificarProductoImpuesto=false;
			this.isVisibilidadCeldaActualizarProductoImpuesto=true;
			this.isVisibilidadCeldaEliminarProductoImpuesto=false;
			this.isVisibilidadCeldaCancelarProductoImpuesto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoImpuesto=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoImpuesto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoImpuesto=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoImpuesto=false;
			this.isVisibilidadCeldaModificarProductoImpuesto=false;
			this.isVisibilidadCeldaActualizarProductoImpuesto=true;
			this.isVisibilidadCeldaEliminarProductoImpuesto=true;
			this.isVisibilidadCeldaCancelarProductoImpuesto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoImpuesto=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoImpuesto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoImpuesto=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoImpuesto=false;
			this.isVisibilidadCeldaModificarProductoImpuesto=false;
			this.isVisibilidadCeldaActualizarProductoImpuesto=true;
			this.isVisibilidadCeldaEliminarProductoImpuesto=false;
			this.isVisibilidadCeldaCancelarProductoImpuesto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoImpuesto=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoImpuesto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoImpuesto=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto=true;
			this.isVisibilidadCeldaGuardarCambiosProductoImpuesto=true;
			this.isVisibilidadCeldaModificarProductoImpuesto=false;
			this.isVisibilidadCeldaActualizarProductoImpuesto=false;
			this.isVisibilidadCeldaEliminarProductoImpuesto=false;
			this.isVisibilidadCeldaCancelarProductoImpuesto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoImpuesto=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoImpuesto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoImpuesto=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoImpuesto=false;
			this.isVisibilidadCeldaActualizarProductoImpuesto=false;
			this.isVisibilidadCeldaEliminarProductoImpuesto=false;
			this.isVisibilidadCeldaCancelarProductoImpuesto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoImpuesto=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoImpuesto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoImpuesto=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoImpuesto=false;
			this.isVisibilidadCeldaModificarProductoImpuesto=true;
			this.isVisibilidadCeldaActualizarProductoImpuesto=false;
			this.isVisibilidadCeldaEliminarProductoImpuesto=false;
			this.isVisibilidadCeldaCancelarProductoImpuesto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoImpuesto=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoImpuesto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoImpuestoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoImpuesto=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto=true;
			this.isVisibilidadCeldaGuardarCambiosProductoImpuesto=true;
		} else {
			this.actualizarEstadoPanelsProductoImpuesto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoImpuesto=false;
			//this.isVisibilidadCeldaVerFormProductoImpuesto=false;
			this.isVisibilidadCeldaDuplicarProductoImpuesto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productoimpuestoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoImpuesto=false;
			this.isVisibilidadCeldaGuardarCambiosProductoImpuesto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productoimpuestoSessionBean.getEsGuardarRelacionado()) {
			if(!productoimpuestoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto=false;												
			}
			
			this.jButtonCerrarProductoImpuesto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoImpuesto=false;
		}
		
		if(!this.permiteMantenimiento(this.productoimpuesto)) {
			this.isVisibilidadCeldaActualizarProductoImpuesto=false;
			this.isVisibilidadCeldaEliminarProductoImpuesto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoImpuesto() {
	}
	
	public void actualizarEstadoPanelsProductoImpuesto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoImpuesto!=null) {
				this.jScrollPanelDatosEdicionProductoImpuesto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoImpuesto!=null) {
				this.jTabbedPaneBusquedasProductoImpuesto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoImpuesto!=null) {
				this.jScrollPanelDatosProductoImpuesto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoImpuesto!=null) {
				this.jPanelPaginacionProductoImpuesto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoImpuesto!=null) {
				this.jPanelParametrosReportesProductoImpuesto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoImpuesto!=null) {
				this.jScrollPanelDatosEdicionProductoImpuesto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoImpuesto!=null) {
				this.jTabbedPaneBusquedasProductoImpuesto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoImpuesto!=null) {
				this.jScrollPanelDatosProductoImpuesto.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoImpuesto!=null) {
				this.jPanelPaginacionProductoImpuesto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoImpuesto!=null) {
				this.jPanelParametrosReportesProductoImpuesto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoImpuesto!=null) {
				this.jScrollPanelDatosEdicionProductoImpuesto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoImpuesto!=null) {
				this.jTabbedPaneBusquedasProductoImpuesto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoImpuesto!=null) {
				this.jScrollPanelDatosProductoImpuesto.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoImpuesto!=null) {
				this.jPanelPaginacionProductoImpuesto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoImpuesto!=null) {
				this.jPanelParametrosReportesProductoImpuesto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoImpuesto!=null) {
				this.jScrollPanelDatosEdicionProductoImpuesto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoImpuesto!=null) {
				this.jTabbedPaneBusquedasProductoImpuesto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoImpuesto!=null) {
				this.jScrollPanelDatosProductoImpuesto.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoImpuesto!=null) {
				this.jPanelPaginacionProductoImpuesto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoImpuesto!=null) {
				this.jPanelParametrosReportesProductoImpuesto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoImpuesto!=null) {
				this.jScrollPanelDatosEdicionProductoImpuesto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoImpuesto!=null) {
				this.jTabbedPaneBusquedasProductoImpuesto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoImpuesto!=null) {
				this.jScrollPanelDatosProductoImpuesto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoImpuesto!=null) {
				this.jPanelPaginacionProductoImpuesto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoImpuesto!=null) {
				this.jPanelParametrosReportesProductoImpuesto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoImpuesto!=null) {
				this.jScrollPanelDatosEdicionProductoImpuesto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoImpuesto!=null) {
				this.jTabbedPaneBusquedasProductoImpuesto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoImpuesto!=null) {
				this.jScrollPanelDatosProductoImpuesto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoImpuesto!=null) {
				this.jPanelPaginacionProductoImpuesto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoImpuesto!=null) {
				this.jPanelParametrosReportesProductoImpuesto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoImpuesto!=null) {
				this.jScrollPanelDatosEdicionProductoImpuesto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoImpuesto!=null) {
				this.jTabbedPaneBusquedasProductoImpuesto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoImpuesto!=null) {
				this.jScrollPanelDatosProductoImpuesto.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoImpuesto!=null) {
				this.jPanelPaginacionProductoImpuesto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoImpuesto!=null) {
				this.jPanelParametrosReportesProductoImpuesto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoImpuesto!=null) {
					this.jTabbedPaneBusquedasProductoImpuesto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoImpuesto!=null) {
				this.jPanelParametrosReportesProductoImpuesto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productoimpuestoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoImpuesto!=null) {
				this.jTabbedPaneBusquedasProductoImpuesto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoImpuesto!=null) {
				this.jPanelParametrosReportesProductoImpuesto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoImpuesto.remove(jPanelFK_IdBodegaProductoImpuesto);}

			this.isVisibilidadFK_IdImpuestoInven=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdImpuestoInven) {this.jTabbedPaneBusquedasProductoImpuesto.remove(jPanelFK_IdImpuestoInvenProductoImpuesto);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoImpuesto.remove(jPanelFK_IdProductoProductoImpuesto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoImpuesto.remove(jPanelFK_IdBodegaProductoImpuesto);}

			this.isVisibilidadFK_IdImpuestoInven=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdImpuestoInven) {this.jTabbedPaneBusquedasProductoImpuesto.remove(jPanelFK_IdImpuestoInvenProductoImpuesto);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoImpuesto.remove(jPanelFK_IdProductoProductoImpuesto);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoImpuesto.remove(jPanelFK_IdBodegaProductoImpuesto);}

			this.isVisibilidadFK_IdImpuestoInven=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdImpuestoInven) {this.jTabbedPaneBusquedasProductoImpuesto.remove(jPanelFK_IdImpuestoInvenProductoImpuesto);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoImpuesto.remove(jPanelFK_IdProductoProductoImpuesto);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoImpuesto.remove(jPanelFK_IdBodegaProductoImpuesto);}

			this.isVisibilidadFK_IdImpuestoInven=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdImpuestoInven) {this.jTabbedPaneBusquedasProductoImpuesto.remove(jPanelFK_IdImpuestoInvenProductoImpuesto);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoImpuesto.remove(jPanelFK_IdProductoProductoImpuesto);}
		}
		
	}

	public void setVisibilidadBusquedasParaImpuestoInven(Boolean isParaImpuestoInven){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaImpuestoInvenNegation=!isParaImpuestoInven;

			this.isVisibilidadFK_IdBodega=isParaImpuestoInvenNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoImpuesto.remove(jPanelFK_IdBodegaProductoImpuesto);}

			this.isVisibilidadFK_IdImpuestoInven=isParaImpuestoInven;
			if(!this.isVisibilidadFK_IdImpuestoInven) {this.jTabbedPaneBusquedasProductoImpuesto.remove(jPanelFK_IdImpuestoInvenProductoImpuesto);}

			this.isVisibilidadFK_IdProducto=isParaImpuestoInvenNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoImpuesto.remove(jPanelFK_IdProductoProductoImpuesto);}
		}
		
	}
	
	
	
	

	public String registrarSesionProductoImpuestoParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(productoimpuestoSessionBean==null) {
				productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(productoimpuestoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.productoimpuestoFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ProductoImpuestoConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionProductoImpuesto(true);
			//productoSessionBean.setlidProductoImpuestoActual(this.idProductoImpuestoActual);

			productoimpuestoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoImpuesto(true);
			productoimpuestoSessionBean.setlIdProductoImpuestoActualForeignKey(this.idProductoImpuestoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoImpuestoSessionBean productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
		
		if(this.productoimpuestoSessionBean==null) {
			this.productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
		}
		
		this.productoimpuestoSessionBean.setsUltimaBusquedaProductoImpuesto(this.getsAccionBusqueda());
		this.productoimpuestoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productoimpuestoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			productoimpuestoSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			productoimpuestoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdImpuestoInven")) {
			productoimpuestoSessionBean.setid_impuesto_inven(this.getid_impuesto_invenFK_IdImpuestoInven());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			productoimpuestoSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			productoimpuestoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoImpuestoSessionBean productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
		
		if(this.productoimpuestoSessionBean==null) {
			this.productoimpuestoSessionBean=new ProductoImpuestoSessionBean();
		}
		
		if(this.productoimpuestoSessionBean.getsUltimaBusquedaProductoImpuesto()!=null&&!this.productoimpuestoSessionBean.getsUltimaBusquedaProductoImpuesto().equals("")) {
			this.setsAccionBusqueda(productoimpuestoSessionBean.getsUltimaBusquedaProductoImpuesto());
			this.setiNumeroPaginacion(productoimpuestoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productoimpuestoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(productoimpuestoSessionBean.getid_bodega());
				productoimpuestoSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(productoimpuestoSessionBean.getid_empresa());
				productoimpuestoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdImpuestoInven")) {
				this.setid_impuesto_invenFK_IdImpuestoInven(productoimpuestoSessionBean.getid_impuesto_inven());
				productoimpuestoSessionBean.setid_impuesto_inven(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(productoimpuestoSessionBean.getid_producto());
				productoimpuestoSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(productoimpuestoSessionBean.getid_sucursal());
				productoimpuestoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.productoimpuestoSessionBean.setsUltimaBusquedaProductoImpuesto("");
		this.productoimpuestoSessionBean.setiNumeroPaginacion(ProductoImpuestoConstantesFunciones.INUMEROPAGINACION);
		this.productoimpuestoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoImpuesto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoImpuesto() {
		this.updateBorderResaltarBusquedasFormularioProductoImpuesto();
		this.updateVisibilidadBusquedasFormularioProductoImpuesto();
		this.updateHabilitarBusquedasFormularioProductoImpuesto();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoImpuesto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoImpuesto.getComponents().length>0) {
	

		if(this.productoimpuestoConstantesFunciones.resaltarFK_IdBodegaProductoImpuesto!=null) {
			index= this.jTabbedPaneBusquedasProductoImpuesto.indexOfComponent(this.jPanelFK_IdBodegaProductoImpuesto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoImpuesto.getComponent(index);
				jPanel.setBorder(this.productoimpuestoConstantesFunciones.resaltarFK_IdBodegaProductoImpuesto);
			}
		}

		if(this.productoimpuestoConstantesFunciones.resaltarFK_IdImpuestoInvenProductoImpuesto!=null) {
			index= this.jTabbedPaneBusquedasProductoImpuesto.indexOfComponent(this.jPanelFK_IdImpuestoInvenProductoImpuesto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoImpuesto.getComponent(index);
				jPanel.setBorder(this.productoimpuestoConstantesFunciones.resaltarFK_IdImpuestoInvenProductoImpuesto);
			}
		}

		if(this.productoimpuestoConstantesFunciones.resaltarFK_IdProductoProductoImpuesto!=null) {
			index= this.jTabbedPaneBusquedasProductoImpuesto.indexOfComponent(this.jPanelFK_IdProductoProductoImpuesto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoImpuesto.getComponent(index);
				jPanel.setBorder(this.productoimpuestoConstantesFunciones.resaltarFK_IdProductoProductoImpuesto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoImpuesto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoImpuesto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoImpuesto.indexOfComponent(this.jPanelFK_IdBodegaProductoImpuesto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoImpuesto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoimpuestoConstantesFunciones.mostrarFK_IdBodegaProductoImpuesto);
			if(!this.productoimpuestoConstantesFunciones.mostrarFK_IdBodegaProductoImpuesto && index>-1) {
				this.jTabbedPaneBusquedasProductoImpuesto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoImpuesto.indexOfComponent(this.jPanelFK_IdImpuestoInvenProductoImpuesto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoImpuesto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoimpuestoConstantesFunciones.mostrarFK_IdImpuestoInvenProductoImpuesto);
			if(!this.productoimpuestoConstantesFunciones.mostrarFK_IdImpuestoInvenProductoImpuesto && index>-1) {
				this.jTabbedPaneBusquedasProductoImpuesto.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoImpuesto.indexOfComponent(this.jPanelFK_IdProductoProductoImpuesto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoImpuesto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoimpuestoConstantesFunciones.mostrarFK_IdProductoProductoImpuesto);
			if(!this.productoimpuestoConstantesFunciones.mostrarFK_IdProductoProductoImpuesto && index>-1) {
				this.jTabbedPaneBusquedasProductoImpuesto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoImpuesto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoImpuesto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoImpuesto.indexOfComponent(this.jPanelFK_IdBodegaProductoImpuesto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoImpuesto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoimpuestoConstantesFunciones.activarFK_IdBodegaProductoImpuesto);
				this.jTabbedPaneBusquedasProductoImpuesto.setEnabledAt(index,this.productoimpuestoConstantesFunciones.activarFK_IdBodegaProductoImpuesto);
			}

			index= this.jTabbedPaneBusquedasProductoImpuesto.indexOfComponent(this.jPanelFK_IdImpuestoInvenProductoImpuesto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoImpuesto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoimpuestoConstantesFunciones.activarFK_IdImpuestoInvenProductoImpuesto);
				this.jTabbedPaneBusquedasProductoImpuesto.setEnabledAt(index,this.productoimpuestoConstantesFunciones.activarFK_IdImpuestoInvenProductoImpuesto);
			}

			index= this.jTabbedPaneBusquedasProductoImpuesto.indexOfComponent(this.jPanelFK_IdProductoProductoImpuesto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoImpuesto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoimpuestoConstantesFunciones.activarFK_IdProductoProductoImpuesto);
				this.jTabbedPaneBusquedasProductoImpuesto.setEnabledAt(index,this.productoimpuestoConstantesFunciones.activarFK_IdProductoProductoImpuesto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoImpuesto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasProductoImpuesto.indexOfComponent(this.jPanelFK_IdBodegaProductoImpuesto);

			this.jTabbedPaneBusquedasProductoImpuesto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoImpuesto.getComponent(index);

			this.productoimpuestoConstantesFunciones.setResaltarFK_IdBodegaProductoImpuesto(resaltar);

			jPanel.setBorder(this.productoimpuestoConstantesFunciones.resaltarFK_IdBodegaProductoImpuesto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdImpuestoInven")) {
			index= this.jTabbedPaneBusquedasProductoImpuesto.indexOfComponent(this.jPanelFK_IdImpuestoInvenProductoImpuesto);

			this.jTabbedPaneBusquedasProductoImpuesto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoImpuesto.getComponent(index);

			this.productoimpuestoConstantesFunciones.setResaltarFK_IdImpuestoInvenProductoImpuesto(resaltar);

			jPanel.setBorder(this.productoimpuestoConstantesFunciones.resaltarFK_IdImpuestoInvenProductoImpuesto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasProductoImpuesto.indexOfComponent(this.jPanelFK_IdProductoProductoImpuesto);

			this.jTabbedPaneBusquedasProductoImpuesto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoImpuesto.getComponent(index);

			this.productoimpuestoConstantesFunciones.setResaltarFK_IdProductoProductoImpuesto(resaltar);

			jPanel.setBorder(this.productoimpuestoConstantesFunciones.resaltarFK_IdProductoProductoImpuesto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoImpuesto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoImpuesto() throws Exception {

		if(this.jInternalFrameDetalleFormProductoImpuesto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoImpuesto();
		this.updateVisibilidadResaltarControlesFormularioProductoImpuesto();
		this.updateHabilitarResaltarControlesFormularioProductoImpuesto();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoImpuesto() throws Exception {
		if(this.jInternalFrameDetalleFormProductoImpuesto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productoimpuestoConstantesFunciones.resaltaridProductoImpuesto!=null && this.jInternalFrameDetalleFormProductoImpuesto!=null) {this.jInternalFrameDetalleFormProductoImpuesto.jLabelidProductoImpuesto.setBorder(this.productoimpuestoConstantesFunciones.resaltaridProductoImpuesto);}
		if(this.productoimpuestoConstantesFunciones.resaltarid_empresaProductoImpuesto!=null && this.jInternalFrameDetalleFormProductoImpuesto!=null) {this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_empresaProductoImpuesto.setBorder(this.productoimpuestoConstantesFunciones.resaltarid_empresaProductoImpuesto);}
		if(this.productoimpuestoConstantesFunciones.resaltarid_sucursalProductoImpuesto!=null && this.jInternalFrameDetalleFormProductoImpuesto!=null) {this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_sucursalProductoImpuesto.setBorder(this.productoimpuestoConstantesFunciones.resaltarid_sucursalProductoImpuesto);}
		if(this.productoimpuestoConstantesFunciones.resaltarid_bodegaProductoImpuesto!=null && this.jInternalFrameDetalleFormProductoImpuesto!=null) {this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_bodegaProductoImpuesto.setBorder(this.productoimpuestoConstantesFunciones.resaltarid_bodegaProductoImpuesto);}
		if(this.productoimpuestoConstantesFunciones.resaltarid_productoProductoImpuesto!=null && this.jInternalFrameDetalleFormProductoImpuesto!=null) {this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_productoProductoImpuesto.setBorder(this.productoimpuestoConstantesFunciones.resaltarid_productoProductoImpuesto);}
		if(this.productoimpuestoConstantesFunciones.resaltarid_impuesto_invenProductoImpuesto!=null && this.jInternalFrameDetalleFormProductoImpuesto!=null) {this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_impuesto_invenProductoImpuesto.setBorder(this.productoimpuestoConstantesFunciones.resaltarid_impuesto_invenProductoImpuesto);}
		if(this.productoimpuestoConstantesFunciones.resaltarporcentajeProductoImpuesto!=null && this.jInternalFrameDetalleFormProductoImpuesto!=null) {this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldporcentajeProductoImpuesto.setBorder(this.productoimpuestoConstantesFunciones.resaltarporcentajeProductoImpuesto);}
		if(this.productoimpuestoConstantesFunciones.resaltarvalorProductoImpuesto!=null && this.jInternalFrameDetalleFormProductoImpuesto!=null) {this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldvalorProductoImpuesto.setBorder(this.productoimpuestoConstantesFunciones.resaltarvalorProductoImpuesto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoImpuesto() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoImpuesto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
	
		//this.jInternalFrameDetalleFormProductoImpuesto.jLabelidProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostraridProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jPanelidProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostraridProductoImpuesto);
		//this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_empresaProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostrarid_empresaProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jPanelid_empresaProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostrarid_empresaProductoImpuesto);
		//this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_sucursalProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostrarid_sucursalProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jPanelid_sucursalProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostrarid_sucursalProductoImpuesto);
		//this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_bodegaProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostrarid_bodegaProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jPanelid_bodegaProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostrarid_bodegaProductoImpuesto);
		//this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_productoProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostrarid_productoProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jPanelid_productoProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostrarid_productoProductoImpuesto);
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_productoProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostrarid_productoProductoImpuesto);
		//this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_impuesto_invenProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostrarid_impuesto_invenProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jPanelid_impuesto_invenProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostrarid_impuesto_invenProductoImpuesto);
		//this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldporcentajeProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostrarporcentajeProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jPanelporcentajeProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostrarporcentajeProductoImpuesto);
		//this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldvalorProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostrarvalorProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jPanelvalorProductoImpuesto.setVisible(this.productoimpuestoConstantesFunciones.mostrarvalorProductoImpuesto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoImpuesto() throws Exception {
		if(this.jInternalFrameDetalleFormProductoImpuesto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoImpuesto!=null) {
	
		this.jInternalFrameDetalleFormProductoImpuesto.jLabelidProductoImpuesto.setEnabled(this.productoimpuestoConstantesFunciones.activaridProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_empresaProductoImpuesto.setEnabled(this.productoimpuestoConstantesFunciones.activarid_empresaProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_sucursalProductoImpuesto.setEnabled(this.productoimpuestoConstantesFunciones.activarid_sucursalProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_bodegaProductoImpuesto.setEnabled(this.productoimpuestoConstantesFunciones.activarid_bodegaProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_productoProductoImpuesto.setEnabled(this.productoimpuestoConstantesFunciones.activarid_productoProductoImpuesto);
			this.jInternalFrameDetalleFormProductoImpuesto.jButtonid_productoProductoImpuesto.setEnabled(this.productoimpuestoConstantesFunciones.activarid_productoProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jComboBoxid_impuesto_invenProductoImpuesto.setEnabled(this.productoimpuestoConstantesFunciones.activarid_impuesto_invenProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldporcentajeProductoImpuesto.setEnabled(this.productoimpuestoConstantesFunciones.activarporcentajeProductoImpuesto);
		this.jInternalFrameDetalleFormProductoImpuesto.jTextFieldvalorProductoImpuesto.setEnabled(this.productoimpuestoConstantesFunciones.activarvalorProductoImpuesto);
		}
	}
	
		
}