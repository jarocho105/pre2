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

import com.bydan.erp.produccion.util.ProductoOrdenDetaProduConstantesFunciones;
import com.bydan.erp.produccion.util.ProductoOrdenDetaProduParameterReturnGeneral;
//import com.bydan.erp.produccion.util.ProductoOrdenDetaProduParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.ProductoOrdenDetaProduBean;
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
public class ProductoOrdenDetaProduBeanSwingJInternalFrame extends ProductoOrdenDetaProduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProductoOrdenDetaProduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProductoOrdenDetaProdu> productoordendetaproduValidator = new ClassValidator<ProductoOrdenDetaProdu>(ProductoOrdenDetaProdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProductoOrdenDetaProdu productoordendetaprodu;	
	public ProductoOrdenDetaProdu productoordendetaproduAux;
	public ProductoOrdenDetaProdu productoordendetaproduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProductoOrdenDetaProdu productoordendetaproduTotales;
	public Long idProductoOrdenDetaProduActual;
	public Long iIdNuevoProductoOrdenDetaProdu=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboOrdenDetaProdu="";

	public List<OrdenDetaProdu> ordendetaprodusForeignKey;

	public List<OrdenDetaProdu> getordendetaprodusForeignKey() {
		return ordendetaprodusForeignKey;
	}

	public void setordendetaprodusForeignKey(List<OrdenDetaProdu> ordendetaprodusForeignKey) {
		this.ordendetaprodusForeignKey = ordendetaprodusForeignKey;
	}

	//OBJETO FK ACTUAL
	public OrdenDetaProdu ordendetaproduForeignKey;

	public OrdenDetaProdu getordendetaproduForeignKey() {
		return ordendetaproduForeignKey;
	}

	public void setordendetaproduForeignKey(OrdenDetaProdu ordendetaproduForeignKey) {
		this.ordendetaproduForeignKey = ordendetaproduForeignKey;
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
	
	public Boolean isPermisoTodoProductoOrdenDetaProdu;
	public Boolean isPermisoNuevoProductoOrdenDetaProdu;
	public Boolean isPermisoActualizarProductoOrdenDetaProdu;
	public Boolean isPermisoActualizarOriginalProductoOrdenDetaProdu;
	public Boolean isPermisoEliminarProductoOrdenDetaProdu;
	public Boolean isPermisoGuardarCambiosProductoOrdenDetaProdu;
	public Boolean isPermisoConsultaProductoOrdenDetaProdu;
	public Boolean isPermisoBusquedaProductoOrdenDetaProdu;
	public Boolean isPermisoReporteProductoOrdenDetaProdu;
	public Boolean isPermisoPaginacionMedioProductoOrdenDetaProdu;
	public Boolean isPermisoPaginacionAltoProductoOrdenDetaProdu;
	public Boolean isPermisoPaginacionTodoProductoOrdenDetaProdu;
	public Boolean isPermisoCopiarProductoOrdenDetaProdu;
	public Boolean isPermisoVerFormProductoOrdenDetaProdu;
	public Boolean isPermisoDuplicarProductoOrdenDetaProdu;
	public Boolean isPermisoOrdenProductoOrdenDetaProdu;
	
	
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
	
	public ProductoOrdenDetaProduParameterReturnGeneral productoordendetaproduReturnGeneral;
	public ProductoOrdenDetaProduParameterReturnGeneral productoordendetaproduParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProductoOrdenDetaProdu=false;
	public Boolean esParaAccionDesdeFormularioProductoOrdenDetaProdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProductoOrdenDetaProduSessionBeanAdditional productoordendetaproduSessionBeanAdditional=null;
	
	public ProductoOrdenDetaProduSessionBeanAdditional getProductoOrdenDetaProduSessionBeanAdditional() {
		return this.productoordendetaproduSessionBeanAdditional;
	}
	
	public void setProductoOrdenDetaProduSessionBeanAdditional(ProductoOrdenDetaProduSessionBeanAdditional productoordendetaproduSessionBeanAdditional) {
		try {
			this.productoordendetaproduSessionBeanAdditional=productoordendetaproduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional productoordendetaproduBeanSwingJInternalFrameAdditional=null;
	//public class ProductoOrdenDetaProduBeanSwingJInternalFrame
	
	public ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional getProductoOrdenDetaProduBeanSwingJInternalFrameAdditional() {
		return this.productoordendetaproduBeanSwingJInternalFrameAdditional;
	}
	
	public void setProductoOrdenDetaProduBeanSwingJInternalFrameAdditional(ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional productoordendetaproduBeanSwingJInternalFrameAdditional) {
		try {
			this.productoordendetaproduBeanSwingJInternalFrameAdditional=productoordendetaproduBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProductoOrdenDetaProduLogic productoordendetaproduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProductoOrdenDetaProdu productoordendetaproduBean;
	public ProductoOrdenDetaProduConstantesFunciones productoordendetaproduConstantesFunciones;
	//public ProductoOrdenDetaProduParameterReturnGeneral productoordendetaproduReturnGeneral;
	
	//FK
	
	public OrdenDetaProduLogic ordendetaproduLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public UnidadLogic unidadLogic;
	
	//PARAMETROS
	
	
	//public List<ProductoOrdenDetaProdu> productoordendetaprodus;	
	//public List<ProductoOrdenDetaProdu> productoordendetaprodusEliminados;
	//public List<ProductoOrdenDetaProdu> productoordendetaprodusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProductoOrdenDetaProdu=false;
	public Boolean isVisibilidadCeldaDuplicarProductoOrdenDetaProdu=true;
	public Boolean isVisibilidadCeldaCopiarProductoOrdenDetaProdu=true;
	public Boolean isVisibilidadCeldaVerFormProductoOrdenDetaProdu=true;
	public Boolean isVisibilidadCeldaOrdenProductoOrdenDetaProdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=false;
	public Boolean isVisibilidadCeldaModificarProductoOrdenDetaProdu=false;
	public Boolean isVisibilidadCeldaActualizarProductoOrdenDetaProdu=false;
	public Boolean isVisibilidadCeldaEliminarProductoOrdenDetaProdu=false;
	public Boolean isVisibilidadCeldaCancelarProductoOrdenDetaProdu=false;
	public Boolean isVisibilidadCeldaGuardarProductoOrdenDetaProdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdOrdenDetaProdu=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdUnidadUnad=false;
	
	public Long getiIdNuevoProductoOrdenDetaProdu() {
		return this.iIdNuevoProductoOrdenDetaProdu;
	}

	public void setiIdNuevoProductoOrdenDetaProdu(Long iIdNuevoProductoOrdenDetaProdu) {
		this.iIdNuevoProductoOrdenDetaProdu = iIdNuevoProductoOrdenDetaProdu;
	}
	
	public Long getidProductoOrdenDetaProduActual() {
		return this.idProductoOrdenDetaProduActual;
	}

	public void setidProductoOrdenDetaProduActual(Long idProductoOrdenDetaProduActual) {
		this.idProductoOrdenDetaProduActual = idProductoOrdenDetaProduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProductoOrdenDetaProdu getproductoordendetaprodu() {
		return this.productoordendetaprodu;
	}

	public void setproductoordendetaprodu(ProductoOrdenDetaProdu productoordendetaprodu) {
		this.productoordendetaprodu = productoordendetaprodu;
	}
	
	public ProductoOrdenDetaProdu getproductoordendetaproduAux() {
		return this.productoordendetaproduAux;
	}

	public void setproductoordendetaproduAux(ProductoOrdenDetaProdu productoordendetaproduAux) {
		this.productoordendetaproduAux = productoordendetaproduAux;
	}				
	
	public ProductoOrdenDetaProdu getproductoordendetaproduAnterior() {
		return this.productoordendetaproduAnterior;
	}

	public void setproductoordendetaproduAnterior(ProductoOrdenDetaProdu productoordendetaproduAnterior) {
		this.productoordendetaproduAnterior = productoordendetaproduAnterior;
	}	
	
	public ProductoOrdenDetaProdu getproductoordendetaproduTotales() {
		return this.productoordendetaproduTotales;
	}

	public void setproductoordendetaproduTotales(ProductoOrdenDetaProdu productoordendetaproduTotales) {
		this.productoordendetaproduTotales = productoordendetaproduTotales;
	}	
	
	public ProductoOrdenDetaProdu getproductoordendetaproduBean() {
		return this.productoordendetaproduBean;
	}

	public void setproductoordendetaproduBean(ProductoOrdenDetaProdu productoordendetaproduBean) {
		this.productoordendetaproduBean = productoordendetaproduBean;
	}	
	
	public ProductoOrdenDetaProduParameterReturnGeneral getproductoordendetaproduReturnGeneral() {
		return this.productoordendetaproduReturnGeneral;
	}

	public void setproductoordendetaproduReturnGeneral(ProductoOrdenDetaProduParameterReturnGeneral productoordendetaproduReturnGeneral) {
		this.productoordendetaproduReturnGeneral = productoordendetaproduReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_orden_deta_produFK_IdOrdenDetaProdu=-1L;

	public Long getid_orden_deta_produFK_IdOrdenDetaProdu() {
		return this.id_orden_deta_produFK_IdOrdenDetaProdu;
	}

	public void setid_orden_deta_produFK_IdOrdenDetaProdu(Long id_orden_deta_produFK_IdOrdenDetaProdu) {
		this.id_orden_deta_produFK_IdOrdenDetaProdu = id_orden_deta_produFK_IdOrdenDetaProdu;
	}

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
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
	
	
	public ProductoOrdenDetaProduLogic getProductoOrdenDetaProduLogic()	{		
		return productoordendetaproduLogic;
	}

	public void setProductoOrdenDetaProduLogic(ProductoOrdenDetaProduLogic productoordendetaproduLogic) {
		this.productoordendetaproduLogic = productoordendetaproduLogic;
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
	
	public Boolean getIsEsNuevoProductoOrdenDetaProdu() {
		return isEsNuevoProductoOrdenDetaProdu;
	}

	public void setIsEsNuevoProductoOrdenDetaProdu(Boolean isEsNuevoProductoOrdenDetaProdu) {
		this.isEsNuevoProductoOrdenDetaProdu = isEsNuevoProductoOrdenDetaProdu;
	}

	public Boolean getEsParaAccionDesdeFormularioProductoOrdenDetaProdu() {
		return esParaAccionDesdeFormularioProductoOrdenDetaProdu;
	}
	
	public void setEsParaAccionDesdeFormularioProductoOrdenDetaProdu(Boolean esParaAccionDesdeFormularioProductoOrdenDetaProdu) {
		this.esParaAccionDesdeFormularioProductoOrdenDetaProdu = esParaAccionDesdeFormularioProductoOrdenDetaProdu;
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
	
	
	public void cargarCombosOrdenDetaProdusForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ordendetaprodusForeignKey=new ArrayList<OrdenDetaProdu>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			OrdenDetaProduLogic ordendetaproduLogic=new OrdenDetaProduLogic();

			ordendetaproduLogic.getOrdenDetaProduDataAccess().setIsForForeingKeyData(true);

			if(this.productoordendetaproduSessionBean==null) {
				this.productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
			}

			if(!this.productoordendetaproduSessionBean.getisBusquedaDesdeForeignKeySesionOrdenDetaProdu()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordendetaproduLogic.getOrdenDetaProduDataAccess().setIsForForeingKeyData(true);

					ordendetaproduLogic.getTodosOrdenDetaProdusWithConnection(sFinalQuery,new Pagination());

					this.ordendetaprodusForeignKey=ordendetaproduLogic.getOrdenDetaProdus();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaOrdenDetaProdu(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ordendetaproduLogic.getEntityWithConnection(productoordendetaproduSessionBean.getlidOrdenDetaProduActual());
					this.ordendetaprodusForeignKey.add(ordendetaproduLogic.getOrdenDetaProdu());
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

			if(this.productoordendetaproduSessionBean==null) {
				this.productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
			}

			if(!this.productoordendetaproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(productoordendetaproduSessionBean.getlidBodegaActual());
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

			if(this.productoordendetaproduSessionBean==null) {
				this.productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
			}

			if(!this.productoordendetaproduSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(productoordendetaproduSessionBean.getlidProductoActual());
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

			if(this.productoordendetaproduSessionBean==null) {
				this.productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
			}

			if(!this.productoordendetaproduSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
					unidadLogic.getEntityWithConnection(productoordendetaproduSessionBean.getlidUnidadActual());
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

	
	
	public void setActualOrdenDetaProduForeignKey(Long idOrdenDetaProduSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			OrdenDetaProdu  ordendetaproduTemp=null;

			for(OrdenDetaProdu ordendetaproduAux:ordendetaprodusForeignKey) {
				if(ordendetaproduAux.getId()!=null && ordendetaproduAux.getId().equals(idOrdenDetaProduSeleccionado)) {
					ordendetaproduTemp=ordendetaproduAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ordendetaproduTemp!=null) {

					if(this.productoordendetaprodu!=null) {
						this.productoordendetaprodu.setOrdenDetaProdu(ordendetaproduTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_orden_deta_produProductoOrdenDetaProdu.setSelectedItem(ordendetaproduTemp);
					}
				} else {
					//jComboBoxid_orden_deta_produProductoOrdenDetaProdu.setSelectedItem(ordendetaproduTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_orden_deta_produProductoOrdenDetaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_orden_deta_produProductoOrdenDetaProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdOrdenDetaProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(ordendetaproduTemp!=null && jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu!=null) {
						jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.setSelectedItem(ordendetaproduTemp);
					} else {
						if(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu!=null) {
							//jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.setSelectedItem(ordendetaproduTemp);
							if(jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.getItemCount()>0) {
								jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.setSelectedIndex(0);
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

	public String getActualOrdenDetaProduForeignKeyDescripcion(Long idOrdenDetaProduSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			OrdenDetaProdu  ordendetaproduTemp=null;

			for(OrdenDetaProdu ordendetaproduAux:ordendetaprodusForeignKey) {
				if(ordendetaproduAux.getId()!=null && ordendetaproduAux.getId().equals(idOrdenDetaProduSeleccionado)) {
					ordendetaproduTemp=ordendetaproduAux;
					break;
				}
			}


			sDescripcion=OrdenDetaProduConstantesFunciones.getOrdenDetaProduDescripcion(ordendetaproduTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualOrdenDetaProduForeignKeyGenerico(Long idOrdenDetaProduSeleccionado,JComboBox jComboBoxid_orden_deta_produProductoOrdenDetaProduGenerico)throws Exception
	{
		try
		{
			OrdenDetaProdu  ordendetaproduTemp=null;

			for(OrdenDetaProdu ordendetaproduAux:ordendetaprodusForeignKey) {
				if(ordendetaproduAux.getId()!=null && ordendetaproduAux.getId().equals(idOrdenDetaProduSeleccionado)) {
					ordendetaproduTemp=ordendetaproduAux;
					break;
				}
			}

			if(ordendetaproduTemp!=null) {
				jComboBoxid_orden_deta_produProductoOrdenDetaProduGenerico.setSelectedItem(ordendetaproduTemp);
			} else {
				if(jComboBoxid_orden_deta_produProductoOrdenDetaProduGenerico!=null && jComboBoxid_orden_deta_produProductoOrdenDetaProduGenerico.getItemCount()>0) {
					jComboBoxid_orden_deta_produProductoOrdenDetaProduGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodu!=null) {
						this.productoordendetaprodu.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProductoOrdenDetaProdu.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu!=null) {
						jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu!=null) {
							//jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProductoOrdenDetaProduGenerico)throws Exception
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
				jComboBoxid_bodegaProductoOrdenDetaProduGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProductoOrdenDetaProduGenerico!=null && jComboBoxid_bodegaProductoOrdenDetaProduGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProductoOrdenDetaProduGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodu!=null) {
						this.productoordendetaprodu.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProductoOrdenDetaProdu.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu!=null) {
						jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu!=null) {
							//jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProductoOrdenDetaProduGenerico)throws Exception
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
				jComboBoxid_productoProductoOrdenDetaProduGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProductoOrdenDetaProduGenerico!=null && jComboBoxid_productoProductoOrdenDetaProduGenerico.getItemCount()>0) {
					jComboBoxid_productoProductoOrdenDetaProduGenerico.setSelectedIndex(0);
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

					if(this.productoordendetaprodu!=null) {
						this.productoordendetaprodu.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_unidadProductoOrdenDetaProdu.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadProductoOrdenDetaProdu.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_unidadProductoOrdenDetaProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_unidadProductoOrdenDetaProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidadUnad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu!=null) {
						jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu!=null) {
							//jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.setSelectedIndex(0);
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
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadProductoOrdenDetaProduGenerico)throws Exception
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
				jComboBoxid_unidadProductoOrdenDetaProduGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadProductoOrdenDetaProduGenerico!=null && jComboBoxid_unidadProductoOrdenDetaProduGenerico.getItemCount()>0) {
					jComboBoxid_unidadProductoOrdenDetaProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarOrdenDetaProduForeignKey(ProductoOrdenDetaProdu productoordendetaprodu,JComboBox jComboBoxid_orden_deta_produProductoOrdenDetaProduGenerico)throws Exception
	{
		try
		{
			OrdenDetaProdu  ordendetaproduAux=new OrdenDetaProdu();

			if(jComboBoxid_orden_deta_produProductoOrdenDetaProduGenerico==null) {
				ordendetaproduAux=(OrdenDetaProdu)this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_orden_deta_produProductoOrdenDetaProdu.getSelectedItem();
			} else {
				ordendetaproduAux=(OrdenDetaProdu)jComboBoxid_orden_deta_produProductoOrdenDetaProduGenerico.getSelectedItem();
			}

			if(ordendetaproduAux!=null && ordendetaproduAux.getId()!=null) {
				productoordendetaprodu.setid_orden_deta_produ(ordendetaproduAux.getId());
				productoordendetaprodu.setordendetaprodu_descripcion(ProductoOrdenDetaProduConstantesFunciones.getOrdenDetaProduDescripcion(ordendetaproduAux));
				productoordendetaprodu.setOrdenDetaProdu(ordendetaproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProductoOrdenDetaProdu productoordendetaprodu,JComboBox jComboBoxid_bodegaProductoOrdenDetaProduGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProductoOrdenDetaProduGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProductoOrdenDetaProduGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				productoordendetaprodu.setid_bodega(bodegaAux.getId());
				productoordendetaprodu.setbodega_descripcion(ProductoOrdenDetaProduConstantesFunciones.getBodegaDescripcion(bodegaAux));
				productoordendetaprodu.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProductoOrdenDetaProdu productoordendetaprodu,JComboBox jComboBoxid_productoProductoOrdenDetaProduGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProductoOrdenDetaProduGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProductoOrdenDetaProduGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				productoordendetaprodu.setid_producto(productoAux.getId());
				productoordendetaprodu.setproducto_descripcion(ProductoOrdenDetaProduConstantesFunciones.getProductoDescripcion(productoAux));
				productoordendetaprodu.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(ProductoOrdenDetaProdu productoordendetaprodu,JComboBox jComboBoxid_unidadProductoOrdenDetaProduGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadProductoOrdenDetaProduGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_unidadProductoOrdenDetaProdu.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadProductoOrdenDetaProduGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				productoordendetaprodu.setid_unidad(unidadAux.getId());
				productoordendetaprodu.setunidad_descripcion(ProductoOrdenDetaProduConstantesFunciones.getUnidadDescripcion(unidadAux));
				productoordendetaprodu.setUnidad(unidadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameOrdenDetaProdusForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingOrdenDetaProdu=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_orden_deta_produProductoOrdenDetaProdu.removeAllItems();

							for(OrdenDetaProdu ordendetaprodu:this.ordendetaprodusForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_orden_deta_produProductoOrdenDetaProdu.addItem(ordendetaprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { 
					}

					if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdOrdenDetaProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.removeAllItems();

							for(OrdenDetaProdu ordendetaprodu:this.ordendetaprodusForeignKey) {
								this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.addItem(ordendetaprodu);
							}
						}

						if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { 
					}

					if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.addItem(bodega);
							}
						}

						if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { 
					}

					if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.addItem(producto);
							}
						}

						if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { 
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_unidadProductoOrdenDetaProdu.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_unidadProductoOrdenDetaProdu.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { 
					}

					if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidadUnad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.addItem(unidad);
							}
						}

						if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameOrdenDetaProduForeignKey(OrdenDetaProdu ordendetaprodu,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_orden_deta_produProductoOrdenDetaProdu.setSelectedItem(ordendetaprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_orden_deta_produProductoOrdenDetaProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.setSelectedItem(ordendetaprodu);
						} else {
							this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_unidadProductoOrdenDetaProdu.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_unidadProductoOrdenDetaProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProductoOrdenDetaProdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProductoOrdenDetaProduConstantesFunciones.refrescarForeignKeysDescripcionesProductoOrdenDetaProdu(this.productoordendetaproduLogic.getProductoOrdenDetaProdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProductoOrdenDetaProduConstantesFunciones.refrescarForeignKeysDescripcionesProductoOrdenDetaProdu(this.productoordendetaprodus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(OrdenDetaProdu.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//productoordendetaproduLogic.setProductoOrdenDetaProdus(this.productoordendetaprodus);
			productoordendetaproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProductoOrdenDetaProduParameterReturnGeneral getProductoOrdenDetaProduParameterGeneral() {
		return this.productoordendetaproduParameterGeneral;
	}
	
	public void setProductoOrdenDetaProduParameterGeneral(ProductoOrdenDetaProduParameterReturnGeneral productoordendetaproduParameterGeneral) {
		this.productoordendetaproduParameterGeneral = productoordendetaproduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProductoOrdenDetaProdu() {
		return isPermisoTodoProductoOrdenDetaProdu;
	}

	public void setIsPermisoTodoProductoOrdenDetaProdu(Boolean isPermisoTodoProductoOrdenDetaProdu) {
		this.isPermisoTodoProductoOrdenDetaProdu = isPermisoTodoProductoOrdenDetaProdu;
	}

	public Boolean getIsPermisoNuevoProductoOrdenDetaProdu() {
		return isPermisoNuevoProductoOrdenDetaProdu;
	}

	public void setIsPermisoNuevoProductoOrdenDetaProdu(Boolean isPermisoNuevoProductoOrdenDetaProdu) {
		this.isPermisoNuevoProductoOrdenDetaProdu = isPermisoNuevoProductoOrdenDetaProdu;
	}

	public Boolean getIsPermisoActualizarProductoOrdenDetaProdu() {
		return isPermisoActualizarProductoOrdenDetaProdu;
	}

	public void setIsPermisoActualizarProductoOrdenDetaProdu(Boolean isPermisoActualizarProductoOrdenDetaProdu) {
		this.isPermisoActualizarProductoOrdenDetaProdu = isPermisoActualizarProductoOrdenDetaProdu;
	}

	public Boolean getIsPermisoEliminarProductoOrdenDetaProdu() {
		return isPermisoEliminarProductoOrdenDetaProdu;
	}

	public void setIsPermisoEliminarProductoOrdenDetaProdu(Boolean isPermisoEliminarProductoOrdenDetaProdu) {
		this.isPermisoEliminarProductoOrdenDetaProdu = isPermisoEliminarProductoOrdenDetaProdu;
	}

	public Boolean getIsPermisoGuardarCambiosProductoOrdenDetaProdu() {
		return isPermisoGuardarCambiosProductoOrdenDetaProdu;
	}

	public void setIsPermisoGuardarCambiosProductoOrdenDetaProdu(Boolean isPermisoGuardarCambiosProductoOrdenDetaProdu) {
		this.isPermisoGuardarCambiosProductoOrdenDetaProdu = isPermisoGuardarCambiosProductoOrdenDetaProdu;
	}
	
	public Boolean getIsPermisoConsultaProductoOrdenDetaProdu() {
		return isPermisoConsultaProductoOrdenDetaProdu;
	}

	public void setIsPermisoConsultaProductoOrdenDetaProdu(Boolean isPermisoConsultaProductoOrdenDetaProdu) {
		this.isPermisoConsultaProductoOrdenDetaProdu = isPermisoConsultaProductoOrdenDetaProdu;
	}

	public Boolean getIsPermisoBusquedaProductoOrdenDetaProdu() {
		return isPermisoBusquedaProductoOrdenDetaProdu;
	}

	public void setIsPermisoBusquedaProductoOrdenDetaProdu(Boolean isPermisoBusquedaProductoOrdenDetaProdu) {
		this.isPermisoBusquedaProductoOrdenDetaProdu = isPermisoBusquedaProductoOrdenDetaProdu;
	}

	public Boolean getIsPermisoReporteProductoOrdenDetaProdu() {
		return isPermisoReporteProductoOrdenDetaProdu;
	}

	public void setIsPermisoReporteProductoOrdenDetaProdu(Boolean isPermisoReporteProductoOrdenDetaProdu) {
		this.isPermisoReporteProductoOrdenDetaProdu = isPermisoReporteProductoOrdenDetaProdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioProductoOrdenDetaProdu() {
		return isPermisoPaginacionMedioProductoOrdenDetaProdu;
	}

	public void setIsPermisoPaginacionMedioProductoOrdenDetaProdu(Boolean isPermisoPaginacionMedioProductoOrdenDetaProdu) {
		this.isPermisoPaginacionMedioProductoOrdenDetaProdu = isPermisoPaginacionMedioProductoOrdenDetaProdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoProductoOrdenDetaProdu() {
		return isPermisoPaginacionTodoProductoOrdenDetaProdu;
	}

	public void setIsPermisoPaginacionTodoProductoOrdenDetaProdu(Boolean isPermisoPaginacionTodoProductoOrdenDetaProdu) {
		this.isPermisoPaginacionTodoProductoOrdenDetaProdu = isPermisoPaginacionTodoProductoOrdenDetaProdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoProductoOrdenDetaProdu() {
		return isPermisoPaginacionAltoProductoOrdenDetaProdu;
	}

	public void setIsPermisoPaginacionAltoProductoOrdenDetaProdu(Boolean isPermisoPaginacionAltoProductoOrdenDetaProdu) {
		this.isPermisoPaginacionAltoProductoOrdenDetaProdu = isPermisoPaginacionAltoProductoOrdenDetaProdu;
	}
	
	public Boolean getIsPermisoCopiarProductoOrdenDetaProdu() {
		return isPermisoCopiarProductoOrdenDetaProdu;
	}

	public void setIsPermisoCopiarProductoOrdenDetaProdu(Boolean isPermisoCopiarProductoOrdenDetaProdu) {
		this.isPermisoCopiarProductoOrdenDetaProdu = isPermisoCopiarProductoOrdenDetaProdu;
	}
	
	public Boolean getIsPermisoVerFormProductoOrdenDetaProdu() {
		return isPermisoVerFormProductoOrdenDetaProdu;
	}

	public void setIsPermisoVerFormProductoOrdenDetaProdu(Boolean isPermisoVerFormProductoOrdenDetaProdu) {
		this.isPermisoVerFormProductoOrdenDetaProdu = isPermisoVerFormProductoOrdenDetaProdu;
	}
	
	public Boolean getIsPermisoDuplicarProductoOrdenDetaProdu() {
		return isPermisoDuplicarProductoOrdenDetaProdu;
	}

	public void setIsPermisoDuplicarProductoOrdenDetaProdu(Boolean isPermisoDuplicarProductoOrdenDetaProdu) {
		this.isPermisoDuplicarProductoOrdenDetaProdu = isPermisoDuplicarProductoOrdenDetaProdu;
	}
	
	public Boolean getIsPermisoOrdenProductoOrdenDetaProdu() {
		return isPermisoOrdenProductoOrdenDetaProdu;
	}

	public void setIsPermisoOrdenProductoOrdenDetaProdu(Boolean isPermisoOrdenProductoOrdenDetaProdu) {
		this.isPermisoOrdenProductoOrdenDetaProdu = isPermisoOrdenProductoOrdenDetaProdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProductoOrdenDetaProdu() {
		return isVisibilidadCeldaNuevoProductoOrdenDetaProdu;
	}

	public void setIsVisibilidadCeldaNuevoProductoOrdenDetaProdu(Boolean isVisibilidadCeldaNuevoProductoOrdenDetaProdu) {
		this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu = isVisibilidadCeldaNuevoProductoOrdenDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProductoOrdenDetaProdu() {
		return isVisibilidadCeldaDuplicarProductoOrdenDetaProdu;
	}

	public void setIsVisibilidadCeldaDuplicarProductoOrdenDetaProdu(Boolean isVisibilidadCeldaDuplicarProductoOrdenDetaProdu) {
		this.isVisibilidadCeldaDuplicarProductoOrdenDetaProdu = isVisibilidadCeldaDuplicarProductoOrdenDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProductoOrdenDetaProdu() {
		return isVisibilidadCeldaCopiarProductoOrdenDetaProdu;
	}

	public void setIsVisibilidadCeldaCopiarProductoOrdenDetaProdu(Boolean isVisibilidadCeldaCopiarProductoOrdenDetaProdu) {
		this.isVisibilidadCeldaCopiarProductoOrdenDetaProdu = isVisibilidadCeldaCopiarProductoOrdenDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProductoOrdenDetaProdu() {
		return isVisibilidadCeldaVerFormProductoOrdenDetaProdu;
	}

	public void setIsVisibilidadCeldaVerFormProductoOrdenDetaProdu(Boolean isVisibilidadCeldaVerFormProductoOrdenDetaProdu) {
		this.isVisibilidadCeldaVerFormProductoOrdenDetaProdu = isVisibilidadCeldaVerFormProductoOrdenDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProductoOrdenDetaProdu() {
		return isVisibilidadCeldaOrdenProductoOrdenDetaProdu;
	}

	public void setIsVisibilidadCeldaOrdenProductoOrdenDetaProdu(Boolean isVisibilidadCeldaOrdenProductoOrdenDetaProdu) {
		this.isVisibilidadCeldaOrdenProductoOrdenDetaProdu = isVisibilidadCeldaOrdenProductoOrdenDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu() {
		return isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu(Boolean isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu) {
		this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu = isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProductoOrdenDetaProdu() {
		return isVisibilidadCeldaModificarProductoOrdenDetaProdu;
	}

	public void setIsVisibilidadCeldaModificarProductoOrdenDetaProdu(Boolean isVisibilidadCeldaModificarProductoOrdenDetaProdu) {
		this.isVisibilidadCeldaModificarProductoOrdenDetaProdu = isVisibilidadCeldaModificarProductoOrdenDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProductoOrdenDetaProdu() {
		return isVisibilidadCeldaActualizarProductoOrdenDetaProdu;
	}

	public void setIsVisibilidadCeldaActualizarProductoOrdenDetaProdu(Boolean isVisibilidadCeldaActualizarProductoOrdenDetaProdu) {
		this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu = isVisibilidadCeldaActualizarProductoOrdenDetaProdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarProductoOrdenDetaProdu() {
		return isVisibilidadCeldaEliminarProductoOrdenDetaProdu;
	}

	public void setIsVisibilidadCeldaEliminarProductoOrdenDetaProdu(Boolean isVisibilidadCeldaEliminarProductoOrdenDetaProdu) {
		this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu = isVisibilidadCeldaEliminarProductoOrdenDetaProdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarProductoOrdenDetaProdu() {
		return isVisibilidadCeldaCancelarProductoOrdenDetaProdu;
	}

	public void setIsVisibilidadCeldaCancelarProductoOrdenDetaProdu(Boolean isVisibilidadCeldaCancelarProductoOrdenDetaProdu) {
		this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu = isVisibilidadCeldaCancelarProductoOrdenDetaProdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarProductoOrdenDetaProdu() {
		return isVisibilidadCeldaGuardarProductoOrdenDetaProdu;
	}

	public void setIsVisibilidadCeldaGuardarProductoOrdenDetaProdu(Boolean isVisibilidadCeldaGuardarProductoOrdenDetaProdu) {
		this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu = isVisibilidadCeldaGuardarProductoOrdenDetaProdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu() {
		return isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu(Boolean isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu) {
		this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu = isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu;
	}
		
	public ProductoOrdenDetaProduSessionBean getproductoordendetaproduSessionBean() {
		return this.productoordendetaproduSessionBean;
	}
	
	public void setproductoordendetaproduSessionBean(ProductoOrdenDetaProduSessionBean productoordendetaproduSessionBean) {
		this.productoordendetaproduSessionBean=productoordendetaproduSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdOrdenDetaProdu() {
		return this.isVisibilidadFK_IdOrdenDetaProdu;
	}

	public void setisVisibilidadFK_IdOrdenDetaProdu(Boolean isVisibilidadFK_IdOrdenDetaProdu) {
		this.isVisibilidadFK_IdOrdenDetaProdu=isVisibilidadFK_IdOrdenDetaProdu;
	}

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	public Boolean getisVisibilidadFK_IdUnidadUnad() {
		return this.isVisibilidadFK_IdUnidadUnad;
	}

	public void setisVisibilidadFK_IdUnidadUnad(Boolean isVisibilidadFK_IdUnidadUnad) {
		this.isVisibilidadFK_IdUnidadUnad=isVisibilidadFK_IdUnidadUnad;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu)throws Exception {
		try {
			
				this.setActualParaGuardarOrdenDetaProduForeignKey(productoordendetaprodu,null);
				this.setActualParaGuardarBodegaForeignKey(productoordendetaprodu,null);
				this.setActualParaGuardarProductoForeignKey(productoordendetaprodu,null);
				this.setActualParaGuardarUnidadForeignKey(productoordendetaprodu,null);
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
	
	public void bugActualizarReferenciaActual(ProductoOrdenDetaProdu productoordendetaprodu,ProductoOrdenDetaProdu productoordendetaproduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProductoOrdenDetaProdu(productoordendetaprodu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		productoordendetaproduAux.setId(productoordendetaprodu.getId());
		productoordendetaproduAux.setVersionRow(productoordendetaprodu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProductoOrdenDetaProdu();
		
			int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = productoordendetaproduValidator.getInvalidValues(this.productoordendetaprodu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			productoordendetaproduLogic.setDatosCliente(datosCliente);
			productoordendetaproduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				productoordendetaproduAux=new  ProductoOrdenDetaProdu();
				
				productoordendetaproduAux.setIsNew(true);
				productoordendetaproduAux.setIsChanged(true);
				
				productoordendetaproduAux.setProductoOrdenDetaProduOriginal(this.productoordendetaprodu);
				
				productoordendetaproduAux.setId(this.productoordendetaprodu.getId());	
				productoordendetaproduAux.setVersionRow(this.productoordendetaprodu.getVersionRow());	
				productoordendetaproduAux.setid_orden_deta_produ(this.productoordendetaprodu.getid_orden_deta_produ());	
				productoordendetaproduAux.setid_bodega(this.productoordendetaprodu.getid_bodega());	
				productoordendetaproduAux.setid_producto(this.productoordendetaprodu.getid_producto());	
				productoordendetaproduAux.setid_unidad(this.productoordendetaprodu.getid_unidad());	
				productoordendetaproduAux.setporcentaje(this.productoordendetaprodu.getporcentaje());	
				productoordendetaproduAux.setcantidad(this.productoordendetaprodu.getcantidad());	
				productoordendetaproduAux.setcosto(this.productoordendetaprodu.getcosto());	
				productoordendetaproduAux.setcosto_total(this.productoordendetaprodu.getcosto_total());	
				productoordendetaproduAux.setdescripcion(this.productoordendetaprodu.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoordendetaproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoordendetaproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(productoordendetaproduAux,productoordendetaproduLogic.getProductoOrdenDetaProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaproduAux,productoordendetaprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.productoordendetaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoordendetaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaproduLogic.saveProductoOrdenDetaProdus();//WithConnection
						//productoordendetaproduLogic.getSetVersionRowProductoOrdenDetaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoordendetaprodu,productoordendetaproduAux);
					
					this.refrescarForeignKeysDescripcionesProductoOrdenDetaProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoordendetaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoordendetaproduLogic.saveProductoOrdenDetaProduRelaciones(productoordendetaproduAux);//WithConnection
								//productoordendetaproduLogic.getSetVersionRowProductoOrdenDetaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoordendetaprodu,productoordendetaproduAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoordendetaproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoordendetaproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoordendetaproduAux,productoordendetaproduLogic.getProductoOrdenDetaProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoordendetaproduAux,productoordendetaprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoordendetaprodu,productoordendetaproduAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				productoordendetaproduAux=new  ProductoOrdenDetaProdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado() 
					|| (this.productoordendetaproduSessionBean.getEsGuardarRelacionado() && this.productoordendetaprodu.getId()>=0)) {
						
					productoordendetaproduAux.setIsNew(false);
				}
				
				productoordendetaproduAux.setIsDeleted(false);
			
				productoordendetaproduAux.setId(this.productoordendetaprodu.getId());	
				productoordendetaproduAux.setVersionRow(this.productoordendetaprodu.getVersionRow());	
				productoordendetaproduAux.setid_orden_deta_produ(this.productoordendetaprodu.getid_orden_deta_produ());	
				productoordendetaproduAux.setid_bodega(this.productoordendetaprodu.getid_bodega());	
				productoordendetaproduAux.setid_producto(this.productoordendetaprodu.getid_producto());	
				productoordendetaproduAux.setid_unidad(this.productoordendetaprodu.getid_unidad());	
				productoordendetaproduAux.setporcentaje(this.productoordendetaprodu.getporcentaje());	
				productoordendetaproduAux.setcantidad(this.productoordendetaprodu.getcantidad());	
				productoordendetaproduAux.setcosto(this.productoordendetaprodu.getcosto());	
				productoordendetaproduAux.setcosto_total(this.productoordendetaprodu.getcosto_total());	
				productoordendetaproduAux.setdescripcion(this.productoordendetaprodu.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoordendetaproduAux,productoordendetaproduLogic.getProductoOrdenDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaproduAux,productoordendetaprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.productoordendetaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoordendetaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaproduLogic.saveProductoOrdenDetaProdus();//WithConnection
						//productoordendetaproduLogic.getSetVersionRowProductoOrdenDetaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.productoordendetaprodu,productoordendetaproduAux);
					
					this.refrescarForeignKeysDescripcionesProductoOrdenDetaProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoordendetaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoordendetaproduLogic.saveProductoOrdenDetaProduRelaciones(productoordendetaproduAux);//WithConnection
								//productoordendetaproduLogic.getSetVersionRowProductoOrdenDetaProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.productoordendetaprodu,productoordendetaproduAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.productoordendetaproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.productoordendetaproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(productoordendetaproduAux,productoordendetaproduLogic.getProductoOrdenDetaProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(productoordendetaproduAux,productoordendetaprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.productoordendetaprodu,productoordendetaproduAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				productoordendetaproduAux=new  ProductoOrdenDetaProdu();
				
				productoordendetaproduAux.setIsNew(false);
				productoordendetaproduAux.setIsChanged(false);
				
				productoordendetaproduAux.setIsDeleted(true);
				
				productoordendetaproduAux.setId(this.productoordendetaprodu.getId());	
				productoordendetaproduAux.setVersionRow(this.productoordendetaprodu.getVersionRow());	
				productoordendetaproduAux.setid_orden_deta_produ(this.productoordendetaprodu.getid_orden_deta_produ());	
				productoordendetaproduAux.setid_bodega(this.productoordendetaprodu.getid_bodega());	
				productoordendetaproduAux.setid_producto(this.productoordendetaprodu.getid_producto());	
				productoordendetaproduAux.setid_unidad(this.productoordendetaprodu.getid_unidad());	
				productoordendetaproduAux.setporcentaje(this.productoordendetaprodu.getporcentaje());	
				productoordendetaproduAux.setcantidad(this.productoordendetaprodu.getcantidad());	
				productoordendetaproduAux.setcosto(this.productoordendetaprodu.getcosto());	
				productoordendetaproduAux.setcosto_total(this.productoordendetaprodu.getcosto_total());	
				productoordendetaproduAux.setdescripcion(this.productoordendetaprodu.getdescripcion());	
				
				if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.productoordendetaproduAux.getId()>=0) {	
						this.productoordendetaprodusEliminados.add(productoordendetaproduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(productoordendetaproduAux,productoordendetaproduLogic.getProductoOrdenDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaproduAux,productoordendetaprodus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.productoordendetaproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.productoordendetaproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaproduLogic.saveProductoOrdenDetaProdus();//WithConnection
						//productoordendetaproduLogic.getSetVersionRowProductoOrdenDetaProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.productoordendetaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								productoordendetaproduLogic.saveProductoOrdenDetaProduRelaciones(productoordendetaproduAux);//WithConnection
								//productoordendetaproduLogic.getSetVersionRowProductoOrdenDetaProdus();//WithConnection
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
							if(this.productoordendetaproduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.productoordendetaproduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(productoordendetaproduAux,productoordendetaproduLogic.getProductoOrdenDetaProdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(productoordendetaproduAux,productoordendetaprodus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.getProductoOrdenDetaProdus().addAll(this.productoordendetaprodusEliminados);
					
					productoordendetaproduLogic.saveProductoOrdenDetaProdus();//WithConnection
					//productoordendetaproduLogic.getSetVersionRowProductoOrdenDetaProdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesProductoOrdenDetaProdu();
				
				this.productoordendetaprodusEliminados= new ArrayList<ProductoOrdenDetaProdu>();		
			}
			
			if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Orden Producto Produccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Orden Producto Produccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.productoordendetaprodu=productoordendetaproduAux;
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
      		//this.finishProcessProductoOrdenDetaProdu();
      	}
		
	}	
	
	public void actualizarRelaciones(ProductoOrdenDetaProdu productoordendetaproduLocal) throws Exception {
		
		if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProductoOrdenDetaProdu productoordendetaproduLocal) throws Exception {	
		if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(OrdenDetaProduDetalleFormJInternalFrame.class)) {
				OrdenDetaProduBeanSwingJInternalFrame ordendetaproduBeanSwingJInternalFrameLocal=(OrdenDetaProduBeanSwingJInternalFrame) ((OrdenDetaProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ordendetaproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoOrdenDetaProdu(ordendetaproduBeanSwingJInternalFrameLocal.getordendetaprodu(),true);
				ordendetaproduBeanSwingJInternalFrameLocal.actualizarLista(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu,this.ordendetaprodusForeignKey);

				ordendetaproduBeanSwingJInternalFrameLocal.actualizarRelaciones(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu);

				productoordendetaproduLocal.setOrdenDetaProdu(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu);

				this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
				this.cargarCombosFrameOrdenDetaProdusForeignKey("Formulario");
				this.setActualOrdenDetaProduForeignKey(ordendetaproduBeanSwingJInternalFrameLocal.ordendetaprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				productoordendetaproduLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				productoordendetaproduLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				productoordendetaproduLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProductoOrdenDetaProduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = productoordendetaproduValidator.getInvalidValues(this.productoordendetaprodu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProductoOrdenDetaProdu productoordendetaprodu,List<ProductoOrdenDetaProdu> productoordendetaprodus) throws Exception {
		try	{		
			ProductoOrdenDetaProduConstantesFunciones.actualizarLista(productoordendetaprodu,productoordendetaprodus,this.productoordendetaproduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ProductoOrdenDetaProdu productoordendetaprodu,List<ProductoOrdenDetaProdu> productoordendetaprodus) throws Exception {
		try	{			
			ProductoOrdenDetaProduConstantesFunciones.actualizarSelectedLista(productoordendetaprodu,productoordendetaprodus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProductoOrdenDetaProdu> productoordendetaprodusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				productoordendetaprodusLocal=this.productoordendetaproduLogic.getProductoOrdenDetaProdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				productoordendetaprodusLocal=this.productoordendetaprodus;
			}
			//ARCHITECTURE
		
			for(ProductoOrdenDetaProdu productoordendetaproduLocal:productoordendetaprodusLocal) {
				if(this.permiteMantenimiento(productoordendetaproduLocal) && productoordendetaproduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProductoOrdenDetaProduConstantesFunciones.getProductoOrdenDetaProduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduConstantesFunciones.IDORDENDETAPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelid_orden_deta_produProductoOrdenDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelid_bodegaProductoOrdenDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelid_productoProductoOrdenDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelid_unidadProductoOrdenDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelporcentajeProductoOrdenDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelcantidadProductoOrdenDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelcostoProductoOrdenDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelcosto_totalProductoOrdenDetaProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProductoOrdenDetaProduConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabeldescripcionProductoOrdenDetaProdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelid_orden_deta_produProductoOrdenDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelid_bodegaProductoOrdenDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelid_productoProductoOrdenDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelid_unidadProductoOrdenDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelporcentajeProductoOrdenDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelcantidadProductoOrdenDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelcostoProductoOrdenDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelcosto_totalProductoOrdenDetaProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabeldescripcionProductoOrdenDetaProdu,"");
		
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
		this.iIdNuevoProductoOrdenDetaProdu--;	
		
		
		this.productoordendetaproduAux=new ProductoOrdenDetaProdu();
		
		this.productoordendetaproduAux.setId(this.iIdNuevoProductoOrdenDetaProdu);
		this.productoordendetaproduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.productoordendetaproduLogic.getProductoOrdenDetaProdus().add(this.productoordendetaproduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.productoordendetaprodus.add(this.productoordendetaproduAux);
		}
		//ARCHITECTURE
		
		this.productoordendetaprodu=this.productoordendetaproduAux;
		
		if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProductoOrdenDetaProdu(this.productoordendetaprodu);
			this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProdu(this.productoordendetaprodu);
		}
				
		//this.setDefaultControlesProductoOrdenDetaProdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProductoOrdenDetaProdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoOrdenDetaProdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoOrdenDetaProdu(this.productoordendetaproduBean,this.productoordendetaprodu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {
			classes=ProductoOrdenDetaProduConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.productoordendetaproduReturnGeneral=productoordendetaproduLogic.procesarEventosProductoOrdenDetaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoordendetaproduLogic.getProductoOrdenDetaProdus(),this.productoordendetaprodu,this.productoordendetaproduParameterGeneral,this.isEsNuevoProductoOrdenDetaProdu,classes);//this.productoordendetaproduLogic.getProductoOrdenDetaProdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProductoOrdenDetaProdu(this.productoordendetaproduReturnGeneral,this.productoordendetaproduBean,false);
		
		if(this.productoordendetaproduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProdu(this.productoordendetaproduReturnGeneral.getProductoOrdenDetaProdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProductoOrdenDetaProdu(this.productoordendetaproduReturnGeneral.getProductoOrdenDetaProdu());
		}
		
		if(this.productoordendetaproduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProdu(this.productoordendetaproduReturnGeneral.getProductoOrdenDetaProdu(),classes);//this.productoordendetaproduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProductoOrdenDetaProdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProductoOrdenDetaProdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.RecargarFormProductoOrdenDetaProdu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
						
			if(productoordendetaproduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoOrdenDetaProdu();
			}
			
			this.actualizarVisualTableDatosProductoOrdenDetaProdu();
			
			this.jTableDatosProductoOrdenDetaProdu.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProdu(), this.getIndiceNuevoProductoOrdenDetaProdu());
			
			this.seleccionarFilaTablaProductoOrdenDetaProduActual();
						
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProductoOrdenDetaProdu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldporcentajeProductoOrdenDetaProdu.setEnabled(isHabilitar && this.productoordendetaproduConstantesFunciones.activarporcentajeProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcantidadProductoOrdenDetaProdu.setEnabled(isHabilitar && this.productoordendetaproduConstantesFunciones.activarcantidadProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcostoProductoOrdenDetaProdu.setEnabled(isHabilitar && this.productoordendetaproduConstantesFunciones.activarcostoProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcosto_totalProductoOrdenDetaProdu.setEnabled(isHabilitar && this.productoordendetaproduConstantesFunciones.activarcosto_totalProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextAreadescripcionProductoOrdenDetaProdu.setEnabled(isHabilitar && this.productoordendetaproduConstantesFunciones.activardescripcionProductoOrdenDetaProdu);	
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_orden_deta_produProductoOrdenDetaProdu.setEnabled(isHabilitar && this.productoordendetaproduConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.setEnabled(isHabilitar && this.productoordendetaproduConstantesFunciones.activarid_bodegaProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.setEnabled(isHabilitar && this.productoordendetaproduConstantesFunciones.activarid_productoProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_unidadProductoOrdenDetaProdu.setEnabled(isHabilitar && this.productoordendetaproduConstantesFunciones.activarid_unidadProductoOrdenDetaProdu);
	};
	
	public void setDefaultControlesProductoOrdenDetaProdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProductoOrdenDetaProdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.productoordendetaproduSessionBean.setConGuardarRelaciones(true);			
			this.productoordendetaproduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTabbedPaneRelacionesProductoOrdenDetaProdu.setVisible(true);
			
					
		} else {
			//this.productoordendetaproduSessionBean.setConGuardarRelaciones(false);			
			this.productoordendetaproduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTabbedPaneRelacionesProductoOrdenDetaProdu.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProductoOrdenDetaProdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProdu productoordendetaproduAux:this.productoordendetaproduLogic.getProductoOrdenDetaProdus()) {
				if(productoordendetaproduAux.getId().equals(this.iIdNuevoProductoOrdenDetaProdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProdu productoordendetaproduAux:this.productoordendetaprodus) {
				if(productoordendetaproduAux.getId().equals(this.iIdNuevoProductoOrdenDetaProdu)) {
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
	
	public int getIndiceActualProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProdu productoordendetaproduAux:this.productoordendetaproduLogic.getProductoOrdenDetaProdus()) {
				if(productoordendetaproduAux.getId().equals(productoordendetaprodu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProdu productoordendetaproduAux:this.productoordendetaprodus) {
				if(productoordendetaproduAux.getId().equals(productoordendetaprodu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaproduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProdu productoordendetaproduAux:this.productoordendetaproduLogic.getProductoOrdenDetaProdus()) {
				if(productoordendetaproduAux.getProductoOrdenDetaProduOriginal().getId().equals(productoordendetaproduOriginal.getId())) {
					existe=true;
					productoordendetaproduOriginal.setId(productoordendetaproduAux.getId());
					productoordendetaproduOriginal.setVersionRow(productoordendetaproduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProdu productoordendetaproduAux:this.productoordendetaprodus) {
				if(productoordendetaproduAux.getProductoOrdenDetaProduOriginal().getId().equals(productoordendetaproduOriginal.getId())) {
					existe=true;
					productoordendetaproduOriginal.setId(productoordendetaproduAux.getId());
					productoordendetaproduOriginal.setVersionRow(productoordendetaproduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProductoOrdenDetaProdu(Boolean esParaCancelar) throws Exception {
		productoordendetaprodusAux=new ArrayList<ProductoOrdenDetaProdu>();
		productoordendetaproduAux=new ProductoOrdenDetaProdu();
		
		if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoOrdenDetaProdu productoordendetaproduAux:this.productoordendetaproduLogic.getProductoOrdenDetaProdus()) {
					if(productoordendetaproduAux.getId()<0) {
						productoordendetaprodusAux.add(productoordendetaproduAux);
					}		
				}
				this.iIdNuevoProductoOrdenDetaProdu=0L;
				this.productoordendetaproduLogic.getProductoOrdenDetaProdus().removeAll(productoordendetaprodusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProdu productoordendetaproduAux:this.productoordendetaprodus) {
					if(productoordendetaproduAux.getId()<0) {
						productoordendetaprodusAux.add(productoordendetaproduAux);
					}		
				}
				this.iIdNuevoProductoOrdenDetaProdu=0L;
				this.productoordendetaprodus.removeAll(productoordendetaprodusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProductoOrdenDetaProdu 
					&& this.productoordendetaproduLogic.getProductoOrdenDetaProdus().size()>0
					) {
					productoordendetaproduAux=this.productoordendetaproduLogic.getProductoOrdenDetaProdus().get(this.productoordendetaproduLogic.getProductoOrdenDetaProdus().size() - 1);
				
					if(productoordendetaproduAux.getId()<0) {
						this.productoordendetaproduLogic.getProductoOrdenDetaProdus().remove(productoordendetaproduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProductoOrdenDetaProdu && this.productoordendetaprodus.size()>0) {
					productoordendetaproduAux=this.productoordendetaprodus.get(this.productoordendetaprodus.size() - 1);
				
					if(productoordendetaproduAux.getId()<0) {
						this.productoordendetaprodus.remove(productoordendetaproduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProductoOrdenDetaProdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(productoordendetaprodu.getId()<0) {
				this.productoordendetaproduLogic.getProductoOrdenDetaProdus().remove(this.productoordendetaprodu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(productoordendetaprodu.getId()<0) {
				this.productoordendetaprodus.remove(this.productoordendetaprodu);
			}
		}			
	}
	
	public void setEstadosInicialesProductoOrdenDetaProdu(List<ProductoOrdenDetaProdu> productoordendetaprodusAux) throws Exception {
		ProductoOrdenDetaProduConstantesFunciones.setEstadosInicialesProductoOrdenDetaProdu(productoordendetaprodusAux);
	}
	
	public void setEstadosInicialesProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaproduAux) throws Exception {
		ProductoOrdenDetaProduConstantesFunciones.setEstadosInicialesProductoOrdenDetaProdu(productoordendetaproduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProductoOrdenDetaProduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProductoOrdenDetaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProductoOrdenDetaProduActual()) {
				if(!this.isEsNuevoProductoOrdenDetaProdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProductoOrdenDetaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProductoOrdenDetaProdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProductoOrdenDetaProduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Orden Producto Produccion ?", "MANTENIMIENTO DE Orden Producto Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProductoOrdenDetaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProductoOrdenDetaProdu productoordendetaprodu) throws Exception {
		ProductoOrdenDetaProduConstantesFunciones.seleccionarAsignar(this.productoordendetaprodu,productoordendetaprodu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProductoOrdenDetaProdu=this.isPermisoActualizarOriginalProductoOrdenDetaProdu;
			
			
			this.seleccionarAsignar(productoordendetaprodu);
			
			

			idProductoActual=productoordendetaprodu.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProductoOrdenDetaProduConstantesFunciones.quitarEspaciosProductoOrdenDetaProdu(this.productoordendetaprodu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.productoordendetaproduSessionBean.setsFuncionBusquedaRapida(this.productoordendetaproduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoProductoOrdenDetaProdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProductoOrdenDetaProdu(esParaCancelar);				
				this.cancelarNuevoProductoOrdenDetaProdu(esParaCancelar);								
			}
			
			this.productoordendetaprodu=new ProductoOrdenDetaProdu();
			
			this.inicializarProductoOrdenDetaProdu();
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProductoOrdenDetaProdu() throws Exception {
		try {
			ProductoOrdenDetaProduConstantesFunciones.inicializarProductoOrdenDetaProdu(this.productoordendetaprodu);
			
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
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.productoordendetaproduLogic.getProductoOrdenDetaProdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProductoOrdenDetaProdus(String sAccionBusqueda,List<ProductoOrdenDetaProdu> productoordendetaprodusParaReportes) throws Exception {
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
					sPathReporteFinal="ProductoOrdenDetaProdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProductoOrdenDetaProduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProductoOrdenDetaProduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProductoOrdenDetaProdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Orden Producto Producciones");		
		parameters.put("busquedapor", ProductoOrdenDetaProduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProductoOrdenDetaProdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProductoOrdenDetaProduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProductoOrdenDetaProduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProductoOrdenDetaProdu=new JRBeanArrayDataSource(ProductoOrdenDetaProduJInternalFrame.TraerProductoOrdenDetaProduBeans(productoordendetaprodusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProductoOrdenDetaProdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProductoOrdenDetaProduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProductoOrdenDetaProduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProductoOrdenDetaProduBean.TraerProductoOrdenDetaProduBeans(productoordendetaprodusParaReportes).toArray()));
							
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
				this.generarExcelReporteProductoOrdenDetaProdus(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProductoOrdenDetaProdus(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduActionPerformed(null);
					//this.generarExcelReporteProductoOrdenDetaProdus(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProductoOrdenDetaProdus(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProductoOrdenDetaProdus(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProductoOrdenDetaProdus(sAccionBusqueda,sTipoArchivoReporte,productoordendetaprodusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProductoOrdenDetaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoOrdenDetaProdu> productoordendetaprodusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoOrdenDetaProdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoOrdenDetaProdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProductoOrdenDetaProdu productoordendetaprodu : productoordendetaprodusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProductoOrdenDetaProduConstantesFunciones.generarExcelReporteDataProductoOrdenDetaProdu("NORMAL",row,workbook,productoordendetaprodu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Producto Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProductoOrdenDetaProdu(String sTipo,Row row,Workbook workbook) {
		
		ProductoOrdenDetaProduConstantesFunciones.generarExcelReporteHeaderProductoOrdenDetaProdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProductoOrdenDetaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoOrdenDetaProdu> productoordendetaprodusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoOrdenDetaProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProductoOrdenDetaProdu productoordendetaprodu : productoordendetaprodusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.getProductoOrdenDetaProduDescripcion(productoordendetaprodu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodu.getordendetaprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodu.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodu.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodu.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodu.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodu.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodu.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodu.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(productoordendetaprodu.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Producto Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProductoOrdenDetaProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<ProductoOrdenDetaProdu> productoordendetaprodusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProductoOrdenDetaProdu> productoordendetaprodusRespaldo=null;
		
		classes=ProductoOrdenDetaProduConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.productoordendetaproduLogic.setDatosCliente(this.datosCliente);
		this.productoordendetaproduLogic.setDatosDeep(this.datosDeep);
		this.productoordendetaproduLogic.setIsConDeep(true);
		
		productoordendetaprodusRespaldo=this.productoordendetaproduLogic.getProductoOrdenDetaProdus();
		
		this.productoordendetaproduLogic.setProductoOrdenDetaProdus(productoordendetaprodusParaReportes);	
		this.productoordendetaproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		productoordendetaprodusParaReportes=this.productoordendetaproduLogic.getProductoOrdenDetaProdus();
		this.productoordendetaproduLogic.setProductoOrdenDetaProdus(productoordendetaprodusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProductoOrdenDetaProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProductoOrdenDetaProdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProductoOrdenDetaProdu productoordendetaprodu : productoordendetaprodusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProductoOrdenDetaProdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProductoOrdenDetaProduConstantesFunciones.generarExcelReporteDataProductoOrdenDetaProdu("NORMAL",row,workbook,productoordendetaprodu,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.getProductoOrdenDetaProduDescripcion(productoordendetaprodu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Producto Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProductoOrdenDetaProdu() throws Exception {		
		this.startProcessProductoOrdenDetaProdu(true);
	}
	
	public void startProcessProductoOrdenDetaProdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProductoOrdenDetaProdu ,this.jPanelParametrosReportesProductoOrdenDetaProdu, this.jScrollPanelDatosProductoOrdenDetaProdu,this.jPanelPaginacionProductoOrdenDetaProdu, this.jScrollPanelDatosEdicionProductoOrdenDetaProdu, this.jPanelAccionesProductoOrdenDetaProdu,this.jPanelAccionesFormularioProductoOrdenDetaProdu,this.jmenuBarProductoOrdenDetaProdu,this.jmenuBarDetalleProductoOrdenDetaProdu,this.jTtoolBarProductoOrdenDetaProdu,this.jTtoolBarDetalleProductoOrdenDetaProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoOrdenDetaProdu=this.jTabbedPaneBusquedasProductoOrdenDetaProdu; 
		
		final JPanel jPanelParametrosReportesProductoOrdenDetaProdu=this.jPanelParametrosReportesProductoOrdenDetaProdu;
		//final JScrollPane jScrollPanelDatosProductoOrdenDetaProdu=this.jScrollPanelDatosProductoOrdenDetaProdu;
		final JTable jTableDatosProductoOrdenDetaProdu=this.jTableDatosProductoOrdenDetaProdu;		
		final JPanel jPanelPaginacionProductoOrdenDetaProdu=this.jPanelPaginacionProductoOrdenDetaProdu;
		//final JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProdu=this.jScrollPanelDatosEdicionProductoOrdenDetaProdu;
		final JPanel jPanelAccionesProductoOrdenDetaProdu=this.jPanelAccionesProductoOrdenDetaProdu;
		
		JPanel jPanelCamposAuxiliarProductoOrdenDetaProdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProductoOrdenDetaProdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
			jPanelCamposAuxiliarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jPanelCamposProductoOrdenDetaProdu;
			jPanelAccionesFormularioAuxiliarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jPanelAccionesFormularioProductoOrdenDetaProdu;
		}
		
		final JPanel jPanelCamposProductoOrdenDetaProdu=jPanelCamposAuxiliarProductoOrdenDetaProdu;
		final JPanel jPanelAccionesFormularioProductoOrdenDetaProdu=jPanelAccionesFormularioAuxiliarProductoOrdenDetaProdu;
		
		
		final JMenuBar jmenuBarProductoOrdenDetaProdu=this.jmenuBarProductoOrdenDetaProdu;
		final JToolBar jTtoolBarProductoOrdenDetaProdu=this.jTtoolBarProductoOrdenDetaProdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProductoOrdenDetaProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoOrdenDetaProdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
			jmenuBarDetalleAuxiliarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jmenuBarDetalleProductoOrdenDetaProdu;
			jTtoolBarDetalleAuxiliarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTtoolBarDetalleProductoOrdenDetaProdu;
		}
		
		final JMenuBar jmenuBarDetalleProductoOrdenDetaProdu=jmenuBarDetalleAuxiliarProductoOrdenDetaProdu;
		final JToolBar jTtoolBarDetalleProductoOrdenDetaProdu=jTtoolBarDetalleAuxiliarProductoOrdenDetaProdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoOrdenDetaProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoOrdenDetaProdu;
			processRunnable.jTableDatos=jTableDatosProductoOrdenDetaProdu;
			processRunnable.jPanelCampos=jPanelCamposProductoOrdenDetaProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoOrdenDetaProdu;
			processRunnable.jPanelAcciones=jPanelAccionesProductoOrdenDetaProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoOrdenDetaProdu;
			
			
			processRunnable.jmenuBar=jmenuBarProductoOrdenDetaProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoOrdenDetaProdu;
			processRunnable.jTtoolBar=jTtoolBarProductoOrdenDetaProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoOrdenDetaProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoOrdenDetaProdu ,jPanelParametrosReportesProductoOrdenDetaProdu,jTableDatosProductoOrdenDetaProdu, /*jScrollPanelDatosProductoOrdenDetaProdu,*/jPanelCamposProductoOrdenDetaProdu,jPanelPaginacionProductoOrdenDetaProdu, /*jScrollPanelDatosEdicionProductoOrdenDetaProdu,*/ jPanelAccionesProductoOrdenDetaProdu,jPanelAccionesFormularioProductoOrdenDetaProdu,jmenuBarProductoOrdenDetaProdu,jmenuBarDetalleProductoOrdenDetaProdu,jTtoolBarProductoOrdenDetaProdu,jTtoolBarDetalleProductoOrdenDetaProdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProductoOrdenDetaProdu ,jPanelParametrosReportesProductoOrdenDetaProdu, jScrollPanelDatosProductoOrdenDetaProdu,jPanelPaginacionProductoOrdenDetaProdu, jScrollPanelDatosEdicionProductoOrdenDetaProdu, jPanelAccionesProductoOrdenDetaProdu,jPanelAccionesFormularioProductoOrdenDetaProdu,jmenuBarProductoOrdenDetaProdu,jmenuBarDetalleProductoOrdenDetaProdu,jTtoolBarProductoOrdenDetaProdu,jTtoolBarDetalleProductoOrdenDetaProdu);
						
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
	
	public void finishProcessProductoOrdenDetaProdu() {// throws Exception 
		this.finishProcessProductoOrdenDetaProdu(true);
	}
	
	public void finishProcessProductoOrdenDetaProdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProductoOrdenDetaProdu ,this.jPanelParametrosReportesProductoOrdenDetaProdu, this.jScrollPanelDatosProductoOrdenDetaProdu,this.jPanelPaginacionProductoOrdenDetaProdu, this.jScrollPanelDatosEdicionProductoOrdenDetaProdu, this.jPanelAccionesProductoOrdenDetaProdu,this.jPanelAccionesFormularioProductoOrdenDetaProdu,this.jmenuBarProductoOrdenDetaProdu,this.jmenuBarDetalleProductoOrdenDetaProdu,this.jTtoolBarProductoOrdenDetaProdu,this.jTtoolBarDetalleProductoOrdenDetaProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasProductoOrdenDetaProdu=this.jTabbedPaneBusquedasProductoOrdenDetaProdu; 
		
		final JPanel jPanelParametrosReportesProductoOrdenDetaProdu=this.jPanelParametrosReportesProductoOrdenDetaProdu;
		//final JScrollPane jScrollPanelDatosProductoOrdenDetaProdu=this.jScrollPanelDatosProductoOrdenDetaProdu;
		final JTable jTableDatosProductoOrdenDetaProdu=this.jTableDatosProductoOrdenDetaProdu;		
		final JPanel jPanelPaginacionProductoOrdenDetaProdu=this.jPanelPaginacionProductoOrdenDetaProdu;
		//final JScrollPane jScrollPanelDatosEdicionProductoOrdenDetaProdu=this.jScrollPanelDatosEdicionProductoOrdenDetaProdu;
		final JPanel jPanelAccionesProductoOrdenDetaProdu=this.jPanelAccionesProductoOrdenDetaProdu;
		
		JPanel jPanelCamposAuxiliarProductoOrdenDetaProdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProductoOrdenDetaProdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
			jPanelCamposAuxiliarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jPanelCamposProductoOrdenDetaProdu;
			jPanelAccionesFormularioAuxiliarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jPanelAccionesFormularioProductoOrdenDetaProdu;
		}
		
		final JPanel jPanelCamposProductoOrdenDetaProdu=jPanelCamposAuxiliarProductoOrdenDetaProdu;
		final JPanel jPanelAccionesFormularioProductoOrdenDetaProdu=jPanelAccionesFormularioAuxiliarProductoOrdenDetaProdu;
		
		
		final JMenuBar jmenuBarProductoOrdenDetaProdu=this.jmenuBarProductoOrdenDetaProdu;		
		final JToolBar jTtoolBarProductoOrdenDetaProdu=this.jTtoolBarProductoOrdenDetaProdu;
				
		JMenuBar jmenuBarDetalleAuxiliarProductoOrdenDetaProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProductoOrdenDetaProdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
			jmenuBarDetalleAuxiliarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jmenuBarDetalleProductoOrdenDetaProdu;
			jTtoolBarDetalleAuxiliarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTtoolBarDetalleProductoOrdenDetaProdu;		
		}
		
		final JMenuBar jmenuBarDetalleProductoOrdenDetaProdu=jmenuBarDetalleAuxiliarProductoOrdenDetaProdu;
		final JToolBar jTtoolBarDetalleProductoOrdenDetaProdu=jTtoolBarDetalleAuxiliarProductoOrdenDetaProdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProductoOrdenDetaProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProductoOrdenDetaProdu;
			processRunnable.jTableDatos=jTableDatosProductoOrdenDetaProdu;
			processRunnable.jPanelCampos=jPanelCamposProductoOrdenDetaProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionProductoOrdenDetaProdu;
			processRunnable.jPanelAcciones=jPanelAccionesProductoOrdenDetaProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProductoOrdenDetaProdu;
			
			
			processRunnable.jmenuBar=jmenuBarProductoOrdenDetaProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProductoOrdenDetaProdu;
			processRunnable.jTtoolBar=jTtoolBarProductoOrdenDetaProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProductoOrdenDetaProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProductoOrdenDetaProdu ,jPanelParametrosReportesProductoOrdenDetaProdu, jTableDatosProductoOrdenDetaProdu,/*jScrollPanelDatosProductoOrdenDetaProdu,*/jPanelCamposProductoOrdenDetaProdu,jPanelPaginacionProductoOrdenDetaProdu, /*jScrollPanelDatosEdicionProductoOrdenDetaProdu,*/ jPanelAccionesProductoOrdenDetaProdu,jPanelAccionesFormularioProductoOrdenDetaProdu,jmenuBarProductoOrdenDetaProdu,jmenuBarDetalleProductoOrdenDetaProdu,jTtoolBarProductoOrdenDetaProdu,jTtoolBarDetalleProductoOrdenDetaProdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProductoOrdenDetaProdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProductoOrdenDetaProdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProductoOrdenDetaProdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProductoOrdenDetaProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProductoOrdenDetaProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProductoOrdenDetaProdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProductoOrdenDetaProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProductoOrdenDetaProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProductoOrdenDetaProdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.productoordendetaproduConstantesFunciones.getsFinalQueryProductoOrdenDetaProdu();
		String  finalQueryPaginacionTodos=this.productoordendetaproduConstantesFunciones.getsFinalQueryProductoOrdenDetaProdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProductoOrdenDetaProduConstantesFunciones.getArrayColumnasGlobalesNoProductoOrdenDetaProdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProductoOrdenDetaProduConstantesFunciones.getArrayColumnasGlobalesProductoOrdenDetaProdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProductoOrdenDetaProduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.productoordendetaprodusEliminados= new ArrayList<ProductoOrdenDetaProdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProductoOrdenDetaProdu();
		
				///*ProductoOrdenDetaProduSessionBean*/this.productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
			
			if(this.productoordendetaproduSessionBean==null) {
				this.productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
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
					this.iNumeroPaginacion=ProductoOrdenDetaProduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProductoOrdenDetaProduConstantesFunciones.getClassesForeignKeysOfProductoOrdenDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/productoordendetaprodu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			productoordendetaprodusAux= new ArrayList<ProductoOrdenDetaProdu>();
			
				
			productoordendetaproduLogic.setDatosCliente(this.datosCliente);
			productoordendetaproduLogic.setDatosDeep(this.datosDeep);
			productoordendetaproduLogic.setIsConDeep(true);
			
			
			productoordendetaproduLogic.getProductoOrdenDetaProduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					productoordendetaproduLogic.getTodosProductoOrdenDetaProdus(finalQueryGlobal,pagination);
					
					//productoordendetaproduLogic.getTodosProductoOrdenDetaProdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(productoordendetaproduLogic.getProductoOrdenDetaProdus()==null|| productoordendetaproduLogic.getProductoOrdenDetaProdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoordendetaprodusAux= new ArrayList<ProductoOrdenDetaProdu>();
							productoordendetaprodusAux.addAll(productoordendetaproduLogic.getProductoOrdenDetaProdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodusAux= new ArrayList<ProductoOrdenDetaProdu>();
							productoordendetaprodusAux.addAll(productoordendetaprodus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoordendetaproduLogic.getTodosProductoOrdenDetaProdus(finalQueryGlobal+"",this.pagination);												
							
							//productoordendetaproduLogic.getTodosProductoOrdenDetaProdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProductoOrdenDetaProdus("Todos",productoordendetaproduLogic.getProductoOrdenDetaProdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							productoordendetaproduLogic.setProductoOrdenDetaProdus(new ArrayList<ProductoOrdenDetaProdu>());					
							productoordendetaproduLogic.getProductoOrdenDetaProdus().addAll(productoordendetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodus=new ArrayList<ProductoOrdenDetaProdu>();
							productoordendetaprodus.addAll(productoordendetaprodusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProductoOrdenDetaProdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProductoOrdenDetaProdu=this.idActual;
				
				} else if(this.idProductoOrdenDetaProduActual!=null && this.idProductoOrdenDetaProduActual!=0L) {
					idProductoOrdenDetaProdu=idProductoOrdenDetaProduActual;
				}
				
					
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndicePorId(idProductoOrdenDetaProdu);
				
				this.productoordendetaprodus=new ArrayList<ProductoOrdenDetaProdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					productoordendetaproduLogic.getEntity(idProductoOrdenDetaProdu);
					
					//productoordendetaproduLogic.getEntityWithConnection(idProductoOrdenDetaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaproduLogic.setProductoOrdenDetaProdus(new ArrayList<ProductoOrdenDetaProdu>());
					productoordendetaproduLogic.getProductoOrdenDetaProdus().add(productoordendetaproduLogic.getProductoOrdenDetaProdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodus=new ArrayList<ProductoOrdenDetaProdu>();
					this.productoordendetaprodus.add(productoordendetaprodu);
				}
				
				if(productoordendetaproduLogic.getProductoOrdenDetaProdu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaproduLogic.getProductoOrdenDetaProdusFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaproduLogic.getProductoOrdenDetaProdus()==null||productoordendetaproduLogic.getProductoOrdenDetaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodus==null|| productoordendetaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodusAux=new ArrayList<ProductoOrdenDetaProdu>();
						productoordendetaprodusAux.addAll(productoordendetaproduLogic.getProductoOrdenDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodusAux=new ArrayList<ProductoOrdenDetaProdu>();
							productoordendetaprodusAux.addAll(productoordendetaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaproduLogic.getProductoOrdenDetaProdusFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProdus("FK_IdBodega",productoordendetaproduLogic.getProductoOrdenDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProdus("FK_IdBodega",productoordendetaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaproduLogic.setProductoOrdenDetaProdus(new ArrayList<ProductoOrdenDetaProdu>());
						productoordendetaproduLogic.getProductoOrdenDetaProdus().addAll(productoordendetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodus=new ArrayList<ProductoOrdenDetaProdu>();
							productoordendetaprodus.addAll(productoordendetaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdOrdenDetaProdu")) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaproduLogic.getProductoOrdenDetaProdusFK_IdOrdenDetaProdu(finalQueryGlobal,pagination,id_orden_deta_produFK_IdOrdenDetaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaproduLogic.getProductoOrdenDetaProdus()==null||productoordendetaproduLogic.getProductoOrdenDetaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodus==null|| productoordendetaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodusAux=new ArrayList<ProductoOrdenDetaProdu>();
						productoordendetaprodusAux.addAll(productoordendetaproduLogic.getProductoOrdenDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodusAux=new ArrayList<ProductoOrdenDetaProdu>();
							productoordendetaprodusAux.addAll(productoordendetaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaproduLogic.getProductoOrdenDetaProdusFK_IdOrdenDetaProdu(finalQueryGlobal,pagination,id_orden_deta_produFK_IdOrdenDetaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdOrdenDetaProdu(id_orden_deta_produFK_IdOrdenDetaProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProdus("FK_IdOrdenDetaProdu",productoordendetaproduLogic.getProductoOrdenDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProdus("FK_IdOrdenDetaProdu",productoordendetaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaproduLogic.setProductoOrdenDetaProdus(new ArrayList<ProductoOrdenDetaProdu>());
						productoordendetaproduLogic.getProductoOrdenDetaProdus().addAll(productoordendetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodus=new ArrayList<ProductoOrdenDetaProdu>();
							productoordendetaprodus.addAll(productoordendetaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaproduLogic.getProductoOrdenDetaProdusFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaproduLogic.getProductoOrdenDetaProdus()==null||productoordendetaproduLogic.getProductoOrdenDetaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodus==null|| productoordendetaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodusAux=new ArrayList<ProductoOrdenDetaProdu>();
						productoordendetaprodusAux.addAll(productoordendetaproduLogic.getProductoOrdenDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodusAux=new ArrayList<ProductoOrdenDetaProdu>();
							productoordendetaprodusAux.addAll(productoordendetaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaproduLogic.getProductoOrdenDetaProdusFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProdus("FK_IdProducto",productoordendetaproduLogic.getProductoOrdenDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProdus("FK_IdProducto",productoordendetaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaproduLogic.setProductoOrdenDetaProdus(new ArrayList<ProductoOrdenDetaProdu>());
						productoordendetaproduLogic.getProductoOrdenDetaProdus().addAll(productoordendetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodus=new ArrayList<ProductoOrdenDetaProdu>();
							productoordendetaprodus.addAll(productoordendetaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidadUnad")) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdUnidadUnad(id_unidadFK_IdUnidadUnad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					productoordendetaproduLogic.getProductoOrdenDetaProdusFK_IdUnidadUnad(finalQueryGlobal,pagination,id_unidadFK_IdUnidadUnad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdUnidadUnad(id_unidadFK_IdUnidadUnad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdUnidadUnad(id_unidadFK_IdUnidadUnad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=productoordendetaproduLogic.getProductoOrdenDetaProdus()==null||productoordendetaproduLogic.getProductoOrdenDetaProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=productoordendetaprodus==null|| productoordendetaprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaprodusAux=new ArrayList<ProductoOrdenDetaProdu>();
						productoordendetaprodusAux.addAll(productoordendetaproduLogic.getProductoOrdenDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodusAux=new ArrayList<ProductoOrdenDetaProdu>();
							productoordendetaprodusAux.addAll(productoordendetaprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							productoordendetaproduLogic.getProductoOrdenDetaProdusFK_IdUnidadUnad(finalQueryGlobal,pagination,id_unidadFK_IdUnidadUnad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdUnidadUnad(id_unidadFK_IdUnidadUnad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProductoOrdenDetaProduConstantesFunciones.getDetalleIndiceFK_IdUnidadUnad(id_unidadFK_IdUnidadUnad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProductoOrdenDetaProdus("FK_IdUnidadUnad",productoordendetaproduLogic.getProductoOrdenDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProductoOrdenDetaProdus("FK_IdUnidadUnad",productoordendetaprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaproduLogic.setProductoOrdenDetaProdus(new ArrayList<ProductoOrdenDetaProdu>());
						productoordendetaproduLogic.getProductoOrdenDetaProdus().addAll(productoordendetaprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaprodus=new ArrayList<ProductoOrdenDetaProdu>();
							productoordendetaprodus.addAll(productoordendetaprodusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProductoOrdenDetaProdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProductoOrdenDetaProdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoordendetaproduLogic.getProductoOrdenDetaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoordendetaprodus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=productoordendetaproduLogic.getProductoOrdenDetaProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=productoordendetaprodus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProductoOrdenDetaProdu productoordendetaprodu) {
		Boolean permite=true;
		
		if(this.productoordendetaprodu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProductoOrdenDetaProduConstantesFunciones.getOrderByListaProductoOrdenDetaProdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProductoOrdenDetaProduConstantesFunciones.getOrderByListaProductoOrdenDetaProdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProdu productoordendetaprodu:productoordendetaproduLogic.getProductoOrdenDetaProdus()) {
				if(productoordendetaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaproduTotales=productoordendetaprodu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProdu productoordendetaprodu:this.productoordendetaprodus) {
				if(productoordendetaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaproduTotales=productoordendetaprodu;
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
			this.productoordendetaproduAux=new ProductoOrdenDetaProdu();
			this.productoordendetaproduAux.setsType(Constantes2.S_TOTALES);
			this.productoordendetaproduAux.setIsNew(false);
			this.productoordendetaproduAux.setIsChanged(false);
			this.productoordendetaproduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProductoOrdenDetaProduConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProdu(this.productoordendetaproduLogic.getProductoOrdenDetaProdus(),this.productoordendetaproduAux);
				
				this.productoordendetaproduLogic.getProductoOrdenDetaProdus().add(this.productoordendetaproduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProductoOrdenDetaProduConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProdu(this.productoordendetaprodus,this.productoordendetaproduAux);
				
				this.productoordendetaprodus.add(this.productoordendetaproduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		productoordendetaproduTotales=new ProductoOrdenDetaProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoordendetaproduLogic.getProductoOrdenDetaProdus().remove(productoordendetaproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.productoordendetaprodus.remove(productoordendetaproduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		productoordendetaproduTotales=new ProductoOrdenDetaProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProductoOrdenDetaProdu productoordendetaprodu:productoordendetaproduLogic.getProductoOrdenDetaProdus()) {
				if(productoordendetaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaproduTotales=productoordendetaprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoOrdenDetaProduConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProdu(this.productoordendetaproduLogic.getProductoOrdenDetaProdus(),productoordendetaproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProductoOrdenDetaProdu productoordendetaprodu:this.productoordendetaprodus) {
				if(productoordendetaprodu.getsType().equals(Constantes2.S_TOTALES)) {
					productoordendetaproduTotales=productoordendetaprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProductoOrdenDetaProduConstantesFunciones.TotalizarValoresFilaProductoOrdenDetaProdu(this.productoordendetaprodus,productoordendetaproduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProductoOrdenDetaProdusFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProdusFK_IdOrdenDetaProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdOrdenDetaProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProdusFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProductoOrdenDetaProdusFK_IdUnidadUnad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidadUnad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProductoOrdenDetaProdusFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaproduLogic.getProductoOrdenDetaProdusFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProdusFK_IdOrdenDetaProdu(String sFinalQuery,Long id_orden_deta_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaproduLogic.getProductoOrdenDetaProdusFK_IdOrdenDetaProdu(sFinalQuery,this.pagination,id_orden_deta_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProdusFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaproduLogic.getProductoOrdenDetaProdusFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProductoOrdenDetaProdusFK_IdUnidadUnad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaproduLogic.getProductoOrdenDetaProdusFK_IdUnidadUnad(sFinalQuery,this.pagination,id_unidad);
				
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
	
	public void inicializarPermisosProductoOrdenDetaProdu() {
		this.isPermisoTodoProductoOrdenDetaProdu=false;
		this.isPermisoNuevoProductoOrdenDetaProdu=false;
		this.isPermisoActualizarProductoOrdenDetaProdu=false;
		this.isPermisoActualizarOriginalProductoOrdenDetaProdu=false;
		this.isPermisoEliminarProductoOrdenDetaProdu=false;
		this.isPermisoGuardarCambiosProductoOrdenDetaProdu=false;
		this.isPermisoConsultaProductoOrdenDetaProdu=false;
		this.isPermisoBusquedaProductoOrdenDetaProdu=false;
		this.isPermisoReporteProductoOrdenDetaProdu=false;		
		this.isPermisoOrdenProductoOrdenDetaProdu=false;		
		this.isPermisoPaginacionMedioProductoOrdenDetaProdu=false;		
		this.isPermisoPaginacionAltoProductoOrdenDetaProdu=false;
		this.isPermisoPaginacionTodoProductoOrdenDetaProdu=false;
		this.isPermisoCopiarProductoOrdenDetaProdu=false;		
		this.isPermisoVerFormProductoOrdenDetaProdu=false;		
		this.isPermisoDuplicarProductoOrdenDetaProdu=false;		
		this.isPermisoOrdenProductoOrdenDetaProdu=false;		
	}
	
	public void setPermisosUsuarioProductoOrdenDetaProdu(Boolean isPermiso) {
		this.isPermisoTodoProductoOrdenDetaProdu=isPermiso;
		this.isPermisoNuevoProductoOrdenDetaProdu=isPermiso;
		this.isPermisoActualizarProductoOrdenDetaProdu=isPermiso;
		this.isPermisoActualizarOriginalProductoOrdenDetaProdu=isPermiso;
		this.isPermisoEliminarProductoOrdenDetaProdu=isPermiso;
		this.isPermisoGuardarCambiosProductoOrdenDetaProdu=isPermiso;
		this.isPermisoConsultaProductoOrdenDetaProdu=isPermiso;
		this.isPermisoBusquedaProductoOrdenDetaProdu=isPermiso;
		this.isPermisoReporteProductoOrdenDetaProdu=isPermiso;
		this.isPermisoOrdenProductoOrdenDetaProdu=isPermiso;		
		this.isPermisoPaginacionMedioProductoOrdenDetaProdu=isPermiso;		
		this.isPermisoPaginacionAltoProductoOrdenDetaProdu=isPermiso;		
		this.isPermisoPaginacionTodoProductoOrdenDetaProdu=isPermiso;		
		this.isPermisoCopiarProductoOrdenDetaProdu=isPermiso;		
		this.isPermisoVerFormProductoOrdenDetaProdu=isPermiso;		
		this.isPermisoDuplicarProductoOrdenDetaProdu=isPermiso;
		this.isPermisoOrdenProductoOrdenDetaProdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProductoOrdenDetaProdu(Boolean isPermiso) {
		//this.isPermisoTodoProductoOrdenDetaProdu=isPermiso;
		this.isPermisoNuevoProductoOrdenDetaProdu=isPermiso;
		this.isPermisoActualizarProductoOrdenDetaProdu=isPermiso;
		this.isPermisoActualizarOriginalProductoOrdenDetaProdu=isPermiso;
		this.isPermisoEliminarProductoOrdenDetaProdu=isPermiso;
		this.isPermisoGuardarCambiosProductoOrdenDetaProdu=isPermiso;
		//this.isPermisoConsultaProductoOrdenDetaProdu=isPermiso;
		//this.isPermisoBusquedaProductoOrdenDetaProdu=isPermiso;
		//this.isPermisoReporteProductoOrdenDetaProdu=isPermiso;
		//this.isPermisoOrdenProductoOrdenDetaProdu=isPermiso;		
		//this.isPermisoPaginacionMedioProductoOrdenDetaProdu=isPermiso;		
		//this.isPermisoPaginacionAltoProductoOrdenDetaProdu=isPermiso;		
		//this.isPermisoPaginacionTodoProductoOrdenDetaProdu=isPermiso;		
		//this.isPermisoCopiarProductoOrdenDetaProdu=isPermiso;		
		//this.isPermisoDuplicarProductoOrdenDetaProdu=isPermiso;
		//this.isPermisoOrdenProductoOrdenDetaProdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProductoOrdenDetaProduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProductoOrdenDetaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProductoOrdenDetaProduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProductoOrdenDetaProduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProductoOrdenDetaProduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProductoOrdenDetaProduClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProductoOrdenDetaProdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProductoOrdenDetaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProductoOrdenDetaProduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProductoOrdenDetaProdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProductoOrdenDetaProdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProductoOrdenDetaProdu=this.isPermisoActualizarProductoOrdenDetaProdu;
			this.isPermisoEliminarProductoOrdenDetaProdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProductoOrdenDetaProdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProductoOrdenDetaProdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProductoOrdenDetaProdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProductoOrdenDetaProdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProductoOrdenDetaProdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoOrdenDetaProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProductoOrdenDetaProdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProductoOrdenDetaProdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProductoOrdenDetaProdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProductoOrdenDetaProdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProductoOrdenDetaProdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProductoOrdenDetaProdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProductoOrdenDetaProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProductoOrdenDetaProdu.setToolTipText(this.jTableDatosProductoOrdenDetaProdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProductoOrdenDetaProdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProductoOrdenDetaProdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProductoOrdenDetaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProductoOrdenDetaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProductoOrdenDetaProdu() throws Exception {
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
	public void inicializarCombosForeignKeyProductoOrdenDetaProduListas()throws Exception {
		try	{						
			
				this.ordendetaprodusForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProductoOrdenDetaProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProductoOrdenDetaProduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProductoOrdenDetaProduListas(false);
			} else {
			
				this.cargarCombosForeignKeyOrdenDetaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyOrdenDetaProduListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ordendetaprodusForeignKey==null||this.ordendetaprodusForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=OrdenDetaProduConstantesFunciones.getArrayColumnasGlobalesOrdenDetaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OrdenDetaProduConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=OrdenDetaProduConstantesFunciones.SFINALQUERY;

				this.cargarCombosOrdenDetaProdusForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyProductoOrdenDetaProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ProductoOrdenDetaProduParameterReturnGeneral productoordendetaproduReturnGeneral=new ProductoOrdenDetaProduParameterReturnGeneral();
						
			


				String finalQueryGlobalOrdenDetaProdu="";

				if(((this.ordendetaprodusForeignKey==null||this.ordendetaprodusForeignKey.size()<=0) && this.productoordendetaproduConstantesFunciones.cargarid_orden_deta_produProductoOrdenDetaProdu)
					 || (this.esRecargarFks && this.productoordendetaproduConstantesFunciones.cargarid_orden_deta_produProductoOrdenDetaProdu)) {

					if(!this.productoordendetaproduSessionBean.getisBusquedaDesdeForeignKeySesionOrdenDetaProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=OrdenDetaProduConstantesFunciones.getArrayColumnasGlobalesOrdenDetaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalOrdenDetaProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,OrdenDetaProduConstantesFunciones.TABLENAME);

						finalQueryGlobalOrdenDetaProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalOrdenDetaProdu, "");
						finalQueryGlobalOrdenDetaProdu+=OrdenDetaProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosOrdenDetaProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalOrdenDetaProdu=" WHERE " + ConstantesSql.ID + "="+productoordendetaproduSessionBean.getlidOrdenDetaProduActual();
					}
				} else {
					finalQueryGlobalOrdenDetaProdu="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.productoordendetaproduConstantesFunciones.cargarid_bodegaProductoOrdenDetaProdu)
					 || (this.esRecargarFks && this.productoordendetaproduConstantesFunciones.cargarid_bodegaProductoOrdenDetaProdu)) {

					if(!this.productoordendetaproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+productoordendetaproduSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(cargarCombosDependencia && ((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.productoordendetaproduConstantesFunciones.cargarid_productoProductoOrdenDetaProdu)
					 || (this.esRecargarFks && this.productoordendetaproduConstantesFunciones.cargarid_productoProductoOrdenDetaProdu)) {

					if(!this.productoordendetaproduSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+productoordendetaproduSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(cargarCombosDependencia && ((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.productoordendetaproduConstantesFunciones.cargarid_unidadProductoOrdenDetaProdu)
					 || (this.esRecargarFks && this.productoordendetaproduConstantesFunciones.cargarid_unidadProductoOrdenDetaProdu)) {

					if(!this.productoordendetaproduSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+productoordendetaproduSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				productoordendetaproduReturnGeneral=productoordendetaproduLogic.cargarCombosLoteForeignKeyProductoOrdenDetaProdu(finalQueryGlobalOrdenDetaProdu,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalUnidad);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalOrdenDetaProdu.equals("NONE")) {
				this.ordendetaprodusForeignKey=productoordendetaproduReturnGeneral.getordendetaprodusForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=productoordendetaproduReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=productoordendetaproduReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=productoordendetaproduReturnGeneral.getunidadsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProductoOrdenDetaProdu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyUnidad();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyOrdenDetaProdu()throws Exception {
		try {
			if(this.productoordendetaproduSessionBean==null) {
				this.productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
			}

			if(!this.productoordendetaproduSessionBean.getisBusquedaDesdeForeignKeySesionOrdenDetaProdu()) {
				OrdenDetaProdu ordendetaprodu=new OrdenDetaProdu();
				OrdenDetaProduConstantesFunciones.setOrdenDetaProduDescripcion(ordendetaprodu,Constantes.SMENSAJE_ESCOJA_OPCION);
				ordendetaprodu.setId(null);

				if(!OrdenDetaProduConstantesFunciones.ExisteEnLista(this.ordendetaprodusForeignKey,ordendetaprodu,true)) {

					this.ordendetaprodusForeignKey.add(0,ordendetaprodu);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.productoordendetaproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.productoordendetaproduSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

			if(!this.productoordendetaproduSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
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
	
	public void initActionsCombosTodosForeignKeyProductoOrdenDetaProdu()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyBodega("Todos");
			this.initActionsCombosForeignKeyProducto("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProductoOrdenDetaProdu(String sFormularioTipoBusqueda)throws Exception {
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
			sFinalQueryCombo=InventarioSql.GetQueryUnidadFromBodegaYProducto(productoLocal,this.productoordendetaprodu.getid_bodega());

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
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.addItemListener(new ComboBoxItemListener(this,"id_bodegaProductoOrdenDetaProdu"));
						this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaProductoOrdenDetaProdu"));
					}
				} else {
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.addActionListener(new ComboBoxActionListener(this,"id_bodegaProductoOrdenDetaProdu"));
						this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"id_bodegaProductoOrdenDetaProdu"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu"));

						this.jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu"));

					} else {
						this.jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu"));

						this.jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu"));

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
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.addItemListener(new ComboBoxItemListener(this,"id_productoProductoOrdenDetaProdu"));
						this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"id_productoProductoOrdenDetaProdu"));
					}
				} else {
					if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.addActionListener(new ComboBoxActionListener(this,"id_productoProductoOrdenDetaProdu"));
						this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"id_productoProductoOrdenDetaProdu"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						this.jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.addItemListener(new ComboBoxItemListener(this,"jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu"));

						this.jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu"));

					} else {
						this.jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.addActionListener(new ComboBoxActionListener(this,"jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu"));

						this.jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.addFocusListener(new ComboBoxFocusListener(this,"jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu"));

					}
			
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProductoOrdenDetaProdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu)throws Exception {	
		try {
			
			this.setActualOrdenDetaProduForeignKey(productoordendetaprodu.getid_orden_deta_produ(),false,"Formulario");
			this.setActualBodegaForeignKey(productoordendetaprodu.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(productoordendetaprodu.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(productoordendetaprodu.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu,String sTipoEvento)throws Exception {	
		try {
			
			

				if(productoordendetaprodu.getProducto()!=null && !sTipoEvento.equals("id_productoProductoOrdenDetaProdu")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(productoordendetaprodu.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProductoOrdenDetaProdu()throws Exception {	
		try {
			
			this.setActualOrdenDetaProduForeignKey(this.productoordendetaproduConstantesFunciones.getid_orden_deta_produ(),false,"Formulario");
			this.setActualBodegaForeignKey(this.productoordendetaproduConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.productoordendetaproduConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualUnidadForeignKey(this.productoordendetaproduConstantesFunciones.getid_unidad(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProductoOrdenDetaProdu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProductoOrdenDetaProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProductoOrdenDetaProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProductoOrdenDetaProdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProductoOrdenDetaProdu()throws Exception {
		try {
			

			this.cargarCombosFrameOrdenDetaProdusForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProductoOrdenDetaProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameOrdenDetaProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProductoOrdenDetaProdu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_orden_deta_produProductoOrdenDetaProdu!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_orden_deta_produProductoOrdenDetaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_orden_deta_produProductoOrdenDetaProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_unidadProductoOrdenDetaProdu!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_unidadProductoOrdenDetaProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_unidadProductoOrdenDetaProdu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	



	public void recargarFormProductoOrdenDetaProduBodega(JComboBox<?> jComboBoxGenericoBodega,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormProductoOrdenDetaProduid_producto(jComboBoxGenericoBodega,sFormularioTipoBusqueda,"Bodega",false);
	}

	public void recargarFormProductoOrdenDetaProduProducto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormProductoOrdenDetaProduid_unidad(jComboBoxGenericoProducto,sFormularioTipoBusqueda,"Producto",false);
	}


	
	



	public void recargarFormProductoOrdenDetaProduid_producto(JComboBox<?> jComboBoxGenericoProducto,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Bodega")){
				this.setActualParaGuardarBodegaForeignKey(this.productoordendetaprodu,jComboBoxGenericoProducto);
			}

			if(this.productoordendetaprodu.getid_bodega()!=null && this.productoordendetaprodu.getid_bodega()!=0L) {
				sFinalQuery+="  WHERE  id_bodega="+this.productoordendetaprodu.getid_bodega();
			} else {
				sFinalQuery+="  WHERE  id_bodega=-1";
			}



			//BUCLE RECURSIVO
			this.setActualProductoForeignKey(this.productoordendetaprodu.getid_bodega(),true,sFormularioTipoBusqueda);

			this.cargarCombosProductosForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormProductoOrdenDetaProduid_unidad(JComboBox<?> jComboBoxGenericoUnidad,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Producto")){
				this.setActualParaGuardarProductoForeignKey(this.productoordendetaprodu,jComboBoxGenericoUnidad);
			}

			if(this.productoordendetaprodu.getid_producto()!=null && this.productoordendetaprodu.getid_producto()!=0L) {
				sFinalQuery+="  WHERE  id_producto="+this.productoordendetaprodu.getid_producto();
			} else {
				sFinalQuery+="  WHERE  id_producto=-1";
			}



			//BUCLE RECURSIVO
			this.setActualUnidadForeignKey(this.productoordendetaprodu.getid_producto(),true,sFormularioTipoBusqueda);

			this.cargarCombosUnidadsForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ProductoOrdenDetaProduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProductoOrdenDetaProduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProductoOrdenDetaProduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean(); 
		this.productoordendetaproduConstantesFunciones=new ProductoOrdenDetaProduConstantesFunciones(); 
		this.productoordendetaproduBean=new ProductoOrdenDetaProdu();//(this.productoordendetaproduConstantesFunciones); 		
		this.productoordendetaproduReturnGeneral=new ProductoOrdenDetaProduParameterReturnGeneral(); 
		
		this.productoordendetaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.productoordendetaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProductoOrdenDetaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProductoOrdenDetaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProductoOrdenDetaProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProductoOrdenDetaProdu(true);
			
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
			
			this.productoordendetaproduConstantesFunciones=new ProductoOrdenDetaProduConstantesFunciones(); 
			this.productoordendetaproduBean=new ProductoOrdenDetaProdu();//this.productoordendetaproduConstantesFunciones); 			
			this.productoordendetaproduReturnGeneral=new ProductoOrdenDetaProduParameterReturnGeneral(); 
		
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Orden Producto Produccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.productoordendetaprodu=new ProductoOrdenDetaProdu();
			this.productoordendetaprodus = new ArrayList<ProductoOrdenDetaProdu>();
			this.productoordendetaprodusAux = new ArrayList<ProductoOrdenDetaProdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic=new ProductoOrdenDetaProduLogic();
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}
			
			//this.productoordendetaproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.productoordendetaproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProductoOrdenDetaProdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu);	
					}
					
					if(this.jInternalFrameImportacionProductoOrdenDetaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoOrdenDetaProdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProductoOrdenDetaProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProductoOrdenDetaProdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoOrdenDetaProdu);
				this.jInternalFrameDetalleFormProductoOrdenDetaProdu.setVisible(false);
				this.jInternalFrameDetalleFormProductoOrdenDetaProdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu);
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setVisible(false);
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProductoOrdenDetaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProductoOrdenDetaProdu);
					this.jInternalFrameImportacionProductoOrdenDetaProdu.setVisible(false);
					this.jInternalFrameImportacionProductoOrdenDetaProdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProductoOrdenDetaProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProductoOrdenDetaProdu);
					this.jInternalFrameOrderByProductoOrdenDetaProdu.setVisible(false);
					this.jInternalFrameOrderByProductoOrdenDetaProdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProductoOrdenDetaProduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProductoOrdenDetaProduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.productoordendetaproduReturnGeneral=new ProductoOrdenDetaProduParameterReturnGeneral();
			
			this.productoordendetaproduParameterGeneral=new ProductoOrdenDetaProduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.productoordendetaproduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProductoOrdenDetaProduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoOrdenDetaProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoordendetaproduSessionBean.getEsGuardarRelacionado(),this.productoordendetaproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProductoOrdenDetaProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.productoordendetaproduSessionBean.getEsGuardarRelacionado(),this.productoordendetaproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaDuplicarProductoOrdenDetaProdu=true;
			this.isVisibilidadCeldaCopiarProductoOrdenDetaProdu=true;
			this.isVisibilidadCeldaVerFormProductoOrdenDetaProdu=true;
			this.isVisibilidadCeldaOrdenProductoOrdenDetaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdOrdenDetaProdu=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdUnidadUnad=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProductoOrdenDetaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProductoOrdenDetaProdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProductoOrdenDetaProdu(false);
			
			this.setPermisosUsuarioProductoOrdenDetaProdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado() 
				|| (this.productoordendetaproduSessionBean.getEsGuardarRelacionado() && this.productoordendetaproduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProductoOrdenDetaProduClasesRelacionadas();
			}
			
			if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProductoOrdenDetaProduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProductoOrdenDetaProdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProductoOrdenDetaProdu();
			}
			
			if(!this.isPermisoBusquedaProductoOrdenDetaProdu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProductoOrdenDetaProdu,this.isPermisoPaginacionMedioProductoOrdenDetaProdu,this.isPermisoPaginacionTodoProductoOrdenDetaProdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProductoOrdenDetaProduConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProdu());
				
				this.tiposColumnasSelect=ProductoOrdenDetaProduConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProdu(true);
				
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
			//if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProductoOrdenDetaProdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioProductoOrdenDetaProdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioProductoOrdenDetaProdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProdu() ;
			
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
			
			this.ordendetaproduLogic=new OrdenDetaProduLogic();
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
				productoordendetaproduImplementable= (ProductoOrdenDetaProduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoOrdenDetaProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				productoordendetaproduImplementableHome= (ProductoOrdenDetaProduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProductoOrdenDetaProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.productoordendetaprodus= new ArrayList<ProductoOrdenDetaProdu>();
			this.productoordendetaprodusEliminados= new ArrayList<ProductoOrdenDetaProdu>();
						
			this.isEsNuevoProductoOrdenDetaProdu=false;
			this.esParaAccionDesdeFormularioProductoOrdenDetaProdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.ordendetaprodusForeignKey=new ArrayList<OrdenDetaProdu>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProductoOrdenDetaProdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProductoOrdenDetaProdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProductoOrdenDetaProduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProductoOrdenDetaProdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProductoOrdenDetaProdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProductoOrdenDetaProdu();
			}
			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProductoOrdenDetaProdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProductoOrdenDetaProdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProductoOrdenDetaProdu() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProductoOrdenDetaProdu")) {
				iIndex=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTabbedPaneRelacionesProductoOrdenDetaProdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTabbedPaneRelacionesProductoOrdenDetaProdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProductoOrdenDetaProdu();	
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
	
	public void cargarCombosForeignKeyProductoOrdenDetaProdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProductoOrdenDetaProdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProductoOrdenDetaProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProductoOrdenDetaProduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProductoOrdenDetaProdu();
		
		this.cargarCombosFrameForeignKeyProductoOrdenDetaProdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProductoOrdenDetaProdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProdu();
		}
	}
	
	

	public void cargarCombosForeignKeyOrdenDetaProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyOrdenDetaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
				this.cargarCombosFrameOrdenDetaProdusForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaOrdenDetaProdu(this.ordendetaprodusForeignKey);

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
	
	public void jButtonNuevoProductoOrdenDetaProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			
			
			if(jTableDatosProductoOrdenDetaProdu.getRowCount()>=1) {
				jTableDatosProductoOrdenDetaProdu.removeRowSelectionInterval(0, jTableDatosProductoOrdenDetaProdu.getRowCount()-1);						
			}
			
			this.isEsNuevoProductoOrdenDetaProdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProductoOrdenDetaProdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProductoOrdenDetaProdu(true);			
			//this.productoordendetaprodu=new ProductoOrdenDetaProdu();
			//this.productoordendetaprodu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProdu() ;
			
			if(ProductoOrdenDetaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoOrdenDetaProdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.productoordendetaprodu);	
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);				
			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			
			if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProductoOrdenDetaProdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProductoOrdenDetaProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProductoOrdenDetaProdu> productoordendetaprodusSeleccionados=new ArrayList<ProductoOrdenDetaProdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProdu.getSelectedRows().length;			
			}
			
			productoordendetaprodusSeleccionados=this.getProductoOrdenDetaProdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProductoOrdenDetaProdu--;			
				//ProductoOrdenDetaProdu productoordendetaproduAux= new ProductoOrdenDetaProdu();			
				//productoordendetaproduAux.setId(this.iIdNuevoProductoOrdenDetaProdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProductoOrdenDetaProdu productoordendetaproduOrigen=new ProductoOrdenDetaProdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProductoOrdenDetaProdu productoordendetaproduOrigen : productoordendetaprodusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							productoordendetaproduOrigen =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							productoordendetaproduOrigen =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProductoOrdenDetaProdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.productoordendetaprodu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProductoOrdenDetaProdu(productoordendetaproduOrigen,this.productoordendetaprodu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoordendetaproduLogic.getProductoOrdenDetaProdus().add(this.productoordendetaproduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodus.add(this.productoordendetaproduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(false);
				
				this.jTableDatosProductoOrdenDetaProdu.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProdu(), this.getIndiceNuevoProductoOrdenDetaProdu());
				
				int iLastRow =  this.jTableDatosProductoOrdenDetaProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoOrdenDetaProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoOrdenDetaProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProductoOrdenDetaProdu> productoordendetaprodusSeleccionados=new ArrayList<ProductoOrdenDetaProdu>();									
		
			ProductoOrdenDetaProdu productoordendetaproduOrigen=new ProductoOrdenDetaProdu();
			ProductoOrdenDetaProdu productoordendetaproduDestino=new ProductoOrdenDetaProdu();
				
			productoordendetaprodusSeleccionados=this.getProductoOrdenDetaProdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || productoordendetaprodusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProductoOrdenDetaProdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaproduOrigen =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoordendetaproduOrigen =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						productoordendetaproduDestino =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						productoordendetaproduDestino =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				productoordendetaproduOrigen =productoordendetaprodusSeleccionados.get(0);
				productoordendetaproduDestino =productoordendetaprodusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProductoOrdenDetaProdu(productoordendetaproduOrigen,productoordendetaproduDestino,true,false);
				
				productoordendetaproduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(productoordendetaproduDestino,productoordendetaproduLogic.getProductoOrdenDetaProdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(productoordendetaproduDestino,productoordendetaprodus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(false);
				
				//this.jTableDatosProductoOrdenDetaProdu.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProdu(), this.getIndiceNuevoProductoOrdenDetaProdu());
				
				int iLastRow =  this.jTableDatosProductoOrdenDetaProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProductoOrdenDetaProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProductoOrdenDetaProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProductoOrdenDetaProdu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProductoOrdenDetaProdu.setVisible(!isVisible);
			this.jPanelPaginacionProductoOrdenDetaProdu.setVisible(!isVisible);
			this.jPanelAccionesProductoOrdenDetaProdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProductoOrdenDetaProdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProductoOrdenDetaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProductoOrdenDetaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProductoOrdenDetaProdu();
			
			this.abrirFrameOrderByProductoOrdenDetaProdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProductoOrdenDetaProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProductoOrdenDetaProdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoOrdenDetaProdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.isMaximum()) {
					this.jInternalFrameDetalleFormProductoOrdenDetaProdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.setSize(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.iWidthFormulario,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProductoOrdenDetaProdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProductoOrdenDetaProdu.isMaximum()) {
						this.jInternalFrameDetalleFormProductoOrdenDetaProdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jContentPaneDetalleProductoOrdenDetaProdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTabbedPaneRelacionesProductoOrdenDetaProdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jContentPaneDetalleProductoOrdenDetaProdu.getWidth(),ProductoOrdenDetaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTabbedPaneRelacionesProductoOrdenDetaProdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jContentPaneDetalleProductoOrdenDetaProdu.getWidth(),ProductoOrdenDetaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTabbedPaneRelacionesProductoOrdenDetaProdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jContentPaneDetalleProductoOrdenDetaProdu.getWidth(),ProductoOrdenDetaProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProductoOrdenDetaProdu.setVisible(true);
	        this.jInternalFrameDetalleFormProductoOrdenDetaProdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProductoOrdenDetaProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProductoOrdenDetaProdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProductoOrdenDetaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProdu,false,this);
				} else {
					this.jInternalFrameOrderByProductoOrdenDetaProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProductoOrdenDetaProdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProductoOrdenDetaProdu);
				this.jInternalFrameOrderByProductoOrdenDetaProdu.setVisible(false);
				this.jInternalFrameOrderByProductoOrdenDetaProdu.setSelected(false);
				
				this.jInternalFrameOrderByProductoOrdenDetaProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoOrdenDetaProdu"));
				
				this.inicializarActualizarBindingTablaOrderByProductoOrdenDetaProdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProductoOrdenDetaProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProductoOrdenDetaProdu==null) {
				
				this.jInternalFrameImportacionProductoOrdenDetaProdu=new ImportacionJInternalFrame(ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProductoOrdenDetaProdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProductoOrdenDetaProdu);
				this.jInternalFrameImportacionProductoOrdenDetaProdu.setVisible(false);
				this.jInternalFrameImportacionProductoOrdenDetaProdu.setSelected(false);


				this.jInternalFrameImportacionProductoOrdenDetaProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoOrdenDetaProdu"));
				this.jInternalFrameImportacionProductoOrdenDetaProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoOrdenDetaProdu"));
				this.jInternalFrameImportacionProductoOrdenDetaProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoOrdenDetaProdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProductoOrdenDetaProdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu==null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu=new ReporteDinamicoJInternalFrame(ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu);
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setVisible(false);
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoOrdenDetaProdu"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoOrdenDetaProdu"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoOrdenDetaProdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoOrdenDetaProdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProductoOrdenDetaProdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProductoOrdenDetaProdu);
			
	       	this.jInternalFrameDetalleFormProductoOrdenDetaProdu.setVisible(false);
	        this.jInternalFrameDetalleFormProductoOrdenDetaProdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormProductoOrdenDetaProdu.dispose();
			//this.jInternalFrameDetalleFormProductoOrdenDetaProdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProductoOrdenDetaProdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProductoOrdenDetaProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProductoOrdenDetaProdu.setVisible(true);
	        this.jInternalFrameImportacionProductoOrdenDetaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProductoOrdenDetaProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProductoOrdenDetaProdu.setVisible(true);
	        this.jInternalFrameOrderByProductoOrdenDetaProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProductoOrdenDetaProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProductoOrdenDetaProdu.setVisible(false);
	        this.jInternalFrameOrderByProductoOrdenDetaProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProductoOrdenDetaProdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProductoOrdenDetaProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProductoOrdenDetaProdu.setVisible(false);
	        this.jInternalFrameImportacionProductoOrdenDetaProdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProductoOrdenDetaProdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProductoOrdenDetaProdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProductoOrdenDetaProdu(true);
			//this.isEsNuevoProductoOrdenDetaProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProductoOrdenDetaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProdu(false) ;
			
			if(productoordendetaproduSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProductoOrdenDetaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoOrdenDetaProdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProductoOrdenDetaProduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProductoOrdenDetaProdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProductoOrdenDetaProdu(true);
			//this.isEsNuevoProductoOrdenDetaProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.productoordendetaprodu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProductoOrdenDetaProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProdu(false) ;
			
			if(ProductoOrdenDetaProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProductoOrdenDetaProdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.productoordendetaproduConstantesFunciones.cargarid_productoProductoOrdenDetaProdu) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaOrdenDetaProdu(List<OrdenDetaProdu> ordendetaprodusForeignKey)throws Exception{
		TableColumn tableColumnOrdenDetaProdu=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU));
		TableCellEditor tableCellEditorOrdenDetaProdu =tableColumnOrdenDetaProdu.getCellEditor();

		OrdenDetaProduTableCell ordendetaproduTableCellFk=(OrdenDetaProduTableCell)tableCellEditorOrdenDetaProdu;

		if(ordendetaproduTableCellFk!=null) {
			ordendetaproduTableCellFk.setordendetaprodusForeignKey(ordendetaprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ordendetaproduTableCellFk.setRowActual(intSelectedRow);
			//ordendetaproduTableCellFk.setordendetaprodusForeignKeyActual(ordendetaprodusForeignKey);
		//}


		if(ordendetaproduTableCellFk!=null) {
			ordendetaproduTableCellFk.RecargarOrdenDetaProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

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
		TableColumn tableColumnUnidad=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

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
	
	public void jButtonActualizarProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProductoOrdenDetaProdu(false);
			
			//if(!this.isEsNuevoProductoOrdenDetaProdu) {								
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
				
			}
			
			if(this.permiteMantenimiento(this.productoordendetaprodu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProductoOrdenDetaProdu=true;
					this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(false);
					this.isEsNuevoProductoOrdenDetaProdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProductoOrdenDetaProdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProductoOrdenDetaProdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoOrdenDetaProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProdu(false);
				
				this.habilitarDeshabilitarControlesProductoOrdenDetaProdu(false);
			
												
				
				if(ProductoOrdenDetaProduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProductoOrdenDetaProdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,productoordendetaproduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProductoOrdenDetaProdu(this.productoordendetaprodu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProductoOrdenDetaProdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,productoordendetaproduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.productoordendetaprodu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				this.productoordendetaprodu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				this.productoordendetaprodu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.productoordendetaprodu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProductoOrdenDetaProduModel) this.jTableDatosProductoOrdenDetaProdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProductoOrdenDetaProdu=true;
				this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(false);
				this.isEsNuevoProductoOrdenDetaProdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProductoOrdenDetaProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProdu(false);
				
				this.habilitarDeshabilitarControlesProductoOrdenDetaProdu(false);
				
				
				
				if(ProductoOrdenDetaProduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProductoOrdenDetaProdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProductoOrdenDetaProdu.getRowCount()>=1) {
				jTableDatosProductoOrdenDetaProdu.removeRowSelectionInterval(0, jTableDatosProductoOrdenDetaProdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProductoOrdenDetaProdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProductoOrdenDetaProdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProdu(false) ;
			
			this.isEsNuevoProductoOrdenDetaProdu=false;
			
			if(ProductoOrdenDetaProduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProductoOrdenDetaProdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
				
				//SI ES MANUAL
				if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProductoOrdenDetaProdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProductoOrdenDetaProdu--;			
			//ProductoOrdenDetaProdu productoordendetaproduAux= new ProductoOrdenDetaProdu();			
			//productoordendetaproduAux.setId(this.iIdNuevoProductoOrdenDetaProdu);
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProductoOrdenDetaProdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
			
			this.productoordendetaprodu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.productoordendetaproduLogic.getProductoOrdenDetaProdus().add(this.productoordendetaproduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.productoordendetaprodus.add(this.productoordendetaproduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(false);
			
			this.jTableDatosProductoOrdenDetaProdu.setRowSelectionInterval(this.getIndiceNuevoProductoOrdenDetaProdu(), this.getIndiceNuevoProductoOrdenDetaProdu());
			
			int iLastRow =  this.jTableDatosProductoOrdenDetaProdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProductoOrdenDetaProdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProductoOrdenDetaProdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoOrdenDetaProdu();
			}
			
			//this.abrirFrameTreeProductoOrdenDetaProdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Orden Producto ProduccionES ?", "MANTENIMIENTO DE Orden Producto Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProductoOrdenDetaProdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProductoOrdenDetaProdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.productoordendetaproduReturnGeneral=productoordendetaproduLogic.procesarImportacionProductoOrdenDetaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.productoordendetaproduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProductoOrdenDetaProduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProductoOrdenDetaProdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProductoOrdenDetaProdu.setFileImportacion(this.jInternalFrameImportacionProductoOrdenDetaProdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProductoOrdenDetaProdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProductoOrdenDetaProdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProductoOrdenDetaProdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProductoOrdenDetaProdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProductoOrdenDetaProdu> productoordendetaprodusSeleccionados=new ArrayList<ProductoOrdenDetaProdu>();		

		productoordendetaprodusSeleccionados=this.getProductoOrdenDetaProdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProductoOrdenDetaProduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProductoOrdenDetaProduBaseDesign.jrxml";
			
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
			
			this.generarReporteProductoOrdenDetaProdus("Todos",productoordendetaprodusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Producto Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_OrdenDetaProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_OrdenDetaProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_OrdenDetaProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_OrdenDetaProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU:
					sNombreCampoCategoria="id_orden_deta_produ";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU:
					sNombreCampoCategoriaValor="id_orden_deta_produ";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Orden Deta Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_orden_deta_produ");
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProductoOrdenDetaProdu> productoordendetaprodusSeleccionados=new ArrayList<ProductoOrdenDetaProdu>();		
		
		productoordendetaprodusSeleccionados=this.getProductoOrdenDetaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProductoOrdenDetaProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU);
					iRow++;

					for(ProductoOrdenDetaProdu productoordendetaprodu:productoordendetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodu.getordendetaprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProductoOrdenDetaProdu productoordendetaprodu:productoordendetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodu.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProductoOrdenDetaProdu productoordendetaprodu:productoordendetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodu.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(ProductoOrdenDetaProdu productoordendetaprodu:productoordendetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodu.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(ProductoOrdenDetaProdu productoordendetaprodu:productoordendetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodu.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(ProductoOrdenDetaProdu productoordendetaprodu:productoordendetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodu.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(ProductoOrdenDetaProdu productoordendetaprodu:productoordendetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodu.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(ProductoOrdenDetaProdu productoordendetaprodu:productoordendetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodu.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ProductoOrdenDetaProdu productoordendetaprodu:productoordendetaprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(productoordendetaprodu.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelProductoOrdenDetaProdu(row);				
			//	iRow++;
			//}				
			
			//for(ProductoOrdenDetaProdu productoordendetaproduAux:productoordendetaprodusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProductoOrdenDetaProdu(productoordendetaproduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Producto Produccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProductoOrdenDetaProdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoOrdenDetaProdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
			
			//SI ES MANUAL
			if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProductoOrdenDetaProdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProductoOrdenDetaProdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProductoOrdenDetaProdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProductoOrdenDetaProdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProductoOrdenDetaProdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProductoOrdenDetaProdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProductoOrdenDetaProdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosProductoOrdenDetaProdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosProductoOrdenDetaProdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProductoOrdenDetaProdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProductoOrdenDetaProdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProductoOrdenDetaProdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProductoOrdenDetaProdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProductoOrdenDetaProdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProductoOrdenDetaProdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProductoOrdenDetaProdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProductoOrdenDetaProdu();
		
		this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProductoOrdenDetaProdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProductoOrdenDetaProdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProductoOrdenDetaProdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProductoOrdenDetaProdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProductoOrdenDetaProdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jCheckBoxPostAccionNuevoProductoOrdenDetaProdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProductoOrdenDetaProdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProductoOrdenDetaProdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jCheckBoxPostAccionNuevoProductoOrdenDetaProdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jCheckBoxPostAccionSinCerrarProductoOrdenDetaProdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jCheckBoxPostAccionSinMensajeProductoOrdenDetaProdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProductoOrdenDetaProdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProductoOrdenDetaProdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProductoOrdenDetaProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProductoOrdenDetaProdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProductoOrdenDetaProdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProductoOrdenDetaProdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProductoOrdenDetaProdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProductoOrdenDetaProdu(Boolean esInicializar) throws Exception {
		try	{	
			if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProductoOrdenDetaProdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProductoOrdenDetaProdu() throws Exception {
		try	{
			if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoOrdenDetaProdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoOrdenDetaProdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProductoOrdenDetaProdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProductoOrdenDetaProdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProductoOrdenDetaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProductoOrdenDetaProdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProductoOrdenDetaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProductoOrdenDetaProdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProductoOrdenDetaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProductoOrdenDetaProdu.addItem(reporte);
			}
			
			
			if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProductoOrdenDetaProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProductoOrdenDetaProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProductoOrdenDetaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProductoOrdenDetaProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProductoOrdenDetaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProductoOrdenDetaProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoOrdenDetaProdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProductoOrdenDetaProdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu!=null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu!=null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProductoOrdenDetaProduConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProdu(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProductoOrdenDetaProduConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProdu(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProductoOrdenDetaProduConstantesFunciones.getTiposSeleccionarProductoOrdenDetaProdu(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProductoOrdenDetaProdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.getSelectedItem()!=null){this.id_orden_deta_produFK_IdOrdenDetaProdu=((OrdenDetaProdu)this.jComboBoxid_orden_deta_produFK_IdOrdenDetaProduProductoOrdenDetaProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.getSelectedItem()!=null){this.id_unidadFK_IdUnidadUnad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadUnadProductoOrdenDetaProdu.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProductoOrdenDetaProdu(Boolean esInicializar) throws Exception {				
		if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProductoOrdenDetaProdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProductoOrdenDetaProdu() throws Exception {
		this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProductoOrdenDetaProdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProductoOrdenDetaProdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProductoOrdenDetaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoOrdenDetaProdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProductoOrdenDetaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoOrdenDetaProdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProductoOrdenDetaProduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProductoOrdenDetaProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProductoOrdenDetaProdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProductoOrdenDetaProdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProductoOrdenDetaProdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=productoordendetaproduLogic.getProductoOrdenDetaProdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=productoordendetaprodus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProductoOrdenDetaProdu.setModel(new ProductoOrdenDetaProduModel(this.productoordendetaproduLogic.getProductoOrdenDetaProdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProductoOrdenDetaProdu.setModel(new ProductoOrdenDetaProduModel(this.productoordendetaprodus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProductoOrdenDetaProdu!=null && this.jInternalFrameOrderByProductoOrdenDetaProdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProductoOrdenDetaProdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO,productoordendetaproduConstantesFunciones.resaltarSeleccionarProductoOrdenDetaProdu,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProductoOrdenDetaProduConstantesFunciones.SCLASSWEBTITULO,productoordendetaproduConstantesFunciones.resaltarSeleccionarProductoOrdenDetaProdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,ProductoOrdenDetaProduConstantesFunciones.LABEL_ID));

		if(this.productoordendetaproduConstantesFunciones.mostraridProductoOrdenDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaproduConstantesFunciones.resaltaridProductoOrdenDetaProdu,this.productoordendetaproduConstantesFunciones.activaridProductoOrdenDetaProdu,iSizeTabla,this,true,"idProductoOrdenDetaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaproduConstantesFunciones.resaltaridProductoOrdenDetaProdu,this.productoordendetaproduConstantesFunciones.activaridProductoOrdenDetaProdu,this,true,"idProductoOrdenDetaProdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU));

		if(this.productoordendetaproduConstantesFunciones.mostrarid_orden_deta_produProductoOrdenDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new OrdenDetaProduTableCell(this.ordendetaprodusForeignKey,this.productoordendetaproduConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProdu,this,this.productoordendetaproduConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProdu,iSizeTabla));
			tableColumn.setCellEditor(new OrdenDetaProduTableCell(this.ordendetaprodusForeignKey,this.productoordendetaproduConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProdu,this,this.productoordendetaproduConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProdu,true,"id_orden_deta_produProductoOrdenDetaProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA));

		if(this.productoordendetaproduConstantesFunciones.mostrarid_bodegaProductoOrdenDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.productoordendetaproduConstantesFunciones.resaltarid_bodegaProductoOrdenDetaProdu,this,this.productoordendetaproduConstantesFunciones.activarid_bodegaProductoOrdenDetaProdu,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.productoordendetaproduConstantesFunciones.resaltarid_bodegaProductoOrdenDetaProdu,this,this.productoordendetaproduConstantesFunciones.activarid_bodegaProductoOrdenDetaProdu,true,"id_bodegaProductoOrdenDetaProdu","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.productoordendetaproduConstantesFunciones.mostrarid_productoProductoOrdenDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.productoordendetaproduConstantesFunciones.resaltarid_productoProductoOrdenDetaProdu,this,this.productoordendetaproduConstantesFunciones.activarid_productoProductoOrdenDetaProdu,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.productoordendetaproduConstantesFunciones.resaltarid_productoProductoOrdenDetaProdu,this,this.productoordendetaproduConstantesFunciones.activarid_productoProductoOrdenDetaProdu,true,"id_productoProductoOrdenDetaProdu","CON_BUSQUEDA-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD));

		if(this.productoordendetaproduConstantesFunciones.mostrarid_unidadProductoOrdenDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.productoordendetaproduConstantesFunciones.resaltarid_unidadProductoOrdenDetaProdu,this,this.productoordendetaproduConstantesFunciones.activarid_unidadProductoOrdenDetaProdu,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.productoordendetaproduConstantesFunciones.resaltarid_unidadProductoOrdenDetaProdu,this,this.productoordendetaproduConstantesFunciones.activarid_unidadProductoOrdenDetaProdu,true,"id_unidadProductoOrdenDetaProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE));

		if(this.productoordendetaproduConstantesFunciones.mostrarporcentajeProductoOrdenDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaproduConstantesFunciones.resaltarporcentajeProductoOrdenDetaProdu,this.productoordendetaproduConstantesFunciones.activarporcentajeProductoOrdenDetaProdu,iSizeTabla,this,true,"porcentajeProductoOrdenDetaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaproduConstantesFunciones.resaltarporcentajeProductoOrdenDetaProdu,this.productoordendetaproduConstantesFunciones.activarporcentajeProductoOrdenDetaProdu,this,true,"porcentajeProductoOrdenDetaProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD));

		if(this.productoordendetaproduConstantesFunciones.mostrarcantidadProductoOrdenDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaproduConstantesFunciones.resaltarcantidadProductoOrdenDetaProdu,this.productoordendetaproduConstantesFunciones.activarcantidadProductoOrdenDetaProdu,iSizeTabla,this,true,"cantidadProductoOrdenDetaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaproduConstantesFunciones.resaltarcantidadProductoOrdenDetaProdu,this.productoordendetaproduConstantesFunciones.activarcantidadProductoOrdenDetaProdu,this,true,"cantidadProductoOrdenDetaProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO));

		if(this.productoordendetaproduConstantesFunciones.mostrarcostoProductoOrdenDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaproduConstantesFunciones.resaltarcostoProductoOrdenDetaProdu,this.productoordendetaproduConstantesFunciones.activarcostoProductoOrdenDetaProdu,iSizeTabla,this,true,"costoProductoOrdenDetaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaproduConstantesFunciones.resaltarcostoProductoOrdenDetaProdu,this.productoordendetaproduConstantesFunciones.activarcostoProductoOrdenDetaProdu,this,true,"costoProductoOrdenDetaProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.productoordendetaproduConstantesFunciones.mostrarcosto_totalProductoOrdenDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.productoordendetaproduConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProdu,this.productoordendetaproduConstantesFunciones.activarcosto_totalProductoOrdenDetaProdu,iSizeTabla,this,true,"costo_totalProductoOrdenDetaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaproduConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProdu,this.productoordendetaproduConstantesFunciones.activarcosto_totalProductoOrdenDetaProdu,this,true,"costo_totalProductoOrdenDetaProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION));

		if(this.productoordendetaproduConstantesFunciones.mostrardescripcionProductoOrdenDetaProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.productoordendetaproduConstantesFunciones.resaltardescripcionProductoOrdenDetaProdu,this.productoordendetaproduConstantesFunciones.activardescripcionProductoOrdenDetaProdu,iSizeTabla,this,true,"descripcionProductoOrdenDetaProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.productoordendetaproduConstantesFunciones.resaltardescripcionProductoOrdenDetaProdu,this.productoordendetaproduConstantesFunciones.activardescripcionProductoOrdenDetaProdu,this,true,"descripcionProductoOrdenDetaProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProductoOrdenDetaProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoordendetaproduSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoordendetaproduSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoOrdenDetaProdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.productoordendetaproduSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.productoordendetaproduSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProductoOrdenDetaProdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProductoOrdenDetaProdu && this.isPermisoGuardarCambiosProductoOrdenDetaProdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.productoordendetaproduSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.productoordendetaproduSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProductoOrdenDetaProdu.addColumn(tableColumn);
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
			
			this.jTableDatosProductoOrdenDetaProdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoOrdenDetaProdu && this.isPermisoGuardarCambiosProductoOrdenDetaProdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProductoOrdenDetaProdu && this.isPermisoGuardarCambiosProductoOrdenDetaProdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProductoOrdenDetaProdu.moveColumn(this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProductoOrdenDetaProdu.moveColumn(this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProductoOrdenDetaProdu.moveColumn(this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProductoOrdenDetaProdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProductoOrdenDetaProdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProductoOrdenDetaProdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProductoOrdenDetaProdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProductoOrdenDetaProdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProductoOrdenDetaProdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=productoordendetaproduLogic.getProductoOrdenDetaProdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=productoordendetaprodus.size()-1;
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
		//this.jTableDatosProductoOrdenDetaProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProductoOrdenDetaProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProductoOrdenDetaProdu();
			
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
				
				//this.isEsNuevoProductoOrdenDetaProdu=false;
					
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			
				if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoOrdenDetaProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.productoordendetaprodu.getsType().equals("DUPLICADO")
				   || this.productoordendetaprodu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProductoOrdenDetaProdu=true;
				
				} else {
					this.isEsNuevoProductoOrdenDetaProdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
					if(this.productoordendetaprodu.getId()>=0 && !this.productoordendetaprodu.getIsNew()) {						
						this.isEsNuevoProductoOrdenDetaProdu=false;
						
					} else {
						this.isEsNuevoProductoOrdenDetaProdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProductoOrdenDetaProdu(esRelaciones);						
				
				this.seleccionarProductoOrdenDetaProdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.productoordendetaprodu.getId()<0) {
					this.isEsNuevoProductoOrdenDetaProdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProductoOrdenDetaProdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProductoOrdenDetaProdu(evt,rowIndex);
				}	
				
				if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProductoOrdenDetaProdu: " + this.dDif); 
					}
				}								
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProductoOrdenDetaProdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.productoordendetaprodu)) {
					if(this.productoordendetaprodu.getId()>0) {
						this.productoordendetaprodu.setIsDeleted(true);
						
						this.productoordendetaprodusEliminados.add(this.productoordendetaprodu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.productoordendetaproduLogic.getProductoOrdenDetaProdus().remove(this.productoordendetaprodu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodus.remove(this.productoordendetaprodu);				
					}
					
					
					((ProductoOrdenDetaProduModel) this.jTableDatosProductoOrdenDetaProdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProductoOrdenDetaProdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProductoOrdenDetaProdu) {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProductoOrdenDetaProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProductoOrdenDetaProdu(this.productoordendetaprodu);
				}
				
				//ARCHITECTURE
				try {
					

					//OrdenDetaProdu
					if(!this.productoordendetaproduConstantesFunciones.cargarid_orden_deta_produProductoOrdenDetaProdu || this.productoordendetaproduConstantesFunciones.event_dependid_orden_deta_produProductoOrdenDetaProdu) {
						//this.cargarCombosOrdenDetaProdusForeignKeyLista(" where id="+this.productoordendetaprodu.getid_orden_deta_produ());
									//this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);
						this.ordendetaprodusForeignKey=new ArrayList<OrdenDetaProdu>();

						if(productoordendetaprodu.getOrdenDetaProdu()!=null) {
							this.ordendetaprodusForeignKey.add(productoordendetaprodu.getOrdenDetaProdu());
						}

						this.addItemDefectoCombosForeignKeyOrdenDetaProdu();
						this.cargarCombosFrameOrdenDetaProdusForeignKey("Todos");
					}
					this.setActualOrdenDetaProduForeignKey(this.productoordendetaprodu.getid_orden_deta_produ(),false,"Formulario");

					//Bodega
					if(!this.productoordendetaproduConstantesFunciones.cargarid_bodegaProductoOrdenDetaProdu || this.productoordendetaproduConstantesFunciones.event_dependid_bodegaProductoOrdenDetaProdu) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.productoordendetaprodu.getid_bodega());
									//this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(productoordendetaprodu.getBodega()!=null) {
							this.bodegasForeignKey.add(productoordendetaprodu.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.productoordendetaprodu.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.productoordendetaproduConstantesFunciones.cargarid_productoProductoOrdenDetaProdu || this.productoordendetaproduConstantesFunciones.event_dependid_productoProductoOrdenDetaProdu) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.productoordendetaprodu.getid_producto());
									//this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(productoordendetaprodu.getProducto()!=null) {
							this.productosForeignKey.add(productoordendetaprodu.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.productoordendetaprodu.getid_producto(),false,"Formulario");

					//Unidad
					if(!this.productoordendetaproduConstantesFunciones.cargarid_unidadProductoOrdenDetaProdu || this.productoordendetaproduConstantesFunciones.event_dependid_unidadProductoOrdenDetaProdu) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.productoordendetaprodu.getid_unidad());
									//this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(productoordendetaprodu.getUnidad()!=null) {
							this.unidadsForeignKey.add(productoordendetaprodu.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.productoordendetaprodu.getid_unidad(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProductoOrdenDetaProdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProductoOrdenDetaProdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProductoOrdenDetaProdu(productoordendetaprodu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProductoOrdenDetaProdu(productoordendetaprodu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProductoOrdenDetaProdu(productoordendetaprodu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProdu(productoordendetaprodu);
	}
	
	public void setVariablesObjetoActualToFormularioProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelidProductoOrdenDetaProdu.setText(productoordendetaprodu.getId().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldporcentajeProductoOrdenDetaProdu.setText(productoordendetaprodu.getporcentaje().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcantidadProductoOrdenDetaProdu.setText(productoordendetaprodu.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcostoProductoOrdenDetaProdu.setText(productoordendetaprodu.getcosto().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcosto_totalProductoOrdenDetaProdu.setText(productoordendetaprodu.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextAreadescripcionProductoOrdenDetaProdu.setText(productoordendetaprodu.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProductoOrdenDetaProdu productoordendetaproduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,productoordendetaproduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProductoOrdenDetaProdu productoordendetaproduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				productoordendetaproduLocal=this.productoordendetaprodu;
			} else {
				productoordendetaproduLocal=this.productoordendetaproduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(productoordendetaproduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProductoOrdenDetaProdu(productoordendetaproduLocal,true);
					
					if(productoordendetaproduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(productoordendetaproduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(productoordendetaproduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(productoordendetaprodu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(productoordendetaprodu);
	}
	
	public void setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(productoordendetaprodu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelidProductoOrdenDetaProdu.getText()==null || this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelidProductoOrdenDetaProdu.getText()=="" || this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelidProductoOrdenDetaProdu.getText()=="Id") {
				this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelidProductoOrdenDetaProdu.setText("0");
			}

			if(conColumnasBase) {productoordendetaprodu.setId(Long.parseLong(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelidProductoOrdenDetaProdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelIdProductoOrdenDetaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodu.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldporcentajeProductoOrdenDetaProdu.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelporcentajeProductoOrdenDetaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodu.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcantidadProductoOrdenDetaProdu.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelcantidadProductoOrdenDetaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodu.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcostoProductoOrdenDetaProdu.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelcostoProductoOrdenDetaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodu.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcosto_totalProductoOrdenDetaProdu.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelcosto_totalProductoOrdenDetaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			productoordendetaprodu.setdescripcion(this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextAreadescripcionProductoOrdenDetaProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabeldescripcionProductoOrdenDetaProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaproduBean,ProductoOrdenDetaProdu productoordendetaprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && productoordendetaproduBean.getid_orden_deta_produ()!=null && !productoordendetaproduBean.getid_orden_deta_produ().equals(-1L))) {productoordendetaprodu.setid_orden_deta_produ(productoordendetaproduBean.getid_orden_deta_produ());}
			if(conDefault || (!conDefault && productoordendetaproduBean.getid_bodega()!=null && !productoordendetaproduBean.getid_bodega().equals(-1L))) {productoordendetaprodu.setid_bodega(productoordendetaproduBean.getid_bodega());}
			if(conDefault || (!conDefault && productoordendetaproduBean.getid_producto()!=null && !productoordendetaproduBean.getid_producto().equals(-1L))) {productoordendetaprodu.setid_producto(productoordendetaproduBean.getid_producto());}
			if(conDefault || (!conDefault && productoordendetaproduBean.getid_unidad()!=null && !productoordendetaproduBean.getid_unidad().equals(-1L))) {productoordendetaprodu.setid_unidad(productoordendetaproduBean.getid_unidad());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaproduOrigen,ProductoOrdenDetaProdu productoordendetaprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoordendetaproduOrigen.getId()!=null && !productoordendetaproduOrigen.getId().equals(0L))) {productoordendetaprodu.setId(productoordendetaproduOrigen.getId());}}
			if(conDefault || (!conDefault && productoordendetaproduOrigen.getid_orden_deta_produ()!=null && !productoordendetaproduOrigen.getid_orden_deta_produ().equals(-1L))) {productoordendetaprodu.setid_orden_deta_produ(productoordendetaproduOrigen.getid_orden_deta_produ());}
			if(conDefault || (!conDefault && productoordendetaproduOrigen.getid_bodega()!=null && !productoordendetaproduOrigen.getid_bodega().equals(-1L))) {productoordendetaprodu.setid_bodega(productoordendetaproduOrigen.getid_bodega());}
			if(conDefault || (!conDefault && productoordendetaproduOrigen.getid_producto()!=null && !productoordendetaproduOrigen.getid_producto().equals(-1L))) {productoordendetaprodu.setid_producto(productoordendetaproduOrigen.getid_producto());}
			if(conDefault || (!conDefault && productoordendetaproduOrigen.getid_unidad()!=null && !productoordendetaproduOrigen.getid_unidad().equals(-1L))) {productoordendetaprodu.setid_unidad(productoordendetaproduOrigen.getid_unidad());}
			if(conDefault || (!conDefault && productoordendetaproduOrigen.getporcentaje()!=null && !productoordendetaproduOrigen.getporcentaje().equals(0.0))) {productoordendetaprodu.setporcentaje(productoordendetaproduOrigen.getporcentaje());}
			if(conDefault || (!conDefault && productoordendetaproduOrigen.getcantidad()!=null && !productoordendetaproduOrigen.getcantidad().equals(0))) {productoordendetaprodu.setcantidad(productoordendetaproduOrigen.getcantidad());}
			if(conDefault || (!conDefault && productoordendetaproduOrigen.getcosto()!=null && !productoordendetaproduOrigen.getcosto().equals(0.0))) {productoordendetaprodu.setcosto(productoordendetaproduOrigen.getcosto());}
			if(conDefault || (!conDefault && productoordendetaproduOrigen.getcosto_total()!=null && !productoordendetaproduOrigen.getcosto_total().equals(0.0))) {productoordendetaprodu.setcosto_total(productoordendetaproduOrigen.getcosto_total());}
			if(conDefault || (!conDefault && productoordendetaproduOrigen.getdescripcion()!=null && !productoordendetaproduOrigen.getdescripcion().equals(""))) {productoordendetaprodu.setdescripcion(productoordendetaproduOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelidProductoOrdenDetaProdu.setText(productoordendetaprodu.getId().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldporcentajeProductoOrdenDetaProdu.setText(productoordendetaprodu.getporcentaje().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcantidadProductoOrdenDetaProdu.setText(productoordendetaprodu.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcostoProductoOrdenDetaProdu.setText(productoordendetaprodu.getcosto().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcosto_totalProductoOrdenDetaProdu.setText(productoordendetaprodu.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextAreadescripcionProductoOrdenDetaProdu.setText(productoordendetaprodu.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProductoOrdenDetaProdu(ProductoOrdenDetaProduBean productoordendetaproduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelidProductoOrdenDetaProdu.setText(productoordendetaproduBean.getId().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldporcentajeProductoOrdenDetaProdu.setText(productoordendetaproduBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcantidadProductoOrdenDetaProdu.setText(productoordendetaproduBean.getcantidad().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcostoProductoOrdenDetaProdu.setText(productoordendetaproduBean.getcosto().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcosto_totalProductoOrdenDetaProdu.setText(productoordendetaproduBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextAreadescripcionProductoOrdenDetaProdu.setText(productoordendetaproduBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProductoOrdenDetaProdu(ProductoOrdenDetaProduParameterReturnGeneral productoordendetaproduReturnGeneral,ProductoOrdenDetaProduBean productoordendetaproduBean,Boolean conDefault) throws Exception { 
		try {
			ProductoOrdenDetaProdu productoordendetaproduLocal=new ProductoOrdenDetaProdu();
			
			productoordendetaproduLocal=productoordendetaproduReturnGeneral.getProductoOrdenDetaProdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && productoordendetaproduLocal.getId()!=null && !productoordendetaproduLocal.getId().equals(0L))) {productoordendetaproduBean.setId(productoordendetaproduLocal.getId());}}
			if(conDefault || (!conDefault && productoordendetaproduLocal.getid_orden_deta_produ()!=null && !productoordendetaproduLocal.getid_orden_deta_produ().equals(-1L))) {productoordendetaproduBean.setid_orden_deta_produ(productoordendetaproduLocal.getid_orden_deta_produ());}
			if(conDefault || (!conDefault && productoordendetaproduLocal.getid_bodega()!=null && !productoordendetaproduLocal.getid_bodega().equals(-1L))) {productoordendetaproduBean.setid_bodega(productoordendetaproduLocal.getid_bodega());}
			if(conDefault || (!conDefault && productoordendetaproduLocal.getid_producto()!=null && !productoordendetaproduLocal.getid_producto().equals(-1L))) {productoordendetaproduBean.setid_producto(productoordendetaproduLocal.getid_producto());}
			if(conDefault || (!conDefault && productoordendetaproduLocal.getid_unidad()!=null && !productoordendetaproduLocal.getid_unidad().equals(-1L))) {productoordendetaproduBean.setid_unidad(productoordendetaproduLocal.getid_unidad());}
			if(conDefault || (!conDefault && productoordendetaproduLocal.getporcentaje()!=null && !productoordendetaproduLocal.getporcentaje().equals(0.0))) {productoordendetaproduBean.setporcentaje(productoordendetaproduLocal.getporcentaje());}
			if(conDefault || (!conDefault && productoordendetaproduLocal.getcantidad()!=null && !productoordendetaproduLocal.getcantidad().equals(0))) {productoordendetaproduBean.setcantidad(productoordendetaproduLocal.getcantidad());}
			if(conDefault || (!conDefault && productoordendetaproduLocal.getcosto()!=null && !productoordendetaproduLocal.getcosto().equals(0.0))) {productoordendetaproduBean.setcosto(productoordendetaproduLocal.getcosto());}
			if(conDefault || (!conDefault && productoordendetaproduLocal.getcosto_total()!=null && !productoordendetaproduLocal.getcosto_total().equals(0.0))) {productoordendetaproduBean.setcosto_total(productoordendetaproduLocal.getcosto_total());}
			if(conDefault || (!conDefault && productoordendetaproduLocal.getdescripcion()!=null && !productoordendetaproduLocal.getdescripcion().equals(""))) {productoordendetaproduBean.setdescripcion(productoordendetaproduLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProductoOrdenDetaProduGenerico(Long idProductoOrdenDetaProduSeleccionado,JComboBox jComboBoxProductoOrdenDetaProdu,List<ProductoOrdenDetaProdu> productoordendetaprodusLocal)throws Exception {
		try {
			ProductoOrdenDetaProdu  productoordendetaproduTemp=null;

			for(ProductoOrdenDetaProdu productoordendetaproduAux:productoordendetaprodusLocal) {
				if(productoordendetaproduAux.getId()!=null && productoordendetaproduAux.getId().equals(idProductoOrdenDetaProduSeleccionado)) {
					productoordendetaproduTemp=productoordendetaproduAux;
					break;
				}
			}

			jComboBoxProductoOrdenDetaProdu.setSelectedItem(productoordendetaproduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProductoOrdenDetaProduGenerico(JComboBox jComboBoxProductoOrdenDetaProdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoOrdenDetaProdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProductoOrdenDetaProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProductoOrdenDetaProdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProductoOrdenDetaProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProductoOrdenDetaProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProductoOrdenDetaProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoordendetaprodu=(ProductoOrdenDetaProdu) productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoordendetaprodu =(ProductoOrdenDetaProdu) productoordendetaprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("OrdenDetaProdu")) {
			//sDescripcion=this.getActualOrdenDetaProduForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodu.getIsNew() && !productoordendetaprodu.getIsChanged() && !productoordendetaprodu.getIsDeleted()) {
				sDescripcion=productoordendetaprodu.getordendetaprodu_descripcion();
			} else {
				//sDescripcion=this.getActualOrdenDetaProduForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodu.getordendetaprodu_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodu.getIsNew() && !productoordendetaprodu.getIsChanged() && !productoordendetaprodu.getIsDeleted()) {
				sDescripcion=productoordendetaprodu.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=productoordendetaprodu.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodu.getIsNew() && !productoordendetaprodu.getIsChanged() && !productoordendetaprodu.getIsDeleted()) {
				sDescripcion=productoordendetaprodu.getproducto_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=productoordendetaprodu.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!productoordendetaprodu.getIsNew() && !productoordendetaprodu.getIsChanged() && !productoordendetaprodu.getIsDeleted()) {
				sDescripcion=productoordendetaprodu.getunidad_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=productoordendetaprodu.getunidad_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProductoOrdenDetaProdu productoordendetaproduRow=new ProductoOrdenDetaProdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoordendetaproduRow=(ProductoOrdenDetaProdu) productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			productoordendetaproduRow=(ProductoOrdenDetaProdu) productoordendetaprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProductoOrdenDetaProdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu && this.isPermisoNuevoProductoOrdenDetaProdu));			
			this.jButtonDuplicarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaDuplicarProductoOrdenDetaProdu && this.isPermisoDuplicarProductoOrdenDetaProdu));			
			this.jButtonCopiarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaCopiarProductoOrdenDetaProdu && this.isPermisoCopiarProductoOrdenDetaProdu));
			this.jButtonVerFormProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaVerFormProductoOrdenDetaProdu && this.isPermisoVerFormProductoOrdenDetaProdu));
			
			this.jButtonAbrirOrderByProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProdu && this.isPermisoOrdenProductoOrdenDetaProdu));			
			
			this.jButtonNuevoRelacionesProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu && this.isPermisoNuevoProductoOrdenDetaProdu));			
			this.jButtonNuevoGuardarCambiosProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu && this.isPermisoNuevoProductoOrdenDetaProdu && this.isPermisoGuardarCambiosProductoOrdenDetaProdu));
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonModificarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaModificarProductoOrdenDetaProdu && this.isPermisoActualizarProductoOrdenDetaProdu));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonActualizarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu && this.isPermisoActualizarProductoOrdenDetaProdu));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonEliminarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu && this.isPermisoEliminarProductoOrdenDetaProdu));
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonCancelarProductoOrdenDetaProdu.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu);							
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonGuardarCambiosProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu && this.isPermisoGuardarCambiosProductoOrdenDetaProdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu && this.isPermisoGuardarCambiosProductoOrdenDetaProdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu && this.isPermisoNuevoProductoOrdenDetaProdu));						
			this.jButtonDuplicarToolBarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaDuplicarProductoOrdenDetaProdu && this.isPermisoDuplicarProductoOrdenDetaProdu));						
			this.jButtonCopiarToolBarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaCopiarProductoOrdenDetaProdu && this.isPermisoCopiarProductoOrdenDetaProdu));			
			this.jButtonVerFormToolBarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaVerFormProductoOrdenDetaProdu && this.isPermisoVerFormProductoOrdenDetaProdu));			
			this.jButtonAbrirOrderByToolBarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProdu && this.isPermisoOrdenProductoOrdenDetaProdu));
			this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu && this.isPermisoNuevoProductoOrdenDetaProdu));			
			this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu && this.isPermisoNuevoProductoOrdenDetaProdu && this.isPermisoGuardarCambiosProductoOrdenDetaProdu));			
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonModificarToolBarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaModificarProductoOrdenDetaProdu && this.isPermisoActualizarProductoOrdenDetaProdu));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonActualizarToolBarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu  && this.isPermisoActualizarProductoOrdenDetaProdu));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonEliminarToolBarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu && this.isPermisoEliminarProductoOrdenDetaProdu));
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonCancelarToolBarProductoOrdenDetaProdu.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu);				
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonGuardarCambiosToolBarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu && this.isPermisoGuardarCambiosProductoOrdenDetaProdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu && this.isPermisoGuardarCambiosProductoOrdenDetaProdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu && this.isPermisoNuevoProductoOrdenDetaProdu));			
			this.jMenuItemDuplicarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaDuplicarProductoOrdenDetaProdu && this.isPermisoDuplicarProductoOrdenDetaProdu));			
			this.jMenuItemCopiarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaCopiarProductoOrdenDetaProdu && this.isPermisoCopiarProductoOrdenDetaProdu));			
			this.jMenuItemVerFormProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaVerFormProductoOrdenDetaProdu && this.isPermisoVerFormProductoOrdenDetaProdu));			
			this.jMenuItemAbrirOrderByProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProdu && this.isPermisoOrdenProductoOrdenDetaProdu));			
			//this.jMenuItemMostrarOcultarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProdu && this.isPermisoOrdenProductoOrdenDetaProdu));
			this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProdu && this.isPermisoOrdenProductoOrdenDetaProdu));			
			//this.jMenuItemDetalleMostrarOcultarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaOrdenProductoOrdenDetaProdu && this.isPermisoOrdenProductoOrdenDetaProdu));			
			this.jMenuItemNuevoRelacionesProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu && this.isPermisoNuevoProductoOrdenDetaProdu));			
			this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu && this.isPermisoNuevoProductoOrdenDetaProdu && this.isPermisoGuardarCambiosProductoOrdenDetaProdu));									
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemModificarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaModificarProductoOrdenDetaProdu && this.isPermisoActualizarProductoOrdenDetaProdu));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemActualizarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu && this.isPermisoActualizarProductoOrdenDetaProdu));	
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemEliminarProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu && this.isPermisoEliminarProductoOrdenDetaProdu));
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemCancelarProductoOrdenDetaProdu.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu);				
			}
			
			this.jMenuItemGuardarCambiosProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu && this.isPermisoGuardarCambiosProductoOrdenDetaProdu));						
			this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu && this.isPermisoGuardarCambiosProductoOrdenDetaProdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu=this.jButtonNuevoProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaDuplicarProductoOrdenDetaProdu=this.jButtonDuplicarProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaCopiarProductoOrdenDetaProdu=this.jButtonCopiarProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaVerFormProductoOrdenDetaProdu=this.jButtonVerFormProductoOrdenDetaProdu.isVisible();
			
			this.isVisibilidadCeldaOrdenProductoOrdenDetaProdu=this.jButtonAbrirOrderByProductoOrdenDetaProdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=this.jButtonNuevoRelacionesProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaModificarProductoOrdenDetaProdu=this.jButtonModificarProductoOrdenDetaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonActualizarProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonEliminarProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonCancelarProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonGuardarCambiosProductoOrdenDetaProdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu=this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu=this.jButtonNuevoToolBarProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
			this.isVisibilidadCeldaModificarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonModificarToolBarProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonActualizarToolBarProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonEliminarToolBarProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonCancelarToolBarProductoOrdenDetaProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=this.jButtonGuardarCambiosToolBarProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu=this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu=this.jMenuItemNuevoProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=this.jMenuItemNuevoRelacionesProductoOrdenDetaProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
			this.isVisibilidadCeldaModificarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemModificarProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemActualizarProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemEliminarProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemCancelarProductoOrdenDetaProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=this.jMenuItemGuardarCambiosProductoOrdenDetaProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu=this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProductoOrdenDetaProdu(Boolean esInicializar) {
		if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {
				//if(this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProductoOrdenDetaProdu();
			}
			
			this.inicializarActualizarBindingBotonesManualProductoOrdenDetaProdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProductoOrdenDetaProdu() {
		this.jButtonNuevoProductoOrdenDetaProdu.setVisible(this.isPermisoNuevoProductoOrdenDetaProdu);			
		this.jButtonDuplicarProductoOrdenDetaProdu.setVisible(this.isPermisoDuplicarProductoOrdenDetaProdu);			
		this.jButtonCopiarProductoOrdenDetaProdu.setVisible(this.isPermisoCopiarProductoOrdenDetaProdu);			
		this.jButtonVerFormProductoOrdenDetaProdu.setVisible(this.isPermisoVerFormProductoOrdenDetaProdu);			
		
		this.jButtonAbrirOrderByProductoOrdenDetaProdu.setVisible(this.isPermisoOrdenProductoOrdenDetaProdu);					
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProdu.setVisible(this.isPermisoNuevoProductoOrdenDetaProdu);			
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonModificarProductoOrdenDetaProdu.setVisible(this.isPermisoActualizarProductoOrdenDetaProdu);	
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonActualizarProductoOrdenDetaProdu.setVisible(this.isPermisoActualizarProductoOrdenDetaProdu);	
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonEliminarProductoOrdenDetaProdu.setVisible(this.isPermisoEliminarProductoOrdenDetaProdu);
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonCancelarProductoOrdenDetaProdu.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu);						
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonGuardarCambiosProductoOrdenDetaProdu.setVisible(this.isPermisoGuardarCambiosProductoOrdenDetaProdu);							
		}
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu.setVisible(this.isPermisoActualizarProductoOrdenDetaProdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoOrdenDetaProdu() {
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonModificarProductoOrdenDetaProdu.setVisible(this.isPermisoActualizarProductoOrdenDetaProdu);	
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonActualizarProductoOrdenDetaProdu.setVisible(this.isPermisoActualizarProductoOrdenDetaProdu);	
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonEliminarProductoOrdenDetaProdu.setVisible(this.isPermisoEliminarProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonCancelarProductoOrdenDetaProdu.setVisible(this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu);							
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonGuardarCambiosProductoOrdenDetaProdu.setVisible((this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu && this.isPermisoGuardarCambiosProductoOrdenDetaProdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProductoOrdenDetaProdu() {
		if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProductoOrdenDetaProdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProductoOrdenDetaProdu() {
	}
	
	public void jTableDatosProductoOrdenDetaProduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProductoOrdenDetaProdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProductoOrdenDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.getproductoordendetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodu==null) {
						this.productoordendetaprodu = new ProductoOrdenDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
				}

				if(this.productoordendetaprodu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.productoordendetaprodu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_orden_deta_produProductoOrdenDetaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoordendetaprodu=true;

			idTienePermisoordendetaprodu=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProdu(OrdenDetaProduConstantesFunciones.CLASSNAME);

			if(idTienePermisoordendetaprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.getproductoordendetaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);

				this.ordendetaproduBeanSwingJInternalFrame=new OrdenDetaProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ordendetaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ordendetaproduBeanSwingJInternalFrame.getOrdenDetaProduLogic().setConnexion(this.productoordendetaproduLogic.getConnexion());

				if(this.productoordendetaprodu.getid_orden_deta_produ()!=null) {
					this.ordendetaproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ordendetaproduBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodu.getid_orden_deta_produ());
					this.ordendetaproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ordendetaproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ordendetaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaOrdenDetaProdu();
				}

				JInternalFrameBase jinternalFrame =this.ordendetaproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProdu=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProdu.getBorder();
				TitledBorder titledBorderordendetaprodu=(TitledBorder)this.ordendetaproduBeanSwingJInternalFrame.jScrollPanelDatosOrdenDetaProdu.getBorder();

				titledBorderordendetaprodu.setTitle(titledBorderProductoOrdenDetaProdu.getTitle() + " -> Orden Detalle Produccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_orden_deta_produProductoOrdenDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.getproductoordendetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodu==null) {
						this.productoordendetaprodu = new ProductoOrdenDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
				}

				if(this.productoordendetaprodu.getid_orden_deta_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_orden_deta_produ = "+this.productoordendetaprodu.getid_orden_deta_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProductoOrdenDetaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProdu(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.getproductoordendetaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.productoordendetaproduLogic.getConnexion());

				if(this.productoordendetaprodu.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodu.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProdu=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProdu.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProductoOrdenDetaProdu.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProductoOrdenDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.getproductoordendetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodu==null) {
						this.productoordendetaprodu = new ProductoOrdenDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
				}

				if(this.productoordendetaprodu.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.productoordendetaprodu.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProductoOrdenDetaProduActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderProductoOrdenDetaProdu=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosProductoOrdenDetaProdu.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderProductoOrdenDetaProdu=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProdu.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoOrdenDetaProdu.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoProductoOrdenDetaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProdu(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.getproductoordendetaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.productoordendetaproduLogic.getConnexion());

				if(this.productoordendetaprodu.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodu.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProdu=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProdu.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProductoOrdenDetaProdu.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProductoOrdenDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.getproductoordendetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodu==null) {
						this.productoordendetaprodu = new ProductoOrdenDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
				}

				if(this.productoordendetaprodu.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.productoordendetaprodu.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadProductoOrdenDetaProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebProductoOrdenDetaProdu(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProductoOrdenDetaProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProductoOrdenDetaProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.getproductoordendetaprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.productoordendetaproduLogic.getConnexion());

				if(this.productoordendetaprodu.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.productoordendetaprodu.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProductoOrdenDetaProdu=(TitledBorder)this.jScrollPanelDatosProductoOrdenDetaProdu.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderProductoOrdenDetaProdu.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadProductoOrdenDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.getproductoordendetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodu==null) {
						this.productoordendetaprodu = new ProductoOrdenDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
				}

				if(this.productoordendetaprodu.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.productoordendetaprodu.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeProductoOrdenDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.getproductoordendetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodu==null) {
						this.productoordendetaprodu = new ProductoOrdenDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
				}

				if(this.productoordendetaprodu.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.productoordendetaprodu.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadProductoOrdenDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.getproductoordendetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodu==null) {
						this.productoordendetaprodu = new ProductoOrdenDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
				}

				if(this.productoordendetaprodu.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.productoordendetaprodu.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoProductoOrdenDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.getproductoordendetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodu==null) {
						this.productoordendetaprodu = new ProductoOrdenDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
				}

				if(this.productoordendetaprodu.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.productoordendetaprodu.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalProductoOrdenDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.getproductoordendetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodu==null) {
						this.productoordendetaprodu = new ProductoOrdenDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
				}

				if(this.productoordendetaprodu.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.productoordendetaprodu.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionProductoOrdenDetaProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.getproductoordendetaprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.productoordendetaprodu==null) {
						this.productoordendetaprodu = new ProductoOrdenDetaProdu();
					}

					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);
				}

				if(this.productoordendetaprodu.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.productoordendetaprodu.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);

			this.getProductoOrdenDetaProdusFK_IdBodega();

			this.inicializarActualizarBindingProductoOrdenDetaProdu(false);

			//if(ProductoOrdenDetaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);

			this.getProductoOrdenDetaProdusFK_IdOrdenDetaProdu();

			this.inicializarActualizarBindingProductoOrdenDetaProdu(false);

			//if(ProductoOrdenDetaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);

			this.getProductoOrdenDetaProdusFK_IdProducto();

			this.inicializarActualizarBindingProductoOrdenDetaProdu(false);

			//if(ProductoOrdenDetaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadUnadProductoOrdenDetaProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);

			this.getProductoOrdenDetaProdusFK_IdUnidadUnad();

			this.inicializarActualizarBindingProductoOrdenDetaProdu(false);

			//if(ProductoOrdenDetaProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.productoordendetaproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProductoOrdenDetaProdu() {
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.dispose();
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu!=null) {
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.dispose();
			this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu=null;
		}
		
		if(this.jInternalFrameImportacionProductoOrdenDetaProdu!=null) {
			this.jInternalFrameImportacionProductoOrdenDetaProdu.setVisible(false);	    			
			this.jInternalFrameImportacionProductoOrdenDetaProdu.dispose();
			this.jInternalFrameImportacionProductoOrdenDetaProdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProductoOrdenDetaProdu();
			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			
			
			if(sTipo.equals("NuevoProductoOrdenDetaProdu")) {
				jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProductoOrdenDetaProdu")) {
				jButtonDuplicarProductoOrdenDetaProduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProductoOrdenDetaProdu")) {
				jButtonCopiarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormProductoOrdenDetaProdu")) {
				jButtonVerFormProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProductoOrdenDetaProdu")) {
				jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProductoOrdenDetaProdu")) {
				jButtonDuplicarProductoOrdenDetaProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProductoOrdenDetaProdu")) {
				jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProductoOrdenDetaProdu")) {
				jButtonDuplicarProductoOrdenDetaProduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProductoOrdenDetaProdu")) {
				jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProductoOrdenDetaProdu")) {
				jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProductoOrdenDetaProdu")) {
				jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProductoOrdenDetaProdu")) {
				jButtonModificarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProductoOrdenDetaProdu")) {
				jButtonModificarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProductoOrdenDetaProdu")) {
				jButtonModificarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProductoOrdenDetaProdu")) {
				jButtonActualizarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProductoOrdenDetaProdu")) {
				jButtonActualizarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProductoOrdenDetaProdu")) {
				jButtonActualizarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarProductoOrdenDetaProdu")) {
				jButtonEliminarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProductoOrdenDetaProdu")) {
				jButtonEliminarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProductoOrdenDetaProdu")) {
				jButtonEliminarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarProductoOrdenDetaProdu")) {
				jButtonCancelarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProductoOrdenDetaProdu")) {
				jButtonCancelarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProductoOrdenDetaProdu")) {
				jButtonCancelarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarProductoOrdenDetaProdu")) {
				jButtonCerrarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProductoOrdenDetaProdu")) {
				jButtonCerrarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProductoOrdenDetaProdu")) {
				jButtonCerrarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProductoOrdenDetaProdu")) {
				jButtonMostrarOcultarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProductoOrdenDetaProdu")) {
				jButtonCancelarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProductoOrdenDetaProdu")) {
				jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProductoOrdenDetaProdu")) {
				jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProductoOrdenDetaProdu")) {
				jButtonCopiarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProductoOrdenDetaProdu")) {
				jButtonVerFormProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProductoOrdenDetaProdu")) {
				jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProductoOrdenDetaProdu")) {
				jButtonCopiarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProductoOrdenDetaProdu")) {
				jButtonVerFormProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProductoOrdenDetaProdu")) {
				jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProductoOrdenDetaProdu")) {
				jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProductoOrdenDetaProdu")) {
				jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProductoOrdenDetaProdu")) {
				jButtonRecargarInformacionProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProductoOrdenDetaProdu")) {
				jButtonRecargarInformacionProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProductoOrdenDetaProdu")) {
				jButtonRecargarInformacionProductoOrdenDetaProduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProductoOrdenDetaProdu")) {
				jButtonAnterioresProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProductoOrdenDetaProdu")) {
				jButtonAnterioresProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProductoOrdenDetaProdu")) {
				jButtonAnterioresProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProductoOrdenDetaProdu")) {
				jButtonSiguientesProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProductoOrdenDetaProdu")) {
				jButtonSiguientesProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProductoOrdenDetaProdu")) {
				jButtonSiguientesProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProductoOrdenDetaProdu") || sTipo.equals("MenuItemDetalleAbrirOrderByProductoOrdenDetaProdu")) {
				jButtonAbrirOrderByProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProductoOrdenDetaProdu") || sTipo.equals("MenuItemDetalleMostrarOcultarProductoOrdenDetaProdu")) {
				jButtonMostrarOcultarProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProductoOrdenDetaProdu")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProductoOrdenDetaProdu")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProductoOrdenDetaProdu")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProductoOrdenDetaProdu")) {
				jButtonCerrarReporteDinamicoProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProductoOrdenDetaProdu")) {
				jButtonGenerarReporteDinamicoProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProductoOrdenDetaProdu")) {
				
				jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProductoOrdenDetaProdu")) {
				jButtonCerrarImportacionProductoOrdenDetaProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProductoOrdenDetaProdu")) {
				
				jButtonGenerarImportacionProductoOrdenDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProductoOrdenDetaProdu")) {
				
				jButtonAbrirImportacionProductoOrdenDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProductoOrdenDetaProdu")) {
				jComboBoxTiposAccionesProductoOrdenDetaProduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProductoOrdenDetaProdu")) {
				jComboBoxTiposRelacionesProductoOrdenDetaProduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProductoOrdenDetaProdu")) {
				jComboBoxTiposAccionesProductoOrdenDetaProduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProductoOrdenDetaProdu")) {
				
				jComboBoxTiposSeleccionarProductoOrdenDetaProduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProductoOrdenDetaProdu")) {
				jTextFieldValorCampoGeneralProductoOrdenDetaProduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProductoOrdenDetaProdu")) {
				jButtonAbrirOrderByProductoOrdenDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProductoOrdenDetaProdu")) {
				jButtonAbrirOrderByProductoOrdenDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProductoOrdenDetaProdu")) {
				jButtonCerrarOrderByProductoOrdenDetaProduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoOrdenDetaProduBusqueda")) {
				this.jButtonidProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduUpdate")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduBusqueda")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoOrdenDetaProduUpdate")) {
				this.jButtonid_bodegaProductoOrdenDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoOrdenDetaProduBusqueda")) {
				this.jButtonid_bodegaProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoOrdenDetaProdu")) {
				this.jButtonid_productoProductoOrdenDetaProduActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoOrdenDetaProduUpdate")) {
				this.jButtonid_productoProductoOrdenDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoOrdenDetaProduBusqueda")) {
				this.jButtonid_productoProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduUpdate")) {
				this.jButtonid_unidadProductoOrdenDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduBusqueda")) {
				this.jButtonid_unidadProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeProductoOrdenDetaProduBusqueda")) {
				this.jButtonporcentajeProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoOrdenDetaProduBusqueda")) {
				this.jButtoncantidadProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoOrdenDetaProduBusqueda")) {
				this.jButtoncostoProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoOrdenDetaProduBusqueda")) {
				this.jButtoncosto_totalProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoOrdenDetaProduBusqueda")) {
				this.jButtondescripcionProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoProductoOrdenDetaProdu")) {
				this.jButtonid_productoProductoOrdenDetaProduActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaProductoOrdenDetaProdu")) {
				this.jButtonFK_IdBodegaProductoOrdenDetaProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdOrdenDetaProduProductoOrdenDetaProdu")) {
				this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoProductoOrdenDetaProdu")) {
				this.jButtonFK_IdProductoProductoOrdenDetaProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadUnadProductoOrdenDetaProdu")) {
				this.jButtonFK_IdUnidadUnadProductoOrdenDetaProduActionPerformed(evt);
			}
			
			;
			
			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProductoOrdenDetaProdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
				
				


				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProductoOrdenDetaProdu productoordendetaproduLocal=null;
			
			if(!this.getEsControlTabla()) {
				productoordendetaproduLocal=this.productoordendetaprodu;
			} else {
				productoordendetaproduLocal=this.productoordendetaproduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
							
				
				


				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduAnterior =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaproduAnterior =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
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
			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			
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
			
			


			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
								
						
				


				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
								
				
				


				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduAnterior =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaproduAnterior =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduAnterior =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaproduAnterior =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
							
				
				


				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaproduAnterior =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoordendetaproduAnterior =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
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
			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			
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
			
			


			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
								
				
				


				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduAnterior =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaproduAnterior =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProductoOrdenDetaProdu")) {
					jCheckBoxSeleccionarTodosProductoOrdenDetaProduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProductoOrdenDetaProdu")) {
					jCheckBoxSeleccionadosProductoOrdenDetaProduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProductoOrdenDetaProdu")) {
					
				}
				
				


				
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
												
				
				


				
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.productoordendetaproduAnterior =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.productoordendetaproduAnterior =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
				
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
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
			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
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
			
			


			if(sTipo.equals("id_bodegaProductoOrdenDetaProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu;
				}

				if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoOrdenDetaProduConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoOrdenDetaProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu,"FK_IdBodega");
				//recargarFormProductoOrdenDetaProduBodega(jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoProductoOrdenDetaProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu;
				}

				if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoOrdenDetaProduConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoOrdenDetaProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu,"FK_IdProducto");
				//recargarFormProductoOrdenDetaProduProducto(jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu,"FK_IdProducto");
			}
			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProductoOrdenDetaProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_bodegaProductoOrdenDetaProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu;
				}

				if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoOrdenDetaProduConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoOrdenDetaProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu,"FK_IdBodega");
				//recargarFormProductoOrdenDetaProduBodega(jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoProductoOrdenDetaProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu;
				}

				if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoOrdenDetaProduConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoOrdenDetaProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu,"FK_IdProducto");
				//recargarFormProductoOrdenDetaProduProducto(jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu,"FK_IdProducto");
			}
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.productoordendetaprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.productoordendetaprodu);
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
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
				
				


			if(sTipo.equals("id_bodegaProductoOrdenDetaProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu;
				}

				if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoOrdenDetaProduConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyBodega(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoOrdenDetaProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu")) {
				this.procesarActionsCombosForeignKeyBodega(jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu,"FK_IdBodega");
				//recargarFormProductoOrdenDetaProduBodega(jComboBoxid_bodegaFK_IdBodegaProductoOrdenDetaProdu,"FK_IdBodega");
			}
			 else if(sTipo.equals("id_productoProductoOrdenDetaProdu")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu;
				}

				if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {
					//classes=ProductoOrdenDetaProduConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyProducto(jComboBoxGenerico,"Formulario");

				this.recargarFormProductoOrdenDetaProdu(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu")) {
				this.procesarActionsCombosForeignKeyProducto(jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu,"FK_IdProducto");
				//recargarFormProductoOrdenDetaProduProducto(jComboBoxid_productoFK_IdProductoProductoOrdenDetaProdu,"FK_IdProducto");
			}
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProductoOrdenDetaProdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProductoOrdenDetaProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProductoOrdenDetaProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.productoordendetaproduAnterior =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.productoordendetaproduAnterior =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProductoOrdenDetaProdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProductoOrdenDetaProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProductoOrdenDetaProdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.productoordendetaprodu =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.productoordendetaprodu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProductoOrdenDetaProdu")) {
				
				}
				
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProductoOrdenDetaProdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProductoOrdenDetaProdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProductoOrdenDetaProdu")) {
			
			}
			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProductoOrdenDetaProdu();
			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			
			if(sTipo.equals("NuevoProductoOrdenDetaProdu")) {
				jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProductoOrdenDetaProdu")) {
				jButtonDuplicarProductoOrdenDetaProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProductoOrdenDetaProdu")) {
				jButtonCopiarProductoOrdenDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProductoOrdenDetaProdu")) {
				jButtonVerFormProductoOrdenDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProductoOrdenDetaProdu")) {
				jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProductoOrdenDetaProdu")) {
				jButtonModificarProductoOrdenDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProductoOrdenDetaProdu")) {
				jButtonActualizarProductoOrdenDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProductoOrdenDetaProdu")) {
				jButtonEliminarProductoOrdenDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProductoOrdenDetaProdu")) {
				jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProductoOrdenDetaProdu")) {
				jButtonCancelarProductoOrdenDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProductoOrdenDetaProdu")) {
				jButtonCerrarProductoOrdenDetaProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProductoOrdenDetaProdu")) {
				jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProductoOrdenDetaProdu")) {
				jButtonNuevoGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProductoOrdenDetaProdu")) {
				jButtonAbrirOrderByProductoOrdenDetaProduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProductoOrdenDetaProdu")) {
				jButtonRecargarInformacionProductoOrdenDetaProduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProductoOrdenDetaProdu")) {
				jButtonAnterioresProductoOrdenDetaProduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProductoOrdenDetaProdu")) {
				jButtonSiguientesProductoOrdenDetaProduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProductoOrdenDetaProduBusqueda")) {
				this.jButtonidProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduUpdate")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_orden_deta_produProductoOrdenDetaProduBusqueda")) {
				this.jButtonid_orden_deta_produProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProductoOrdenDetaProduUpdate")) {
				this.jButtonid_bodegaProductoOrdenDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProductoOrdenDetaProduBusqueda")) {
				this.jButtonid_bodegaProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoProductoOrdenDetaProdu")) {
				this.jButtonid_productoProductoOrdenDetaProduActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProductoOrdenDetaProduUpdate")) {
				this.jButtonid_productoProductoOrdenDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProductoOrdenDetaProduBusqueda")) {
				this.jButtonid_productoProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduUpdate")) {
				this.jButtonid_unidadProductoOrdenDetaProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadProductoOrdenDetaProduBusqueda")) {
				this.jButtonid_unidadProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeProductoOrdenDetaProduBusqueda")) {
				this.jButtonporcentajeProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadProductoOrdenDetaProduBusqueda")) {
				this.jButtoncantidadProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoProductoOrdenDetaProduBusqueda")) {
				this.jButtoncostoProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalProductoOrdenDetaProduBusqueda")) {
				this.jButtoncosto_totalProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionProductoOrdenDetaProduBusqueda")) {
				this.jButtondescripcionProductoOrdenDetaProduBusquedaActionPerformed(evt);
			}
			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProductoOrdenDetaProdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProductoOrdenDetaProdu")) {
				closingInternalFrameProductoOrdenDetaProdu();
				
			} else if(sTipo.equals("jButtonCancelarProductoOrdenDetaProdu")) {
				JInternalFrameBase jInternalFrameDetalleFormProductoOrdenDetaProdu = (JInternalFrameBase)evt.getSource();
	            	
	            ProductoOrdenDetaProduBeanSwingJInternalFrame jInternalFrameParent=(ProductoOrdenDetaProduBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoOrdenDetaProdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProductoOrdenDetaProduActionPerformed(null);
			}
			
			ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.productoordendetaprodu,new Object(),this.productoordendetaproduParameterGeneral,this.productoordendetaproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProductoOrdenDetaProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProductoOrdenDetaProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProductoOrdenDetaProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.productoordendetaprodu)) {
			if(!esControlTabla) {
				if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);			
				}
				
				if(this.productoordendetaproduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoordendetaproduReturnGeneral=productoordendetaproduLogic.procesarEventosProductoOrdenDetaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaproduLogic.getProductoOrdenDetaProdus(),this.productoordendetaprodu,this.productoordendetaproduParameterGeneral,this.isEsNuevoProductoOrdenDetaProdu,classes);//this.productoordendetaproduLogic.getProductoOrdenDetaProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProductoOrdenDetaProdu(this.productoordendetaproduReturnGeneral,this.productoordendetaproduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.productoordendetaproduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProductoOrdenDetaProdu(classes,this.productoordendetaproduReturnGeneral,this.productoordendetaproduBean,false);
					}
						
					if(this.productoordendetaproduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProductoOrdenDetaProdu(this.productoordendetaproduReturnGeneral.getProductoOrdenDetaProdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProductoOrdenDetaProdu(this.productoordendetaproduReturnGeneral.getProductoOrdenDetaProdu());	
					}
						
					if(this.productoordendetaproduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProdu(this.productoordendetaproduReturnGeneral.getProductoOrdenDetaProdu(),classes);//this.productoordendetaproduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProdu(this.productoordendetaprodu,classes);//this.productoordendetaproduBean);									
				}
			
				if(ProductoOrdenDetaProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProductoOrdenDetaProdu(this.productoordendetaprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProductoOrdenDetaProdu(this.productoordendetaprodu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.productoordendetaproduAnterior!=null) {
						this.productoordendetaprodu=this.productoordendetaproduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.productoordendetaproduReturnGeneral=productoordendetaproduLogic.procesarEventosProductoOrdenDetaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaproduLogic.getProductoOrdenDetaProdus(),this.productoordendetaprodu,this.productoordendetaproduParameterGeneral,this.isEsNuevoProductoOrdenDetaProdu,classes);//this.productoordendetaproduLogic.getProductoOrdenDetaProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.productoordendetaproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.productoordendetaproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.productoordendetaproduReturnGeneral.getProductoOrdenDetaProdu(),productoordendetaproduLogic.getProductoOrdenDetaProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.productoordendetaproduReturnGeneral.getProductoOrdenDetaProdu(),this.productoordendetaprodus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProductoOrdenDetaProdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosProductoOrdenDetaProdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProductoOrdenDetaProdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosProductoOrdenDetaProdu() throws Exception {
		
		ProductoOrdenDetaProduModel productoordendetaproduModel=(ProductoOrdenDetaProduModel)this.jTableDatosProductoOrdenDetaProdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			productoordendetaproduModel.productoordendetaprodus=this.productoordendetaproduLogic.getProductoOrdenDetaProdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			productoordendetaproduModel.productoordendetaprodus=this.productoordendetaprodus;
		}
		
		
		((ProductoOrdenDetaProduModel) this.jTableDatosProductoOrdenDetaProdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProductoOrdenDetaProdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getproductoordendetaproduAnterior(),this.productoordendetaproduLogic.getProductoOrdenDetaProdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getproductoordendetaproduAnterior(),this.productoordendetaprodus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProductoOrdenDetaProdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
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
										
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodu,new Object(),generalEntityParameterGeneral,this.productoordendetaproduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.productoordendetaproduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProductoOrdenDetaProduConstantesFunciones.getClassesRelationshipsOfProductoOrdenDetaProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProductoOrdenDetaProduConstantesFunciones.getClassesRelationshipsFromStringsOfProductoOrdenDetaProdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProductoOrdenDetaProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.productoordendetaprodu,new Object(),generalEntityParameterGeneral,this.productoordendetaproduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProductoOrdenDetaProdu(ProductoOrdenDetaProduBean productoordendetaproduBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProductoOrdenDetaProdu(ArrayList<Classe> classes,ProductoOrdenDetaProduReturnGeneral productoordendetaproduReturnGeneral,ProductoOrdenDetaProduBean productoordendetaproduBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.productoordendetaprodu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu = new ProductoOrdenDetaProduDetalleFormJInternalFrame(jDesktopPane,this.productoordendetaproduSessionBean.getConGuardarRelaciones(),this.productoordendetaproduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.setVisible(false);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.productoordendetaproduLogic=this.productoordendetaproduLogic;
		
		this.cargarCombosFrameForeignKeyProductoOrdenDetaProdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProductoOrdenDetaProdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProductoOrdenDetaProdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProductoOrdenDetaProdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProductoOrdenDetaProdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoOrdenDetaProdu"));
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonModificarProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"ModificarProductoOrdenDetaProdu"));

		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonModificarToolBarProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoOrdenDetaProdu"));
					
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemModificarProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoOrdenDetaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonActualizarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"ActualizarProductoOrdenDetaProdu"));
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonActualizarToolBarProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoOrdenDetaProdu"));
						
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemActualizarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoOrdenDetaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonEliminarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"EliminarProductoOrdenDetaProdu"));
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonEliminarToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoOrdenDetaProdu"));
								
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemEliminarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoOrdenDetaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonCancelarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"CancelarProductoOrdenDetaProdu"));
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonCancelarToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoOrdenDetaProdu"));
					
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemCancelarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoOrdenDetaProdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemDetalleCerrarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoOrdenDetaProdu"));		
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonGuardarCambiosToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoOrdenDetaProdu"));
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonGuardarCambiosToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoOrdenDetaProdu"));
		
		
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoOrdenDetaProdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonidProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"idProductoOrdenDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_orden_deta_produProductoOrdenDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_orden_deta_produProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_bodegaProductoOrdenDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoOrdenDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_bodegaProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoOrdenDetaProduBusqueda"));
		//jButtonid_productoProductoOrdenDetaProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoOrdenDetaProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_productoProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"id_productoProductoOrdenDetaProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_productoProductoOrdenDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoOrdenDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_productoProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoOrdenDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_unidadProductoOrdenDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_unidadProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonporcentajeProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProductoOrdenDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtoncantidadProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoOrdenDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtoncostoProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoOrdenDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtoncosto_totalProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoOrdenDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtondescripcionProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoOrdenDetaProduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTabbedPaneRelacionesProductoOrdenDetaProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoOrdenDetaProdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProductoOrdenDetaProdu"));
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProductoOrdenDetaProdu"));
		}
		
		this.jTableDatosProductoOrdenDetaProdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProductoOrdenDetaProdu"));
		
		this.jTableDatosProductoOrdenDetaProdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProductoOrdenDetaProdu"));
		
		this.jButtonNuevoProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"NuevoProductoOrdenDetaProdu"));
		
		this.jButtonDuplicarProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"DuplicarProductoOrdenDetaProdu"));
		
		this.jButtonCopiarProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"CopiarProductoOrdenDetaProdu"));
		
		this.jButtonVerFormProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"VerFormProductoOrdenDetaProdu"));
		
		
		this.jButtonNuevoToolBarProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarProductoOrdenDetaProdu"));
			
		this.jButtonDuplicarToolBarProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProductoOrdenDetaProdu"));
			
		this.jMenuItemNuevoProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProductoOrdenDetaProdu"));
			
		this.jMenuItemDuplicarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProductoOrdenDetaProdu"));		
		
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProductoOrdenDetaProdu"));
		
		
		this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProductoOrdenDetaProdu"));
			
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProductoOrdenDetaProdu"));		
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonModificarProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"ModificarProductoOrdenDetaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonModificarToolBarProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarProductoOrdenDetaProdu"));
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemModificarProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarProductoOrdenDetaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonActualizarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"ActualizarProductoOrdenDetaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonActualizarToolBarProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProductoOrdenDetaProdu"));
				
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemActualizarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProductoOrdenDetaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonEliminarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"EliminarProductoOrdenDetaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonEliminarToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarProductoOrdenDetaProdu"));
						
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemEliminarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProductoOrdenDetaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonCancelarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"CancelarProductoOrdenDetaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonCancelarToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarProductoOrdenDetaProdu"));
			
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemCancelarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProductoOrdenDetaProdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProductoOrdenDetaProdu"));		
		
		
		this.jButtonCerrarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"CerrarProductoOrdenDetaProdu"));
		
		
		this.jButtonCerrarToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarProductoOrdenDetaProdu"));
			
		this.jMenuItemCerrarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProductoOrdenDetaProdu"));
			
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jMenuItemDetalleCerrarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProductoOrdenDetaProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonGuardarCambiosProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosProductoOrdenDetaProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonGuardarCambiosToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProductoOrdenDetaProdu"));
		}
		
		this.jButtonCopiarToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarProductoOrdenDetaProdu"));
			
		this.jButtonVerFormToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarProductoOrdenDetaProdu"));
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProductoOrdenDetaProdu"));
			
		this.jMenuItemCopiarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProductoOrdenDetaProdu"));		
		
		this.jMenuItemVerFormProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProductoOrdenDetaProdu"));		
		
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoOrdenDetaProdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProductoOrdenDetaProdu"));
			
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProductoOrdenDetaProdu"));		
		
		
		
		this.jButtonRecargarInformacionProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionProductoOrdenDetaProdu"));
					
		this.jButtonRecargarInformacionToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProductoOrdenDetaProdu"));
		
		this.jMenuItemRecargarInformacionProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProductoOrdenDetaProdu"));		
		
		
		
		this.jButtonAnterioresProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"AnterioresProductoOrdenDetaProdu"));
		
		
		this.jButtonAnterioresToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProductoOrdenDetaProdu"));
		
		this.jMenuItemAnterioresProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProductoOrdenDetaProdu"));		
		
		
		this.jButtonSiguientesProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"SiguientesProductoOrdenDetaProdu"));
		
		
		this.jButtonSiguientesToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProductoOrdenDetaProdu"));
			
		this.jMenuItemSiguientesProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProductoOrdenDetaProdu"));
			
		this.jMenuItemAbrirOrderByProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProductoOrdenDetaProdu"));
			
		this.jMenuItemMostrarOcultarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProductoOrdenDetaProdu"));
			
		this.jMenuItemDetalleAbrirOrderByProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProductoOrdenDetaProdu"));
			
		this.jMenuItemDetalleMostarOcultarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProductoOrdenDetaProdu"));		
		
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProductoOrdenDetaProdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProductoOrdenDetaProdu"));
			
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProductoOrdenDetaProdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProductoOrdenDetaProdu"));

		this.jCheckBoxSeleccionadosProductoOrdenDetaProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProductoOrdenDetaProdu"));
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProductoOrdenDetaProdu"));
		}
		
		
		this.jComboBoxTiposRelacionesProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesProductoOrdenDetaProdu"));
			
		this.jComboBoxTiposAccionesProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesProductoOrdenDetaProdu"));
					
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProductoOrdenDetaProdu"));
			
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProductoOrdenDetaProdu"));		
		
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonidProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"idProductoOrdenDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_orden_deta_produProductoOrdenDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_orden_deta_produProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_bodegaProductoOrdenDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoOrdenDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_bodegaProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoOrdenDetaProduBusqueda"));
		//jButtonid_productoProductoOrdenDetaProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoOrdenDetaProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_productoProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"id_productoProductoOrdenDetaProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_productoProductoOrdenDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoOrdenDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_productoProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoOrdenDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_unidadProductoOrdenDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_unidadProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonporcentajeProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProductoOrdenDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtoncantidadProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoOrdenDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtoncostoProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoOrdenDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtoncosto_totalProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoOrdenDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtondescripcionProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoOrdenDetaProduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProductoOrdenDetaProdu"));

			this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdOrdenDetaProduProductoOrdenDetaProdu"));

			this.jButtonFK_IdProductoProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoOrdenDetaProdu"));

			this.jButtonBuscarFK_IdProductoid_productoProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"id_productoProductoOrdenDetaProdu"));

			this.jButtonFK_IdUnidadUnadProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdUnidadUnadProductoOrdenDetaProdu"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu!=null) {
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoOrdenDetaProdu"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoOrdenDetaProdu"));
				this.jInternalFrameReporteDinamicoProductoOrdenDetaProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoOrdenDetaProdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProductoOrdenDetaProdu"));				
			//this.jButtonGenerarReporteDinamicoProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProductoOrdenDetaProdu"));
			//this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProductoOrdenDetaProdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProductoOrdenDetaProdu!=null) {
				this.jInternalFrameImportacionProductoOrdenDetaProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProductoOrdenDetaProdu"));
				this.jInternalFrameImportacionProductoOrdenDetaProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProductoOrdenDetaProdu"));
				this.jInternalFrameImportacionProductoOrdenDetaProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProductoOrdenDetaProdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByProductoOrdenDetaProdu"));
			
			this.jButtonAbrirOrderByToolBarProductoOrdenDetaProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProductoOrdenDetaProdu"));			
			
			if(this.jInternalFrameOrderByProductoOrdenDetaProdu!=null) {
				this.jInternalFrameOrderByProductoOrdenDetaProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProductoOrdenDetaProdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTabbedPaneRelacionesProductoOrdenDetaProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProductoOrdenDetaProdu"));
		
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
            		closingInternalFrameProductoOrdenDetaProdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProductoOrdenDetaProdu = (JInternalFrameBase)event.getSource();
	            	
	            ProductoOrdenDetaProduBeanSwingJInternalFrame jInternalFrameParent=(ProductoOrdenDetaProduBeanSwingJInternalFrame)jInternalFrameDetalleFormProductoOrdenDetaProdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProductoOrdenDetaProduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProductoOrdenDetaProdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProductoOrdenDetaProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProductoOrdenDetaProdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProductoOrdenDetaProdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProductoOrdenDetaProdu";
		inputMap = this.jButtonNuevoProductoOrdenDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProductoOrdenDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProductoOrdenDetaProdu";
		inputMap = this.jButtonNuevoRelacionesProductoOrdenDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProductoOrdenDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProductoOrdenDetaProduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProductoOrdenDetaProdu";
		inputMap = this.jButtonModificarProductoOrdenDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProductoOrdenDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProductoOrdenDetaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProductoOrdenDetaProdu";
		inputMap = this.jButtonActualizarProductoOrdenDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProductoOrdenDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProductoOrdenDetaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProductoOrdenDetaProdu";
		inputMap = this.jButtonEliminarProductoOrdenDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProductoOrdenDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProductoOrdenDetaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProductoOrdenDetaProdu";
		inputMap = this.jButtonCancelarProductoOrdenDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProductoOrdenDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProductoOrdenDetaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProductoOrdenDetaProdu";
		inputMap = this.jButtonCerrarProductoOrdenDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProductoOrdenDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProductoOrdenDetaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonGuardarCambiosProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProductoOrdenDetaProdu";
		inputMap = this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonGuardarCambiosProductoOrdenDetaProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonGuardarCambiosProductoOrdenDetaProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProductoOrdenDetaProdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProductoOrdenDetaProduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProductoOrdenDetaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProductoOrdenDetaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProductoOrdenDetaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProductoOrdenDetaProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProductoOrdenDetaProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonidProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"idProductoOrdenDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_orden_deta_produProductoOrdenDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_orden_deta_produProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_orden_deta_produProductoOrdenDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_bodegaProductoOrdenDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProductoOrdenDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_bodegaProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProductoOrdenDetaProduBusqueda"));
		//jButtonid_productoProductoOrdenDetaProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoProductoOrdenDetaProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_productoProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"id_productoProductoOrdenDetaProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_productoProductoOrdenDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_productoProductoOrdenDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_productoProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProductoOrdenDetaProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_unidadProductoOrdenDetaProduUpdate.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_unidadProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadProductoOrdenDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonporcentajeProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeProductoOrdenDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtoncantidadProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"cantidadProductoOrdenDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtoncostoProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"costoProductoOrdenDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtoncosto_totalProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalProductoOrdenDetaProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtondescripcionProductoOrdenDetaProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionProductoOrdenDetaProduBusqueda"));
		
		
		this.jButtonFK_IdBodegaProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdBodegaProductoOrdenDetaProdu"));

		this.jButtonFK_IdOrdenDetaProduProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdOrdenDetaProduProductoOrdenDetaProdu"));

		this.jButtonFK_IdProductoProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdProductoProductoOrdenDetaProdu"));

		this.jButtonBuscarFK_IdProductoid_productoProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"id_productoProductoOrdenDetaProdu"));

		this.jButtonFK_IdUnidadUnadProductoOrdenDetaProdu.addActionListener(new ButtonActionListener(this,"FK_IdUnidadUnadProductoOrdenDetaProdu"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProductoOrdenDetaProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProductoOrdenDetaProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProductoOrdenDetaProduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProductoOrdenDetaProdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProductoOrdenDetaProdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProductoOrdenDetaProdu productoordendetaproduAux:this.productoordendetaproduLogic.getProductoOrdenDetaProdus()) {
					productoordendetaproduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProdu productoordendetaproduAux:productoordendetaprodus) {
					productoordendetaproduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProductoOrdenDetaProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoOrdenDetaProdu productoordendetaproduAux:this.productoordendetaproduLogic.getProductoOrdenDetaProdus()) {
						productoordendetaproduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoOrdenDetaProdu productoordendetaproduAux:productoordendetaprodus) {
						productoordendetaproduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProductoOrdenDetaProdu productoordendetaproduAux:this.productoordendetaproduLogic.getProductoOrdenDetaProdus()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoOrdenDetaProdu productoordendetaproduAux:productoordendetaprodus) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoOrdenDetaProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProductoOrdenDetaProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProductoOrdenDetaProdu.getSelectedRows();
			
			ProductoOrdenDetaProdu productoordendetaproduLocal=new ProductoOrdenDetaProdu();
			
			//this.seleccionarTodosProductoOrdenDetaProdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoordendetaproduLocal =(ProductoOrdenDetaProdu) this.productoordendetaproduLogic.getProductoOrdenDetaProdus().toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					productoordendetaproduLocal =(ProductoOrdenDetaProdu) this.productoordendetaprodus.toArray()[this.jTableDatosProductoOrdenDetaProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				productoordendetaproduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProductoOrdenDetaProdu productoordendetaproduAux:this.productoordendetaproduLogic.getProductoOrdenDetaProdus()) {
						productoordendetaproduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProductoOrdenDetaProdu productoordendetaproduAux:productoordendetaprodus) {
						productoordendetaproduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProductoOrdenDetaProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProductoOrdenDetaProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProductoOrdenDetaProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProductoOrdenDetaProduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProductoOrdenDetaProduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProductoOrdenDetaProduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProductoOrdenDetaProdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProductoOrdenDetaProdu productoordendetaproduAux:this.productoordendetaproduLogic.getProductoOrdenDetaProdus()) {
				
						if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							productoordendetaproduAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoordendetaproduAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoordendetaproduAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoordendetaproduAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoordendetaproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProdu productoordendetaproduAux:productoordendetaprodus) {
					
						if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							productoordendetaproduAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							productoordendetaproduAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							productoordendetaproduAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							productoordendetaproduAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							productoordendetaproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProductoOrdenDetaProduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProductoOrdenDetaProdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProductoOrdenDetaProdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProductoOrdenDetaProdu) {				
					conSplash=true;//false;										
					
					//this.startProcessProductoOrdenDetaProdu(conSplash);
				
					this.generarReporteProductoOrdenDetaProdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProductoOrdenDetaProdusSeleccionados();
				//this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoOrdenDetaProdusSeleccionados(false);
				//this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProductoOrdenDetaProdusSeleccionados(true);
				//this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoOrdenDetaProdu();
				
				this.exportarProductoOrdenDetaProdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProductoOrdenDetaProdus();
				//this.importarProductoOrdenDetaProdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProductoOrdenDetaProdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProductoOrdenDetaProdusSeleccionados();
				//this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Orden Producto Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProductoOrdenDetaProdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProductoOrdenDetaProdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProductoOrdenDetaProdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Orden Producto Produccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.setSelectedIndex(0);					
				}	
			} 			
			else if(ProductoOrdenDetaProduBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProductoOrdenDetaProdu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProductoOrdenDetaProdu(conSplash);
					
						//this.actualizarParametrosGeneralProductoOrdenDetaProdu();
						
						this.generarReporteProcesoAccionProductoOrdenDetaProdusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Orden Producto ProduccionES SELECCIONADOS?", "MANTENIMIENTO DE Orden Producto Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProductoOrdenDetaProdu();
				
						this.actualizarParametrosGeneralProductoOrdenDetaProdu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.productoordendetaproduReturnGeneral=productoordendetaproduLogic.procesarAccionProductoOrdenDetaProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.productoordendetaproduLogic.getProductoOrdenDetaProdus(),this.productoordendetaproduParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProductoOrdenDetaProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProductoOrdenDetaProdu();
					
					ProductoOrdenDetaProduBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProductoOrdenDetaProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProductoOrdenDetaProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxTiposAccionesFormularioProductoOrdenDetaProdu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProductoOrdenDetaProdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProductoOrdenDetaProduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProductoOrdenDetaProdu();
			
			if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProductoOrdenDetaProdu> productoordendetaprodusSeleccionados=new ArrayList<ProductoOrdenDetaProdu>();		
			ProductoOrdenDetaProdu productoordendetaprodu=new ProductoOrdenDetaProdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProductoOrdenDetaProdu.getSelectedItem();
			
			
			
			
			productoordendetaprodusSeleccionados=this.getProductoOrdenDetaProdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(productoordendetaprodusSeleccionados.size()==1) {
				for(ProductoOrdenDetaProdu productoordendetaproduAux:productoordendetaprodusSeleccionados) {
					productoordendetaprodu=productoordendetaproduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProductoOrdenDetaProdu();
			
      		//this.finishProcessProductoOrdenDetaProdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProductoOrdenDetaProduReturnGeneral() throws Exception {
		if(this.productoordendetaproduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.productoordendetaproduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.productoordendetaproduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.productoordendetaproduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.productoordendetaproduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.productoordendetaproduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
		}
		
		if(this.productoordendetaproduReturnGeneral.getConRetornoLista() || this.productoordendetaproduReturnGeneral.getConRetornoObjeto()) {
			if(this.productoordendetaproduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoordendetaproduLogic.setProductoOrdenDetaProdus(this.productoordendetaproduReturnGeneral.getProductoOrdenDetaProdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.productoordendetaproduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.productoordendetaproduLogic.setProductoOrdenDetaProdu(this.productoordendetaproduReturnGeneral.getProductoOrdenDetaProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProductoOrdenDetaProdu(false);
		}
	}
	
	public void actualizarParametrosGeneralProductoOrdenDetaProdu() throws Exception {
		
		
	}
	
	public ArrayList<ProductoOrdenDetaProdu> getProductoOrdenDetaProdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProductoOrdenDetaProdu> productoordendetaprodusSeleccionados=new ArrayList<ProductoOrdenDetaProdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProductoOrdenDetaProdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProductoOrdenDetaProdu productoordendetaproduAux:productoordendetaproduLogic.getProductoOrdenDetaProdus()) {
					if(productoordendetaproduAux.getIsSelected()) {
						productoordendetaprodusSeleccionados.add(productoordendetaproduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProductoOrdenDetaProdu productoordendetaproduAux:this.productoordendetaprodus) {
					if(productoordendetaproduAux.getIsSelected()) {
						productoordendetaprodusSeleccionados.add(productoordendetaproduAux);				
					}
				}
			}
			
			if(productoordendetaprodusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						productoordendetaprodusSeleccionados.addAll(this.productoordendetaproduLogic.getProductoOrdenDetaProdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						productoordendetaprodusSeleccionados.addAll(this.productoordendetaprodus);				
					}
				}
			}
		} else {
			productoordendetaprodusSeleccionados.add(this.productoordendetaprodu);
		}
		
		return productoordendetaprodusSeleccionados;
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
	
	public void generarReporteProductoOrdenDetaProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProductoOrdenDetaProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProductoOrdenDetaProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoOrdenDetaProdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProductoOrdenDetaProdusSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Orden Producto Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProductoOrdenDetaProdusSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProdu> productoordendetaprodusSeleccionados=new ArrayList<ProductoOrdenDetaProdu>();		
		
		productoordendetaprodusSeleccionados=this.getProductoOrdenDetaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProductoOrdenDetaProdus("Todos",productoordendetaprodusSeleccionados);
		
	}	
	
	public void generarReporteNormalProductoOrdenDetaProdusSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProdu> productoordendetaprodusSeleccionados=new ArrayList<ProductoOrdenDetaProdu>();		
		
		productoordendetaprodusSeleccionados=this.getProductoOrdenDetaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProductoOrdenDetaProdus("Todos",productoordendetaprodusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProductoOrdenDetaProdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProductoOrdenDetaProdu> productoordendetaprodusSeleccionados=new ArrayList<ProductoOrdenDetaProdu>();
		
		productoordendetaprodusSeleccionados=this.getProductoOrdenDetaProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProductoOrdenDetaProdus("Todos",productoordendetaprodusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProductoOrdenDetaProdusSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProdu> productoordendetaprodusSeleccionados=new ArrayList<ProductoOrdenDetaProdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProductoOrdenDetaProdu();
		
		
		productoordendetaprodusSeleccionados=this.getProductoOrdenDetaProdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProductoOrdenDetaProdu();
		
		
		//this.generarReporteProductoOrdenDetaProdus("Todos",productoordendetaprodusSeleccionados ,productoordendetaproduImplementable,productoordendetaproduImplementableHome);
	}
	
	public void mostrarImportacionProductoOrdenDetaProdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProductoOrdenDetaProdu();
		
		this.abrirFrameImportacionProductoOrdenDetaProdu();		
		
			
		//this.generarReporteProductoOrdenDetaProdus("Todos",productoordendetaprodusSeleccionados ,productoordendetaproduImplementable,productoordendetaproduImplementableHome);
	}
	
	public void importarProductoOrdenDetaProdus() throws Exception {		
	
	}
	
	public void exportarProductoOrdenDetaProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProductoOrdenDetaProdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProductoOrdenDetaProdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProductoOrdenDetaProdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Orden Producto Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProductoOrdenDetaProdusSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProdu> productoordendetaprodusSeleccionados=new ArrayList<ProductoOrdenDetaProdu>();		
		
		productoordendetaprodusSeleccionados=this.getProductoOrdenDetaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProductoOrdenDetaProdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProductoOrdenDetaProdu productoordendetaproduAux:productoordendetaprodusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProductoOrdenDetaProdu(productoordendetaproduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//productoordendetaproduAux.setsDetalleGeneralEntityReporte(productoordendetaproduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Producto Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProductoOrdenDetaProdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProductoOrdenDetaProduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=productoordendetaprodu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodu.getordendetaprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodu.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodu.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodu.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodu.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodu.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodu.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodu.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=productoordendetaprodu.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProductoOrdenDetaProdusSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProdu> productoordendetaprodusSeleccionados=new ArrayList<ProductoOrdenDetaProdu>();		
		
		productoordendetaprodusSeleccionados=this.getProductoOrdenDetaProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProductoOrdenDetaProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProductoOrdenDetaProdu(row);				
				iRow++;
			}				
			
			for(ProductoOrdenDetaProdu productoordendetaproduAux:productoordendetaprodusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProductoOrdenDetaProdu(productoordendetaproduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Producto Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProductoOrdenDetaProdusSeleccionados() throws Exception {
		ArrayList<ProductoOrdenDetaProdu> productoordendetaprodusSeleccionados=new ArrayList<ProductoOrdenDetaProdu>();		
		
		productoordendetaprodusSeleccionados=this.getProductoOrdenDetaProdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"productoordendetaprodu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("productoordendetaprodus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("productoordendetaprodu");
			//elementRoot.appendChild(element);
		
			for(ProductoOrdenDetaProdu productoordendetaproduAux:productoordendetaprodusSeleccionados) {
				element = document.createElement("productoordendetaprodu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProductoOrdenDetaProdu(productoordendetaproduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Orden Producto Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProductoOrdenDetaProdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodu.getordendetaprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodu.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodu.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodu.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodu.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodu.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodu.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodu.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(productoordendetaprodu.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlProductoOrdenDetaProdu(ProductoOrdenDetaProdu productoordendetaprodu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProductoOrdenDetaProduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(productoordendetaprodu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProductoOrdenDetaProduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(productoordendetaprodu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementordendetaprodu_descripcion = document.createElement(ProductoOrdenDetaProduConstantesFunciones.IDORDENDETAPRODU);
		elementordendetaprodu_descripcion.appendChild(document.createTextNode(productoordendetaprodu.getordendetaprodu_descripcion()));
		element.appendChild(elementordendetaprodu_descripcion);

		Element elementbodega_descripcion = document.createElement(ProductoOrdenDetaProduConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(productoordendetaprodu.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ProductoOrdenDetaProduConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(productoordendetaprodu.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementunidad_descripcion = document.createElement(ProductoOrdenDetaProduConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(productoordendetaprodu.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementporcentaje = document.createElement(ProductoOrdenDetaProduConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(productoordendetaprodu.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementcantidad = document.createElement(ProductoOrdenDetaProduConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(productoordendetaprodu.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementcosto = document.createElement(ProductoOrdenDetaProduConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(productoordendetaprodu.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementcosto_total = document.createElement(ProductoOrdenDetaProduConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(productoordendetaprodu.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementdescripcion = document.createElement(ProductoOrdenDetaProduConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(productoordendetaprodu.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoProductoOrdenDetaProdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProductoOrdenDetaProdu> productoordendetaprodusSeleccionados=new ArrayList<ProductoOrdenDetaProdu>();
		
		productoordendetaprodusSeleccionados=this.getProductoOrdenDetaProdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProductoOrdenDetaProdu(productoordendetaprodusSeleccionados);
		
		this.generarReporteProductoOrdenDetaProdus("Todos",productoordendetaprodusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProductoOrdenDetaProdu(ArrayList<ProductoOrdenDetaProdu> productoordendetaprodusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProductoOrdenDetaProdu productoordendetaproduAux:productoordendetaprodusSeleccionados) {
				productoordendetaproduAux.setsDetalleGeneralEntityReporte(productoordendetaproduAux.toString());
			
				if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDORDENDETAPRODU)) {
					existe=true;
					productoordendetaproduAux.setsDescripcionGeneralEntityReporte1(productoordendetaproduAux.getordendetaprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					productoordendetaproduAux.setsDescripcionGeneralEntityReporte1(productoordendetaproduAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					productoordendetaproduAux.setsDescripcionGeneralEntityReporte1(productoordendetaproduAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					productoordendetaproduAux.setsDescripcionGeneralEntityReporte1(productoordendetaproduAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					productoordendetaproduAux.setsDescripcionGeneralEntityReporte1(productoordendetaproduAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(ProductoOrdenDetaProduConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					productoordendetaproduAux.setsDescripcionGeneralEntityReporte1(productoordendetaproduAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProductoOrdenDetaProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProductoOrdenDetaProdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu=true;
				this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=true;
				this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu=true;
			}
			
			this.isVisibilidadCeldaModificarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu=true;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu=true;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu=true;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu=true;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=true;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu=true;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaModificarProductoOrdenDetaProdu=true;
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaCancelarProductoOrdenDetaProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarProductoOrdenDetaProdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProductoOrdenDetaProduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=true;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu=true;
		} else {
			this.actualizarEstadoPanelsProductoOrdenDetaProdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProductoOrdenDetaProdu=false;
			//this.isVisibilidadCeldaVerFormProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaDuplicarProductoOrdenDetaProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!productoordendetaproduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=false;
		} else {
			this.isVisibilidadCeldaNuevoProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaGuardarCambiosProductoOrdenDetaProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
			if(!productoordendetaproduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=false;												
			}
			
			this.jButtonCerrarProductoOrdenDetaProdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProductoOrdenDetaProdu=false;
		}
		
		if(!this.permiteMantenimiento(this.productoordendetaprodu)) {
			this.isVisibilidadCeldaActualizarProductoOrdenDetaProdu=false;
			this.isVisibilidadCeldaEliminarProductoOrdenDetaProdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProductoOrdenDetaProdu() {
	}
	
	public void actualizarEstadoPanelsProductoOrdenDetaProdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProdu!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProdu!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProdu!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProdu!=null) {
				this.jPanelPaginacionProductoOrdenDetaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProdu!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProdu!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProdu!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProdu!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProdu!=null) {
				this.jPanelPaginacionProductoOrdenDetaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProdu!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProdu!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProdu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProdu!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProdu!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProdu!=null) {
				this.jPanelPaginacionProductoOrdenDetaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProdu!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProdu!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProdu!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProdu!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProdu!=null) {
				this.jPanelPaginacionProductoOrdenDetaProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProdu!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProdu!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProdu!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProdu!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProdu!=null) {
				this.jPanelPaginacionProductoOrdenDetaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProdu!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProdu!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProdu!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProdu!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProdu!=null) {
				this.jPanelPaginacionProductoOrdenDetaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProdu!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProductoOrdenDetaProdu!=null) {
				this.jScrollPanelDatosEdicionProductoOrdenDetaProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProdu!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProductoOrdenDetaProdu!=null) {
				this.jScrollPanelDatosProductoOrdenDetaProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionProductoOrdenDetaProdu!=null) {
				this.jPanelPaginacionProductoOrdenDetaProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProdu!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProductoOrdenDetaProdu!=null) {
					this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProdu!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProdu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.productoordendetaproduSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProductoOrdenDetaProdu!=null) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProductoOrdenDetaProdu!=null) {
				this.jPanelParametrosReportesProductoOrdenDetaProdu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaOrdenDetaProdu(Boolean isParaOrdenDetaProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaOrdenDetaProduNegation=!isParaOrdenDetaProdu;

			this.isVisibilidadFK_IdBodega=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdBodegaProductoOrdenDetaProdu);}

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaOrdenDetaProdu;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu);}

			this.isVisibilidadFK_IdProducto=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdProductoProductoOrdenDetaProdu);}

			this.isVisibilidadFK_IdUnidadUnad=isParaOrdenDetaProduNegation;
			if(!this.isVisibilidadFK_IdUnidadUnad) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdUnidadUnadProductoOrdenDetaProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdBodegaProductoOrdenDetaProdu);}

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdProductoProductoOrdenDetaProdu);}

			this.isVisibilidadFK_IdUnidadUnad=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdUnidadUnad) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdUnidadUnadProductoOrdenDetaProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdBodegaProductoOrdenDetaProdu);}

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdProductoProductoOrdenDetaProdu);}

			this.isVisibilidadFK_IdUnidadUnad=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdUnidadUnad) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdUnidadUnadProductoOrdenDetaProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdBodega=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdBodegaProductoOrdenDetaProdu);}

			this.isVisibilidadFK_IdOrdenDetaProdu=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdOrdenDetaProdu) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu);}

			this.isVisibilidadFK_IdProducto=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdProductoProductoOrdenDetaProdu);}

			this.isVisibilidadFK_IdUnidadUnad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidadUnad) {this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(jPanelFK_IdUnidadUnadProductoOrdenDetaProdu);}
		}
		
	}
	
	
	
	

	public String registrarSesionProductoOrdenDetaProduParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(productoordendetaproduSessionBean==null) {
				productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(productoordendetaproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.productoordendetaproduFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(ProductoOrdenDetaProduConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionProductoOrdenDetaProdu(true);
			//productoSessionBean.setlidProductoOrdenDetaProduActual(this.idProductoOrdenDetaProduActual);

			productoordendetaproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProductoOrdenDetaProdu(true);
			productoordendetaproduSessionBean.setlIdProductoOrdenDetaProduActualForeignKey(this.idProductoOrdenDetaProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProductoOrdenDetaProduSessionBean productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
		
		if(this.productoordendetaproduSessionBean==null) {
			this.productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
		}
		
		this.productoordendetaproduSessionBean.setsUltimaBusquedaProductoOrdenDetaProdu(this.getsAccionBusqueda());
		this.productoordendetaproduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.productoordendetaproduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			productoordendetaproduSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdOrdenDetaProdu")) {
			productoordendetaproduSessionBean.setid_orden_deta_produ(this.getid_orden_deta_produFK_IdOrdenDetaProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			productoordendetaproduSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidadUnad")) {
			productoordendetaproduSessionBean.setid_unidad(this.getid_unidadFK_IdUnidadUnad());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProductoOrdenDetaProduSessionBean productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
		
		if(this.productoordendetaproduSessionBean==null) {
			this.productoordendetaproduSessionBean=new ProductoOrdenDetaProduSessionBean();
		}
		
		if(this.productoordendetaproduSessionBean.getsUltimaBusquedaProductoOrdenDetaProdu()!=null&&!this.productoordendetaproduSessionBean.getsUltimaBusquedaProductoOrdenDetaProdu().equals("")) {
			this.setsAccionBusqueda(productoordendetaproduSessionBean.getsUltimaBusquedaProductoOrdenDetaProdu());
			this.setiNumeroPaginacion(productoordendetaproduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(productoordendetaproduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(productoordendetaproduSessionBean.getid_bodega());
				productoordendetaproduSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdOrdenDetaProdu")) {
				this.setid_orden_deta_produFK_IdOrdenDetaProdu(productoordendetaproduSessionBean.getid_orden_deta_produ());
				productoordendetaproduSessionBean.setid_orden_deta_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(productoordendetaproduSessionBean.getid_producto());
				productoordendetaproduSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidadUnad")) {
				this.setid_unidadFK_IdUnidadUnad(productoordendetaproduSessionBean.getid_unidad());
				productoordendetaproduSessionBean.setid_unidad(-1L);
			}
		}
		
		this.productoordendetaproduSessionBean.setsUltimaBusquedaProductoOrdenDetaProdu("");
		this.productoordendetaproduSessionBean.setiNumeroPaginacion(ProductoOrdenDetaProduConstantesFunciones.INUMEROPAGINACION);
		this.productoordendetaproduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProductoOrdenDetaProdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProductoOrdenDetaProdu() {
		this.updateBorderResaltarBusquedasFormularioProductoOrdenDetaProdu();
		this.updateVisibilidadBusquedasFormularioProductoOrdenDetaProdu();
		this.updateHabilitarBusquedasFormularioProductoOrdenDetaProdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioProductoOrdenDetaProdu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponents().length>0) {
	

		if(this.productoordendetaproduConstantesFunciones.resaltarFK_IdBodegaProductoOrdenDetaProdu!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdBodegaProductoOrdenDetaProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);
				jPanel.setBorder(this.productoordendetaproduConstantesFunciones.resaltarFK_IdBodegaProductoOrdenDetaProdu);
			}
		}

		if(this.productoordendetaproduConstantesFunciones.resaltarFK_IdOrdenDetaProduProductoOrdenDetaProdu!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);
				jPanel.setBorder(this.productoordendetaproduConstantesFunciones.resaltarFK_IdOrdenDetaProduProductoOrdenDetaProdu);
			}
		}

		if(this.productoordendetaproduConstantesFunciones.resaltarFK_IdProductoProductoOrdenDetaProdu!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdProductoProductoOrdenDetaProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);
				jPanel.setBorder(this.productoordendetaproduConstantesFunciones.resaltarFK_IdProductoProductoOrdenDetaProdu);
			}
		}

		if(this.productoordendetaproduConstantesFunciones.resaltarFK_IdUnidadUnadProductoOrdenDetaProdu!=null) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdUnidadUnadProductoOrdenDetaProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);
				jPanel.setBorder(this.productoordendetaproduConstantesFunciones.resaltarFK_IdUnidadUnadProductoOrdenDetaProdu);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProductoOrdenDetaProdu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdBodegaProductoOrdenDetaProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaproduConstantesFunciones.mostrarFK_IdBodegaProductoOrdenDetaProdu);
			if(!this.productoordendetaproduConstantesFunciones.mostrarFK_IdBodegaProductoOrdenDetaProdu && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaproduConstantesFunciones.mostrarFK_IdOrdenDetaProduProductoOrdenDetaProdu);
			if(!this.productoordendetaproduConstantesFunciones.mostrarFK_IdOrdenDetaProduProductoOrdenDetaProdu && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdProductoProductoOrdenDetaProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaproduConstantesFunciones.mostrarFK_IdProductoProductoOrdenDetaProdu);
			if(!this.productoordendetaproduConstantesFunciones.mostrarFK_IdProductoProductoOrdenDetaProdu && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdUnidadUnadProductoOrdenDetaProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.productoordendetaproduConstantesFunciones.mostrarFK_IdUnidadUnadProductoOrdenDetaProdu);
			if(!this.productoordendetaproduConstantesFunciones.mostrarFK_IdUnidadUnadProductoOrdenDetaProdu && index>-1) {
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProductoOrdenDetaProdu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdBodegaProductoOrdenDetaProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaproduConstantesFunciones.activarFK_IdBodegaProductoOrdenDetaProdu);
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setEnabledAt(index,this.productoordendetaproduConstantesFunciones.activarFK_IdBodegaProductoOrdenDetaProdu);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaproduConstantesFunciones.activarFK_IdOrdenDetaProduProductoOrdenDetaProdu);
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setEnabledAt(index,this.productoordendetaproduConstantesFunciones.activarFK_IdOrdenDetaProduProductoOrdenDetaProdu);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdProductoProductoOrdenDetaProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaproduConstantesFunciones.activarFK_IdProductoProductoOrdenDetaProdu);
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setEnabledAt(index,this.productoordendetaproduConstantesFunciones.activarFK_IdProductoProductoOrdenDetaProdu);
			}

			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdUnidadUnadProductoOrdenDetaProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.productoordendetaproduConstantesFunciones.activarFK_IdUnidadUnadProductoOrdenDetaProdu);
				this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setEnabledAt(index,this.productoordendetaproduConstantesFunciones.activarFK_IdUnidadUnadProductoOrdenDetaProdu);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProductoOrdenDetaProdu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdBodegaProductoOrdenDetaProdu);

			this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);

			this.productoordendetaproduConstantesFunciones.setResaltarFK_IdBodegaProductoOrdenDetaProdu(resaltar);

			jPanel.setBorder(this.productoordendetaproduConstantesFunciones.resaltarFK_IdBodegaProductoOrdenDetaProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdOrdenDetaProdu")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdOrdenDetaProduProductoOrdenDetaProdu);

			this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);

			this.productoordendetaproduConstantesFunciones.setResaltarFK_IdOrdenDetaProduProductoOrdenDetaProdu(resaltar);

			jPanel.setBorder(this.productoordendetaproduConstantesFunciones.resaltarFK_IdOrdenDetaProduProductoOrdenDetaProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdProductoProductoOrdenDetaProdu);

			this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);

			this.productoordendetaproduConstantesFunciones.setResaltarFK_IdProductoProductoOrdenDetaProdu(resaltar);

			jPanel.setBorder(this.productoordendetaproduConstantesFunciones.resaltarFK_IdProductoProductoOrdenDetaProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidadUnad")) {
			index= this.jTabbedPaneBusquedasProductoOrdenDetaProdu.indexOfComponent(this.jPanelFK_IdUnidadUnadProductoOrdenDetaProdu);

			this.jTabbedPaneBusquedasProductoOrdenDetaProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProductoOrdenDetaProdu.getComponent(index);

			this.productoordendetaproduConstantesFunciones.setResaltarFK_IdUnidadUnadProductoOrdenDetaProdu(resaltar);

			jPanel.setBorder(this.productoordendetaproduConstantesFunciones.resaltarFK_IdUnidadUnadProductoOrdenDetaProdu);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProductoOrdenDetaProdu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProductoOrdenDetaProdu() throws Exception {

		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProductoOrdenDetaProdu();
		this.updateVisibilidadResaltarControlesFormularioProductoOrdenDetaProdu();
		this.updateHabilitarResaltarControlesFormularioProductoOrdenDetaProdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioProductoOrdenDetaProdu() throws Exception {
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.productoordendetaproduConstantesFunciones.resaltaridProductoOrdenDetaProdu!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelidProductoOrdenDetaProdu.setBorder(this.productoordendetaproduConstantesFunciones.resaltaridProductoOrdenDetaProdu);}
		if(this.productoordendetaproduConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProdu!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_orden_deta_produProductoOrdenDetaProdu.setBorder(this.productoordendetaproduConstantesFunciones.resaltarid_orden_deta_produProductoOrdenDetaProdu);}
		if(this.productoordendetaproduConstantesFunciones.resaltarid_bodegaProductoOrdenDetaProdu!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.setBorder(this.productoordendetaproduConstantesFunciones.resaltarid_bodegaProductoOrdenDetaProdu);}
		if(this.productoordendetaproduConstantesFunciones.resaltarid_productoProductoOrdenDetaProdu!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.setBorder(this.productoordendetaproduConstantesFunciones.resaltarid_productoProductoOrdenDetaProdu);}
		if(this.productoordendetaproduConstantesFunciones.resaltarid_unidadProductoOrdenDetaProdu!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_unidadProductoOrdenDetaProdu.setBorder(this.productoordendetaproduConstantesFunciones.resaltarid_unidadProductoOrdenDetaProdu);}
		if(this.productoordendetaproduConstantesFunciones.resaltarporcentajeProductoOrdenDetaProdu!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldporcentajeProductoOrdenDetaProdu.setBorder(this.productoordendetaproduConstantesFunciones.resaltarporcentajeProductoOrdenDetaProdu);}
		if(this.productoordendetaproduConstantesFunciones.resaltarcantidadProductoOrdenDetaProdu!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcantidadProductoOrdenDetaProdu.setBorder(this.productoordendetaproduConstantesFunciones.resaltarcantidadProductoOrdenDetaProdu);}
		if(this.productoordendetaproduConstantesFunciones.resaltarcostoProductoOrdenDetaProdu!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcostoProductoOrdenDetaProdu.setBorder(this.productoordendetaproduConstantesFunciones.resaltarcostoProductoOrdenDetaProdu);}
		if(this.productoordendetaproduConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProdu!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcosto_totalProductoOrdenDetaProdu.setBorder(this.productoordendetaproduConstantesFunciones.resaltarcosto_totalProductoOrdenDetaProdu);}
		if(this.productoordendetaproduConstantesFunciones.resaltardescripcionProductoOrdenDetaProdu!=null && this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextAreadescripcionProductoOrdenDetaProdu.setBorder(this.productoordendetaproduConstantesFunciones.resaltardescripcionProductoOrdenDetaProdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProductoOrdenDetaProdu() throws Exception {		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
	
		//this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelidProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostraridProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jPanelidProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostraridProductoOrdenDetaProdu);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_orden_deta_produProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarid_orden_deta_produProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jPanelid_orden_deta_produProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarid_orden_deta_produProductoOrdenDetaProdu);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarid_bodegaProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jPanelid_bodegaProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarid_bodegaProductoOrdenDetaProdu);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarid_productoProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jPanelid_productoProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarid_productoProductoOrdenDetaProdu);
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_productoProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarid_productoProductoOrdenDetaProdu);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_unidadProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarid_unidadProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jPanelid_unidadProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarid_unidadProductoOrdenDetaProdu);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldporcentajeProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarporcentajeProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jPanelporcentajeProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarporcentajeProductoOrdenDetaProdu);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcantidadProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarcantidadProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jPanelcantidadProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarcantidadProductoOrdenDetaProdu);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcostoProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarcostoProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jPanelcostoProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarcostoProductoOrdenDetaProdu);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcosto_totalProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarcosto_totalProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jPanelcosto_totalProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrarcosto_totalProductoOrdenDetaProdu);
		//this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextAreadescripcionProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrardescripcionProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jPaneldescripcionProductoOrdenDetaProdu.setVisible(this.productoordendetaproduConstantesFunciones.mostrardescripcionProductoOrdenDetaProdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProductoOrdenDetaProdu() throws Exception {
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProductoOrdenDetaProdu!=null) {
	
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jLabelidProductoOrdenDetaProdu.setEnabled(this.productoordendetaproduConstantesFunciones.activaridProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_orden_deta_produProductoOrdenDetaProdu.setEnabled(this.productoordendetaproduConstantesFunciones.activarid_orden_deta_produProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_bodegaProductoOrdenDetaProdu.setEnabled(this.productoordendetaproduConstantesFunciones.activarid_bodegaProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_productoProductoOrdenDetaProdu.setEnabled(this.productoordendetaproduConstantesFunciones.activarid_productoProductoOrdenDetaProdu);
			this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jButtonid_productoProductoOrdenDetaProdu.setEnabled(this.productoordendetaproduConstantesFunciones.activarid_productoProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jComboBoxid_unidadProductoOrdenDetaProdu.setEnabled(this.productoordendetaproduConstantesFunciones.activarid_unidadProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldporcentajeProductoOrdenDetaProdu.setEnabled(this.productoordendetaproduConstantesFunciones.activarporcentajeProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcantidadProductoOrdenDetaProdu.setEnabled(this.productoordendetaproduConstantesFunciones.activarcantidadProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcostoProductoOrdenDetaProdu.setEnabled(this.productoordendetaproduConstantesFunciones.activarcostoProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextFieldcosto_totalProductoOrdenDetaProdu.setEnabled(this.productoordendetaproduConstantesFunciones.activarcosto_totalProductoOrdenDetaProdu);
		this.jInternalFrameDetalleFormProductoOrdenDetaProdu.jTextAreadescripcionProductoOrdenDetaProdu.setEnabled(this.productoordendetaproduConstantesFunciones.activardescripcionProductoOrdenDetaProdu);
		}
	}
	
		
}