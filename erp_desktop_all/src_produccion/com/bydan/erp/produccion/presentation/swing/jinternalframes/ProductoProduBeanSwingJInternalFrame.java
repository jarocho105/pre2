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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;




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

import com.bydan.erp.produccion.util.ProductoProduConstantesFunciones;
import com.bydan.erp.produccion.util.ProductoProduParameterReturnGeneral;
//import com.bydan.erp.produccion.util.ProductoProduParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.ProductoProduBean;
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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;

import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

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


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProductoProduBeanSwingJInternalFrame extends ProductoProduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoProduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoProdu> productoproduValidator = new ClassValidator<ProductoProdu>(ProductoProdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoProdu productoprodu;	
	public ProductoProdu productoproduAux;
	public ProductoProdu productoproduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoProdu productoproduTotales;
	public Long idProductoProduActual;
	public Long iIdNuevoProductoProdu=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboProductoDefiProdu="";

	public List<ProductoDefiProdu> productodefiprodusForeignKey;

	public List<ProductoDefiProdu> getproductodefiprodusForeignKey() {
		return productodefiprodusForeignKey;
	}

	public void setproductodefiprodusForeignKey(List<ProductoDefiProdu> productodefiprodusForeignKey) {
		this.productodefiprodusForeignKey = productodefiprodusForeignKey;
	}

	//OBJETO FK ACTUAL
	public ProductoDefiProdu productodefiproduForeignKey;

	public ProductoDefiProdu getproductodefiproduForeignKey() {
		return productodefiproduForeignKey;
	}

	public void setproductodefiproduForeignKey(ProductoDefiProdu productodefiproduForeignKey) {
		this.productodefiproduForeignKey = productodefiproduForeignKey;
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
	
	public Boolean isPermisoTodoProductoProdu;
	public Boolean isPermisoNuevoProductoProdu;
	public Boolean isPermisoActualizarProductoProdu;
	public Boolean isPermisoActualizarOriginalProductoProdu;
	public Boolean isPermisoEliminarProductoProdu;
	public Boolean isPermisoGuardarCambiosProductoProdu;
	public Boolean isPermisoConsultaProductoProdu;
	public Boolean isPermisoBusquedaProductoProdu;
	public Boolean isPermisoReporteProductoProdu;
	public Boolean isPermisoPaginacionMedioProductoProdu;
	public Boolean isPermisoPaginacionAltoProductoProdu;
	public Boolean isPermisoPaginacionTodoProductoProdu;
	public Boolean isPermisoCopiarProductoProdu;
	public Boolean isPermisoVerFormProductoProdu;
	public Boolean isPermisoDuplicarProductoProdu;
	public Boolean isPermisoOrdenProductoProdu;
	
	
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
	
	public ProductoProduParameterReturnGeneral productoproduReturnGeneral;
	public ProductoProduParameterReturnGeneral productoproduParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoProdu=false;
	public Boolean esParaAccionDesdeFormularioProductoProdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoProduSessionBeanAdditional productoproduSessionBeanAdditional=null;
	
	public ProductoProduSessionBeanAdditional getProductoProduSessionBeanAdditional() {
		return this.productoproduSessionBeanAdditional;
	}
	
	public void setProductoProduSessionBeanAdditional(ProductoProduSessionBeanAdditional productoproduSessionBeanAdditional) {
		try {
			this.productoproduSessionBeanAdditional=productoproduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoProduBeanSwingJInternalFrameAdditional productoproduBeanSwingJInternalFrameAdditional=null;
	//public class ProductoProduBeanSwingJInternalFrame
	
	public ProductoProduBeanSwingJInternalFrameAdditional getProductoProduBeanSwingJInternalFrameAdditional() {
		return this.productoproduBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoProduBeanSwingJInternalFrameAdditional(ProductoProduBeanSwingJInternalFrameAdditional productoproduBeanSwingJInternalFrameAdditional) {
		try {
			this.productoproduBeanSwingJInternalFrameAdditional=productoproduBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoProduLogic productoproduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoProdu productoproduBean;
	public ProductoProduConstantesFunciones productoproduConstantesFunciones;
	//public ProductoProduParameterReturnGeneral productoproduReturnGeneral;
	
	//FK
	
	public ProductoDefiProduLogic productodefiproduLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoProdu> productoprodus;	
	//public List<ProductoProdu> productoprodusEliminados;
	//public List<ProductoProdu> productoprodusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoProdu=false;
	public Boolean isVisibilidadCeldaDuplicarProductoProdu=true;
	public Boolean isVisibilidadCeldaCopiarProductoProdu=true;
	public Boolean isVisibilidadCeldaVerFormProductoProdu=true;
	public Boolean isVisibilidadCeldaOrdenProductoProdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoProdu=false;
	public Boolean isVisibilidadCeldaModificarProductoProdu=false;
	public Boolean isVisibilidadCeldaActualizarProductoProdu=false;
	public Boolean isVisibilidadCeldaEliminarProductoProdu=false;
	public Boolean isVisibilidadCeldaCancelarProductoProdu=false;
	public Boolean isVisibilidadCeldaGuardarProductoProdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoProdu=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdProductoDefiProdu=false;
	public Boolean isVisibilidadFK_IdUnidadUnad=false;
	
	public Long getiIdNuevoProductoProdu() {
		return this.iIdNuevoProductoProdu;
	}

	public void setiIdNuevoProductoProdu(Long iIdNuevoProductoProdu) {
		this.iIdNuevoProductoProdu = iIdNuevoProductoProdu;
	}
	
	public Long getidProductoProduActual() {
		return this.idProductoProduActual;
	}

	public void setidProductoProduActual(Long idProductoProduActual) {
		this.idProductoProduActual = idProductoProduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoProdu getproductoprodu() {
		return this.productoprodu;
	}

	public void setproductoprodu(ProductoProdu productoprodu) {
		this.productoprodu = productoprodu;
	}
	
	public ProductoProdu getproductoproduAux() {
		return this.productoproduAux;
	}

	public void setproductoproduAux(ProductoProdu productoproduAux) {
		this.productoproduAux = productoproduAux;
	}				
	
	public ProductoProdu getproductoproduAnterior() {
		return this.productoproduAnterior;
	}

	public void setproductoproduAnterior(ProductoProdu productoproduAnterior) {
		this.productoproduAnterior = productoproduAnterior;
	}	
	
	public ProductoProdu getproductoproduTotales() {
		return this.productoproduTotales;
	}

	public void setproductoproduTotales(ProductoProdu productoproduTotales) {
		this.productoproduTotales = productoproduTotales;
	}	
	
	public ProductoProdu getproductoproduBean() {
		return this.productoproduBean;
	}

	public void setproductoproduBean(ProductoProdu productoproduBean) {
		this.productoproduBean = productoproduBean;
	}	
	
	public ProductoProduParameterReturnGeneral getproductoproduReturnGeneral() {
		return this.productoproduReturnGeneral;
	}

	public void setproductoproduReturnGeneral(ProductoProduParameterReturnGeneral productoproduReturnGeneral) {
		this.productoproduReturnGeneral = productoproduReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
	}

	public Long id_producto_defi_produFK_IdProductoDefiProdu=-1L;

	public Long getid_producto_defi_produFK_IdProductoDefiProdu() {
		return this.id_producto_defi_produFK_IdProductoDefiProdu;
	}

	public void setid_producto_defi_produFK_IdProductoDefiProdu(Long id_producto_defi_produFK_IdProductoDefiProdu) {
		this.id_producto_defi_produFK_IdProductoDefiProdu = id_producto_defi_produFK_IdProductoDefiProdu;
	}

	public Long id_unidadFK_IdUnidadUnad=-1L;

	public Long getid_unidadFK_IdUnidadUnad() {
		return this.id_unidadFK_IdUnidadUnad;
	}

	public void setid_unidadFK_IdUnidadUnad(Long id_unidadFK_IdUnidadUnad) {
		this.id_unidadFK_IdUnidadUnad = id_unidadFK_IdUnidadUnad;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProductoProduLogic getProductoProduLogic()	{		
		return productoproduLogic;
	}

	public void setProductoProduLogic(ProductoProduLogic productoproduLogic) {
		this.productoproduLogic = productoproduLogic;
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
	
	public Boolean getIsEsNuevoProductoProdu() {
		return isEsNuevoProductoProdu;
	}

	public void setIsEsNuevoProductoProdu(Boolean isEsNuevoProductoProdu) {
		this.isEsNuevoProductoProdu = isEsNuevoProductoProdu;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoProdu() {
		return esParaAccionDesdeFormularioProductoProdu;
	}
	
	public void setEsParaAccionDesdeFormularioProductoProdu(Boolean esParaAccionDesdeFormularioProductoProdu) {
		this.esParaAccionDesdeFormularioProductoProdu = esParaAccionDesdeFormularioProductoProdu;
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
	
	
	public void cargarCombosProductoDefiProdusForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.productodefiprodusForeignKey=new ArrayList<ProductoDefiProdu>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProductoDefiProduLogic productodefiproduLogic=new ProductoDefiProduLogic();

			productodefiproduLogic.getProductoDefiProduDataAccess().setIsForForeingKeyData(true);

			if(this.productoproduSessionBean==null) {
				this.productoproduSessionBean=new ProductoProduSessionBean();
			}

			if(!this.productoproduSessionBean.getisBusquedaDesdeForeignKeySesionProductoDefiProdu()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productodefiproduLogic.getProductoDefiProduDataAccess().setIsForForeingKeyData(true);

					productodefiproduLogic.getTodosProductoDefiProdusWithConnection(sFinalQuery,new Pagination());

					this.productodefiprodusForeignKey=productodefiproduLogic.getProductoDefiProdus();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProductoDefiProdu(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					productodefiproduLogic.getEntityWithConnection(productoproduSessionBean.getlidProductoDefiProduActual());
					this.productodefiprodusForeignKey.add(productodefiproduLogic.getProductoDefiProdu());
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

			bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.productoproduSessionBean==null) {
				this.productoproduSessionBean=new ProductoProduSessionBean();
			}

			if(!this.productoproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

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
					bodegaLogic.getEntityWithConnection(productoproduSessionBean.getlidBodegaActual());
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

			if(this.productoproduSessionBean==null) {
				this.productoproduSessionBean=new ProductoProduSessionBean();
			}

			if(!this.productoproduSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(productoproduSessionBean.getlidProductoActual());
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

			if(this.productoproduSessionBean==null) {
				this.productoproduSessionBean=new ProductoProduSessionBean();
			}

			if(!this.productoproduSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
					unidadLogic.getEntityWithConnection(productoproduSessionBean.getlidUnidadActual());
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

	
	
	public void setActualProductoDefiProduForeignKey(Long idProductoDefiProduSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			ProductoDefiProdu  productodefiproduTemp=null;

			for(ProductoDefiProdu productodefiproduAux:productodefiprodusForeignKey) {
				if(productodefiproduAux.getId()!=null && productodefiproduAux.getId().equals(idProductoDefiProduSeleccionado)) {
					productodefiproduTemp=productodefiproduAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(productodefiproduTemp!=null) {

					if(this.productoprodu!=null) {
						this.productoprodu.setProductoDefiProdu(productodefiproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProdu!=null) {
						this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_producto_defi_produProductoProdu.setSelectedItem(productodefiproduTemp);
					}
				} else {
					//jComboBoxid_producto_defi_produProductoProdu.setSelectedItem(productodefiproduTemp);
					if(this.jInternalFrameDetalleFormProductoProdu!=null) {
						if(this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_producto_defi_produProductoProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_producto_defi_produProductoProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProductoDefiProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(productodefiproduTemp!=null && jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu!=null) {
						jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu.setSelectedItem(productodefiproduTemp);
					} else {
						if(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu!=null) {
							//jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu.setSelectedItem(productodefiproduTemp);
							if(jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu.getItemCount()>0) {
								jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu.setSelectedIndex(0);
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

	public String getActualProductoDefiProduForeignKeyDescripcion(Long idProductoDefiProduSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			ProductoDefiProdu  productodefiproduTemp=null;

			for(ProductoDefiProdu productodefiproduAux:productodefiprodusForeignKey) {
				if(productodefiproduAux.getId()!=null && productodefiproduAux.getId().equals(idProductoDefiProduSeleccionado)) {
					productodefiproduTemp=productodefiproduAux;
					break;
				}
			}


			sDescripcion=ProductoDefiProduConstantesFunciones.getProductoDefiProduDescripcion(productodefiproduTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProductoDefiProduForeignKeyGenerico(Long idProductoDefiProduSeleccionado,JComboBox jComboBoxid_producto_defi_produProductoProduGenerico)throws Exception
	{
		try
		{
			ProductoDefiProdu  productodefiproduTemp=null;

			for(ProductoDefiProdu productodefiproduAux:productodefiprodusForeignKey) {
				if(productodefiproduAux.getId()!=null && productodefiproduAux.getId().equals(idProductoDefiProduSeleccionado)) {
					productodefiproduTemp=productodefiproduAux;
					break;
				}
			}

			if(productodefiproduTemp!=null) {
				jComboBoxid_producto_defi_produProductoProduGenerico.setSelectedItem(productodefiproduTemp);
			} else {
				if(jComboBoxid_producto_defi_produProductoProduGenerico!=null && jComboBoxid_producto_defi_produProductoProduGenerico.getItemCount()>0) {
					jComboBoxid_producto_defi_produProductoProduGenerico.setSelectedIndex(0);
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

					if(this.productoprodu!=null) {
						this.productoprodu.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProdu!=null) {
						this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProductoProdu.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProductoProdu!=null) {
						if(this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaProductoProdu!=null) {
						jComboBoxid_bodegaFK_IdBodegaProductoProdu.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaProductoProdu!=null) {
							//jComboBoxid_bodegaFK_IdBodegaProductoProdu.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaProductoProdu.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaProductoProdu.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProductoProduGenerico)throws Exception
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
				jComboBoxid_bodegaProductoProduGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProductoProduGenerico!=null && jComboBoxid_bodegaProductoProduGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProductoProduGenerico.setSelectedIndex(0);
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

					if(this.productoprodu!=null) {
						this.productoprodu.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProdu!=null) {
						this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProductoProdu.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProductoProdu!=null) {
						if(this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoProductoProdu!=null) {
						jComboBoxid_productoFK_IdProductoProductoProdu.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoProductoProdu!=null) {
							//jComboBoxid_productoFK_IdProductoProductoProdu.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoProductoProdu.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoProductoProdu.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProductoProduGenerico)throws Exception
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
				jComboBoxid_productoProductoProduGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProductoProduGenerico!=null && jComboBoxid_productoProductoProduGenerico.getItemCount()>0) {
					jComboBoxid_productoProductoProduGenerico.setSelectedIndex(0);
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

					if(this.productoprodu!=null) {
						this.productoprodu.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormProductoProdu!=null) {
						this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_unidadProductoProdu.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadProductoProdu.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormProductoProdu!=null) {
						if(this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_unidadProductoProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_unidadProductoProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidadUnad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadUnadProductoProdu!=null) {
						jComboBoxid_unidadFK_IdUnidadUnadProductoProdu.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadUnadProductoProdu!=null) {
							//jComboBoxid_unidadFK_IdUnidadUnadProductoProdu.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadUnadProductoProdu.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadUnadProductoProdu.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadProductoProduGenerico)throws Exception
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
				jComboBoxid_unidadProductoProduGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadProductoProduGenerico!=null && jComboBoxid_unidadProductoProduGenerico.getItemCount()>0) {
					jComboBoxid_unidadProductoProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoDefiProduForeignKey(ProductoProdu productoprodu,JComboBox jComboBoxid_producto_defi_produProductoProduGenerico)throws Exception
	{
		try
		{
			ProductoDefiProdu  productodefiproduAux=new ProductoDefiProdu();

			if(jComboBoxid_producto_defi_produProductoProduGenerico==null) {
				productodefiproduAux=(ProductoDefiProdu)this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_producto_defi_produProductoProdu.getSelectedItem();
			} else {
				productodefiproduAux=(ProductoDefiProdu)jComboBoxid_producto_defi_produProductoProduGenerico.getSelectedItem();
			}

			if(productodefiproduAux!=null && productodefiproduAux.getId()!=null) {
				productoprodu.setid_producto_defi_produ(productodefiproduAux.getId());
				productoprodu.setproductodefiprodu_descripcion(ProductoProduConstantesFunciones.getProductoDefiProduDescripcion(productodefiproduAux));
				productoprodu.setProductoDefiProdu(productodefiproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProductoProdu productoprodu,JComboBox jComboBoxid_bodegaProductoProduGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProductoProduGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProductoProduGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				productoprodu.setid_bodega(bodegaAux.getId());
				productoprodu.setbodega_descripcion(ProductoProduConstantesFunciones.getBodegaDescripcion(bodegaAux));
				productoprodu.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProductoProdu productoprodu,JComboBox jComboBoxid_productoProductoProduGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProductoProduGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProductoProduGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				productoprodu.setid_producto(productoAux.getId());
				productoprodu.setproducto_descripcion(ProductoProduConstantesFunciones.getProductoDescripcion(productoAux));
				productoprodu.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(ProductoProdu productoprodu,JComboBox jComboBoxid_unidadProductoProduGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadProductoProduGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_unidadProductoProdu.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadProductoProduGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				productoprodu.setid_unidad(unidadAux.getId());
				productoprodu.setunidad_descripcion(ProductoProduConstantesFunciones.getUnidadDescripcion(unidadAux));
				productoprodu.setUnidad(unidadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductoDefiProdusForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProductoDefiProdu=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProdu!=null) { 
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_producto_defi_produProductoProdu.removeAllItems();

							for(ProductoDefiProdu productodefiprodu:this.productodefiprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_producto_defi_produProductoProdu.addItem(productodefiprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProdu!=null) { 
					}

					if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProductoDefiProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu.removeAllItems();

							for(ProductoDefiProdu productodefiprodu:this.productodefiprodusForeignKey) {
								this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu.addItem(productodefiprodu);
							}
						}

						if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProdu!=null) { 
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProdu!=null) { 
					}

					if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProductoProdu.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaProductoProdu.addItem(bodega);
							}
						}

						if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProdu!=null) { 
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProdu!=null) { 
					}

					if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoProdu.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoProductoProdu.addItem(producto);
							}
						}

						if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoProdu!=null) { 
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_unidadProductoProdu.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_unidadProductoProdu.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoProdu!=null) { 
					}

					if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidadUnad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadUnadProductoProdu.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadUnadProductoProdu.addItem(unidad);
							}
						}

						if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameProductoDefiProduForeignKey(ProductoDefiProdu productodefiprodu,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoProdu!=null) {
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_producto_defi_produProductoProdu.setSelectedItem(productodefiprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProdu!=null) {
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_producto_defi_produProductoProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu.setSelectedItem(productodefiprodu);
						} else {
							this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoProdu!=null) {
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProdu!=null) {
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaProductoProdu.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProductoProdu.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoProdu!=null) {
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProdu!=null) {
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoProductoProdu.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoProdu.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoProdu!=null) {
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_unidadProductoProdu.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoProdu!=null) {
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_unidadProductoProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadUnadProductoProdu.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadUnadProductoProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoProdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoProduConstantesFunciones.refrescarForeignKeysDescripcionesProductoProdu(this.productoproduLogic.getProductoProdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoProduConstantesFunciones.refrescarForeignKeysDescripcionesProductoProdu(this.productoprodus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(ProductoDefiProdu.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productoproduLogic.setProductoProdus(this.productoprodus);
			productoproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoProduParameterReturnGeneral getProductoProduParameterGeneral() {
		return this.productoproduParameterGeneral;
	}
	
	public void setProductoProduParameterGeneral(ProductoProduParameterReturnGeneral productoproduParameterGeneral) {
		this.productoproduParameterGeneral = productoproduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoProdu() {
		return isPermisoTodoProductoProdu;
	}

	public void setIsPermisoTodoProductoProdu(Boolean isPermisoTodoProductoProdu) {
		this.isPermisoTodoProductoProdu = isPermisoTodoProductoProdu;
	}

	public Boolean getIsPermisoNuevoProductoProdu() {
		return isPermisoNuevoProductoProdu;
	}

	public void setIsPermisoNuevoProductoProdu(Boolean isPermisoNuevoProductoProdu) {
		this.isPermisoNuevoProductoProdu = isPermisoNuevoProductoProdu;
	}

	public Boolean getIsPermisoActualizarProductoProdu() {
		return isPermisoActualizarProductoProdu;
	}

	public void setIsPermisoActualizarProductoProdu(Boolean isPermisoActualizarProductoProdu) {
		this.isPermisoActualizarProductoProdu = isPermisoActualizarProductoProdu;
	}

	public Boolean getIsPermisoEliminarProductoProdu() {
		return isPermisoEliminarProductoProdu;
	}

	public void setIsPermisoEliminarProductoProdu(Boolean isPermisoEliminarProductoProdu) {
		this.isPermisoEliminarProductoProdu = isPermisoEliminarProductoProdu;
	}

	public Boolean getIsPermisoGuardarCambiosProductoProdu() {
		return isPermisoGuardarCambiosProductoProdu;
	}

	public void setIsPermisoGuardarCambiosProductoProdu(Boolean isPermisoGuardarCambiosProductoProdu) {
		this.isPermisoGuardarCambiosProductoProdu = isPermisoGuardarCambiosProductoProdu;
	}
	
	public Boolean getIsPermisoConsultaProductoProdu() {
		return isPermisoConsultaProductoProdu;
	}

	public void setIsPermisoConsultaProductoProdu(Boolean isPermisoConsultaProductoProdu) {
		this.isPermisoConsultaProductoProdu = isPermisoConsultaProductoProdu;
	}

	public Boolean getIsPermisoBusquedaProductoProdu() {
		return isPermisoBusquedaProductoProdu;
	}

	public void setIsPermisoBusquedaProductoProdu(Boolean isPermisoBusquedaProductoProdu) {
		this.isPermisoBusquedaProductoProdu = isPermisoBusquedaProductoProdu;
	}

	public Boolean getIsPermisoReporteProductoProdu() {
		return isPermisoReporteProductoProdu;
	}

	public void setIsPermisoReporteProductoProdu(Boolean isPermisoReporteProductoProdu) {
		this.isPermisoReporteProductoProdu = isPermisoReporteProductoProdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoProdu() {
		return isPermisoPaginacionMedioProductoProdu;
	}

	public void setIsPermisoPaginacionMedioProductoProdu(Boolean isPermisoPaginacionMedioProductoProdu) {
		this.isPermisoPaginacionMedioProductoProdu = isPermisoPaginacionMedioProductoProdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoProdu() {
		return isPermisoPaginacionTodoProductoProdu;
	}

	public void setIsPermisoPaginacionTodoProductoProdu(Boolean isPermisoPaginacionTodoProductoProdu) {
		this.isPermisoPaginacionTodoProductoProdu = isPermisoPaginacionTodoProductoProdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoProdu() {
		return isPermisoPaginacionAltoProductoProdu;
	}

	public void setIsPermisoPaginacionAltoProductoProdu(Boolean isPermisoPaginacionAltoProductoProdu) {
		this.isPermisoPaginacionAltoProductoProdu = isPermisoPaginacionAltoProductoProdu;
	}
	
	public Boolean getIsPermisoCopiarProductoProdu() {
		return isPermisoCopiarProductoProdu;
	}

	public void setIsPermisoCopiarProductoProdu(Boolean isPermisoCopiarProductoProdu) {
		this.isPermisoCopiarProductoProdu = isPermisoCopiarProductoProdu;
	}
	
	public Boolean getIsPermisoVerFormProductoProdu() {
		return isPermisoVerFormProductoProdu;
	}

	public void setIsPermisoVerFormProductoProdu(Boolean isPermisoVerFormProductoProdu) {
		this.isPermisoVerFormProductoProdu = isPermisoVerFormProductoProdu;
	}
	
	public Boolean getIsPermisoDuplicarProductoProdu() {
		return isPermisoDuplicarProductoProdu;
	}

	public void setIsPermisoDuplicarProductoProdu(Boolean isPermisoDuplicarProductoProdu) {
		this.isPermisoDuplicarProductoProdu = isPermisoDuplicarProductoProdu;
	}
	
	public Boolean getIsPermisoOrdenProductoProdu() {
		return isPermisoOrdenProductoProdu;
	}

	public void setIsPermisoOrdenProductoProdu(Boolean isPermisoOrdenProductoProdu) {
		this.isPermisoOrdenProductoProdu = isPermisoOrdenProductoProdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoProdu() {
		return isVisibilidadCeldaNuevoProductoProdu;
	}

	public void setIsVisibilidadCeldaNuevoProductoProdu(Boolean isVisibilidadCeldaNuevoProductoProdu) {
		this.isVisibilidadCeldaNuevoProductoProdu = isVisibilidadCeldaNuevoProductoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoProdu() {
		return isVisibilidadCeldaDuplicarProductoProdu;
	}

	public void setIsVisibilidadCeldaDuplicarProductoProdu(Boolean isVisibilidadCeldaDuplicarProductoProdu) {
		this.isVisibilidadCeldaDuplicarProductoProdu = isVisibilidadCeldaDuplicarProductoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoProdu() {
		return isVisibilidadCeldaCopiarProductoProdu;
	}

	public void setIsVisibilidadCeldaCopiarProductoProdu(Boolean isVisibilidadCeldaCopiarProductoProdu) {
		this.isVisibilidadCeldaCopiarProductoProdu = isVisibilidadCeldaCopiarProductoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoProdu() {
		return isVisibilidadCeldaVerFormProductoProdu;
	}

	public void setIsVisibilidadCeldaVerFormProductoProdu(Boolean isVisibilidadCeldaVerFormProductoProdu) {
		this.isVisibilidadCeldaVerFormProductoProdu = isVisibilidadCeldaVerFormProductoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoProdu() {
		return isVisibilidadCeldaOrdenProductoProdu;
	}

	public void setIsVisibilidadCeldaOrdenProductoProdu(Boolean isVisibilidadCeldaOrdenProductoProdu) {
		this.isVisibilidadCeldaOrdenProductoProdu = isVisibilidadCeldaOrdenProductoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoProdu() {
		return isVisibilidadCeldaNuevoRelacionesProductoProdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoProdu(Boolean isVisibilidadCeldaNuevoRelacionesProductoProdu) {
		this.isVisibilidadCeldaNuevoRelacionesProductoProdu = isVisibilidadCeldaNuevoRelacionesProductoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoProdu() {
		return isVisibilidadCeldaModificarProductoProdu;
	}

	public void setIsVisibilidadCeldaModificarProductoProdu(Boolean isVisibilidadCeldaModificarProductoProdu) {
		this.isVisibilidadCeldaModificarProductoProdu = isVisibilidadCeldaModificarProductoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoProdu() {
		return isVisibilidadCeldaActualizarProductoProdu;
	}

	public void setIsVisibilidadCeldaActualizarProductoProdu(Boolean isVisibilidadCeldaActualizarProductoProdu) {
		this.isVisibilidadCeldaActualizarProductoProdu = isVisibilidadCeldaActualizarProductoProdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoProdu() {
		return isVisibilidadCeldaEliminarProductoProdu;
	}

	public void setIsVisibilidadCeldaEliminarProductoProdu(Boolean isVisibilidadCeldaEliminarProductoProdu) {
		this.isVisibilidadCeldaEliminarProductoProdu = isVisibilidadCeldaEliminarProductoProdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoProdu() {
		return isVisibilidadCeldaCancelarProductoProdu;
	}

	public void setIsVisibilidadCeldaCancelarProductoProdu(Boolean isVisibilidadCeldaCancelarProductoProdu) {
		this.isVisibilidadCeldaCancelarProductoProdu = isVisibilidadCeldaCancelarProductoProdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoProdu() {
		return isVisibilidadCeldaGuardarProductoProdu;
	}

	public void setIsVisibilidadCeldaGuardarProductoProdu(Boolean isVisibilidadCeldaGuardarProductoProdu) {
		this.isVisibilidadCeldaGuardarProductoProdu = isVisibilidadCeldaGuardarProductoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoProdu() {
		return isVisibilidadCeldaGuardarCambiosProductoProdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoProdu(Boolean isVisibilidadCeldaGuardarCambiosProductoProdu) {
		this.isVisibilidadCeldaGuardarCambiosProductoProdu = isVisibilidadCeldaGuardarCambiosProductoProdu;
	}
		
	public ProductoProduSessionBean getproductoproduSessionBean() {
		return this.productoproduSessionBean;
	}
	
	public void setproductoproduSessionBean(ProductoProduSessionBean productoproduSessionBean) {
		this.productoproduSessionBean=productoproduSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	public Boolean getisVisibilidadFK_IdProductoDefiProdu() {
		return this.isVisibilidadFK_IdProductoDefiProdu;
	}

	public void setisVisibilidadFK_IdProductoDefiProdu(Boolean isVisibilidadFK_IdProductoDefiProdu) {
		this.isVisibilidadFK_IdProductoDefiProdu=isVisibilidadFK_IdProductoDefiProdu;
	}

	public Boolean getisVisibilidadFK_IdUnidadUnad() {
		return this.isVisibilidadFK_IdUnidadUnad;
	}

	public void setisVisibilidadFK_IdUnidadUnad(Boolean isVisibilidadFK_IdUnidadUnad) {
		this.isVisibilidadFK_IdUnidadUnad=isVisibilidadFK_IdUnidadUnad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoProdu(ProductoProdu productoprodu)throws Exception {
		try {
			
				this.setActualParaGuardarProductoDefiProduForeignKey(productoprodu,null);
				this.setActualParaGuardarBodegaForeignKey(productoprodu,null);
				this.setActualParaGuardarProductoForeignKey(productoprodu,null);
				this.setActualParaGuardarUnidadForeignKey(productoprodu,null);
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
	
	public void bugActualizarReferenciaActual(ProductoProdu productoprodu,ProductoProdu productoproduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoProdu(productoprodu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productoproduAux.setId(productoprodu.getId());
		productoproduAux.setVersionRow(productoprodu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoProdu();
		
			int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoProdu(this.productoprodu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productoproduValidator.getInvalidValues(this.productoprodu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productoproduLogic.setDatosCliente(datosCliente);
			productoproduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productoproduAux=new  ProductoProdu();
				
				productoproduAux.setIsNew(true);
				productoproduAux.setIsChanged(true);
				
				productoproduAux.setProductoProduOriginal(this.productoprodu);
				
				productoproduAux.setId(this.productoprodu.getId());	
				productoproduAux.setVersionRow(this.productoprodu.getVersionRow());	
				productoproduAux.setid_producto_defi_produ(this.productoprodu.getid_producto_defi_produ());	
				productoproduAux.setid_bodega(this.productoprodu.getid_bodega());	
				productoproduAux.setid_producto(this.productoprodu.getid_producto());	
				productoproduAux.setid_unidad(this.productoprodu.getid_unidad());	
				productoproduAux.setporcentaje(this.productoprodu.getporcentaje());	
				productoproduAux.setcantidad(this.productoprodu.getcantidad());	
				productoproduAux.setcosto(this.productoprodu.getcosto());	
				productoproduAux.setcosto_total(this.productoprodu.getcosto_total());	
				productoproduAux.setdescripcion(this.productoprodu.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productoproduAux,productoproduLogic.getProductoProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoproduAux,productoprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productoproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproduLogic.saveProductoProdus();//WithConnection
						//productoproduLogic.getSetVersionRowProductoProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoprodu,productoproduAux);
					
					this.refrescarForeignKeysDescripcionesProductoProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoproduLogic.saveProductoProduRelaciones(productoproduAux);//WithConnection
								//productoproduLogic.getSetVersionRowProductoProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoprodu,productoproduAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoproduAux,productoproduLogic.getProductoProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoproduAux,productoprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoprodu,productoproduAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productoproduAux=new  ProductoProdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productoproduSessionBean.getEsGuardarRelacionado() 
					|| (this.productoproduSessionBean.getEsGuardarRelacionado() && this.productoprodu.getId()>=0)) {
						
					productoproduAux.setIsNew(false);
				}
				
				productoproduAux.setIsDeleted(false);
			
				productoproduAux.setId(this.productoprodu.getId());	
				productoproduAux.setVersionRow(this.productoprodu.getVersionRow());	
				productoproduAux.setid_producto_defi_produ(this.productoprodu.getid_producto_defi_produ());	
				productoproduAux.setid_bodega(this.productoprodu.getid_bodega());	
				productoproduAux.setid_producto(this.productoprodu.getid_producto());	
				productoproduAux.setid_unidad(this.productoprodu.getid_unidad());	
				productoproduAux.setporcentaje(this.productoprodu.getporcentaje());	
				productoproduAux.setcantidad(this.productoprodu.getcantidad());	
				productoproduAux.setcosto(this.productoprodu.getcosto());	
				productoproduAux.setcosto_total(this.productoprodu.getcosto_total());	
				productoproduAux.setdescripcion(this.productoprodu.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoproduAux,productoproduLogic.getProductoProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoproduAux,productoprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productoproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproduLogic.saveProductoProdus();//WithConnection
						//productoproduLogic.getSetVersionRowProductoProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoprodu,productoproduAux);
					
					this.refrescarForeignKeysDescripcionesProductoProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoproduLogic.saveProductoProduRelaciones(productoproduAux);//WithConnection
								//productoproduLogic.getSetVersionRowProductoProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoprodu,productoproduAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoproduAux,productoproduLogic.getProductoProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoproduAux,productoprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoprodu,productoproduAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productoproduAux=new  ProductoProdu();
				
				productoproduAux.setIsNew(false);
				productoproduAux.setIsChanged(false);
				
				productoproduAux.setIsDeleted(true);
				
				productoproduAux.setId(this.productoprodu.getId());	
				productoproduAux.setVersionRow(this.productoprodu.getVersionRow());	
				productoproduAux.setid_producto_defi_produ(this.productoprodu.getid_producto_defi_produ());	
				productoproduAux.setid_bodega(this.productoprodu.getid_bodega());	
				productoproduAux.setid_producto(this.productoprodu.getid_producto());	
				productoproduAux.setid_unidad(this.productoprodu.getid_unidad());	
				productoproduAux.setporcentaje(this.productoprodu.getporcentaje());	
				productoproduAux.setcantidad(this.productoprodu.getcantidad());	
				productoproduAux.setcosto(this.productoprodu.getcosto());	
				productoproduAux.setcosto_total(this.productoprodu.getcosto_total());	
				productoproduAux.setdescripcion(this.productoprodu.getdescripcion());	
				
				if(this.productoproduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productoproduAux.getId()>=0) {	
						this.productoprodusEliminados.add(productoproduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productoproduAux,productoproduLogic.getProductoProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoproduAux,productoprodus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productoproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproduLogic.saveProductoProdus();//WithConnection
						//productoproduLogic.getSetVersionRowProductoProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoproduLogic.saveProductoProduRelaciones(productoproduAux);//WithConnection
								//productoproduLogic.getSetVersionRowProductoProdus();//WithConnection
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
							if(this.productoproduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productoproduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productoproduAux,productoproduLogic.getProductoProdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productoproduAux,productoprodus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.getProductoProdus().addAll(this.productoprodusEliminados);
					
					productoproduLogic.saveProductoProdus();//WithConnection
					//productoproduLogic.getSetVersionRowProductoProdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoProdu();
				
				this.productoprodusEliminados= new ArrayList<ProductoProdu>();		
			}
			
			if(this.productoproduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Producto Parte Produccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Producto Parte Produccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productoprodu=productoproduAux;
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
      		//this.finishProcessProductoProdu();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoProdu productoproduLocal) throws Exception {
		
		if(this.productoproduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoProdu productoproduLocal) throws Exception {	
		if(this.productoproduSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ProductoDefiProduDetalleFormJInternalFrame.class)) {
				ProductoDefiProduBeanSwingJInternalFrame productodefiproduBeanSwingJInternalFrameLocal=(ProductoDefiProduBeanSwingJInternalFrame) ((ProductoDefiProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productodefiproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProductoDefiProdu(productodefiproduBeanSwingJInternalFrameLocal.getproductodefiprodu(),true);
				productodefiproduBeanSwingJInternalFrameLocal.actualizarLista(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu,this.productodefiprodusForeignKey);

				productodefiproduBeanSwingJInternalFrameLocal.actualizarRelaciones(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu);

				productoproduLocal.setProductoDefiProdu(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu);

				this.addItemDefectoCombosForeignKeyProductoDefiProdu();
				this.cargarCombosFrameProductoDefiProdusForeignKey("Formulario");
				this.setActualProductoDefiProduForeignKey(productodefiproduBeanSwingJInternalFrameLocal.productodefiprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				productoproduLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				productoproduLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				productoproduLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoProduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productoproduValidator.getInvalidValues(this.productoprodu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoProdu productoprodu,List<ProductoProdu> productoprodus) throws Exception {
		try	{		
			ProductoProduConstantesFunciones.actualizarLista(productoprodu,productoprodus,this.productoproduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoProdu productoprodu,List<ProductoProdu> productoprodus) throws Exception {
		try	{			
			ProductoProduConstantesFunciones.actualizarSelectedLista(productoprodu,productoprodus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoProdu> productoprodusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productoprodusLocal=this.productoproduLogic.getProductoProdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productoprodusLocal=this.productoprodus;
			}
			//ARCHITECTURE
		
			for(ProductoProdu productoproduLocal:productoprodusLocal) {
				if(this.permiteMantenimiento(productoproduLocal) && productoproduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoProduConstantesFunciones.getProductoProduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoProduConstantesFunciones.IDPRODUCTODEFIPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProdu.jLabelid_producto_defi_produProductoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProdu.jLabelid_bodegaProductoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProdu.jLabelid_productoProductoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProdu.jLabelid_unidadProductoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProdu.jLabelporcentajeProductoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProdu.jLabelcantidadProductoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProdu.jLabelcostoProductoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProdu.jLabelcosto_totalProductoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoProduConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProdu.jLabeldescripcionProductoProdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProdu.jLabelid_producto_defi_produProductoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProdu.jLabelid_bodegaProductoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProdu.jLabelid_productoProductoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProdu.jLabelid_unidadProductoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProdu.jLabelporcentajeProductoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProdu.jLabelcantidadProductoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProdu.jLabelcostoProductoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProdu.jLabelcosto_totalProductoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoProdu.jLabeldescripcionProductoProdu,"");
		
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
		this.iIdNuevoProductoProdu--;	
		
		
		this.productoproduAux=new ProductoProdu();
		
		this.productoproduAux.setId(this.iIdNuevoProductoProdu);
		this.productoproduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoproduLogic.getProductoProdus().add(this.productoproduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productoprodus.add(this.productoproduAux);
		}
		//ARCHITECTURE
		
		this.productoprodu=this.productoproduAux;
		
		if(ProductoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoProdu(this.productoprodu);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoProdu(this.productoprodu);
		}
				
		//this.setDefaultControlesProductoProdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoProdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoProdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoProdu(this.productoproduBean,this.productoprodu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoProduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productoproduSessionBean.getConGuardarRelaciones()) {
			classes=ProductoProduConstantesFunciones.getClassesRelationshipsOfProductoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productoproduReturnGeneral=productoproduLogic.procesarEventosProductoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoproduLogic.getProductoProdus(),this.productoprodu,this.productoproduParameterGeneral,this.isEsNuevoProductoProdu,classes);//this.productoproduLogic.getProductoProdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoProdu(this.productoproduReturnGeneral,this.productoproduBean,false);
		
		if(this.productoproduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoProdu(this.productoproduReturnGeneral.getProductoProdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoProdu(this.productoproduReturnGeneral.getProductoProdu());
		}
		
		if(this.productoproduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoProdu(this.productoproduReturnGeneral.getProductoProdu(),classes);//this.productoproduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoProdu(this.productoprodu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoProdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoProdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoProduBeanSwingJInternalFrameAdditional.RecargarFormProductoProdu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoProdu(false);
						
			if(productoproduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProdu();
			}
			
			this.actualizarVisualTableDatosProductoProdu();
			
			this.jTableDatosProductoProdu.setRowSelectionInterval(this.getIndiceNuevoProductoProdu(), this.getIndiceNuevoProductoProdu());
			
			this.seleccionarFilaTablaProductoProduActual();
						
			this.actualizarEstadoCeldasBotonesProductoProdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoProdu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoProdu.jTextFieldporcentajeProductoProdu.setEnabled(isHabilitar && this.productoproduConstantesFunciones.activarporcentajeProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jTextFieldcantidadProductoProdu.setEnabled(isHabilitar && this.productoproduConstantesFunciones.activarcantidadProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jTextFieldcostoProductoProdu.setEnabled(isHabilitar && this.productoproduConstantesFunciones.activarcostoProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jTextFieldcosto_totalProductoProdu.setEnabled(isHabilitar && this.productoproduConstantesFunciones.activarcosto_totalProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jTextAreadescripcionProductoProdu.setEnabled(isHabilitar && this.productoproduConstantesFunciones.activardescripcionProductoProdu);	
		
		this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_producto_defi_produProductoProdu.setEnabled(isHabilitar && this.productoproduConstantesFunciones.activarid_producto_defi_produProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.setEnabled(isHabilitar && this.productoproduConstantesFunciones.activarid_bodegaProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.setEnabled(isHabilitar && this.productoproduConstantesFunciones.activarid_productoProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_unidadProductoProdu.setEnabled(isHabilitar && this.productoproduConstantesFunciones.activarid_unidadProductoProdu);
	};
	
	public void setDefaultControlesProductoProdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoProdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productoproduSessionBean.setConGuardarRelaciones(true);			
			this.productoproduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoProdu.jTabbedPaneRelacionesProductoProdu.setVisible(true);
			
					
		} else {
			//this.productoproduSessionBean.setConGuardarRelaciones(false);			
			this.productoproduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoProdu.jTabbedPaneRelacionesProductoProdu.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoProdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProdu productoproduAux:this.productoproduLogic.getProductoProdus()) {
				if(productoproduAux.getId().equals(this.iIdNuevoProductoProdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProdu productoproduAux:this.productoprodus) {
				if(productoproduAux.getId().equals(this.iIdNuevoProductoProdu)) {
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
	
	public int getIndiceActualProductoProdu(ProductoProdu productoprodu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProdu productoproduAux:this.productoproduLogic.getProductoProdus()) {
				if(productoproduAux.getId().equals(productoprodu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProdu productoproduAux:this.productoprodus) {
				if(productoproduAux.getId().equals(productoprodu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoProdu(ProductoProdu productoproduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProdu productoproduAux:this.productoproduLogic.getProductoProdus()) {
				if(productoproduAux.getProductoProduOriginal().getId().equals(productoproduOriginal.getId())) {
					existe=true;
					productoproduOriginal.setId(productoproduAux.getId());
					productoproduOriginal.setVersionRow(productoproduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProdu productoproduAux:this.productoprodus) {
				if(productoproduAux.getProductoProduOriginal().getId().equals(productoproduOriginal.getId())) {
					existe=true;
					productoproduOriginal.setId(productoproduAux.getId());
					productoproduOriginal.setVersionRow(productoproduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoProdu(Boolean esParaCancelar) throws Exception {
		productoprodusAux=new ArrayList<ProductoProdu>();
		productoproduAux=new ProductoProdu();
		
		if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoProdu productoproduAux:this.productoproduLogic.getProductoProdus()) {
					if(productoproduAux.getId()<0) {
						productoprodusAux.add(productoproduAux);
					}		
				}
				this.iIdNuevoProductoProdu=0L;
				this.productoproduLogic.getProductoProdus().removeAll(productoprodusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProdu productoproduAux:this.productoprodus) {
					if(productoproduAux.getId()<0) {
						productoprodusAux.add(productoproduAux);
					}		
				}
				this.iIdNuevoProductoProdu=0L;
				this.productoprodus.removeAll(productoprodusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoProdu 
					&& this.productoproduLogic.getProductoProdus().size()>0
					) {
					productoproduAux=this.productoproduLogic.getProductoProdus().get(this.productoproduLogic.getProductoProdus().size() - 1);
				
					if(productoproduAux.getId()<0) {
						this.productoproduLogic.getProductoProdus().remove(productoproduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoProdu && this.productoprodus.size()>0) {
					productoproduAux=this.productoprodus.get(this.productoprodus.size() - 1);
				
					if(productoproduAux.getId()<0) {
						this.productoprodus.remove(productoproduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoProdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productoprodu.getId()<0) {
				this.productoproduLogic.getProductoProdus().remove(this.productoprodu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productoprodu.getId()<0) {
				this.productoprodus.remove(this.productoprodu);
			}
		}			
	}
	
	public void setEstadosInicialesProductoProdu(List<ProductoProdu> productoprodusAux) throws Exception {
		ProductoProduConstantesFunciones.setEstadosInicialesProductoProdu(productoprodusAux);
	}
	
	public void setEstadosInicialesProductoProdu(ProductoProdu productoproduAux) throws Exception {
		ProductoProduConstantesFunciones.setEstadosInicialesProductoProdu(productoproduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoProduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoProduActual()) {
				if(!this.isEsNuevoProductoProdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoProdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoProduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Producto Parte Produccion ?", "MANTENIMIENTO DE Producto Parte Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoProdu productoprodu) throws Exception {
		ProductoProduConstantesFunciones.seleccionarAsignar(this.productoprodu,productoprodu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoProdu=this.isPermisoActualizarOriginalProductoProdu;
			
			
			this.seleccionarAsignar(productoprodu);
			
			

			idProductoActual=productoprodu.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoProduConstantesFunciones.quitarEspaciosProductoProdu(this.productoprodu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productoproduSessionBean.setsFuncionBusquedaRapida(this.productoproduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoProductoProdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoProdu(esParaCancelar);				
				this.cancelarNuevoProductoProdu(esParaCancelar);								
			}
			
			this.productoprodu=new ProductoProdu();
			
			this.inicializarProductoProdu();
			
			this.actualizarEstadoCeldasBotonesProductoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoProdu() throws Exception {
		try {
			ProductoProduConstantesFunciones.inicializarProductoProdu(this.productoprodu);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productoproduLogic.getProductoProdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoProdus(String sAccionBusqueda,List<ProductoProdu> productoprodusParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoProdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoProduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoProduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoProdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Producto Parte Producciones");		
		parameters.put("busquedapor", ProductoProduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoProdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoProduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoProduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoProdu=new JRBeanArrayDataSource(ProductoProduJInternalFrame.TraerProductoProduBeans(productoprodusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoProdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoProduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoProduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoProduBean.TraerProductoProduBeans(productoprodusParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoProdus(sAccionBusqueda,sTipoArchivoReporte,productoprodusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoProdus(sAccionBusqueda,sTipoArchivoReporte,productoprodusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoProduActionPerformed(null);
					//this.generarExcelReporteProductoProdus(sAccionBusqueda,sTipoArchivoReporte,productoprodusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoProdus(sAccionBusqueda,sTipoArchivoReporte,productoprodusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoProdus(sAccionBusqueda,sTipoArchivoReporte,productoprodusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoProdus(sAccionBusqueda,sTipoArchivoReporte,productoprodusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProdu> productoprodusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoProdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoProdu productoprodu : productoprodusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoProduConstantesFunciones.generarExcelReporteDataProductoProdu("NORMAL",row,workbook,productoprodu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Parte Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoProdu(String sTipo,Row row,Workbook workbook) {
		
		ProductoProduConstantesFunciones.generarExcelReporteHeaderProductoProdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProdu> productoprodusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoProdu productoprodu : productoprodusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoProduConstantesFunciones.getProductoProduDescripcion(productoprodu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodu.getproductodefiprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodu.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodu.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodu.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodu.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodu.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodu.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodu.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoProduConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoProduConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoprodu.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Parte Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoProdu> productoprodusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoProdu> productoprodusRespaldo=null;
		
		classes=ProductoProduConstantesFunciones.getClassesRelationshipsOfProductoProdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productoproduLogic.setDatosCliente(this.datosCliente);
		this.productoproduLogic.setDatosDeep(this.datosDeep);
		this.productoproduLogic.setIsConDeep(true);
		
		productoprodusRespaldo=this.productoproduLogic.getProductoProdus();
		
		this.productoproduLogic.setProductoProdus(productoprodusParaReportes);	
		this.productoproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productoprodusParaReportes=this.productoproduLogic.getProductoProdus();
		this.productoproduLogic.setProductoProdus(productoprodusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoProdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoProdu productoprodu : productoprodusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoProdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoProduConstantesFunciones.generarExcelReporteDataProductoProdu("NORMAL",row,workbook,productoprodu,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoProduConstantesFunciones.getProductoProduDescripcion(productoprodu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Parte Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoProdu() throws Exception {		
		this.startProcessProductoProdu(true);
	}
	
	public void startProcessProductoProdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoProdu ,this.jPanelParametrosReportesProductoProdu, this.jScrollPanelDatosProductoProdu,this.jPanelPaginacionProductoProdu, this.jScrollPanelDatosEdicionProductoProdu, this.jPanelAccionesProductoProdu,this.jPanelAccionesFormularioProductoProdu,this.jmenuBarProductoProdu,this.jmenuBarDetalleProductoProdu,this.jTtoolBarProductoProdu,this.jTtoolBarDetalleProductoProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoProdu=this.jTabbedPaneBusquedasProductoProdu; 
		
		final JPanel jPanelParametrosReportesProductoProdu=this.jPanelParametrosReportesProductoProdu;
		//final JScrollPane jScrollPanelDatosProductoProdu=this.jScrollPanelDatosProductoProdu;
		final JTable jTableDatosProductoProdu=this.jTableDatosProductoProdu;		
		final JPanel jPanelPaginacionProductoProdu=this.jPanelPaginacionProductoProdu;
		//final JScrollPane jScrollPanelDatosEdicionProductoProdu=this.jScrollPanelDatosEdicionProductoProdu;
		final JPanel jPanelAccionesProductoProdu=this.jPanelAccionesProductoProdu;
		
		JPanel jPanelCamposAuxiliarProductoProdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoProdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) {
			jPanelCamposAuxiliarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jPanelCamposProductoProdu;
			jPanelAccionesFormularioAuxiliarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jPanelAccionesFormularioProductoProdu;
		}
		
		final JPanel jPanelCamposProductoProdu=jPanelCamposAuxiliarProductoProdu;
		final JPanel jPanelAccionesFormularioProductoProdu=jPanelAccionesFormularioAuxiliarProductoProdu;
		
		
		final JMenuBar jmenuBarProductoProdu=this.jmenuBarProductoProdu;
		final JToolBar jTtoolBarProductoProdu=this.jTtoolBarProductoProdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoProdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) {
			jmenuBarDetalleAuxiliarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jmenuBarDetalleProductoProdu;
			jTtoolBarDetalleAuxiliarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jTtoolBarDetalleProductoProdu;
		}
		
		final JMenuBar jmenuBarDetalleProductoProdu=jmenuBarDetalleAuxiliarProductoProdu;
		final JToolBar jTtoolBarDetalleProductoProdu=jTtoolBarDetalleAuxiliarProductoProdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoProdu;
			processRunnable.jTableDatos=jTableDatosProductoProdu;
			processRunnable.jPanelCampos=jPanelCamposProductoProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoProdu;
			processRunnable.jPanelAcciones=jPanelAccionesProductoProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoProdu;
			
			
			processRunnable.jmenuBar=jmenuBarProductoProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoProdu;
			processRunnable.jTtoolBar=jTtoolBarProductoProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoProdu ,jPanelParametrosReportesProductoProdu,jTableDatosProductoProdu, /*jScrollPanelDatosProductoProdu,*/jPanelCamposProductoProdu,jPanelPaginacionProductoProdu, /*jScrollPanelDatosEdicionProductoProdu,*/ jPanelAccionesProductoProdu,jPanelAccionesFormularioProductoProdu,jmenuBarProductoProdu,jmenuBarDetalleProductoProdu,jTtoolBarProductoProdu,jTtoolBarDetalleProductoProdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoProdu ,jPanelParametrosReportesProductoProdu, jScrollPanelDatosProductoProdu,jPanelPaginacionProductoProdu, jScrollPanelDatosEdicionProductoProdu, jPanelAccionesProductoProdu,jPanelAccionesFormularioProductoProdu,jmenuBarProductoProdu,jmenuBarDetalleProductoProdu,jTtoolBarProductoProdu,jTtoolBarDetalleProductoProdu);
						
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
	
	public void finishProcessProductoProdu() {// throws Exception 
		this.finishProcessProductoProdu(true);
	}
	
	public void finishProcessProductoProdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoProdu ,this.jPanelParametrosReportesProductoProdu, this.jScrollPanelDatosProductoProdu,this.jPanelPaginacionProductoProdu, this.jScrollPanelDatosEdicionProductoProdu, this.jPanelAccionesProductoProdu,this.jPanelAccionesFormularioProductoProdu,this.jmenuBarProductoProdu,this.jmenuBarDetalleProductoProdu,this.jTtoolBarProductoProdu,this.jTtoolBarDetalleProductoProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoProdu=this.jTabbedPaneBusquedasProductoProdu; 
		
		final JPanel jPanelParametrosReportesProductoProdu=this.jPanelParametrosReportesProductoProdu;
		//final JScrollPane jScrollPanelDatosProductoProdu=this.jScrollPanelDatosProductoProdu;
		final JTable jTableDatosProductoProdu=this.jTableDatosProductoProdu;		
		final JPanel jPanelPaginacionProductoProdu=this.jPanelPaginacionProductoProdu;
		//final JScrollPane jScrollPanelDatosEdicionProductoProdu=this.jScrollPanelDatosEdicionProductoProdu;
		final JPanel jPanelAccionesProductoProdu=this.jPanelAccionesProductoProdu;
		
		JPanel jPanelCamposAuxiliarProductoProdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoProdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) {
			jPanelCamposAuxiliarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jPanelCamposProductoProdu;
			jPanelAccionesFormularioAuxiliarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jPanelAccionesFormularioProductoProdu;
		}
		
		final JPanel jPanelCamposProductoProdu=jPanelCamposAuxiliarProductoProdu;
		final JPanel jPanelAccionesFormularioProductoProdu=jPanelAccionesFormularioAuxiliarProductoProdu;
		
		
		final JMenuBar jmenuBarProductoProdu=this.jmenuBarProductoProdu;		
		final JToolBar jTtoolBarProductoProdu=this.jTtoolBarProductoProdu;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoProdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) {
			jmenuBarDetalleAuxiliarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jmenuBarDetalleProductoProdu;
			jTtoolBarDetalleAuxiliarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jTtoolBarDetalleProductoProdu;		
		}
		
		final JMenuBar jmenuBarDetalleProductoProdu=jmenuBarDetalleAuxiliarProductoProdu;
		final JToolBar jTtoolBarDetalleProductoProdu=jTtoolBarDetalleAuxiliarProductoProdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoProdu;
			processRunnable.jTableDatos=jTableDatosProductoProdu;
			processRunnable.jPanelCampos=jPanelCamposProductoProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoProdu;
			processRunnable.jPanelAcciones=jPanelAccionesProductoProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoProdu;
			
			
			processRunnable.jmenuBar=jmenuBarProductoProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoProdu;
			processRunnable.jTtoolBar=jTtoolBarProductoProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoProdu ,jPanelParametrosReportesProductoProdu, jTableDatosProductoProdu,/*jScrollPanelDatosProductoProdu,*/jPanelCamposProductoProdu,jPanelPaginacionProductoProdu, /*jScrollPanelDatosEdicionProductoProdu,*/ jPanelAccionesProductoProdu,jPanelAccionesFormularioProductoProdu,jmenuBarProductoProdu,jmenuBarDetalleProductoProdu,jTtoolBarProductoProdu,jTtoolBarDetalleProductoProdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoProdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoProdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoProdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoProdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoProdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productoproduConstantesFunciones.getsFinalQueryProductoProdu();
		String  finalQueryPaginacionTodos=this.productoproduConstantesFunciones.getsFinalQueryProductoProdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoProduConstantesFunciones.getArrayColumnasGlobalesNoProductoProdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoProduConstantesFunciones.getArrayColumnasGlobalesProductoProdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoProduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productoprodusEliminados= new ArrayList<ProductoProdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoProdu();
		
				///*ProductoProduSessionBean*/this.productoproduSessionBean=new ProductoProduSessionBean();
			
			if(this.productoproduSessionBean==null) {
				this.productoproduSessionBean=new ProductoProduSessionBean();
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
					this.iNumeroPaginacion=ProductoProduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoProduConstantesFunciones.getClassesForeignKeysOfProductoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productoprodu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productoprodusAux= new ArrayList<ProductoProdu>();
			
				
			productoproduLogic.setDatosCliente(this.datosCliente);
			productoproduLogic.setDatosDeep(this.datosDeep);
			productoproduLogic.setIsConDeep(true);
			
			
			productoproduLogic.getProductoProduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productoproduLogic.getTodosProductoProdus(finalQueryGlobal,pagination);
					
					//productoproduLogic.getTodosProductoProdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productoproduLogic.getProductoProdus()==null|| productoproduLogic.getProductoProdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoprodusAux= new ArrayList<ProductoProdu>();
							productoprodusAux.addAll(productoproduLogic.getProductoProdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodusAux= new ArrayList<ProductoProdu>();
							productoprodusAux.addAll(productoprodus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoproduLogic.getTodosProductoProdus(finalQueryGlobal+"",this.pagination);												
							
							//productoproduLogic.getTodosProductoProdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoProdus("Todos",productoproduLogic.getProductoProdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoproduLogic.setProductoProdus(new ArrayList<ProductoProdu>());					
							productoproduLogic.getProductoProdus().addAll(productoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodus=new ArrayList<ProductoProdu>();
							productoprodus.addAll(productoprodusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoProdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoProdu=this.idActual;
				
				} else if(this.idProductoProduActual!=null && this.idProductoProduActual!=0L) {
					idProductoProdu=idProductoProduActual;
				}
				
					
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndicePorId(idProductoProdu);
				
				this.productoprodus=new ArrayList<ProductoProdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productoproduLogic.getEntity(idProductoProdu);
					
					//productoproduLogic.getEntityWithConnection(idProductoProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoproduLogic.setProductoProdus(new ArrayList<ProductoProdu>());
					productoproduLogic.getProductoProdus().add(productoproduLogic.getProductoProdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodus=new ArrayList<ProductoProdu>();
					this.productoprodus.add(productoprodu);
				}
				
				if(productoproduLogic.getProductoProdu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoproduLogic.getProductoProdusFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoproduLogic.getProductoProdus()==null||productoproduLogic.getProductoProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodus==null|| productoprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodusAux=new ArrayList<ProductoProdu>();
						productoprodusAux.addAll(productoproduLogic.getProductoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodusAux=new ArrayList<ProductoProdu>();
							productoprodusAux.addAll(productoprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoproduLogic.getProductoProdusFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProdus("FK_IdBodega",productoproduLogic.getProductoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProdus("FK_IdBodega",productoprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproduLogic.setProductoProdus(new ArrayList<ProductoProdu>());
						productoproduLogic.getProductoProdus().addAll(productoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodus=new ArrayList<ProductoProdu>();
							productoprodus.addAll(productoprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoproduLogic.getProductoProdusFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoproduLogic.getProductoProdus()==null||productoproduLogic.getProductoProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodus==null|| productoprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodusAux=new ArrayList<ProductoProdu>();
						productoprodusAux.addAll(productoproduLogic.getProductoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodusAux=new ArrayList<ProductoProdu>();
							productoprodusAux.addAll(productoprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoproduLogic.getProductoProdusFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProdus("FK_IdProducto",productoproduLogic.getProductoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProdus("FK_IdProducto",productoprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproduLogic.setProductoProdus(new ArrayList<ProductoProdu>());
						productoproduLogic.getProductoProdus().addAll(productoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodus=new ArrayList<ProductoProdu>();
							productoprodus.addAll(productoprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProductoDefiProdu")) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoproduLogic.getProductoProdusFK_IdProductoDefiProdu(finalQueryGlobal,pagination,id_producto_defi_produFK_IdProductoDefiProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoproduLogic.getProductoProdus()==null||productoproduLogic.getProductoProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodus==null|| productoprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodusAux=new ArrayList<ProductoProdu>();
						productoprodusAux.addAll(productoproduLogic.getProductoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodusAux=new ArrayList<ProductoProdu>();
							productoprodusAux.addAll(productoprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoproduLogic.getProductoProdusFK_IdProductoDefiProdu(finalQueryGlobal,pagination,id_producto_defi_produFK_IdProductoDefiProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdProductoDefiProdu(id_producto_defi_produFK_IdProductoDefiProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProdus("FK_IdProductoDefiProdu",productoproduLogic.getProductoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProdus("FK_IdProductoDefiProdu",productoprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproduLogic.setProductoProdus(new ArrayList<ProductoProdu>());
						productoproduLogic.getProductoProdus().addAll(productoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodus=new ArrayList<ProductoProdu>();
							productoprodus.addAll(productoprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidadUnad")) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdUnidadUnad(id_unidadFK_IdUnidadUnad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoproduLogic.getProductoProdusFK_IdUnidadUnad(finalQueryGlobal,pagination,id_unidadFK_IdUnidadUnad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdUnidadUnad(id_unidadFK_IdUnidadUnad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdUnidadUnad(id_unidadFK_IdUnidadUnad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoproduLogic.getProductoProdus()==null||productoproduLogic.getProductoProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoprodus==null|| productoprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoprodusAux=new ArrayList<ProductoProdu>();
						productoprodusAux.addAll(productoproduLogic.getProductoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodusAux=new ArrayList<ProductoProdu>();
							productoprodusAux.addAll(productoprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoproduLogic.getProductoProdusFK_IdUnidadUnad(finalQueryGlobal,pagination,id_unidadFK_IdUnidadUnad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdUnidadUnad(id_unidadFK_IdUnidadUnad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoProduConstantesFunciones.getDetalleIndiceFK_IdUnidadUnad(id_unidadFK_IdUnidadUnad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoProdus("FK_IdUnidadUnad",productoproduLogic.getProductoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoProdus("FK_IdUnidadUnad",productoprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproduLogic.setProductoProdus(new ArrayList<ProductoProdu>());
						productoproduLogic.getProductoProdus().addAll(productoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoprodus=new ArrayList<ProductoProdu>();
							productoprodus.addAll(productoprodusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoProdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoProdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoproduLogic.getProductoProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoprodus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoproduLogic.getProductoProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoprodus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoProdu productoprodu) {
		Boolean permite=true;
		
		if(this.productoprodu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoProduConstantesFunciones.getOrderByListaProductoProdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoProduConstantesFunciones.getOrderByListaProductoProdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProdu productoprodu:productoproduLogic.getProductoProdus()) {
				if(productoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					productoproduTotales=productoprodu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProdu productoprodu:this.productoprodus) {
				if(productoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					productoproduTotales=productoprodu;
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
			this.productoproduAux=new ProductoProdu();
			this.productoproduAux.setsType(Constantes2.S_TOTALES);
			this.productoproduAux.setIsNew(false);
			this.productoproduAux.setIsChanged(false);
			this.productoproduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoProduConstantesFunciones.TotalizarValoresFilaProductoProdu(this.productoproduLogic.getProductoProdus(),this.productoproduAux);
				
				this.productoproduLogic.getProductoProdus().add(this.productoproduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoProduConstantesFunciones.TotalizarValoresFilaProductoProdu(this.productoprodus,this.productoproduAux);
				
				this.productoprodus.add(this.productoproduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productoproduTotales=new ProductoProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoproduLogic.getProductoProdus().remove(productoproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoprodus.remove(productoproduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productoproduTotales=new ProductoProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoProdu productoprodu:productoproduLogic.getProductoProdus()) {
				if(productoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					productoproduTotales=productoprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoProduConstantesFunciones.TotalizarValoresFilaProductoProdu(this.productoproduLogic.getProductoProdus(),productoproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoProdu productoprodu:this.productoprodus) {
				if(productoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					productoproduTotales=productoprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoProduConstantesFunciones.TotalizarValoresFilaProductoProdu(this.productoprodus,productoproduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoProdusFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProdusFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProdusFK_IdProductoDefiProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdProductoDefiProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoProdusFK_IdUnidadUnad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidadUnad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoProdusFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoproduLogic.getProductoProdusFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProdusFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoproduLogic.getProductoProdusFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProdusFK_IdProductoDefiProdu(String sFinalQuery,Long id_producto_defi_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoproduLogic.getProductoProdusFK_IdProductoDefiProdu(sFinalQuery,this.pagination,id_producto_defi_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoProdusFK_IdUnidadUnad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoproduLogic.getProductoProdusFK_IdUnidadUnad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosProductoProdu() {
		this.isPermisoTodoProductoProdu=false;
		this.isPermisoNuevoProductoProdu=false;
		this.isPermisoActualizarProductoProdu=false;
		this.isPermisoActualizarOriginalProductoProdu=false;
		this.isPermisoEliminarProductoProdu=false;
		this.isPermisoGuardarCambiosProductoProdu=false;
		this.isPermisoConsultaProductoProdu=false;
		this.isPermisoBusquedaProductoProdu=false;
		this.isPermisoReporteProductoProdu=false;		
		this.isPermisoOrdenProductoProdu=false;		
		this.isPermisoPaginacionMedioProductoProdu=false;		
		this.isPermisoPaginacionAltoProductoProdu=false;
		this.isPermisoPaginacionTodoProductoProdu=false;
		this.isPermisoCopiarProductoProdu=false;		
		this.isPermisoVerFormProductoProdu=false;		
		this.isPermisoDuplicarProductoProdu=false;		
		this.isPermisoOrdenProductoProdu=false;		
	}
	
	public void setPermisosUsuarioProductoProdu(Boolean isPermiso) {
		this.isPermisoTodoProductoProdu=isPermiso;
		this.isPermisoNuevoProductoProdu=isPermiso;
		this.isPermisoActualizarProductoProdu=isPermiso;
		this.isPermisoActualizarOriginalProductoProdu=isPermiso;
		this.isPermisoEliminarProductoProdu=isPermiso;
		this.isPermisoGuardarCambiosProductoProdu=isPermiso;
		this.isPermisoConsultaProductoProdu=isPermiso;
		this.isPermisoBusquedaProductoProdu=isPermiso;
		this.isPermisoReporteProductoProdu=isPermiso;
		this.isPermisoOrdenProductoProdu=isPermiso;		
		this.isPermisoPaginacionMedioProductoProdu=isPermiso;		
		this.isPermisoPaginacionAltoProductoProdu=isPermiso;		
		this.isPermisoPaginacionTodoProductoProdu=isPermiso;		
		this.isPermisoCopiarProductoProdu=isPermiso;		
		this.isPermisoVerFormProductoProdu=isPermiso;		
		this.isPermisoDuplicarProductoProdu=isPermiso;
		this.isPermisoOrdenProductoProdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoProdu(Boolean isPermiso) {
		//this.isPermisoTodoProductoProdu=isPermiso;
		this.isPermisoNuevoProductoProdu=isPermiso;
		this.isPermisoActualizarProductoProdu=isPermiso;
		this.isPermisoActualizarOriginalProductoProdu=isPermiso;
		this.isPermisoEliminarProductoProdu=isPermiso;
		this.isPermisoGuardarCambiosProductoProdu=isPermiso;
		//this.isPermisoConsultaProductoProdu=isPermiso;
		//this.isPermisoBusquedaProductoProdu=isPermiso;
		//this.isPermisoReporteProductoProdu=isPermiso;
		//this.isPermisoOrdenProductoProdu=isPermiso;		
		//this.isPermisoPaginacionMedioProductoProdu=isPermiso;		
		//this.isPermisoPaginacionAltoProductoProdu=isPermiso;		
		//this.isPermisoPaginacionTodoProductoProdu=isPermiso;		
		//this.isPermisoCopiarProductoProdu=isPermiso;		
		//this.isPermisoDuplicarProductoProdu=isPermiso;
		//this.isPermisoOrdenProductoProdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoProduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoProdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoProduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoProduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoProduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoProduClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoProdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productoproduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoProduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoProdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoProdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoProdu=this.isPermisoActualizarProductoProdu;
			this.isPermisoEliminarProductoProdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoProdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoProdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoProdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoProdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoProdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoProdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoProdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoProdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoProdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoProdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoProdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productoproduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoProdu.setToolTipText(this.jTableDatosProductoProdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoProdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoProdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoProdu() throws Exception {
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
	public void inicializarCombosForeignKeyProductoProduListas()throws Exception {
		try	{						
			
				this.productodefiprodusForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoProduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoProduListas(false);
			} else {
			
				this.cargarCombosForeignKeyProductoDefiProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyProductoDefiProduListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.productodefiprodusForeignKey==null||this.productodefiprodusForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProductoDefiProduConstantesFunciones.getArrayColumnasGlobalesProductoDefiProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoDefiProduConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProductoDefiProduConstantesFunciones.SFINALQUERY;

				this.cargarCombosProductoDefiProdusForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyProductoProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoProduParameterReturnGeneral productoproduReturnGeneral=new ProductoProduParameterReturnGeneral();
						
			


				String finalQueryGlobalProductoDefiProdu="";

				if(((this.productodefiprodusForeignKey==null||this.productodefiprodusForeignKey.size()<=0) && this.productoproduConstantesFunciones.cargarid_producto_defi_produProductoProdu)
					 || (this.esRecargarFks && this.productoproduConstantesFunciones.cargarid_producto_defi_produProductoProdu)) {

					if(!this.productoproduSessionBean.getisBusquedaDesdeForeignKeySesionProductoDefiProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoDefiProduConstantesFunciones.getArrayColumnasGlobalesProductoDefiProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProductoDefiProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoDefiProduConstantesFunciones.TABLENAME);

						finalQueryGlobalProductoDefiProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalProductoDefiProdu, "");
						finalQueryGlobalProductoDefiProdu+=ProductoDefiProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductoDefiProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProductoDefiProdu=" WHERE " + ConstantesSql.ID + "="+productoproduSessionBean.getlidProductoDefiProduActual();
					}
				} else {
					finalQueryGlobalProductoDefiProdu="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.productoproduConstantesFunciones.cargarid_bodegaProductoProdu)
					 || (this.esRecargarFks && this.productoproduConstantesFunciones.cargarid_bodegaProductoProdu)) {

					if(!this.productoproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+productoproduSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(cargarCombosDependencia && ((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.productoproduConstantesFunciones.cargarid_productoProductoProdu)
					 || (this.esRecargarFks && this.productoproduConstantesFunciones.cargarid_productoProductoProdu)) {

					if(!this.productoproduSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+productoproduSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(cargarCombosDependencia && ((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.productoproduConstantesFunciones.cargarid_unidadProductoProdu)
					 || (this.esRecargarFks && this.productoproduConstantesFunciones.cargarid_unidadProductoProdu)) {

					if(!this.productoproduSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+productoproduSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productoproduReturnGeneral=productoproduLogic.cargarCombosLoteForeignKeyProductoProdu(finalQueryGlobalProductoDefiProdu,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalProductoDefiProdu.equals("NONE")) {
				this.productodefiprodusForeignKey=productoproduReturnGeneral.getproductodefiprodusForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=productoproduReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=productoproduReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=productoproduReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoProdu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyProductoDefiProdu();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyProductoDefiProdu()throws Exception {
		try {
			if(this.productoproduSessionBean==null) {
				this.productoproduSessionBean=new ProductoProduSessionBean();
			}

			if(!this.productoproduSessionBean.getisBusquedaDesdeForeignKeySesionProductoDefiProdu()) {
				ProductoDefiProdu productodefiprodu=new ProductoDefiProdu();
				ProductoDefiProduConstantesFunciones.setProductoDefiProduDescripcion(productodefiprodu,Constantes.SMENSAJE_ESCOJA_OPCION);
				productodefiprodu.setId(null);

				if(!ProductoDefiProduConstantesFunciones.ExisteEnLista(this.productodefiprodusForeignKey,productodefiprodu,true)) {

					this.productodefiprodusForeignKey.add(0,productodefiprodu);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.productoproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.productoproduSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

			if(!this.productoproduSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
	
	public void initActionsCombosTodosForeignKeyProductoProdu()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega("Todos");
			this.initActionsCombosForeignKeyProducto("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoProdu(String sFormularioTipoBusqueda)throws Exception {
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
			sFinalQueryCombo=InventarioSql.GetQueryUnidadFromBodegaYProducto(productoLocal,this.productoprodu.getid_bodega());

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
					if(this.jInternalFrameDetalleFormProductoProdu!=null) {
						this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.addItemListener(new ComboBoxItemListener(this,"id_bodegaProductoProdu"));
						this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaProductoProdu"));
					}
				} else {
					if(this.jInternalFrameDetalleFormProductoProdu!=null) {
						this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.addActionListener(new ComboBoxActionListener(this,"id_bodegaProductoProdu"));
						this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaProductoProdu"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_bodegaFK_IdBodegaProductoProdu.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_bodegaFK_IdBodegaProductoProdu"));

						this.jComboBoxid_bodegaFK_IdBodegaProductoProdu.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaProductoProdu"));

					} else {
						this.jComboBoxid_bodegaFK_IdBodegaProductoProdu.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_bodegaFK_IdBodegaProductoProdu"));

						this.jComboBoxid_bodegaFK_IdBodegaProductoProdu.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaProductoProdu"));

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
					if(this.jInternalFrameDetalleFormProductoProdu!=null) {
						this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.addItemListener(new ComboBoxItemListener(this,"id_productoProductoProdu"));
						this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.addFocusListener(new ComboBoxFocusListener(this,"id_productoProductoProdu"));
					}
				} else {
					if(this.jInternalFrameDetalleFormProductoProdu!=null) {
						this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.addActionListener(new ComboBoxActionListener(this,"id_productoProductoProdu"));
						this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.addFocusListener(new ComboBoxFocusListener(this,"id_productoProductoProdu"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_productoFK_IdProductoProductoProdu.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_productoFK_IdProductoProductoProdu"));

						this.jComboBoxid_productoFK_IdProductoProductoProdu.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoProductoProdu"));

					} else {
						this.jComboBoxid_productoFK_IdProductoProductoProdu.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_productoFK_IdProductoProductoProdu"));

						this.jComboBoxid_productoFK_IdProductoProductoProdu.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoProductoProdu"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyProductoProdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoProdu(ProductoProdu productoprodu)throws Exception {	
		try {
			
			this.setActualProductoDefiProduForeignKey(productoprodu.getid_producto_defi_produ(),false,"Formulario");
			this.setActualBodegaForeignKey(productoprodu.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(productoprodu.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(productoprodu.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoProdu(ProductoProdu productoprodu,String sTipoEvento)throws Exception {	
		try {
			
			

				if(productoprodu.getProducto()!=null && !sTipoEvento.equals("id_productoProductoProdu")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(productoprodu.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoProdu()throws Exception {	
		try {
			
			this.setActualProductoDefiProduForeignKey(this.productoproduConstantesFunciones.getid_producto_defi_produ(),false,"Formulario");
			this.setActualBodegaForeignKey(this.productoproduConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.productoproduConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(this.productoproduConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoProdu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoProdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoProdu()throws Exception {
		try {
			

			this.cargarCombosFrameProductoDefiProdusForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameProductoDefiProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoProdu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_producto_defi_produProductoProdu!=null && this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_producto_defi_produProductoProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_producto_defi_produProductoProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu!=null && this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu!=null && this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_unidadProductoProdu!=null && this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_unidadProductoProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_unidadProductoProdu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	



	public void recargarFormProductoProduBodega(JComboBox<?> jComboBoxGenericoBodega,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormProductoProduid_producto(jComboBoxGenericoBodega,sFormularioTipoBusqueda,"Bodega",false);
	}

	public void recargarFormProductoProduProducto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormProductoProduid_unidad(jComboBoxGenericoProducto,sFormularioTipoBusqueda,"Producto",false);
	}


	
	



	public void recargarFormProductoProduid_producto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Bodega")){
				this.setActualParaGuardarBodegaForeignKey(this.productoprodu,jComboBoxGenericoProducto);
			}

			if(this.productoprodu.getid_bodega()!=null && this.productoprodu.getid_bodega()!=0L) {
				sFinalQuery+="  WHERE  id_bodega="+this.productoprodu.getid_bodega();
			} else {
				sFinalQuery+="  WHERE  id_bodega=-1";
			}



			//BUCLE RECURSIVO
			this.setActualProductoForeignKey(this.productoprodu.getid_bodega(),true,sFormularioTipoBusqueda);

			this.cargarCombosProductosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormProductoProduid_unidad(JComboBox<?> jComboBoxGenericoUnidad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Producto")){
				this.setActualParaGuardarProductoForeignKey(this.productoprodu,jComboBoxGenericoUnidad);
			}

			if(this.productoprodu.getid_producto()!=null && this.productoprodu.getid_producto()!=0L) {
				sFinalQuery+="  WHERE  id_producto="+this.productoprodu.getid_producto();
			} else {
				sFinalQuery+="  WHERE  id_producto=-1";
			}



			//BUCLE RECURSIVO
			this.setActualUnidadForeignKey(this.productoprodu.getid_producto(),true,sFormularioTipoBusqueda);

			this.cargarCombosUnidadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ProductoProduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoProduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoProduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productoproduSessionBean=new ProductoProduSessionBean(); 
		this.productoproduConstantesFunciones=new ProductoProduConstantesFunciones(); 
		this.productoproduBean=new ProductoProdu();//(this.productoproduConstantesFunciones); 		
		this.productoproduReturnGeneral=new ProductoProduParameterReturnGeneral(); 
		
		this.productoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoProdu(true);
			
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
			
			this.productoproduConstantesFunciones=new ProductoProduConstantesFunciones(); 
			this.productoproduBean=new ProductoProdu();//this.productoproduConstantesFunciones); 			
			this.productoproduReturnGeneral=new ProductoProduParameterReturnGeneral(); 
		
			ProductoProduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Producto Parte Produccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productoprodu=new ProductoProdu();
			this.productoprodus = new ArrayList<ProductoProdu>();
			this.productoprodusAux = new ArrayList<ProductoProdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic=new ProductoProduLogic();
				this.productoproduLogic.getNewConnexionToDeep("");
			}
			
			//this.productoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoProdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoProdu);	
					}
					
					if(this.jInternalFrameImportacionProductoProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoProdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoProdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoProdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoProdu);
				this.jInternalFrameDetalleFormProductoProdu.setVisible(false);
				this.jInternalFrameDetalleFormProductoProdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoProdu);
					this.jInternalFrameReporteDinamicoProductoProdu.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoProdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoProdu);
					this.jInternalFrameImportacionProductoProdu.setVisible(false);
					this.jInternalFrameImportacionProductoProdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoProdu);
					this.jInternalFrameOrderByProductoProdu.setVisible(false);
					this.jInternalFrameOrderByProductoProdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoProduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoProduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productoproduReturnGeneral=new ProductoProduParameterReturnGeneral();
			
			this.productoproduParameterGeneral=new ProductoProduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productoproduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productoproduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoproduSessionBean.getEsGuardarRelacionado(),this.productoproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoproduSessionBean.getEsGuardarRelacionado(),this.productoproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoProdu=false;
			this.isVisibilidadCeldaDuplicarProductoProdu=true;
			this.isVisibilidadCeldaCopiarProductoProdu=true;
			this.isVisibilidadCeldaVerFormProductoProdu=true;
			this.isVisibilidadCeldaOrdenProductoProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProdu=false;
			this.isVisibilidadCeldaModificarProductoProdu=false;
			this.isVisibilidadCeldaActualizarProductoProdu=false;
			this.isVisibilidadCeldaEliminarProductoProdu=false;
			this.isVisibilidadCeldaCancelarProductoProdu=false;
			this.isVisibilidadCeldaGuardarProductoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProdu=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdProductoDefiProdu=true;
			this.isVisibilidadFK_IdUnidadUnad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoProdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoProdu(false);
			
			this.setPermisosUsuarioProductoProdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoproduSessionBean.getEsGuardarRelacionado() 
				|| (this.productoproduSessionBean.getEsGuardarRelacionado() && this.productoproduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoProduClasesRelacionadas();
			}
			
			if(this.productoproduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoProduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoProdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoProdu();
			}
			
			if(!this.isPermisoBusquedaProductoProdu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoProdu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoProdu,this.isPermisoPaginacionMedioProductoProdu,this.isPermisoPaginacionTodoProductoProdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoProduConstantesFunciones.getTiposSeleccionarProductoProdu());
				
				this.tiposColumnasSelect=ProductoProduConstantesFunciones.getTiposSeleccionarProductoProdu(true);
				
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
			//if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoProdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProductoProdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProductoProdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProdu() ;
			
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
			
			this.productodefiproduLogic=new ProductoDefiProduLogic();
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
				productoproduImplementable= (ProductoProduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productoproduImplementableHome= (ProductoProduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productoprodus= new ArrayList<ProductoProdu>();
			this.productoprodusEliminados= new ArrayList<ProductoProdu>();
						
			this.isEsNuevoProductoProdu=false;
			this.esParaAccionDesdeFormularioProductoProdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.productodefiprodusForeignKey=new ArrayList<ProductoDefiProdu>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoProdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoProdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoProduBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoProduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoProdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoProdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoProdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoProdu();
			}
			
			ProductoProduBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoProdu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoProdu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoProdu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoProdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoProdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoProdu() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoProdu")) {
				iIndex=this.jInternalFrameDetalleFormProductoProdu.jTabbedPaneRelacionesProductoProdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoProdu.jTabbedPaneRelacionesProductoProdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoProdu();	
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
	
	public void cargarCombosForeignKeyProductoProdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoProdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoProduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoProdu();
		
		this.cargarCombosFrameForeignKeyProductoProdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoProdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoProdu();
		}
	}
	
	

	public void cargarCombosForeignKeyProductoDefiProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProductoDefiProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProductoDefiProdu();
				this.cargarCombosFrameProductoDefiProdusForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProductoDefiProdu(this.productodefiprodusForeignKey);

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
	
	public void jButtonNuevoProductoProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productoproduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			
			
			if(jTableDatosProductoProdu.getRowCount()>=1) {
				jTableDatosProductoProdu.removeRowSelectionInterval(0, jTableDatosProductoProdu.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoProdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoProdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoProdu(true);			
			//this.productoprodu=new ProductoProdu();
			//this.productoprodu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProdu() ;
			
			if(ProductoProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productoprodu);	
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);				
			
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			
			if(this.productoproduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoProdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoProdu> productoprodusSeleccionados=new ArrayList<ProductoProdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoProdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoProdu.getSelectedRows().length;			
			}
			
			productoprodusSeleccionados=this.getProductoProdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoProdu--;			
				//ProductoProdu productoproduAux= new ProductoProdu();			
				//productoproduAux.setId(this.iIdNuevoProductoProdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoProdu productoproduOrigen=new ProductoProdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoProdu productoproduOrigen : productoprodusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productoproduOrigen =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoproduOrigen =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoProdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productoprodu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoProdu(productoproduOrigen,this.productoprodu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoproduLogic.getProductoProdus().add(this.productoproduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoprodus.add(this.productoproduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoProdu(false);
				
				this.jTableDatosProductoProdu.setRowSelectionInterval(this.getIndiceNuevoProductoProdu(), this.getIndiceNuevoProductoProdu());
				
				int iLastRow =  this.jTableDatosProductoProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoProdu> productoprodusSeleccionados=new ArrayList<ProductoProdu>();									
		
			ProductoProdu productoproduOrigen=new ProductoProdu();
			ProductoProdu productoproduDestino=new ProductoProdu();
				
			productoprodusSeleccionados=this.getProductoProdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoProdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productoprodusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoProdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproduOrigen =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoproduOrigen =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoproduDestino =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoproduDestino =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productoproduOrigen =productoprodusSeleccionados.get(0);
				productoproduDestino =productoprodusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoProdu(productoproduOrigen,productoproduDestino,true,false);
				
				productoproduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoproduDestino,productoproduLogic.getProductoProdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoproduDestino,productoprodus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoProdu(false);
				
				//this.jTableDatosProductoProdu.setRowSelectionInterval(this.getIndiceNuevoProductoProdu(), this.getIndiceNuevoProductoProdu());
				
				int iLastRow =  this.jTableDatosProductoProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoProdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoProdu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoProdu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoProdu.setVisible(!isVisible);
			this.jPanelPaginacionProductoProdu.setVisible(!isVisible);
			this.jPanelAccionesProductoProdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoProdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoProdu();
			
			this.abrirFrameOrderByProductoProdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoProdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoProdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoProdu.isMaximum()) {
					this.jInternalFrameDetalleFormProductoProdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoProdu.setSize(this.jInternalFrameDetalleFormProductoProdu.iWidthFormulario,this.jInternalFrameDetalleFormProductoProdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoProdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoProdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoProdu.isMaximum()) {
						this.jInternalFrameDetalleFormProductoProdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoProdu.jContentPaneDetalleProductoProdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoProdu.jTabbedPaneRelacionesProductoProdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoProdu.jContentPaneDetalleProductoProdu.getWidth(),ProductoProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoProdu.jTabbedPaneRelacionesProductoProdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoProdu.jContentPaneDetalleProductoProdu.getWidth(),ProductoProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoProdu.jTabbedPaneRelacionesProductoProdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoProdu.jContentPaneDetalleProductoProdu.getWidth(),ProductoProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoProdu.setVisible(true);
	        this.jInternalFrameDetalleFormProductoProdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoProdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProdu,false,this);
				} else {
					this.jInternalFrameOrderByProductoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoProdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoProdu);
				this.jInternalFrameOrderByProductoProdu.setVisible(false);
				this.jInternalFrameOrderByProductoProdu.setSelected(false);
				
				this.jInternalFrameOrderByProductoProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoProdu"));
				
				this.inicializarActualizarBindingTablaOrderByProductoProdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoProdu==null) {
				
				this.jInternalFrameImportacionProductoProdu=new ImportacionJInternalFrame(ProductoProduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoProdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoProdu);
				this.jInternalFrameImportacionProductoProdu.setVisible(false);
				this.jInternalFrameImportacionProductoProdu.setSelected(false);


				this.jInternalFrameImportacionProductoProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoProdu"));
				this.jInternalFrameImportacionProductoProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoProdu"));
				this.jInternalFrameImportacionProductoProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoProdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoProdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoProdu==null) {
				this.jInternalFrameReporteDinamicoProductoProdu=new ReporteDinamicoJInternalFrame(ProductoProduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoProdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoProdu);
				this.jInternalFrameReporteDinamicoProductoProdu.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoProdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProdu"));
				this.jInternalFrameReporteDinamicoProductoProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProdu"));
				this.jInternalFrameReporteDinamicoProductoProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoProdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoProdu);
			
	       	this.jInternalFrameDetalleFormProductoProdu.setVisible(false);
	        this.jInternalFrameDetalleFormProductoProdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoProdu.dispose();
			//this.jInternalFrameDetalleFormProductoProdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoProdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoProdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoProdu.setVisible(true);
	        this.jInternalFrameImportacionProductoProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoProdu.setVisible(true);
	        this.jInternalFrameOrderByProductoProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoProdu.setVisible(false);
	        this.jInternalFrameOrderByProductoProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoProdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoProdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoProdu.setVisible(false);
	        this.jInternalFrameImportacionProductoProdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoProdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoProdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoProdu(true);
			//this.isEsNuevoProductoProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProdu(false) ;
			
			if(productoproduSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoProduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoProdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoProdu(true);
			//this.isEsNuevoProductoProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productoprodu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoProdu(false) ;
			
			if(ProductoProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoProdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.productoproduConstantesFunciones.cargarid_productoProductoProdu) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoProdu(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaProductoDefiProdu(List<ProductoDefiProdu> productodefiprodusForeignKey)throws Exception{
		TableColumn tableColumnProductoDefiProdu=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU));
		TableCellEditor tableCellEditorProductoDefiProdu =tableColumnProductoDefiProdu.getCellEditor();

		ProductoDefiProduTableCell productodefiproduTableCellFk=(ProductoDefiProduTableCell)tableCellEditorProductoDefiProdu;

		if(productodefiproduTableCellFk!=null) {
			productodefiproduTableCellFk.setproductodefiprodusForeignKey(productodefiprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productodefiproduTableCellFk.setRowActual(intSelectedRow);
			//productodefiproduTableCellFk.setproductodefiprodusForeignKeyActual(productodefiprodusForeignKey);
		//}


		if(productodefiproduTableCellFk!=null) {
			productodefiproduTableCellFk.RecargarProductoDefiProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,ProductoProduConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProdu.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,ProductoProduConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProdu.getSelectedRow();

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
		TableColumn tableColumnUnidad=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,ProductoProduConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoProdu.getSelectedRow();

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
	
	public void jButtonActualizarProductoProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoProdu(false);
			
			//if(!this.isEsNuevoProductoProdu) {								
				int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoProdu(this.productoprodu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
				
			}
			
			if(this.permiteMantenimiento(this.productoprodu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoProdu=true;
					this.inicializarActualizarBindingTablaProductoProdu(false);
					this.isEsNuevoProductoProdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoProdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoProdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProdu(false);
				
				this.habilitarDeshabilitarControlesProductoProdu(false);
			
												
				
				if(ProductoProduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoProdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoProduActionPerformed(evt,productoproduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoProdu(this.productoprodu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoProdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productoproduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productoprodu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoProdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				this.productoprodu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				this.productoprodu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productoprodu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoProduModel) this.jTableDatosProductoProdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoProdu=true;
				this.inicializarActualizarBindingTablaProductoProdu(false);
				this.isEsNuevoProductoProdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProdu(false);
				
				this.habilitarDeshabilitarControlesProductoProdu(false);
				
				
				
				if(ProductoProduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoProdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoProduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoProdu.getRowCount()>=1) {
				jTableDatosProductoProdu.removeRowSelectionInterval(0, jTableDatosProductoProdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoProdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoProdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoProdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoProdu(false) ;
			
			this.isEsNuevoProductoProdu=false;
			
			if(ProductoProduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoProdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoProdu(false);
				
				//SI ES MANUAL
				if(ProductoProduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoProdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoProdu--;			
			//ProductoProdu productoproduAux= new ProductoProdu();			
			//productoproduAux.setId(this.iIdNuevoProductoProdu);
			
			if(this.jInternalFrameDetalleFormProductoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoProdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
			
			this.productoprodu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productoproduLogic.getProductoProdus().add(this.productoproduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productoprodus.add(this.productoproduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoProdu(false);
			
			this.jTableDatosProductoProdu.setRowSelectionInterval(this.getIndiceNuevoProductoProdu(), this.getIndiceNuevoProductoProdu());
			
			int iLastRow =  this.jTableDatosProductoProdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoProdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoProdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoProdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoProdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProdu(false);
			
			//SI ES MANUAL
			if(ProductoProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProdu();
			}
			
			//this.abrirFrameTreeProductoProdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Producto Parte ProduccionES ?", "MANTENIMIENTO DE Producto Parte Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoProdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoProdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productoproduReturnGeneral=productoproduLogic.procesarImportacionProductoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productoproduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoProduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoProdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoProdu.setFileImportacion(this.jInternalFrameImportacionProductoProdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoProdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoProdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoProdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoProdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoProduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoProdu> productoprodusSeleccionados=new ArrayList<ProductoProdu>();		

		productoprodusSeleccionados=this.getProductoProdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoProduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoProduBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoProdus("Todos",productoprodusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Parte Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ProductoDefiProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ProductoDefiProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ProductoDefiProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ProductoDefiProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoProduConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoProductoProdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					sNombreCampoCategoria="id_producto_defi_produ";
					break;

				case ProductoProduConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case ProductoProduConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ProductoProduConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case ProductoProduConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case ProductoProduConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ProductoProduConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case ProductoProduConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case ProductoProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					sNombreCampoCategoriaValor="id_producto_defi_produ";
					break;

				case ProductoProduConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case ProductoProduConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ProductoProduConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case ProductoProduConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case ProductoProduConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ProductoProduConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case ProductoProduConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case ProductoProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoProdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto Defi Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto_defi_produ");
					break;

				case ProductoProduConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case ProductoProduConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ProductoProduConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case ProductoProduConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case ProductoProduConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ProductoProduConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case ProductoProduConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case ProductoProduConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoProduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoProdu> productoprodusSeleccionados=new ArrayList<ProductoProdu>();		
		
		productoprodusSeleccionados=this.getProductoProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
					iRow++;

					for(ProductoProdu productoprodu:productoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodu.getproductodefiprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProductoProdu productoprodu:productoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodu.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProductoProdu productoprodu:productoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodu.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(ProductoProdu productoprodu:productoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodu.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(ProductoProdu productoprodu:productoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodu.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ProductoProdu productoprodu:productoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodu.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(ProductoProdu productoprodu:productoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodu.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(ProductoProdu productoprodu:productoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodu.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoProduConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoProduConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ProductoProdu productoprodu:productoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoprodu.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelProductoProdu(row);				
			//	iRow++;
			//}				
			
			//for(ProductoProdu productoproduAux:productoprodusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoProdu(productoproduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Parte Produccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.productoproduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProdu(false);
			
			//SI ES MANUAL
			if(ProductoProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoProdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProdu(false);
			
			//SI ES MANUAL
			if(ProductoProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoProdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoProdu(false);
			
			//SI ES MANUAL
			if(ProductoProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoProdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoProdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoProdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoProdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoProdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoProdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoProdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoProdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoProdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoProdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoProdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoProdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoProdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoProdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoProdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoProdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoProduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoProduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoProdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoProdu();
		
		this.inicializarActualizarBindingBotonesManualProductoProdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoProdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoProdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoProdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoProdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoProdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoProdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoProdu.jCheckBoxPostAccionNuevoProductoProdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoProdu.jCheckBoxPostAccionSinCerrarProductoProdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoProdu.jCheckBoxPostAccionSinMensajeProductoProdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoProdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoProdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoProdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoProdu!=null) {
				this.jInternalFrameDetalleFormProductoProdu.jCheckBoxPostAccionNuevoProductoProdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoProdu.jCheckBoxPostAccionSinCerrarProductoProdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoProdu.jCheckBoxPostAccionSinMensajeProductoProdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoProdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoProdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoProdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoProdu.jComboBoxTiposAccionesFormularioProductoProdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoProdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoProdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoProdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoProdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoProdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoProdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoProdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoProdu(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoProduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoProdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoProdu() throws Exception {
		try	{
			if(ProductoProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoProdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoProdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoProdu.jComboBoxTiposAccionesFormularioProductoProdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoProdu.jComboBoxTiposAccionesFormularioProductoProdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoProdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoProdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoProdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoProdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoProdu.addItem(reporte);
			}
			
			
			if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoProdu.jComboBoxTiposAccionesFormularioProductoProdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoProdu.jComboBoxTiposAccionesFormularioProductoProdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoProdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoProdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoProdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoProdu!=null) {
				this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoProdu!=null) {
				this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoProdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoProdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoProdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoProdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoProdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductoProduConstantesFunciones.getTiposSeleccionarProductoProdu(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductoProduConstantesFunciones.getTiposSeleccionarProductoProdu(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductoProdu.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProdu.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductoProduConstantesFunciones.getTiposSeleccionarProductoProdu(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoProdu.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductoProdu.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoProdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaProductoProdu.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaProductoProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoProductoProdu.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoProductoProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu.getSelectedItem()!=null){this.id_producto_defi_produFK_IdProductoDefiProdu=((ProductoDefiProdu)this.jComboBoxid_producto_defi_produFK_IdProductoDefiProduProductoProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadUnadProductoProdu.getSelectedItem()!=null){this.id_unidadFK_IdUnidadUnad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadUnadProductoProdu.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoProdu(Boolean esInicializar) throws Exception {				
		if(ProductoProduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoProdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoProdu() throws Exception {
		this.inicializarActualizarBindingTablaProductoProdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoProdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoProdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoProduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoProduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoProdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoProduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoProdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoProdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productoproduLogic.getProductoProdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productoprodus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoProdu.setModel(new ProductoProduModel(this.productoproduLogic.getProductoProdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoProdu.setModel(new ProductoProduModel(this.productoprodus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoProdu!=null && this.jInternalFrameOrderByProductoProdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoProdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoProduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoProduConstantesFunciones.SCLASSWEBTITULO,productoproduConstantesFunciones.resaltarSeleccionarProductoProdu,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoProduConstantesFunciones.SCLASSWEBTITULO,productoproduConstantesFunciones.resaltarSeleccionarProductoProdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,ProductoProduConstantesFunciones.LABEL_ID));

		if(this.productoproduConstantesFunciones.mostraridProductoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoproduConstantesFunciones.resaltaridProductoProdu,this.productoproduConstantesFunciones.activaridProductoProdu,iSizeTabla,this,true,"idProductoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoproduConstantesFunciones.resaltaridProductoProdu,this.productoproduConstantesFunciones.activaridProductoProdu,this,true,"idProductoProdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU));

		if(this.productoproduConstantesFunciones.mostrarid_producto_defi_produProductoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoDefiProduTableCell(this.productodefiprodusForeignKey,this.productoproduConstantesFunciones.resaltarid_producto_defi_produProductoProdu,this,this.productoproduConstantesFunciones.activarid_producto_defi_produProductoProdu,iSizeTabla));
			tableColumn.setCellEditor(new ProductoDefiProduTableCell(this.productodefiprodusForeignKey,this.productoproduConstantesFunciones.resaltarid_producto_defi_produProductoProdu,this,this.productoproduConstantesFunciones.activarid_producto_defi_produProductoProdu,true,"id_producto_defi_produProductoProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,ProductoProduConstantesFunciones.LABEL_IDBODEGA));

		if(this.productoproduConstantesFunciones.mostrarid_bodegaProductoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.productoproduConstantesFunciones.resaltarid_bodegaProductoProdu,this,this.productoproduConstantesFunciones.activarid_bodegaProductoProdu,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.productoproduConstantesFunciones.resaltarid_bodegaProductoProdu,this,this.productoproduConstantesFunciones.activarid_bodegaProductoProdu,true,"id_bodegaProductoProdu","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ProductoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,ProductoProduConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.productoproduConstantesFunciones.mostrarid_productoProductoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.productoproduConstantesFunciones.resaltarid_productoProductoProdu,this,this.productoproduConstantesFunciones.activarid_productoProductoProdu,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.productoproduConstantesFunciones.resaltarid_productoProductoProdu,this,this.productoproduConstantesFunciones.activarid_productoProductoProdu,true,"id_productoProductoProdu","CON_BUSQUEDA-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ProductoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,ProductoProduConstantesFunciones.LABEL_IDUNIDAD));

		if(this.productoproduConstantesFunciones.mostrarid_unidadProductoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.productoproduConstantesFunciones.resaltarid_unidadProductoProdu,this,this.productoproduConstantesFunciones.activarid_unidadProductoProdu,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.productoproduConstantesFunciones.resaltarid_unidadProductoProdu,this,this.productoproduConstantesFunciones.activarid_unidadProductoProdu,true,"id_unidadProductoProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,ProductoProduConstantesFunciones.LABEL_PORCENTAJE));

		if(this.productoproduConstantesFunciones.mostrarporcentajeProductoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoproduConstantesFunciones.resaltarporcentajeProductoProdu,this.productoproduConstantesFunciones.activarporcentajeProductoProdu,iSizeTabla,this,true,"porcentajeProductoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoproduConstantesFunciones.resaltarporcentajeProductoProdu,this.productoproduConstantesFunciones.activarporcentajeProductoProdu,this,true,"porcentajeProductoProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,ProductoProduConstantesFunciones.LABEL_CANTIDAD));

		if(this.productoproduConstantesFunciones.mostrarcantidadProductoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoproduConstantesFunciones.resaltarcantidadProductoProdu,this.productoproduConstantesFunciones.activarcantidadProductoProdu,iSizeTabla,this,true,"cantidadProductoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoproduConstantesFunciones.resaltarcantidadProductoProdu,this.productoproduConstantesFunciones.activarcantidadProductoProdu,this,true,"cantidadProductoProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,ProductoProduConstantesFunciones.LABEL_COSTO));

		if(this.productoproduConstantesFunciones.mostrarcostoProductoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoproduConstantesFunciones.resaltarcostoProductoProdu,this.productoproduConstantesFunciones.activarcostoProductoProdu,iSizeTabla,this,true,"costoProductoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoproduConstantesFunciones.resaltarcostoProductoProdu,this.productoproduConstantesFunciones.activarcostoProductoProdu,this,true,"costoProductoProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,ProductoProduConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.productoproduConstantesFunciones.mostrarcosto_totalProductoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoproduConstantesFunciones.resaltarcosto_totalProductoProdu,this.productoproduConstantesFunciones.activarcosto_totalProductoProdu,iSizeTabla,this,true,"costo_totalProductoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoproduConstantesFunciones.resaltarcosto_totalProductoProdu,this.productoproduConstantesFunciones.activarcosto_totalProductoProdu,this,true,"costo_totalProductoProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,ProductoProduConstantesFunciones.LABEL_DESCRIPCION));

		if(this.productoproduConstantesFunciones.mostrardescripcionProductoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoProduConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productoproduConstantesFunciones.resaltardescripcionProductoProdu,this.productoproduConstantesFunciones.activardescripcionProductoProdu,iSizeTabla,this,true,"descripcionProductoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoproduConstantesFunciones.resaltardescripcionProductoProdu,this.productoproduConstantesFunciones.activardescripcionProductoProdu,this,true,"descripcionProductoProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productoproduSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoproduSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoproduSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoProdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoproduSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoproduSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoProdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoProdu && this.isPermisoGuardarCambiosProductoProdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productoproduSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productoproduSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoProdu.addColumn(tableColumn);
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
			
			this.jTableDatosProductoProdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoProdu && this.isPermisoGuardarCambiosProductoProdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoProdu && this.isPermisoGuardarCambiosProductoProdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoProdu.moveColumn(this.jTableDatosProductoProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoProdu.moveColumn(this.jTableDatosProductoProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoProdu.moveColumn(this.jTableDatosProductoProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoProdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoProdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoProdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoProdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoProdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoProdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoProdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoProdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productoproduLogic.getProductoProdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productoprodus.size()-1;
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
		//this.jTableDatosProductoProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoProdu();
			
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
				
				//this.isEsNuevoProductoProdu=false;
					
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			
				if(this.productoproduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoProdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoProdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productoprodu.getsType().equals("DUPLICADO")
				   || this.productoprodu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoProdu=true;
				
				} else {
					this.isEsNuevoProductoProdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productoproduSessionBean.getEsGuardarRelacionado()) {
					if(this.productoprodu.getId()>=0 && !this.productoprodu.getIsNew()) {						
						this.isEsNuevoProductoProdu=false;
						
					} else {
						this.isEsNuevoProductoProdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoProdu(esRelaciones);						
				
				this.seleccionarProductoProdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productoprodu.getId()<0) {
					this.isEsNuevoProductoProdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoProdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoProdu(evt,rowIndex);
				}	
				
				if(this.productoproduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoProdu: " + this.dDif); 
					}
				}								
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoProdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productoprodu)) {
					if(this.productoprodu.getId()>0) {
						this.productoprodu.setIsDeleted(true);
						
						this.productoprodusEliminados.add(this.productoprodu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoproduLogic.getProductoProdus().remove(this.productoprodu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoprodus.remove(this.productoprodu);				
					}
					
					
					((ProductoProduModel) this.jTableDatosProductoProdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoProdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoProdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoProdu) {
			
			if(this.jInternalFrameDetalleFormProductoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoProdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoProdu(this.productoprodu);
				}
				
				//ARCHITECTURE
				try {
					

					//ProductoDefiProdu
					if(!this.productoproduConstantesFunciones.cargarid_producto_defi_produProductoProdu || this.productoproduConstantesFunciones.event_dependid_producto_defi_produProductoProdu) {
						//this.cargarCombosProductoDefiProdusForeignKeyLista(" where id="+this.productoprodu.getid_producto_defi_produ());
									//this.inicializarActualizarBindingProductoProdu(false,false);
						this.productodefiprodusForeignKey=new ArrayList<ProductoDefiProdu>();

						if(productoprodu.getProductoDefiProdu()!=null) {
							this.productodefiprodusForeignKey.add(productoprodu.getProductoDefiProdu());
						}

						this.addItemDefectoCombosForeignKeyProductoDefiProdu();
						this.cargarCombosFrameProductoDefiProdusForeignKey("Todos");
					}
					this.setActualProductoDefiProduForeignKey(this.productoprodu.getid_producto_defi_produ(),false,"Formulario");

					//Bodega
					if(!this.productoproduConstantesFunciones.cargarid_bodegaProductoProdu || this.productoproduConstantesFunciones.event_dependid_bodegaProductoProdu) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.productoprodu.getid_bodega());
									//this.inicializarActualizarBindingProductoProdu(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(productoprodu.getBodega()!=null) {
							this.bodegasForeignKey.add(productoprodu.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.productoprodu.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.productoproduConstantesFunciones.cargarid_productoProductoProdu || this.productoproduConstantesFunciones.event_dependid_productoProductoProdu) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.productoprodu.getid_producto());
									//this.inicializarActualizarBindingProductoProdu(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(productoprodu.getProducto()!=null) {
							this.productosForeignKey.add(productoprodu.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.productoprodu.getid_producto(),false,"Formulario");

					//Unidad
					if(!this.productoproduConstantesFunciones.cargarid_unidadProductoProdu || this.productoproduConstantesFunciones.event_dependid_unidadProductoProdu) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.productoprodu.getid_unidad());
									//this.inicializarActualizarBindingProductoProdu(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(productoprodu.getUnidad()!=null) {
							this.unidadsForeignKey.add(productoprodu.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.productoprodu.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoProdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoProdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoProdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoProdu(ProductoProdu productoprodu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoProdu(productoprodu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoProdu(ProductoProdu productoprodu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoProdu(productoprodu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoProdu(productoprodu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoProdu(productoprodu);
	}
	
	public void setVariablesObjetoActualToFormularioProductoProdu(ProductoProdu productoprodu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoProdu.jLabelidProductoProdu.setText(productoprodu.getId().toString());
			this.jInternalFrameDetalleFormProductoProdu.jTextFieldporcentajeProductoProdu.setText(productoprodu.getporcentaje().toString());
			this.jInternalFrameDetalleFormProductoProdu.jTextFieldcantidadProductoProdu.setText(productoprodu.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoProdu.jTextFieldcostoProductoProdu.setText(productoprodu.getcosto().toString());
			this.jInternalFrameDetalleFormProductoProdu.jTextFieldcosto_totalProductoProdu.setText(productoprodu.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoProdu.jTextAreadescripcionProductoProdu.setText(productoprodu.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoProdu productoproduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productoproduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoProdu productoproduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productoproduLocal=this.productoprodu;
			} else {
				productoproduLocal=this.productoproduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productoproduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoProdu(productoproduLocal,true);
					
					if(productoproduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productoproduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productoproduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productoproduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoProdu(ProductoProdu productoprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoProdu(productoprodu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(productoprodu);
	}
	
	public void setVariablesFormularioToObjetoActualProductoProdu(ProductoProdu productoprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoProdu(productoprodu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoProdu(ProductoProdu productoprodu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoProdu.jLabelidProductoProdu.getText()==null || this.jInternalFrameDetalleFormProductoProdu.jLabelidProductoProdu.getText()=="" || this.jInternalFrameDetalleFormProductoProdu.jLabelidProductoProdu.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoProdu.jLabelidProductoProdu.setText("0");
			}

			if(conColumnasBase) {productoprodu.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoProdu.jLabelidProductoProdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProdu.jLabelIdProductoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodu.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormProductoProdu.jTextFieldporcentajeProductoProdu.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProdu.jLabelporcentajeProductoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodu.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormProductoProdu.jTextFieldcantidadProductoProdu.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProdu.jLabelcantidadProductoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodu.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormProductoProdu.jTextFieldcostoProductoProdu.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProdu.jLabelcostoProductoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodu.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormProductoProdu.jTextFieldcosto_totalProductoProdu.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProdu.jLabelcosto_totalProductoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoprodu.setdescripcion(this.jInternalFrameDetalleFormProductoProdu.jTextAreadescripcionProductoProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoProduConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoProdu.jLabeldescripcionProductoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoProdu(ProductoProdu productoproduBean,ProductoProdu productoprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productoproduBean.getid_producto_defi_produ()!=null && !productoproduBean.getid_producto_defi_produ().equals(-1L))) {productoprodu.setid_producto_defi_produ(productoproduBean.getid_producto_defi_produ());}
			if(conDefault || (!conDefault && productoproduBean.getid_bodega()!=null && !productoproduBean.getid_bodega().equals(-1L))) {productoprodu.setid_bodega(productoproduBean.getid_bodega());}
			if(conDefault || (!conDefault && productoproduBean.getid_producto()!=null && !productoproduBean.getid_producto().equals(-1L))) {productoprodu.setid_producto(productoproduBean.getid_producto());}
			if(conDefault || (!conDefault && productoproduBean.getid_unidad()!=null && !productoproduBean.getid_unidad().equals(-1L))) {productoprodu.setid_unidad(productoproduBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoProdu(ProductoProdu productoproduOrigen,ProductoProdu productoprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoproduOrigen.getId()!=null && !productoproduOrigen.getId().equals(0L))) {productoprodu.setId(productoproduOrigen.getId());}}
			if(conDefault || (!conDefault && productoproduOrigen.getid_producto_defi_produ()!=null && !productoproduOrigen.getid_producto_defi_produ().equals(-1L))) {productoprodu.setid_producto_defi_produ(productoproduOrigen.getid_producto_defi_produ());}
			if(conDefault || (!conDefault && productoproduOrigen.getid_bodega()!=null && !productoproduOrigen.getid_bodega().equals(-1L))) {productoprodu.setid_bodega(productoproduOrigen.getid_bodega());}
			if(conDefault || (!conDefault && productoproduOrigen.getid_producto()!=null && !productoproduOrigen.getid_producto().equals(-1L))) {productoprodu.setid_producto(productoproduOrigen.getid_producto());}
			if(conDefault || (!conDefault && productoproduOrigen.getid_unidad()!=null && !productoproduOrigen.getid_unidad().equals(-1L))) {productoprodu.setid_unidad(productoproduOrigen.getid_unidad());}
			if(conDefault || (!conDefault && productoproduOrigen.getporcentaje()!=null && !productoproduOrigen.getporcentaje().equals(0.0))) {productoprodu.setporcentaje(productoproduOrigen.getporcentaje());}
			if(conDefault || (!conDefault && productoproduOrigen.getcantidad()!=null && !productoproduOrigen.getcantidad().equals(0))) {productoprodu.setcantidad(productoproduOrigen.getcantidad());}
			if(conDefault || (!conDefault && productoproduOrigen.getcosto()!=null && !productoproduOrigen.getcosto().equals(0.0))) {productoprodu.setcosto(productoproduOrigen.getcosto());}
			if(conDefault || (!conDefault && productoproduOrigen.getcosto_total()!=null && !productoproduOrigen.getcosto_total().equals(0.0))) {productoprodu.setcosto_total(productoproduOrigen.getcosto_total());}
			if(conDefault || (!conDefault && productoproduOrigen.getdescripcion()!=null && !productoproduOrigen.getdescripcion().equals(""))) {productoprodu.setdescripcion(productoproduOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoProdu(ProductoProdu productoprodu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoProdu.jLabelidProductoProdu.setText(productoprodu.getId().toString());
			this.jInternalFrameDetalleFormProductoProdu.jTextFieldporcentajeProductoProdu.setText(productoprodu.getporcentaje().toString());
			this.jInternalFrameDetalleFormProductoProdu.jTextFieldcantidadProductoProdu.setText(productoprodu.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoProdu.jTextFieldcostoProductoProdu.setText(productoprodu.getcosto().toString());
			this.jInternalFrameDetalleFormProductoProdu.jTextFieldcosto_totalProductoProdu.setText(productoprodu.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoProdu.jTextAreadescripcionProductoProdu.setText(productoprodu.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoProdu(ProductoProduBean productoproduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoProdu.jLabelidProductoProdu.setText(productoproduBean.getId().toString());
			this.jInternalFrameDetalleFormProductoProdu.jTextFieldporcentajeProductoProdu.setText(productoproduBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormProductoProdu.jTextFieldcantidadProductoProdu.setText(productoproduBean.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoProdu.jTextFieldcostoProductoProdu.setText(productoproduBean.getcosto().toString());
			this.jInternalFrameDetalleFormProductoProdu.jTextFieldcosto_totalProductoProdu.setText(productoproduBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoProdu.jTextAreadescripcionProductoProdu.setText(productoproduBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoProdu(ProductoProduParameterReturnGeneral productoproduReturnGeneral,ProductoProduBean productoproduBean,Boolean conDefault) throws Exception { 
		try {
			ProductoProdu productoproduLocal=new ProductoProdu();
			
			productoproduLocal=productoproduReturnGeneral.getProductoProdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoproduLocal.getId()!=null && !productoproduLocal.getId().equals(0L))) {productoproduBean.setId(productoproduLocal.getId());}}
			if(conDefault || (!conDefault && productoproduLocal.getid_producto_defi_produ()!=null && !productoproduLocal.getid_producto_defi_produ().equals(-1L))) {productoproduBean.setid_producto_defi_produ(productoproduLocal.getid_producto_defi_produ());}
			if(conDefault || (!conDefault && productoproduLocal.getid_bodega()!=null && !productoproduLocal.getid_bodega().equals(-1L))) {productoproduBean.setid_bodega(productoproduLocal.getid_bodega());}
			if(conDefault || (!conDefault && productoproduLocal.getid_producto()!=null && !productoproduLocal.getid_producto().equals(-1L))) {productoproduBean.setid_producto(productoproduLocal.getid_producto());}
			if(conDefault || (!conDefault && productoproduLocal.getid_unidad()!=null && !productoproduLocal.getid_unidad().equals(-1L))) {productoproduBean.setid_unidad(productoproduLocal.getid_unidad());}
			if(conDefault || (!conDefault && productoproduLocal.getporcentaje()!=null && !productoproduLocal.getporcentaje().equals(0.0))) {productoproduBean.setporcentaje(productoproduLocal.getporcentaje());}
			if(conDefault || (!conDefault && productoproduLocal.getcantidad()!=null && !productoproduLocal.getcantidad().equals(0))) {productoproduBean.setcantidad(productoproduLocal.getcantidad());}
			if(conDefault || (!conDefault && productoproduLocal.getcosto()!=null && !productoproduLocal.getcosto().equals(0.0))) {productoproduBean.setcosto(productoproduLocal.getcosto());}
			if(conDefault || (!conDefault && productoproduLocal.getcosto_total()!=null && !productoproduLocal.getcosto_total().equals(0.0))) {productoproduBean.setcosto_total(productoproduLocal.getcosto_total());}
			if(conDefault || (!conDefault && productoproduLocal.getdescripcion()!=null && !productoproduLocal.getdescripcion().equals(""))) {productoproduBean.setdescripcion(productoproduLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoProduGenerico(Long idProductoProduSeleccionado,JComboBox jComboBoxProductoProdu,List<ProductoProdu> productoprodusLocal)throws Exception {
		try {
			ProductoProdu  productoproduTemp=null;

			for(ProductoProdu productoproduAux:productoprodusLocal) {
				if(productoproduAux.getId()!=null && productoproduAux.getId().equals(idProductoProduSeleccionado)) {
					productoproduTemp=productoproduAux;
					break;
				}
			}

			jComboBoxProductoProdu.setSelectedItem(productoproduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoProduGenerico(JComboBox jComboBoxProductoProdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoProdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoProdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoprodu=(ProductoProdu) productoproduLogic.getProductoProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoprodu =(ProductoProdu) productoprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("ProductoDefiProdu")) {
			//sDescripcion=this.getActualProductoDefiProduForeignKeyDescripcion((Long)value);
			if(!productoprodu.getIsNew() && !productoprodu.getIsChanged() && !productoprodu.getIsDeleted()) {
				sDescripcion=productoprodu.getproductodefiprodu_descripcion();
			} else {
				//sDescripcion=this.getActualProductoDefiProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodu.getproductodefiprodu_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!productoprodu.getIsNew() && !productoprodu.getIsChanged() && !productoprodu.getIsDeleted()) {
				sDescripcion=productoprodu.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=productoprodu.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!productoprodu.getIsNew() && !productoprodu.getIsChanged() && !productoprodu.getIsDeleted()) {
				sDescripcion=productoprodu.getproducto_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=productoprodu.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!productoprodu.getIsNew() && !productoprodu.getIsChanged() && !productoprodu.getIsDeleted()) {
				sDescripcion=productoprodu.getunidad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=productoprodu.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoProdu productoproduRow=new ProductoProdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoproduRow=(ProductoProdu) productoproduLogic.getProductoProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoproduRow=(ProductoProdu) productoprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoProdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoProdu.setVisible((this.isVisibilidadCeldaNuevoProductoProdu && this.isPermisoNuevoProductoProdu));			
			this.jButtonDuplicarProductoProdu.setVisible((this.isVisibilidadCeldaDuplicarProductoProdu && this.isPermisoDuplicarProductoProdu));			
			this.jButtonCopiarProductoProdu.setVisible((this.isVisibilidadCeldaCopiarProductoProdu && this.isPermisoCopiarProductoProdu));
			this.jButtonVerFormProductoProdu.setVisible((this.isVisibilidadCeldaVerFormProductoProdu && this.isPermisoVerFormProductoProdu));
			
			this.jButtonAbrirOrderByProductoProdu.setVisible((this.isVisibilidadCeldaOrdenProductoProdu && this.isPermisoOrdenProductoProdu));			
			
			this.jButtonNuevoRelacionesProductoProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProdu && this.isPermisoNuevoProductoProdu));			
			this.jButtonNuevoGuardarCambiosProductoProdu.setVisible((this.isVisibilidadCeldaNuevoProductoProdu && this.isPermisoNuevoProductoProdu && this.isPermisoGuardarCambiosProductoProdu));
			
			if(this.jInternalFrameDetalleFormProductoProdu!=null) {
			this.jInternalFrameDetalleFormProductoProdu.jButtonModificarProductoProdu.setVisible((this.isVisibilidadCeldaModificarProductoProdu && this.isPermisoActualizarProductoProdu));	
			this.jInternalFrameDetalleFormProductoProdu.jButtonActualizarProductoProdu.setVisible((this.isVisibilidadCeldaActualizarProductoProdu && this.isPermisoActualizarProductoProdu));	
			this.jInternalFrameDetalleFormProductoProdu.jButtonEliminarProductoProdu.setVisible((this.isVisibilidadCeldaEliminarProductoProdu && this.isPermisoEliminarProductoProdu));
			this.jInternalFrameDetalleFormProductoProdu.jButtonCancelarProductoProdu.setVisible(this.isVisibilidadCeldaCancelarProductoProdu);							
			this.jInternalFrameDetalleFormProductoProdu.jButtonGuardarCambiosProductoProdu.setVisible((this.isVisibilidadCeldaGuardarProductoProdu && this.isPermisoGuardarCambiosProductoProdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProdu && this.isPermisoGuardarCambiosProductoProdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoProdu.setVisible((this.isVisibilidadCeldaNuevoProductoProdu && this.isPermisoNuevoProductoProdu));						
			this.jButtonDuplicarToolBarProductoProdu.setVisible((this.isVisibilidadCeldaDuplicarProductoProdu && this.isPermisoDuplicarProductoProdu));						
			this.jButtonCopiarToolBarProductoProdu.setVisible((this.isVisibilidadCeldaCopiarProductoProdu && this.isPermisoCopiarProductoProdu));			
			this.jButtonVerFormToolBarProductoProdu.setVisible((this.isVisibilidadCeldaVerFormProductoProdu && this.isPermisoVerFormProductoProdu));			
			this.jButtonAbrirOrderByToolBarProductoProdu.setVisible((this.isVisibilidadCeldaOrdenProductoProdu && this.isPermisoOrdenProductoProdu));
			this.jButtonNuevoRelacionesToolBarProductoProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProdu && this.isPermisoNuevoProductoProdu));			
			this.jButtonNuevoGuardarCambiosToolBarProductoProdu.setVisible((this.isVisibilidadCeldaNuevoProductoProdu && this.isPermisoNuevoProductoProdu && this.isPermisoGuardarCambiosProductoProdu));			
			
			if(this.jInternalFrameDetalleFormProductoProdu!=null) {
			this.jInternalFrameDetalleFormProductoProdu.jButtonModificarToolBarProductoProdu.setVisible((this.isVisibilidadCeldaModificarProductoProdu && this.isPermisoActualizarProductoProdu));	
			this.jInternalFrameDetalleFormProductoProdu.jButtonActualizarToolBarProductoProdu.setVisible((this.isVisibilidadCeldaActualizarProductoProdu  && this.isPermisoActualizarProductoProdu));	
			this.jInternalFrameDetalleFormProductoProdu.jButtonEliminarToolBarProductoProdu.setVisible((this.isVisibilidadCeldaEliminarProductoProdu && this.isPermisoEliminarProductoProdu));
			this.jInternalFrameDetalleFormProductoProdu.jButtonCancelarToolBarProductoProdu.setVisible(this.isVisibilidadCeldaCancelarProductoProdu);				
			this.jInternalFrameDetalleFormProductoProdu.jButtonGuardarCambiosToolBarProductoProdu.setVisible((this.isVisibilidadCeldaGuardarProductoProdu && this.isPermisoGuardarCambiosProductoProdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProdu && this.isPermisoGuardarCambiosProductoProdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoProdu.setVisible((this.isVisibilidadCeldaNuevoProductoProdu && this.isPermisoNuevoProductoProdu));			
			this.jMenuItemDuplicarProductoProdu.setVisible((this.isVisibilidadCeldaDuplicarProductoProdu && this.isPermisoDuplicarProductoProdu));			
			this.jMenuItemCopiarProductoProdu.setVisible((this.isVisibilidadCeldaCopiarProductoProdu && this.isPermisoCopiarProductoProdu));			
			this.jMenuItemVerFormProductoProdu.setVisible((this.isVisibilidadCeldaVerFormProductoProdu && this.isPermisoVerFormProductoProdu));			
			this.jMenuItemAbrirOrderByProductoProdu.setVisible((this.isVisibilidadCeldaOrdenProductoProdu && this.isPermisoOrdenProductoProdu));			
			//this.jMenuItemMostrarOcultarProductoProdu.setVisible((this.isVisibilidadCeldaOrdenProductoProdu && this.isPermisoOrdenProductoProdu));
			this.jMenuItemDetalleAbrirOrderByProductoProdu.setVisible((this.isVisibilidadCeldaOrdenProductoProdu && this.isPermisoOrdenProductoProdu));			
			//this.jMenuItemDetalleMostrarOcultarProductoProdu.setVisible((this.isVisibilidadCeldaOrdenProductoProdu && this.isPermisoOrdenProductoProdu));			
			this.jMenuItemNuevoRelacionesProductoProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoProdu && this.isPermisoNuevoProductoProdu));			
			this.jMenuItemNuevoGuardarCambiosProductoProdu.setVisible((this.isVisibilidadCeldaNuevoProductoProdu && this.isPermisoNuevoProductoProdu && this.isPermisoGuardarCambiosProductoProdu));									
			
			if(this.jInternalFrameDetalleFormProductoProdu!=null) {
			this.jInternalFrameDetalleFormProductoProdu.jMenuItemModificarProductoProdu.setVisible((this.isVisibilidadCeldaModificarProductoProdu && this.isPermisoActualizarProductoProdu));	
			this.jInternalFrameDetalleFormProductoProdu.jMenuItemActualizarProductoProdu.setVisible((this.isVisibilidadCeldaActualizarProductoProdu && this.isPermisoActualizarProductoProdu));	
			this.jInternalFrameDetalleFormProductoProdu.jMenuItemEliminarProductoProdu.setVisible((this.isVisibilidadCeldaEliminarProductoProdu && this.isPermisoEliminarProductoProdu));
			this.jInternalFrameDetalleFormProductoProdu.jMenuItemCancelarProductoProdu.setVisible(this.isVisibilidadCeldaCancelarProductoProdu);				
			}
			
			this.jMenuItemGuardarCambiosProductoProdu.setVisible((this.isVisibilidadCeldaGuardarProductoProdu && this.isPermisoGuardarCambiosProductoProdu));						
			this.jMenuItemGuardarCambiosTablaProductoProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoProdu && this.isPermisoGuardarCambiosProductoProdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoProdu=this.jButtonNuevoProductoProdu.isVisible();
			this.isVisibilidadCeldaDuplicarProductoProdu=this.jButtonDuplicarProductoProdu.isVisible();
			this.isVisibilidadCeldaCopiarProductoProdu=this.jButtonCopiarProductoProdu.isVisible();
			this.isVisibilidadCeldaVerFormProductoProdu=this.jButtonVerFormProductoProdu.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoProdu=this.jButtonAbrirOrderByProductoProdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoProdu=this.jButtonNuevoRelacionesProductoProdu.isVisible();
			this.isVisibilidadCeldaModificarProductoProdu=this.jButtonModificarProductoProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProdu!=null) {
			this.isVisibilidadCeldaActualizarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jButtonActualizarProductoProdu.isVisible();
			this.isVisibilidadCeldaEliminarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jButtonEliminarProductoProdu.isVisible();
			this.isVisibilidadCeldaCancelarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jButtonCancelarProductoProdu.isVisible();
			this.isVisibilidadCeldaGuardarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jButtonGuardarCambiosProductoProdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoProdu=this.jButtonGuardarCambiosTablaProductoProdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoProdu=this.jButtonNuevoToolBarProductoProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoProdu=this.jButtonNuevoRelacionesToolBarProductoProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProdu!=null) {
			this.isVisibilidadCeldaModificarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jButtonModificarToolBarProductoProdu.isVisible();
			this.isVisibilidadCeldaActualizarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jButtonActualizarToolBarProductoProdu.isVisible();
			this.isVisibilidadCeldaEliminarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jButtonEliminarToolBarProductoProdu.isVisible();
			this.isVisibilidadCeldaCancelarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jButtonCancelarToolBarProductoProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoProdu=this.jButtonGuardarCambiosToolBarProductoProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoProdu=this.jButtonGuardarCambiosTablaToolBarProductoProdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoProdu=this.jMenuItemNuevoProductoProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoProdu=this.jMenuItemNuevoRelacionesProductoProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoProdu!=null) {
			this.isVisibilidadCeldaModificarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jMenuItemModificarProductoProdu.isVisible();
			this.isVisibilidadCeldaActualizarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jMenuItemActualizarProductoProdu.isVisible();
			this.isVisibilidadCeldaEliminarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jMenuItemEliminarProductoProdu.isVisible();
			this.isVisibilidadCeldaCancelarProductoProdu=this.jInternalFrameDetalleFormProductoProdu.jMenuItemCancelarProductoProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoProdu=this.jMenuItemGuardarCambiosProductoProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoProdu=this.jMenuItemGuardarCambiosTablaProductoProdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoProdu(Boolean esInicializar) {
		if(ProductoProduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productoproduSessionBean.getConGuardarRelaciones()) {
				//if(this.productoproduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoProdu();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoProdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoProdu() {
		this.jButtonNuevoProductoProdu.setVisible(this.isPermisoNuevoProductoProdu);			
		this.jButtonDuplicarProductoProdu.setVisible(this.isPermisoDuplicarProductoProdu);			
		this.jButtonCopiarProductoProdu.setVisible(this.isPermisoCopiarProductoProdu);			
		this.jButtonVerFormProductoProdu.setVisible(this.isPermisoVerFormProductoProdu);			
		
		this.jButtonAbrirOrderByProductoProdu.setVisible(this.isPermisoOrdenProductoProdu);					
		
		this.jButtonNuevoRelacionesProductoProdu.setVisible(this.isPermisoNuevoProductoProdu);			
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProdu.jButtonModificarProductoProdu.setVisible(this.isPermisoActualizarProductoProdu);	
			this.jInternalFrameDetalleFormProductoProdu.jButtonActualizarProductoProdu.setVisible(this.isPermisoActualizarProductoProdu);	
			this.jInternalFrameDetalleFormProductoProdu.jButtonEliminarProductoProdu.setVisible(this.isPermisoEliminarProductoProdu);
			this.jInternalFrameDetalleFormProductoProdu.jButtonCancelarProductoProdu.setVisible(this.isVisibilidadCeldaCancelarProductoProdu);						
			this.jInternalFrameDetalleFormProductoProdu.jButtonGuardarCambiosProductoProdu.setVisible(this.isPermisoGuardarCambiosProductoProdu);							
		}
		
		this.jButtonGuardarCambiosTablaProductoProdu.setVisible(this.isPermisoActualizarProductoProdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoProdu() {
		this.jInternalFrameDetalleFormProductoProdu.jButtonModificarProductoProdu.setVisible(this.isPermisoActualizarProductoProdu);	
		this.jInternalFrameDetalleFormProductoProdu.jButtonActualizarProductoProdu.setVisible(this.isPermisoActualizarProductoProdu);	
		this.jInternalFrameDetalleFormProductoProdu.jButtonEliminarProductoProdu.setVisible(this.isPermisoEliminarProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jButtonCancelarProductoProdu.setVisible(this.isVisibilidadCeldaCancelarProductoProdu);							
		this.jInternalFrameDetalleFormProductoProdu.jButtonGuardarCambiosProductoProdu.setVisible((this.isVisibilidadCeldaGuardarProductoProdu && this.isPermisoGuardarCambiosProductoProdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoProdu() {
		if(ProductoProduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoProdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoProdu() {
	}
	
	public void jTableDatosProductoProduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoProdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProdu(this.getproductoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodu==null) {
						this.productoprodu = new ProductoProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoProdu(this.productoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
				}

				if(this.productoprodu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productoprodu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_producto_defi_produProductoProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproductodefiprodu=true;

			idTienePermisoproductodefiprodu=this.tienePermisosUsuarioEnPaginaWebProductoProdu(ProductoDefiProduConstantesFunciones.CLASSNAME);

			if(idTienePermisoproductodefiprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProdu(this.getproductoprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);

				this.productodefiproduBeanSwingJInternalFrame=new ProductoDefiProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productodefiproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productodefiproduBeanSwingJInternalFrame.getProductoDefiProduLogic().setConnexion(this.productoproduLogic.getConnexion());

				if(this.productoprodu.getid_producto_defi_produ()!=null) {
					this.productodefiproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productodefiproduBeanSwingJInternalFrame.setIdActual(this.productoprodu.getid_producto_defi_produ());
					this.productodefiproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productodefiproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productodefiproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaProductoDefiProdu();
				}

				JInternalFrameBase jinternalFrame =this.productodefiproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProdu=(TitledBorder)this.jScrollPanelDatosProductoProdu.getBorder();
				TitledBorder titledBorderproductodefiprodu=(TitledBorder)this.productodefiproduBeanSwingJInternalFrame.jScrollPanelDatosProductoDefiProdu.getBorder();

				titledBorderproductodefiprodu.setTitle(titledBorderProductoProdu.getTitle() + " -> Producto Definicion Produccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_producto_defi_produProductoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProdu(this.getproductoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodu==null) {
						this.productoprodu = new ProductoProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoProdu(this.productoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
				}

				if(this.productoprodu.getid_producto_defi_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto_defi_produ = "+this.productoprodu.getid_producto_defi_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProductoProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProductoProdu(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProdu(this.getproductoprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.productoproduLogic.getConnexion());

				if(this.productoprodu.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.productoprodu.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProdu=(TitledBorder)this.jScrollPanelDatosProductoProdu.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProductoProdu.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProductoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProdu(this.getproductoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodu==null) {
						this.productoprodu = new ProductoProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoProdu(this.productoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
				}

				if(this.productoprodu.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.productoprodu.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProductoProduActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderProductoProdu=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosProductoProdu.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoProdu=(TitledBorder)this.jScrollPanelDatosProductoProdu.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoProdu.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoProductoProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProductoProdu(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProdu(this.getproductoprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.productoproduLogic.getConnexion());

				if(this.productoprodu.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.productoprodu.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProdu=(TitledBorder)this.jScrollPanelDatosProductoProdu.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoProdu.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProductoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProdu(this.getproductoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodu==null) {
						this.productoprodu = new ProductoProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoProdu(this.productoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
				}

				if(this.productoprodu.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.productoprodu.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadProductoProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebProductoProdu(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoProdu(this.getproductoprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.productoproduLogic.getConnexion());

				if(this.productoprodu.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.productoprodu.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoProdu=(TitledBorder)this.jScrollPanelDatosProductoProdu.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderProductoProdu.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadProductoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProdu(this.getproductoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodu==null) {
						this.productoprodu = new ProductoProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoProdu(this.productoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
				}

				if(this.productoprodu.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.productoprodu.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeProductoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProdu(this.getproductoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodu==null) {
						this.productoprodu = new ProductoProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoProdu(this.productoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
				}

				if(this.productoprodu.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.productoprodu.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadProductoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProdu(this.getproductoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodu==null) {
						this.productoprodu = new ProductoProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoProdu(this.productoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
				}

				if(this.productoprodu.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.productoprodu.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoProductoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProdu(this.getproductoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodu==null) {
						this.productoprodu = new ProductoProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoProdu(this.productoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
				}

				if(this.productoprodu.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.productoprodu.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalProductoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProdu(this.getproductoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodu==null) {
						this.productoprodu = new ProductoProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoProdu(this.productoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
				}

				if(this.productoprodu.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.productoprodu.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionProductoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoProdu(this.getproductoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoprodu==null) {
						this.productoprodu = new ProductoProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoProdu(this.productoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);
				}

				if(this.productoprodu.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.productoprodu.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaProductoProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProdu(false,false);

			this.getProductoProdusFK_IdBodega();

			this.inicializarActualizarBindingProductoProdu(false);

			//if(ProductoProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProductoProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProdu(false,false);

			this.getProductoProdusFK_IdProducto();

			this.inicializarActualizarBindingProductoProdu(false);

			//if(ProductoProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoDefiProduProductoProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProdu(false,false);

			this.getProductoProdusFK_IdProductoDefiProdu();

			this.inicializarActualizarBindingProductoProdu(false);

			//if(ProductoProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadUnadProductoProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoProdu(false,false);

			this.getProductoProdusFK_IdUnidadUnad();

			this.inicializarActualizarBindingProductoProdu(false);

			//if(ProductoProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoProdu() {
		if(this.jInternalFrameDetalleFormProductoProdu!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) {
			this.jInternalFrameDetalleFormProductoProdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoProdu.dispose();
			this.jInternalFrameDetalleFormProductoProdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoProdu!=null) {
			this.jInternalFrameReporteDinamicoProductoProdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoProdu.dispose();
			this.jInternalFrameReporteDinamicoProductoProdu=null;
		}
		
		if(this.jInternalFrameImportacionProductoProdu!=null) {
			this.jInternalFrameImportacionProductoProdu.setVisible(false);	    			
			this.jInternalFrameImportacionProductoProdu.dispose();
			this.jInternalFrameImportacionProductoProdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoProdu();
			
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoProdu")) {
				jButtonNuevoProductoProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoProdu")) {
				jButtonDuplicarProductoProduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoProdu")) {
				jButtonCopiarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoProdu")) {
				jButtonVerFormProductoProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoProdu")) {
				jButtonNuevoProductoProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoProdu")) {
				jButtonDuplicarProductoProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoProdu")) {
				jButtonNuevoProductoProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoProdu")) {
				jButtonDuplicarProductoProduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoProdu")) {
				jButtonNuevoProductoProduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoProdu")) {
				jButtonNuevoProductoProduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoProdu")) {
				jButtonNuevoProductoProduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoProdu")) {
				jButtonModificarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoProdu")) {
				jButtonModificarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoProdu")) {
				jButtonModificarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoProdu")) {
				jButtonActualizarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoProdu")) {
				jButtonActualizarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoProdu")) {
				jButtonActualizarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoProdu")) {
				jButtonEliminarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoProdu")) {
				jButtonEliminarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoProdu")) {
				jButtonEliminarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoProdu")) {
				jButtonCancelarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoProdu")) {
				jButtonCancelarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoProdu")) {
				jButtonCancelarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoProdu")) {
				jButtonCerrarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoProdu")) {
				jButtonCerrarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoProdu")) {
				jButtonCerrarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoProdu")) {
				jButtonMostrarOcultarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoProdu")) {
				jButtonCancelarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoProdu")) {
				jButtonGuardarCambiosProductoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoProdu")) {
				jButtonGuardarCambiosProductoProduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoProdu")) {
				jButtonCopiarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoProdu")) {
				jButtonVerFormProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoProdu")) {
				jButtonGuardarCambiosProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoProdu")) {
				jButtonCopiarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoProdu")) {
				jButtonVerFormProductoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoProdu")) {
				jButtonGuardarCambiosProductoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoProdu")) {
				jButtonGuardarCambiosProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoProdu")) {
				jButtonGuardarCambiosProductoProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoProdu")) {
				jButtonRecargarInformacionProductoProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoProdu")) {
				jButtonRecargarInformacionProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoProdu")) {
				jButtonRecargarInformacionProductoProduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoProdu")) {
				jButtonAnterioresProductoProduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoProdu")) {
				jButtonAnterioresProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoProdu")) {
				jButtonAnterioresProductoProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoProdu")) {
				jButtonSiguientesProductoProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoProdu")) {
				jButtonSiguientesProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoProdu")) {
				jButtonSiguientesProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoProdu") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoProdu")) {
				jButtonAbrirOrderByProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoProdu") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoProdu")) {
				jButtonMostrarOcultarProductoProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoProdu")) {
				jButtonNuevoGuardarCambiosProductoProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoProdu")) {
				jButtonNuevoGuardarCambiosProductoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoProdu")) {
				jButtonNuevoGuardarCambiosProductoProduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoProdu")) {
				jButtonCerrarReporteDinamicoProductoProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoProdu")) {
				jButtonGenerarReporteDinamicoProductoProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoProdu")) {
				
				jButtonGenerarExcelReporteDinamicoProductoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoProdu")) {
				jButtonCerrarImportacionProductoProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoProdu")) {
				
				jButtonGenerarImportacionProductoProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoProdu")) {
				
				jButtonAbrirImportacionProductoProduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoProdu")) {
				jComboBoxTiposAccionesProductoProduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoProdu")) {
				jComboBoxTiposRelacionesProductoProduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoProdu")) {
				jComboBoxTiposAccionesProductoProduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoProdu")) {
				
				jComboBoxTiposSeleccionarProductoProduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoProdu")) {
				jTextFieldValorCampoGeneralProductoProduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoProdu")) {
				jButtonAbrirOrderByProductoProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoProdu")) {
				jButtonAbrirOrderByProductoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoProdu")) {
				jButtonCerrarOrderByProductoProduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoProduBusqueda")) {
				this.jButtonidProductoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduUpdate")) {
				this.jButtonid_producto_defi_produProductoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduBusqueda")) {
				this.jButtonid_producto_defi_produProductoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoProduUpdate")) {
				this.jButtonid_bodegaProductoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoProduBusqueda")) {
				this.jButtonid_bodegaProductoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoProdu")) {
				this.jButtonid_productoProductoProduActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoProduUpdate")) {
				this.jButtonid_productoProductoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoProduBusqueda")) {
				this.jButtonid_productoProductoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoProduUpdate")) {
				this.jButtonid_unidadProductoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoProduBusqueda")) {
				this.jButtonid_unidadProductoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeProductoProduBusqueda")) {
				this.jButtonporcentajeProductoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoProduBusqueda")) {
				this.jButtoncantidadProductoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoProduBusqueda")) {
				this.jButtoncostoProductoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoProduBusqueda")) {
				this.jButtoncosto_totalProductoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoProduBusqueda")) {
				this.jButtondescripcionProductoProduBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoProductoProdu")) {
				this.jButtonid_productoProductoProduActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaProductoProdu")) {
				this.jButtonFK_IdBodegaProductoProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoProductoProdu")) {
				this.jButtonFK_IdProductoProductoProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoDefiProduProductoProdu")) {
				this.jButtonFK_IdProductoDefiProduProductoProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadUnadProductoProdu")) {
				this.jButtonFK_IdUnidadUnadProductoProduActionPerformed(evt);
			}
			
			;
			
			
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoProdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
				
				


				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoProdu productoproduLocal=null;
			
			if(!this.getEsControlTabla()) {
				productoproduLocal=this.productoprodu;
			} else {
				productoproduLocal=this.productoproduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
							
				
				


				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduAnterior =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoproduAnterior =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
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
			
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			
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
			
			


			
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
								
						
				


				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
								
				
				


				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduAnterior =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoproduAnterior =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduAnterior =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoproduAnterior =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
							
				
				


				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoproduAnterior =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoproduAnterior =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
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
			
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			
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
			
			


			
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
								
				
				


				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduAnterior =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoproduAnterior =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoProdu")) {
					jCheckBoxSeleccionarTodosProductoProduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoProdu")) {
					jCheckBoxSeleccionadosProductoProduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoProdu")) {
					
				}
				
				


				
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
												
				
				


				
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoproduAnterior =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoproduAnterior =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
				
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
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
			
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
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
			
			


			if(sTipo.equals("id_bodegaProductoProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu;
				}

				if(this.productoproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoProduConstantesFunciones.getClassesRelationshipsOfProductoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaProductoProdu")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaProductoProdu,"FK_IdBodega");
				//recargarFormProductoProduBodega(jComboBoxid_bodegaFK_IdBodegaProductoProdu,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoProductoProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu;
				}

				if(this.productoproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoProduConstantesFunciones.getClassesRelationshipsOfProductoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoProductoProdu")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoProductoProdu,"FK_IdProducto");
				//recargarFormProductoProduProducto(jComboBoxid_productoFK_IdProductoProductoProdu,"FK_IdProducto");
			}
			
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_bodegaProductoProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu;
				}

				if(this.productoproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoProduConstantesFunciones.getClassesRelationshipsOfProductoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaProductoProdu")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaProductoProdu,"FK_IdBodega");
				//recargarFormProductoProduBodega(jComboBoxid_bodegaFK_IdBodegaProductoProdu,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoProductoProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu;
				}

				if(this.productoproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoProduConstantesFunciones.getClassesRelationshipsOfProductoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoProductoProdu")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoProductoProdu,"FK_IdProducto");
				//recargarFormProductoProduProducto(jComboBoxid_productoFK_IdProductoProductoProdu,"FK_IdProducto");
			}
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoprodu);
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
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
				
				


			if(sTipo.equals("id_bodegaProductoProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu;
				}

				if(this.productoproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoProduConstantesFunciones.getClassesRelationshipsOfProductoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaProductoProdu")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaProductoProdu,"FK_IdBodega");
				//recargarFormProductoProduBodega(jComboBoxid_bodegaFK_IdBodegaProductoProdu,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoProductoProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu;
				}

				if(this.productoproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoProduConstantesFunciones.getClassesRelationshipsOfProductoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoProductoProdu")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoProductoProdu,"FK_IdProducto");
				//recargarFormProductoProduProducto(jComboBoxid_productoFK_IdProductoProductoProdu,"FK_IdProducto");
			}
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoProdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoproduAnterior =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoproduAnterior =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoProdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoProdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productoprodu =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productoprodu =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productoprodu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoProdu")) {
				
				}
				
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoProdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoProdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoProdu")) {
			
			}
			
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoProdu();
			
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			
			if(sTipo.equals("NuevoProductoProdu")) {
				jButtonNuevoProductoProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoProdu")) {
				jButtonDuplicarProductoProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoProdu")) {
				jButtonCopiarProductoProduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoProdu")) {
				jButtonVerFormProductoProduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoProdu")) {
				jButtonNuevoProductoProduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoProdu")) {
				jButtonModificarProductoProduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoProdu")) {
				jButtonActualizarProductoProduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoProdu")) {
				jButtonEliminarProductoProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoProdu")) {
				jButtonGuardarCambiosProductoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoProdu")) {
				jButtonCancelarProductoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoProdu")) {
				jButtonCerrarProductoProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoProdu")) {
				jButtonGuardarCambiosProductoProduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoProdu")) {
				jButtonNuevoGuardarCambiosProductoProduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoProdu")) {
				jButtonAbrirOrderByProductoProduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoProdu")) {
				jButtonRecargarInformacionProductoProduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoProdu")) {
				jButtonAnterioresProductoProduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoProdu")) {
				jButtonSiguientesProductoProduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoProduBusqueda")) {
				this.jButtonidProductoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduUpdate")) {
				this.jButtonid_producto_defi_produProductoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_producto_defi_produProductoProduBusqueda")) {
				this.jButtonid_producto_defi_produProductoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoProduUpdate")) {
				this.jButtonid_bodegaProductoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoProduBusqueda")) {
				this.jButtonid_bodegaProductoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoProdu")) {
				this.jButtonid_productoProductoProduActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoProduUpdate")) {
				this.jButtonid_productoProductoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoProduBusqueda")) {
				this.jButtonid_productoProductoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoProduUpdate")) {
				this.jButtonid_unidadProductoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoProduBusqueda")) {
				this.jButtonid_unidadProductoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeProductoProduBusqueda")) {
				this.jButtonporcentajeProductoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoProduBusqueda")) {
				this.jButtoncantidadProductoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoProduBusqueda")) {
				this.jButtoncostoProductoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoProduBusqueda")) {
				this.jButtoncosto_totalProductoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoProduBusqueda")) {
				this.jButtondescripcionProductoProduBusquedaActionPerformed(evt);
			}
			
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoProdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoProdu")) {
				closingInternalFrameProductoProdu();
				
			} else if(sTipo.equals("jButtonCancelarProductoProdu")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoProdu = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoProduBeanSwingJInternalFrame jInternalFrameParent=(ProductoProduBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoProdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoProduActionPerformed(null);
			}
			
			ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoprodu,new Object(),this.productoproduParameterGeneral,this.productoproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productoprodu)) {
			if(!esControlTabla) {
				if(ProductoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoProdu(this.productoprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);			
				}
				
				if(this.productoproduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoProdu(this.productoprodu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoproduReturnGeneral=productoproduLogic.procesarEventosProductoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoproduLogic.getProductoProdus(),this.productoprodu,this.productoproduParameterGeneral,this.isEsNuevoProductoProdu,classes);//this.productoproduLogic.getProductoProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoProdu(this.productoproduReturnGeneral,this.productoproduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoProdu(classes,this.productoproduReturnGeneral,this.productoproduBean,false);
					}
						
					if(this.productoproduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoProdu(this.productoproduReturnGeneral.getProductoProdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoProdu(this.productoproduReturnGeneral.getProductoProdu());	
					}
						
					if(this.productoproduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoProdu(this.productoproduReturnGeneral.getProductoProdu(),classes);//this.productoproduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoProdu(this.productoprodu,classes);//this.productoproduBean);									
				}
			
				if(ProductoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoProdu(this.productoprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoProdu(this.productoprodu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productoproduAnterior!=null) {
						this.productoprodu=this.productoproduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoproduReturnGeneral=productoproduLogic.procesarEventosProductoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoproduLogic.getProductoProdus(),this.productoprodu,this.productoproduParameterGeneral,this.isEsNuevoProductoProdu,classes);//this.productoproduLogic.getProductoProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productoproduReturnGeneral.getProductoProdu(),productoproduLogic.getProductoProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productoproduReturnGeneral.getProductoProdu(),this.productoprodus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoProdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoProdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoProdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoProdu() throws Exception {
		
		ProductoProduModel productoproduModel=(ProductoProduModel)this.jTableDatosProductoProdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoproduModel.productoprodus=this.productoproduLogic.getProductoProdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productoproduModel.productoprodus=this.productoprodus;
		}
		
		
		((ProductoProduModel) this.jTableDatosProductoProdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoProdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductoproduAnterior(),this.productoproduLogic.getProductoProdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductoproduAnterior(),this.productoprodus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoProdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoProdu(ProductoProdu productoprodu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
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
										
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodu,new Object(),generalEntityParameterGeneral,this.productoproduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productoproduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoProduConstantesFunciones.getClassesRelationshipsOfProductoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoProduConstantesFunciones.getClassesRelationshipsFromStringsOfProductoProdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoprodu,new Object(),generalEntityParameterGeneral,this.productoproduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoProdu(ProductoProduBean productoproduBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoProdu(ArrayList<Classe> classes,ProductoProduReturnGeneral productoproduReturnGeneral,ProductoProduBean productoproduBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoProdu(ProductoProdu productoprodu,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productoprodu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoProdu = new ProductoProduDetalleFormJInternalFrame(jDesktopPane,this.productoproduSessionBean.getConGuardarRelaciones(),this.productoproduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.setVisible(false);
		this.jInternalFrameDetalleFormProductoProdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoProdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoProdu.productoproduLogic=this.productoproduLogic;
		
		this.cargarCombosFrameForeignKeyProductoProdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoProdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoProdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoProdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoProdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoProdu"));
		
		this.jInternalFrameDetalleFormProductoProdu.jButtonModificarProductoProdu.addActionListener(new ButtonActionListener(this,"ModificarProductoProdu"));

		
		this.jInternalFrameDetalleFormProductoProdu.jButtonModificarToolBarProductoProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoProdu"));
					
		this.jInternalFrameDetalleFormProductoProdu.jMenuItemModificarProductoProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProdu.jButtonActualizarProductoProdu.addActionListener (new ButtonActionListener(this,"ActualizarProductoProdu"));
		
		
		this.jInternalFrameDetalleFormProductoProdu.jButtonActualizarToolBarProductoProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoProdu"));
						
		this.jInternalFrameDetalleFormProductoProdu.jMenuItemActualizarProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProdu.jButtonEliminarProductoProdu.addActionListener (new ButtonActionListener(this,"EliminarProductoProdu"));
		
		
		this.jInternalFrameDetalleFormProductoProdu.jButtonEliminarToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoProdu"));
								
		this.jInternalFrameDetalleFormProductoProdu.jMenuItemEliminarProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProdu.jButtonCancelarProductoProdu.addActionListener (new ButtonActionListener(this,"CancelarProductoProdu"));
		
		
		this.jInternalFrameDetalleFormProductoProdu.jButtonCancelarToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoProdu"));
					
		this.jInternalFrameDetalleFormProductoProdu.jMenuItemCancelarProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoProdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoProdu.jMenuItemDetalleCerrarProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormProductoProdu.jButtonGuardarCambiosToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProdu"));
		
		
		
		this.jInternalFrameDetalleFormProductoProdu.jButtonGuardarCambiosToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProdu"));
		
		
		
		this.jInternalFrameDetalleFormProductoProdu.jComboBoxTiposAccionesFormularioProductoProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoProdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonidProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_producto_defi_produProductoProduUpdate.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_producto_defi_produProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_bodegaProductoProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_bodegaProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoProduBusqueda"));
		//jButtonid_productoProductoProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_productoProductoProdu.addActionListener(new ButtonActionListener(this,"id_productoProductoProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_productoProductoProduUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_productoProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_unidadProductoProduUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_unidadProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonporcentajeProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProductoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtoncantidadProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtoncostoProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtoncosto_totalProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtondescripcionProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoProduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoProdu.jTabbedPaneRelacionesProductoProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoProdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoProdu"));
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoProdu"));
		}
		
		this.jTableDatosProductoProdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoProdu"));
		
		this.jTableDatosProductoProdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoProdu"));
		
		this.jButtonNuevoProductoProdu.addActionListener(new ButtonActionListener(this,"NuevoProductoProdu"));
		
		this.jButtonDuplicarProductoProdu.addActionListener(new ButtonActionListener(this,"DuplicarProductoProdu"));
		
		this.jButtonCopiarProductoProdu.addActionListener(new ButtonActionListener(this,"CopiarProductoProdu"));
		
		this.jButtonVerFormProductoProdu.addActionListener(new ButtonActionListener(this,"VerFormProductoProdu"));
		
		
		this.jButtonNuevoToolBarProductoProdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoProdu"));
			
		this.jButtonDuplicarToolBarProductoProdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoProdu"));
			
		this.jMenuItemNuevoProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoProdu"));
			
		this.jMenuItemDuplicarProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoProdu"));		
		
		
		this.jButtonNuevoRelacionesProductoProdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoProdu"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoProdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoProdu"));
			
		this.jMenuItemNuevoRelacionesProductoProdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoProdu"));		
		
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProdu.jButtonModificarProductoProdu.addActionListener(new ButtonActionListener(this,"ModificarProductoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProdu.jButtonModificarToolBarProductoProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoProdu"));
			
			this.jInternalFrameDetalleFormProductoProdu.jMenuItemModificarProductoProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoProdu.jButtonActualizarProductoProdu.addActionListener (new ButtonActionListener(this,"ActualizarProductoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProdu.jButtonActualizarToolBarProductoProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoProdu"));
				
			this.jInternalFrameDetalleFormProductoProdu.jMenuItemActualizarProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProdu.jButtonEliminarProductoProdu.addActionListener (new ButtonActionListener(this,"EliminarProductoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProdu.jButtonEliminarToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoProdu"));
						
			this.jInternalFrameDetalleFormProductoProdu.jMenuItemEliminarProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProdu.jButtonCancelarProductoProdu.addActionListener (new ButtonActionListener(this,"CancelarProductoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProdu.jButtonCancelarToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoProdu"));
			
			this.jInternalFrameDetalleFormProductoProdu.jMenuItemCancelarProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoProdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoProdu"));		
		
		
		this.jButtonCerrarProductoProdu.addActionListener (new ButtonActionListener(this,"CerrarProductoProdu"));
		
		
		this.jButtonCerrarToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoProdu"));
			
		this.jMenuItemCerrarProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoProdu"));
			
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProdu.jMenuItemDetalleCerrarProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProdu.jButtonGuardarCambiosProductoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProdu.jButtonGuardarCambiosToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoProdu"));
		}
		
		this.jButtonCopiarToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoProdu"));
			
		this.jButtonVerFormToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoProdu"));
		
		this.jMenuItemGuardarCambiosProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoProdu"));
			
		this.jMenuItemCopiarProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoProdu"));		
		
		this.jMenuItemVerFormProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoProdu"));		
		
		
		this.jButtonGuardarCambiosTablaProductoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoProdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoProdu"));
			
		this.jMenuItemGuardarCambiosTablaProductoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoProdu"));		
		
		
		
		this.jButtonRecargarInformacionProductoProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoProdu"));
					
		this.jButtonRecargarInformacionToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoProdu"));
		
		this.jMenuItemRecargarInformacionProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoProdu"));		
		
		
		
		this.jButtonAnterioresProductoProdu.addActionListener (new ButtonActionListener(this,"AnterioresProductoProdu"));
		
		
		this.jButtonAnterioresToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoProdu"));
		
		this.jMenuItemAnterioresProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoProdu"));		
		
		
		this.jButtonSiguientesProductoProdu.addActionListener (new ButtonActionListener(this,"SiguientesProductoProdu"));
		
		
		this.jButtonSiguientesToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoProdu"));
			
		this.jMenuItemSiguientesProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoProdu"));
			
		this.jMenuItemAbrirOrderByProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoProdu"));
			
		this.jMenuItemMostrarOcultarProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoProdu"));
			
		this.jMenuItemDetalleAbrirOrderByProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoProdu"));
			
		this.jMenuItemDetalleMostarOcultarProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoProdu"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoProdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoProdu"));
			
		this.jMenuItemNuevoGuardarCambiosProductoProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoProdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoProdu"));

		this.jCheckBoxSeleccionadosProductoProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoProdu"));
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProdu.jComboBoxTiposAccionesFormularioProductoProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoProdu"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoProdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoProdu"));
			
		this.jComboBoxTiposAccionesProductoProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoProdu"));
					
		this.jComboBoxTiposSeleccionarProductoProdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoProdu"));
			
		this.jTextFieldValorCampoGeneralProductoProdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoProdu"));		
		
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonidProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_producto_defi_produProductoProduUpdate.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_producto_defi_produProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_bodegaProductoProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_bodegaProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoProduBusqueda"));
		//jButtonid_productoProductoProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_productoProductoProdu.addActionListener(new ButtonActionListener(this,"id_productoProductoProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_productoProductoProduUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_productoProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_unidadProductoProduUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_unidadProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonporcentajeProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProductoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtoncantidadProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtoncostoProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtoncosto_totalProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtondescripcionProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoProduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaProductoProdu.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProductoProdu"));

			this.jButtonFK_IdProductoProductoProdu.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoProdu"));

			this.jButtonBuscarFK_IdProductoid_productoProductoProdu.addActionListener(new ButtonActionListener(this,"id_productoProductoProdu"));

			this.jButtonFK_IdProductoDefiProduProductoProdu.addActionListener(new ButtonActionListener(this,"FK_IdProductoDefiProduProductoProdu"));

			this.jButtonFK_IdUnidadUnadProductoProdu.addActionListener(new ButtonActionListener(this,"FK_IdUnidadUnadProductoProdu"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoProdu!=null) {
				this.jInternalFrameReporteDinamicoProductoProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProdu"));
				this.jInternalFrameReporteDinamicoProductoProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProdu"));
				this.jInternalFrameReporteDinamicoProductoProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoProdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoProdu"));				
			//this.jButtonGenerarReporteDinamicoProductoProdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoProdu"));
			//this.jButtonGenerarExcelReporteDinamicoProductoProdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoProdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoProdu!=null) {
				this.jInternalFrameImportacionProductoProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoProdu"));
				this.jInternalFrameImportacionProductoProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoProdu"));
				this.jInternalFrameImportacionProductoProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoProdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoProdu"));
			
			this.jButtonAbrirOrderByToolBarProductoProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoProdu"));			
			
			if(this.jInternalFrameOrderByProductoProdu!=null) {
				this.jInternalFrameOrderByProductoProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoProdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoProdu.jTabbedPaneRelacionesProductoProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoProdu"));
		
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
            		closingInternalFrameProductoProdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoProdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoProdu = (JInternalFrameBase)event.getSource();
	            	
	            ProductoProduBeanSwingJInternalFrame jInternalFrameParent=(ProductoProduBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoProdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoProduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoProdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoProdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoProdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoProdu";
		inputMap = this.jButtonNuevoProductoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoProduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoProdu";
		inputMap = this.jButtonNuevoRelacionesProductoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoProduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoProdu";
		inputMap = this.jButtonModificarProductoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoProdu";
		inputMap = this.jButtonActualizarProductoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoProdu";
		inputMap = this.jButtonEliminarProductoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoProdu";
		inputMap = this.jButtonCancelarProductoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoProdu";
		inputMap = this.jButtonCerrarProductoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoProdu.jButtonGuardarCambiosProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoProdu";
		inputMap = this.jInternalFrameDetalleFormProductoProdu.jButtonGuardarCambiosProductoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoProdu.jButtonGuardarCambiosProductoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoProdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoProduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonidProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"idProductoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_producto_defi_produProductoProduUpdate.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_producto_defi_produProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_producto_defi_produProductoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_bodegaProductoProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_bodegaProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoProduBusqueda"));
		//jButtonid_productoProductoProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_productoProductoProdu.addActionListener(new ButtonActionListener(this,"id_productoProductoProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_productoProductoProduUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_productoProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_unidadProductoProduUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonid_unidadProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtonporcentajeProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProductoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtoncantidadProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtoncostoProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtoncosto_totalProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoProdu.jButtondescripcionProductoProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoProduBusqueda"));
		
		
		this.jButtonFK_IdBodegaProductoProdu.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProductoProdu"));

		this.jButtonFK_IdProductoProductoProdu.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoProdu"));

		this.jButtonBuscarFK_IdProductoid_productoProductoProdu.addActionListener(new ButtonActionListener(this,"id_productoProductoProdu"));

		this.jButtonFK_IdProductoDefiProduProductoProdu.addActionListener(new ButtonActionListener(this,"FK_IdProductoDefiProduProductoProdu"));

		this.jButtonFK_IdUnidadUnadProductoProdu.addActionListener(new ButtonActionListener(this,"FK_IdUnidadUnadProductoProdu"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoProduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoProdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoProdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoProdu productoproduAux:this.productoproduLogic.getProductoProdus()) {
					productoproduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProdu productoproduAux:productoprodus) {
					productoproduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoProdu productoproduAux:this.productoproduLogic.getProductoProdus()) {
						productoproduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProdu productoproduAux:productoprodus) {
						productoproduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoProdu productoproduAux:this.productoproduLogic.getProductoProdus()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProdu productoproduAux:productoprodus) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoProdu.getSelectedRows();
			
			ProductoProdu productoproduLocal=new ProductoProdu();
			
			//this.seleccionarTodosProductoProdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoproduLocal =(ProductoProdu) this.productoproduLogic.getProductoProdus().toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productoproduLocal =(ProductoProdu) this.productoprodus.toArray()[this.jTableDatosProductoProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productoproduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoProdu productoproduAux:this.productoproduLogic.getProductoProdus()) {
						productoproduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoProdu productoproduAux:productoprodus) {
						productoproduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoProdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoProduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoProduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoProduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoProdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoProdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoProdu productoproduAux:this.productoproduLogic.getProductoProdus()) {
				
						if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							productoproduAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoproduAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoproduAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoproduAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProdu productoproduAux:productoprodus) {
					
						if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							productoproduAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoproduAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoproduAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoproduAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoProduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoProdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoProdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoProdu.jComboBoxTiposAccionesFormularioProductoProdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoProdu) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoProdu(conSplash);
				
					this.generarReporteProductoProdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProdu.jComboBoxTiposAccionesFormularioProductoProdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoProdusSeleccionados();
				//this.jComboBoxTiposAccionesProductoProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoProdusSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoProdusSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoProdu();
				
				this.exportarProductoProdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProdu.jComboBoxTiposAccionesFormularioProductoProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoProdus();
				//this.importarProductoProdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProdu.jComboBoxTiposAccionesFormularioProductoProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoProdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoProdusSeleccionados();
				//this.jComboBoxTiposAccionesProductoProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Producto Parte Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoProdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoProdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoProdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Producto Parte Produccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoProdu.jComboBoxTiposAccionesFormularioProductoProdu.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoProduBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoProdu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoProdu(conSplash);
					
						//this.actualizarParametrosGeneralProductoProdu();
						
						this.generarReporteProcesoAccionProductoProdusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoProdu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoProdu.jComboBoxTiposAccionesFormularioProductoProdu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoProduBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Producto Parte ProduccionES SELECCIONADOS?", "MANTENIMIENTO DE Producto Parte Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoProdu();
				
						this.actualizarParametrosGeneralProductoProdu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productoproduReturnGeneral=productoproduLogic.procesarAccionProductoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productoproduLogic.getProductoProdus(),this.productoproduParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoProdu.jComboBoxTiposAccionesFormularioProductoProdu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoProdu();
					
					ProductoProduBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoProdu.jComboBoxTiposAccionesFormularioProductoProdu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoProdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoProduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoProdu();
			
			if(this.jInternalFrameDetalleFormProductoProdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoProdu> productoprodusSeleccionados=new ArrayList<ProductoProdu>();		
			ProductoProdu productoprodu=new ProductoProdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoProdu.getSelectedItem();
			
			
			
			
			productoprodusSeleccionados=this.getProductoProdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(productoprodusSeleccionados.size()==1) {
				for(ProductoProdu productoproduAux:productoprodusSeleccionados) {
					productoprodu=productoproduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoProdu();
			
      		//this.finishProcessProductoProdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoProduReturnGeneral() throws Exception {
		if(this.productoproduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productoproduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productoproduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productoproduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productoproduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productoproduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoProdu(false);
		}
		
		if(this.productoproduReturnGeneral.getConRetornoLista() || this.productoproduReturnGeneral.getConRetornoObjeto()) {
			if(this.productoproduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoproduLogic.setProductoProdus(this.productoproduReturnGeneral.getProductoProdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productoproduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoproduLogic.setProductoProdu(this.productoproduReturnGeneral.getProductoProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoProdu(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoProdu() throws Exception {
		
		
	}
	
	public ArrayList<ProductoProdu> getProductoProdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoProdu> productoprodusSeleccionados=new ArrayList<ProductoProdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoProdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoProdu productoproduAux:productoproduLogic.getProductoProdus()) {
					if(productoproduAux.getIsSelected()) {
						productoprodusSeleccionados.add(productoproduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoProdu productoproduAux:this.productoprodus) {
					if(productoproduAux.getIsSelected()) {
						productoprodusSeleccionados.add(productoproduAux);				
					}
				}
			}
			
			if(productoprodusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productoprodusSeleccionados.addAll(this.productoproduLogic.getProductoProdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productoprodusSeleccionados.addAll(this.productoprodus);				
					}
				}
			}
		} else {
			productoprodusSeleccionados.add(this.productoprodu);
		}
		
		return productoprodusSeleccionados;
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
	
	public void generarReporteProductoProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoProdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoProdusSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Producto Parte Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoProdusSeleccionados() throws Exception {
		ArrayList<ProductoProdu> productoprodusSeleccionados=new ArrayList<ProductoProdu>();		
		
		productoprodusSeleccionados=this.getProductoProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoProdus("Todos",productoprodusSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoProdusSeleccionados() throws Exception {
		ArrayList<ProductoProdu> productoprodusSeleccionados=new ArrayList<ProductoProdu>();		
		
		productoprodusSeleccionados=this.getProductoProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoProdus("Todos",productoprodusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoProdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoProdu> productoprodusSeleccionados=new ArrayList<ProductoProdu>();
		
		productoprodusSeleccionados=this.getProductoProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoProdus("Todos",productoprodusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoProdusSeleccionados() throws Exception {
		ArrayList<ProductoProdu> productoprodusSeleccionados=new ArrayList<ProductoProdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoProdu();
		
		
		productoprodusSeleccionados=this.getProductoProdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoProdu();
		
		
		//this.generarReporteProductoProdus("Todos",productoprodusSeleccionados ,productoproduImplementable,productoproduImplementableHome);
	}
	
	public void mostrarImportacionProductoProdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoProdu();
		
		this.abrirFrameImportacionProductoProdu();		
		
			
		//this.generarReporteProductoProdus("Todos",productoprodusSeleccionados ,productoproduImplementable,productoproduImplementableHome);
	}
	
	public void importarProductoProdus() throws Exception {		
	
	}
	
	public void exportarProductoProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoProdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoProdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoProdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Producto Parte Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoProdusSeleccionados() throws Exception {
		ArrayList<ProductoProdu> productoprodusSeleccionados=new ArrayList<ProductoProdu>();		
		
		productoprodusSeleccionados=this.getProductoProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoProdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoProdu productoproduAux:productoprodusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoProdu(productoproduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productoproduAux.setsDetalleGeneralEntityReporte(productoproduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Parte Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoProdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoProduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoProduConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoProdu(ProductoProdu productoprodu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productoprodu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodu.getproductodefiprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodu.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodu.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodu.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodu.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodu.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodu.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodu.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoprodu.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoProdusSeleccionados() throws Exception {
		ArrayList<ProductoProdu> productoprodusSeleccionados=new ArrayList<ProductoProdu>();		
		
		productoprodusSeleccionados=this.getProductoProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoProdu(row);				
				iRow++;
			}				
			
			for(ProductoProdu productoproduAux:productoprodusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoProdu(productoproduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Parte Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoProdusSeleccionados() throws Exception {
		ArrayList<ProductoProdu> productoprodusSeleccionados=new ArrayList<ProductoProdu>();		
		
		productoprodusSeleccionados=this.getProductoProdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoprodu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productoprodus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productoprodu");
			//elementRoot.appendChild(element);
		
			for(ProductoProdu productoproduAux:productoprodusSeleccionados) {
				element = document.createElement("productoprodu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoProdu(productoproduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Producto Parte Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoProdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoProduConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoProdu(ProductoProdu productoprodu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodu.getproductodefiprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodu.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodu.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodu.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodu.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodu.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodu.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodu.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(productoprodu.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlProductoProdu(ProductoProdu productoprodu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoProduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productoprodu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoProduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productoprodu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementproductodefiprodu_descripcion = document.createElement(ProductoProduConstantesFunciones.IDPRODUCTODEFIPRODU);
		elementproductodefiprodu_descripcion.appendChild(document.createTextNode(productoprodu.getproductodefiprodu_descripcion()));
		element.appendChild(elementproductodefiprodu_descripcion);

		Element elementbodega_descripcion = document.createElement(ProductoProduConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(productoprodu.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ProductoProduConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(productoprodu.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementunidad_descripcion = document.createElement(ProductoProduConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(productoprodu.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementporcentaje = document.createElement(ProductoProduConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(productoprodu.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementcantidad = document.createElement(ProductoProduConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(productoprodu.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementcosto = document.createElement(ProductoProduConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(productoprodu.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementcosto_total = document.createElement(ProductoProduConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(productoprodu.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementdescripcion = document.createElement(ProductoProduConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(productoprodu.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoProductoProdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoProdu> productoprodusSeleccionados=new ArrayList<ProductoProdu>();
		
		productoprodusSeleccionados=this.getProductoProdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoProdu(productoprodusSeleccionados);
		
		this.generarReporteProductoProdus("Todos",productoprodusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoProdu(ArrayList<ProductoProdu> productoprodusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoProdu productoproduAux:productoprodusSeleccionados) {
				productoproduAux.setsDetalleGeneralEntityReporte(productoproduAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_IDPRODUCTODEFIPRODU)) {
					existe=true;
					productoproduAux.setsDescripcionGeneralEntityReporte1(productoproduAux.getproductodefiprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					productoproduAux.setsDescripcionGeneralEntityReporte1(productoproduAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					productoproduAux.setsDescripcionGeneralEntityReporte1(productoproduAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					productoproduAux.setsDescripcionGeneralEntityReporte1(productoproduAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					productoproduAux.setsDescripcionGeneralEntityReporte1(productoproduAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductoProduConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					productoproduAux.setsDescripcionGeneralEntityReporte1(productoproduAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoProdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoProdu=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoProdu=true;
				this.isVisibilidadCeldaGuardarCambiosProductoProdu=true;
			}
			
			this.isVisibilidadCeldaModificarProductoProdu=false;
			this.isVisibilidadCeldaActualizarProductoProdu=false;
			this.isVisibilidadCeldaEliminarProductoProdu=false;
			this.isVisibilidadCeldaCancelarProductoProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProdu=false;
			this.isVisibilidadCeldaModificarProductoProdu=false;
			this.isVisibilidadCeldaActualizarProductoProdu=true;
			this.isVisibilidadCeldaEliminarProductoProdu=false;
			this.isVisibilidadCeldaCancelarProductoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProdu=false;
			this.isVisibilidadCeldaModificarProductoProdu=false;
			this.isVisibilidadCeldaActualizarProductoProdu=true;
			this.isVisibilidadCeldaEliminarProductoProdu=true;
			this.isVisibilidadCeldaCancelarProductoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProdu=false;
			this.isVisibilidadCeldaModificarProductoProdu=false;
			this.isVisibilidadCeldaActualizarProductoProdu=true;
			this.isVisibilidadCeldaEliminarProductoProdu=false;
			this.isVisibilidadCeldaCancelarProductoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProdu=true;
			this.isVisibilidadCeldaGuardarCambiosProductoProdu=true;
			this.isVisibilidadCeldaModificarProductoProdu=false;
			this.isVisibilidadCeldaActualizarProductoProdu=false;
			this.isVisibilidadCeldaEliminarProductoProdu=false;
			this.isVisibilidadCeldaCancelarProductoProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoProdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProdu=false;
			this.isVisibilidadCeldaActualizarProductoProdu=false;
			this.isVisibilidadCeldaEliminarProductoProdu=false;
			this.isVisibilidadCeldaCancelarProductoProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProdu=false;
			this.isVisibilidadCeldaModificarProductoProdu=true;
			this.isVisibilidadCeldaActualizarProductoProdu=false;
			this.isVisibilidadCeldaEliminarProductoProdu=false;
			this.isVisibilidadCeldaCancelarProductoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoProdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoProduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoProdu=true;
			this.isVisibilidadCeldaGuardarCambiosProductoProdu=true;
		} else {
			this.actualizarEstadoPanelsProductoProdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoProdu=false;
			//this.isVisibilidadCeldaVerFormProductoProdu=false;
			this.isVisibilidadCeldaDuplicarProductoProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productoproduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoProdu=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productoproduSessionBean.getEsGuardarRelacionado()) {
			if(!productoproduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoProdu=false;												
			}
			
			this.jButtonCerrarProductoProdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoProdu=false;
		}
		
		if(!this.permiteMantenimiento(this.productoprodu)) {
			this.isVisibilidadCeldaActualizarProductoProdu=false;
			this.isVisibilidadCeldaEliminarProductoProdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoProdu() {
	}
	
	public void actualizarEstadoPanelsProductoProdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoProdu!=null) {
				this.jScrollPanelDatosEdicionProductoProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProdu!=null) {
				this.jTabbedPaneBusquedasProductoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProdu!=null) {
				this.jScrollPanelDatosProductoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProdu!=null) {
				this.jPanelPaginacionProductoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProdu!=null) {
				this.jPanelParametrosReportesProductoProdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoProdu!=null) {
				this.jScrollPanelDatosEdicionProductoProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProdu!=null) {
				this.jTabbedPaneBusquedasProductoProdu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoProdu!=null) {
				this.jScrollPanelDatosProductoProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProdu!=null) {
				this.jPanelPaginacionProductoProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProdu!=null) {
				this.jPanelParametrosReportesProductoProdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoProdu!=null) {
				this.jScrollPanelDatosEdicionProductoProdu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProdu!=null) {
				this.jTabbedPaneBusquedasProductoProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoProdu!=null) {
				this.jScrollPanelDatosProductoProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProdu!=null) {
				this.jPanelPaginacionProductoProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProdu!=null) {
				this.jPanelParametrosReportesProductoProdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoProdu!=null) {
				this.jScrollPanelDatosEdicionProductoProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProdu!=null) {
				this.jTabbedPaneBusquedasProductoProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoProdu!=null) {
				this.jScrollPanelDatosProductoProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoProdu!=null) {
				this.jPanelPaginacionProductoProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoProdu!=null) {
				this.jPanelParametrosReportesProductoProdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoProdu!=null) {
				this.jScrollPanelDatosEdicionProductoProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProdu!=null) {
				this.jTabbedPaneBusquedasProductoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProdu!=null) {
				this.jScrollPanelDatosProductoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProdu!=null) {
				this.jPanelPaginacionProductoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProdu!=null) {
				this.jPanelParametrosReportesProductoProdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoProdu!=null) {
				this.jScrollPanelDatosEdicionProductoProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProdu!=null) {
				this.jTabbedPaneBusquedasProductoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProdu!=null) {
				this.jScrollPanelDatosProductoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProdu!=null) {
				this.jPanelPaginacionProductoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProdu!=null) {
				this.jPanelParametrosReportesProductoProdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoProdu!=null) {
				this.jScrollPanelDatosEdicionProductoProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProdu!=null) {
				this.jTabbedPaneBusquedasProductoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoProdu!=null) {
				this.jScrollPanelDatosProductoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoProdu!=null) {
				this.jPanelPaginacionProductoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoProdu!=null) {
				this.jPanelParametrosReportesProductoProdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productoproduSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoProdu!=null) {
					this.jTabbedPaneBusquedasProductoProdu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoProdu!=null) {
				this.jPanelParametrosReportesProductoProdu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productoproduSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoProdu!=null) {
				this.jTabbedPaneBusquedasProductoProdu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoProdu!=null) {
				this.jPanelParametrosReportesProductoProdu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaProductoDefiProdu(Boolean isParaProductoDefiProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoDefiProduNegation=!isParaProductoDefiProdu;

			this.isVisibilidadFK_IdBodega=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdBodegaProductoProdu);}

			this.isVisibilidadFK_IdProducto=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdProductoProductoProdu);}

			this.isVisibilidadFK_IdProductoDefiProdu=isParaProductoDefiProdu;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdProductoDefiProduProductoProdu);}

			this.isVisibilidadFK_IdUnidadUnad=isParaProductoDefiProduNegation;
			if(!this.isVisibilidadFK_IdUnidadUnad) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdUnidadUnadProductoProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdBodegaProductoProdu);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdProductoProductoProdu);}

			this.isVisibilidadFK_IdProductoDefiProdu=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdProductoDefiProduProductoProdu);}

			this.isVisibilidadFK_IdUnidadUnad=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdUnidadUnad) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdUnidadUnadProductoProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdBodegaProductoProdu);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdProductoProductoProdu);}

			this.isVisibilidadFK_IdProductoDefiProdu=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdProductoDefiProduProductoProdu);}

			this.isVisibilidadFK_IdUnidadUnad=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdUnidadUnad) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdUnidadUnadProductoProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdBodega=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdBodegaProductoProdu);}

			this.isVisibilidadFK_IdProducto=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdProductoProductoProdu);}

			this.isVisibilidadFK_IdProductoDefiProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProductoDefiProdu) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdProductoDefiProduProductoProdu);}

			this.isVisibilidadFK_IdUnidadUnad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidadUnad) {this.jTabbedPaneBusquedasProductoProdu.remove(jPanelFK_IdUnidadUnadProductoProdu);}
		}
		
	}
	
	
	
	

	public String registrarSesionProductoProduParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(productoproduSessionBean==null) {
				productoproduSessionBean=new ProductoProduSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(productoproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.productoproduFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ProductoProduConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionProductoProdu(true);
			//productoSessionBean.setlidProductoProduActual(this.idProductoProduActual);

			productoproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoProdu(true);
			productoproduSessionBean.setlIdProductoProduActualForeignKey(this.idProductoProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoProduSessionBean productoproduSessionBean=new ProductoProduSessionBean();
		
		if(this.productoproduSessionBean==null) {
			this.productoproduSessionBean=new ProductoProduSessionBean();
		}
		
		this.productoproduSessionBean.setsUltimaBusquedaProductoProdu(this.getsAccionBusqueda());
		this.productoproduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productoproduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			productoproduSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			productoproduSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProductoDefiProdu")) {
			productoproduSessionBean.setid_producto_defi_produ(this.getid_producto_defi_produFK_IdProductoDefiProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidadUnad")) {
			productoproduSessionBean.setid_unidad(this.getid_unidadFK_IdUnidadUnad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoProduSessionBean productoproduSessionBean=new ProductoProduSessionBean();
		
		if(this.productoproduSessionBean==null) {
			this.productoproduSessionBean=new ProductoProduSessionBean();
		}
		
		if(this.productoproduSessionBean.getsUltimaBusquedaProductoProdu()!=null&&!this.productoproduSessionBean.getsUltimaBusquedaProductoProdu().equals("")) {
			this.setsAccionBusqueda(productoproduSessionBean.getsUltimaBusquedaProductoProdu());
			this.setiNumeroPaginacion(productoproduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productoproduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(productoproduSessionBean.getid_bodega());
				productoproduSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(productoproduSessionBean.getid_producto());
				productoproduSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProductoDefiProdu")) {
				this.setid_producto_defi_produFK_IdProductoDefiProdu(productoproduSessionBean.getid_producto_defi_produ());
				productoproduSessionBean.setid_producto_defi_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidadUnad")) {
				this.setid_unidadFK_IdUnidadUnad(productoproduSessionBean.getid_unidad());
				productoproduSessionBean.setid_unidad(-1L);
			}
		}
		
		this.productoproduSessionBean.setsUltimaBusquedaProductoProdu("");
		this.productoproduSessionBean.setiNumeroPaginacion(ProductoProduConstantesFunciones.INUMEROPAGINACION);
		this.productoproduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoProdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoProdu() {
		this.updateBorderResaltarBusquedasFormularioProductoProdu();
		this.updateVisibilidadBusquedasFormularioProductoProdu();
		this.updateHabilitarBusquedasFormularioProductoProdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoProdu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoProdu.getComponents().length>0) {
	

		if(this.productoproduConstantesFunciones.resaltarFK_IdBodegaProductoProdu!=null) {
			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdBodegaProductoProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);
				jPanel.setBorder(this.productoproduConstantesFunciones.resaltarFK_IdBodegaProductoProdu);
			}
		}

		if(this.productoproduConstantesFunciones.resaltarFK_IdProductoProductoProdu!=null) {
			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdProductoProductoProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);
				jPanel.setBorder(this.productoproduConstantesFunciones.resaltarFK_IdProductoProductoProdu);
			}
		}

		if(this.productoproduConstantesFunciones.resaltarFK_IdProductoDefiProduProductoProdu!=null) {
			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);
				jPanel.setBorder(this.productoproduConstantesFunciones.resaltarFK_IdProductoDefiProduProductoProdu);
			}
		}

		if(this.productoproduConstantesFunciones.resaltarFK_IdUnidadUnadProductoProdu!=null) {
			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdUnidadUnadProductoProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);
				jPanel.setBorder(this.productoproduConstantesFunciones.resaltarFK_IdUnidadUnadProductoProdu);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoProdu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdBodegaProductoProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoproduConstantesFunciones.mostrarFK_IdBodegaProductoProdu);
			if(!this.productoproduConstantesFunciones.mostrarFK_IdBodegaProductoProdu && index>-1) {
				this.jTabbedPaneBusquedasProductoProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdProductoProductoProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoproduConstantesFunciones.mostrarFK_IdProductoProductoProdu);
			if(!this.productoproduConstantesFunciones.mostrarFK_IdProductoProductoProdu && index>-1) {
				this.jTabbedPaneBusquedasProductoProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoproduConstantesFunciones.mostrarFK_IdProductoDefiProduProductoProdu);
			if(!this.productoproduConstantesFunciones.mostrarFK_IdProductoDefiProduProductoProdu && index>-1) {
				this.jTabbedPaneBusquedasProductoProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdUnidadUnadProductoProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoproduConstantesFunciones.mostrarFK_IdUnidadUnadProductoProdu);
			if(!this.productoproduConstantesFunciones.mostrarFK_IdUnidadUnadProductoProdu && index>-1) {
				this.jTabbedPaneBusquedasProductoProdu.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoProdu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdBodegaProductoProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoproduConstantesFunciones.activarFK_IdBodegaProductoProdu);
				this.jTabbedPaneBusquedasProductoProdu.setEnabledAt(index,this.productoproduConstantesFunciones.activarFK_IdBodegaProductoProdu);
			}

			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdProductoProductoProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoproduConstantesFunciones.activarFK_IdProductoProductoProdu);
				this.jTabbedPaneBusquedasProductoProdu.setEnabledAt(index,this.productoproduConstantesFunciones.activarFK_IdProductoProductoProdu);
			}

			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoproduConstantesFunciones.activarFK_IdProductoDefiProduProductoProdu);
				this.jTabbedPaneBusquedasProductoProdu.setEnabledAt(index,this.productoproduConstantesFunciones.activarFK_IdProductoDefiProduProductoProdu);
			}

			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdUnidadUnadProductoProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoproduConstantesFunciones.activarFK_IdUnidadUnadProductoProdu);
				this.jTabbedPaneBusquedasProductoProdu.setEnabledAt(index,this.productoproduConstantesFunciones.activarFK_IdUnidadUnadProductoProdu);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoProdu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdBodegaProductoProdu);

			this.jTabbedPaneBusquedasProductoProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);

			this.productoproduConstantesFunciones.setResaltarFK_IdBodegaProductoProdu(resaltar);

			jPanel.setBorder(this.productoproduConstantesFunciones.resaltarFK_IdBodegaProductoProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdProductoProductoProdu);

			this.jTabbedPaneBusquedasProductoProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);

			this.productoproduConstantesFunciones.setResaltarFK_IdProductoProductoProdu(resaltar);

			jPanel.setBorder(this.productoproduConstantesFunciones.resaltarFK_IdProductoProductoProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProductoDefiProdu")) {
			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdProductoDefiProduProductoProdu);

			this.jTabbedPaneBusquedasProductoProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);

			this.productoproduConstantesFunciones.setResaltarFK_IdProductoDefiProduProductoProdu(resaltar);

			jPanel.setBorder(this.productoproduConstantesFunciones.resaltarFK_IdProductoDefiProduProductoProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidadUnad")) {
			index= this.jTabbedPaneBusquedasProductoProdu.indexOfComponent(this.jPanelFK_IdUnidadUnadProductoProdu);

			this.jTabbedPaneBusquedasProductoProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoProdu.getComponent(index);

			this.productoproduConstantesFunciones.setResaltarFK_IdUnidadUnadProductoProdu(resaltar);

			jPanel.setBorder(this.productoproduConstantesFunciones.resaltarFK_IdUnidadUnadProductoProdu);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoProdu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoProdu() throws Exception {

		if(this.jInternalFrameDetalleFormProductoProdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoProdu();
		this.updateVisibilidadResaltarControlesFormularioProductoProdu();
		this.updateHabilitarResaltarControlesFormularioProductoProdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoProdu() throws Exception {
		if(this.jInternalFrameDetalleFormProductoProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productoproduConstantesFunciones.resaltaridProductoProdu!=null && this.jInternalFrameDetalleFormProductoProdu!=null) {this.jInternalFrameDetalleFormProductoProdu.jLabelidProductoProdu.setBorder(this.productoproduConstantesFunciones.resaltaridProductoProdu);}
		if(this.productoproduConstantesFunciones.resaltarid_producto_defi_produProductoProdu!=null && this.jInternalFrameDetalleFormProductoProdu!=null) {this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_producto_defi_produProductoProdu.setBorder(this.productoproduConstantesFunciones.resaltarid_producto_defi_produProductoProdu);}
		if(this.productoproduConstantesFunciones.resaltarid_bodegaProductoProdu!=null && this.jInternalFrameDetalleFormProductoProdu!=null) {this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.setBorder(this.productoproduConstantesFunciones.resaltarid_bodegaProductoProdu);}
		if(this.productoproduConstantesFunciones.resaltarid_productoProductoProdu!=null && this.jInternalFrameDetalleFormProductoProdu!=null) {this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.setBorder(this.productoproduConstantesFunciones.resaltarid_productoProductoProdu);}
		if(this.productoproduConstantesFunciones.resaltarid_unidadProductoProdu!=null && this.jInternalFrameDetalleFormProductoProdu!=null) {this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_unidadProductoProdu.setBorder(this.productoproduConstantesFunciones.resaltarid_unidadProductoProdu);}
		if(this.productoproduConstantesFunciones.resaltarporcentajeProductoProdu!=null && this.jInternalFrameDetalleFormProductoProdu!=null) {this.jInternalFrameDetalleFormProductoProdu.jTextFieldporcentajeProductoProdu.setBorder(this.productoproduConstantesFunciones.resaltarporcentajeProductoProdu);}
		if(this.productoproduConstantesFunciones.resaltarcantidadProductoProdu!=null && this.jInternalFrameDetalleFormProductoProdu!=null) {this.jInternalFrameDetalleFormProductoProdu.jTextFieldcantidadProductoProdu.setBorder(this.productoproduConstantesFunciones.resaltarcantidadProductoProdu);}
		if(this.productoproduConstantesFunciones.resaltarcostoProductoProdu!=null && this.jInternalFrameDetalleFormProductoProdu!=null) {this.jInternalFrameDetalleFormProductoProdu.jTextFieldcostoProductoProdu.setBorder(this.productoproduConstantesFunciones.resaltarcostoProductoProdu);}
		if(this.productoproduConstantesFunciones.resaltarcosto_totalProductoProdu!=null && this.jInternalFrameDetalleFormProductoProdu!=null) {this.jInternalFrameDetalleFormProductoProdu.jTextFieldcosto_totalProductoProdu.setBorder(this.productoproduConstantesFunciones.resaltarcosto_totalProductoProdu);}
		if(this.productoproduConstantesFunciones.resaltardescripcionProductoProdu!=null && this.jInternalFrameDetalleFormProductoProdu!=null) {this.jInternalFrameDetalleFormProductoProdu.jTextAreadescripcionProductoProdu.setBorder(this.productoproduConstantesFunciones.resaltardescripcionProductoProdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoProdu() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) {
	
		//this.jInternalFrameDetalleFormProductoProdu.jLabelidProductoProdu.setVisible(this.productoproduConstantesFunciones.mostraridProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jPanelidProductoProdu.setVisible(this.productoproduConstantesFunciones.mostraridProductoProdu);
		//this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_producto_defi_produProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarid_producto_defi_produProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jPanelid_producto_defi_produProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarid_producto_defi_produProductoProdu);
		//this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarid_bodegaProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jPanelid_bodegaProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarid_bodegaProductoProdu);
		//this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarid_productoProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jPanelid_productoProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarid_productoProductoProdu);
			this.jInternalFrameDetalleFormProductoProdu.jButtonid_productoProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarid_productoProductoProdu);
		//this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_unidadProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarid_unidadProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jPanelid_unidadProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarid_unidadProductoProdu);
		//this.jInternalFrameDetalleFormProductoProdu.jTextFieldporcentajeProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarporcentajeProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jPanelporcentajeProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarporcentajeProductoProdu);
		//this.jInternalFrameDetalleFormProductoProdu.jTextFieldcantidadProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarcantidadProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jPanelcantidadProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarcantidadProductoProdu);
		//this.jInternalFrameDetalleFormProductoProdu.jTextFieldcostoProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarcostoProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jPanelcostoProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarcostoProductoProdu);
		//this.jInternalFrameDetalleFormProductoProdu.jTextFieldcosto_totalProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarcosto_totalProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jPanelcosto_totalProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrarcosto_totalProductoProdu);
		//this.jInternalFrameDetalleFormProductoProdu.jTextAreadescripcionProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrardescripcionProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jPaneldescripcionProductoProdu.setVisible(this.productoproduConstantesFunciones.mostrardescripcionProductoProdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoProdu() throws Exception {
		if(this.jInternalFrameDetalleFormProductoProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoProdu!=null) {
	
		this.jInternalFrameDetalleFormProductoProdu.jLabelidProductoProdu.setEnabled(this.productoproduConstantesFunciones.activaridProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_producto_defi_produProductoProdu.setEnabled(this.productoproduConstantesFunciones.activarid_producto_defi_produProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_bodegaProductoProdu.setEnabled(this.productoproduConstantesFunciones.activarid_bodegaProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_productoProductoProdu.setEnabled(this.productoproduConstantesFunciones.activarid_productoProductoProdu);
			this.jInternalFrameDetalleFormProductoProdu.jButtonid_productoProductoProdu.setEnabled(this.productoproduConstantesFunciones.activarid_productoProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jComboBoxid_unidadProductoProdu.setEnabled(this.productoproduConstantesFunciones.activarid_unidadProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jTextFieldporcentajeProductoProdu.setEnabled(this.productoproduConstantesFunciones.activarporcentajeProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jTextFieldcantidadProductoProdu.setEnabled(this.productoproduConstantesFunciones.activarcantidadProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jTextFieldcostoProductoProdu.setEnabled(this.productoproduConstantesFunciones.activarcostoProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jTextFieldcosto_totalProductoProdu.setEnabled(this.productoproduConstantesFunciones.activarcosto_totalProductoProdu);
		this.jInternalFrameDetalleFormProductoProdu.jTextAreadescripcionProductoProdu.setEnabled(this.productoproduConstantesFunciones.activardescripcionProductoProdu);
		}
	}
	
		
}